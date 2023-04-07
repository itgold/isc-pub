
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
 *         &amp;lt;element name="GetAlarmHistoryResult" type="{http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm}ArrayOfAlarmHistory" minOccurs="0"/&amp;gt;
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
    "getAlarmHistoryResult"
})
@XmlRootElement(name = "GetAlarmHistoryResponse")
public class GetAlarmHistoryResponse {

    @XmlElement(name = "GetAlarmHistoryResult", nillable = true)
    protected ArrayOfAlarmHistory getAlarmHistoryResult;

    /**
     * Gets the value of the getAlarmHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlarmHistory }
     *     
     */
    public ArrayOfAlarmHistory getGetAlarmHistoryResult() {
        return getAlarmHistoryResult;
    }

    /**
     * Sets the value of the getAlarmHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlarmHistory }
     *     
     */
    public void setGetAlarmHistoryResult(ArrayOfAlarmHistory value) {
        this.getAlarmHistoryResult = value;
    }

}
