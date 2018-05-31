/**
 * PinDebitPurchaseReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PinDebitPurchaseReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String processorResponse;

    private java.lang.String authorizationCode;

    private java.lang.String reconciliationID;

    private java.lang.String networkCode;

    private java.lang.String transactionID;

    private java.lang.String requestAmount;

    private java.lang.String requestCurrency;

    private java.lang.String amount;

    private java.lang.String dateTime;

    private java.lang.String accountType;

    private java.lang.String amountType;

    private java.lang.String accountBalance;

    private java.lang.String accountBalanceCurrency;

    private java.lang.String accountBalanceSign;

    public PinDebitPurchaseReply() {
    }

    public PinDebitPurchaseReply(
           java.math.BigInteger reasonCode,
           java.lang.String processorResponse,
           java.lang.String authorizationCode,
           java.lang.String reconciliationID,
           java.lang.String networkCode,
           java.lang.String transactionID,
           java.lang.String requestAmount,
           java.lang.String requestCurrency,
           java.lang.String amount,
           java.lang.String dateTime,
           java.lang.String accountType,
           java.lang.String amountType,
           java.lang.String accountBalance,
           java.lang.String accountBalanceCurrency,
           java.lang.String accountBalanceSign) {
           this.reasonCode = reasonCode;
           this.processorResponse = processorResponse;
           this.authorizationCode = authorizationCode;
           this.reconciliationID = reconciliationID;
           this.networkCode = networkCode;
           this.transactionID = transactionID;
           this.requestAmount = requestAmount;
           this.requestCurrency = requestCurrency;
           this.amount = amount;
           this.dateTime = dateTime;
           this.accountType = accountType;
           this.amountType = amountType;
           this.accountBalance = accountBalance;
           this.accountBalanceCurrency = accountBalanceCurrency;
           this.accountBalanceSign = accountBalanceSign;
    }


    /**
     * Gets the reasonCode value for this PinDebitPurchaseReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PinDebitPurchaseReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the processorResponse value for this PinDebitPurchaseReply.
     * 
     * @return processorResponse
     */
    public java.lang.String getProcessorResponse() {
        return processorResponse;
    }


    /**
     * Sets the processorResponse value for this PinDebitPurchaseReply.
     * 
     * @param processorResponse
     */
    public void setProcessorResponse(java.lang.String processorResponse) {
        this.processorResponse = processorResponse;
    }


    /**
     * Gets the authorizationCode value for this PinDebitPurchaseReply.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this PinDebitPurchaseReply.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the reconciliationID value for this PinDebitPurchaseReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this PinDebitPurchaseReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the networkCode value for this PinDebitPurchaseReply.
     * 
     * @return networkCode
     */
    public java.lang.String getNetworkCode() {
        return networkCode;
    }


    /**
     * Sets the networkCode value for this PinDebitPurchaseReply.
     * 
     * @param networkCode
     */
    public void setNetworkCode(java.lang.String networkCode) {
        this.networkCode = networkCode;
    }


    /**
     * Gets the transactionID value for this PinDebitPurchaseReply.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PinDebitPurchaseReply.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the requestAmount value for this PinDebitPurchaseReply.
     * 
     * @return requestAmount
     */
    public java.lang.String getRequestAmount() {
        return requestAmount;
    }


    /**
     * Sets the requestAmount value for this PinDebitPurchaseReply.
     * 
     * @param requestAmount
     */
    public void setRequestAmount(java.lang.String requestAmount) {
        this.requestAmount = requestAmount;
    }


    /**
     * Gets the requestCurrency value for this PinDebitPurchaseReply.
     * 
     * @return requestCurrency
     */
    public java.lang.String getRequestCurrency() {
        return requestCurrency;
    }


    /**
     * Sets the requestCurrency value for this PinDebitPurchaseReply.
     * 
     * @param requestCurrency
     */
    public void setRequestCurrency(java.lang.String requestCurrency) {
        this.requestCurrency = requestCurrency;
    }


    /**
     * Gets the amount value for this PinDebitPurchaseReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PinDebitPurchaseReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the dateTime value for this PinDebitPurchaseReply.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this PinDebitPurchaseReply.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the accountType value for this PinDebitPurchaseReply.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this PinDebitPurchaseReply.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the amountType value for this PinDebitPurchaseReply.
     * 
     * @return amountType
     */
    public java.lang.String getAmountType() {
        return amountType;
    }


    /**
     * Sets the amountType value for this PinDebitPurchaseReply.
     * 
     * @param amountType
     */
    public void setAmountType(java.lang.String amountType) {
        this.amountType = amountType;
    }


    /**
     * Gets the accountBalance value for this PinDebitPurchaseReply.
     * 
     * @return accountBalance
     */
    public java.lang.String getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this PinDebitPurchaseReply.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.lang.String accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the accountBalanceCurrency value for this PinDebitPurchaseReply.
     * 
     * @return accountBalanceCurrency
     */
    public java.lang.String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }


    /**
     * Sets the accountBalanceCurrency value for this PinDebitPurchaseReply.
     * 
     * @param accountBalanceCurrency
     */
    public void setAccountBalanceCurrency(java.lang.String accountBalanceCurrency) {
        this.accountBalanceCurrency = accountBalanceCurrency;
    }


    /**
     * Gets the accountBalanceSign value for this PinDebitPurchaseReply.
     * 
     * @return accountBalanceSign
     */
    public java.lang.String getAccountBalanceSign() {
        return accountBalanceSign;
    }


    /**
     * Sets the accountBalanceSign value for this PinDebitPurchaseReply.
     * 
     * @param accountBalanceSign
     */
    public void setAccountBalanceSign(java.lang.String accountBalanceSign) {
        this.accountBalanceSign = accountBalanceSign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PinDebitPurchaseReply)) return false;
        PinDebitPurchaseReply other = (PinDebitPurchaseReply) obj;
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
            ((this.processorResponse==null && other.getProcessorResponse()==null) || 
             (this.processorResponse!=null &&
              this.processorResponse.equals(other.getProcessorResponse()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.networkCode==null && other.getNetworkCode()==null) || 
             (this.networkCode!=null &&
              this.networkCode.equals(other.getNetworkCode()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.requestAmount==null && other.getRequestAmount()==null) || 
             (this.requestAmount!=null &&
              this.requestAmount.equals(other.getRequestAmount()))) &&
            ((this.requestCurrency==null && other.getRequestCurrency()==null) || 
             (this.requestCurrency!=null &&
              this.requestCurrency.equals(other.getRequestCurrency()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.amountType==null && other.getAmountType()==null) || 
             (this.amountType!=null &&
              this.amountType.equals(other.getAmountType()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
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
        if (getProcessorResponse() != null) {
            _hashCode += getProcessorResponse().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getNetworkCode() != null) {
            _hashCode += getNetworkCode().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getRequestAmount() != null) {
            _hashCode += getRequestAmount().hashCode();
        }
        if (getRequestCurrency() != null) {
            _hashCode += getRequestCurrency().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAmountType() != null) {
            _hashCode += getAmountType().hashCode();
        }
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
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
        new org.apache.axis.description.TypeDesc(PinDebitPurchaseReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitPurchaseReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authorizationCode"));
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
        elemField.setFieldName("networkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "networkCode"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dateTime"));
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
        elemField.setFieldName("amountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amountType"));
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
