/**
 * CCSaleReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCSaleReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String amount;

    private java.lang.String authorizationCode;

    private java.lang.String processorResponse;

    private java.lang.String avsCode;

    private java.lang.String avsCodeRaw;

    private java.lang.String cvCode;

    private java.lang.String cvCodeRaw;

    private java.lang.String cavvResponseCode;

    private java.lang.String cavvResponseCodeRaw;

    private java.lang.String cardGroup;

    private java.lang.String paymentNetworkTransactionID;

    private java.lang.String cardCategory;

    private java.lang.String accountBalance;

    private java.lang.String authorizedDateTime;

    private java.lang.String requestAmount;

    private java.lang.String reconciliationID;

    private java.lang.String accountBalanceCurrency;

    private java.lang.String accountBalanceSign;

    public CCSaleReply() {
    }

    public CCSaleReply(
           java.math.BigInteger reasonCode,
           java.lang.String amount,
           java.lang.String authorizationCode,
           java.lang.String processorResponse,
           java.lang.String avsCode,
           java.lang.String avsCodeRaw,
           java.lang.String cvCode,
           java.lang.String cvCodeRaw,
           java.lang.String cavvResponseCode,
           java.lang.String cavvResponseCodeRaw,
           java.lang.String cardGroup,
           java.lang.String paymentNetworkTransactionID,
           java.lang.String cardCategory,
           java.lang.String accountBalance,
           java.lang.String authorizedDateTime,
           java.lang.String requestAmount,
           java.lang.String reconciliationID,
           java.lang.String accountBalanceCurrency,
           java.lang.String accountBalanceSign) {
           this.reasonCode = reasonCode;
           this.amount = amount;
           this.authorizationCode = authorizationCode;
           this.processorResponse = processorResponse;
           this.avsCode = avsCode;
           this.avsCodeRaw = avsCodeRaw;
           this.cvCode = cvCode;
           this.cvCodeRaw = cvCodeRaw;
           this.cavvResponseCode = cavvResponseCode;
           this.cavvResponseCodeRaw = cavvResponseCodeRaw;
           this.cardGroup = cardGroup;
           this.paymentNetworkTransactionID = paymentNetworkTransactionID;
           this.cardCategory = cardCategory;
           this.accountBalance = accountBalance;
           this.authorizedDateTime = authorizedDateTime;
           this.requestAmount = requestAmount;
           this.reconciliationID = reconciliationID;
           this.accountBalanceCurrency = accountBalanceCurrency;
           this.accountBalanceSign = accountBalanceSign;
    }


    /**
     * Gets the reasonCode value for this CCSaleReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this CCSaleReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the amount value for this CCSaleReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CCSaleReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the authorizationCode value for this CCSaleReply.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this CCSaleReply.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the processorResponse value for this CCSaleReply.
     * 
     * @return processorResponse
     */
    public java.lang.String getProcessorResponse() {
        return processorResponse;
    }


    /**
     * Sets the processorResponse value for this CCSaleReply.
     * 
     * @param processorResponse
     */
    public void setProcessorResponse(java.lang.String processorResponse) {
        this.processorResponse = processorResponse;
    }


    /**
     * Gets the avsCode value for this CCSaleReply.
     * 
     * @return avsCode
     */
    public java.lang.String getAvsCode() {
        return avsCode;
    }


    /**
     * Sets the avsCode value for this CCSaleReply.
     * 
     * @param avsCode
     */
    public void setAvsCode(java.lang.String avsCode) {
        this.avsCode = avsCode;
    }


    /**
     * Gets the avsCodeRaw value for this CCSaleReply.
     * 
     * @return avsCodeRaw
     */
    public java.lang.String getAvsCodeRaw() {
        return avsCodeRaw;
    }


    /**
     * Sets the avsCodeRaw value for this CCSaleReply.
     * 
     * @param avsCodeRaw
     */
    public void setAvsCodeRaw(java.lang.String avsCodeRaw) {
        this.avsCodeRaw = avsCodeRaw;
    }


    /**
     * Gets the cvCode value for this CCSaleReply.
     * 
     * @return cvCode
     */
    public java.lang.String getCvCode() {
        return cvCode;
    }


    /**
     * Sets the cvCode value for this CCSaleReply.
     * 
     * @param cvCode
     */
    public void setCvCode(java.lang.String cvCode) {
        this.cvCode = cvCode;
    }


    /**
     * Gets the cvCodeRaw value for this CCSaleReply.
     * 
     * @return cvCodeRaw
     */
    public java.lang.String getCvCodeRaw() {
        return cvCodeRaw;
    }


    /**
     * Sets the cvCodeRaw value for this CCSaleReply.
     * 
     * @param cvCodeRaw
     */
    public void setCvCodeRaw(java.lang.String cvCodeRaw) {
        this.cvCodeRaw = cvCodeRaw;
    }


    /**
     * Gets the cavvResponseCode value for this CCSaleReply.
     * 
     * @return cavvResponseCode
     */
    public java.lang.String getCavvResponseCode() {
        return cavvResponseCode;
    }


    /**
     * Sets the cavvResponseCode value for this CCSaleReply.
     * 
     * @param cavvResponseCode
     */
    public void setCavvResponseCode(java.lang.String cavvResponseCode) {
        this.cavvResponseCode = cavvResponseCode;
    }


    /**
     * Gets the cavvResponseCodeRaw value for this CCSaleReply.
     * 
     * @return cavvResponseCodeRaw
     */
    public java.lang.String getCavvResponseCodeRaw() {
        return cavvResponseCodeRaw;
    }


    /**
     * Sets the cavvResponseCodeRaw value for this CCSaleReply.
     * 
     * @param cavvResponseCodeRaw
     */
    public void setCavvResponseCodeRaw(java.lang.String cavvResponseCodeRaw) {
        this.cavvResponseCodeRaw = cavvResponseCodeRaw;
    }


    /**
     * Gets the cardGroup value for this CCSaleReply.
     * 
     * @return cardGroup
     */
    public java.lang.String getCardGroup() {
        return cardGroup;
    }


    /**
     * Sets the cardGroup value for this CCSaleReply.
     * 
     * @param cardGroup
     */
    public void setCardGroup(java.lang.String cardGroup) {
        this.cardGroup = cardGroup;
    }


    /**
     * Gets the paymentNetworkTransactionID value for this CCSaleReply.
     * 
     * @return paymentNetworkTransactionID
     */
    public java.lang.String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }


    /**
     * Sets the paymentNetworkTransactionID value for this CCSaleReply.
     * 
     * @param paymentNetworkTransactionID
     */
    public void setPaymentNetworkTransactionID(java.lang.String paymentNetworkTransactionID) {
        this.paymentNetworkTransactionID = paymentNetworkTransactionID;
    }


    /**
     * Gets the cardCategory value for this CCSaleReply.
     * 
     * @return cardCategory
     */
    public java.lang.String getCardCategory() {
        return cardCategory;
    }


    /**
     * Sets the cardCategory value for this CCSaleReply.
     * 
     * @param cardCategory
     */
    public void setCardCategory(java.lang.String cardCategory) {
        this.cardCategory = cardCategory;
    }


    /**
     * Gets the accountBalance value for this CCSaleReply.
     * 
     * @return accountBalance
     */
    public java.lang.String getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this CCSaleReply.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.lang.String accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the authorizedDateTime value for this CCSaleReply.
     * 
     * @return authorizedDateTime
     */
    public java.lang.String getAuthorizedDateTime() {
        return authorizedDateTime;
    }


    /**
     * Sets the authorizedDateTime value for this CCSaleReply.
     * 
     * @param authorizedDateTime
     */
    public void setAuthorizedDateTime(java.lang.String authorizedDateTime) {
        this.authorizedDateTime = authorizedDateTime;
    }


    /**
     * Gets the requestAmount value for this CCSaleReply.
     * 
     * @return requestAmount
     */
    public java.lang.String getRequestAmount() {
        return requestAmount;
    }


    /**
     * Sets the requestAmount value for this CCSaleReply.
     * 
     * @param requestAmount
     */
    public void setRequestAmount(java.lang.String requestAmount) {
        this.requestAmount = requestAmount;
    }


    /**
     * Gets the reconciliationID value for this CCSaleReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this CCSaleReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the accountBalanceCurrency value for this CCSaleReply.
     * 
     * @return accountBalanceCurrency
     */
    public java.lang.String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }


    /**
     * Sets the accountBalanceCurrency value for this CCSaleReply.
     * 
     * @param accountBalanceCurrency
     */
    public void setAccountBalanceCurrency(java.lang.String accountBalanceCurrency) {
        this.accountBalanceCurrency = accountBalanceCurrency;
    }


    /**
     * Gets the accountBalanceSign value for this CCSaleReply.
     * 
     * @return accountBalanceSign
     */
    public java.lang.String getAccountBalanceSign() {
        return accountBalanceSign;
    }


    /**
     * Sets the accountBalanceSign value for this CCSaleReply.
     * 
     * @param accountBalanceSign
     */
    public void setAccountBalanceSign(java.lang.String accountBalanceSign) {
        this.accountBalanceSign = accountBalanceSign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCSaleReply)) return false;
        CCSaleReply other = (CCSaleReply) obj;
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
            ((this.processorResponse==null && other.getProcessorResponse()==null) || 
             (this.processorResponse!=null &&
              this.processorResponse.equals(other.getProcessorResponse()))) &&
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
            ((this.cavvResponseCode==null && other.getCavvResponseCode()==null) || 
             (this.cavvResponseCode!=null &&
              this.cavvResponseCode.equals(other.getCavvResponseCode()))) &&
            ((this.cavvResponseCodeRaw==null && other.getCavvResponseCodeRaw()==null) || 
             (this.cavvResponseCodeRaw!=null &&
              this.cavvResponseCodeRaw.equals(other.getCavvResponseCodeRaw()))) &&
            ((this.cardGroup==null && other.getCardGroup()==null) || 
             (this.cardGroup!=null &&
              this.cardGroup.equals(other.getCardGroup()))) &&
            ((this.paymentNetworkTransactionID==null && other.getPaymentNetworkTransactionID()==null) || 
             (this.paymentNetworkTransactionID!=null &&
              this.paymentNetworkTransactionID.equals(other.getPaymentNetworkTransactionID()))) &&
            ((this.cardCategory==null && other.getCardCategory()==null) || 
             (this.cardCategory!=null &&
              this.cardCategory.equals(other.getCardCategory()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.authorizedDateTime==null && other.getAuthorizedDateTime()==null) || 
             (this.authorizedDateTime!=null &&
              this.authorizedDateTime.equals(other.getAuthorizedDateTime()))) &&
            ((this.requestAmount==null && other.getRequestAmount()==null) || 
             (this.requestAmount!=null &&
              this.requestAmount.equals(other.getRequestAmount()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.accountBalanceCurrency==null && other.getAccountBalanceCurrency()==null) || 
             (this.accountBalanceCurrency!=null &&
              this.accountBalanceCurrency.equals(other.getAccountBalanceCurrency()))) &&
            ((this.accountBalanceSign==null && other.getAccountBalanceSign()==null) || 
             (this.accountBalanceSign!=null &&
              this.accountBalanceSign.equals(other.getAccountBalanceSign())));
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
        if (getProcessorResponse() != null) {
            _hashCode += getProcessorResponse().hashCode();
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
        if (getCavvResponseCode() != null) {
            _hashCode += getCavvResponseCode().hashCode();
        }
        if (getCavvResponseCodeRaw() != null) {
            _hashCode += getCavvResponseCodeRaw().hashCode();
        }
        if (getCardGroup() != null) {
            _hashCode += getCardGroup().hashCode();
        }
        if (getPaymentNetworkTransactionID() != null) {
            _hashCode += getPaymentNetworkTransactionID().hashCode();
        }
        if (getCardCategory() != null) {
            _hashCode += getCardCategory().hashCode();
        }
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
        }
        if (getAuthorizedDateTime() != null) {
            _hashCode += getAuthorizedDateTime().hashCode();
        }
        if (getRequestAmount() != null) {
            _hashCode += getRequestAmount().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getAccountBalanceCurrency() != null) {
            _hashCode += getAccountBalanceCurrency().hashCode();
        }
        if (getAccountBalanceSign() != null) {
            _hashCode += getAccountBalanceSign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCSaleReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReply"));
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
        elemField.setFieldName("processorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorResponse"));
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
        elemField.setFieldName("cardGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardGroup"));
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
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountBalance"));
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
        elemField.setFieldName("requestAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestAmount"));
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
