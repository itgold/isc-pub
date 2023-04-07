
package com.mip.alarmService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SearchOrders complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SearchOrders"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Orders" type="{http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm}ArrayOfSearchOrder" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrders", namespace = "http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm", propOrder = {
    "orders"
})
public class SearchOrders {

    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfSearchOrder orders;

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchOrder }
     *     
     */
    public ArrayOfSearchOrder getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchOrder }
     *     
     */
    public void setOrders(ArrayOfSearchOrder value) {
        this.orders = value;
    }

}
