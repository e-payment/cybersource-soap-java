/**
 * PaySubscriptionUpdateReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PaySubscriptionUpdateReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String subscriptionID;

    private java.lang.String subscriptionIDNew;

    private java.lang.String ownerMerchantID;

    private java.lang.String instrumentIdentifierID;

    private java.lang.String instrumentIdentifierStatus;

    private java.lang.String instrumentIdentifierNew;

    private java.lang.String instrumentIdentifierSuccessorID;

    public PaySubscriptionUpdateReply() {
    }

    public PaySubscriptionUpdateReply(
           java.math.BigInteger reasonCode,
           java.lang.String subscriptionID,
           java.lang.String subscriptionIDNew,
           java.lang.String ownerMerchantID,
           java.lang.String instrumentIdentifierID,
           java.lang.String instrumentIdentifierStatus,
           java.lang.String instrumentIdentifierNew,
           java.lang.String instrumentIdentifierSuccessorID) {
           this.reasonCode = reasonCode;
           this.subscriptionID = subscriptionID;
           this.subscriptionIDNew = subscriptionIDNew;
           this.ownerMerchantID = ownerMerchantID;
           this.instrumentIdentifierID = instrumentIdentifierID;
           this.instrumentIdentifierStatus = instrumentIdentifierStatus;
           this.instrumentIdentifierNew = instrumentIdentifierNew;
           this.instrumentIdentifierSuccessorID = instrumentIdentifierSuccessorID;
    }


    /**
     * Gets the reasonCode value for this PaySubscriptionUpdateReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PaySubscriptionUpdateReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the subscriptionID value for this PaySubscriptionUpdateReply.
     * 
     * @return subscriptionID
     */
    public java.lang.String getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this PaySubscriptionUpdateReply.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(java.lang.String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the subscriptionIDNew value for this PaySubscriptionUpdateReply.
     * 
     * @return subscriptionIDNew
     */
    public java.lang.String getSubscriptionIDNew() {
        return subscriptionIDNew;
    }


    /**
     * Sets the subscriptionIDNew value for this PaySubscriptionUpdateReply.
     * 
     * @param subscriptionIDNew
     */
    public void setSubscriptionIDNew(java.lang.String subscriptionIDNew) {
        this.subscriptionIDNew = subscriptionIDNew;
    }


    /**
     * Gets the ownerMerchantID value for this PaySubscriptionUpdateReply.
     * 
     * @return ownerMerchantID
     */
    public java.lang.String getOwnerMerchantID() {
        return ownerMerchantID;
    }


    /**
     * Sets the ownerMerchantID value for this PaySubscriptionUpdateReply.
     * 
     * @param ownerMerchantID
     */
    public void setOwnerMerchantID(java.lang.String ownerMerchantID) {
        this.ownerMerchantID = ownerMerchantID;
    }


    /**
     * Gets the instrumentIdentifierID value for this PaySubscriptionUpdateReply.
     * 
     * @return instrumentIdentifierID
     */
    public java.lang.String getInstrumentIdentifierID() {
        return instrumentIdentifierID;
    }


    /**
     * Sets the instrumentIdentifierID value for this PaySubscriptionUpdateReply.
     * 
     * @param instrumentIdentifierID
     */
    public void setInstrumentIdentifierID(java.lang.String instrumentIdentifierID) {
        this.instrumentIdentifierID = instrumentIdentifierID;
    }


    /**
     * Gets the instrumentIdentifierStatus value for this PaySubscriptionUpdateReply.
     * 
     * @return instrumentIdentifierStatus
     */
    public java.lang.String getInstrumentIdentifierStatus() {
        return instrumentIdentifierStatus;
    }


    /**
     * Sets the instrumentIdentifierStatus value for this PaySubscriptionUpdateReply.
     * 
     * @param instrumentIdentifierStatus
     */
    public void setInstrumentIdentifierStatus(java.lang.String instrumentIdentifierStatus) {
        this.instrumentIdentifierStatus = instrumentIdentifierStatus;
    }


    /**
     * Gets the instrumentIdentifierNew value for this PaySubscriptionUpdateReply.
     * 
     * @return instrumentIdentifierNew
     */
    public java.lang.String getInstrumentIdentifierNew() {
        return instrumentIdentifierNew;
    }


    /**
     * Sets the instrumentIdentifierNew value for this PaySubscriptionUpdateReply.
     * 
     * @param instrumentIdentifierNew
     */
    public void setInstrumentIdentifierNew(java.lang.String instrumentIdentifierNew) {
        this.instrumentIdentifierNew = instrumentIdentifierNew;
    }


    /**
     * Gets the instrumentIdentifierSuccessorID value for this PaySubscriptionUpdateReply.
     * 
     * @return instrumentIdentifierSuccessorID
     */
    public java.lang.String getInstrumentIdentifierSuccessorID() {
        return instrumentIdentifierSuccessorID;
    }


    /**
     * Sets the instrumentIdentifierSuccessorID value for this PaySubscriptionUpdateReply.
     * 
     * @param instrumentIdentifierSuccessorID
     */
    public void setInstrumentIdentifierSuccessorID(java.lang.String instrumentIdentifierSuccessorID) {
        this.instrumentIdentifierSuccessorID = instrumentIdentifierSuccessorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaySubscriptionUpdateReply)) return false;
        PaySubscriptionUpdateReply other = (PaySubscriptionUpdateReply) obj;
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
            ((this.subscriptionID==null && other.getSubscriptionID()==null) || 
             (this.subscriptionID!=null &&
              this.subscriptionID.equals(other.getSubscriptionID()))) &&
            ((this.subscriptionIDNew==null && other.getSubscriptionIDNew()==null) || 
             (this.subscriptionIDNew!=null &&
              this.subscriptionIDNew.equals(other.getSubscriptionIDNew()))) &&
            ((this.ownerMerchantID==null && other.getOwnerMerchantID()==null) || 
             (this.ownerMerchantID!=null &&
              this.ownerMerchantID.equals(other.getOwnerMerchantID()))) &&
            ((this.instrumentIdentifierID==null && other.getInstrumentIdentifierID()==null) || 
             (this.instrumentIdentifierID!=null &&
              this.instrumentIdentifierID.equals(other.getInstrumentIdentifierID()))) &&
            ((this.instrumentIdentifierStatus==null && other.getInstrumentIdentifierStatus()==null) || 
             (this.instrumentIdentifierStatus!=null &&
              this.instrumentIdentifierStatus.equals(other.getInstrumentIdentifierStatus()))) &&
            ((this.instrumentIdentifierNew==null && other.getInstrumentIdentifierNew()==null) || 
             (this.instrumentIdentifierNew!=null &&
              this.instrumentIdentifierNew.equals(other.getInstrumentIdentifierNew()))) &&
            ((this.instrumentIdentifierSuccessorID==null && other.getInstrumentIdentifierSuccessorID()==null) || 
             (this.instrumentIdentifierSuccessorID!=null &&
              this.instrumentIdentifierSuccessorID.equals(other.getInstrumentIdentifierSuccessorID())));
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
        if (getSubscriptionID() != null) {
            _hashCode += getSubscriptionID().hashCode();
        }
        if (getSubscriptionIDNew() != null) {
            _hashCode += getSubscriptionIDNew().hashCode();
        }
        if (getOwnerMerchantID() != null) {
            _hashCode += getOwnerMerchantID().hashCode();
        }
        if (getInstrumentIdentifierID() != null) {
            _hashCode += getInstrumentIdentifierID().hashCode();
        }
        if (getInstrumentIdentifierStatus() != null) {
            _hashCode += getInstrumentIdentifierStatus().hashCode();
        }
        if (getInstrumentIdentifierNew() != null) {
            _hashCode += getInstrumentIdentifierNew().hashCode();
        }
        if (getInstrumentIdentifierSuccessorID() != null) {
            _hashCode += getInstrumentIdentifierSuccessorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaySubscriptionUpdateReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionUpdateReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subscriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionIDNew");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subscriptionIDNew"));
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
        elemField.setFieldName("instrumentIdentifierID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "instrumentIdentifierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentIdentifierStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "instrumentIdentifierStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentIdentifierNew");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "instrumentIdentifierNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentIdentifierSuccessorID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "instrumentIdentifierSuccessorID"));
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
