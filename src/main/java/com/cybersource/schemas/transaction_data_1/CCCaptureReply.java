
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for CCCaptureReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCaptureReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.141}FundingTotals" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteExpirationDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="purchasingLevel3Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enhancedDataEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconciliationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCaptureReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "amount",
    "reconciliationID",
    "fundingTotals",
    "fxQuoteID",
    "fxQuoteRate",
    "fxQuoteType",
    "fxQuoteExpirationDateTime",
    "purchasingLevel3Enabled",
    "enhancedDataEnabled",
    "reconciliationReferenceNumber"
})
public class CCCaptureReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String amount;
    protected String reconciliationID;
    protected FundingTotals fundingTotals;
    protected String fxQuoteID;
    protected String fxQuoteRate;
    protected String fxQuoteType;
    protected String fxQuoteExpirationDateTime;
    protected String purchasingLevel3Enabled;
    protected String enhancedDataEnabled;
    protected String reconciliationReferenceNumber;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the fundingTotals property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Sets the value of the fundingTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Gets the value of the fxQuoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteID() {
        return fxQuoteID;
    }

    /**
     * Sets the value of the fxQuoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteID(String value) {
        this.fxQuoteID = value;
    }

    /**
     * Gets the value of the fxQuoteRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteRate() {
        return fxQuoteRate;
    }

    /**
     * Sets the value of the fxQuoteRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteRate(String value) {
        this.fxQuoteRate = value;
    }

    /**
     * Gets the value of the fxQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteType() {
        return fxQuoteType;
    }

    /**
     * Sets the value of the fxQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteType(String value) {
        this.fxQuoteType = value;
    }

    /**
     * Gets the value of the fxQuoteExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteExpirationDateTime() {
        return fxQuoteExpirationDateTime;
    }

    /**
     * Sets the value of the fxQuoteExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteExpirationDateTime(String value) {
        this.fxQuoteExpirationDateTime = value;
    }

    /**
     * Gets the value of the purchasingLevel3Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel3Enabled() {
        return purchasingLevel3Enabled;
    }

    /**
     * Sets the value of the purchasingLevel3Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel3Enabled(String value) {
        this.purchasingLevel3Enabled = value;
    }

    /**
     * Gets the value of the enhancedDataEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }

    /**
     * Sets the value of the enhancedDataEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedDataEnabled(String value) {
        this.enhancedDataEnabled = value;
    }

    /**
     * Gets the value of the reconciliationReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }

    /**
     * Sets the value of the reconciliationReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationReferenceNumber(String value) {
        this.reconciliationReferenceNumber = value;
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
