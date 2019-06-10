
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DMEReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMEReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventHotlistInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventVelocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalFields" type="{urn:schemas-cybersource-com:transaction-data-1.141}AdditionalFields" minOccurs="0"/&gt;
 *         &lt;element name="morphingElement" type="{urn:schemas-cybersource-com:transaction-data-1.141}MorphingElement" minOccurs="0"/&gt;
 *         &lt;element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMEReply", propOrder = {
    "eventType",
    "eventInfo",
    "eventHotlistInfo",
    "eventPolicy",
    "eventVelocityInfoCode",
    "additionalFields",
    "morphingElement",
    "cardBin",
    "binCountry",
    "cardAccountType",
    "cardScheme",
    "cardIssuer"
})
public class DMEReply {

    protected String eventType;
    protected String eventInfo;
    protected String eventHotlistInfo;
    protected String eventPolicy;
    protected String eventVelocityInfoCode;
    protected AdditionalFields additionalFields;
    protected MorphingElement morphingElement;
    protected String cardBin;
    protected String binCountry;
    protected String cardAccountType;
    protected String cardScheme;
    protected String cardIssuer;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventInfo(String value) {
        this.eventInfo = value;
    }

    /**
     * Gets the value of the eventHotlistInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventHotlistInfo() {
        return eventHotlistInfo;
    }

    /**
     * Sets the value of the eventHotlistInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventHotlistInfo(String value) {
        this.eventHotlistInfo = value;
    }

    /**
     * Gets the value of the eventPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventPolicy() {
        return eventPolicy;
    }

    /**
     * Sets the value of the eventPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventPolicy(String value) {
        this.eventPolicy = value;
    }

    /**
     * Gets the value of the eventVelocityInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventVelocityInfoCode() {
        return eventVelocityInfoCode;
    }

    /**
     * Sets the value of the eventVelocityInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventVelocityInfoCode(String value) {
        this.eventVelocityInfoCode = value;
    }

    /**
     * Gets the value of the additionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFields }
     *     
     */
    public AdditionalFields getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Sets the value of the additionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFields }
     *     
     */
    public void setAdditionalFields(AdditionalFields value) {
        this.additionalFields = value;
    }

    /**
     * Gets the value of the morphingElement property.
     * 
     * @return
     *     possible object is
     *     {@link MorphingElement }
     *     
     */
    public MorphingElement getMorphingElement() {
        return morphingElement;
    }

    /**
     * Sets the value of the morphingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MorphingElement }
     *     
     */
    public void setMorphingElement(MorphingElement value) {
        this.morphingElement = value;
    }

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Gets the value of the binCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCountry() {
        return binCountry;
    }

    /**
     * Sets the value of the binCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCountry(String value) {
        this.binCountry = value;
    }

    /**
     * Gets the value of the cardAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountType() {
        return cardAccountType;
    }

    /**
     * Sets the value of the cardAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountType(String value) {
        this.cardAccountType = value;
    }

    /**
     * Gets the value of the cardScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Sets the value of the cardScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Gets the value of the cardIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuer() {
        return cardIssuer;
    }

    /**
     * Sets the value of the cardIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuer(String value) {
        this.cardIssuer = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
