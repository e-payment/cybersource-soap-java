/**
 * VCReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class VCReply  implements java.io.Serializable {
    private java.lang.String creationTimeStamp;

    private java.lang.String alternateShippingAddressCountryCode;

    private java.lang.String alternateShippingAddressPostalCode;

    private java.lang.String vcAccountLoginName;

    private java.lang.String vcAccountFirstName;

    private java.lang.String vcAccountLastName;

    private java.lang.String vcAccountEncryptedID;

    private java.lang.String vcAccountEmail;

    private java.lang.String vcAccountMobilePhoneNumber;

    private java.lang.String merchantReferenceID;

    private java.lang.String subtotalAmount;

    private java.lang.String shippingHandlingAmount;

    private java.lang.String taxAmount;

    private java.lang.String discountAmount;

    private java.lang.String giftWrapAmount;

    private java.lang.String uncategorizedAmount;

    private java.lang.String totalPurchaseAmount;

    private java.lang.String walletReferenceID;

    private java.lang.String promotionCode;

    private java.lang.String paymentInstrumentID;

    private java.lang.String cardVerificationStatus;

    private java.lang.String issuerID;

    private java.lang.String paymentInstrumentNickName;

    private java.lang.String nameOnCard;

    private java.lang.String cardType;

    private java.lang.String cardGroup;

    private com.cybersource.stub.VCCardArt cardArt;

    private java.lang.String riskAdvice;

    private java.lang.String riskScore;

    private java.lang.String riskAdditionalData;

    private java.lang.String avsCodeRaw;

    private java.lang.String cvnCodeRaw;

    private java.lang.String eciRaw;

    private java.lang.String eci;

    private java.lang.String cavv;

    private java.lang.String veresEnrolled;

    private java.lang.String veresTimeStamp;

    private java.lang.String paresStatus;

    private java.lang.String paresTimeStamp;

    private java.lang.String xid;

    private com.cybersource.stub.VCCustomData customData;

    public VCReply() {
    }

    public VCReply(
           java.lang.String creationTimeStamp,
           java.lang.String alternateShippingAddressCountryCode,
           java.lang.String alternateShippingAddressPostalCode,
           java.lang.String vcAccountLoginName,
           java.lang.String vcAccountFirstName,
           java.lang.String vcAccountLastName,
           java.lang.String vcAccountEncryptedID,
           java.lang.String vcAccountEmail,
           java.lang.String vcAccountMobilePhoneNumber,
           java.lang.String merchantReferenceID,
           java.lang.String subtotalAmount,
           java.lang.String shippingHandlingAmount,
           java.lang.String taxAmount,
           java.lang.String discountAmount,
           java.lang.String giftWrapAmount,
           java.lang.String uncategorizedAmount,
           java.lang.String totalPurchaseAmount,
           java.lang.String walletReferenceID,
           java.lang.String promotionCode,
           java.lang.String paymentInstrumentID,
           java.lang.String cardVerificationStatus,
           java.lang.String issuerID,
           java.lang.String paymentInstrumentNickName,
           java.lang.String nameOnCard,
           java.lang.String cardType,
           java.lang.String cardGroup,
           com.cybersource.stub.VCCardArt cardArt,
           java.lang.String riskAdvice,
           java.lang.String riskScore,
           java.lang.String riskAdditionalData,
           java.lang.String avsCodeRaw,
           java.lang.String cvnCodeRaw,
           java.lang.String eciRaw,
           java.lang.String eci,
           java.lang.String cavv,
           java.lang.String veresEnrolled,
           java.lang.String veresTimeStamp,
           java.lang.String paresStatus,
           java.lang.String paresTimeStamp,
           java.lang.String xid,
           com.cybersource.stub.VCCustomData customData) {
           this.creationTimeStamp = creationTimeStamp;
           this.alternateShippingAddressCountryCode = alternateShippingAddressCountryCode;
           this.alternateShippingAddressPostalCode = alternateShippingAddressPostalCode;
           this.vcAccountLoginName = vcAccountLoginName;
           this.vcAccountFirstName = vcAccountFirstName;
           this.vcAccountLastName = vcAccountLastName;
           this.vcAccountEncryptedID = vcAccountEncryptedID;
           this.vcAccountEmail = vcAccountEmail;
           this.vcAccountMobilePhoneNumber = vcAccountMobilePhoneNumber;
           this.merchantReferenceID = merchantReferenceID;
           this.subtotalAmount = subtotalAmount;
           this.shippingHandlingAmount = shippingHandlingAmount;
           this.taxAmount = taxAmount;
           this.discountAmount = discountAmount;
           this.giftWrapAmount = giftWrapAmount;
           this.uncategorizedAmount = uncategorizedAmount;
           this.totalPurchaseAmount = totalPurchaseAmount;
           this.walletReferenceID = walletReferenceID;
           this.promotionCode = promotionCode;
           this.paymentInstrumentID = paymentInstrumentID;
           this.cardVerificationStatus = cardVerificationStatus;
           this.issuerID = issuerID;
           this.paymentInstrumentNickName = paymentInstrumentNickName;
           this.nameOnCard = nameOnCard;
           this.cardType = cardType;
           this.cardGroup = cardGroup;
           this.cardArt = cardArt;
           this.riskAdvice = riskAdvice;
           this.riskScore = riskScore;
           this.riskAdditionalData = riskAdditionalData;
           this.avsCodeRaw = avsCodeRaw;
           this.cvnCodeRaw = cvnCodeRaw;
           this.eciRaw = eciRaw;
           this.eci = eci;
           this.cavv = cavv;
           this.veresEnrolled = veresEnrolled;
           this.veresTimeStamp = veresTimeStamp;
           this.paresStatus = paresStatus;
           this.paresTimeStamp = paresTimeStamp;
           this.xid = xid;
           this.customData = customData;
    }


    /**
     * Gets the creationTimeStamp value for this VCReply.
     * 
     * @return creationTimeStamp
     */
    public java.lang.String getCreationTimeStamp() {
        return creationTimeStamp;
    }


    /**
     * Sets the creationTimeStamp value for this VCReply.
     * 
     * @param creationTimeStamp
     */
    public void setCreationTimeStamp(java.lang.String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }


    /**
     * Gets the alternateShippingAddressCountryCode value for this VCReply.
     * 
     * @return alternateShippingAddressCountryCode
     */
    public java.lang.String getAlternateShippingAddressCountryCode() {
        return alternateShippingAddressCountryCode;
    }


    /**
     * Sets the alternateShippingAddressCountryCode value for this VCReply.
     * 
     * @param alternateShippingAddressCountryCode
     */
    public void setAlternateShippingAddressCountryCode(java.lang.String alternateShippingAddressCountryCode) {
        this.alternateShippingAddressCountryCode = alternateShippingAddressCountryCode;
    }


    /**
     * Gets the alternateShippingAddressPostalCode value for this VCReply.
     * 
     * @return alternateShippingAddressPostalCode
     */
    public java.lang.String getAlternateShippingAddressPostalCode() {
        return alternateShippingAddressPostalCode;
    }


    /**
     * Sets the alternateShippingAddressPostalCode value for this VCReply.
     * 
     * @param alternateShippingAddressPostalCode
     */
    public void setAlternateShippingAddressPostalCode(java.lang.String alternateShippingAddressPostalCode) {
        this.alternateShippingAddressPostalCode = alternateShippingAddressPostalCode;
    }


    /**
     * Gets the vcAccountLoginName value for this VCReply.
     * 
     * @return vcAccountLoginName
     */
    public java.lang.String getVcAccountLoginName() {
        return vcAccountLoginName;
    }


    /**
     * Sets the vcAccountLoginName value for this VCReply.
     * 
     * @param vcAccountLoginName
     */
    public void setVcAccountLoginName(java.lang.String vcAccountLoginName) {
        this.vcAccountLoginName = vcAccountLoginName;
    }


    /**
     * Gets the vcAccountFirstName value for this VCReply.
     * 
     * @return vcAccountFirstName
     */
    public java.lang.String getVcAccountFirstName() {
        return vcAccountFirstName;
    }


    /**
     * Sets the vcAccountFirstName value for this VCReply.
     * 
     * @param vcAccountFirstName
     */
    public void setVcAccountFirstName(java.lang.String vcAccountFirstName) {
        this.vcAccountFirstName = vcAccountFirstName;
    }


    /**
     * Gets the vcAccountLastName value for this VCReply.
     * 
     * @return vcAccountLastName
     */
    public java.lang.String getVcAccountLastName() {
        return vcAccountLastName;
    }


    /**
     * Sets the vcAccountLastName value for this VCReply.
     * 
     * @param vcAccountLastName
     */
    public void setVcAccountLastName(java.lang.String vcAccountLastName) {
        this.vcAccountLastName = vcAccountLastName;
    }


    /**
     * Gets the vcAccountEncryptedID value for this VCReply.
     * 
     * @return vcAccountEncryptedID
     */
    public java.lang.String getVcAccountEncryptedID() {
        return vcAccountEncryptedID;
    }


    /**
     * Sets the vcAccountEncryptedID value for this VCReply.
     * 
     * @param vcAccountEncryptedID
     */
    public void setVcAccountEncryptedID(java.lang.String vcAccountEncryptedID) {
        this.vcAccountEncryptedID = vcAccountEncryptedID;
    }


    /**
     * Gets the vcAccountEmail value for this VCReply.
     * 
     * @return vcAccountEmail
     */
    public java.lang.String getVcAccountEmail() {
        return vcAccountEmail;
    }


    /**
     * Sets the vcAccountEmail value for this VCReply.
     * 
     * @param vcAccountEmail
     */
    public void setVcAccountEmail(java.lang.String vcAccountEmail) {
        this.vcAccountEmail = vcAccountEmail;
    }


    /**
     * Gets the vcAccountMobilePhoneNumber value for this VCReply.
     * 
     * @return vcAccountMobilePhoneNumber
     */
    public java.lang.String getVcAccountMobilePhoneNumber() {
        return vcAccountMobilePhoneNumber;
    }


    /**
     * Sets the vcAccountMobilePhoneNumber value for this VCReply.
     * 
     * @param vcAccountMobilePhoneNumber
     */
    public void setVcAccountMobilePhoneNumber(java.lang.String vcAccountMobilePhoneNumber) {
        this.vcAccountMobilePhoneNumber = vcAccountMobilePhoneNumber;
    }


    /**
     * Gets the merchantReferenceID value for this VCReply.
     * 
     * @return merchantReferenceID
     */
    public java.lang.String getMerchantReferenceID() {
        return merchantReferenceID;
    }


    /**
     * Sets the merchantReferenceID value for this VCReply.
     * 
     * @param merchantReferenceID
     */
    public void setMerchantReferenceID(java.lang.String merchantReferenceID) {
        this.merchantReferenceID = merchantReferenceID;
    }


    /**
     * Gets the subtotalAmount value for this VCReply.
     * 
     * @return subtotalAmount
     */
    public java.lang.String getSubtotalAmount() {
        return subtotalAmount;
    }


    /**
     * Sets the subtotalAmount value for this VCReply.
     * 
     * @param subtotalAmount
     */
    public void setSubtotalAmount(java.lang.String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }


    /**
     * Gets the shippingHandlingAmount value for this VCReply.
     * 
     * @return shippingHandlingAmount
     */
    public java.lang.String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }


    /**
     * Sets the shippingHandlingAmount value for this VCReply.
     * 
     * @param shippingHandlingAmount
     */
    public void setShippingHandlingAmount(java.lang.String shippingHandlingAmount) {
        this.shippingHandlingAmount = shippingHandlingAmount;
    }


    /**
     * Gets the taxAmount value for this VCReply.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this VCReply.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the discountAmount value for this VCReply.
     * 
     * @return discountAmount
     */
    public java.lang.String getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this VCReply.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.String discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the giftWrapAmount value for this VCReply.
     * 
     * @return giftWrapAmount
     */
    public java.lang.String getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this VCReply.
     * 
     * @param giftWrapAmount
     */
    public void setGiftWrapAmount(java.lang.String giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the uncategorizedAmount value for this VCReply.
     * 
     * @return uncategorizedAmount
     */
    public java.lang.String getUncategorizedAmount() {
        return uncategorizedAmount;
    }


    /**
     * Sets the uncategorizedAmount value for this VCReply.
     * 
     * @param uncategorizedAmount
     */
    public void setUncategorizedAmount(java.lang.String uncategorizedAmount) {
        this.uncategorizedAmount = uncategorizedAmount;
    }


    /**
     * Gets the totalPurchaseAmount value for this VCReply.
     * 
     * @return totalPurchaseAmount
     */
    public java.lang.String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }


    /**
     * Sets the totalPurchaseAmount value for this VCReply.
     * 
     * @param totalPurchaseAmount
     */
    public void setTotalPurchaseAmount(java.lang.String totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }


    /**
     * Gets the walletReferenceID value for this VCReply.
     * 
     * @return walletReferenceID
     */
    public java.lang.String getWalletReferenceID() {
        return walletReferenceID;
    }


    /**
     * Sets the walletReferenceID value for this VCReply.
     * 
     * @param walletReferenceID
     */
    public void setWalletReferenceID(java.lang.String walletReferenceID) {
        this.walletReferenceID = walletReferenceID;
    }


    /**
     * Gets the promotionCode value for this VCReply.
     * 
     * @return promotionCode
     */
    public java.lang.String getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this VCReply.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(java.lang.String promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the paymentInstrumentID value for this VCReply.
     * 
     * @return paymentInstrumentID
     */
    public java.lang.String getPaymentInstrumentID() {
        return paymentInstrumentID;
    }


    /**
     * Sets the paymentInstrumentID value for this VCReply.
     * 
     * @param paymentInstrumentID
     */
    public void setPaymentInstrumentID(java.lang.String paymentInstrumentID) {
        this.paymentInstrumentID = paymentInstrumentID;
    }


    /**
     * Gets the cardVerificationStatus value for this VCReply.
     * 
     * @return cardVerificationStatus
     */
    public java.lang.String getCardVerificationStatus() {
        return cardVerificationStatus;
    }


    /**
     * Sets the cardVerificationStatus value for this VCReply.
     * 
     * @param cardVerificationStatus
     */
    public void setCardVerificationStatus(java.lang.String cardVerificationStatus) {
        this.cardVerificationStatus = cardVerificationStatus;
    }


    /**
     * Gets the issuerID value for this VCReply.
     * 
     * @return issuerID
     */
    public java.lang.String getIssuerID() {
        return issuerID;
    }


    /**
     * Sets the issuerID value for this VCReply.
     * 
     * @param issuerID
     */
    public void setIssuerID(java.lang.String issuerID) {
        this.issuerID = issuerID;
    }


    /**
     * Gets the paymentInstrumentNickName value for this VCReply.
     * 
     * @return paymentInstrumentNickName
     */
    public java.lang.String getPaymentInstrumentNickName() {
        return paymentInstrumentNickName;
    }


    /**
     * Sets the paymentInstrumentNickName value for this VCReply.
     * 
     * @param paymentInstrumentNickName
     */
    public void setPaymentInstrumentNickName(java.lang.String paymentInstrumentNickName) {
        this.paymentInstrumentNickName = paymentInstrumentNickName;
    }


    /**
     * Gets the nameOnCard value for this VCReply.
     * 
     * @return nameOnCard
     */
    public java.lang.String getNameOnCard() {
        return nameOnCard;
    }


    /**
     * Sets the nameOnCard value for this VCReply.
     * 
     * @param nameOnCard
     */
    public void setNameOnCard(java.lang.String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    /**
     * Gets the cardType value for this VCReply.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this VCReply.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardGroup value for this VCReply.
     * 
     * @return cardGroup
     */
    public java.lang.String getCardGroup() {
        return cardGroup;
    }


    /**
     * Sets the cardGroup value for this VCReply.
     * 
     * @param cardGroup
     */
    public void setCardGroup(java.lang.String cardGroup) {
        this.cardGroup = cardGroup;
    }


    /**
     * Gets the cardArt value for this VCReply.
     * 
     * @return cardArt
     */
    public com.cybersource.stub.VCCardArt getCardArt() {
        return cardArt;
    }


    /**
     * Sets the cardArt value for this VCReply.
     * 
     * @param cardArt
     */
    public void setCardArt(com.cybersource.stub.VCCardArt cardArt) {
        this.cardArt = cardArt;
    }


    /**
     * Gets the riskAdvice value for this VCReply.
     * 
     * @return riskAdvice
     */
    public java.lang.String getRiskAdvice() {
        return riskAdvice;
    }


    /**
     * Sets the riskAdvice value for this VCReply.
     * 
     * @param riskAdvice
     */
    public void setRiskAdvice(java.lang.String riskAdvice) {
        this.riskAdvice = riskAdvice;
    }


    /**
     * Gets the riskScore value for this VCReply.
     * 
     * @return riskScore
     */
    public java.lang.String getRiskScore() {
        return riskScore;
    }


    /**
     * Sets the riskScore value for this VCReply.
     * 
     * @param riskScore
     */
    public void setRiskScore(java.lang.String riskScore) {
        this.riskScore = riskScore;
    }


    /**
     * Gets the riskAdditionalData value for this VCReply.
     * 
     * @return riskAdditionalData
     */
    public java.lang.String getRiskAdditionalData() {
        return riskAdditionalData;
    }


    /**
     * Sets the riskAdditionalData value for this VCReply.
     * 
     * @param riskAdditionalData
     */
    public void setRiskAdditionalData(java.lang.String riskAdditionalData) {
        this.riskAdditionalData = riskAdditionalData;
    }


    /**
     * Gets the avsCodeRaw value for this VCReply.
     * 
     * @return avsCodeRaw
     */
    public java.lang.String getAvsCodeRaw() {
        return avsCodeRaw;
    }


    /**
     * Sets the avsCodeRaw value for this VCReply.
     * 
     * @param avsCodeRaw
     */
    public void setAvsCodeRaw(java.lang.String avsCodeRaw) {
        this.avsCodeRaw = avsCodeRaw;
    }


    /**
     * Gets the cvnCodeRaw value for this VCReply.
     * 
     * @return cvnCodeRaw
     */
    public java.lang.String getCvnCodeRaw() {
        return cvnCodeRaw;
    }


    /**
     * Sets the cvnCodeRaw value for this VCReply.
     * 
     * @param cvnCodeRaw
     */
    public void setCvnCodeRaw(java.lang.String cvnCodeRaw) {
        this.cvnCodeRaw = cvnCodeRaw;
    }


    /**
     * Gets the eciRaw value for this VCReply.
     * 
     * @return eciRaw
     */
    public java.lang.String getEciRaw() {
        return eciRaw;
    }


    /**
     * Sets the eciRaw value for this VCReply.
     * 
     * @param eciRaw
     */
    public void setEciRaw(java.lang.String eciRaw) {
        this.eciRaw = eciRaw;
    }


    /**
     * Gets the eci value for this VCReply.
     * 
     * @return eci
     */
    public java.lang.String getEci() {
        return eci;
    }


    /**
     * Sets the eci value for this VCReply.
     * 
     * @param eci
     */
    public void setEci(java.lang.String eci) {
        this.eci = eci;
    }


    /**
     * Gets the cavv value for this VCReply.
     * 
     * @return cavv
     */
    public java.lang.String getCavv() {
        return cavv;
    }


    /**
     * Sets the cavv value for this VCReply.
     * 
     * @param cavv
     */
    public void setCavv(java.lang.String cavv) {
        this.cavv = cavv;
    }


    /**
     * Gets the veresEnrolled value for this VCReply.
     * 
     * @return veresEnrolled
     */
    public java.lang.String getVeresEnrolled() {
        return veresEnrolled;
    }


    /**
     * Sets the veresEnrolled value for this VCReply.
     * 
     * @param veresEnrolled
     */
    public void setVeresEnrolled(java.lang.String veresEnrolled) {
        this.veresEnrolled = veresEnrolled;
    }


    /**
     * Gets the veresTimeStamp value for this VCReply.
     * 
     * @return veresTimeStamp
     */
    public java.lang.String getVeresTimeStamp() {
        return veresTimeStamp;
    }


    /**
     * Sets the veresTimeStamp value for this VCReply.
     * 
     * @param veresTimeStamp
     */
    public void setVeresTimeStamp(java.lang.String veresTimeStamp) {
        this.veresTimeStamp = veresTimeStamp;
    }


    /**
     * Gets the paresStatus value for this VCReply.
     * 
     * @return paresStatus
     */
    public java.lang.String getParesStatus() {
        return paresStatus;
    }


    /**
     * Sets the paresStatus value for this VCReply.
     * 
     * @param paresStatus
     */
    public void setParesStatus(java.lang.String paresStatus) {
        this.paresStatus = paresStatus;
    }


    /**
     * Gets the paresTimeStamp value for this VCReply.
     * 
     * @return paresTimeStamp
     */
    public java.lang.String getParesTimeStamp() {
        return paresTimeStamp;
    }


    /**
     * Sets the paresTimeStamp value for this VCReply.
     * 
     * @param paresTimeStamp
     */
    public void setParesTimeStamp(java.lang.String paresTimeStamp) {
        this.paresTimeStamp = paresTimeStamp;
    }


    /**
     * Gets the xid value for this VCReply.
     * 
     * @return xid
     */
    public java.lang.String getXid() {
        return xid;
    }


    /**
     * Sets the xid value for this VCReply.
     * 
     * @param xid
     */
    public void setXid(java.lang.String xid) {
        this.xid = xid;
    }


    /**
     * Gets the customData value for this VCReply.
     * 
     * @return customData
     */
    public com.cybersource.stub.VCCustomData getCustomData() {
        return customData;
    }


    /**
     * Sets the customData value for this VCReply.
     * 
     * @param customData
     */
    public void setCustomData(com.cybersource.stub.VCCustomData customData) {
        this.customData = customData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VCReply)) return false;
        VCReply other = (VCReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationTimeStamp==null && other.getCreationTimeStamp()==null) || 
             (this.creationTimeStamp!=null &&
              this.creationTimeStamp.equals(other.getCreationTimeStamp()))) &&
            ((this.alternateShippingAddressCountryCode==null && other.getAlternateShippingAddressCountryCode()==null) || 
             (this.alternateShippingAddressCountryCode!=null &&
              this.alternateShippingAddressCountryCode.equals(other.getAlternateShippingAddressCountryCode()))) &&
            ((this.alternateShippingAddressPostalCode==null && other.getAlternateShippingAddressPostalCode()==null) || 
             (this.alternateShippingAddressPostalCode!=null &&
              this.alternateShippingAddressPostalCode.equals(other.getAlternateShippingAddressPostalCode()))) &&
            ((this.vcAccountLoginName==null && other.getVcAccountLoginName()==null) || 
             (this.vcAccountLoginName!=null &&
              this.vcAccountLoginName.equals(other.getVcAccountLoginName()))) &&
            ((this.vcAccountFirstName==null && other.getVcAccountFirstName()==null) || 
             (this.vcAccountFirstName!=null &&
              this.vcAccountFirstName.equals(other.getVcAccountFirstName()))) &&
            ((this.vcAccountLastName==null && other.getVcAccountLastName()==null) || 
             (this.vcAccountLastName!=null &&
              this.vcAccountLastName.equals(other.getVcAccountLastName()))) &&
            ((this.vcAccountEncryptedID==null && other.getVcAccountEncryptedID()==null) || 
             (this.vcAccountEncryptedID!=null &&
              this.vcAccountEncryptedID.equals(other.getVcAccountEncryptedID()))) &&
            ((this.vcAccountEmail==null && other.getVcAccountEmail()==null) || 
             (this.vcAccountEmail!=null &&
              this.vcAccountEmail.equals(other.getVcAccountEmail()))) &&
            ((this.vcAccountMobilePhoneNumber==null && other.getVcAccountMobilePhoneNumber()==null) || 
             (this.vcAccountMobilePhoneNumber!=null &&
              this.vcAccountMobilePhoneNumber.equals(other.getVcAccountMobilePhoneNumber()))) &&
            ((this.merchantReferenceID==null && other.getMerchantReferenceID()==null) || 
             (this.merchantReferenceID!=null &&
              this.merchantReferenceID.equals(other.getMerchantReferenceID()))) &&
            ((this.subtotalAmount==null && other.getSubtotalAmount()==null) || 
             (this.subtotalAmount!=null &&
              this.subtotalAmount.equals(other.getSubtotalAmount()))) &&
            ((this.shippingHandlingAmount==null && other.getShippingHandlingAmount()==null) || 
             (this.shippingHandlingAmount!=null &&
              this.shippingHandlingAmount.equals(other.getShippingHandlingAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.uncategorizedAmount==null && other.getUncategorizedAmount()==null) || 
             (this.uncategorizedAmount!=null &&
              this.uncategorizedAmount.equals(other.getUncategorizedAmount()))) &&
            ((this.totalPurchaseAmount==null && other.getTotalPurchaseAmount()==null) || 
             (this.totalPurchaseAmount!=null &&
              this.totalPurchaseAmount.equals(other.getTotalPurchaseAmount()))) &&
            ((this.walletReferenceID==null && other.getWalletReferenceID()==null) || 
             (this.walletReferenceID!=null &&
              this.walletReferenceID.equals(other.getWalletReferenceID()))) &&
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.paymentInstrumentID==null && other.getPaymentInstrumentID()==null) || 
             (this.paymentInstrumentID!=null &&
              this.paymentInstrumentID.equals(other.getPaymentInstrumentID()))) &&
            ((this.cardVerificationStatus==null && other.getCardVerificationStatus()==null) || 
             (this.cardVerificationStatus!=null &&
              this.cardVerificationStatus.equals(other.getCardVerificationStatus()))) &&
            ((this.issuerID==null && other.getIssuerID()==null) || 
             (this.issuerID!=null &&
              this.issuerID.equals(other.getIssuerID()))) &&
            ((this.paymentInstrumentNickName==null && other.getPaymentInstrumentNickName()==null) || 
             (this.paymentInstrumentNickName!=null &&
              this.paymentInstrumentNickName.equals(other.getPaymentInstrumentNickName()))) &&
            ((this.nameOnCard==null && other.getNameOnCard()==null) || 
             (this.nameOnCard!=null &&
              this.nameOnCard.equals(other.getNameOnCard()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardGroup==null && other.getCardGroup()==null) || 
             (this.cardGroup!=null &&
              this.cardGroup.equals(other.getCardGroup()))) &&
            ((this.cardArt==null && other.getCardArt()==null) || 
             (this.cardArt!=null &&
              this.cardArt.equals(other.getCardArt()))) &&
            ((this.riskAdvice==null && other.getRiskAdvice()==null) || 
             (this.riskAdvice!=null &&
              this.riskAdvice.equals(other.getRiskAdvice()))) &&
            ((this.riskScore==null && other.getRiskScore()==null) || 
             (this.riskScore!=null &&
              this.riskScore.equals(other.getRiskScore()))) &&
            ((this.riskAdditionalData==null && other.getRiskAdditionalData()==null) || 
             (this.riskAdditionalData!=null &&
              this.riskAdditionalData.equals(other.getRiskAdditionalData()))) &&
            ((this.avsCodeRaw==null && other.getAvsCodeRaw()==null) || 
             (this.avsCodeRaw!=null &&
              this.avsCodeRaw.equals(other.getAvsCodeRaw()))) &&
            ((this.cvnCodeRaw==null && other.getCvnCodeRaw()==null) || 
             (this.cvnCodeRaw!=null &&
              this.cvnCodeRaw.equals(other.getCvnCodeRaw()))) &&
            ((this.eciRaw==null && other.getEciRaw()==null) || 
             (this.eciRaw!=null &&
              this.eciRaw.equals(other.getEciRaw()))) &&
            ((this.eci==null && other.getEci()==null) || 
             (this.eci!=null &&
              this.eci.equals(other.getEci()))) &&
            ((this.cavv==null && other.getCavv()==null) || 
             (this.cavv!=null &&
              this.cavv.equals(other.getCavv()))) &&
            ((this.veresEnrolled==null && other.getVeresEnrolled()==null) || 
             (this.veresEnrolled!=null &&
              this.veresEnrolled.equals(other.getVeresEnrolled()))) &&
            ((this.veresTimeStamp==null && other.getVeresTimeStamp()==null) || 
             (this.veresTimeStamp!=null &&
              this.veresTimeStamp.equals(other.getVeresTimeStamp()))) &&
            ((this.paresStatus==null && other.getParesStatus()==null) || 
             (this.paresStatus!=null &&
              this.paresStatus.equals(other.getParesStatus()))) &&
            ((this.paresTimeStamp==null && other.getParesTimeStamp()==null) || 
             (this.paresTimeStamp!=null &&
              this.paresTimeStamp.equals(other.getParesTimeStamp()))) &&
            ((this.xid==null && other.getXid()==null) || 
             (this.xid!=null &&
              this.xid.equals(other.getXid()))) &&
            ((this.customData==null && other.getCustomData()==null) || 
             (this.customData!=null &&
              this.customData.equals(other.getCustomData())));
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
        if (getCreationTimeStamp() != null) {
            _hashCode += getCreationTimeStamp().hashCode();
        }
        if (getAlternateShippingAddressCountryCode() != null) {
            _hashCode += getAlternateShippingAddressCountryCode().hashCode();
        }
        if (getAlternateShippingAddressPostalCode() != null) {
            _hashCode += getAlternateShippingAddressPostalCode().hashCode();
        }
        if (getVcAccountLoginName() != null) {
            _hashCode += getVcAccountLoginName().hashCode();
        }
        if (getVcAccountFirstName() != null) {
            _hashCode += getVcAccountFirstName().hashCode();
        }
        if (getVcAccountLastName() != null) {
            _hashCode += getVcAccountLastName().hashCode();
        }
        if (getVcAccountEncryptedID() != null) {
            _hashCode += getVcAccountEncryptedID().hashCode();
        }
        if (getVcAccountEmail() != null) {
            _hashCode += getVcAccountEmail().hashCode();
        }
        if (getVcAccountMobilePhoneNumber() != null) {
            _hashCode += getVcAccountMobilePhoneNumber().hashCode();
        }
        if (getMerchantReferenceID() != null) {
            _hashCode += getMerchantReferenceID().hashCode();
        }
        if (getSubtotalAmount() != null) {
            _hashCode += getSubtotalAmount().hashCode();
        }
        if (getShippingHandlingAmount() != null) {
            _hashCode += getShippingHandlingAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getUncategorizedAmount() != null) {
            _hashCode += getUncategorizedAmount().hashCode();
        }
        if (getTotalPurchaseAmount() != null) {
            _hashCode += getTotalPurchaseAmount().hashCode();
        }
        if (getWalletReferenceID() != null) {
            _hashCode += getWalletReferenceID().hashCode();
        }
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getPaymentInstrumentID() != null) {
            _hashCode += getPaymentInstrumentID().hashCode();
        }
        if (getCardVerificationStatus() != null) {
            _hashCode += getCardVerificationStatus().hashCode();
        }
        if (getIssuerID() != null) {
            _hashCode += getIssuerID().hashCode();
        }
        if (getPaymentInstrumentNickName() != null) {
            _hashCode += getPaymentInstrumentNickName().hashCode();
        }
        if (getNameOnCard() != null) {
            _hashCode += getNameOnCard().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardGroup() != null) {
            _hashCode += getCardGroup().hashCode();
        }
        if (getCardArt() != null) {
            _hashCode += getCardArt().hashCode();
        }
        if (getRiskAdvice() != null) {
            _hashCode += getRiskAdvice().hashCode();
        }
        if (getRiskScore() != null) {
            _hashCode += getRiskScore().hashCode();
        }
        if (getRiskAdditionalData() != null) {
            _hashCode += getRiskAdditionalData().hashCode();
        }
        if (getAvsCodeRaw() != null) {
            _hashCode += getAvsCodeRaw().hashCode();
        }
        if (getCvnCodeRaw() != null) {
            _hashCode += getCvnCodeRaw().hashCode();
        }
        if (getEciRaw() != null) {
            _hashCode += getEciRaw().hashCode();
        }
        if (getEci() != null) {
            _hashCode += getEci().hashCode();
        }
        if (getCavv() != null) {
            _hashCode += getCavv().hashCode();
        }
        if (getVeresEnrolled() != null) {
            _hashCode += getVeresEnrolled().hashCode();
        }
        if (getVeresTimeStamp() != null) {
            _hashCode += getVeresTimeStamp().hashCode();
        }
        if (getParesStatus() != null) {
            _hashCode += getParesStatus().hashCode();
        }
        if (getParesTimeStamp() != null) {
            _hashCode += getParesTimeStamp().hashCode();
        }
        if (getXid() != null) {
            _hashCode += getXid().hashCode();
        }
        if (getCustomData() != null) {
            _hashCode += getCustomData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VCReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "creationTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateShippingAddressCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateShippingAddressCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateShippingAddressPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateShippingAddressPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountLoginName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountLoginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountEncryptedID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountEncryptedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcAccountMobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcAccountMobilePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subtotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingHandlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shippingHandlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "giftWrapAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncategorizedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "uncategorizedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPurchaseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalPurchaseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "walletReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "promotionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentInstrumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardVerificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardVerificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentNickName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentInstrumentNickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "nameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardType"));
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
        elemField.setFieldName("cardArt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCCardArt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskAdditionalData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskAdditionalData"));
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
        elemField.setFieldName("cvnCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cvnCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eciRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eciRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eci");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cavv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cavv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veresEnrolled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "veresEnrolled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veresTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "veresTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paresStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paresStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paresTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paresTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "xid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCCustomData"));
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
