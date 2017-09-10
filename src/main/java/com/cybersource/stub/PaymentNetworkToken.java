/**
 * PaymentNetworkToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PaymentNetworkToken  implements java.io.Serializable {
    private java.lang.String requestorID;

    private java.lang.String transactionType;

    private java.lang.String assuranceLevel;

    private java.lang.String accountStatus;

    private java.lang.String originalCardCategory;

    private java.lang.String deviceTechType;

    public PaymentNetworkToken() {
    }

    public PaymentNetworkToken(
           java.lang.String requestorID,
           java.lang.String transactionType,
           java.lang.String assuranceLevel,
           java.lang.String accountStatus,
           java.lang.String originalCardCategory,
           java.lang.String deviceTechType) {
           this.requestorID = requestorID;
           this.transactionType = transactionType;
           this.assuranceLevel = assuranceLevel;
           this.accountStatus = accountStatus;
           this.originalCardCategory = originalCardCategory;
           this.deviceTechType = deviceTechType;
    }


    /**
     * Gets the requestorID value for this PaymentNetworkToken.
     * 
     * @return requestorID
     */
    public java.lang.String getRequestorID() {
        return requestorID;
    }


    /**
     * Sets the requestorID value for this PaymentNetworkToken.
     * 
     * @param requestorID
     */
    public void setRequestorID(java.lang.String requestorID) {
        this.requestorID = requestorID;
    }


    /**
     * Gets the transactionType value for this PaymentNetworkToken.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this PaymentNetworkToken.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the assuranceLevel value for this PaymentNetworkToken.
     * 
     * @return assuranceLevel
     */
    public java.lang.String getAssuranceLevel() {
        return assuranceLevel;
    }


    /**
     * Sets the assuranceLevel value for this PaymentNetworkToken.
     * 
     * @param assuranceLevel
     */
    public void setAssuranceLevel(java.lang.String assuranceLevel) {
        this.assuranceLevel = assuranceLevel;
    }


    /**
     * Gets the accountStatus value for this PaymentNetworkToken.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this PaymentNetworkToken.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the originalCardCategory value for this PaymentNetworkToken.
     * 
     * @return originalCardCategory
     */
    public java.lang.String getOriginalCardCategory() {
        return originalCardCategory;
    }


    /**
     * Sets the originalCardCategory value for this PaymentNetworkToken.
     * 
     * @param originalCardCategory
     */
    public void setOriginalCardCategory(java.lang.String originalCardCategory) {
        this.originalCardCategory = originalCardCategory;
    }


    /**
     * Gets the deviceTechType value for this PaymentNetworkToken.
     * 
     * @return deviceTechType
     */
    public java.lang.String getDeviceTechType() {
        return deviceTechType;
    }


    /**
     * Sets the deviceTechType value for this PaymentNetworkToken.
     * 
     * @param deviceTechType
     */
    public void setDeviceTechType(java.lang.String deviceTechType) {
        this.deviceTechType = deviceTechType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentNetworkToken)) return false;
        PaymentNetworkToken other = (PaymentNetworkToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestorID==null && other.getRequestorID()==null) || 
             (this.requestorID!=null &&
              this.requestorID.equals(other.getRequestorID()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.assuranceLevel==null && other.getAssuranceLevel()==null) || 
             (this.assuranceLevel!=null &&
              this.assuranceLevel.equals(other.getAssuranceLevel()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.originalCardCategory==null && other.getOriginalCardCategory()==null) || 
             (this.originalCardCategory!=null &&
              this.originalCardCategory.equals(other.getOriginalCardCategory()))) &&
            ((this.deviceTechType==null && other.getDeviceTechType()==null) || 
             (this.deviceTechType!=null &&
              this.deviceTechType.equals(other.getDeviceTechType())));
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
        if (getRequestorID() != null) {
            _hashCode += getRequestorID().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getAssuranceLevel() != null) {
            _hashCode += getAssuranceLevel().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getOriginalCardCategory() != null) {
            _hashCode += getOriginalCardCategory().hashCode();
        }
        if (getDeviceTechType() != null) {
            _hashCode += getDeviceTechType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentNetworkToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaymentNetworkToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestorID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestorID"));
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
        elemField.setFieldName("assuranceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "assuranceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalCardCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "originalCardCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceTechType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "deviceTechType"));
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
