
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.525-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "UnauthorizedAccessFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage extends Exception {

    private com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault;

    public IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault) {
        super(message);
        this.unauthorizedAccessFault = unauthorizedAccessFault;
    }

    public IConfigurationServiceGetChildItemsUnauthorizedAccessFaultFaultFaultMessage(String message, com.mip.config.UnauthorizedAccessFault unauthorizedAccessFault, java.lang.Throwable cause) {
        super(message, cause);
        this.unauthorizedAccessFault = unauthorizedAccessFault;
    }

    public com.mip.config.UnauthorizedAccessFault getFaultInfo() {
        return this.unauthorizedAccessFault;
    }
}
