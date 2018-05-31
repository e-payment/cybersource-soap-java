/**
 * APReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APReply  implements java.io.Serializable {
    private java.lang.String orderID;

    private java.lang.String cardGroup;

    private java.lang.String cardType;

    private java.lang.String cardNumberSuffix;

    private java.lang.String cardExpirationMonth;

    private java.lang.String cardExpirationYear;

    private java.lang.String avsCodeRaw;

    private java.lang.String purchaseID;

    private java.lang.String productID;

    private java.lang.String productDescription;

    private java.lang.String shippingAmount;

    private java.lang.String handlingAmount;

    private java.lang.String shippingHandlingAmount;

    private java.lang.String additionalAmount;

    private java.lang.String taxAmount;

    private java.lang.String subtotalAmount;

    private java.lang.String totalPurchaseAmount;

    private java.lang.String giftWrapAmount;

    private java.lang.String discountAmount;

    private java.lang.String cardNumberPrefix;

    private java.lang.String riskIndicator;

    private java.lang.String merchantUUID;

    private java.lang.String merchantSiteID;

    private java.lang.String transactionExpirationDate;

    private com.cybersource.stub.SellerProtection sellerProtection;

    private java.lang.String processorFraudDecision;

    private java.lang.String processorFraudDecisionReason;

    private java.lang.String customerID;

    private java.lang.String billingAgreementID;

    private java.lang.String payerID;

    private java.lang.String fundingSource;

    public APReply() {
    }

    public APReply(
           java.lang.String orderID,
           java.lang.String cardGroup,
           java.lang.String cardType,
           java.lang.String cardNumberSuffix,
           java.lang.String cardExpirationMonth,
           java.lang.String cardExpirationYear,
           java.lang.String avsCodeRaw,
           java.lang.String purchaseID,
           java.lang.String productID,
           java.lang.String productDescription,
           java.lang.String shippingAmount,
           java.lang.String handlingAmount,
           java.lang.String shippingHandlingAmount,
           java.lang.String additionalAmount,
           java.lang.String taxAmount,
           java.lang.String subtotalAmount,
           java.lang.String totalPurchaseAmount,
           java.lang.String giftWrapAmount,
           java.lang.String discountAmount,
           java.lang.String cardNumberPrefix,
           java.lang.String riskIndicator,
           java.lang.String merchantUUID,
           java.lang.String merchantSiteID,
           java.lang.String transactionExpirationDate,
           com.cybersource.stub.SellerProtection sellerProtection,
           java.lang.String processorFraudDecision,
           java.lang.String processorFraudDecisionReason,
           java.lang.String customerID,
           java.lang.String billingAgreementID,
           java.lang.String payerID,
           java.lang.String fundingSource) {
           this.orderID = orderID;
           this.cardGroup = cardGroup;
           this.cardType = cardType;
           this.cardNumberSuffix = cardNumberSuffix;
           this.cardExpirationMonth = cardExpirationMonth;
           this.cardExpirationYear = cardExpirationYear;
           this.avsCodeRaw = avsCodeRaw;
           this.purchaseID = purchaseID;
           this.productID = productID;
           this.productDescription = productDescription;
           this.shippingAmount = shippingAmount;
           this.handlingAmount = handlingAmount;
           this.shippingHandlingAmount = shippingHandlingAmount;
           this.additionalAmount = additionalAmount;
           this.taxAmount = taxAmount;
           this.subtotalAmount = subtotalAmount;
           this.totalPurchaseAmount = totalPurchaseAmount;
           this.giftWrapAmount = giftWrapAmount;
           this.discountAmount = discountAmount;
           this.cardNumberPrefix = cardNumberPrefix;
           this.riskIndicator = riskIndicator;
           this.merchantUUID = merchantUUID;
           this.merchantSiteID = merchantSiteID;
           this.transactionExpirationDate = transactionExpirationDate;
           this.sellerProtection = sellerProtection;
           this.processorFraudDecision = processorFraudDecision;
           this.processorFraudDecisionReason = processorFraudDecisionReason;
           this.customerID = customerID;
           this.billingAgreementID = billingAgreementID;
           this.payerID = payerID;
           this.fundingSource = fundingSource;
    }


    /**
     * Gets the orderID value for this APReply.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this APReply.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the cardGroup value for this APReply.
     * 
     * @return cardGroup
     */
    public java.lang.String getCardGroup() {
        return cardGroup;
    }


    /**
     * Sets the cardGroup value for this APReply.
     * 
     * @param cardGroup
     */
    public void setCardGroup(java.lang.String cardGroup) {
        this.cardGroup = cardGroup;
    }


    /**
     * Gets the cardType value for this APReply.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this APReply.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardNumberSuffix value for this APReply.
     * 
     * @return cardNumberSuffix
     */
    public java.lang.String getCardNumberSuffix() {
        return cardNumberSuffix;
    }


    /**
     * Sets the cardNumberSuffix value for this APReply.
     * 
     * @param cardNumberSuffix
     */
    public void setCardNumberSuffix(java.lang.String cardNumberSuffix) {
        this.cardNumberSuffix = cardNumberSuffix;
    }


    /**
     * Gets the cardExpirationMonth value for this APReply.
     * 
     * @return cardExpirationMonth
     */
    public java.lang.String getCardExpirationMonth() {
        return cardExpirationMonth;
    }


    /**
     * Sets the cardExpirationMonth value for this APReply.
     * 
     * @param cardExpirationMonth
     */
    public void setCardExpirationMonth(java.lang.String cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }


    /**
     * Gets the cardExpirationYear value for this APReply.
     * 
     * @return cardExpirationYear
     */
    public java.lang.String getCardExpirationYear() {
        return cardExpirationYear;
    }


    /**
     * Sets the cardExpirationYear value for this APReply.
     * 
     * @param cardExpirationYear
     */
    public void setCardExpirationYear(java.lang.String cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }


    /**
     * Gets the avsCodeRaw value for this APReply.
     * 
     * @return avsCodeRaw
     */
    public java.lang.String getAvsCodeRaw() {
        return avsCodeRaw;
    }


    /**
     * Sets the avsCodeRaw value for this APReply.
     * 
     * @param avsCodeRaw
     */
    public void setAvsCodeRaw(java.lang.String avsCodeRaw) {
        this.avsCodeRaw = avsCodeRaw;
    }


    /**
     * Gets the purchaseID value for this APReply.
     * 
     * @return purchaseID
     */
    public java.lang.String getPurchaseID() {
        return purchaseID;
    }


    /**
     * Sets the purchaseID value for this APReply.
     * 
     * @param purchaseID
     */
    public void setPurchaseID(java.lang.String purchaseID) {
        this.purchaseID = purchaseID;
    }


    /**
     * Gets the productID value for this APReply.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this APReply.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the productDescription value for this APReply.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this APReply.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the shippingAmount value for this APReply.
     * 
     * @return shippingAmount
     */
    public java.lang.String getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this APReply.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(java.lang.String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the handlingAmount value for this APReply.
     * 
     * @return handlingAmount
     */
    public java.lang.String getHandlingAmount() {
        return handlingAmount;
    }


    /**
     * Sets the handlingAmount value for this APReply.
     * 
     * @param handlingAmount
     */
    public void setHandlingAmount(java.lang.String handlingAmount) {
        this.handlingAmount = handlingAmount;
    }


    /**
     * Gets the shippingHandlingAmount value for this APReply.
     * 
     * @return shippingHandlingAmount
     */
    public java.lang.String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }


    /**
     * Sets the shippingHandlingAmount value for this APReply.
     * 
     * @param shippingHandlingAmount
     */
    public void setShippingHandlingAmount(java.lang.String shippingHandlingAmount) {
        this.shippingHandlingAmount = shippingHandlingAmount;
    }


    /**
     * Gets the additionalAmount value for this APReply.
     * 
     * @return additionalAmount
     */
    public java.lang.String getAdditionalAmount() {
        return additionalAmount;
    }


    /**
     * Sets the additionalAmount value for this APReply.
     * 
     * @param additionalAmount
     */
    public void setAdditionalAmount(java.lang.String additionalAmount) {
        this.additionalAmount = additionalAmount;
    }


    /**
     * Gets the taxAmount value for this APReply.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this APReply.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the subtotalAmount value for this APReply.
     * 
     * @return subtotalAmount
     */
    public java.lang.String getSubtotalAmount() {
        return subtotalAmount;
    }


    /**
     * Sets the subtotalAmount value for this APReply.
     * 
     * @param subtotalAmount
     */
    public void setSubtotalAmount(java.lang.String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }


    /**
     * Gets the totalPurchaseAmount value for this APReply.
     * 
     * @return totalPurchaseAmount
     */
    public java.lang.String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }


    /**
     * Sets the totalPurchaseAmount value for this APReply.
     * 
     * @param totalPurchaseAmount
     */
    public void setTotalPurchaseAmount(java.lang.String totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }


    /**
     * Gets the giftWrapAmount value for this APReply.
     * 
     * @return giftWrapAmount
     */
    public java.lang.String getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this APReply.
     * 
     * @param giftWrapAmount
     */
    public void setGiftWrapAmount(java.lang.String giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the discountAmount value for this APReply.
     * 
     * @return discountAmount
     */
    public java.lang.String getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this APReply.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.String discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the cardNumberPrefix value for this APReply.
     * 
     * @return cardNumberPrefix
     */
    public java.lang.String getCardNumberPrefix() {
        return cardNumberPrefix;
    }


    /**
     * Sets the cardNumberPrefix value for this APReply.
     * 
     * @param cardNumberPrefix
     */
    public void setCardNumberPrefix(java.lang.String cardNumberPrefix) {
        this.cardNumberPrefix = cardNumberPrefix;
    }


    /**
     * Gets the riskIndicator value for this APReply.
     * 
     * @return riskIndicator
     */
    public java.lang.String getRiskIndicator() {
        return riskIndicator;
    }


    /**
     * Sets the riskIndicator value for this APReply.
     * 
     * @param riskIndicator
     */
    public void setRiskIndicator(java.lang.String riskIndicator) {
        this.riskIndicator = riskIndicator;
    }


    /**
     * Gets the merchantUUID value for this APReply.
     * 
     * @return merchantUUID
     */
    public java.lang.String getMerchantUUID() {
        return merchantUUID;
    }


    /**
     * Sets the merchantUUID value for this APReply.
     * 
     * @param merchantUUID
     */
    public void setMerchantUUID(java.lang.String merchantUUID) {
        this.merchantUUID = merchantUUID;
    }


    /**
     * Gets the merchantSiteID value for this APReply.
     * 
     * @return merchantSiteID
     */
    public java.lang.String getMerchantSiteID() {
        return merchantSiteID;
    }


    /**
     * Sets the merchantSiteID value for this APReply.
     * 
     * @param merchantSiteID
     */
    public void setMerchantSiteID(java.lang.String merchantSiteID) {
        this.merchantSiteID = merchantSiteID;
    }


    /**
     * Gets the transactionExpirationDate value for this APReply.
     * 
     * @return transactionExpirationDate
     */
    public java.lang.String getTransactionExpirationDate() {
        return transactionExpirationDate;
    }


    /**
     * Sets the transactionExpirationDate value for this APReply.
     * 
     * @param transactionExpirationDate
     */
    public void setTransactionExpirationDate(java.lang.String transactionExpirationDate) {
        this.transactionExpirationDate = transactionExpirationDate;
    }


    /**
     * Gets the sellerProtection value for this APReply.
     * 
     * @return sellerProtection
     */
    public com.cybersource.stub.SellerProtection getSellerProtection() {
        return sellerProtection;
    }


    /**
     * Sets the sellerProtection value for this APReply.
     * 
     * @param sellerProtection
     */
    public void setSellerProtection(com.cybersource.stub.SellerProtection sellerProtection) {
        this.sellerProtection = sellerProtection;
    }


    /**
     * Gets the processorFraudDecision value for this APReply.
     * 
     * @return processorFraudDecision
     */
    public java.lang.String getProcessorFraudDecision() {
        return processorFraudDecision;
    }


    /**
     * Sets the processorFraudDecision value for this APReply.
     * 
     * @param processorFraudDecision
     */
    public void setProcessorFraudDecision(java.lang.String processorFraudDecision) {
        this.processorFraudDecision = processorFraudDecision;
    }


    /**
     * Gets the processorFraudDecisionReason value for this APReply.
     * 
     * @return processorFraudDecisionReason
     */
    public java.lang.String getProcessorFraudDecisionReason() {
        return processorFraudDecisionReason;
    }


    /**
     * Sets the processorFraudDecisionReason value for this APReply.
     * 
     * @param processorFraudDecisionReason
     */
    public void setProcessorFraudDecisionReason(java.lang.String processorFraudDecisionReason) {
        this.processorFraudDecisionReason = processorFraudDecisionReason;
    }


    /**
     * Gets the customerID value for this APReply.
     * 
     * @return customerID
     */
    public java.lang.String getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this APReply.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.String customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the billingAgreementID value for this APReply.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this APReply.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the payerID value for this APReply.
     * 
     * @return payerID
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this APReply.
     * 
     * @param payerID
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }


    /**
     * Gets the fundingSource value for this APReply.
     * 
     * @return fundingSource
     */
    public java.lang.String getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this APReply.
     * 
     * @param fundingSource
     */
    public void setFundingSource(java.lang.String fundingSource) {
        this.fundingSource = fundingSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APReply)) return false;
        APReply other = (APReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.cardGroup==null && other.getCardGroup()==null) || 
             (this.cardGroup!=null &&
              this.cardGroup.equals(other.getCardGroup()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardNumberSuffix==null && other.getCardNumberSuffix()==null) || 
             (this.cardNumberSuffix!=null &&
              this.cardNumberSuffix.equals(other.getCardNumberSuffix()))) &&
            ((this.cardExpirationMonth==null && other.getCardExpirationMonth()==null) || 
             (this.cardExpirationMonth!=null &&
              this.cardExpirationMonth.equals(other.getCardExpirationMonth()))) &&
            ((this.cardExpirationYear==null && other.getCardExpirationYear()==null) || 
             (this.cardExpirationYear!=null &&
              this.cardExpirationYear.equals(other.getCardExpirationYear()))) &&
            ((this.avsCodeRaw==null && other.getAvsCodeRaw()==null) || 
             (this.avsCodeRaw!=null &&
              this.avsCodeRaw.equals(other.getAvsCodeRaw()))) &&
            ((this.purchaseID==null && other.getPurchaseID()==null) || 
             (this.purchaseID!=null &&
              this.purchaseID.equals(other.getPurchaseID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.handlingAmount==null && other.getHandlingAmount()==null) || 
             (this.handlingAmount!=null &&
              this.handlingAmount.equals(other.getHandlingAmount()))) &&
            ((this.shippingHandlingAmount==null && other.getShippingHandlingAmount()==null) || 
             (this.shippingHandlingAmount!=null &&
              this.shippingHandlingAmount.equals(other.getShippingHandlingAmount()))) &&
            ((this.additionalAmount==null && other.getAdditionalAmount()==null) || 
             (this.additionalAmount!=null &&
              this.additionalAmount.equals(other.getAdditionalAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.subtotalAmount==null && other.getSubtotalAmount()==null) || 
             (this.subtotalAmount!=null &&
              this.subtotalAmount.equals(other.getSubtotalAmount()))) &&
            ((this.totalPurchaseAmount==null && other.getTotalPurchaseAmount()==null) || 
             (this.totalPurchaseAmount!=null &&
              this.totalPurchaseAmount.equals(other.getTotalPurchaseAmount()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.cardNumberPrefix==null && other.getCardNumberPrefix()==null) || 
             (this.cardNumberPrefix!=null &&
              this.cardNumberPrefix.equals(other.getCardNumberPrefix()))) &&
            ((this.riskIndicator==null && other.getRiskIndicator()==null) || 
             (this.riskIndicator!=null &&
              this.riskIndicator.equals(other.getRiskIndicator()))) &&
            ((this.merchantUUID==null && other.getMerchantUUID()==null) || 
             (this.merchantUUID!=null &&
              this.merchantUUID.equals(other.getMerchantUUID()))) &&
            ((this.merchantSiteID==null && other.getMerchantSiteID()==null) || 
             (this.merchantSiteID!=null &&
              this.merchantSiteID.equals(other.getMerchantSiteID()))) &&
            ((this.transactionExpirationDate==null && other.getTransactionExpirationDate()==null) || 
             (this.transactionExpirationDate!=null &&
              this.transactionExpirationDate.equals(other.getTransactionExpirationDate()))) &&
            ((this.sellerProtection==null && other.getSellerProtection()==null) || 
             (this.sellerProtection!=null &&
              this.sellerProtection.equals(other.getSellerProtection()))) &&
            ((this.processorFraudDecision==null && other.getProcessorFraudDecision()==null) || 
             (this.processorFraudDecision!=null &&
              this.processorFraudDecision.equals(other.getProcessorFraudDecision()))) &&
            ((this.processorFraudDecisionReason==null && other.getProcessorFraudDecisionReason()==null) || 
             (this.processorFraudDecisionReason!=null &&
              this.processorFraudDecisionReason.equals(other.getProcessorFraudDecisionReason()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID()))) &&
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              this.fundingSource.equals(other.getFundingSource())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getCardGroup() != null) {
            _hashCode += getCardGroup().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardNumberSuffix() != null) {
            _hashCode += getCardNumberSuffix().hashCode();
        }
        if (getCardExpirationMonth() != null) {
            _hashCode += getCardExpirationMonth().hashCode();
        }
        if (getCardExpirationYear() != null) {
            _hashCode += getCardExpirationYear().hashCode();
        }
        if (getAvsCodeRaw() != null) {
            _hashCode += getAvsCodeRaw().hashCode();
        }
        if (getPurchaseID() != null) {
            _hashCode += getPurchaseID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getHandlingAmount() != null) {
            _hashCode += getHandlingAmount().hashCode();
        }
        if (getShippingHandlingAmount() != null) {
            _hashCode += getShippingHandlingAmount().hashCode();
        }
        if (getAdditionalAmount() != null) {
            _hashCode += getAdditionalAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getSubtotalAmount() != null) {
            _hashCode += getSubtotalAmount().hashCode();
        }
        if (getTotalPurchaseAmount() != null) {
            _hashCode += getTotalPurchaseAmount().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getCardNumberPrefix() != null) {
            _hashCode += getCardNumberPrefix().hashCode();
        }
        if (getRiskIndicator() != null) {
            _hashCode += getRiskIndicator().hashCode();
        }
        if (getMerchantUUID() != null) {
            _hashCode += getMerchantUUID().hashCode();
        }
        if (getMerchantSiteID() != null) {
            _hashCode += getMerchantSiteID().hashCode();
        }
        if (getTransactionExpirationDate() != null) {
            _hashCode += getTransactionExpirationDate().hashCode();
        }
        if (getSellerProtection() != null) {
            _hashCode += getSellerProtection().hashCode();
        }
        if (getProcessorFraudDecision() != null) {
            _hashCode += getProcessorFraudDecision().hashCode();
        }
        if (getProcessorFraudDecisionReason() != null) {
            _hashCode += getProcessorFraudDecisionReason().hashCode();
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        if (getFundingSource() != null) {
            _hashCode += getFundingSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderID"));
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
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumberSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardNumberSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardExpirationMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardExpirationYear"));
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
        elemField.setFieldName("purchaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "handlingAmount"));
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
        elemField.setFieldName("additionalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalAmount"));
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
        elemField.setFieldName("subtotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subtotalAmount"));
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
        elemField.setFieldName("giftWrapAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "giftWrapAmount"));
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
        elemField.setFieldName("cardNumberPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardNumberPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSiteID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantSiteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "SellerProtection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorFraudDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorFraudDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorFraudDecisionReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorFraudDecisionReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fundingSource"));
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
