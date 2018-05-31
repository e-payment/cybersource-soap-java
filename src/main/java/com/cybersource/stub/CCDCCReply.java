/**
 * CCDCCReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCDCCReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String dccSupported;

    private java.lang.String validHours;

    private java.lang.String marginRatePercentage;

    private java.lang.String reconciliationID;

    public CCDCCReply() {
    }

    public CCDCCReply(
           java.math.BigInteger reasonCode,
           java.lang.String dccSupported,
           java.lang.String validHours,
           java.lang.String marginRatePercentage,
           java.lang.String reconciliationID) {
           this.reasonCode = reasonCode;
           this.dccSupported = dccSupported;
           this.validHours = validHours;
           this.marginRatePercentage = marginRatePercentage;
           this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the reasonCode value for this CCDCCReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this CCDCCReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the dccSupported value for this CCDCCReply.
     * 
     * @return dccSupported
     */
    public java.lang.String getDccSupported() {
        return dccSupported;
    }


    /**
     * Sets the dccSupported value for this CCDCCReply.
     * 
     * @param dccSupported
     */
    public void setDccSupported(java.lang.String dccSupported) {
        this.dccSupported = dccSupported;
    }


    /**
     * Gets the validHours value for this CCDCCReply.
     * 
     * @return validHours
     */
    public java.lang.String getValidHours() {
        return validHours;
    }


    /**
     * Sets the validHours value for this CCDCCReply.
     * 
     * @param validHours
     */
    public void setValidHours(java.lang.String validHours) {
        this.validHours = validHours;
    }


    /**
     * Gets the marginRatePercentage value for this CCDCCReply.
     * 
     * @return marginRatePercentage
     */
    public java.lang.String getMarginRatePercentage() {
        return marginRatePercentage;
    }


    /**
     * Sets the marginRatePercentage value for this CCDCCReply.
     * 
     * @param marginRatePercentage
     */
    public void setMarginRatePercentage(java.lang.String marginRatePercentage) {
        this.marginRatePercentage = marginRatePercentage;
    }


    /**
     * Gets the reconciliationID value for this CCDCCReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this CCDCCReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCDCCReply)) return false;
        CCDCCReply other = (CCDCCReply) obj;
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
            ((this.dccSupported==null && other.getDccSupported()==null) || 
             (this.dccSupported!=null &&
              this.dccSupported.equals(other.getDccSupported()))) &&
            ((this.validHours==null && other.getValidHours()==null) || 
             (this.validHours!=null &&
              this.validHours.equals(other.getValidHours()))) &&
            ((this.marginRatePercentage==null && other.getMarginRatePercentage()==null) || 
             (this.marginRatePercentage!=null &&
              this.marginRatePercentage.equals(other.getMarginRatePercentage()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID())));
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
        if (getDccSupported() != null) {
            _hashCode += getDccSupported().hashCode();
        }
        if (getValidHours() != null) {
            _hashCode += getValidHours().hashCode();
        }
        if (getMarginRatePercentage() != null) {
            _hashCode += getMarginRatePercentage().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCDCCReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dccSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dccSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "validHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginRatePercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "marginRatePercentage"));
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
