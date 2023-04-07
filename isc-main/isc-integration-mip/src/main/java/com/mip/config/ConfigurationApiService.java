package com.mip.config;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.725-07:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "ConfigurationApiService",
                  wsdlLocation = "file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/ConfigurationApiService.wsdl",
                  targetNamespace = "http://tempuri.org/")
public class ConfigurationApiService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ConfigurationApiService");
    public final static QName BasicHttpBindingIConfigurationService = new QName("http://tempuri.org/", "BasicHttpBinding_IConfigurationService");
    public final static QName WSHttpBindingIConfigurationService1 = new QName("http://tempuri.org/", "WSHttpBinding_IConfigurationService1");
    public final static QName WSHttpBindingIConfigurationService = new QName("http://tempuri.org/", "WSHttpBinding_IConfigurationService");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/ConfigurationApiService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConfigurationApiService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/ConfigurationApiService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConfigurationApiService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConfigurationApiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConfigurationApiService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ConfigurationApiService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConfigurationApiService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConfigurationApiService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IConfigurationService")
    public IConfigurationService getBasicHttpBindingIConfigurationService() {
        return super.getPort(BasicHttpBindingIConfigurationService, IConfigurationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IConfigurationService")
    public IConfigurationService getBasicHttpBindingIConfigurationService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIConfigurationService, IConfigurationService.class, features);
    }


    /**
     *
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "WSHttpBinding_IConfigurationService1")
    public IConfigurationService getWSHttpBindingIConfigurationService1() {
        return super.getPort(WSHttpBindingIConfigurationService1, IConfigurationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "WSHttpBinding_IConfigurationService1")
    public IConfigurationService getWSHttpBindingIConfigurationService1(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIConfigurationService1, IConfigurationService.class, features);
    }


    /**
     *
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "WSHttpBinding_IConfigurationService")
    public IConfigurationService getWSHttpBindingIConfigurationService() {
        return super.getPort(WSHttpBindingIConfigurationService, IConfigurationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConfigurationService
     */
    @WebEndpoint(name = "WSHttpBinding_IConfigurationService")
    public IConfigurationService getWSHttpBindingIConfigurationService(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIConfigurationService, IConfigurationService.class, features);
    }

}
