/**
 * PayPalCreateAgreementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PayPalCreateAgreementService  implements java.io.Serializable {
    private java.lang.String paypalToken;

    private java.lang.String paypalEcSetRequestID;

    private java.lang.String paypalEcSetRequestToken;

    private java.lang.String run;  // attribute

    public PayPalCreateAgreementService() {
    }

    public PayPalCreateAgreementService(
           java.lang.String paypalToken,
           java.lang.String paypalEcSetRequestID,
           java.lang.String paypalEcSetRequestToken,
           java.lang.String run) {
           this.paypalToken = paypalToken;
           this.paypalEcSetRequestID = paypalEcSetRequestID;
           this.paypalEcSetRequestToken = paypalEcSetRequestToken;
           this.run = run;
    }


    /**
     * Gets the paypalToken value for this PayPalCreateAgreementService.
     * 
     * @return paypalToken
     */
    public java.lang.String getPaypalToken() {
        return paypalToken;
    }


    /**
     * Sets the paypalToken value for this PayPalCreateAgreementService.
     * 
     * @param paypalToken
     */
    public void setPaypalToken(java.lang.String paypalToken) {
        this.paypalToken = paypalToken;
    }


    /**
     * Gets the paypalEcSetRequestID value for this PayPalCreateAgreementService.
     * 
     * @return paypalEcSetRequestID
     */
    public java.lang.String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }


    /**
     * Sets the paypalEcSetRequestID value for this PayPalCreateAgreementService.
     * 
     * @param paypalEcSetRequestID
     */
    public void setPaypalEcSetRequestID(java.lang.String paypalEcSetRequestID) {
        this.paypalEcSetRequestID = paypalEcSetRequestID;
    }


    /**
     * Gets the paypalEcSetRequestToken value for this PayPalCreateAgreementService.
     * 
     * @return paypalEcSetRequestToken
     */
    public java.lang.String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }


    /**
     * Sets the paypalEcSetRequestToken value for this PayPalCreateAgreementService.
     * 
     * @param paypalEcSetRequestToken
     */
    public void setPaypalEcSetRequestToken(java.lang.String paypalEcSetRequestToken) {
        this.paypalEcSetRequestToken = paypalEcSetRequestToken;
    }


    /**
     * Gets the run value for this PayPalCreateAgreementService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this PayPalCreateAgreementService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayPalCreateAgreementService)) return false;
        PayPalCreateAgreementService other = (PayPalCreateAgreementService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paypalToken==null && other.getPaypalToken()==null) || 
             (this.paypalToken!=null &&
              this.paypalToken.equals(other.getPaypalToken()))) &&
            ((this.paypalEcSetRequestID==null && other.getPaypalEcSetRequestID()==null) || 
             (this.paypalEcSetRequestID!=null &&
              this.paypalEcSetRequestID.equals(other.getPaypalEcSetRequestID()))) &&
            ((this.paypalEcSetRequestToken==null && other.getPaypalEcSetRequestToken()==null) || 
             (this.paypalEcSetRequestToken!=null &&
              this.paypalEcSetRequestToken.equals(other.getPaypalEcSetRequestToken()))) &&
            ((this.run==null && other.getRun()==null) || 
             (this.run!=null &&
              this.run.equals(other.getRun())));
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
        if (getPaypalToken() != null) {
            _hashCode += getPaypalToken().hashCode();
        }
        if (getPaypalEcSetRequestID() != null) {
            _hashCode += getPaypalEcSetRequestID().hashCode();
        }
        if (getPaypalEcSetRequestToken() != null) {
            _hashCode += getPaypalEcSetRequestToken().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayPalCreateAgreementService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreateAgreementService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalEcSetRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalEcSetRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalEcSetRequestToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalEcSetRequestToken"));
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
