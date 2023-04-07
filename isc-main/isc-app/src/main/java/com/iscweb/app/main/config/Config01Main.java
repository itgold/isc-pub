package com.iscweb.app.main.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.iscweb.app.main.util.BasePageSerializationMixin;
import com.iscweb.app.main.util.YamlPropertyLoaderFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Slf4j
@Order(1)
@EnableAsync
@Configuration
@EnableCaching
@EnableScheduling
@EnableConfigurationProperties
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.iscweb.service"})
@PropertySource(value = "classpath:git.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:management.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:application.default.yml", factory = YamlPropertyLoaderFactory.class, ignoreResourceNotFound = true)
public class Config01Main implements AsyncConfigurer, WebMvcConfigurer {

    /**
     * @return Default object mapper used by different services
     */
    @Bean(name = "defaultObjectMapper")
    @Primary
    public ObjectMapper primaryObjectMapper() {
        log.debug("ObjectMapper configuration");
        ObjectMapper objectMapper = new Jackson2ObjectMapperBuilder()
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .serializers()
                .featuresToEnable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .featuresToEnable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)
                .featuresToDisable(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS)
                .featuresToDisable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)
                // to avoid problem with marshaling proxied beans which do not have it's own properties
                .featuresToDisable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                .annotationIntrospector(new JacksonAnnotationIntrospector())
                // Set internal datetime representation to System Default to work with instants
                // at all times. When saving objects, the timezone will be updated accordingly
                .timeZone(TimeZone.getDefault())
                .mixIn(Page.class, BasePageSerializationMixin.class)
                .build();

        // For backwards data compatibility, in case keys fail to serialize
        objectMapper.getSerializerProvider().setNullKeySerializer(nullKeySerializer());
        return objectMapper;
    }

    @Bean
    public ServletListenerRegistrationBean<HttpSessionEventPublisher> sessionEventPublisher() {
        log.debug("ServletListenerRegistrationBean configuration");
        return new ServletListenerRegistrationBean<>(new HttpSessionEventPublisher());
    }

    @Bean
    public DispatcherServlet dispatcher() {
        log.debug("DispatcherServlet configuration");
        return new DispatcherServlet();
    }

    @Bean
    public RequestCache requestCache() {
        log.debug("RequestCache configuration");
        return new HttpSessionRequestCache();
    }

    @Override
    public Executor getAsyncExecutor() {
        // The async executors are described below, this method returns null to
        // use the ones defined
        return null;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return (ex, method, params) -> log.warn("Error executing asynchronous task {} ", method.toString(), ex);
    }

    /**
     * Main Task Executor that gets called whenever an "Async" method
     * gets invoked or a {@link ThreadPoolTaskExecutor} bean is
     * requested.
     *
     * @return {@link ThreadPoolTaskExecutor} with a default configuration
     */
    @Bean(name = "mainAsyncTaskExecutor")
    public ThreadPoolTaskExecutor asyncTaskExecutor() {
        log.debug("MainAsyncTaskExecutor configuration");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setAllowCoreThreadTimeOut(true);
        executor.setMaxPoolSize(100);
        executor.setCorePoolSize(25);
        executor.setThreadNamePrefix("ISC_TASKS");
        return executor;
    }

    // ThreadPoolTaskScheduler

    private JsonSerializer<Object> nullKeySerializer() {
        return new JsonSerializer<>() {
            @Override
            public void serialize(Object value,
                                  JsonGenerator jsonGenerator,
                                  SerializerProvider serializers) throws IOException {

                if (value == null) {
                    jsonGenerator.writeFieldName("");
                } else {
                    jsonGenerator.writeFieldName(value.toString());
                }
            }
        };
    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        // configurer.setDefaultTimeout(-1);
        ConcurrentTaskExecutor taskExecutor = new ConcurrentTaskExecutor(Executors.newFixedThreadPool(5));
        configurer.setTaskExecutor(taskExecutor);
    }
}
