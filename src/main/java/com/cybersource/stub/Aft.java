/**
 * Aft.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class Aft  implements java.io.Serializable {
    private java.lang.String indicator;

    private java.lang.String serviceFee;

    private java.lang.String foreignExchangeFee;

    public Aft() {
    }

    public Aft(
           java.lang.String indicator,
           java.lang.String serviceFee,
           java.lang.String foreignExchangeFee) {
           this.indicator = indicator;
           this.serviceFee = serviceFee;
           this.foreignExchangeFee = foreignExchangeFee;
    }


    /**
     * Gets the indicator value for this Aft.
     * 
     * @return indicator
     */
    public java.lang.String getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this Aft.
     * 
     * @param indicator
     */
    public void setIndicator(java.lang.String indicator) {
        this.indicator = indicator;
    }


    /**
     * Gets the serviceFee value for this Aft.
     * 
     * @return serviceFee
     */
    public java.lang.String getServiceFee() {
        return serviceFee;
    }


    /**
     * Sets the serviceFee value for this Aft.
     * 
     * @param serviceFee
     */
    public void setServiceFee(java.lang.String serviceFee) {
        this.serviceFee = serviceFee;
    }


    /**
     * Gets the foreignExchangeFee value for this Aft.
     * 
     * @return foreignExchangeFee
     */
    public java.lang.String getForeignExchangeFee() {
        return foreignExchangeFee;
    }


    /**
     * Sets the foreignExchangeFee value for this Aft.
     * 
     * @param foreignExchangeFee
     */
    public void setForeignExchangeFee(java.lang.String foreignExchangeFee) {
        this.foreignExchangeFee = foreignExchangeFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aft)) return false;
        Aft other = (Aft) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indicator==null && other.getIndicator()==null) || 
             (this.indicator!=null &&
              this.indicator.equals(other.getIndicator()))) &&
            ((this.serviceFee==null && other.getServiceFee()==null) || 
             (this.serviceFee!=null &&
              this.serviceFee.equals(other.getServiceFee()))) &&
            ((this.foreignExchangeFee==null && other.getForeignExchangeFee()==null) || 
             (this.foreignExchangeFee!=null &&
              this.foreignExchangeFee.equals(other.getForeignExchangeFee())));
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
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        if (getServiceFee() != null) {
            _hashCode += getServiceFee().hashCode();
        }
        if (getForeignExchangeFee() != null) {
            _hashCode += getForeignExchangeFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aft.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Aft"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "serviceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExchangeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "foreignExchangeFee"));
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
