
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.498-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "ServerExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.ServerExceptionFault serverExceptionFault;

    public IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage(String message, com.mip.config.ServerExceptionFault serverExceptionFault) {
        super(message);
        this.serverExceptionFault = serverExceptionFault;
    }

    public IConfigurationServiceGetItemServerExceptionFaultFaultFaultMessage(String message, com.mip.config.ServerExceptionFault serverExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.serverExceptionFault = serverExceptionFault;
    }

    public com.mip.config.ServerExceptionFault getFaultInfo() {
        return this.serverExceptionFault;
    }
}
