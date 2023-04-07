
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.542-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "UnauthorizedAccessFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage extends Exception {

    private com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault;

    public IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault) {
        super(message);
        this.unauthorizedAccessFault = unauthorizedAccessFault;
    }

    public IConfigurationServiceHasChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault, java.lang.Throwable cause) {
        super(message, cause);
        this.unauthorizedAccessFault = unauthorizedAccessFault;
    }

    public com.mip.config.UnauthorizedAccessFault getFaultInfo() {
        return this.unauthorizedAccessFault;
    }
}
