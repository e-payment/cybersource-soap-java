
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DecisionReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="casePriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="activeProfileReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ProfileReply" minOccurs="0"/&gt;
 *         &lt;element name="velocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalFields" type="{urn:schemas-cybersource-com:transaction-data-1.141}AdditionalFields" minOccurs="0"/&gt;
 *         &lt;element name="morphingElement" type="{urn:schemas-cybersource-com:transaction-data-1.141}MorphingElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionReply", propOrder = {
    "casePriority",
    "activeProfileReply",
    "velocityInfoCode",
    "additionalFields",
    "morphingElement"
})
public class DecisionReply {

    protected BigInteger casePriority;
    protected ProfileReply activeProfileReply;
    protected String velocityInfoCode;
    protected AdditionalFields additionalFields;
    protected MorphingElement morphingElement;

    /**
     * Gets the value of the casePriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCasePriority() {
        return casePriority;
    }

    /**
     * Sets the value of the casePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCasePriority(BigInteger value) {
        this.casePriority = value;
    }

    /**
     * Gets the value of the activeProfileReply property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileReply }
     *     
     */
    public ProfileReply getActiveProfileReply() {
        return activeProfileReply;
    }

    /**
     * Sets the value of the activeProfileReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileReply }
     *     
     */
    public void setActiveProfileReply(ProfileReply value) {
        this.activeProfileReply = value;
    }

    /**
     * Gets the value of the velocityInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityInfoCode() {
        return velocityInfoCode;
    }

    /**
     * Sets the value of the velocityInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityInfoCode(String value) {
        this.velocityInfoCode = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
