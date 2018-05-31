/**
 * PayPalGetTxnDetailsReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PayPalGetTxnDetailsReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String payer;

    private java.lang.String payerId;

    private java.lang.String payerStatus;

    private java.lang.String payerCountry;

    private java.lang.String payerBusiness;

    private java.lang.String payerSalutation;

    private java.lang.String payerFirstname;

    private java.lang.String payerMiddlename;

    private java.lang.String payerLastname;

    private java.lang.String payerSuffix;

    private java.lang.String addressID;

    private java.lang.String addressStatus;

    private java.lang.String shipToName;

    private java.lang.String shipToAddress1;

    private java.lang.String shipToAddress2;

    private java.lang.String shipToCity;

    private java.lang.String shipToState;

    private java.lang.String shipToCountry;

    private java.lang.String shipToZip;

    private java.lang.String payerPhone;

    private java.lang.String transactionId;

    private java.lang.String parentTransactionId;

    private java.lang.String paypalReceiptId;

    private java.lang.String paypalTransactiontype;

    private java.lang.String paypalPaymentType;

    private java.lang.String paypalOrderTime;

    private java.lang.String paypalPaymentGrossAmount;

    private java.lang.String paypalFeeAmount;

    private java.lang.String currency;

    private java.lang.String paypalSettleAmount;

    private java.lang.String paypalTaxAmount;

    private java.lang.String paypalExchangeRate;

    private java.lang.String paypalPaymentStatus;

    private java.lang.String paypalPendingReason;

    private java.lang.String paypalReasonCode;

    private java.lang.String protectionEligibility;

    private java.lang.String protectionEligibilityType;

    private java.lang.String paypalNote;

    private java.lang.String invoiceNumber;

    private com.cybersource.stub.Item[] item;

    private java.lang.String errorCode;

    public PayPalGetTxnDetailsReply() {
    }

    public PayPalGetTxnDetailsReply(
           java.math.BigInteger reasonCode,
           java.lang.String payer,
           java.lang.String payerId,
           java.lang.String payerStatus,
           java.lang.String payerCountry,
           java.lang.String payerBusiness,
           java.lang.String payerSalutation,
           java.lang.String payerFirstname,
           java.lang.String payerMiddlename,
           java.lang.String payerLastname,
           java.lang.String payerSuffix,
           java.lang.String addressID,
           java.lang.String addressStatus,
           java.lang.String shipToName,
           java.lang.String shipToAddress1,
           java.lang.String shipToAddress2,
           java.lang.String shipToCity,
           java.lang.String shipToState,
           java.lang.String shipToCountry,
           java.lang.String shipToZip,
           java.lang.String payerPhone,
           java.lang.String transactionId,
           java.lang.String parentTransactionId,
           java.lang.String paypalReceiptId,
           java.lang.String paypalTransactiontype,
           java.lang.String paypalPaymentType,
           java.lang.String paypalOrderTime,
           java.lang.String paypalPaymentGrossAmount,
           java.lang.String paypalFeeAmount,
           java.lang.String currency,
           java.lang.String paypalSettleAmount,
           java.lang.String paypalTaxAmount,
           java.lang.String paypalExchangeRate,
           java.lang.String paypalPaymentStatus,
           java.lang.String paypalPendingReason,
           java.lang.String paypalReasonCode,
           java.lang.String protectionEligibility,
           java.lang.String protectionEligibilityType,
           java.lang.String paypalNote,
           java.lang.String invoiceNumber,
           com.cybersource.stub.Item[] item,
           java.lang.String errorCode) {
           this.reasonCode = reasonCode;
           this.payer = payer;
           this.payerId = payerId;
           this.payerStatus = payerStatus;
           this.payerCountry = payerCountry;
           this.payerBusiness = payerBusiness;
           this.payerSalutation = payerSalutation;
           this.payerFirstname = payerFirstname;
           this.payerMiddlename = payerMiddlename;
           this.payerLastname = payerLastname;
           this.payerSuffix = payerSuffix;
           this.addressID = addressID;
           this.addressStatus = addressStatus;
           this.shipToName = shipToName;
           this.shipToAddress1 = shipToAddress1;
           this.shipToAddress2 = shipToAddress2;
           this.shipToCity = shipToCity;
           this.shipToState = shipToState;
           this.shipToCountry = shipToCountry;
           this.shipToZip = shipToZip;
           this.payerPhone = payerPhone;
           this.transactionId = transactionId;
           this.parentTransactionId = parentTransactionId;
           this.paypalReceiptId = paypalReceiptId;
           this.paypalTransactiontype = paypalTransactiontype;
           this.paypalPaymentType = paypalPaymentType;
           this.paypalOrderTime = paypalOrderTime;
           this.paypalPaymentGrossAmount = paypalPaymentGrossAmount;
           this.paypalFeeAmount = paypalFeeAmount;
           this.currency = currency;
           this.paypalSettleAmount = paypalSettleAmount;
           this.paypalTaxAmount = paypalTaxAmount;
           this.paypalExchangeRate = paypalExchangeRate;
           this.paypalPaymentStatus = paypalPaymentStatus;
           this.paypalPendingReason = paypalPendingReason;
           this.paypalReasonCode = paypalReasonCode;
           this.protectionEligibility = protectionEligibility;
           this.protectionEligibilityType = protectionEligibilityType;
           this.paypalNote = paypalNote;
           this.invoiceNumber = invoiceNumber;
           this.item = item;
           this.errorCode = errorCode;
    }


    /**
     * Gets the reasonCode value for this PayPalGetTxnDetailsReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PayPalGetTxnDetailsReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the payer value for this PayPalGetTxnDetailsReply.
     * 
     * @return payer
     */
    public java.lang.String getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this PayPalGetTxnDetailsReply.
     * 
     * @param payer
     */
    public void setPayer(java.lang.String payer) {
        this.payer = payer;
    }


    /**
     * Gets the payerId value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerId
     */
    public java.lang.String getPayerId() {
        return payerId;
    }


    /**
     * Sets the payerId value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerId
     */
    public void setPayerId(java.lang.String payerId) {
        this.payerId = payerId;
    }


    /**
     * Gets the payerStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerStatus
     */
    public java.lang.String getPayerStatus() {
        return payerStatus;
    }


    /**
     * Sets the payerStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerStatus
     */
    public void setPayerStatus(java.lang.String payerStatus) {
        this.payerStatus = payerStatus;
    }


    /**
     * Gets the payerCountry value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerCountry
     */
    public java.lang.String getPayerCountry() {
        return payerCountry;
    }


    /**
     * Sets the payerCountry value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerCountry
     */
    public void setPayerCountry(java.lang.String payerCountry) {
        this.payerCountry = payerCountry;
    }


    /**
     * Gets the payerBusiness value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerBusiness
     */
    public java.lang.String getPayerBusiness() {
        return payerBusiness;
    }


    /**
     * Sets the payerBusiness value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerBusiness
     */
    public void setPayerBusiness(java.lang.String payerBusiness) {
        this.payerBusiness = payerBusiness;
    }


    /**
     * Gets the payerSalutation value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerSalutation
     */
    public java.lang.String getPayerSalutation() {
        return payerSalutation;
    }


    /**
     * Sets the payerSalutation value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerSalutation
     */
    public void setPayerSalutation(java.lang.String payerSalutation) {
        this.payerSalutation = payerSalutation;
    }


    /**
     * Gets the payerFirstname value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerFirstname
     */
    public java.lang.String getPayerFirstname() {
        return payerFirstname;
    }


    /**
     * Sets the payerFirstname value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerFirstname
     */
    public void setPayerFirstname(java.lang.String payerFirstname) {
        this.payerFirstname = payerFirstname;
    }


    /**
     * Gets the payerMiddlename value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerMiddlename
     */
    public java.lang.String getPayerMiddlename() {
        return payerMiddlename;
    }


    /**
     * Sets the payerMiddlename value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerMiddlename
     */
    public void setPayerMiddlename(java.lang.String payerMiddlename) {
        this.payerMiddlename = payerMiddlename;
    }


    /**
     * Gets the payerLastname value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerLastname
     */
    public java.lang.String getPayerLastname() {
        return payerLastname;
    }


    /**
     * Sets the payerLastname value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerLastname
     */
    public void setPayerLastname(java.lang.String payerLastname) {
        this.payerLastname = payerLastname;
    }


    /**
     * Gets the payerSuffix value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerSuffix
     */
    public java.lang.String getPayerSuffix() {
        return payerSuffix;
    }


    /**
     * Sets the payerSuffix value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerSuffix
     */
    public void setPayerSuffix(java.lang.String payerSuffix) {
        this.payerSuffix = payerSuffix;
    }


    /**
     * Gets the addressID value for this PayPalGetTxnDetailsReply.
     * 
     * @return addressID
     */
    public java.lang.String getAddressID() {
        return addressID;
    }


    /**
     * Sets the addressID value for this PayPalGetTxnDetailsReply.
     * 
     * @param addressID
     */
    public void setAddressID(java.lang.String addressID) {
        this.addressID = addressID;
    }


    /**
     * Gets the addressStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @return addressStatus
     */
    public java.lang.String getAddressStatus() {
        return addressStatus;
    }


    /**
     * Sets the addressStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @param addressStatus
     */
    public void setAddressStatus(java.lang.String addressStatus) {
        this.addressStatus = addressStatus;
    }


    /**
     * Gets the shipToName value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToName
     */
    public java.lang.String getShipToName() {
        return shipToName;
    }


    /**
     * Sets the shipToName value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToName
     */
    public void setShipToName(java.lang.String shipToName) {
        this.shipToName = shipToName;
    }


    /**
     * Gets the shipToAddress1 value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToAddress1
     */
    public java.lang.String getShipToAddress1() {
        return shipToAddress1;
    }


    /**
     * Sets the shipToAddress1 value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToAddress1
     */
    public void setShipToAddress1(java.lang.String shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }


    /**
     * Gets the shipToAddress2 value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToAddress2
     */
    public java.lang.String getShipToAddress2() {
        return shipToAddress2;
    }


    /**
     * Sets the shipToAddress2 value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToAddress2
     */
    public void setShipToAddress2(java.lang.String shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }


    /**
     * Gets the shipToCity value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToCity
     */
    public java.lang.String getShipToCity() {
        return shipToCity;
    }


    /**
     * Sets the shipToCity value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToCity
     */
    public void setShipToCity(java.lang.String shipToCity) {
        this.shipToCity = shipToCity;
    }


    /**
     * Gets the shipToState value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToState
     */
    public java.lang.String getShipToState() {
        return shipToState;
    }


    /**
     * Sets the shipToState value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToState
     */
    public void setShipToState(java.lang.String shipToState) {
        this.shipToState = shipToState;
    }


    /**
     * Gets the shipToCountry value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToCountry
     */
    public java.lang.String getShipToCountry() {
        return shipToCountry;
    }


    /**
     * Sets the shipToCountry value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToCountry
     */
    public void setShipToCountry(java.lang.String shipToCountry) {
        this.shipToCountry = shipToCountry;
    }


    /**
     * Gets the shipToZip value for this PayPalGetTxnDetailsReply.
     * 
     * @return shipToZip
     */
    public java.lang.String getShipToZip() {
        return shipToZip;
    }


    /**
     * Sets the shipToZip value for this PayPalGetTxnDetailsReply.
     * 
     * @param shipToZip
     */
    public void setShipToZip(java.lang.String shipToZip) {
        this.shipToZip = shipToZip;
    }


    /**
     * Gets the payerPhone value for this PayPalGetTxnDetailsReply.
     * 
     * @return payerPhone
     */
    public java.lang.String getPayerPhone() {
        return payerPhone;
    }


    /**
     * Sets the payerPhone value for this PayPalGetTxnDetailsReply.
     * 
     * @param payerPhone
     */
    public void setPayerPhone(java.lang.String payerPhone) {
        this.payerPhone = payerPhone;
    }


    /**
     * Gets the transactionId value for this PayPalGetTxnDetailsReply.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PayPalGetTxnDetailsReply.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the parentTransactionId value for this PayPalGetTxnDetailsReply.
     * 
     * @return parentTransactionId
     */
    public java.lang.String getParentTransactionId() {
        return parentTransactionId;
    }


    /**
     * Sets the parentTransactionId value for this PayPalGetTxnDetailsReply.
     * 
     * @param parentTransactionId
     */
    public void setParentTransactionId(java.lang.String parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
    }


    /**
     * Gets the paypalReceiptId value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalReceiptId
     */
    public java.lang.String getPaypalReceiptId() {
        return paypalReceiptId;
    }


    /**
     * Sets the paypalReceiptId value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalReceiptId
     */
    public void setPaypalReceiptId(java.lang.String paypalReceiptId) {
        this.paypalReceiptId = paypalReceiptId;
    }


    /**
     * Gets the paypalTransactiontype value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalTransactiontype
     */
    public java.lang.String getPaypalTransactiontype() {
        return paypalTransactiontype;
    }


    /**
     * Sets the paypalTransactiontype value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalTransactiontype
     */
    public void setPaypalTransactiontype(java.lang.String paypalTransactiontype) {
        this.paypalTransactiontype = paypalTransactiontype;
    }


    /**
     * Gets the paypalPaymentType value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalPaymentType
     */
    public java.lang.String getPaypalPaymentType() {
        return paypalPaymentType;
    }


    /**
     * Sets the paypalPaymentType value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalPaymentType
     */
    public void setPaypalPaymentType(java.lang.String paypalPaymentType) {
        this.paypalPaymentType = paypalPaymentType;
    }


    /**
     * Gets the paypalOrderTime value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalOrderTime
     */
    public java.lang.String getPaypalOrderTime() {
        return paypalOrderTime;
    }


    /**
     * Sets the paypalOrderTime value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalOrderTime
     */
    public void setPaypalOrderTime(java.lang.String paypalOrderTime) {
        this.paypalOrderTime = paypalOrderTime;
    }


    /**
     * Gets the paypalPaymentGrossAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalPaymentGrossAmount
     */
    public java.lang.String getPaypalPaymentGrossAmount() {
        return paypalPaymentGrossAmount;
    }


    /**
     * Sets the paypalPaymentGrossAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalPaymentGrossAmount
     */
    public void setPaypalPaymentGrossAmount(java.lang.String paypalPaymentGrossAmount) {
        this.paypalPaymentGrossAmount = paypalPaymentGrossAmount;
    }


    /**
     * Gets the paypalFeeAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalFeeAmount
     */
    public java.lang.String getPaypalFeeAmount() {
        return paypalFeeAmount;
    }


    /**
     * Sets the paypalFeeAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalFeeAmount
     */
    public void setPaypalFeeAmount(java.lang.String paypalFeeAmount) {
        this.paypalFeeAmount = paypalFeeAmount;
    }


    /**
     * Gets the currency value for this PayPalGetTxnDetailsReply.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PayPalGetTxnDetailsReply.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the paypalSettleAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalSettleAmount
     */
    public java.lang.String getPaypalSettleAmount() {
        return paypalSettleAmount;
    }


    /**
     * Sets the paypalSettleAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalSettleAmount
     */
    public void setPaypalSettleAmount(java.lang.String paypalSettleAmount) {
        this.paypalSettleAmount = paypalSettleAmount;
    }


    /**
     * Gets the paypalTaxAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalTaxAmount
     */
    public java.lang.String getPaypalTaxAmount() {
        return paypalTaxAmount;
    }


    /**
     * Sets the paypalTaxAmount value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalTaxAmount
     */
    public void setPaypalTaxAmount(java.lang.String paypalTaxAmount) {
        this.paypalTaxAmount = paypalTaxAmount;
    }


    /**
     * Gets the paypalExchangeRate value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalExchangeRate
     */
    public java.lang.String getPaypalExchangeRate() {
        return paypalExchangeRate;
    }


    /**
     * Sets the paypalExchangeRate value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalExchangeRate
     */
    public void setPaypalExchangeRate(java.lang.String paypalExchangeRate) {
        this.paypalExchangeRate = paypalExchangeRate;
    }


    /**
     * Gets the paypalPaymentStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalPaymentStatus
     */
    public java.lang.String getPaypalPaymentStatus() {
        return paypalPaymentStatus;
    }


    /**
     * Sets the paypalPaymentStatus value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalPaymentStatus
     */
    public void setPaypalPaymentStatus(java.lang.String paypalPaymentStatus) {
        this.paypalPaymentStatus = paypalPaymentStatus;
    }


    /**
     * Gets the paypalPendingReason value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalPendingReason
     */
    public java.lang.String getPaypalPendingReason() {
        return paypalPendingReason;
    }


    /**
     * Sets the paypalPendingReason value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalPendingReason
     */
    public void setPaypalPendingReason(java.lang.String paypalPendingReason) {
        this.paypalPendingReason = paypalPendingReason;
    }


    /**
     * Gets the paypalReasonCode value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalReasonCode
     */
    public java.lang.String getPaypalReasonCode() {
        return paypalReasonCode;
    }


    /**
     * Sets the paypalReasonCode value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalReasonCode
     */
    public void setPaypalReasonCode(java.lang.String paypalReasonCode) {
        this.paypalReasonCode = paypalReasonCode;
    }


    /**
     * Gets the protectionEligibility value for this PayPalGetTxnDetailsReply.
     * 
     * @return protectionEligibility
     */
    public java.lang.String getProtectionEligibility() {
        return protectionEligibility;
    }


    /**
     * Sets the protectionEligibility value for this PayPalGetTxnDetailsReply.
     * 
     * @param protectionEligibility
     */
    public void setProtectionEligibility(java.lang.String protectionEligibility) {
        this.protectionEligibility = protectionEligibility;
    }


    /**
     * Gets the protectionEligibilityType value for this PayPalGetTxnDetailsReply.
     * 
     * @return protectionEligibilityType
     */
    public java.lang.String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }


    /**
     * Sets the protectionEligibilityType value for this PayPalGetTxnDetailsReply.
     * 
     * @param protectionEligibilityType
     */
    public void setProtectionEligibilityType(java.lang.String protectionEligibilityType) {
        this.protectionEligibilityType = protectionEligibilityType;
    }


    /**
     * Gets the paypalNote value for this PayPalGetTxnDetailsReply.
     * 
     * @return paypalNote
     */
    public java.lang.String getPaypalNote() {
        return paypalNote;
    }


    /**
     * Sets the paypalNote value for this PayPalGetTxnDetailsReply.
     * 
     * @param paypalNote
     */
    public void setPaypalNote(java.lang.String paypalNote) {
        this.paypalNote = paypalNote;
    }


    /**
     * Gets the invoiceNumber value for this PayPalGetTxnDetailsReply.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this PayPalGetTxnDetailsReply.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the item value for this PayPalGetTxnDetailsReply.
     * 
     * @return item
     */
    public com.cybersource.stub.Item[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this PayPalGetTxnDetailsReply.
     * 
     * @param item
     */
    public void setItem(com.cybersource.stub.Item[] item) {
        this.item = item;
    }

    public com.cybersource.stub.Item getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.cybersource.stub.Item _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the errorCode value for this PayPalGetTxnDetailsReply.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this PayPalGetTxnDetailsReply.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayPalGetTxnDetailsReply)) return false;
        PayPalGetTxnDetailsReply other = (PayPalGetTxnDetailsReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer()))) &&
            ((this.payerId==null && other.getPayerId()==null) || 
             (this.payerId!=null &&
              this.payerId.equals(other.getPayerId()))) &&
            ((this.payerStatus==null && other.getPayerStatus()==null) || 
             (this.payerStatus!=null &&
              this.payerStatus.equals(other.getPayerStatus()))) &&
            ((this.payerCountry==null && other.getPayerCountry()==null) || 
             (this.payerCountry!=null &&
              this.payerCountry.equals(other.getPayerCountry()))) &&
            ((this.payerBusiness==null && other.getPayerBusiness()==null) || 
             (this.payerBusiness!=null &&
              this.payerBusiness.equals(other.getPayerBusiness()))) &&
            ((this.payerSalutation==null && other.getPayerSalutation()==null) || 
             (this.payerSalutation!=null &&
              this.payerSalutation.equals(other.getPayerSalutation()))) &&
            ((this.payerFirstname==null && other.getPayerFirstname()==null) || 
             (this.payerFirstname!=null &&
              this.payerFirstname.equals(other.getPayerFirstname()))) &&
            ((this.payerMiddlename==null && other.getPayerMiddlename()==null) || 
             (this.payerMiddlename!=null &&
              this.payerMiddlename.equals(other.getPayerMiddlename()))) &&
            ((this.payerLastname==null && other.getPayerLastname()==null) || 
             (this.payerLastname!=null &&
              this.payerLastname.equals(other.getPayerLastname()))) &&
            ((this.payerSuffix==null && other.getPayerSuffix()==null) || 
             (this.payerSuffix!=null &&
              this.payerSuffix.equals(other.getPayerSuffix()))) &&
            ((this.addressID==null && other.getAddressID()==null) || 
             (this.addressID!=null &&
              this.addressID.equals(other.getAddressID()))) &&
            ((this.addressStatus==null && other.getAddressStatus()==null) || 
             (this.addressStatus!=null &&
              this.addressStatus.equals(other.getAddressStatus()))) &&
            ((this.shipToName==null && other.getShipToName()==null) || 
             (this.shipToName!=null &&
              this.shipToName.equals(other.getShipToName()))) &&
            ((this.shipToAddress1==null && other.getShipToAddress1()==null) || 
             (this.shipToAddress1!=null &&
              this.shipToAddress1.equals(other.getShipToAddress1()))) &&
            ((this.shipToAddress2==null && other.getShipToAddress2()==null) || 
             (this.shipToAddress2!=null &&
              this.shipToAddress2.equals(other.getShipToAddress2()))) &&
            ((this.shipToCity==null && other.getShipToCity()==null) || 
             (this.shipToCity!=null &&
              this.shipToCity.equals(other.getShipToCity()))) &&
            ((this.shipToState==null && other.getShipToState()==null) || 
             (this.shipToState!=null &&
              this.shipToState.equals(other.getShipToState()))) &&
            ((this.shipToCountry==null && other.getShipToCountry()==null) || 
             (this.shipToCountry!=null &&
              this.shipToCountry.equals(other.getShipToCountry()))) &&
            ((this.shipToZip==null && other.getShipToZip()==null) || 
             (this.shipToZip!=null &&
              this.shipToZip.equals(other.getShipToZip()))) &&
            ((this.payerPhone==null && other.getPayerPhone()==null) || 
             (this.payerPhone!=null &&
              this.payerPhone.equals(other.getPayerPhone()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.parentTransactionId==null && other.getParentTransactionId()==null) || 
             (this.parentTransactionId!=null &&
              this.parentTransactionId.equals(other.getParentTransactionId()))) &&
            ((this.paypalReceiptId==null && other.getPaypalReceiptId()==null) || 
             (this.paypalReceiptId!=null &&
              this.paypalReceiptId.equals(other.getPaypalReceiptId()))) &&
            ((this.paypalTransactiontype==null && other.getPaypalTransactiontype()==null) || 
             (this.paypalTransactiontype!=null &&
              this.paypalTransactiontype.equals(other.getPaypalTransactiontype()))) &&
            ((this.paypalPaymentType==null && other.getPaypalPaymentType()==null) || 
             (this.paypalPaymentType!=null &&
              this.paypalPaymentType.equals(other.getPaypalPaymentType()))) &&
            ((this.paypalOrderTime==null && other.getPaypalOrderTime()==null) || 
             (this.paypalOrderTime!=null &&
              this.paypalOrderTime.equals(other.getPaypalOrderTime()))) &&
            ((this.paypalPaymentGrossAmount==null && other.getPaypalPaymentGrossAmount()==null) || 
             (this.paypalPaymentGrossAmount!=null &&
              this.paypalPaymentGrossAmount.equals(other.getPaypalPaymentGrossAmount()))) &&
            ((this.paypalFeeAmount==null && other.getPaypalFeeAmount()==null) || 
             (this.paypalFeeAmount!=null &&
              this.paypalFeeAmount.equals(other.getPaypalFeeAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.paypalSettleAmount==null && other.getPaypalSettleAmount()==null) || 
             (this.paypalSettleAmount!=null &&
              this.paypalSettleAmount.equals(other.getPaypalSettleAmount()))) &&
            ((this.paypalTaxAmount==null && other.getPaypalTaxAmount()==null) || 
             (this.paypalTaxAmount!=null &&
              this.paypalTaxAmount.equals(other.getPaypalTaxAmount()))) &&
            ((this.paypalExchangeRate==null && other.getPaypalExchangeRate()==null) || 
             (this.paypalExchangeRate!=null &&
              this.paypalExchangeRate.equals(other.getPaypalExchangeRate()))) &&
            ((this.paypalPaymentStatus==null && other.getPaypalPaymentStatus()==null) || 
             (this.paypalPaymentStatus!=null &&
              this.paypalPaymentStatus.equals(other.getPaypalPaymentStatus()))) &&
            ((this.paypalPendingReason==null && other.getPaypalPendingReason()==null) || 
             (this.paypalPendingReason!=null &&
              this.paypalPendingReason.equals(other.getPaypalPendingReason()))) &&
            ((this.paypalReasonCode==null && other.getPaypalReasonCode()==null) || 
             (this.paypalReasonCode!=null &&
              this.paypalReasonCode.equals(other.getPaypalReasonCode()))) &&
            ((this.protectionEligibility==null && other.getProtectionEligibility()==null) || 
             (this.protectionEligibility!=null &&
              this.protectionEligibility.equals(other.getProtectionEligibility()))) &&
            ((this.protectionEligibilityType==null && other.getProtectionEligibilityType()==null) || 
             (this.protectionEligibilityType!=null &&
              this.protectionEligibilityType.equals(other.getProtectionEligibilityType()))) &&
            ((this.paypalNote==null && other.getPaypalNote()==null) || 
             (this.paypalNote!=null &&
              this.paypalNote.equals(other.getPaypalNote()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        if (getPayerId() != null) {
            _hashCode += getPayerId().hashCode();
        }
        if (getPayerStatus() != null) {
            _hashCode += getPayerStatus().hashCode();
        }
        if (getPayerCountry() != null) {
            _hashCode += getPayerCountry().hashCode();
        }
        if (getPayerBusiness() != null) {
            _hashCode += getPayerBusiness().hashCode();
        }
        if (getPayerSalutation() != null) {
            _hashCode += getPayerSalutation().hashCode();
        }
        if (getPayerFirstname() != null) {
            _hashCode += getPayerFirstname().hashCode();
        }
        if (getPayerMiddlename() != null) {
            _hashCode += getPayerMiddlename().hashCode();
        }
        if (getPayerLastname() != null) {
            _hashCode += getPayerLastname().hashCode();
        }
        if (getPayerSuffix() != null) {
            _hashCode += getPayerSuffix().hashCode();
        }
        if (getAddressID() != null) {
            _hashCode += getAddressID().hashCode();
        }
        if (getAddressStatus() != null) {
            _hashCode += getAddressStatus().hashCode();
        }
        if (getShipToName() != null) {
            _hashCode += getShipToName().hashCode();
        }
        if (getShipToAddress1() != null) {
            _hashCode += getShipToAddress1().hashCode();
        }
        if (getShipToAddress2() != null) {
            _hashCode += getShipToAddress2().hashCode();
        }
        if (getShipToCity() != null) {
            _hashCode += getShipToCity().hashCode();
        }
        if (getShipToState() != null) {
            _hashCode += getShipToState().hashCode();
        }
        if (getShipToCountry() != null) {
            _hashCode += getShipToCountry().hashCode();
        }
        if (getShipToZip() != null) {
            _hashCode += getShipToZip().hashCode();
        }
        if (getPayerPhone() != null) {
            _hashCode += getPayerPhone().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getParentTransactionId() != null) {
            _hashCode += getParentTransactionId().hashCode();
        }
        if (getPaypalReceiptId() != null) {
            _hashCode += getPaypalReceiptId().hashCode();
        }
        if (getPaypalTransactiontype() != null) {
            _hashCode += getPaypalTransactiontype().hashCode();
        }
        if (getPaypalPaymentType() != null) {
            _hashCode += getPaypalPaymentType().hashCode();
        }
        if (getPaypalOrderTime() != null) {
            _hashCode += getPaypalOrderTime().hashCode();
        }
        if (getPaypalPaymentGrossAmount() != null) {
            _hashCode += getPaypalPaymentGrossAmount().hashCode();
        }
        if (getPaypalFeeAmount() != null) {
            _hashCode += getPaypalFeeAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPaypalSettleAmount() != null) {
            _hashCode += getPaypalSettleAmount().hashCode();
        }
        if (getPaypalTaxAmount() != null) {
            _hashCode += getPaypalTaxAmount().hashCode();
        }
        if (getPaypalExchangeRate() != null) {
            _hashCode += getPaypalExchangeRate().hashCode();
        }
        if (getPaypalPaymentStatus() != null) {
            _hashCode += getPaypalPaymentStatus().hashCode();
        }
        if (getPaypalPendingReason() != null) {
            _hashCode += getPaypalPendingReason().hashCode();
        }
        if (getPaypalReasonCode() != null) {
            _hashCode += getPaypalReasonCode().hashCode();
        }
        if (getProtectionEligibility() != null) {
            _hashCode += getProtectionEligibility().hashCode();
        }
        if (getProtectionEligibilityType() != null) {
            _hashCode += getProtectionEligibilityType().hashCode();
        }
        if (getPaypalNote() != null) {
            _hashCode += getPaypalNote().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayPalGetTxnDetailsReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalGetTxnDetailsReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerSalutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerSalutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerFirstname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerFirstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerMiddlename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerMiddlename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerLastname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerLastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "addressID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "addressStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipToZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "parentTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalReceiptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalReceiptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalTransactiontype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalTransactiontype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalOrderTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalOrderTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPaymentGrossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPaymentGrossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalFeeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalFeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalSettleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalSettleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPaymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPendingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPendingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "protectionEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionEligibilityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "protectionEligibilityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "errorCode"));
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
