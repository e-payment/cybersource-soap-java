/**
 * PromotionGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PromotionGroup  implements java.io.Serializable {
    private java.lang.String subtotalAmount;

    private java.lang.String taxRate;

    private java.lang.String prohibitDiscount;

    private java.math.BigInteger id;  // attribute

    public PromotionGroup() {
    }

    public PromotionGroup(
           java.lang.String subtotalAmount,
           java.lang.String taxRate,
           java.lang.String prohibitDiscount,
           java.math.BigInteger id) {
           this.subtotalAmount = subtotalAmount;
           this.taxRate = taxRate;
           this.prohibitDiscount = prohibitDiscount;
           this.id = id;
    }


    /**
     * Gets the subtotalAmount value for this PromotionGroup.
     * 
     * @return subtotalAmount
     */
    public java.lang.String getSubtotalAmount() {
        return subtotalAmount;
    }


    /**
     * Sets the subtotalAmount value for this PromotionGroup.
     * 
     * @param subtotalAmount
     */
    public void setSubtotalAmount(java.lang.String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }


    /**
     * Gets the taxRate value for this PromotionGroup.
     * 
     * @return taxRate
     */
    public java.lang.String getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this PromotionGroup.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.String taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the prohibitDiscount value for this PromotionGroup.
     * 
     * @return prohibitDiscount
     */
    public java.lang.String getProhibitDiscount() {
        return prohibitDiscount;
    }


    /**
     * Sets the prohibitDiscount value for this PromotionGroup.
     * 
     * @param prohibitDiscount
     */
    public void setProhibitDiscount(java.lang.String prohibitDiscount) {
        this.prohibitDiscount = prohibitDiscount;
    }


    /**
     * Gets the id value for this PromotionGroup.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this PromotionGroup.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionGroup)) return false;
        PromotionGroup other = (PromotionGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subtotalAmount==null && other.getSubtotalAmount()==null) || 
             (this.subtotalAmount!=null &&
              this.subtotalAmount.equals(other.getSubtotalAmount()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.prohibitDiscount==null && other.getProhibitDiscount()==null) || 
             (this.prohibitDiscount!=null &&
              this.prohibitDiscount.equals(other.getProhibitDiscount()))) &&
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
        if (getSubtotalAmount() != null) {
            _hashCode += getSubtotalAmount().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getProhibitDiscount() != null) {
            _hashCode += getProhibitDiscount().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PromotionGroup"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subtotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prohibitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "prohibitDiscount"));
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
