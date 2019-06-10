
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for EmvReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmvReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decryptedRequestTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chipValidationResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chipValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvReply", propOrder = {
    "combinedTags",
    "decryptedRequestTags",
    "chipValidationResults",
    "chipValidationType"
})
public class EmvReply {

    protected String combinedTags;
    protected String decryptedRequestTags;
    protected String chipValidationResults;
    protected String chipValidationType;

    /**
     * Gets the value of the combinedTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedTags() {
        return combinedTags;
    }

    /**
     * Sets the value of the combinedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedTags(String value) {
        this.combinedTags = value;
    }

    /**
     * Gets the value of the decryptedRequestTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptedRequestTags() {
        return decryptedRequestTags;
    }

    /**
     * Sets the value of the decryptedRequestTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptedRequestTags(String value) {
        this.decryptedRequestTags = value;
    }

    /**
     * Gets the value of the chipValidationResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationResults() {
        return chipValidationResults;
    }

    /**
     * Sets the value of the chipValidationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationResults(String value) {
        this.chipValidationResults = value;
    }

    /**
     * Gets the value of the chipValidationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationType() {
        return chipValidationType;
    }

    /**
     * Sets the value of the chipValidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationType(String value) {
        this.chipValidationType = value;
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
