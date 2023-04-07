
package com.mip.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeviceMappingInfo complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DeviceMappingInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DeviceA" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeviceB" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMappingInfo", propOrder = {
    "deviceA",
    "deviceB"
})
public class DeviceMappingInfo {

    @XmlElement(name = "DeviceA")
    protected String deviceA;
    @XmlElement(name = "DeviceB")
    protected String deviceB;

    /**
     * Gets the value of the deviceA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceA() {
        return deviceA;
    }

    /**
     * Sets the value of the deviceA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceA(String value) {
        this.deviceA = value;
    }

    /**
     * Gets the value of the deviceB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceB() {
        return deviceB;
    }

    /**
     * Sets the value of the deviceB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceB(String value) {
        this.deviceB = value;
    }

}
