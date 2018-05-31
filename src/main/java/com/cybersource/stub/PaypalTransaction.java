/**
 * PaypalTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PaypalTransaction  implements java.io.Serializable {
    private java.lang.String transactionTime;

    private java.lang.String transactionTimeZone;

    private java.lang.String transactionType;

    private java.lang.String paypalPayerOrPayeeEmail;

    private java.lang.String customerDisplayName;

    private java.lang.String transactionID;

    private java.lang.String paypalPaymentStatus;

    private java.lang.String grandTotalAmount;

    private java.lang.String currency;

    private java.lang.String paypalFeeAmount;

    private java.lang.String paypalNetAmount;

    private java.math.BigInteger id;  // attribute

    public PaypalTransaction() {
    }

    public PaypalTransaction(
           java.lang.String transactionTime,
           java.lang.String transactionTimeZone,
           java.lang.String transactionType,
           java.lang.String paypalPayerOrPayeeEmail,
           java.lang.String customerDisplayName,
           java.lang.String transactionID,
           java.lang.String paypalPaymentStatus,
           java.lang.String grandTotalAmount,
           java.lang.String currency,
           java.lang.String paypalFeeAmount,
           java.lang.String paypalNetAmount,
           java.math.BigInteger id) {
           this.transactionTime = transactionTime;
           this.transactionTimeZone = transactionTimeZone;
           this.transactionType = transactionType;
           this.paypalPayerOrPayeeEmail = paypalPayerOrPayeeEmail;
           this.customerDisplayName = customerDisplayName;
           this.transactionID = transactionID;
           this.paypalPaymentStatus = paypalPaymentStatus;
           this.grandTotalAmount = grandTotalAmount;
           this.currency = currency;
           this.paypalFeeAmount = paypalFeeAmount;
           this.paypalNetAmount = paypalNetAmount;
           this.id = id;
    }


    /**
     * Gets the transactionTime value for this PaypalTransaction.
     * 
     * @return transactionTime
     */
    public java.lang.String getTransactionTime() {
        return transactionTime;
    }


    /**
     * Sets the transactionTime value for this PaypalTransaction.
     * 
     * @param transactionTime
     */
    public void setTransactionTime(java.lang.String transactionTime) {
        this.transactionTime = transactionTime;
    }


    /**
     * Gets the transactionTimeZone value for this PaypalTransaction.
     * 
     * @return transactionTimeZone
     */
    public java.lang.String getTransactionTimeZone() {
        return transactionTimeZone;
    }


    /**
     * Sets the transactionTimeZone value for this PaypalTransaction.
     * 
     * @param transactionTimeZone
     */
    public void setTransactionTimeZone(java.lang.String transactionTimeZone) {
        this.transactionTimeZone = transactionTimeZone;
    }


    /**
     * Gets the transactionType value for this PaypalTransaction.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this PaypalTransaction.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the paypalPayerOrPayeeEmail value for this PaypalTransaction.
     * 
     * @return paypalPayerOrPayeeEmail
     */
    public java.lang.String getPaypalPayerOrPayeeEmail() {
        return paypalPayerOrPayeeEmail;
    }


    /**
     * Sets the paypalPayerOrPayeeEmail value for this PaypalTransaction.
     * 
     * @param paypalPayerOrPayeeEmail
     */
    public void setPaypalPayerOrPayeeEmail(java.lang.String paypalPayerOrPayeeEmail) {
        this.paypalPayerOrPayeeEmail = paypalPayerOrPayeeEmail;
    }


    /**
     * Gets the customerDisplayName value for this PaypalTransaction.
     * 
     * @return customerDisplayName
     */
    public java.lang.String getCustomerDisplayName() {
        return customerDisplayName;
    }


    /**
     * Sets the customerDisplayName value for this PaypalTransaction.
     * 
     * @param customerDisplayName
     */
    public void setCustomerDisplayName(java.lang.String customerDisplayName) {
        this.customerDisplayName = customerDisplayName;
    }


    /**
     * Gets the transactionID value for this PaypalTransaction.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PaypalTransaction.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the paypalPaymentStatus value for this PaypalTransaction.
     * 
     * @return paypalPaymentStatus
     */
    public java.lang.String getPaypalPaymentStatus() {
        return paypalPaymentStatus;
    }


    /**
     * Sets the paypalPaymentStatus value for this PaypalTransaction.
     * 
     * @param paypalPaymentStatus
     */
    public void setPaypalPaymentStatus(java.lang.String paypalPaymentStatus) {
        this.paypalPaymentStatus = paypalPaymentStatus;
    }


    /**
     * Gets the grandTotalAmount value for this PaypalTransaction.
     * 
     * @return grandTotalAmount
     */
    public java.lang.String getGrandTotalAmount() {
        return grandTotalAmount;
    }


    /**
     * Sets the grandTotalAmount value for this PaypalTransaction.
     * 
     * @param grandTotalAmount
     */
    public void setGrandTotalAmount(java.lang.String grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }


    /**
     * Gets the currency value for this PaypalTransaction.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaypalTransaction.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the paypalFeeAmount value for this PaypalTransaction.
     * 
     * @return paypalFeeAmount
     */
    public java.lang.String getPaypalFeeAmount() {
        return paypalFeeAmount;
    }


    /**
     * Sets the paypalFeeAmount value for this PaypalTransaction.
     * 
     * @param paypalFeeAmount
     */
    public void setPaypalFeeAmount(java.lang.String paypalFeeAmount) {
        this.paypalFeeAmount = paypalFeeAmount;
    }


    /**
     * Gets the paypalNetAmount value for this PaypalTransaction.
     * 
     * @return paypalNetAmount
     */
    public java.lang.String getPaypalNetAmount() {
        return paypalNetAmount;
    }


    /**
     * Sets the paypalNetAmount value for this PaypalTransaction.
     * 
     * @param paypalNetAmount
     */
    public void setPaypalNetAmount(java.lang.String paypalNetAmount) {
        this.paypalNetAmount = paypalNetAmount;
    }


    /**
     * Gets the id value for this PaypalTransaction.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this PaypalTransaction.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaypalTransaction)) return false;
        PaypalTransaction other = (PaypalTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionTime==null && other.getTransactionTime()==null) || 
             (this.transactionTime!=null &&
              this.transactionTime.equals(other.getTransactionTime()))) &&
            ((this.transactionTimeZone==null && other.getTransactionTimeZone()==null) || 
             (this.transactionTimeZone!=null &&
              this.transactionTimeZone.equals(other.getTransactionTimeZone()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.paypalPayerOrPayeeEmail==null && other.getPaypalPayerOrPayeeEmail()==null) || 
             (this.paypalPayerOrPayeeEmail!=null &&
              this.paypalPayerOrPayeeEmail.equals(other.getPaypalPayerOrPayeeEmail()))) &&
            ((this.customerDisplayName==null && other.getCustomerDisplayName()==null) || 
             (this.customerDisplayName!=null &&
              this.customerDisplayName.equals(other.getCustomerDisplayName()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.paypalPaymentStatus==null && other.getPaypalPaymentStatus()==null) || 
             (this.paypalPaymentStatus!=null &&
              this.paypalPaymentStatus.equals(other.getPaypalPaymentStatus()))) &&
            ((this.grandTotalAmount==null && other.getGrandTotalAmount()==null) || 
             (this.grandTotalAmount!=null &&
              this.grandTotalAmount.equals(other.getGrandTotalAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.paypalFeeAmount==null && other.getPaypalFeeAmount()==null) || 
             (this.paypalFeeAmount!=null &&
              this.paypalFeeAmount.equals(other.getPaypalFeeAmount()))) &&
            ((this.paypalNetAmount==null && other.getPaypalNetAmount()==null) || 
             (this.paypalNetAmount!=null &&
              this.paypalNetAmount.equals(other.getPaypalNetAmount()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getTransactionTime() != null) {
            _hashCode += getTransactionTime().hashCode();
        }
        if (getTransactionTimeZone() != null) {
            _hashCode += getTransactionTimeZone().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getPaypalPayerOrPayeeEmail() != null) {
            _hashCode += getPaypalPayerOrPayeeEmail().hashCode();
        }
        if (getCustomerDisplayName() != null) {
            _hashCode += getCustomerDisplayName().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getPaypalPaymentStatus() != null) {
            _hashCode += getPaypalPaymentStatus().hashCode();
        }
        if (getGrandTotalAmount() != null) {
            _hashCode += getGrandTotalAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPaypalFeeAmount() != null) {
            _hashCode += getPaypalFeeAmount().hashCode();
        }
        if (getPaypalNetAmount() != null) {
            _hashCode += getPaypalNetAmount().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaypalTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaypalTransaction"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalPayerOrPayeeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPayerOrPayeeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerDisplayName"));
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
        elemField.setFieldName("paypalPaymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grandTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "grandTotalAmount"));
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
        elemField.setFieldName("paypalFeeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalFeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalNetAmount"));
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
