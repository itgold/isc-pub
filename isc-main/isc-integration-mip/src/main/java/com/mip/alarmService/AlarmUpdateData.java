
package com.mip.alarmService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AlarmUpdateData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AlarmUpdateData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Deleted" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Inserted" type="{http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm}ArrayOfAlarmLine" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Updated" type="{http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm}ArrayOfAlarmLine" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmUpdateData", namespace = "http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm", propOrder = {
    "deleted",
    "inserted",
    "updated"
})
public class AlarmUpdateData {

    @XmlElement(name = "Deleted", nillable = true)
    protected ArrayOfguid deleted;
    @XmlElement(name = "Inserted", nillable = true)
    protected ArrayOfAlarmLine inserted;
    @XmlElement(name = "Updated", nillable = true)
    protected ArrayOfAlarmLine updated;

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setDeleted(ArrayOfguid value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the inserted property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlarmLine }
     *     
     */
    public ArrayOfAlarmLine getInserted() {
        return inserted;
    }

    /**
     * Sets the value of the inserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlarmLine }
     *     
     */
    public void setInserted(ArrayOfAlarmLine value) {
        this.inserted = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlarmLine }
     *     
     */
    public ArrayOfAlarmLine getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlarmLine }
     *     
     */
    public void setUpdated(ArrayOfAlarmLine value) {
        this.updated = value;
    }

}
