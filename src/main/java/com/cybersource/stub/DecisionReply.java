/**
 * DecisionReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class DecisionReply  implements java.io.Serializable {
    private java.math.BigInteger casePriority;

    private com.cybersource.stub.ProfileReply activeProfileReply;

    private java.lang.String velocityInfoCode;

    private com.cybersource.stub.AdditionalFields additionalFields;

    private com.cybersource.stub.MorphingElement morphingElement;

    public DecisionReply() {
    }

    public DecisionReply(
           java.math.BigInteger casePriority,
           com.cybersource.stub.ProfileReply activeProfileReply,
           java.lang.String velocityInfoCode,
           com.cybersource.stub.AdditionalFields additionalFields,
           com.cybersource.stub.MorphingElement morphingElement) {
           this.casePriority = casePriority;
           this.activeProfileReply = activeProfileReply;
           this.velocityInfoCode = velocityInfoCode;
           this.additionalFields = additionalFields;
           this.morphingElement = morphingElement;
    }


    /**
     * Gets the casePriority value for this DecisionReply.
     * 
     * @return casePriority
     */
    public java.math.BigInteger getCasePriority() {
        return casePriority;
    }


    /**
     * Sets the casePriority value for this DecisionReply.
     * 
     * @param casePriority
     */
    public void setCasePriority(java.math.BigInteger casePriority) {
        this.casePriority = casePriority;
    }


    /**
     * Gets the activeProfileReply value for this DecisionReply.
     * 
     * @return activeProfileReply
     */
    public com.cybersource.stub.ProfileReply getActiveProfileReply() {
        return activeProfileReply;
    }


    /**
     * Sets the activeProfileReply value for this DecisionReply.
     * 
     * @param activeProfileReply
     */
    public void setActiveProfileReply(com.cybersource.stub.ProfileReply activeProfileReply) {
        this.activeProfileReply = activeProfileReply;
    }


    /**
     * Gets the velocityInfoCode value for this DecisionReply.
     * 
     * @return velocityInfoCode
     */
    public java.lang.String getVelocityInfoCode() {
        return velocityInfoCode;
    }


    /**
     * Sets the velocityInfoCode value for this DecisionReply.
     * 
     * @param velocityInfoCode
     */
    public void setVelocityInfoCode(java.lang.String velocityInfoCode) {
        this.velocityInfoCode = velocityInfoCode;
    }


    /**
     * Gets the additionalFields value for this DecisionReply.
     * 
     * @return additionalFields
     */
    public com.cybersource.stub.AdditionalFields getAdditionalFields() {
        return additionalFields;
    }


    /**
     * Sets the additionalFields value for this DecisionReply.
     * 
     * @param additionalFields
     */
    public void setAdditionalFields(com.cybersource.stub.AdditionalFields additionalFields) {
        this.additionalFields = additionalFields;
    }


    /**
     * Gets the morphingElement value for this DecisionReply.
     * 
     * @return morphingElement
     */
    public com.cybersource.stub.MorphingElement getMorphingElement() {
        return morphingElement;
    }


    /**
     * Sets the morphingElement value for this DecisionReply.
     * 
     * @param morphingElement
     */
    public void setMorphingElement(com.cybersource.stub.MorphingElement morphingElement) {
        this.morphingElement = morphingElement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DecisionReply)) return false;
        DecisionReply other = (DecisionReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.casePriority==null && other.getCasePriority()==null) || 
             (this.casePriority!=null &&
              this.casePriority.equals(other.getCasePriority()))) &&
            ((this.activeProfileReply==null && other.getActiveProfileReply()==null) || 
             (this.activeProfileReply!=null &&
              this.activeProfileReply.equals(other.getActiveProfileReply()))) &&
            ((this.velocityInfoCode==null && other.getVelocityInfoCode()==null) || 
             (this.velocityInfoCode!=null &&
              this.velocityInfoCode.equals(other.getVelocityInfoCode()))) &&
            ((this.additionalFields==null && other.getAdditionalFields()==null) || 
             (this.additionalFields!=null &&
              this.additionalFields.equals(other.getAdditionalFields()))) &&
            ((this.morphingElement==null && other.getMorphingElement()==null) || 
             (this.morphingElement!=null &&
              this.morphingElement.equals(other.getMorphingElement())));
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
        if (getCasePriority() != null) {
            _hashCode += getCasePriority().hashCode();
        }
        if (getActiveProfileReply() != null) {
            _hashCode += getActiveProfileReply().hashCode();
        }
        if (getVelocityInfoCode() != null) {
            _hashCode += getVelocityInfoCode().hashCode();
        }
        if (getAdditionalFields() != null) {
            _hashCode += getAdditionalFields().hashCode();
        }
        if (getMorphingElement() != null) {
            _hashCode += getMorphingElement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DecisionReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "casePriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeProfileReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "activeProfileReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ProfileReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocityInfoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "velocityInfoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AdditionalFields"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("morphingElement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "morphingElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MorphingElement"));
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
