
package com.mip.config;

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
 *         &amp;lt;element name="ValidateItemResult" type="{http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI}ValidateResult" minOccurs="0"/&amp;gt;
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
    "validateItemResult"
})
@XmlRootElement(name = "ValidateItemResponse")
public class ValidateItemResponse {

    @XmlElement(name = "ValidateItemResult", nillable = true)
    protected ValidateResult validateItemResult;

    /**
     * Gets the value of the validateItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateResult }
     *     
     */
    public ValidateResult getValidateItemResult() {
        return validateItemResult;
    }

    /**
     * Sets the value of the validateItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateResult }
     *     
     */
    public void setValidateItemResult(ValidateResult value) {
        this.validateItemResult = value;
    }

}
