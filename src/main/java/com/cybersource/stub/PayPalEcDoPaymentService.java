/**
 * PayPalEcDoPaymentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PayPalEcDoPaymentService  implements java.io.Serializable {
    private java.lang.String paypalToken;

    private java.lang.String paypalPayerId;

    private java.lang.String paypalCustomerEmail;

    private java.lang.String paypalDesc;

    private java.lang.String paypalEcSetRequestID;

    private java.lang.String paypalEcSetRequestToken;

    private java.lang.String promoCode0;

    private java.lang.String invoiceNumber;

    private java.lang.String run;  // attribute

    public PayPalEcDoPaymentService() {
    }

    public PayPalEcDoPaymentService(
           java.lang.String paypalToken,
           java.lang.String paypalPayerId,
           java.lang.String paypalCustomerEmail,
           java.lang.String paypalDesc,
           java.lang.String paypalEcSetRequestID,
           java.lang.String paypalEcSetRequestToken,
           java.lang.String promoCode0,
           java.lang.String invoiceNumber,
           java.lang.String run) {
           this.paypalToken = paypalToken;
           this.paypalPayerId = paypalPayerId;
           this.paypalCustomerEmail = paypalCustomerEmail;
           this.paypalDesc = paypalDesc;
           this.paypalEcSetRequestID = paypalEcSetRequestID;
           this.paypalEcSetRequestToken = paypalEcSetRequestToken;
           this.promoCode0 = promoCode0;
           this.invoiceNumber = invoiceNumber;
           this.run = run;
    }


    /**
     * Gets the paypalToken value for this PayPalEcDoPaymentService.
     * 
     * @return paypalToken
     */
    public java.lang.String getPaypalToken() {
        return paypalToken;
    }


    /**
     * Sets the paypalToken value for this PayPalEcDoPaymentService.
     * 
     * @param paypalToken
     */
    public void setPaypalToken(java.lang.String paypalToken) {
        this.paypalToken = paypalToken;
    }


    /**
     * Gets the paypalPayerId value for this PayPalEcDoPaymentService.
     * 
     * @return paypalPayerId
     */
    public java.lang.String getPaypalPayerId() {
        return paypalPayerId;
    }


    /**
     * Sets the paypalPayerId value for this PayPalEcDoPaymentService.
     * 
     * @param paypalPayerId
     */
    public void setPaypalPayerId(java.lang.String paypalPayerId) {
        this.paypalPayerId = paypalPayerId;
    }


    /**
     * Gets the paypalCustomerEmail value for this PayPalEcDoPaymentService.
     * 
     * @return paypalCustomerEmail
     */
    public java.lang.String getPaypalCustomerEmail() {
        return paypalCustomerEmail;
    }


    /**
     * Sets the paypalCustomerEmail value for this PayPalEcDoPaymentService.
     * 
     * @param paypalCustomerEmail
     */
    public void setPaypalCustomerEmail(java.lang.String paypalCustomerEmail) {
        this.paypalCustomerEmail = paypalCustomerEmail;
    }


    /**
     * Gets the paypalDesc value for this PayPalEcDoPaymentService.
     * 
     * @return paypalDesc
     */
    public java.lang.String getPaypalDesc() {
        return paypalDesc;
    }


    /**
     * Sets the paypalDesc value for this PayPalEcDoPaymentService.
     * 
     * @param paypalDesc
     */
    public void setPaypalDesc(java.lang.String paypalDesc) {
        this.paypalDesc = paypalDesc;
    }


    /**
     * Gets the paypalEcSetRequestID value for this PayPalEcDoPaymentService.
     * 
     * @return paypalEcSetRequestID
     */
    public java.lang.String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }


    /**
     * Sets the paypalEcSetRequestID value for this PayPalEcDoPaymentService.
     * 
     * @param paypalEcSetRequestID
     */
    public void setPaypalEcSetRequestID(java.lang.String paypalEcSetRequestID) {
        this.paypalEcSetRequestID = paypalEcSetRequestID;
    }


    /**
     * Gets the paypalEcSetRequestToken value for this PayPalEcDoPaymentService.
     * 
     * @return paypalEcSetRequestToken
     */
    public java.lang.String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }


    /**
     * Sets the paypalEcSetRequestToken value for this PayPalEcDoPaymentService.
     * 
     * @param paypalEcSetRequestToken
     */
    public void setPaypalEcSetRequestToken(java.lang.String paypalEcSetRequestToken) {
        this.paypalEcSetRequestToken = paypalEcSetRequestToken;
    }


    /**
     * Gets the promoCode0 value for this PayPalEcDoPaymentService.
     * 
     * @return promoCode0
     */
    public java.lang.String getPromoCode0() {
        return promoCode0;
    }


    /**
     * Sets the promoCode0 value for this PayPalEcDoPaymentService.
     * 
     * @param promoCode0
     */
    public void setPromoCode0(java.lang.String promoCode0) {
        this.promoCode0 = promoCode0;
    }


    /**
     * Gets the invoiceNumber value for this PayPalEcDoPaymentService.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this PayPalEcDoPaymentService.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the run value for this PayPalEcDoPaymentService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this PayPalEcDoPaymentService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayPalEcDoPaymentService)) return false;
        PayPalEcDoPaymentService other = (PayPalEcDoPaymentService) obj;
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
            ((this.paypalPayerId==null && other.getPaypalPayerId()==null) || 
             (this.paypalPayerId!=null &&
              this.paypalPayerId.equals(other.getPaypalPayerId()))) &&
            ((this.paypalCustomerEmail==null && other.getPaypalCustomerEmail()==null) || 
             (this.paypalCustomerEmail!=null &&
              this.paypalCustomerEmail.equals(other.getPaypalCustomerEmail()))) &&
            ((this.paypalDesc==null && other.getPaypalDesc()==null) || 
             (this.paypalDesc!=null &&
              this.paypalDesc.equals(other.getPaypalDesc()))) &&
            ((this.paypalEcSetRequestID==null && other.getPaypalEcSetRequestID()==null) || 
             (this.paypalEcSetRequestID!=null &&
              this.paypalEcSetRequestID.equals(other.getPaypalEcSetRequestID()))) &&
            ((this.paypalEcSetRequestToken==null && other.getPaypalEcSetRequestToken()==null) || 
             (this.paypalEcSetRequestToken!=null &&
              this.paypalEcSetRequestToken.equals(other.getPaypalEcSetRequestToken()))) &&
            ((this.promoCode0==null && other.getPromoCode0()==null) || 
             (this.promoCode0!=null &&
              this.promoCode0.equals(other.getPromoCode0()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
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
        if (getPaypalPayerId() != null) {
            _hashCode += getPaypalPayerId().hashCode();
        }
        if (getPaypalCustomerEmail() != null) {
            _hashCode += getPaypalCustomerEmail().hashCode();
        }
        if (getPaypalDesc() != null) {
            _hashCode += getPaypalDesc().hashCode();
        }
        if (getPaypalEcSetRequestID() != null) {
            _hashCode += getPaypalEcSetRequestID().hashCode();
        }
        if (getPaypalEcSetRequestToken() != null) {
            _hashCode += getPaypalEcSetRequestToken().hashCode();
        }
        if (getPromoCode0() != null) {
            _hashCode += getPromoCode0().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayPalEcDoPaymentService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcDoPaymentService"));
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
        elemField.setFieldName("paypalPayerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalPayerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalCustomerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalCustomerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalDesc"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "promoCode0"));
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
