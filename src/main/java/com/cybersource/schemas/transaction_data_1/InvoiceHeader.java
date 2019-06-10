
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for InvoiceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="merchantDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isGift" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="returnsAccepted" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tenderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantVATRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaserOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaserVATRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vatInvoiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="summaryCommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplierOrderReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxable" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="amexDataTAA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amexDataTAA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amexDataTAA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amexDataTAA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalTaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOrganizationID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="submerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submerchantMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDescriptorCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeader", propOrder = {
    "merchantDescriptor",
    "merchantDescriptorContact",
    "merchantDescriptorAlternate",
    "merchantDescriptorStreet",
    "merchantDescriptorCity",
    "merchantDescriptorState",
    "merchantDescriptorPostalCode",
    "merchantDescriptorCountry",
    "isGift",
    "returnsAccepted",
    "tenderType",
    "merchantVATRegistrationNumber",
    "purchaserOrderDate",
    "purchaserVATRegistrationNumber",
    "vatInvoiceReferenceNumber",
    "summaryCommodityCode",
    "supplierOrderReference",
    "userPO",
    "costCenter",
    "purchaserCode",
    "taxable",
    "amexDataTAA1",
    "amexDataTAA2",
    "amexDataTAA3",
    "amexDataTAA4",
    "invoiceDate",
    "totalTaxTypeCode",
    "cardAcceptorRefNumber",
    "authorizedContactName",
    "businessApplicationID",
    "salesOrganizationID",
    "submerchantID",
    "submerchantName",
    "submerchantStreet",
    "submerchantCity",
    "submerchantPostalCode",
    "submerchantState",
    "submerchantCountry",
    "submerchantEmail",
    "submerchantTelephoneNumber",
    "submerchantRegion",
    "submerchantMerchantID",
    "merchantDescriptorCounty"
})
public class InvoiceHeader {

    protected String merchantDescriptor;
    protected String merchantDescriptorContact;
    protected String merchantDescriptorAlternate;
    protected String merchantDescriptorStreet;
    protected String merchantDescriptorCity;
    protected String merchantDescriptorState;
    protected String merchantDescriptorPostalCode;
    protected String merchantDescriptorCountry;
    protected String isGift;
    protected String returnsAccepted;
    protected String tenderType;
    protected String merchantVATRegistrationNumber;
    protected String purchaserOrderDate;
    protected String purchaserVATRegistrationNumber;
    protected String vatInvoiceReferenceNumber;
    protected String summaryCommodityCode;
    protected String supplierOrderReference;
    protected String userPO;
    protected String costCenter;
    protected String purchaserCode;
    protected String taxable;
    protected String amexDataTAA1;
    protected String amexDataTAA2;
    protected String amexDataTAA3;
    protected String amexDataTAA4;
    protected String invoiceDate;
    protected String totalTaxTypeCode;
    protected String cardAcceptorRefNumber;
    protected String authorizedContactName;
    protected String businessApplicationID;
    protected BigInteger salesOrganizationID;
    protected String submerchantID;
    protected String submerchantName;
    protected String submerchantStreet;
    protected String submerchantCity;
    protected String submerchantPostalCode;
    protected String submerchantState;
    protected String submerchantCountry;
    protected String submerchantEmail;
    protected String submerchantTelephoneNumber;
    protected String submerchantRegion;
    protected String submerchantMerchantID;
    protected String merchantDescriptorCounty;

