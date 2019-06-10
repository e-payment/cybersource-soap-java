
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DAVReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DAVReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apartmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="barCodeCheckDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="careOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lvrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="standardizedAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedAddressNoApt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedCSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standardizedISOCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suffixInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCodeInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overallInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intlInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intlErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAVReply", propOrder = {
    "reasonCode",
    "addressType",
    "apartmentInfo",
    "barCode",
    "barCodeCheckDigit",
    "careOf",
    "cityInfo",
    "countryInfo",
    "directionalInfo",
    "lvrInfo",
    "matchScore",
    "standardizedAddress1",
    "standardizedAddress2",
    "standardizedAddress3",
    "standardizedAddress4",
    "standardizedAddressNoApt",
    "standardizedCity",
    "standardizedCounty",
    "standardizedCSP",
    "standardizedState",
    "standardizedPostalCode",
    "standardizedCountry",
    "standardizedISOCountry",
    "stateInfo",
    "streetInfo",
    "suffixInfo",
    "postalCodeInfo",
    "overallInfo",
    "usInfo",
    "caInfo",
    "intlInfo",
    "usErrorInfo",
    "caErrorInfo",
    "intlErrorInfo"
})
public class DAVReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String addressType;
    protected String apartmentInfo;
    protected String barCode;
    protected String barCodeCheckDigit;
    protected String careOf;
    protected String cityInfo;
    protected String countryInfo;
    protected String directionalInfo;
    protected String lvrInfo;
    protected BigInteger matchScore;
    protected String standardizedAddress1;
    protected String standardizedAddress2;
    protected String standardizedAddress3;
    protected String standardizedAddress4;
    protected String standardizedAddressNoApt;
    protected String standardizedCity;
    protected String standardizedCounty;
    protected String standardizedCSP;
    protected String standardizedState;
    protected String standardizedPostalCode;
    protected String standardizedCountry;
    protected String standardizedISOCountry;
    protected String stateInfo;
    protected String streetInfo;
    protected String suffixInfo;
    protected String postalCodeInfo;
    protected String overallInfo;
    protected String usInfo;
    protected String caInfo;
    protected String intlInfo;
    protected String usErrorInfo;
    protected String caErrorInfo;
    protected String intlErrorInfo;

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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the apartmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentInfo() {
        return apartmentInfo;
    }

    /**
     * Sets the value of the apartmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentInfo(String value) {
        this.apartmentInfo = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the barCodeCheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeCheckDigit() {
        return barCodeCheckDigit;
    }

    /**
     * Sets the value of the barCodeCheckDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeCheckDigit(String value) {
        this.barCodeCheckDigit = value;
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Gets the value of the cityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityInfo() {
        return cityInfo;
    }

    /**
     * Sets the value of the cityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityInfo(String value) {
        this.cityInfo = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryInfo(String value) {
        this.countryInfo = value;
    }

    /**
     * Gets the value of the directionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalInfo() {
        return directionalInfo;
    }

    /**
     * Sets the value of the directionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalInfo(String value) {
        this.directionalInfo = value;
    }

    /**
     * Gets the value of the lvrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLvrInfo() {
        return lvrInfo;
    }

    /**
     * Sets the value of the lvrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLvrInfo(String value) {
        this.lvrInfo = value;
    }

    /**
     * Gets the value of the matchScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchScore() {
        return matchScore;
    }

    /**
     * Sets the value of the matchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchScore(BigInteger value) {
        this.matchScore = value;
    }

    /**
     * Gets the value of the standardizedAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress1() {
        return standardizedAddress1;
    }

    /**
     * Sets the value of the standardizedAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress1(String value) {
        this.standardizedAddress1 = value;
    }

    /**
     * Gets the value of the standardizedAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress2() {
        return standardizedAddress2;
    }

    /**
     * Sets the value of the standardizedAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress2(String value) {
        this.standardizedAddress2 = value;
    }

    /**
     * Gets the value of the standardizedAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress3() {
        return standardizedAddress3;
    }

    /**
     * Sets the value of the standardizedAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress3(String value) {
        this.standardizedAddress3 = value;
    }

    /**
     * Gets the value of the standardizedAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress4() {
        return standardizedAddress4;
    }

    /**
     * Sets the value of the standardizedAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress4(String value) {
        this.standardizedAddress4 = value;
    }

    /**
     * Gets the value of the standardizedAddressNoApt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddressNoApt() {
        return standardizedAddressNoApt;
    }

    /**
     * Sets the value of the standardizedAddressNoApt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddressNoApt(String value) {
        this.standardizedAddressNoApt = value;
    }

    /**
     * Gets the value of the standardizedCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCity() {
        return standardizedCity;
    }

    /**
     * Sets the value of the standardizedCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCity(String value) {
        this.standardizedCity = value;
    }

    /**
     * Gets the value of the standardizedCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCounty() {
        return standardizedCounty;
    }

    /**
     * Sets the value of the standardizedCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCounty(String value) {
        this.standardizedCounty = value;
    }

    /**
     * Gets the value of the standardizedCSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCSP() {
        return standardizedCSP;
    }

    /**
     * Sets the value of the standardizedCSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCSP(String value) {
        this.standardizedCSP = value;
    }

    /**
     * Gets the value of the standardizedState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedState() {
        return standardizedState;
    }

    /**
     * Sets the value of the standardizedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedState(String value) {
        this.standardizedState = value;
    }

    /**
     * Gets the value of the standardizedPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedPostalCode() {
        return standardizedPostalCode;
    }

    /**
     * Sets the value of the standardizedPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedPostalCode(String value) {
        this.standardizedPostalCode = value;
    }

    /**
     * Gets the value of the standardizedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCountry() {
        return standardizedCountry;
    }

    /**
     * Sets the value of the standardizedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCountry(String value) {
        this.standardizedCountry = value;
    }

    /**
     * Gets the value of the standardizedISOCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedISOCountry() {
        return standardizedISOCountry;
    }

    /**
     * Sets the value of the standardizedISOCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedISOCountry(String value) {
        this.standardizedISOCountry = value;
    }

    /**
     * Gets the value of the stateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * Sets the value of the stateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateInfo(String value) {
        this.stateInfo = value;
    }

    /**
     * Gets the value of the streetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetInfo() {
        return streetInfo;
    }

    /**
     * Sets the value of the streetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetInfo(String value) {
        this.streetInfo = value;
    }

    /**
     * Gets the value of the suffixInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixInfo() {
        return suffixInfo;
    }

    /**
     * Sets the value of the suffixInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixInfo(String value) {
        this.suffixInfo = value;
    }

    /**
     * Gets the value of the postalCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeInfo() {
        return postalCodeInfo;
    }

    /**
     * Sets the value of the postalCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeInfo(String value) {
        this.postalCodeInfo = value;
    }

    /**
     * Gets the value of the overallInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallInfo() {
        return overallInfo;
    }

    /**
     * Sets the value of the overallInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallInfo(String value) {
        this.overallInfo = value;
    }

    /**
     * Gets the value of the usInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsInfo() {
        return usInfo;
    }

    /**
     * Sets the value of the usInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsInfo(String value) {
        this.usInfo = value;
    }

    /**
     * Gets the value of the caInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaInfo() {
        return caInfo;
    }

    /**
     * Sets the value of the caInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaInfo(String value) {
        this.caInfo = value;
    }

    /**
     * Gets the value of the intlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlInfo() {
        return intlInfo;
    }

    /**
     * Sets the value of the intlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlInfo(String value) {
        this.intlInfo = value;
    }

    /**
     * Gets the value of the usErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsErrorInfo() {
        return usErrorInfo;
    }

    /**
     * Sets the value of the usErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsErrorInfo(String value) {
        this.usErrorInfo = value;
    }

    /**
     * Gets the value of the caErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaErrorInfo() {
        return caErrorInfo;
    }

    /**
     * Sets the value of the caErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaErrorInfo(String value) {
        this.caErrorInfo = value;
    }

    /**
     * Gets the value of the intlErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlErrorInfo() {
        return intlErrorInfo;
    }

    /**
     * Sets the value of the intlErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlErrorInfo(String value) {
        this.intlErrorInfo = value;
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
