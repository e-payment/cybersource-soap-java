
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BusinessRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ignoreAVSResult" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreCVResult" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreDAVResult" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreExportResult" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreValidateResult" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="declineAVSFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessRules", propOrder = {
    "ignoreAVSResult",
    "ignoreCVResult",
    "ignoreDAVResult",
    "ignoreExportResult",
    "ignoreValidateResult",
    "declineAVSFlags",
    "scoreThreshold"
})
public class BusinessRules {

    protected String ignoreAVSResult;
    protected String ignoreCVResult;
    protected String ignoreDAVResult;
    protected String ignoreExportResult;
    protected String ignoreValidateResult;
    protected String declineAVSFlags;
    protected BigInteger scoreThreshold;

    /**
     * Gets the value of the ignoreAVSResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreAVSResult() {
        return ignoreAVSResult;
    }

    /**
     * Sets the value of the ignoreAVSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreAVSResult(String value) {
        this.ignoreAVSResult = value;
    }

    /**
     * Gets the value of the ignoreCVResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCVResult() {
        return ignoreCVResult;
    }

    /**
     * Sets the value of the ignoreCVResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCVResult(String value) {
        this.ignoreCVResult = value;
    }

    /**
     * Gets the value of the ignoreDAVResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreDAVResult() {
        return ignoreDAVResult;
    }

    /**
     * Sets the value of the ignoreDAVResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreDAVResult(String value) {
        this.ignoreDAVResult = value;
    }

    /**
     * Gets the value of the ignoreExportResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreExportResult() {
        return ignoreExportResult;
    }

    /**
     * Sets the value of the ignoreExportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreExportResult(String value) {
        this.ignoreExportResult = value;
    }

    /**
     * Gets the value of the ignoreValidateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreValidateResult() {
        return ignoreValidateResult;
    }

    /**
     * Sets the value of the ignoreValidateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreValidateResult(String value) {
        this.ignoreValidateResult = value;
    }

    /**
     * Gets the value of the declineAVSFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineAVSFlags() {
        return declineAVSFlags;
    }

    /**
     * Sets the value of the declineAVSFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineAVSFlags(String value) {
        this.declineAVSFlags = value;
    }

    /**
     * Gets the value of the scoreThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * Sets the value of the scoreThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreThreshold(BigInteger value) {
        this.scoreThreshold = value;
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