    /**
     * Gets the value of the merchantDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptor() {
        return merchantDescriptor;
    }

    /**
     * Sets the value of the merchantDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptor(String value) {
        this.merchantDescriptor = value;
    }

    /**
     * Gets the value of the merchantDescriptorContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }

    /**
     * Sets the value of the merchantDescriptorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorContact(String value) {
        this.merchantDescriptorContact = value;
    }

    /**
     * Gets the value of the merchantDescriptorAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorAlternate() {
        return merchantDescriptorAlternate;
    }

    /**
     * Sets the value of the merchantDescriptorAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorAlternate(String value) {
        this.merchantDescriptorAlternate = value;
    }

    /**
     * Gets the value of the merchantDescriptorStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorStreet() {
        return merchantDescriptorStreet;
    }

    /**
     * Sets the value of the merchantDescriptorStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorStreet(String value) {
        this.merchantDescriptorStreet = value;
    }

    /**
     * Gets the value of the merchantDescriptorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCity() {
        return merchantDescriptorCity;
    }

    /**
     * Sets the value of the merchantDescriptorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCity(String value) {
        this.merchantDescriptorCity = value;
    }

    /**
     * Gets the value of the merchantDescriptorState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }

    /**
     * Sets the value of the merchantDescriptorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorState(String value) {
        this.merchantDescriptorState = value;
    }

    /**
     * Gets the value of the merchantDescriptorPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorPostalCode() {
        return merchantDescriptorPostalCode;
    }

    /**
     * Sets the value of the merchantDescriptorPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorPostalCode(String value) {
        this.merchantDescriptorPostalCode = value;
    }

    /**
     * Gets the value of the merchantDescriptorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCountry() {
        return merchantDescriptorCountry;
    }

    /**
     * Sets the value of the merchantDescriptorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCountry(String value) {
        this.merchantDescriptorCountry = value;
    }

    /**
     * Gets the value of the isGift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGift() {
        return isGift;
    }

    /**
     * Sets the value of the isGift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGift(String value) {
        this.isGift = value;
    }

    /**
     * Gets the value of the returnsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * Sets the value of the returnsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAccepted(String value) {
        this.returnsAccepted = value;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

    /**
     * Gets the value of the merchantVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantVATRegistrationNumber() {
        return merchantVATRegistrationNumber;
    }

    /**
     * Sets the value of the merchantVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantVATRegistrationNumber(String value) {
        this.merchantVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the purchaserOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserOrderDate() {
        return purchaserOrderDate;
    }

    /**
     * Sets the value of the purchaserOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserOrderDate(String value) {
        this.purchaserOrderDate = value;
    }

    /**
     * Gets the value of the purchaserVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserVATRegistrationNumber() {
        return purchaserVATRegistrationNumber;
    }

    /**
     * Sets the value of the purchaserVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserVATRegistrationNumber(String value) {
        this.purchaserVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the vatInvoiceReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatInvoiceReferenceNumber() {
        return vatInvoiceReferenceNumber;
    }

    /**
     * Sets the value of the vatInvoiceReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatInvoiceReferenceNumber(String value) {
        this.vatInvoiceReferenceNumber = value;
    }

    /**
     * Gets the value of the summaryCommodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryCommodityCode() {
        return summaryCommodityCode;
    }

    /**
     * Sets the value of the summaryCommodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryCommodityCode(String value) {
        this.summaryCommodityCode = value;
    }

    /**
     * Gets the value of the supplierOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOrderReference() {
        return supplierOrderReference;
    }

    /**
     * Sets the value of the supplierOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOrderReference(String value) {
        this.supplierOrderReference = value;
    }

    /**
     * Gets the value of the userPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPO() {
        return userPO;
    }

    /**
     * Sets the value of the userPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPO(String value) {
        this.userPO = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the purchaserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserCode() {
        return purchaserCode;
    }

    /**
     * Sets the value of the purchaserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserCode(String value) {
        this.purchaserCode = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxable(String value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the amexDataTAA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA1() {
        return amexDataTAA1;
    }

    /**
     * Sets the value of the amexDataTAA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA1(String value) {
        this.amexDataTAA1 = value;
    }

    /**
     * Gets the value of the amexDataTAA2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA2() {
        return amexDataTAA2;
    }

    /**
     * Sets the value of the amexDataTAA2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA2(String value) {
        this.amexDataTAA2 = value;
    }

    /**
     * Gets the value of the amexDataTAA3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA3() {
        return amexDataTAA3;
    }

    /**
     * Sets the value of the amexDataTAA3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA3(String value) {
        this.amexDataTAA3 = value;
    }

    /**
     * Gets the value of the amexDataTAA4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA4() {
        return amexDataTAA4;
    }

    /**
     * Sets the value of the amexDataTAA4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA4(String value) {
        this.amexDataTAA4 = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the totalTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxTypeCode() {
        return totalTaxTypeCode;
    }

    /**
     * Sets the value of the totalTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxTypeCode(String value) {
        this.totalTaxTypeCode = value;
    }

    /**
     * Gets the value of the cardAcceptorRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorRefNumber() {
        return cardAcceptorRefNumber;
    }

    /**
     * Sets the value of the cardAcceptorRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorRefNumber(String value) {
        this.cardAcceptorRefNumber = value;
    }

    /**
     * Gets the value of the authorizedContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedContactName() {
        return authorizedContactName;
    }

    /**
     * Sets the value of the authorizedContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedContactName(String value) {
        this.authorizedContactName = value;
    }

    /**
     * Gets the value of the businessApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessApplicationID() {
        return businessApplicationID;
    }

    /**
     * Sets the value of the businessApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessApplicationID(String value) {
        this.businessApplicationID = value;
    }

    /**
     * Gets the value of the salesOrganizationID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesOrganizationID() {
        return salesOrganizationID;
    }

    /**
     * Sets the value of the salesOrganizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesOrganizationID(BigInteger value) {
        this.salesOrganizationID = value;
    }

    /**
     * Gets the value of the submerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantID() {
        return submerchantID;
    }

    /**
     * Sets the value of the submerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantID(String value) {
        this.submerchantID = value;
    }

    /**
     * Gets the value of the submerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantName() {
        return submerchantName;
    }

    /**
     * Sets the value of the submerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantName(String value) {
        this.submerchantName = value;
    }

    /**
     * Gets the value of the submerchantStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantStreet() {
        return submerchantStreet;
    }

    /**
     * Sets the value of the submerchantStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantStreet(String value) {
        this.submerchantStreet = value;
    }

    /**
     * Gets the value of the submerchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantCity() {
        return submerchantCity;
    }

    /**
     * Sets the value of the submerchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantCity(String value) {
        this.submerchantCity = value;
    }

    /**
     * Gets the value of the submerchantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantPostalCode() {
        return submerchantPostalCode;
    }

    /**
     * Sets the value of the submerchantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantPostalCode(String value) {
        this.submerchantPostalCode = value;
    }

    /**
     * Gets the value of the submerchantState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantState() {
        return submerchantState;
    }

    /**
     * Sets the value of the submerchantState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantState(String value) {
        this.submerchantState = value;
    }

    /**
     * Gets the value of the submerchantCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantCountry() {
        return submerchantCountry;
    }

    /**
     * Sets the value of the submerchantCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantCountry(String value) {
        this.submerchantCountry = value;
    }

    /**
     * Gets the value of the submerchantEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantEmail() {
        return submerchantEmail;
    }

    /**
     * Sets the value of the submerchantEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantEmail(String value) {
        this.submerchantEmail = value;
    }

    /**
     * Gets the value of the submerchantTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantTelephoneNumber() {
        return submerchantTelephoneNumber;
    }

    /**
     * Sets the value of the submerchantTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantTelephoneNumber(String value) {
        this.submerchantTelephoneNumber = value;
    }

    /**
     * Gets the value of the submerchantRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantRegion() {
        return submerchantRegion;
    }

    /**
     * Sets the value of the submerchantRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantRegion(String value) {
        this.submerchantRegion = value;
    }

    /**
     * Gets the value of the submerchantMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantMerchantID() {
        return submerchantMerchantID;
    }

    /**
     * Sets the value of the submerchantMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantMerchantID(String value) {
        this.submerchantMerchantID = value;
    }

    /**
     * Gets the value of the merchantDescriptorCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCounty() {
        return merchantDescriptorCounty;
    }

    /**
     * Sets the value of the merchantDescriptorCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCounty(String value) {
        this.merchantDescriptorCounty = value;
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
