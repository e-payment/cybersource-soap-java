/**
 * CCSaleCreditService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCSaleCreditService  implements java.io.Serializable {
    private java.lang.String overridePaymentMethod;

    private java.lang.String commerceIndicator;

    private java.lang.String reconciliationID;

    private java.lang.String refundReason;

    private java.lang.String saleRequestID;

    private java.lang.String run;  // attribute

    public CCSaleCreditService() {
    }

    public CCSaleCreditService(
           java.lang.String overridePaymentMethod,
           java.lang.String commerceIndicator,
           java.lang.String reconciliationID,
           java.lang.String refundReason,
           java.lang.String saleRequestID,
           java.lang.String run) {
           this.overridePaymentMethod = overridePaymentMethod;
           this.commerceIndicator = commerceIndicator;
           this.reconciliationID = reconciliationID;
           this.refundReason = refundReason;
           this.saleRequestID = saleRequestID;
           this.run = run;
    }


    /**
     * Gets the overridePaymentMethod value for this CCSaleCreditService.
     * 
     * @return overridePaymentMethod
     */
    public java.lang.String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }


    /**
     * Sets the overridePaymentMethod value for this CCSaleCreditService.
     * 
     * @param overridePaymentMethod
     */
    public void setOverridePaymentMethod(java.lang.String overridePaymentMethod) {
        this.overridePaymentMethod = overridePaymentMethod;
    }


    /**
     * Gets the commerceIndicator value for this CCSaleCreditService.
     * 
     * @return commerceIndicator
     */
    public java.lang.String getCommerceIndicator() {
        return commerceIndicator;
    }


    /**
     * Sets the commerceIndicator value for this CCSaleCreditService.
     * 
     * @param commerceIndicator
     */
    public void setCommerceIndicator(java.lang.String commerceIndicator) {
        this.commerceIndicator = commerceIndicator;
    }


    /**
     * Gets the reconciliationID value for this CCSaleCreditService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this CCSaleCreditService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the refundReason value for this CCSaleCreditService.
     * 
     * @return refundReason
     */
    public java.lang.String getRefundReason() {
        return refundReason;
    }


    /**
     * Sets the refundReason value for this CCSaleCreditService.
     * 
     * @param refundReason
     */
    public void setRefundReason(java.lang.String refundReason) {
        this.refundReason = refundReason;
    }


    /**
     * Gets the saleRequestID value for this CCSaleCreditService.
     * 
     * @return saleRequestID
     */
    public java.lang.String getSaleRequestID() {
        return saleRequestID;
    }


    /**
     * Sets the saleRequestID value for this CCSaleCreditService.
     * 
     * @param saleRequestID
     */
    public void setSaleRequestID(java.lang.String saleRequestID) {
        this.saleRequestID = saleRequestID;
    }


    /**
     * Gets the run value for this CCSaleCreditService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this CCSaleCreditService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCSaleCreditService)) return false;
        CCSaleCreditService other = (CCSaleCreditService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overridePaymentMethod==null && other.getOverridePaymentMethod()==null) || 
             (this.overridePaymentMethod!=null &&
              this.overridePaymentMethod.equals(other.getOverridePaymentMethod()))) &&
            ((this.commerceIndicator==null && other.getCommerceIndicator()==null) || 
             (this.commerceIndicator!=null &&
              this.commerceIndicator.equals(other.getCommerceIndicator()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.refundReason==null && other.getRefundReason()==null) || 
             (this.refundReason!=null &&
              this.refundReason.equals(other.getRefundReason()))) &&
            ((this.saleRequestID==null && other.getSaleRequestID()==null) || 
             (this.saleRequestID!=null &&
              this.saleRequestID.equals(other.getSaleRequestID()))) &&
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
        if (getOverridePaymentMethod() != null) {
            _hashCode += getOverridePaymentMethod().hashCode();
        }
        if (getCommerceIndicator() != null) {
            _hashCode += getCommerceIndicator().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getRefundReason() != null) {
            _hashCode += getRefundReason().hashCode();
        }
        if (getSaleRequestID() != null) {
            _hashCode += getSaleRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCSaleCreditService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleCreditService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridePaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "overridePaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commerceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "commerceIndicator"));
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
        elemField.setFieldName("refundReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "refundReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "saleRequestID"));
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
