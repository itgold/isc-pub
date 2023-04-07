
package com.mip.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetServerVersionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getServerVersionResult"
})
@XmlRootElement(name = "GetServerVersionResponse")
public class GetServerVersionResponse {

    @XmlElement(name = "GetServerVersionResult", nillable = true)
    protected String getServerVersionResult;

    /**
     * Gets the value of the getServerVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetServerVersionResult() {
        return getServerVersionResult;
    }

    /**
     * Sets the value of the getServerVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetServerVersionResult(String value) {
        this.getServerVersionResult = value;
    }

}
