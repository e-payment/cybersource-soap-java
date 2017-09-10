/**
 * ServiceFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class ServiceFee  implements java.io.Serializable {
    private java.lang.String merchantDescriptor;

    private java.lang.String merchantDescriptorContact;

    private java.lang.String merchantDescriptorState;

    public ServiceFee() {
    }

    public ServiceFee(
           java.lang.String merchantDescriptor,
           java.lang.String merchantDescriptorContact,
           java.lang.String merchantDescriptorState) {
           this.merchantDescriptor = merchantDescriptor;
           this.merchantDescriptorContact = merchantDescriptorContact;
           this.merchantDescriptorState = merchantDescriptorState;
    }


    /**
     * Gets the merchantDescriptor value for this ServiceFee.
     * 
     * @return merchantDescriptor
     */
    public java.lang.String getMerchantDescriptor() {
        return merchantDescriptor;
    }


    /**
     * Sets the merchantDescriptor value for this ServiceFee.
     * 
     * @param merchantDescriptor
     */
    public void setMerchantDescriptor(java.lang.String merchantDescriptor) {
        this.merchantDescriptor = merchantDescriptor;
    }


    /**
     * Gets the merchantDescriptorContact value for this ServiceFee.
     * 
     * @return merchantDescriptorContact
     */
    public java.lang.String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }


    /**
     * Sets the merchantDescriptorContact value for this ServiceFee.
     * 
     * @param merchantDescriptorContact
     */
    public void setMerchantDescriptorContact(java.lang.String merchantDescriptorContact) {
        this.merchantDescriptorContact = merchantDescriptorContact;
    }


    /**
     * Gets the merchantDescriptorState value for this ServiceFee.
     * 
     * @return merchantDescriptorState
     */
    public java.lang.String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }


    /**
     * Sets the merchantDescriptorState value for this ServiceFee.
     * 
     * @param merchantDescriptorState
     */
    public void setMerchantDescriptorState(java.lang.String merchantDescriptorState) {
        this.merchantDescriptorState = merchantDescriptorState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceFee)) return false;
        ServiceFee other = (ServiceFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantDescriptor==null && other.getMerchantDescriptor()==null) || 
             (this.merchantDescriptor!=null &&
              this.merchantDescriptor.equals(other.getMerchantDescriptor()))) &&
            ((this.merchantDescriptorContact==null && other.getMerchantDescriptorContact()==null) || 
             (this.merchantDescriptorContact!=null &&
              this.merchantDescriptorContact.equals(other.getMerchantDescriptorContact()))) &&
            ((this.merchantDescriptorState==null && other.getMerchantDescriptorState()==null) || 
             (this.merchantDescriptorState!=null &&
              this.merchantDescriptorState.equals(other.getMerchantDescriptorState())));
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
        if (getMerchantDescriptor() != null) {
            _hashCode += getMerchantDescriptor().hashCode();
        }
        if (getMerchantDescriptorContact() != null) {
            _hashCode += getMerchantDescriptorContact().hashCode();
        }
        if (getMerchantDescriptorState() != null) {
            _hashCode += getMerchantDescriptorState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDescriptorState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDescriptorState"));
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
