
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.658-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "ArgumentExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.ArgumentExceptionFault argumentExceptionFault;

    public IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage(String message, com.mip.config.ArgumentExceptionFault argumentExceptionFault) {
        super(message);
        this.argumentExceptionFault = argumentExceptionFault;
    }

    public IConfigurationServiceInvokeMethodArgumentExceptionFaultFaultFaultMessage(String message, com.mip.config.ArgumentExceptionFault argumentExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.argumentExceptionFault = argumentExceptionFault;
    }

    public com.mip.config.ArgumentExceptionFault getFaultInfo() {
        return this.argumentExceptionFault;
    }
}
