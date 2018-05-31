/**
 * CCAuthReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCAuthReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String amount;

    private java.lang.String authorizationCode;

    private java.lang.String avsCode;

    private java.lang.String avsCodeRaw;

    private java.lang.String cvCode;

    private java.lang.String cvCodeRaw;

    private java.lang.String personalIDCode;

    private java.lang.String authorizedDateTime;

    private java.lang.String processorResponse;

    private java.lang.String bmlAccountNumber;

    private java.lang.String authFactorCode;

    private java.lang.String reconciliationID;

    private com.cybersource.stub.FundingTotals fundingTotals;

    private java.lang.String fxQuoteID;

    private java.lang.String fxQuoteRate;

    private java.lang.String fxQuoteType;

    private java.lang.String fxQuoteExpirationDateTime;

    private java.lang.String authRecord;

    private java.lang.String merchantAdviceCode;

    private java.lang.String merchantAdviceCodeRaw;

    private java.lang.String cavvResponseCode;

    private java.lang.String cavvResponseCodeRaw;

    private java.lang.String authenticationXID;

    private java.lang.String authorizationXID;

    private java.lang.String processorCardType;

    private java.lang.String accountBalance;

    private java.lang.String forwardCode;

    private java.lang.String enhancedDataEnabled;

    private java.lang.String referralResponseNumber;

    private java.lang.String subResponseCode;

    private java.lang.String approvedAmount;

    private java.lang.String creditLine;

    private java.lang.String approvedTerms;

    private java.lang.String paymentNetworkTransactionID;

    private java.lang.String cardCategory;

    private java.lang.String ownerMerchantID;

    private java.lang.String requestAmount;

    private java.lang.String requestCurrency;

    private java.lang.String accountBalanceCurrency;

    private java.lang.String accountBalanceSign;

    private java.lang.String amountType;

    private java.lang.String accountType;

    private java.lang.String affluenceIndicator;

    private java.lang.String evEmail;

    private java.lang.String evPhoneNumber;

    private java.lang.String evPostalCode;

    private java.lang.String evName;

    private java.lang.String evStreet;

    private java.lang.String evEmailRaw;

    private java.lang.String evPhoneNumberRaw;

    private java.lang.String evPostalCodeRaw;

    private java.lang.String evNameRaw;

    private java.lang.String evStreetRaw;

    private java.lang.String cardGroup;

    private java.lang.String posData;

    private java.lang.String transactionID;

    private java.lang.String cardIssuerCountry;

    private java.lang.String cardRegulated;

    private java.lang.String cardCommercial;

    private java.lang.String cardPrepaid;

    private java.lang.String cardPayroll;

    private java.lang.String cardHealthcare;

    private java.lang.String cardSignatureDebit;

    private java.lang.String cardPINlessDebit;

    private java.lang.String cardLevel3Eligible;

    private java.lang.String processorTransactionID;

    private java.lang.String providerReasonCode;

    private java.lang.String providerReasonDescription;

    private java.lang.String providerPassThroughData;

    private java.lang.String providerCVNResponseCode;

    private java.lang.String providerAVSResponseCode;

    private java.lang.String providerAcquirerBankCode;

    private java.lang.String paymentCardService;

    private java.lang.String paymentCardServiceResult;

    private java.lang.String transactionQualification;

    private java.lang.String transactionIntegrity;

    private java.lang.String emsTransactionRiskScore;

    private java.lang.String reconciliationReferenceNumber;

    public CCAuthReply() {
    }

    public CCAuthReply(
           java.math.BigInteger reasonCode,
           java.lang.String amount,
           java.lang.String authorizationCode,
           java.lang.String avsCode,
           java.lang.String avsCodeRaw,
           java.lang.String cvCode,
           java.lang.String cvCodeRaw,
           java.lang.String personalIDCode,
           java.lang.String authorizedDateTime,
           java.lang.String processorResponse,
           java.lang.String bmlAccountNumber,
           java.lang.String authFactorCode,
           java.lang.String reconciliationID,
           com.cybersource.stub.FundingTotals fundingTotals,
           java.lang.String fxQuoteID,
           java.lang.String fxQuoteRate,
           java.lang.String fxQuoteType,
           java.lang.String fxQuoteExpirationDateTime,
           java.lang.String authRecord,
           java.lang.String merchantAdviceCode,
           java.lang.String merchantAdviceCodeRaw,
           java.lang.String cavvResponseCode,
           java.lang.String cavvResponseCodeRaw,
           java.lang.String authenticationXID,
           java.lang.String authorizationXID,
           java.lang.String processorCardType,
           java.lang.String accountBalance,
           java.lang.String forwardCode,
           java.lang.String enhancedDataEnabled,
           java.lang.String referralResponseNumber,
           java.lang.String subResponseCode,
           java.lang.String approvedAmount,
           java.lang.String creditLine,
           java.lang.String approvedTerms,
           java.lang.String paymentNetworkTransactionID,
           java.lang.String cardCategory,
           java.lang.String ownerMerchantID,
           java.lang.String requestAmount,
           java.lang.String requestCurrency,
           java.lang.String accountBalanceCurrency,
           java.lang.String accountBalanceSign,
           java.lang.String amountType,
           java.lang.String accountType,
           java.lang.String affluenceIndicator,
           java.lang.String evEmail,
           java.lang.String evPhoneNumber,
           java.lang.String evPostalCode,
           java.lang.String evName,
           java.lang.String evStreet,
           java.lang.String evEmailRaw,
           java.lang.String evPhoneNumberRaw,
           java.lang.String evPostalCodeRaw,
           java.lang.String evNameRaw,
           java.lang.String evStreetRaw,
           java.lang.String cardGroup,
           java.lang.String posData,
           java.lang.String transactionID,
           java.lang.String cardIssuerCountry,
           java.lang.String cardRegulated,
           java.lang.String cardCommercial,
           java.lang.String cardPrepaid,
           java.lang.String cardPayroll,
           java.lang.String cardHealthcare,
           java.lang.String cardSignatureDebit,
           java.lang.String cardPINlessDebit,
           java.lang.String cardLevel3Eligible,
           java.lang.String processorTransactionID,
           java.lang.String providerReasonCode,
           java.lang.String providerReasonDescription,
           java.lang.String providerPassThroughData,
           java.lang.String providerCVNResponseCode,
           java.lang.String providerAVSResponseCode,
           java.lang.String providerAcquirerBankCode,
           java.lang.String paymentCardService,
           java.lang.String paymentCardServiceResult,
           java.lang.String transactionQualification,
           java.lang.String transactionIntegrity,
           java.lang.String emsTransactionRiskScore,
           java.lang.String reconciliationReferenceNumber) {
           this.reasonCode = reasonCode;
           this.amount = amount;
           this.authorizationCode = authorizationCode;
           this.avsCode = avsCode;
           this.avsCodeRaw = avsCodeRaw;
           this.cvCode = cvCode;
           this.cvCodeRaw = cvCodeRaw;
           this.personalIDCode = personalIDCode;
           this.authorizedDateTime = authorizedDateTime;
           this.processorResponse = processorResponse;
           this.bmlAccountNumber = bmlAccountNumber;
           this.authFactorCode = authFactorCode;
           this.reconciliationID = reconciliationID;
           this.fundingTotals = fundingTotals;
           this.fxQuoteID = fxQuoteID;
           this.fxQuoteRate = fxQuoteRate;
           this.fxQuoteType = fxQuoteType;
           this.fxQuoteExpirationDateTime = fxQuoteExpirationDateTime;
           this.authRecord = authRecord;
           this.merchantAdviceCode = merchantAdviceCode;
           this.merchantAdviceCodeRaw = merchantAdviceCodeRaw;
           this.cavvResponseCode = cavvResponseCode;
           this.cavvResponseCodeRaw = cavvResponseCodeRaw;
           this.authenticationXID = authenticationXID;
           this.authorizationXID = authorizationXID;
           this.processorCardType = processorCardType;
           this.accountBalance = accountBalance;
           this.forwardCode = forwardCode;
           this.enhancedDataEnabled = enhancedDataEnabled;
           this.referralResponseNumber = referralResponseNumber;
           this.subResponseCode = subResponseCode;
           this.approvedAmount = approvedAmount;
           this.creditLine = creditLine;
           this.approvedTerms = approvedTerms;
           this.paymentNetworkTransactionID = paymentNetworkTransactionID;
           this.cardCategory = cardCategory;
           this.ownerMerchantID = ownerMerchantID;
           this.requestAmount = requestAmount;
           this.requestCurrency = requestCurrency;
           this.accountBalanceCurrency = accountBalanceCurrency;
           this.accountBalanceSign = accountBalanceSign;
           this.amountType = amountType;
           this.accountType = accountType;
           this.affluenceIndicator = affluenceIndicator;
           this.evEmail = evEmail;
           this.evPhoneNumber = evPhoneNumber;
           this.evPostalCode = evPostalCode;
           this.evName = evName;
           this.evStreet = evStreet;
           this.evEmailRaw = evEmailRaw;
           this.evPhoneNumberRaw = evPhoneNumberRaw;
           this.evPostalCodeRaw = evPostalCodeRaw;
           this.evNameRaw = evNameRaw;
           this.evStreetRaw = evStreetRaw;
           this.cardGroup = cardGroup;
           this.posData = posData;
           this.transactionID = transactionID;
           this.cardIssuerCountry = cardIssuerCountry;
           this.cardRegulated = cardRegulated;
           this.cardCommercial = cardCommercial;
           this.cardPrepaid = cardPrepaid;
           this.cardPayroll = cardPayroll;
           this.cardHealthcare = cardHealthcare;
           this.cardSignatureDebit = cardSignatureDebit;
           this.cardPINlessDebit = cardPINlessDebit;
           this.cardLevel3Eligible = cardLevel3Eligible;
           this.processorTransactionID = processorTransactionID;
           this.providerReasonCode = providerReasonCode;
           this.providerReasonDescription = providerReasonDescription;
           this.providerPassThroughData = providerPassThroughData;
           this.providerCVNResponseCode = providerCVNResponseCode;
           this.providerAVSResponseCode = providerAVSResponseCode;
           this.providerAcquirerBankCode = providerAcquirerBankCode;
           this.paymentCardService = paymentCardService;
           this.paymentCardServiceResult = paymentCardServiceResult;
           this.transactionQualification = transactionQualification;
           this.transactionIntegrity = transactionIntegrity;
           this.emsTransactionRiskScore = emsTransactionRiskScore;
           this.reconciliationReferenceNumber = reconciliationReferenceNumber;
    }


    /**
     * Gets the reasonCode value for this CCAuthReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this CCAuthReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the amount value for this CCAuthReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CCAuthReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the authorizationCode value for this CCAuthReply.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this CCAuthReply.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the avsCode value for this CCAuthReply.
     * 
     * @return avsCode
     */
    public java.lang.String getAvsCode() {
        return avsCode;
    }


    /**
     * Sets the avsCode value for this CCAuthReply.
     * 
     * @param avsCode
     */
    public void setAvsCode(java.lang.String avsCode) {
        this.avsCode = avsCode;
    }


    /**
     * Gets the avsCodeRaw value for this CCAuthReply.
     * 
     * @return avsCodeRaw
     */
    public java.lang.String getAvsCodeRaw() {
        return avsCodeRaw;
    }


    /**
     * Sets the avsCodeRaw value for this CCAuthReply.
     * 
     * @param avsCodeRaw
     */
    public void setAvsCodeRaw(java.lang.String avsCodeRaw) {
        this.avsCodeRaw = avsCodeRaw;
    }


    /**
     * Gets the cvCode value for this CCAuthReply.
     * 
     * @return cvCode
     */
    public java.lang.String getCvCode() {
        return cvCode;
    }


    /**
     * Sets the cvCode value for this CCAuthReply.
     * 
     * @param cvCode
     */
    public void setCvCode(java.lang.String cvCode) {
        this.cvCode = cvCode;
    }


    /**
     * Gets the cvCodeRaw value for this CCAuthReply.
     * 
     * @return cvCodeRaw
     */
    public java.lang.String getCvCodeRaw() {
        return cvCodeRaw;
    }


    /**
     * Sets the cvCodeRaw value for this CCAuthReply.
     * 
     * @param cvCodeRaw
     */
    public void setCvCodeRaw(java.lang.String cvCodeRaw) {
        this.cvCodeRaw = cvCodeRaw;
    }


    /**
     * Gets the personalIDCode value for this CCAuthReply.
     * 
     * @return personalIDCode
     */
    public java.lang.String getPersonalIDCode() {
        return personalIDCode;
    }


    /**
     * Sets the personalIDCode value for this CCAuthReply.
     * 
     * @param personalIDCode
     */
    public void setPersonalIDCode(java.lang.String personalIDCode) {
        this.personalIDCode = personalIDCode;
    }


    /**
     * Gets the authorizedDateTime value for this CCAuthReply.
     * 
     * @return authorizedDateTime
     */
    public java.lang.String getAuthorizedDateTime() {
        return authorizedDateTime;
    }


    /**
     * Sets the authorizedDateTime value for this CCAuthReply.
     * 
     * @param authorizedDateTime
     */
    public void setAuthorizedDateTime(java.lang.String authorizedDateTime) {
        this.authorizedDateTime = authorizedDateTime;
    }


    /**
     * Gets the processorResponse value for this CCAuthReply.
     * 
     * @return processorResponse
     */
    public java.lang.String getProcessorResponse() {
        return processorResponse;
    }


    /**
     * Sets the processorResponse value for this CCAuthReply.
     * 
     * @param processorResponse
     */
    public void setProcessorResponse(java.lang.String processorResponse) {
        this.processorResponse = processorResponse;
    }


    /**
     * Gets the bmlAccountNumber value for this CCAuthReply.
     * 
     * @return bmlAccountNumber
     */
    public java.lang.String getBmlAccountNumber() {
        return bmlAccountNumber;
    }


    /**
     * Sets the bmlAccountNumber value for this CCAuthReply.
     * 
     * @param bmlAccountNumber
     */
    public void setBmlAccountNumber(java.lang.String bmlAccountNumber) {
        this.bmlAccountNumber = bmlAccountNumber;
    }


    /**
     * Gets the authFactorCode value for this CCAuthReply.
     * 
     * @return authFactorCode
     */
    public java.lang.String getAuthFactorCode() {
        return authFactorCode;
    }


    /**
     * Sets the authFactorCode value for this CCAuthReply.
     * 
     * @param authFactorCode
     */
    public void setAuthFactorCode(java.lang.String authFactorCode) {
        this.authFactorCode = authFactorCode;
    }


    /**
     * Gets the reconciliationID value for this CCAuthReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this CCAuthReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the fundingTotals value for this CCAuthReply.
     * 
     * @return fundingTotals
     */
    public com.cybersource.stub.FundingTotals getFundingTotals() {
        return fundingTotals;
    }


    /**
     * Sets the fundingTotals value for this CCAuthReply.
     * 
     * @param fundingTotals
     */
    public void setFundingTotals(com.cybersource.stub.FundingTotals fundingTotals) {
        this.fundingTotals = fundingTotals;
    }


    /**
     * Gets the fxQuoteID value for this CCAuthReply.
     * 
     * @return fxQuoteID
     */
    public java.lang.String getFxQuoteID() {
        return fxQuoteID;
    }


    /**
     * Sets the fxQuoteID value for this CCAuthReply.
     * 
     * @param fxQuoteID
     */
    public void setFxQuoteID(java.lang.String fxQuoteID) {
        this.fxQuoteID = fxQuoteID;
    }


    /**
     * Gets the fxQuoteRate value for this CCAuthReply.
     * 
     * @return fxQuoteRate
     */
    public java.lang.String getFxQuoteRate() {
        return fxQuoteRate;
    }


    /**
     * Sets the fxQuoteRate value for this CCAuthReply.
     * 
     * @param fxQuoteRate
     */
    public void setFxQuoteRate(java.lang.String fxQuoteRate) {
        this.fxQuoteRate = fxQuoteRate;
    }


    /**
     * Gets the fxQuoteType value for this CCAuthReply.
     * 
     * @return fxQuoteType
     */
    public java.lang.String getFxQuoteType() {
        return fxQuoteType;
    }


    /**
     * Sets the fxQuoteType value for this CCAuthReply.
     * 
     * @param fxQuoteType
     */
    public void setFxQuoteType(java.lang.String fxQuoteType) {
        this.fxQuoteType = fxQuoteType;
    }


    /**
     * Gets the fxQuoteExpirationDateTime value for this CCAuthReply.
     * 
     * @return fxQuoteExpirationDateTime
     */
    public java.lang.String getFxQuoteExpirationDateTime() {
        return fxQuoteExpirationDateTime;
    }


    /**
     * Sets the fxQuoteExpirationDateTime value for this CCAuthReply.
     * 
     * @param fxQuoteExpirationDateTime
     */
    public void setFxQuoteExpirationDateTime(java.lang.String fxQuoteExpirationDateTime) {
        this.fxQuoteExpirationDateTime = fxQuoteExpirationDateTime;
    }


    /**
     * Gets the authRecord value for this CCAuthReply.
     * 
     * @return authRecord
     */
    public java.lang.String getAuthRecord() {
        return authRecord;
    }


    /**
     * Sets the authRecord value for this CCAuthReply.
     * 
     * @param authRecord
     */
    public void setAuthRecord(java.lang.String authRecord) {
        this.authRecord = authRecord;
    }


    /**
     * Gets the merchantAdviceCode value for this CCAuthReply.
     * 
     * @return merchantAdviceCode
     */
    public java.lang.String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }


    /**
     * Sets the merchantAdviceCode value for this CCAuthReply.
     * 
     * @param merchantAdviceCode
     */
    public void setMerchantAdviceCode(java.lang.String merchantAdviceCode) {
        this.merchantAdviceCode = merchantAdviceCode;
    }


    /**
     * Gets the merchantAdviceCodeRaw value for this CCAuthReply.
     * 
     * @return merchantAdviceCodeRaw
     */
    public java.lang.String getMerchantAdviceCodeRaw() {
        return merchantAdviceCodeRaw;
    }


    /**
     * Sets the merchantAdviceCodeRaw value for this CCAuthReply.
     * 
     * @param merchantAdviceCodeRaw
     */
    public void setMerchantAdviceCodeRaw(java.lang.String merchantAdviceCodeRaw) {
        this.merchantAdviceCodeRaw = merchantAdviceCodeRaw;
    }


    /**
     * Gets the cavvResponseCode value for this CCAuthReply.
     * 
     * @return cavvResponseCode
     */
    public java.lang.String getCavvResponseCode() {
        return cavvResponseCode;
    }


    /**
     * Sets the cavvResponseCode value for this CCAuthReply.
     * 
     * @param cavvResponseCode
     */
    public void setCavvResponseCode(java.lang.String cavvResponseCode) {
        this.cavvResponseCode = cavvResponseCode;
    }


    /**
     * Gets the cavvResponseCodeRaw value for this CCAuthReply.
     * 
     * @return cavvResponseCodeRaw
     */
    public java.lang.String getCavvResponseCodeRaw() {
        return cavvResponseCodeRaw;
    }


    /**
     * Sets the cavvResponseCodeRaw value for this CCAuthReply.
     * 
     * @param cavvResponseCodeRaw
     */
    public void setCavvResponseCodeRaw(java.lang.String cavvResponseCodeRaw) {
        this.cavvResponseCodeRaw = cavvResponseCodeRaw;
    }


    /**
     * Gets the authenticationXID value for this CCAuthReply.
     * 
     * @return authenticationXID
     */
    public java.lang.String getAuthenticationXID() {
        return authenticationXID;
    }


    /**
     * Sets the authenticationXID value for this CCAuthReply.
     * 
     * @param authenticationXID
     */
    public void setAuthenticationXID(java.lang.String authenticationXID) {
        this.authenticationXID = authenticationXID;
    }


    /**
     * Gets the authorizationXID value for this CCAuthReply.
     * 
     * @return authorizationXID
     */
    public java.lang.String getAuthorizationXID() {
        return authorizationXID;
    }


    /**
     * Sets the authorizationXID value for this CCAuthReply.
     * 
     * @param authorizationXID
     */
    public void setAuthorizationXID(java.lang.String authorizationXID) {
        this.authorizationXID = authorizationXID;
    }


    /**
     * Gets the processorCardType value for this CCAuthReply.
     * 
     * @return processorCardType
     */
    public java.lang.String getProcessorCardType() {
        return processorCardType;
    }


    /**
     * Sets the processorCardType value for this CCAuthReply.
     * 
     * @param processorCardType
     */
    public void setProcessorCardType(java.lang.String processorCardType) {
        this.processorCardType = processorCardType;
    }


    /**
     * Gets the accountBalance value for this CCAuthReply.
     * 
     * @return accountBalance
     */
    public java.lang.String getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this CCAuthReply.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.lang.String accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the forwardCode value for this CCAuthReply.
     * 
     * @return forwardCode
     */
    public java.lang.String getForwardCode() {
        return forwardCode;
    }


    /**
     * Sets the forwardCode value for this CCAuthReply.
     * 
     * @param forwardCode
     */
    public void setForwardCode(java.lang.String forwardCode) {
        this.forwardCode = forwardCode;
    }


    /**
     * Gets the enhancedDataEnabled value for this CCAuthReply.
     * 
     * @return enhancedDataEnabled
     */
    public java.lang.String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }


    /**
     * Sets the enhancedDataEnabled value for this CCAuthReply.
     * 
     * @param enhancedDataEnabled
     */
    public void setEnhancedDataEnabled(java.lang.String enhancedDataEnabled) {
        this.enhancedDataEnabled = enhancedDataEnabled;
    }


    /**
     * Gets the referralResponseNumber value for this CCAuthReply.
     * 
     * @return referralResponseNumber
     */
    public java.lang.String getReferralResponseNumber() {
        return referralResponseNumber;
    }


    /**
     * Sets the referralResponseNumber value for this CCAuthReply.
     * 
     * @param referralResponseNumber
     */
    public void setReferralResponseNumber(java.lang.String referralResponseNumber) {
        this.referralResponseNumber = referralResponseNumber;
    }


    /**
     * Gets the subResponseCode value for this CCAuthReply.
     * 
     * @return subResponseCode
     */
    public java.lang.String getSubResponseCode() {
        return subResponseCode;
    }


    /**
     * Sets the subResponseCode value for this CCAuthReply.
     * 
     * @param subResponseCode
     */
    public void setSubResponseCode(java.lang.String subResponseCode) {
        this.subResponseCode = subResponseCode;
    }


    /**
     * Gets the approvedAmount value for this CCAuthReply.
     * 
     * @return approvedAmount
     */
    public java.lang.String getApprovedAmount() {
        return approvedAmount;
    }


    /**
     * Sets the approvedAmount value for this CCAuthReply.
     * 
     * @param approvedAmount
     */
    public void setApprovedAmount(java.lang.String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }


    /**
     * Gets the creditLine value for this CCAuthReply.
     * 
     * @return creditLine
     */
    public java.lang.String getCreditLine() {
        return creditLine;
    }


    /**
     * Sets the creditLine value for this CCAuthReply.
     * 
     * @param creditLine
     */
    public void setCreditLine(java.lang.String creditLine) {
        this.creditLine = creditLine;
    }


    /**
     * Gets the approvedTerms value for this CCAuthReply.
     * 
     * @return approvedTerms
     */
    public java.lang.String getApprovedTerms() {
        return approvedTerms;
    }


    /**
     * Sets the approvedTerms value for this CCAuthReply.
     * 
     * @param approvedTerms
     */
    public void setApprovedTerms(java.lang.String approvedTerms) {
        this.approvedTerms = approvedTerms;
    }


    /**
     * Gets the paymentNetworkTransactionID value for this CCAuthReply.
     * 
     * @return paymentNetworkTransactionID
     */
    public java.lang.String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }


    /**
     * Sets the paymentNetworkTransactionID value for this CCAuthReply.
     * 
     * @param paymentNetworkTransactionID
     */
    public void setPaymentNetworkTransactionID(java.lang.String paymentNetworkTransactionID) {
        this.paymentNetworkTransactionID = paymentNetworkTransactionID;
    }


    /**
     * Gets the cardCategory value for this CCAuthReply.
     * 
     * @return cardCategory
     */
    public java.lang.String getCardCategory() {
        return cardCategory;
    }


    /**
     * Sets the cardCategory value for this CCAuthReply.
     * 
     * @param cardCategory
     */
    public void setCardCategory(java.lang.String cardCategory) {
        this.cardCategory = cardCategory;
    }


    /**
     * Gets the ownerMerchantID value for this CCAuthReply.
     * 
     * @return ownerMerchantID
     */
    public java.lang.String getOwnerMerchantID() {
        return ownerMerchantID;
    }


    /**
     * Sets the ownerMerchantID value for this CCAuthReply.
     * 
     * @param ownerMerchantID
     */
    public void setOwnerMerchantID(java.lang.String ownerMerchantID) {
        this.ownerMerchantID = ownerMerchantID;
    }


    /**
     * Gets the requestAmount value for this CCAuthReply.
     * 
     * @return requestAmount
     */
    public java.lang.String getRequestAmount() {
        return requestAmount;
    }


    /**
     * Sets the requestAmount value for this CCAuthReply.
     * 
     * @param requestAmount
     */
    public void setRequestAmount(java.lang.String requestAmount) {
        this.requestAmount = requestAmount;
    }


    /**
     * Gets the requestCurrency value for this CCAuthReply.
     * 
     * @return requestCurrency
     */
    public java.lang.String getRequestCurrency() {
        return requestCurrency;
    }


    /**
     * Sets the requestCurrency value for this CCAuthReply.
     * 
     * @param requestCurrency
     */
    public void setRequestCurrency(java.lang.String requestCurrency) {
        this.requestCurrency = requestCurrency;
    }


    /**
     * Gets the accountBalanceCurrency value for this CCAuthReply.
     * 
     * @return accountBalanceCurrency
     */
    public java.lang.String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }


    /**
     * Sets the accountBalanceCurrency value for this CCAuthReply.
     * 
     * @param accountBalanceCurrency
     */
    public void setAccountBalanceCurrency(java.lang.String accountBalanceCurrency) {
        this.accountBalanceCurrency = accountBalanceCurrency;
    }


    /**
     * Gets the accountBalanceSign value for this CCAuthReply.
     * 
     * @return accountBalanceSign
     */
    public java.lang.String getAccountBalanceSign() {
        return accountBalanceSign;
    }


    /**
     * Sets the accountBalanceSign value for this CCAuthReply.
     * 
     * @param accountBalanceSign
     */
    public void setAccountBalanceSign(java.lang.String accountBalanceSign) {
        this.accountBalanceSign = accountBalanceSign;
    }


    /**
     * Gets the amountType value for this CCAuthReply.
     * 
     * @return amountType
     */
    public java.lang.String getAmountType() {
        return amountType;
    }


    /**
     * Sets the amountType value for this CCAuthReply.
     * 
     * @param amountType
     */
    public void setAmountType(java.lang.String amountType) {
        this.amountType = amountType;
    }


    /**
     * Gets the accountType value for this CCAuthReply.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CCAuthReply.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the affluenceIndicator value for this CCAuthReply.
     * 
     * @return affluenceIndicator
     */
    public java.lang.String getAffluenceIndicator() {
        return affluenceIndicator;
    }


    /**
     * Sets the affluenceIndicator value for this CCAuthReply.
     * 
     * @param affluenceIndicator
     */
    public void setAffluenceIndicator(java.lang.String affluenceIndicator) {
        this.affluenceIndicator = affluenceIndicator;
    }


    /**
     * Gets the evEmail value for this CCAuthReply.
     * 
     * @return evEmail
     */
    public java.lang.String getEvEmail() {
        return evEmail;
    }


    /**
     * Sets the evEmail value for this CCAuthReply.
     * 
     * @param evEmail
     */
    public void setEvEmail(java.lang.String evEmail) {
        this.evEmail = evEmail;
    }


    /**
     * Gets the evPhoneNumber value for this CCAuthReply.
     * 
     * @return evPhoneNumber
     */
    public java.lang.String getEvPhoneNumber() {
        return evPhoneNumber;
    }


    /**
     * Sets the evPhoneNumber value for this CCAuthReply.
     * 
     * @param evPhoneNumber
     */
    public void setEvPhoneNumber(java.lang.String evPhoneNumber) {
        this.evPhoneNumber = evPhoneNumber;
    }


    /**
     * Gets the evPostalCode value for this CCAuthReply.
     * 
     * @return evPostalCode
     */
    public java.lang.String getEvPostalCode() {
        return evPostalCode;
    }


    /**
     * Sets the evPostalCode value for this CCAuthReply.
     * 
     * @param evPostalCode
     */
    public void setEvPostalCode(java.lang.String evPostalCode) {
        this.evPostalCode = evPostalCode;
    }


    /**
     * Gets the evName value for this CCAuthReply.
     * 
     * @return evName
     */
    public java.lang.String getEvName() {
        return evName;
    }


    /**
     * Sets the evName value for this CCAuthReply.
     * 
     * @param evName
     */
    public void setEvName(java.lang.String evName) {
        this.evName = evName;
    }


    /**
     * Gets the evStreet value for this CCAuthReply.
     * 
     * @return evStreet
     */
    public java.lang.String getEvStreet() {
        return evStreet;
    }


    /**
     * Sets the evStreet value for this CCAuthReply.
     * 
     * @param evStreet
     */
    public void setEvStreet(java.lang.String evStreet) {
        this.evStreet = evStreet;
    }


    /**
     * Gets the evEmailRaw value for this CCAuthReply.
     * 
     * @return evEmailRaw
     */
    public java.lang.String getEvEmailRaw() {
        return evEmailRaw;
    }


    /**
     * Sets the evEmailRaw value for this CCAuthReply.
     * 
     * @param evEmailRaw
     */
    public void setEvEmailRaw(java.lang.String evEmailRaw) {
        this.evEmailRaw = evEmailRaw;
    }


    /**
     * Gets the evPhoneNumberRaw value for this CCAuthReply.
     * 
     * @return evPhoneNumberRaw
     */
    public java.lang.String getEvPhoneNumberRaw() {
        return evPhoneNumberRaw;
    }


    /**
     * Sets the evPhoneNumberRaw value for this CCAuthReply.
     * 
     * @param evPhoneNumberRaw
     */
    public void setEvPhoneNumberRaw(java.lang.String evPhoneNumberRaw) {
        this.evPhoneNumberRaw = evPhoneNumberRaw;
    }


    /**
     * Gets the evPostalCodeRaw value for this CCAuthReply.
     * 
     * @return evPostalCodeRaw
     */
    public java.lang.String getEvPostalCodeRaw() {
        return evPostalCodeRaw;
    }


    /**
     * Sets the evPostalCodeRaw value for this CCAuthReply.
     * 
     * @param evPostalCodeRaw
     */
    public void setEvPostalCodeRaw(java.lang.String evPostalCodeRaw) {
        this.evPostalCodeRaw = evPostalCodeRaw;
    }


    /**
     * Gets the evNameRaw value for this CCAuthReply.
     * 
     * @return evNameRaw
     */
    public java.lang.String getEvNameRaw() {
        return evNameRaw;
    }


    /**
     * Sets the evNameRaw value for this CCAuthReply.
     * 
     * @param evNameRaw
     */
    public void setEvNameRaw(java.lang.String evNameRaw) {
        this.evNameRaw = evNameRaw;
    }


    /**
     * Gets the evStreetRaw value for this CCAuthReply.
     * 
     * @return evStreetRaw
     */
    public java.lang.String getEvStreetRaw() {
        return evStreetRaw;
    }


    /**
     * Sets the evStreetRaw value for this CCAuthReply.
     * 
     * @param evStreetRaw
     */
    public void setEvStreetRaw(java.lang.String evStreetRaw) {
        this.evStreetRaw = evStreetRaw;
    }


    /**
     * Gets the cardGroup value for this CCAuthReply.
     * 
     * @return cardGroup
     */
    public java.lang.String getCardGroup() {
        return cardGroup;
    }


    /**
     * Sets the cardGroup value for this CCAuthReply.
     * 
     * @param cardGroup
     */
    public void setCardGroup(java.lang.String cardGroup) {
        this.cardGroup = cardGroup;
    }


    /**
     * Gets the posData value for this CCAuthReply.
     * 
     * @return posData
     */
    public java.lang.String getPosData() {
        return posData;
    }


    /**
     * Sets the posData value for this CCAuthReply.
     * 
     * @param posData
     */
    public void setPosData(java.lang.String posData) {
        this.posData = posData;
    }


    /**
     * Gets the transactionID value for this CCAuthReply.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this CCAuthReply.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the cardIssuerCountry value for this CCAuthReply.
     * 
     * @return cardIssuerCountry
     */
    public java.lang.String getCardIssuerCountry() {
        return cardIssuerCountry;
    }


    /**
     * Sets the cardIssuerCountry value for this CCAuthReply.
     * 
     * @param cardIssuerCountry
     */
    public void setCardIssuerCountry(java.lang.String cardIssuerCountry) {
        this.cardIssuerCountry = cardIssuerCountry;
    }


    /**
     * Gets the cardRegulated value for this CCAuthReply.
     * 
     * @return cardRegulated
     */
    public java.lang.String getCardRegulated() {
        return cardRegulated;
    }


    /**
     * Sets the cardRegulated value for this CCAuthReply.
     * 
     * @param cardRegulated
     */
    public void setCardRegulated(java.lang.String cardRegulated) {
        this.cardRegulated = cardRegulated;
    }


    /**
     * Gets the cardCommercial value for this CCAuthReply.
     * 
     * @return cardCommercial
     */
    public java.lang.String getCardCommercial() {
        return cardCommercial;
    }


    /**
     * Sets the cardCommercial value for this CCAuthReply.
     * 
     * @param cardCommercial
     */
    public void setCardCommercial(java.lang.String cardCommercial) {
        this.cardCommercial = cardCommercial;
    }


    /**
     * Gets the cardPrepaid value for this CCAuthReply.
     * 
     * @return cardPrepaid
     */
    public java.lang.String getCardPrepaid() {
        return cardPrepaid;
    }


    /**
     * Sets the cardPrepaid value for this CCAuthReply.
     * 
     * @param cardPrepaid
     */
    public void setCardPrepaid(java.lang.String cardPrepaid) {
        this.cardPrepaid = cardPrepaid;
    }


    /**
     * Gets the cardPayroll value for this CCAuthReply.
     * 
     * @return cardPayroll
     */
    public java.lang.String getCardPayroll() {
        return cardPayroll;
    }


    /**
     * Sets the cardPayroll value for this CCAuthReply.
     * 
     * @param cardPayroll
     */
    public void setCardPayroll(java.lang.String cardPayroll) {
        this.cardPayroll = cardPayroll;
    }


    /**
     * Gets the cardHealthcare value for this CCAuthReply.
     * 
     * @return cardHealthcare
     */
    public java.lang.String getCardHealthcare() {
        return cardHealthcare;
    }


    /**
     * Sets the cardHealthcare value for this CCAuthReply.
     * 
     * @param cardHealthcare
     */
    public void setCardHealthcare(java.lang.String cardHealthcare) {
        this.cardHealthcare = cardHealthcare;
    }


    /**
     * Gets the cardSignatureDebit value for this CCAuthReply.
     * 
     * @return cardSignatureDebit
     */
    public java.lang.String getCardSignatureDebit() {
        return cardSignatureDebit;
    }


    /**
     * Sets the cardSignatureDebit value for this CCAuthReply.
     * 
     * @param cardSignatureDebit
     */
    public void setCardSignatureDebit(java.lang.String cardSignatureDebit) {
        this.cardSignatureDebit = cardSignatureDebit;
    }


    /**
     * Gets the cardPINlessDebit value for this CCAuthReply.
     * 
     * @return cardPINlessDebit
     */
    public java.lang.String getCardPINlessDebit() {
        return cardPINlessDebit;
    }


    /**
     * Sets the cardPINlessDebit value for this CCAuthReply.
     * 
     * @param cardPINlessDebit
     */
    public void setCardPINlessDebit(java.lang.String cardPINlessDebit) {
        this.cardPINlessDebit = cardPINlessDebit;
    }


    /**
     * Gets the cardLevel3Eligible value for this CCAuthReply.
     * 
     * @return cardLevel3Eligible
     */
    public java.lang.String getCardLevel3Eligible() {
        return cardLevel3Eligible;
    }


    /**
     * Sets the cardLevel3Eligible value for this CCAuthReply.
     * 
     * @param cardLevel3Eligible
     */
    public void setCardLevel3Eligible(java.lang.String cardLevel3Eligible) {
        this.cardLevel3Eligible = cardLevel3Eligible;
    }


    /**
     * Gets the processorTransactionID value for this CCAuthReply.
     * 
     * @return processorTransactionID
     */
    public java.lang.String getProcessorTransactionID() {
        return processorTransactionID;
    }


    /**
     * Sets the processorTransactionID value for this CCAuthReply.
     * 
     * @param processorTransactionID
     */
    public void setProcessorTransactionID(java.lang.String processorTransactionID) {
        this.processorTransactionID = processorTransactionID;
    }


    /**
     * Gets the providerReasonCode value for this CCAuthReply.
     * 
     * @return providerReasonCode
     */
    public java.lang.String getProviderReasonCode() {
        return providerReasonCode;
    }


    /**
     * Sets the providerReasonCode value for this CCAuthReply.
     * 
     * @param providerReasonCode
     */
    public void setProviderReasonCode(java.lang.String providerReasonCode) {
        this.providerReasonCode = providerReasonCode;
    }


    /**
     * Gets the providerReasonDescription value for this CCAuthReply.
     * 
     * @return providerReasonDescription
     */
    public java.lang.String getProviderReasonDescription() {
        return providerReasonDescription;
    }


    /**
     * Sets the providerReasonDescription value for this CCAuthReply.
     * 
     * @param providerReasonDescription
     */
    public void setProviderReasonDescription(java.lang.String providerReasonDescription) {
        this.providerReasonDescription = providerReasonDescription;
    }


    /**
     * Gets the providerPassThroughData value for this CCAuthReply.
     * 
     * @return providerPassThroughData
     */
    public java.lang.String getProviderPassThroughData() {
        return providerPassThroughData;
    }


    /**
     * Sets the providerPassThroughData value for this CCAuthReply.
     * 
     * @param providerPassThroughData
     */
    public void setProviderPassThroughData(java.lang.String providerPassThroughData) {
        this.providerPassThroughData = providerPassThroughData;
    }


    /**
     * Gets the providerCVNResponseCode value for this CCAuthReply.
     * 
     * @return providerCVNResponseCode
     */
    public java.lang.String getProviderCVNResponseCode() {
        return providerCVNResponseCode;
    }


    /**
     * Sets the providerCVNResponseCode value for this CCAuthReply.
     * 
     * @param providerCVNResponseCode
     */
    public void setProviderCVNResponseCode(java.lang.String providerCVNResponseCode) {
        this.providerCVNResponseCode = providerCVNResponseCode;
    }


    /**
     * Gets the providerAVSResponseCode value for this CCAuthReply.
     * 
     * @return providerAVSResponseCode
     */
    public java.lang.String getProviderAVSResponseCode() {
        return providerAVSResponseCode;
    }


    /**
     * Sets the providerAVSResponseCode value for this CCAuthReply.
     * 
     * @param providerAVSResponseCode
     */
    public void setProviderAVSResponseCode(java.lang.String providerAVSResponseCode) {
        this.providerAVSResponseCode = providerAVSResponseCode;
    }


    /**
     * Gets the providerAcquirerBankCode value for this CCAuthReply.
     * 
     * @return providerAcquirerBankCode
     */
    public java.lang.String getProviderAcquirerBankCode() {
        return providerAcquirerBankCode;
    }


    /**
     * Sets the providerAcquirerBankCode value for this CCAuthReply.
     * 
     * @param providerAcquirerBankCode
     */
    public void setProviderAcquirerBankCode(java.lang.String providerAcquirerBankCode) {
        this.providerAcquirerBankCode = providerAcquirerBankCode;
    }


    /**
     * Gets the paymentCardService value for this CCAuthReply.
     * 
     * @return paymentCardService
     */
    public java.lang.String getPaymentCardService() {
        return paymentCardService;
    }


    /**
     * Sets the paymentCardService value for this CCAuthReply.
     * 
     * @param paymentCardService
     */
    public void setPaymentCardService(java.lang.String paymentCardService) {
        this.paymentCardService = paymentCardService;
    }


    /**
     * Gets the paymentCardServiceResult value for this CCAuthReply.
     * 
     * @return paymentCardServiceResult
     */
    public java.lang.String getPaymentCardServiceResult() {
        return paymentCardServiceResult;
    }


    /**
     * Sets the paymentCardServiceResult value for this CCAuthReply.
     * 
     * @param paymentCardServiceResult
     */
    public void setPaymentCardServiceResult(java.lang.String paymentCardServiceResult) {
        this.paymentCardServiceResult = paymentCardServiceResult;
    }


    /**
     * Gets the transactionQualification value for this CCAuthReply.
     * 
     * @return transactionQualification
     */
    public java.lang.String getTransactionQualification() {
        return transactionQualification;
    }


    /**
     * Sets the transactionQualification value for this CCAuthReply.
     * 
     * @param transactionQualification
     */
    public void setTransactionQualification(java.lang.String transactionQualification) {
        this.transactionQualification = transactionQualification;
    }


    /**
     * Gets the transactionIntegrity value for this CCAuthReply.
     * 
     * @return transactionIntegrity
     */
    public java.lang.String getTransactionIntegrity() {
        return transactionIntegrity;
    }


    /**
     * Sets the transactionIntegrity value for this CCAuthReply.
     * 
     * @param transactionIntegrity
     */
    public void setTransactionIntegrity(java.lang.String transactionIntegrity) {
        this.transactionIntegrity = transactionIntegrity;
    }


    /**
     * Gets the emsTransactionRiskScore value for this CCAuthReply.
     * 
     * @return emsTransactionRiskScore
     */
    public java.lang.String getEmsTransactionRiskScore() {
        return emsTransactionRiskScore;
    }


    /**
     * Sets the emsTransactionRiskScore value for this CCAuthReply.
     * 
     * @param emsTransactionRiskScore
     */
    public void setEmsTransactionRiskScore(java.lang.String emsTransactionRiskScore) {
        this.emsTransactionRiskScore = emsTransactionRiskScore;
    }


    /**
     * Gets the reconciliationReferenceNumber value for this CCAuthReply.
     * 
     * @return reconciliationReferenceNumber
     */
    public java.lang.String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }


    /**
     * Sets the reconciliationReferenceNumber value for this CCAuthReply.
     * 
     * @param reconciliationReferenceNumber
     */
    public void setReconciliationReferenceNumber(java.lang.String reconciliationReferenceNumber) {
        this.reconciliationReferenceNumber = reconciliationReferenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCAuthReply)) return false;
        CCAuthReply other = (CCAuthReply) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.avsCode==null && other.getAvsCode()==null) || 
             (this.avsCode!=null &&
              this.avsCode.equals(other.getAvsCode()))) &&
            ((this.avsCodeRaw==null && other.getAvsCodeRaw()==null) || 
             (this.avsCodeRaw!=null &&
              this.avsCodeRaw.equals(other.getAvsCodeRaw()))) &&
            ((this.cvCode==null && other.getCvCode()==null) || 
             (this.cvCode!=null &&
              this.cvCode.equals(other.getCvCode()))) &&
            ((this.cvCodeRaw==null && other.getCvCodeRaw()==null) || 
             (this.cvCodeRaw!=null &&
              this.cvCodeRaw.equals(other.getCvCodeRaw()))) &&
            ((this.personalIDCode==null && other.getPersonalIDCode()==null) || 
             (this.personalIDCode!=null &&
              this.personalIDCode.equals(other.getPersonalIDCode()))) &&
            ((this.authorizedDateTime==null && other.getAuthorizedDateTime()==null) || 
             (this.authorizedDateTime!=null &&
              this.authorizedDateTime.equals(other.getAuthorizedDateTime()))) &&
            ((this.processorResponse==null && other.getProcessorResponse()==null) || 
             (this.processorResponse!=null &&
              this.processorResponse.equals(other.getProcessorResponse()))) &&
            ((this.bmlAccountNumber==null && other.getBmlAccountNumber()==null) || 
             (this.bmlAccountNumber!=null &&
              this.bmlAccountNumber.equals(other.getBmlAccountNumber()))) &&
            ((this.authFactorCode==null && other.getAuthFactorCode()==null) || 
             (this.authFactorCode!=null &&
              this.authFactorCode.equals(other.getAuthFactorCode()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.fundingTotals==null && other.getFundingTotals()==null) || 
             (this.fundingTotals!=null &&
              this.fundingTotals.equals(other.getFundingTotals()))) &&
            ((this.fxQuoteID==null && other.getFxQuoteID()==null) || 
             (this.fxQuoteID!=null &&
              this.fxQuoteID.equals(other.getFxQuoteID()))) &&
            ((this.fxQuoteRate==null && other.getFxQuoteRate()==null) || 
             (this.fxQuoteRate!=null &&
              this.fxQuoteRate.equals(other.getFxQuoteRate()))) &&
            ((this.fxQuoteType==null && other.getFxQuoteType()==null) || 
             (this.fxQuoteType!=null &&
              this.fxQuoteType.equals(other.getFxQuoteType()))) &&
            ((this.fxQuoteExpirationDateTime==null && other.getFxQuoteExpirationDateTime()==null) || 
             (this.fxQuoteExpirationDateTime!=null &&
              this.fxQuoteExpirationDateTime.equals(other.getFxQuoteExpirationDateTime()))) &&
            ((this.authRecord==null && other.getAuthRecord()==null) || 
             (this.authRecord!=null &&
              this.authRecord.equals(other.getAuthRecord()))) &&
            ((this.merchantAdviceCode==null && other.getMerchantAdviceCode()==null) || 
             (this.merchantAdviceCode!=null &&
              this.merchantAdviceCode.equals(other.getMerchantAdviceCode()))) &&
            ((this.merchantAdviceCodeRaw==null && other.getMerchantAdviceCodeRaw()==null) || 
             (this.merchantAdviceCodeRaw!=null &&
              this.merchantAdviceCodeRaw.equals(other.getMerchantAdviceCodeRaw()))) &&
            ((this.cavvResponseCode==null && other.getCavvResponseCode()==null) || 
             (this.cavvResponseCode!=null &&
              this.cavvResponseCode.equals(other.getCavvResponseCode()))) &&
            ((this.cavvResponseCodeRaw==null && other.getCavvResponseCodeRaw()==null) || 
             (this.cavvResponseCodeRaw!=null &&
              this.cavvResponseCodeRaw.equals(other.getCavvResponseCodeRaw()))) &&
            ((this.authenticationXID==null && other.getAuthenticationXID()==null) || 
             (this.authenticationXID!=null &&
              this.authenticationXID.equals(other.getAuthenticationXID()))) &&
            ((this.authorizationXID==null && other.getAuthorizationXID()==null) || 
             (this.authorizationXID!=null &&
              this.authorizationXID.equals(other.getAuthorizationXID()))) &&
            ((this.processorCardType==null && other.getProcessorCardType()==null) || 
             (this.processorCardType!=null &&
              this.processorCardType.equals(other.getProcessorCardType()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.forwardCode==null && other.getForwardCode()==null) || 
             (this.forwardCode!=null &&
              this.forwardCode.equals(other.getForwardCode()))) &&
            ((this.enhancedDataEnabled==null && other.getEnhancedDataEnabled()==null) || 
             (this.enhancedDataEnabled!=null &&
              this.enhancedDataEnabled.equals(other.getEnhancedDataEnabled()))) &&
            ((this.referralResponseNumber==null && other.getReferralResponseNumber()==null) || 
             (this.referralResponseNumber!=null &&
              this.referralResponseNumber.equals(other.getReferralResponseNumber()))) &&
            ((this.subResponseCode==null && other.getSubResponseCode()==null) || 
             (this.subResponseCode!=null &&
              this.subResponseCode.equals(other.getSubResponseCode()))) &&
            ((this.approvedAmount==null && other.getApprovedAmount()==null) || 
             (this.approvedAmount!=null &&
              this.approvedAmount.equals(other.getApprovedAmount()))) &&
            ((this.creditLine==null && other.getCreditLine()==null) || 
             (this.creditLine!=null &&
              this.creditLine.equals(other.getCreditLine()))) &&
            ((this.approvedTerms==null && other.getApprovedTerms()==null) || 
             (this.approvedTerms!=null &&
              this.approvedTerms.equals(other.getApprovedTerms()))) &&
            ((this.paymentNetworkTransactionID==null && other.getPaymentNetworkTransactionID()==null) || 
             (this.paymentNetworkTransactionID!=null &&
              this.paymentNetworkTransactionID.equals(other.getPaymentNetworkTransactionID()))) &&
            ((this.cardCategory==null && other.getCardCategory()==null) || 
             (this.cardCategory!=null &&
              this.cardCategory.equals(other.getCardCategory()))) &&
            ((this.ownerMerchantID==null && other.getOwnerMerchantID()==null) || 
             (this.ownerMerchantID!=null &&
              this.ownerMerchantID.equals(other.getOwnerMerchantID()))) &&
            ((this.requestAmount==null && other.getRequestAmount()==null) || 
             (this.requestAmount!=null &&
              this.requestAmount.equals(other.getRequestAmount()))) &&
            ((this.requestCurrency==null && other.getRequestCurrency()==null) || 
             (this.requestCurrency!=null &&
              this.requestCurrency.equals(other.getRequestCurrency()))) &&
            ((this.accountBalanceCurrency==null && other.getAccountBalanceCurrency()==null) || 
             (this.accountBalanceCurrency!=null &&
              this.accountBalanceCurrency.equals(other.getAccountBalanceCurrency()))) &&
            ((this.accountBalanceSign==null && other.getAccountBalanceSign()==null) || 
             (this.accountBalanceSign!=null &&
              this.accountBalanceSign.equals(other.getAccountBalanceSign()))) &&
            ((this.amountType==null && other.getAmountType()==null) || 
             (this.amountType!=null &&
              this.amountType.equals(other.getAmountType()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.affluenceIndicator==null && other.getAffluenceIndicator()==null) || 
             (this.affluenceIndicator!=null &&
              this.affluenceIndicator.equals(other.getAffluenceIndicator()))) &&
            ((this.evEmail==null && other.getEvEmail()==null) || 
             (this.evEmail!=null &&
              this.evEmail.equals(other.getEvEmail()))) &&
            ((this.evPhoneNumber==null && other.getEvPhoneNumber()==null) || 
             (this.evPhoneNumber!=null &&
              this.evPhoneNumber.equals(other.getEvPhoneNumber()))) &&
            ((this.evPostalCode==null && other.getEvPostalCode()==null) || 
             (this.evPostalCode!=null &&
              this.evPostalCode.equals(other.getEvPostalCode()))) &&
            ((this.evName==null && other.getEvName()==null) || 
             (this.evName!=null &&
              this.evName.equals(other.getEvName()))) &&
            ((this.evStreet==null && other.getEvStreet()==null) || 
             (this.evStreet!=null &&
              this.evStreet.equals(other.getEvStreet()))) &&
            ((this.evEmailRaw==null && other.getEvEmailRaw()==null) || 
             (this.evEmailRaw!=null &&
              this.evEmailRaw.equals(other.getEvEmailRaw()))) &&
            ((this.evPhoneNumberRaw==null && other.getEvPhoneNumberRaw()==null) || 
             (this.evPhoneNumberRaw!=null &&
              this.evPhoneNumberRaw.equals(other.getEvPhoneNumberRaw()))) &&
            ((this.evPostalCodeRaw==null && other.getEvPostalCodeRaw()==null) || 
             (this.evPostalCodeRaw!=null &&
              this.evPostalCodeRaw.equals(other.getEvPostalCodeRaw()))) &&
            ((this.evNameRaw==null && other.getEvNameRaw()==null) || 
             (this.evNameRaw!=null &&
              this.evNameRaw.equals(other.getEvNameRaw()))) &&
            ((this.evStreetRaw==null && other.getEvStreetRaw()==null) || 
             (this.evStreetRaw!=null &&
              this.evStreetRaw.equals(other.getEvStreetRaw()))) &&
            ((this.cardGroup==null && other.getCardGroup()==null) || 
             (this.cardGroup!=null &&
              this.cardGroup.equals(other.getCardGroup()))) &&
            ((this.posData==null && other.getPosData()==null) || 
             (this.posData!=null &&
              this.posData.equals(other.getPosData()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.cardIssuerCountry==null && other.getCardIssuerCountry()==null) || 
             (this.cardIssuerCountry!=null &&
              this.cardIssuerCountry.equals(other.getCardIssuerCountry()))) &&
            ((this.cardRegulated==null && other.getCardRegulated()==null) || 
             (this.cardRegulated!=null &&
              this.cardRegulated.equals(other.getCardRegulated()))) &&
            ((this.cardCommercial==null && other.getCardCommercial()==null) || 
             (this.cardCommercial!=null &&
              this.cardCommercial.equals(other.getCardCommercial()))) &&
            ((this.cardPrepaid==null && other.getCardPrepaid()==null) || 
             (this.cardPrepaid!=null &&
              this.cardPrepaid.equals(other.getCardPrepaid()))) &&
            ((this.cardPayroll==null && other.getCardPayroll()==null) || 
             (this.cardPayroll!=null &&
              this.cardPayroll.equals(other.getCardPayroll()))) &&
            ((this.cardHealthcare==null && other.getCardHealthcare()==null) || 
             (this.cardHealthcare!=null &&
              this.cardHealthcare.equals(other.getCardHealthcare()))) &&
            ((this.cardSignatureDebit==null && other.getCardSignatureDebit()==null) || 
             (this.cardSignatureDebit!=null &&
              this.cardSignatureDebit.equals(other.getCardSignatureDebit()))) &&
            ((this.cardPINlessDebit==null && other.getCardPINlessDebit()==null) || 
             (this.cardPINlessDebit!=null &&
              this.cardPINlessDebit.equals(other.getCardPINlessDebit()))) &&
            ((this.cardLevel3Eligible==null && other.getCardLevel3Eligible()==null) || 
             (this.cardLevel3Eligible!=null &&
              this.cardLevel3Eligible.equals(other.getCardLevel3Eligible()))) &&
            ((this.processorTransactionID==null && other.getProcessorTransactionID()==null) || 
             (this.processorTransactionID!=null &&
              this.processorTransactionID.equals(other.getProcessorTransactionID()))) &&
            ((this.providerReasonCode==null && other.getProviderReasonCode()==null) || 
             (this.providerReasonCode!=null &&
              this.providerReasonCode.equals(other.getProviderReasonCode()))) &&
            ((this.providerReasonDescription==null && other.getProviderReasonDescription()==null) || 
             (this.providerReasonDescription!=null &&
              this.providerReasonDescription.equals(other.getProviderReasonDescription()))) &&
            ((this.providerPassThroughData==null && other.getProviderPassThroughData()==null) || 
             (this.providerPassThroughData!=null &&
              this.providerPassThroughData.equals(other.getProviderPassThroughData()))) &&
            ((this.providerCVNResponseCode==null && other.getProviderCVNResponseCode()==null) || 
             (this.providerCVNResponseCode!=null &&
              this.providerCVNResponseCode.equals(other.getProviderCVNResponseCode()))) &&
            ((this.providerAVSResponseCode==null && other.getProviderAVSResponseCode()==null) || 
             (this.providerAVSResponseCode!=null &&
              this.providerAVSResponseCode.equals(other.getProviderAVSResponseCode()))) &&
            ((this.providerAcquirerBankCode==null && other.getProviderAcquirerBankCode()==null) || 
             (this.providerAcquirerBankCode!=null &&
              this.providerAcquirerBankCode.equals(other.getProviderAcquirerBankCode()))) &&
            ((this.paymentCardService==null && other.getPaymentCardService()==null) || 
             (this.paymentCardService!=null &&
              this.paymentCardService.equals(other.getPaymentCardService()))) &&
            ((this.paymentCardServiceResult==null && other.getPaymentCardServiceResult()==null) || 
             (this.paymentCardServiceResult!=null &&
              this.paymentCardServiceResult.equals(other.getPaymentCardServiceResult()))) &&
            ((this.transactionQualification==null && other.getTransactionQualification()==null) || 
             (this.transactionQualification!=null &&
              this.transactionQualification.equals(other.getTransactionQualification()))) &&
            ((this.transactionIntegrity==null && other.getTransactionIntegrity()==null) || 
             (this.transactionIntegrity!=null &&
              this.transactionIntegrity.equals(other.getTransactionIntegrity()))) &&
            ((this.emsTransactionRiskScore==null && other.getEmsTransactionRiskScore()==null) || 
             (this.emsTransactionRiskScore!=null &&
              this.emsTransactionRiskScore.equals(other.getEmsTransactionRiskScore()))) &&
            ((this.reconciliationReferenceNumber==null && other.getReconciliationReferenceNumber()==null) || 
             (this.reconciliationReferenceNumber!=null &&
              this.reconciliationReferenceNumber.equals(other.getReconciliationReferenceNumber())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getAvsCode() != null) {
            _hashCode += getAvsCode().hashCode();
        }
        if (getAvsCodeRaw() != null) {
            _hashCode += getAvsCodeRaw().hashCode();
        }
        if (getCvCode() != null) {
            _hashCode += getCvCode().hashCode();
        }
        if (getCvCodeRaw() != null) {
            _hashCode += getCvCodeRaw().hashCode();
        }
        if (getPersonalIDCode() != null) {
            _hashCode += getPersonalIDCode().hashCode();
        }
        if (getAuthorizedDateTime() != null) {
            _hashCode += getAuthorizedDateTime().hashCode();
        }
        if (getProcessorResponse() != null) {
            _hashCode += getProcessorResponse().hashCode();
        }
        if (getBmlAccountNumber() != null) {
            _hashCode += getBmlAccountNumber().hashCode();
        }
        if (getAuthFactorCode() != null) {
            _hashCode += getAuthFactorCode().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getFundingTotals() != null) {
            _hashCode += getFundingTotals().hashCode();
        }
        if (getFxQuoteID() != null) {
            _hashCode += getFxQuoteID().hashCode();
        }
        if (getFxQuoteRate() != null) {
            _hashCode += getFxQuoteRate().hashCode();
        }
        if (getFxQuoteType() != null) {
            _hashCode += getFxQuoteType().hashCode();
        }
        if (getFxQuoteExpirationDateTime() != null) {
            _hashCode += getFxQuoteExpirationDateTime().hashCode();
        }
        if (getAuthRecord() != null) {
            _hashCode += getAuthRecord().hashCode();
        }
        if (getMerchantAdviceCode() != null) {
            _hashCode += getMerchantAdviceCode().hashCode();
        }
        if (getMerchantAdviceCodeRaw() != null) {
            _hashCode += getMerchantAdviceCodeRaw().hashCode();
        }
        if (getCavvResponseCode() != null) {
            _hashCode += getCavvResponseCode().hashCode();
        }
        if (getCavvResponseCodeRaw() != null) {
            _hashCode += getCavvResponseCodeRaw().hashCode();
        }
        if (getAuthenticationXID() != null) {
            _hashCode += getAuthenticationXID().hashCode();
        }
        if (getAuthorizationXID() != null) {
            _hashCode += getAuthorizationXID().hashCode();
        }
        if (getProcessorCardType() != null) {
            _hashCode += getProcessorCardType().hashCode();
        }
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
        }
        if (getForwardCode() != null) {
            _hashCode += getForwardCode().hashCode();
        }
        if (getEnhancedDataEnabled() != null) {
            _hashCode += getEnhancedDataEnabled().hashCode();
        }
        if (getReferralResponseNumber() != null) {
            _hashCode += getReferralResponseNumber().hashCode();
        }
        if (getSubResponseCode() != null) {
            _hashCode += getSubResponseCode().hashCode();
        }
        if (getApprovedAmount() != null) {
            _hashCode += getApprovedAmount().hashCode();
        }
        if (getCreditLine() != null) {
            _hashCode += getCreditLine().hashCode();
        }
        if (getApprovedTerms() != null) {
            _hashCode += getApprovedTerms().hashCode();
        }
        if (getPaymentNetworkTransactionID() != null) {
            _hashCode += getPaymentNetworkTransactionID().hashCode();
        }
        if (getCardCategory() != null) {
            _hashCode += getCardCategory().hashCode();
        }
        if (getOwnerMerchantID() != null) {
            _hashCode += getOwnerMerchantID().hashCode();
        }
        if (getRequestAmount() != null) {
            _hashCode += getRequestAmount().hashCode();
        }
        if (getRequestCurrency() != null) {
            _hashCode += getRequestCurrency().hashCode();
        }
        if (getAccountBalanceCurrency() != null) {
            _hashCode += getAccountBalanceCurrency().hashCode();
        }
        if (getAccountBalanceSign() != null) {
            _hashCode += getAccountBalanceSign().hashCode();
        }
        if (getAmountType() != null) {
            _hashCode += getAmountType().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAffluenceIndicator() != null) {
            _hashCode += getAffluenceIndicator().hashCode();
        }
        if (getEvEmail() != null) {
            _hashCode += getEvEmail().hashCode();
        }
        if (getEvPhoneNumber() != null) {
            _hashCode += getEvPhoneNumber().hashCode();
        }
        if (getEvPostalCode() != null) {
            _hashCode += getEvPostalCode().hashCode();
        }
        if (getEvName() != null) {
            _hashCode += getEvName().hashCode();
        }
        if (getEvStreet() != null) {
            _hashCode += getEvStreet().hashCode();
        }
        if (getEvEmailRaw() != null) {
            _hashCode += getEvEmailRaw().hashCode();
        }
        if (getEvPhoneNumberRaw() != null) {
            _hashCode += getEvPhoneNumberRaw().hashCode();
        }
        if (getEvPostalCodeRaw() != null) {
            _hashCode += getEvPostalCodeRaw().hashCode();
        }
        if (getEvNameRaw() != null) {
            _hashCode += getEvNameRaw().hashCode();
        }
        if (getEvStreetRaw() != null) {
            _hashCode += getEvStreetRaw().hashCode();
        }
        if (getCardGroup() != null) {
            _hashCode += getCardGroup().hashCode();
        }
        if (getPosData() != null) {
            _hashCode += getPosData().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getCardIssuerCountry() != null) {
            _hashCode += getCardIssuerCountry().hashCode();
        }
        if (getCardRegulated() != null) {
            _hashCode += getCardRegulated().hashCode();
        }
        if (getCardCommercial() != null) {
            _hashCode += getCardCommercial().hashCode();
        }
        if (getCardPrepaid() != null) {
            _hashCode += getCardPrepaid().hashCode();
        }
        if (getCardPayroll() != null) {
            _hashCode += getCardPayroll().hashCode();
        }
        if (getCardHealthcare() != null) {
            _hashCode += getCardHealthcare().hashCode();
        }
        if (getCardSignatureDebit() != null) {
            _hashCode += getCardSignatureDebit().hashCode();
        }
        if (getCardPINlessDebit() != null) {
            _hashCode += getCardPINlessDebit().hashCode();
        }
        if (getCardLevel3Eligible() != null) {
            _hashCode += getCardLevel3Eligible().hashCode();
        }
        if (getProcessorTransactionID() != null) {
            _hashCode += getProcessorTransactionID().hashCode();
        }
        if (getProviderReasonCode() != null) {
            _hashCode += getProviderReasonCode().hashCode();
        }
        if (getProviderReasonDescription() != null) {
            _hashCode += getProviderReasonDescription().hashCode();
        }
        if (getProviderPassThroughData() != null) {
            _hashCode += getProviderPassThroughData().hashCode();
        }
        if (getProviderCVNResponseCode() != null) {
            _hashCode += getProviderCVNResponseCode().hashCode();
        }
        if (getProviderAVSResponseCode() != null) {
            _hashCode += getProviderAVSResponseCode().hashCode();
        }
        if (getProviderAcquirerBankCode() != null) {
            _hashCode += getProviderAcquirerBankCode().hashCode();
        }
        if (getPaymentCardService() != null) {
            _hashCode += getPaymentCardService().hashCode();
        }
        if (getPaymentCardServiceResult() != null) {
            _hashCode += getPaymentCardServiceResult().hashCode();
        }
        if (getTransactionQualification() != null) {
            _hashCode += getTransactionQualification().hashCode();
        }
        if (getTransactionIntegrity() != null) {
            _hashCode += getTransactionIntegrity().hashCode();
        }
        if (getEmsTransactionRiskScore() != null) {
            _hashCode += getEmsTransactionRiskScore().hashCode();
        }
        if (getReconciliationReferenceNumber() != null) {
            _hashCode += getReconciliationReferenceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCAuthReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "avsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "avsCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cvCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cvCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIDCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "personalIDCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authorizedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bmlAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authFactorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authFactorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reconciliationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fundingTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FundingTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxQuoteID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxQuoteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxQuoteRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxQuoteRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxQuoteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxQuoteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxQuoteExpirationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxQuoteExpirationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAdviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantAdviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAdviceCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantAdviceCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cavvResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cavvResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cavvResponseCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cavvResponseCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationXID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authenticationXID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationXID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authorizationXID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "forwardCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedDataEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "enhancedDataEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referralResponseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "referralResponseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "approvedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "creditLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "approvedTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNetworkTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentNetworkTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerMerchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ownerMerchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalanceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountBalanceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalanceSign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountBalanceSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affluenceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "affluenceIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evEmailRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evEmailRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evPhoneNumberRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evPhoneNumberRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evPostalCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evPostalCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evNameRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evNameRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evStreetRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "evStreetRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "posData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIssuerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardIssuerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardRegulated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardRegulated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCommercial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardCommercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPrepaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardPrepaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHealthcare");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardHealthcare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSignatureDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardSignatureDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPINlessDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardPINlessDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardLevel3Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardLevel3Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerReasonDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerReasonDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerPassThroughData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerPassThroughData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerCVNResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerCVNResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerAVSResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerAVSResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerAcquirerBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "providerAcquirerBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCardService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentCardService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCardServiceResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentCardServiceResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionQualification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionQualification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIntegrity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionIntegrity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsTransactionRiskScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "emsTransactionRiskScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reconciliationReferenceNumber"));
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
