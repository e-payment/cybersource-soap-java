
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for TaxService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nexus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noNexus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptancePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middlemanRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfTitleTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxService", propOrder = {
    "nexus",
    "noNexus",
    "orderAcceptanceCity",
    "orderAcceptanceCounty",
    "orderAcceptanceCountry",
    "orderAcceptanceState",
    "orderAcceptancePostalCode",
    "orderOriginCity",
    "orderOriginCounty",
    "orderOriginCountry",
    "orderOriginState",
    "orderOriginPostalCode",
    "sellerRegistration",
    "sellerRegistration0",
    "sellerRegistration1",
    "sellerRegistration2",
    "sellerRegistration3",
    "sellerRegistration4",
    "sellerRegistration5",
    "sellerRegistration6",
    "sellerRegistration7",
    "sellerRegistration8",
    "sellerRegistration9",
    "buyerRegistration",
    "middlemanRegistration",
    "pointOfTitleTransfer"
})
public class TaxService {

    protected String nexus;
    protected String noNexus;
    protected String orderAcceptanceCity;
    protected String orderAcceptanceCounty;
    protected String orderAcceptanceCountry;
    protected String orderAcceptanceState;
    protected String orderAcceptancePostalCode;
    protected String orderOriginCity;
    protected String orderOriginCounty;
    protected String orderOriginCountry;
    protected String orderOriginState;
    protected String orderOriginPostalCode;
    protected String sellerRegistration;
    protected String sellerRegistration0;
    protected String sellerRegistration1;
    protected String sellerRegistration2;
    protected String sellerRegistration3;
    protected String sellerRegistration4;
    protected String sellerRegistration5;
    protected String sellerRegistration6;
    protected String sellerRegistration7;
    protected String sellerRegistration8;
    protected String sellerRegistration9;
    protected String buyerRegistration;
    protected String middlemanRegistration;
    protected String pointOfTitleTransfer;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the nexus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNexus() {
        return nexus;
    }

