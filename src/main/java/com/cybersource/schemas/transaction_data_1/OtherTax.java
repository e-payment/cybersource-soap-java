
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for OtherTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vatTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="vatTaxRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="vatTaxAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="localTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="nationalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="nationalTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTax", propOrder = {
    "vatTaxAmount",
    "vatTaxRate",
    "vatTaxAmountSign",
    "alternateTaxAmount",
    "alternateTaxIndicator",
    "alternateTaxID",
    "localTaxAmount",
    "localTaxIndicator",
    "nationalTaxAmount",
    "nationalTaxIndicator"
})
public class OtherTax {

    protected String vatTaxAmount;
    protected String vatTaxRate;
    protected String vatTaxAmountSign;
    protected String alternateTaxAmount;
    protected String alternateTaxIndicator;
    protected String alternateTaxID;
    protected String localTaxAmount;
    protected BigInteger localTaxIndicator;
    protected String nationalTaxAmount;
    protected BigInteger nationalTaxIndicator;

    /**
     * Gets the value of the vatTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxAmount() {
        return vatTaxAmount;
    }

    /**
     * Sets the value of the vatTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxAmount(String value) {
        this.vatTaxAmount = value;
    }

    /**
     * Gets the value of the vatTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxRate() {
        return vatTaxRate;
    }

    /**
     * Sets the value of the vatTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxRate(String value) {
        this.vatTaxRate = value;
    }

    /**
     * Gets the value of the vatTaxAmountSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxAmountSign() {
        return vatTaxAmountSign;
    }

    /**
     * Sets the value of the vatTaxAmountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxAmountSign(String value) {
        this.vatTaxAmountSign = value;
    }

    /**
     * Gets the value of the alternateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxAmount() {
        return alternateTaxAmount;
    }

    /**
     * Sets the value of the alternateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxAmount(String value) {
        this.alternateTaxAmount = value;
    }

    /**
     * Gets the value of the alternateTaxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxIndicator() {
        return alternateTaxIndicator;
    }

    /**
     * Sets the value of the alternateTaxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxIndicator(String value) {
        this.alternateTaxIndicator = value;
    }

    /**
     * Gets the value of the alternateTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxID() {
        return alternateTaxID;
    }

    /**
     * Sets the value of the alternateTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxID(String value) {
        this.alternateTaxID = value;
    }

    /**
     * Gets the value of the localTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTaxAmount() {
        return localTaxAmount;
    }

    /**
     * Sets the value of the localTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTaxAmount(String value) {
        this.localTaxAmount = value;
    }

    /**
     * Gets the value of the localTaxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalTaxIndicator() {
        return localTaxIndicator;
    }

    /**
     * Sets the value of the localTaxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalTaxIndicator(BigInteger value) {
        this.localTaxIndicator = value;
    }

    /**
     * Gets the value of the nationalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalTaxAmount() {
        return nationalTaxAmount;
    }

    /**
     * Sets the value of the nationalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalTaxAmount(String value) {
        this.nationalTaxAmount = value;
    }

    /**
     * Gets the value of the nationalTaxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNationalTaxIndicator() {
        return nationalTaxIndicator;
    }

    /**
     * Sets the value of the nationalTaxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNationalTaxIndicator(BigInteger value) {
        this.nationalTaxIndicator = value;
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
