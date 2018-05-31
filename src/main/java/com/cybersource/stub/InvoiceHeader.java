/**
 * InvoiceHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class InvoiceHeader  implements java.io.Serializable {
    private java.lang.String merchantDescriptor;

    private java.lang.String merchantDescriptorContact;

    private java.lang.String merchantDescriptorAlternate;

    private java.lang.String merchantDescriptorStreet;

    private java.lang.String merchantDescriptorCity;

    private java.lang.String merchantDescriptorState;

    private java.lang.String merchantDescriptorPostalCode;

    private java.lang.String merchantDescriptorCountry;

    private java.lang.String isGift;

    private java.lang.String returnsAccepted;

    private java.lang.String tenderType;

    private java.lang.String merchantVATRegistrationNumber;

    private java.lang.String purchaserOrderDate;

    private java.lang.String purchaserVATRegistrationNumber;

    private java.lang.String vatInvoiceReferenceNumber;

    private java.lang.String summaryCommodityCode;

    private java.lang.String supplierOrderReference;

    private java.lang.String userPO;

    private java.lang.String costCenter;

    private java.lang.String purchaserCode;

    private java.lang.String taxable;

    private java.lang.String amexDataTAA1;

    private java.lang.String amexDataTAA2;

    private java.lang.String amexDataTAA3;

    private java.lang.String amexDataTAA4;

    private java.lang.String invoiceDate;

    private java.lang.String totalTaxTypeCode;

    private java.lang.String cardAcceptorRefNumber;

    private java.lang.String authorizedContactName;

    private java.lang.String businessApplicationID;

    private java.math.BigInteger salesOrganizationID;

    private java.lang.String submerchantID;

    private java.lang.String submerchantName;

    private java.lang.String submerchantStreet;

    private java.lang.String submerchantCity;

    private java.lang.String submerchantPostalCode;

    private java.lang.String submerchantState;

    private java.lang.String submerchantCountry;

    private java.lang.String submerchantEmail;

    private java.lang.String submerchantTelephoneNumber;

    private java.lang.String submerchantRegion;

    private java.lang.String submerchantMerchantID;

    private java.lang.String merchantDescriptorCounty;

    public InvoiceHeader() {
    }

    public InvoiceHeader(
           java.lang.String merchantDescriptor,
           java.lang.String merchantDescriptorContact,
           java.lang.String merchantDescriptorAlternate,
           java.lang.String merchantDescriptorStreet,
           java.lang.String merchantDescriptorCity,
           java.lang.String merchantDescriptorState,
           java.lang.String merchantDescriptorPostalCode,
           java.lang.String merchantDescriptorCountry,
           java.lang.String isGift,
           java.lang.String returnsAccepted,
           java.lang.String tenderType,
           java.lang.String merchantVATRegistrationNumber,
           java.lang.String purchaserOrderDate,
           java.lang.String purchaserVATRegistrationNumber,
           java.lang.String vatInvoiceReferenceNumber,
           java.lang.String summaryCommodityCode,
           java.lang.String supplierOrderReference,
           java.lang.String userPO,
           java.lang.String costCenter,
           java.lang.String purchaserCode,
           java.lang.String taxable,
           java.lang.String amexDataTAA1,
           java.lang.String amexDataTAA2,
           java.lang.String amexDataTAA3,
           java.lang.String amexDataTAA4,
           java.lang.String invoiceDate,
           java.lang.String totalTaxTypeCode,
           java.lang.String cardAcceptorRefNumber,
           java.lang.String authorizedContactName,
           java.lang.String businessApplicationID,
           java.math.BigInteger salesOrganizationID,
           java.lang.String submerchantID,
           java.lang.String submerchantName,
           java.lang.String submerchantStreet,
           java.lang.String submerchantCity,
           java.lang.String submerchantPostalCode,
           java.lang.String submerchantState,
           java.lang.String submerchantCountry,
           java.lang.String submerchantEmail,
           java.lang.String submerchantTelephoneNumber,
           java.lang.String submerchantRegion,
           java.lang.String submerchantMerchantID,
           java.lang.String merchantDescriptorCounty) {
           this.merchantDescriptor = merchantDescriptor;
           this.merchantDescriptorContact = merchantDescriptorContact;
           this.merchantDescriptorAlternate = merchantDescriptorAlternate;
           this.merchantDescriptorStreet = merchantDescriptorStreet;
           this.merchantDescriptorCity = merchantDescriptorCity;
           this.merchantDescriptorState = merchantDescriptorState;
           this.merchantDescriptorPostalCode = merchantDescriptorPostalCode;
           this.merchantDescriptorCountry = merchantDescriptorCountry;
           this.isGift = isGift;
           this.returnsAccepted = returnsAccepted;
           this.tenderType = tenderType;
           this.merchantVATRegistrationNumber = merchantVATRegistrationNumber;
           this.purchaserOrderDate = purchaserOrderDate;
           this.purchaserVATRegistrationNumber = purchaserVATRegistrationNumber;
           this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
           this.summaryCommodityCode = summaryCommodityCode;
           this.supplierOrderReference = supplierOrderReference;
           this.userPO = userPO;
           this.costCenter = costCenter;
           this.purchaserCode = purchaserCode;
           this.taxable = taxable;
           this.amexDataTAA1 = amexDataTAA1;
           this.amexDataTAA2 = amexDataTAA2;
           this.amexDataTAA3 = amexDataTAA3;
           this.amexDataTAA4 = amexDataTAA4;
           this.invoiceDate = invoiceDate;
           this.totalTaxTypeCode = totalTaxTypeCode;
           this.cardAcceptorRefNumber = cardAcceptorRefNumber;
           this.authorizedContactName = authorizedContactName;
           this.businessApplicationID = businessApplicationID;
           this.salesOrganizationID = salesOrganizationID;
           this.submerchantID = submerchantID;
           this.submerchantName = submerchantName;
           this.submerchantStreet = submerchantStreet;
           this.submerchantCity = submerchantCity;
           this.submerchantPostalCode = submerchantPostalCode;
           this.submerchantState = submerchantState;
           this.submerchantCountry = submerchantCountry;
           this.submerchantEmail = submerchantEmail;
           this.submerchantTelephoneNumber = submerchantTelephoneNumber;
           this.submerchantRegion = submerchantRegion;
           this.submerchantMerchantID = submerchantMerchantID;
           this.merchantDescriptorCounty = merchantDescriptorCounty;
    }


    /**
     * Gets the merchantDescriptor value for this InvoiceHeader.
     * 
     * @return merchantDescriptor
     */
    public java.lang.String getMerchantDescriptor() {
        return merchantDescriptor;
    }


    /**
     * Sets the merchantDescriptor value for this InvoiceHeader.
     * 
     * @param merchantDescriptor
     */
    public void setMerchantDescriptor(java.lang.String merchantDescriptor) {
        this.merchantDescriptor = merchantDescriptor;
    }


    /**
     * Gets the merchantDescriptorContact value for this InvoiceHeader.
     * 
     * @return merchantDescriptorContact
     */
    public java.lang.String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }


    /**
     * Sets the merchantDescriptorContact value for this InvoiceHeader.
     * 
     * @param merchantDescriptorContact
     */
    public void setMerchantDescriptorContact(java.lang.String merchantDescriptorContact) {
        this.merchantDescriptorContact = merchantDescriptorContact;
    }


    /**
     * Gets the merchantDescriptorAlternate value for this InvoiceHeader.
     * 
     * @return merchantDescriptorAlternate
     */
    public java.lang.String getMerchantDescriptorAlternate() {
        return merchantDescriptorAlternate;
    }


    /**
     * Sets the merchantDescriptorAlternate value for this InvoiceHeader.
     * 
     * @param merchantDescriptorAlternate
     */
    public void setMerchantDescriptorAlternate(java.lang.String merchantDescriptorAlternate) {
        this.merchantDescriptorAlternate = merchantDescriptorAlternate;
    }


    /**
     * Gets the merchantDescriptorStreet value for this InvoiceHeader.
     * 
     * @return merchantDescriptorStreet
     */
    public java.lang.String getMerchantDescriptorStreet() {
        return merchantDescriptorStreet;
    }


    /**
     * Sets the merchantDescriptorStreet value for this InvoiceHeader.
     * 
     * @param merchantDescriptorStreet
     */
    public void setMerchantDescriptorStreet(java.lang.String merchantDescriptorStreet) {
        this.merchantDescriptorStreet = merchantDescriptorStreet;
    }


    /**
     * Gets the merchantDescriptorCity value for this InvoiceHeader.
     * 
     * @return merchantDescriptorCity
     */
    public java.lang.String getMerchantDescriptorCity() {
        return merchantDescriptorCity;
    }


    /**
     * Sets the merchantDescriptorCity value for this InvoiceHeader.
     * 
     * @param merchantDescriptorCity
     */
    public void setMerchantDescriptorCity(java.lang.String merchantDescriptorCity) {
        this.merchantDescriptorCity = merchantDescriptorCity;
    }


    /**
     * Gets the merchantDescriptorState value for this InvoiceHeader.
     * 
     * @return merchantDescriptorState
     */
    public java.lang.String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }


    /**
     * Sets the merchantDescriptorState value for this InvoiceHeader.
     * 
     * @param merchantDescriptorState
     */
    public void setMerchantDescriptorState(java.lang.String merchantDescriptorState) {
        this.merchantDescriptorState = merchantDescriptorState;
    }


    /**
     * Gets the merchantDescriptorPostalCode value for this InvoiceHeader.
     * 
     * @return merchantDescriptorPostalCode
     */
    public java.lang.String getMerchantDescriptorPostalCode() {
        return merchantDescriptorPostalCode;
    }


    /**
     * Sets the merchantDescriptorPostalCode value for this InvoiceHeader.
     * 
     * @param merchantDescriptorPostalCode
     */
    public void setMerchantDescriptorPostalCode(java.lang.String merchantDescriptorPostalCode) {
        this.merchantDescriptorPostalCode = merchantDescriptorPostalCode;
    }


    /**
     * Gets the merchantDescriptorCountry value for this InvoiceHeader.
     * 
     * @return merchantDescriptorCountry
     */
    public java.lang.String getMerchantDescriptorCountry() {
        return merchantDescriptorCountry;
    }


    /**
     * Sets the merchantDescriptorCountry value for this InvoiceHeader.
     * 
     * @param merchantDescriptorCountry
     */
    public void setMerchantDescriptorCountry(java.lang.String merchantDescriptorCountry) {
        this.merchantDescriptorCountry = merchantDescriptorCountry;
    }


    /**
     * Gets the isGift value for this InvoiceHeader.
     * 
     * @return isGift
     */
    public java.lang.String getIsGift() {
        return isGift;
    }


    /**
     * Sets the isGift value for this InvoiceHeader.
     * 
     * @param isGift
     */
    public void setIsGift(java.lang.String isGift) {
        this.isGift = isGift;
    }


    /**
     * Gets the returnsAccepted value for this InvoiceHeader.
     * 
     * @return returnsAccepted
     */
    public java.lang.String getReturnsAccepted() {
        return returnsAccepted;
    }


    /**
     * Sets the returnsAccepted value for this InvoiceHeader.
     * 
     * @param returnsAccepted
     */
    public void setReturnsAccepted(java.lang.String returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }


    /**
     * Gets the tenderType value for this InvoiceHeader.
     * 
     * @return tenderType
     */
    public java.lang.String getTenderType() {
        return tenderType;
    }


    /**
     * Sets the tenderType value for this InvoiceHeader.
     * 
     * @param tenderType
     */
    public void setTenderType(java.lang.String tenderType) {
        this.tenderType = tenderType;
    }


    /**
     * Gets the merchantVATRegistrationNumber value for this InvoiceHeader.
     * 
     * @return merchantVATRegistrationNumber
     */
    public java.lang.String getMerchantVATRegistrationNumber() {
        return merchantVATRegistrationNumber;
    }


    /**
     * Sets the merchantVATRegistrationNumber value for this InvoiceHeader.
     * 
     * @param merchantVATRegistrationNumber
     */
    public void setMerchantVATRegistrationNumber(java.lang.String merchantVATRegistrationNumber) {
        this.merchantVATRegistrationNumber = merchantVATRegistrationNumber;
    }


    /**
     * Gets the purchaserOrderDate value for this InvoiceHeader.
     * 
     * @return purchaserOrderDate
     */
    public java.lang.String getPurchaserOrderDate() {
        return purchaserOrderDate;
    }


    /**
     * Sets the purchaserOrderDate value for this InvoiceHeader.
     * 
     * @param purchaserOrderDate
     */
    public void setPurchaserOrderDate(java.lang.String purchaserOrderDate) {
        this.purchaserOrderDate = purchaserOrderDate;
    }


    /**
     * Gets the purchaserVATRegistrationNumber value for this InvoiceHeader.
     * 
     * @return purchaserVATRegistrationNumber
     */
    public java.lang.String getPurchaserVATRegistrationNumber() {
        return purchaserVATRegistrationNumber;
    }


    /**
     * Sets the purchaserVATRegistrationNumber value for this InvoiceHeader.
     * 
     * @param purchaserVATRegistrationNumber
     */
    public void setPurchaserVATRegistrationNumber(java.lang.String purchaserVATRegistrationNumber) {
        this.purchaserVATRegistrationNumber = purchaserVATRegistrationNumber;
    }


    /**
     * Gets the vatInvoiceReferenceNumber value for this InvoiceHeader.
     * 
     * @return vatInvoiceReferenceNumber
     */
    public java.lang.String getVatInvoiceReferenceNumber() {
        return vatInvoiceReferenceNumber;
    }


    /**
     * Sets the vatInvoiceReferenceNumber value for this InvoiceHeader.
     * 
     * @param vatInvoiceReferenceNumber
     */
    public void setVatInvoiceReferenceNumber(java.lang.String vatInvoiceReferenceNumber) {
        this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
    }


    /**
     * Gets the summaryCommodityCode value for this InvoiceHeader.
     * 
     * @return summaryCommodityCode
     */
    public java.lang.String getSummaryCommodityCode() {
        return summaryCommodityCode;
    }


    /**
     * Sets the summaryCommodityCode value for this InvoiceHeader.
     * 
     * @param summaryCommodityCode
     */
    public void setSummaryCommodityCode(java.lang.String summaryCommodityCode) {
        this.summaryCommodityCode = summaryCommodityCode;
    }


    /**
     * Gets the supplierOrderReference value for this InvoiceHeader.
     * 
     * @return supplierOrderReference
     */
    public java.lang.String getSupplierOrderReference() {
        return supplierOrderReference;
    }


    /**
     * Sets the supplierOrderReference value for this InvoiceHeader.
     * 
     * @param supplierOrderReference
     */
    public void setSupplierOrderReference(java.lang.String supplierOrderReference) {
        this.supplierOrderReference = supplierOrderReference;
    }


    /**
     * Gets the userPO value for this InvoiceHeader.
     * 
     * @return userPO
     */
    public java.lang.String getUserPO() {
        return userPO;
    }


    /**
     * Sets the userPO value for this InvoiceHeader.
     * 
     * @param userPO
     */
    public void setUserPO(java.lang.String userPO) {
        this.userPO = userPO;
    }


    /**
     * Gets the costCenter value for this InvoiceHeader.
     * 
     * @return costCenter
     */
    public java.lang.String getCostCenter() {
        return costCenter;
    }


    /**
     * Sets the costCenter value for this InvoiceHeader.
     * 
     * @param costCenter
     */
    public void setCostCenter(java.lang.String costCenter) {
        this.costCenter = costCenter;
    }


    /**
     * Gets the purchaserCode value for this InvoiceHeader.
     * 
     * @return purchaserCode
     */
    public java.lang.String getPurchaserCode() {
        return purchaserCode;
    }


    /**
     * Sets the purchaserCode value for this InvoiceHeader.
     * 
     * @param purchaserCode
     */
    public void setPurchaserCode(java.lang.String purchaserCode) {
        this.purchaserCode = purchaserCode;
    }


    /**
     * Gets the taxable value for this InvoiceHeader.
     * 
     * @return taxable
     */
    public java.lang.String getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this InvoiceHeader.
     * 
     * @param taxable
     */
    public void setTaxable(java.lang.String taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the amexDataTAA1 value for this InvoiceHeader.
     * 
     * @return amexDataTAA1
     */
    public java.lang.String getAmexDataTAA1() {
        return amexDataTAA1;
    }


    /**
     * Sets the amexDataTAA1 value for this InvoiceHeader.
     * 
     * @param amexDataTAA1
     */
    public void setAmexDataTAA1(java.lang.String amexDataTAA1) {
        this.amexDataTAA1 = amexDataTAA1;
    }


    /**
     * Gets the amexDataTAA2 value for this InvoiceHeader.
     * 
     * @return amexDataTAA2
     */
    public java.lang.String getAmexDataTAA2() {
        return amexDataTAA2;
    }


    /**
     * Sets the amexDataTAA2 value for this InvoiceHeader.
     * 
     * @param amexDataTAA2
     */
    public void setAmexDataTAA2(java.lang.String amexDataTAA2) {
        this.amexDataTAA2 = amexDataTAA2;
    }


    /**
     * Gets the amexDataTAA3 value for this InvoiceHeader.
     * 
     * @return amexDataTAA3
     */
    public java.lang.String getAmexDataTAA3() {
        return amexDataTAA3;
    }


    /**
     * Sets the amexDataTAA3 value for this InvoiceHeader.
     * 
     * @param amexDataTAA3
     */
    public void setAmexDataTAA3(java.lang.String amexDataTAA3) {
        this.amexDataTAA3 = amexDataTAA3;
    }


    /**
     * Gets the amexDataTAA4 value for this InvoiceHeader.
     * 
     * @return amexDataTAA4
     */
    public java.lang.String getAmexDataTAA4() {
        return amexDataTAA4;
    }


    /**
     * Sets the amexDataTAA4 value for this InvoiceHeader.
     * 
     * @param amexDataTAA4
     */
    public void setAmexDataTAA4(java.lang.String amexDataTAA4) {
        this.amexDataTAA4 = amexDataTAA4;
    }


    /**
     * Gets the invoiceDate value for this InvoiceHeader.
     * 
     * @return invoiceDate
     */
    public java.lang.String getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this InvoiceHeader.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.lang.String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the totalTaxTypeCode value for this InvoiceHeader.
     * 
     * @return totalTaxTypeCode
     */
    public java.lang.String getTotalTaxTypeCode() {
        return totalTaxTypeCode;
    }


    /**
     * Sets the totalTaxTypeCode value for this InvoiceHeader.
     * 
     * @param totalTaxTypeCode
     */
    public void setTotalTaxTypeCode(java.lang.String totalTaxTypeCode) {
        this.totalTaxTypeCode = totalTaxTypeCode;
    }


    /**
     * Gets the cardAcceptorRefNumber value for this InvoiceHeader.
     * 
     * @return cardAcceptorRefNumber
     */
    public java.lang.String getCardAcceptorRefNumber() {
        return cardAcceptorRefNumber;
    }


    /**
     * Sets the cardAcceptorRefNumber value for this InvoiceHeader.
     * 
     * @param cardAcceptorRefNumber
     */
    public void setCardAcceptorRefNumber(java.lang.String cardAcceptorRefNumber) {
        this.cardAcceptorRefNumber = cardAcceptorRefNumber;
    }


    /**
     * Gets the authorizedContactName value for this InvoiceHeader.
     * 
     * @return authorizedContactName
     */
    public java.lang.String getAuthorizedContactName() {
        return authorizedContactName;
    }


    /**
     * Sets the authorizedContactName value for this InvoiceHeader.
     * 
     * @param authorizedContactName
     */
    public void setAuthorizedContactName(java.lang.String authorizedContactName) {
        this.authorizedContactName = authorizedContactName;
    }


    /**
     * Gets the businessApplicationID value for this InvoiceHeader.
     * 
     * @return businessApplicationID
     */
    public java.lang.String getBusinessApplicationID() {
        return businessApplicationID;
    }


    /**
     * Sets the businessApplicationID value for this InvoiceHeader.
     * 
     * @param businessApplicationID
     */
    public void setBusinessApplicationID(java.lang.String businessApplicationID) {
        this.businessApplicationID = businessApplicationID;
    }


    /**
     * Gets the salesOrganizationID value for this InvoiceHeader.
     * 
     * @return salesOrganizationID
     */
    public java.math.BigInteger getSalesOrganizationID() {
        return salesOrganizationID;
    }


    /**
     * Sets the salesOrganizationID value for this InvoiceHeader.
     * 
     * @param salesOrganizationID
     */
    public void setSalesOrganizationID(java.math.BigInteger salesOrganizationID) {
        this.salesOrganizationID = salesOrganizationID;
    }


    /**
     * Gets the submerchantID value for this InvoiceHeader.
     * 
     * @return submerchantID
     */
    public java.lang.String getSubmerchantID() {
        return submerchantID;
    }


    /**
     * Sets the submerchantID value for this InvoiceHeader.
     * 
     * @param submerchantID
     */
    public void setSubmerchantID(java.lang.String submerchantID) {
        this.submerchantID = submerchantID;
    }


    /**
     * Gets the submerchantName value for this InvoiceHeader.
     * 
     * @return submerchantName
     */
    public java.lang.String getSubmerchantName() {
        return submerchantName;
    }


    /**
     * Sets the submerchantName value for this InvoiceHeader.
     * 
     * @param submerchantName
     */
    public void setSubmerchantName(java.lang.String submerchantName) {
        this.submerchantName = submerchantName;
    }


    /**
     * Gets the submerchantStreet value for this InvoiceHeader.
     * 
     * @return submerchantStreet
     */
    public java.lang.String getSubmerchantStreet() {
        return submerchantStreet;
    }


    /**
     * Sets the submerchantStreet value for this InvoiceHeader.
     * 
     * @param submerchantStreet
     */
    public void setSubmerchantStreet(java.lang.String submerchantStreet) {
        this.submerchantStreet = submerchantStreet;
    }


    /**
     * Gets the submerchantCity value for this InvoiceHeader.
     * 
     * @return submerchantCity
     */
    public java.lang.String getSubmerchantCity() {
        return submerchantCity;
    }


    /**
     * Sets the submerchantCity value for this InvoiceHeader.
     * 
     * @param submerchantCity
     */
    public void setSubmerchantCity(java.lang.String submerchantCity) {
        this.submerchantCity = submerchantCity;
    }


    /**
     * Gets the submerchantPostalCode value for this InvoiceHeader.
     * 
     * @return submerchantPostalCode
     */
    public java.lang.String getSubmerchantPostalCode() {
        return submerchantPostalCode;
    }


    /**
     * Sets the submerchantPostalCode value for this InvoiceHeader.
     * 
     * @param submerchantPostalCode
     */
    public void setSubmerchantPostalCode(java.lang.String submerchantPostalCode) {
        this.submerchantPostalCode = submerchantPostalCode;
    }


    /**
     * Gets the submerchantState value for this InvoiceHeader.
     * 
     * @return submerchantState
     */
    public java.lang.String getSubmerchantState() {
        return submerchantState;
    }


    /**
     * Sets the submerchantState value for this InvoiceHeader.
     * 
     * @param submerchantState
     */
    public void setSubmerchantState(java.lang.String submerchantState) {
        this.submerchantState = submerchantState;
    }


    /**
     * Gets the submerchantCountry value for this InvoiceHeader.
     * 
     * @return submerchantCountry
     */
    public java.lang.String getSubmerchantCountry() {
        return submerchantCountry;
    }


    /**
     * Sets the submerchantCountry value for this InvoiceHeader.
     * 
     * @param submerchantCountry
     */
    public void setSubmerchantCountry(java.lang.String submerchantCountry) {
        this.submerchantCountry = submerchantCountry;
    }


    /**
     * Gets the submerchantEmail value for this InvoiceHeader.
     * 
     * @return submerchantEmail
     */
    public java.lang.String getSubmerchantEmail() {
        return submerchantEmail;
    }


    /**
     * Sets the submerchantEmail value for this InvoiceHeader.
     * 
     * @param submerchantEmail
     */
    public void setSubmerchantEmail(java.lang.String submerchantEmail) {
        this.submerchantEmail = submerchantEmail;
    }


    /**
     * Gets the submerchantTelephoneNumber value for this InvoiceHeader.
     * 
     * @return submerchantTelephoneNumber
     */
    public java.lang.String getSubmerchantTelephoneNumber() {
        return submerchantTelephoneNumber;
    }


    /**
     * Sets the submerchantTelephoneNumber value for this InvoiceHeader.
     * 
     * @param submerchantTelephoneNumber
     */
    public void setSubmerchantTelephoneNumber(java.lang.String submerchantTelephoneNumber) {
        this.submerchantTelephoneNumber = submerchantTelephoneNumber;
    }


    /**
     * Gets the submerchantRegion value for this InvoiceHeader.
     * 
     * @return submerchantRegion
     */
    public java.lang.String getSubmerchantRegion() {
        return submerchantRegion;
    }


    /**
     * Sets the submerchantRegion value for this InvoiceHeader.
     * 
     * @param submerchantRegion
     */
    public void setSubmerchantRegion(java.lang.String submerchantRegion) {
        this.submerchantRegion = submerchantRegion;
    }


    /**
     * Gets the submerchantMerchantID value for this InvoiceHeader.
     * 
     * @return submerchantMerchantID
     */
    public java.lang.String getSubmerchantMerchantID() {
        return submerchantMerchantID;
    }


    /**
     * Sets the submerchantMerchantID value for this InvoiceHeader.
     * 
     * @param submerchantMerchantID
     */
    public void setSubmerchantMerchantID(java.lang.String submerchantMerchantID) {
        this.submerchantMerchantID = submerchantMerchantID;
    }


    /**
     * Gets the merchantDescriptorCounty value for this InvoiceHeader.
     * 
     * @return merchantDescriptorCounty
     */
    public java.lang.String getMerchantDescriptorCounty() {
        return merchantDescriptorCounty;
    }


    /**
     * Sets the merchantDescriptorCounty value for this InvoiceHeader.
     * 
     * @param merchantDescriptorCounty
     */
    public void setMerchantDescriptorCounty(java.lang.String merchantDescriptorCounty) {
        this.merchantDescriptorCounty = merchantDescriptorCounty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceHeader)) return false;
        InvoiceHeader other = (InvoiceHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantDescriptor==null && other.getMerchantDescriptor()==null) || 
             (this.merchantDescriptor!=null &&
              this.merchantDescriptor.equals(other.getMerchantDescriptor()))) &&
            ((this.merchantDescriptorContact==null && other.getMerchantDescriptorContact()==null) || 
             (this.merchantDescriptorContact!=null &&
              this.merchantDescriptorContact.equals(other.getMerchantDescriptorContact()))) &&
            ((this.merchantDescriptorAlternate==null && other.getMerchantDescriptorAlternate()==null) || 
             (this.merchantDescriptorAlternate!=null &&
              this.merchantDescriptorAlternate.equals(other.getMerchantDescriptorAlternate()))) &&
            ((this.merchantDescriptorStreet==null && other.getMerchantDescriptorStreet()==null) || 
             (this.merchantDescriptorStreet!=null &&
              this.merchantDescriptorStreet.equals(other.getMerchantDescriptorStreet()))) &&
            ((this.merchantDescriptorCity==null && other.getMerchantDescriptorCity()==null) || 
             (this.merchantDescriptorCity!=null &&
              this.merchantDescriptorCity.equals(other.getMerchantDescriptorCity()))) &&
            ((this.merchantDescriptorState==null && other.getMerchantDescriptorState()==null) || 
             (this.merchantDescriptorState!=null &&
              this.merchantDescriptorState.equals(other.getMerchantDescriptorState()))) &&
            ((this.merchantDescriptorPostalCode==null && other.getMerchantDescriptorPostalCode()==null) || 
             (this.merchantDescriptorPostalCode!=null &&
              this.merchantDescriptorPostalCode.equals(other.getMerchantDescriptorPostalCode()))) &&
            ((this.merchantDescriptorCountry==null && other.getMerchantDescriptorCountry()==null) || 
             (this.merchantDescriptorCountry!=null &&
              this.merchantDescriptorCountry.equals(other.getMerchantDescriptorCountry()))) &&
            ((this.isGift==null && other.getIsGift()==null) || 
             (this.isGift!=null &&
              this.isGift.equals(other.getIsGift()))) &&
            ((this.returnsAccepted==null && other.getReturnsAccepted()==null) || 
             (this.returnsAccepted!=null &&
              this.returnsAccepted.equals(other.getReturnsAccepted()))) &&
            ((this.tenderType==null && other.getTenderType()==null) || 
             (this.tenderType!=null &&
              this.tenderType.equals(other.getTenderType()))) &&
            ((this.merchantVATRegistrationNumber==null && other.getMerchantVATRegistrationNumber()==null) || 
             (this.merchantVATRegistrationNumber!=null &&
              this.merchantVATRegistrationNumber.equals(other.getMerchantVATRegistrationNumber()))) &&
            ((this.purchaserOrderDate==null && other.getPurchaserOrderDate()==null) || 
             (this.purchaserOrderDate!=null &&
              this.purchaserOrderDate.equals(other.getPurchaserOrderDate()))) &&
            ((this.purchaserVATRegistrationNumber==null && other.getPurchaserVATRegistrationNumber()==null) || 
             (this.purchaserVATRegistrationNumber!=null &&
              this.purchaserVATRegistrationNumber.equals(other.getPurchaserVATRegistrationNumber()))) &&
            ((this.vatInvoiceReferenceNumber==null && other.getVatInvoiceReferenceNumber()==null) || 
             (this.vatInvoiceReferenceNumber!=null &&
              this.vatInvoiceReferenceNumber.equals(other.getVatInvoiceReferenceNumber()))) &&
            ((this.summaryCommodityCode==null && other.getSummaryCommodityCode()==null) || 
             (this.summaryCommodityCode!=null &&
              this.summaryCommodityCode.equals(other.getSummaryCommodityCode()))) &&
            ((this.supplierOrderReference==null && other.getSupplierOrderReference()==null) || 
             (this.supplierOrderReference!=null &&
              this.supplierOrderReference.equals(other.getSupplierOrderReference()))) &&
            ((this.userPO==null && other.getUserPO()==null) || 
             (this.userPO!=null &&
              this.userPO.equals(other.getUserPO()))) &&
            ((this.costCenter==null && other.getCostCenter()==null) || 
             (this.costCenter!=null &&
              this.costCenter.equals(other.getCostCenter()))) &&
            ((this.purchaserCode==null && other.getPurchaserCode()==null) || 
             (this.purchaserCode!=null &&
              this.purchaserCode.equals(other.getPurchaserCode()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.amexDataTAA1==null && other.getAmexDataTAA1()==null) || 
             (this.amexDataTAA1!=null &&
              this.amexDataTAA1.equals(other.getAmexDataTAA1()))) &&
            ((this.amexDataTAA2==null && other.getAmexDataTAA2()==null) || 
             (this.amexDataTAA2!=null &&
              this.amexDataTAA2.equals(other.getAmexDataTAA2()))) &&
            ((this.amexDataTAA3==null && other.getAmexDataTAA3()==null) || 
             (this.amexDataTAA3!=null &&
              this.amexDataTAA3.equals(other.getAmexDataTAA3()))) &&
            ((this.amexDataTAA4==null && other.getAmexDataTAA4()==null) || 
             (this.amexDataTAA4!=null &&
              this.amexDataTAA4.equals(other.getAmexDataTAA4()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.totalTaxTypeCode==null && other.getTotalTaxTypeCode()==null) || 
             (this.totalTaxTypeCode!=null &&
              this.totalTaxTypeCode.equals(other.getTotalTaxTypeCode()))) &&
            ((this.cardAcceptorRefNumber==null && other.getCardAcceptorRefNumber()==null) || 
             (this.cardAcceptorRefNumber!=null &&
              this.cardAcceptorRefNumber.equals(other.getCardAcceptorRefNumber()))) &&
            ((this.authorizedContactName==null && other.getAuthorizedContactName()==null) || 
             (this.authorizedContactName!=null &&
              this.authorizedContactName.equals(other.getAuthorizedContactName()))) &&
            ((this.businessApplicationID==null && other.getBusinessApplicationID()==null) || 
             (this.businessApplicationID!=null &&
              this.businessApplicationID.equals(other.getBusinessApplicationID()))) &&
            ((this.salesOrganizationID==null && other.getSalesOrganizationID()==null) || 
             (this.salesOrganizationID!=null &&
              this.salesOrganizationID.equals(other.getSalesOrganizationID()))) &&
            ((this.submerchantID==null && other.getSubmerchantID()==null) || 
             (this.submerchantID!=null &&
              this.submerchantID.equals(other.getSubmerchantID()))) &&
            ((this.submerchantName==null && other.getSubmerchantName()==null) || 
             (this.submerchantName!=null &&
              this.submerchantName.equals(other.getSubmerchantName()))) &&
            ((this.submerchantStreet==null && other.getSubmerchantStreet()==null) || 
             (this.submerchantStreet!=null &&
              this.submerchantStreet.equals(other.getSubmerchantStreet()))) &&
            ((this.submerchantCity==null && other.getSubmerchantCity()==null) || 
             (this.submerchantCity!=null &&
              this.submerchantCity.equals(other.getSubmerchantCity()))) &&
            ((this.submerchantPostalCode==null && other.getSubmerchantPostalCode()==null) || 
             (this.submerchantPostalCode!=null &&
              this.submerchantPostalCode.equals(other.getSubmerchantPostalCode()))) &&
            ((this.submerchantState==null && other.getSubmerchantState()==null) || 
             (this.submerchantState!=null &&
              this.submerchantState.equals(other.getSubmerchantState()))) &&
            ((this.submerchantCountry==null && other.getSubmerchantCountry()==null) || 
             (this.submerchantCountry!=null &&
              this.submerchantCountry.equals(other.getSubmerchantCountry()))) &&
            ((this.submerchantEmail==null && other.getSubmerchantEmail()==null) || 
             (this.submerchantEmail!=null &&
              this.submerchantEmail.equals(other.getSubmerchantEmail()))) &&
            ((this.submerchantTelephoneNumber==null && other.getSubmerchantTelephoneNumber()==null) || 
             (this.submerchantTelephoneNumber!=null &&
              this.submerchantTelephoneNumber.equals(other.getSubmerchantTelephoneNumber()))) &&
            ((this.submerchantRegion==null && other.getSubmerchantRegion()==null) || 
             (this.submerchantRegion!=null &&
              this.submerchantRegion.equals(other.getSubmerchantRegion()))) &&
            ((this.submerchantMerchantID==null && other.getSubmerchantMerchantID()==null) || 
             (this.submerchantMerchantID!=null &&
              this.submerchantMerchantID.equals(other.getSubmerchantMerchantID()))) &&
            ((this.merchantDescriptorCounty==null && other.getMerchantDescriptorCounty()==null) || 
             (this.merchantDescriptorCounty!=null &&
              this.merchantDescriptorCounty.equals(other.getMerchantDescriptorCounty())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMerchantDescriptor() != null) {
            _hashCode += getMerchantDescriptor().hashCode();
        }
        if (getMerchantDescriptorContact() != null) {
            _hashCode += getMerchantDescriptorContact().hashCode();
        }
        if (getMerchantDescriptorAlternate() != null) {
            _hashCode += getMerchantDescriptorAlternate().hashCode();
        }
        if (getMerchantDescriptorStreet() != null) {
            _hashCode += getMerchantDescriptorStreet().hashCode();
        }
        if (getMerchantDescriptorCity() != null) {
            _hashCode += getMerchantDescriptorCity().hashCode();
        }
        if (getMerchantDescriptorState() != null) {
            _hashCode += getMerchantDescriptorState().hashCode();
        }
        if (getMerchantDescriptorPostalCode() != null) {
            _hashCode += getMerchantDescriptorPostalCode().hashCode();
        }
        if (getMerchantDescriptorCountry() != null) {
            _hashCode += getMerchantDescriptorCountry().hashCode();
        }
        if (getIsGift() != null) {
            _hashCode += getIsGift().hashCode();
        }
        if (getReturnsAccepted() != null) {
            _hashCode += getReturnsAccepted().hashCode();
        }
        if (getTenderType() != null) {
            _hashCode += getTenderType().hashCode();
        }
        if (getMerchantVATRegistrationNumber() != null) {
            _hashCode += getMerchantVATRegistrationNumber().hashCode();
        }
        if (getPurchaserOrderDate() != null) {
            _hashCode += getPurchaserOrderDate().hashCode();
        }
        if (getPurchaserVATRegistrationNumber() != null) {
            _hashCode += getPurchaserVATRegistrationNumber().hashCode();
        }
        if (getVatInvoiceReferenceNumber() != null) {
            _hashCode += getVatInvoiceReferenceNumber().hashCode();
        }
        if (getSummaryCommodityCode() != null) {
            _hashCode += getSummaryCommodityCode().hashCode();
        }
        if (getSupplierOrderReference() != null) {
            _hashCode += getSupplierOrderReference().hashCode();
        }
        if (getUserPO() != null) {
            _hashCode += getUserPO().hashCode();
        }
        if (getCostCenter() != null) {
            _hashCode += getCostCenter().hashCode();
        }
        if (getPurchaserCode() != null) {
            _hashCode += getPurchaserCode().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getAmexDataTAA1() != null) {
            _hashCode += getAmexDataTAA1().hashCode();
        }
        if (getAmexDataTAA2() != null) {
            _hashCode += getAmexDataTAA2().hashCode();
        }
        if (getAmexDataTAA3() != null) {
            _hashCode += getAmexDataTAA3().hashCode();
        }
        if (getAmexDataTAA4() != null) {
            _hashCode += getAmexDataTAA4().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getTotalTaxTypeCode() != null) {
            _hashCode += getTotalTaxTypeCode().hashCode();
        }
        if (getCardAcceptorRefNumber() != null) {
            _hashCode += getCardAcceptorRefNumber().hashCode();
        }
        if (getAuthorizedContactName() != null) {
            _hashCode += getAuthorizedContactName().hashCode();
        }
        if (getBusinessApplicationID() != null) {
            _hashCode += getBusinessApplicationID().hashCode();
        }
        if (getSalesOrganizationID() != null) {
            _hashCode += getSalesOrganizationID().hashCode();
        }
        if (getSubmerchantID() != null) {
            _hashCode += getSubmerchantID().hashCode();
        }
        if (getSubmerchantName() != null) {
            _hashCode += getSubmerchantName().hashCode();
        }
        if (getSubmerchantStreet() != null) {
            _hashCode += getSubmerchantStreet().hashCode();
        }
        if (getSubmerchantCity() != null) {
            _hashCode += getSubmerchantCity().hashCode();
        }
        if (getSubmerchantPostalCode() != null) {
            _hashCode += getSubmerchantPostalCode().hashCode();
        }
        if (getSubmerchantState() != null) {
            _hashCode += getSubmerchantState().hashCode();
        }
        if (getSubmerchantCountry() != null) {
            _hashCode += getSubmerchantCountry().hashCode();
        }
        if (getSubmerchantEmail() != null) {
            _hashCode += getSubmerchantEmail().hashCode();
        }
        if (getSubmerchantTelephoneNumber() != null) {
            _hashCode += getSubmerchantTelephoneNumber().hashCode();
        }
        if (getSubmerchantRegion() != null) {
            _hashCode += getSubmerchantRegion().hashCode();
        }
        if (getSubmerchantMerchantID() != null) {
            _hashCode += getSubmerchantMerchantID().hashCode();
        }
        if (getMerchantDescriptorCounty() != null) {
            _hashCode += getMerchantDescriptorCounty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "InvoiceHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorAlternate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorAlternate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGift");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "isGift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnsAccepted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "returnsAccepted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "tenderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantVATRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantVATRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaserOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaserOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaserVATRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaserVATRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatInvoiceReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vatInvoiceReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryCommodityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "summaryCommodityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierOrderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "supplierOrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "userPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "costCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaserCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaserCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexDataTAA1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amexDataTAA1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexDataTAA2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amexDataTAA2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexDataTAA3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amexDataTAA3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexDataTAA4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amexDataTAA4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalTaxTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAcceptorRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardAcceptorRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authorizedContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessApplicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "businessApplicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrganizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "salesOrganizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantTelephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantTelephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submerchantMerchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "submerchantMerchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
