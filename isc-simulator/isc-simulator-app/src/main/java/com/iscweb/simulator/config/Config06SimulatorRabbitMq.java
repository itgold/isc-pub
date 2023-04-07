package com.iscweb.simulator.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iscweb.common.service.IEventHub;
import com.iscweb.simulator.service.EventHubSimulator;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static com.iscweb.service.event.EventHub.DLX_QUALIFIER;
import static com.iscweb.service.event.EventHub.EVENT_HUB_QUEUE_QUALIFIER;

/**
 * RabbitMq spring integrations configuration.
 */
@Slf4j
@Getter
@Order(6)
@EnableRabbit
@Configuration
public class Config06SimulatorRabbitMq implements WebMvcConfigurer {

    /**
     * Dead letter queue extension.
     */
    public static final String DEAD = ".dead";

    @Value("${spring.rabbitmq.host:localhost}")
    private String hosts;

    @Value("${spring.rabbitmq.port}")
    private Integer port;

    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualHost;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.routing.exchange}")
    private String exchangeName;

    @Value("${spring.rabbitmq.routing.queue}")
    private String queueName;

    @Value("${spring.rabbitmq.dead-letter.exchange:loop-dlx}")
    private String deadLetterExchangeName;

    /**
     * Application's declaration of simulator EventHub
     * This implementation does not have subscribe portion of queue processing, it is outgoing only.
     * @return spring managed instance of EventHubSimulator.
     */
    @Bean
    public IEventHub getEventHub(
            ConnectionFactory connectionFactor,
            @Value("${spring.rabbitmq.routing.exchange}") String eventsExchange,
            @Value("${spring.rabbitmq.routing.queue}") String eventsQueue,
            RabbitTemplate rabbitTemplate) {
        return new EventHubSimulator(connectionFactor, eventsExchange, eventsQueue, rabbitTemplate);
    }

    /**
     * Application's primary queue declaration.
     * @return spring managed instance of new Queue object.
     */
    @Bean
    @Qualifier(EVENT_HUB_QUEUE_QUALIFIER)
    public Queue mainQueue() {
        return QueueBuilder.durable(getQueueName())
                .withArgument("x-dead-letter-exchange", getDeadLetterExchangeName())
                .build();
    }

    /**
     * Application's primary primary rabbitMq exchange.
     * @return an instance to exchange.
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(getExchangeName(), true, false);
    }

    /**
     * RabbitMq binding from the primary exchange to application's queue.
     * Used to associate messages going to primary exchange to be forwarded to the corresponding queue.
     * @param queue primary application's queue.
     * @param exchange primary application's exchange.
     * @return binding configuration instance.
     */
    @Bean
    public Binding bindingMain(@Qualifier(EVENT_HUB_QUEUE_QUALIFIER) Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(getQueueName());
    }

    /**
     * Application's primary dead letter rabbitMq exchange.
     * @return an instance to exchange.
     */
    @Bean
    @Qualifier(DLX_QUALIFIER)
    public TopicExchange deadLetterExchange() {
        return new TopicExchange(getDeadLetterExchangeName(), true, false);
    }

    /**
     * Initializes rabbitmq connection factory.
     * @return connection factory instance.
     */
    @Bean
    public ConnectionFactory rabbitConnectionFactory() {
        log.info("connectionFactory.spring.rabbitmq.configuration.ConnectionFactory.setup");
        CachingConnectionFactory result;
        try {
            String connectionString = buildRabbitMqUri();
            com.rabbitmq.client.ConnectionFactory factory = new com.rabbitmq.client.ConnectionFactory();
            factory.setAutomaticRecoveryEnabled(true);
            factory.setUri(connectionString);

            result = new CachingConnectionFactory(factory);

            log.info("connectionFactory.spring.rabbitmq.configuration: ");
            log.info("connectionFactory.spring.rabbitmq.hosts: {}", result.getHost());
            log.info("connectionFactory.spring.rabbitmq.port: {}", result.getPort());
            log.info("connectionFactory.spring.rabbitmq.username: {}", result.getUsername());
            log.info("connectionFactory.spring.rabbitmq.virtual-host: {}", result.getVirtualHost());
        } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException e) {
            log.error("connectionFactory.spring.rabbitmq.Unable to initialize RabbitMq connection factory", e);
            throw new IllegalStateException("Unable to initialize RabbitMq connection factory", e);
        }

        return result;
    }

    /**
     * Initializes RabbitTemplate helper class that simplifies rabbitMq synchronous access.
     * @param connectionFactory rabbitmq connection factory instance.
     * @return a new instance of rabbitmq template class.
     */
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, ObjectMapper objectMapper) {
        final RabbitTemplate result;

        log.info("rabbitTemplate.spring.rabbitmq.configuration.RabbitTemplate.setup");

        log.info("rabbitTemplate.spring.rabbitmq.connectionFactory: {}", connectionFactory);
        log.info("rabbitTemplate.spring.rabbitmq.virtualHost: {}", connectionFactory.getVirtualHost());
        log.info("rabbitTemplate.spring.rabbitmq.host: {}", connectionFactory.getHost());
        log.info("rabbitTemplate.spring.rabbitmq.username: {}", connectionFactory.getUsername());

        log.info("properties.spring.rabbitmq.hosts: {}", getHosts());
        log.info("properties.spring.rabbitmq.port: {}", getPort());
        log.info("properties.spring.rabbitmq.username: {}", getUsername());
        log.info("properties.spring.rabbitmq.virtual-host: {}", getVirtualHost());

        result = new RabbitTemplate(connectionFactory);
        result.setMessageConverter(producerJackson2MessageConverter(objectMapper));
        return result;
    }

    /**
     * Messages Jackson converter.
     * @return new spring managed jackson converter bean.
     */
    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter(ObjectMapper objectMapper) {
        return new Jackson2JsonMessageConverter(objectMapper);
    }

    /**
     * Builds mongo db connection URI string.
     *
     * @return mongo connection URI.
     */
    private String buildRabbitMqUri() {
        // spring.data.rabbitmq.uri=amqp://userName:password@hostName:portNumber/virtualHost
        StringBuilder result = new StringBuilder("amqp://");

        if (getUsername() != null && !getUsername().isEmpty()) {
            try {
                result.append(URLEncoder.encode(getUsername(), StandardCharsets.UTF_8.toString()))
                      .append(":")
                      .append(URLEncoder.encode(getPassword(), StandardCharsets.UTF_8.toString()))
                      .append("@");
            } catch (UnsupportedEncodingException e) {
                log.error("Unable to encode username/password", e);
            }
        }

        result.append(getHosts()).append(":").append(getPort());
        result.append(getVirtualHost());

        log.info("spring.rabbitmq.configuration.buildRabbitMqUri().{}", result);
        return result.toString();
    }
}


