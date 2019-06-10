
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for TaxReplyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxReplyItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxableAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="exemptAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="specialTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="cityTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countyTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="districtTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="stateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countryTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="totalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount"/&gt;
 *         &lt;element name="jurisdiction" type="{urn:schemas-cybersource-com:transaction-data-1.141}TaxReplyItemJurisdiction" maxOccurs="1000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReplyItem", propOrder = {
    "taxableAmount",
    "exemptAmount",
    "specialTaxAmount",
    "cityTaxAmount",
    "countyTaxAmount",
    "districtTaxAmount",
    "stateTaxAmount",
    "countryTaxAmount",
    "totalTaxAmount",
    "jurisdiction"
})
public class TaxReplyItem {

    protected String taxableAmount;
    protected String exemptAmount;
    protected String specialTaxAmount;
    protected String cityTaxAmount;
    protected String countyTaxAmount;
    protected String districtTaxAmount;
    protected String stateTaxAmount;
    protected String countryTaxAmount;
    @XmlElement(required = true)
    protected String totalTaxAmount;
    protected List<TaxReplyItemJurisdiction> jurisdiction;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableAmount(String value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the exemptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptAmount() {
        return exemptAmount;
    }

    /**
     * Sets the value of the exemptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptAmount(String value) {
        this.exemptAmount = value;
    }

    /**
     * Gets the value of the specialTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxAmount() {
        return specialTaxAmount;
    }

    /**
     * Sets the value of the specialTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxAmount(String value) {
        this.specialTaxAmount = value;
    }

    /**
     * Gets the value of the cityTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTaxAmount() {
        return cityTaxAmount;
    }

    /**
     * Sets the value of the cityTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTaxAmount(String value) {
        this.cityTaxAmount = value;
    }

    /**
     * Gets the value of the countyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyTaxAmount() {
        return countyTaxAmount;
    }

    /**
     * Sets the value of the countyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyTaxAmount(String value) {
        this.countyTaxAmount = value;
    }

    /**
     * Gets the value of the districtTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictTaxAmount() {
        return districtTaxAmount;
    }

    /**
     * Sets the value of the districtTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictTaxAmount(String value) {
        this.districtTaxAmount = value;
    }

    /**
     * Gets the value of the stateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTaxAmount() {
        return stateTaxAmount;
    }

    /**
     * Sets the value of the stateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTaxAmount(String value) {
        this.stateTaxAmount = value;
    }

    /**
     * Gets the value of the countryTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTaxAmount() {
        return countryTaxAmount;
    }

    /**
     * Sets the value of the countryTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTaxAmount(String value) {
        this.countryTaxAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxAmount(String value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReplyItemJurisdiction }
     * 
     * 
     */
    public List<TaxReplyItemJurisdiction> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<TaxReplyItemJurisdiction>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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
