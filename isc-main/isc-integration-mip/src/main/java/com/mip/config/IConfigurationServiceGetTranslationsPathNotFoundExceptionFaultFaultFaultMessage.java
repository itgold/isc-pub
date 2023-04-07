
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.599-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "PathNotFoundExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.PathNotFoundExceptionFault pathNotFoundExceptionFault;

    public IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage(String message, com.mip.config.PathNotFoundExceptionFault pathNotFoundExceptionFault) {
        super(message);
        this.pathNotFoundExceptionFault = pathNotFoundExceptionFault;
    }

    public IConfigurationServiceGetTranslationsPathNotFoundExceptionFaultFaultFaultMessage(String message, com.mip.config.PathNotFoundExceptionFault pathNotFoundExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.pathNotFoundExceptionFault = pathNotFoundExceptionFault;
    }

    public com.mip.config.PathNotFoundExceptionFault getFaultInfo() {
        return this.pathNotFoundExceptionFault;
    }
}