    /**
     * Sets the value of the nexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNexus(String value) {
        this.nexus = value;
    }

    /**
     * Gets the value of the noNexus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNexus() {
        return noNexus;
    }

    /**
     * Sets the value of the noNexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNexus(String value) {
        this.noNexus = value;
    }

    /**
     * Gets the value of the orderAcceptanceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCity() {
        return orderAcceptanceCity;
    }

    /**
     * Sets the value of the orderAcceptanceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCity(String value) {
        this.orderAcceptanceCity = value;
    }

    /**
     * Gets the value of the orderAcceptanceCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCounty() {
        return orderAcceptanceCounty;
    }

    /**
     * Sets the value of the orderAcceptanceCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCounty(String value) {
        this.orderAcceptanceCounty = value;
    }

    /**
     * Gets the value of the orderAcceptanceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCountry() {
        return orderAcceptanceCountry;
    }

    /**
     * Sets the value of the orderAcceptanceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCountry(String value) {
        this.orderAcceptanceCountry = value;
    }

    /**
     * Gets the value of the orderAcceptanceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceState() {
        return orderAcceptanceState;
    }

    /**
     * Sets the value of the orderAcceptanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceState(String value) {
        this.orderAcceptanceState = value;
    }

    /**
     * Gets the value of the orderAcceptancePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptancePostalCode() {
        return orderAcceptancePostalCode;
    }

    /**
     * Sets the value of the orderAcceptancePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptancePostalCode(String value) {
        this.orderAcceptancePostalCode = value;
    }

    /**
     * Gets the value of the orderOriginCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCity() {
        return orderOriginCity;
    }

    /**
     * Sets the value of the orderOriginCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCity(String value) {
        this.orderOriginCity = value;
    }

    /**
     * Gets the value of the orderOriginCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCounty() {
        return orderOriginCounty;
    }

    /**
     * Sets the value of the orderOriginCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCounty(String value) {
        this.orderOriginCounty = value;
    }

    /**
     * Gets the value of the orderOriginCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCountry() {
        return orderOriginCountry;
    }

    /**
     * Sets the value of the orderOriginCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCountry(String value) {
        this.orderOriginCountry = value;
    }

    /**
     * Gets the value of the orderOriginState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginState() {
        return orderOriginState;
    }

    /**
     * Sets the value of the orderOriginState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginState(String value) {
        this.orderOriginState = value;
    }

    /**
     * Gets the value of the orderOriginPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginPostalCode() {
        return orderOriginPostalCode;
    }

    /**
     * Sets the value of the orderOriginPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginPostalCode(String value) {
        this.orderOriginPostalCode = value;
    }

    /**
     * Gets the value of the sellerRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration() {
        return sellerRegistration;
    }

    /**
     * Sets the value of the sellerRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration(String value) {
        this.sellerRegistration = value;
    }

    /**
     * Gets the value of the sellerRegistration0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration0() {
        return sellerRegistration0;
    }

    /**
     * Sets the value of the sellerRegistration0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration0(String value) {
        this.sellerRegistration0 = value;
    }

    /**
     * Gets the value of the sellerRegistration1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration1() {
        return sellerRegistration1;
    }

    /**
     * Sets the value of the sellerRegistration1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration1(String value) {
        this.sellerRegistration1 = value;
    }

    /**
     * Gets the value of the sellerRegistration2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration2() {
        return sellerRegistration2;
    }

    /**
     * Sets the value of the sellerRegistration2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration2(String value) {
        this.sellerRegistration2 = value;
    }

    /**
     * Gets the value of the sellerRegistration3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration3() {
        return sellerRegistration3;
    }

    /**
     * Sets the value of the sellerRegistration3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration3(String value) {
        this.sellerRegistration3 = value;
    }

    /**
     * Gets the value of the sellerRegistration4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration4() {
        return sellerRegistration4;
    }

    /**
     * Sets the value of the sellerRegistration4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration4(String value) {
        this.sellerRegistration4 = value;
    }

    /**
     * Gets the value of the sellerRegistration5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration5() {
        return sellerRegistration5;
    }

    /**
     * Sets the value of the sellerRegistration5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration5(String value) {
        this.sellerRegistration5 = value;
    }

    /**
     * Gets the value of the sellerRegistration6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration6() {
        return sellerRegistration6;
    }

    /**
     * Sets the value of the sellerRegistration6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration6(String value) {
        this.sellerRegistration6 = value;
    }

    /**
     * Gets the value of the sellerRegistration7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration7() {
        return sellerRegistration7;
    }

    /**
     * Sets the value of the sellerRegistration7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration7(String value) {
        this.sellerRegistration7 = value;
    }

    /**
     * Gets the value of the sellerRegistration8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration8() {
        return sellerRegistration8;
    }

    /**
     * Sets the value of the sellerRegistration8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration8(String value) {
        this.sellerRegistration8 = value;
    }

    /**
     * Gets the value of the sellerRegistration9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration9() {
        return sellerRegistration9;
    }

    /**
     * Sets the value of the sellerRegistration9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration9(String value) {
        this.sellerRegistration9 = value;
    }

    /**
     * Gets the value of the buyerRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerRegistration() {
        return buyerRegistration;
    }

    /**
     * Sets the value of the buyerRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerRegistration(String value) {
        this.buyerRegistration = value;
    }

    /**
     * Gets the value of the middlemanRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlemanRegistration() {
        return middlemanRegistration;
    }

    /**
     * Sets the value of the middlemanRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlemanRegistration(String value) {
        this.middlemanRegistration = value;
    }

    /**
     * Gets the value of the pointOfTitleTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfTitleTransfer() {
        return pointOfTitleTransfer;
    }

    /**
     * Sets the value of the pointOfTitleTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfTitleTransfer(String value) {
        this.pointOfTitleTransfer = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
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
