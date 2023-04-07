
package com.mip.alarmService;

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
 *         &amp;lt;element name="GetEventLines2Result" type="{http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm}GetEventLines2Resp" minOccurs="0"/&amp;gt;
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
    "getEventLines2Result"
})
@XmlRootElement(name = "GetEventLines2Response")
public class GetEventLines2Response {

    @XmlElement(name = "GetEventLines2Result", nillable = true)
    protected GetEventLines2Resp getEventLines2Result;

    /**
     * Gets the value of the getEventLines2Result property.
     * 
     * @return
     *     possible object is
     *     {@link GetEventLines2Resp }
     *     
     */
    public GetEventLines2Resp getGetEventLines2Result() {
        return getEventLines2Result;
    }

    /**
     * Sets the value of the getEventLines2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEventLines2Resp }
     *     
     */
    public void setGetEventLines2Result(GetEventLines2Resp value) {
        this.getEventLines2Result = value;
    }

}
