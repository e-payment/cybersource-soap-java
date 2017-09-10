/**
 * EmvRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class EmvRequest  implements java.io.Serializable {
    private java.lang.String combinedTags;

    private java.lang.String cardSequenceNumber;

    private java.lang.String aidAndDFname;

    private java.lang.String fallback;

    private java.lang.String fallbackCondition;

    public EmvRequest() {
    }

    public EmvRequest(
           java.lang.String combinedTags,
           java.lang.String cardSequenceNumber,
           java.lang.String aidAndDFname,
           java.lang.String fallback,
           java.lang.String fallbackCondition) {
           this.combinedTags = combinedTags;
           this.cardSequenceNumber = cardSequenceNumber;
           this.aidAndDFname = aidAndDFname;
           this.fallback = fallback;
           this.fallbackCondition = fallbackCondition;
    }


    /**
     * Gets the combinedTags value for this EmvRequest.
     * 
     * @return combinedTags
     */
    public java.lang.String getCombinedTags() {
        return combinedTags;
    }


    /**
     * Sets the combinedTags value for this EmvRequest.
     * 
     * @param combinedTags
     */
    public void setCombinedTags(java.lang.String combinedTags) {
        this.combinedTags = combinedTags;
    }


    /**
     * Gets the cardSequenceNumber value for this EmvRequest.
     * 
     * @return cardSequenceNumber
     */
    public java.lang.String getCardSequenceNumber() {
        return cardSequenceNumber;
    }


    /**
     * Sets the cardSequenceNumber value for this EmvRequest.
     * 
     * @param cardSequenceNumber
     */
    public void setCardSequenceNumber(java.lang.String cardSequenceNumber) {
        this.cardSequenceNumber = cardSequenceNumber;
    }


    /**
     * Gets the aidAndDFname value for this EmvRequest.
     * 
     * @return aidAndDFname
     */
    public java.lang.String getAidAndDFname() {
        return aidAndDFname;
    }


    /**
     * Sets the aidAndDFname value for this EmvRequest.
     * 
     * @param aidAndDFname
     */
    public void setAidAndDFname(java.lang.String aidAndDFname) {
        this.aidAndDFname = aidAndDFname;
    }


    /**
     * Gets the fallback value for this EmvRequest.
     * 
     * @return fallback
     */
    public java.lang.String getFallback() {
        return fallback;
    }


    /**
     * Sets the fallback value for this EmvRequest.
     * 
     * @param fallback
     */
    public void setFallback(java.lang.String fallback) {
        this.fallback = fallback;
    }


    /**
     * Gets the fallbackCondition value for this EmvRequest.
     * 
     * @return fallbackCondition
     */
    public java.lang.String getFallbackCondition() {
        return fallbackCondition;
    }


    /**
     * Sets the fallbackCondition value for this EmvRequest.
     * 
     * @param fallbackCondition
     */
    public void setFallbackCondition(java.lang.String fallbackCondition) {
        this.fallbackCondition = fallbackCondition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmvRequest)) return false;
        EmvRequest other = (EmvRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.combinedTags==null && other.getCombinedTags()==null) || 
             (this.combinedTags!=null &&
              this.combinedTags.equals(other.getCombinedTags()))) &&
            ((this.cardSequenceNumber==null && other.getCardSequenceNumber()==null) || 
             (this.cardSequenceNumber!=null &&
              this.cardSequenceNumber.equals(other.getCardSequenceNumber()))) &&
            ((this.aidAndDFname==null && other.getAidAndDFname()==null) || 
             (this.aidAndDFname!=null &&
              this.aidAndDFname.equals(other.getAidAndDFname()))) &&
            ((this.fallback==null && other.getFallback()==null) || 
             (this.fallback!=null &&
              this.fallback.equals(other.getFallback()))) &&
            ((this.fallbackCondition==null && other.getFallbackCondition()==null) || 
             (this.fallbackCondition!=null &&
              this.fallbackCondition.equals(other.getFallbackCondition())));
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
        if (getCombinedTags() != null) {
            _hashCode += getCombinedTags().hashCode();
        }
        if (getCardSequenceNumber() != null) {
            _hashCode += getCardSequenceNumber().hashCode();
        }
        if (getAidAndDFname() != null) {
            _hashCode += getAidAndDFname().hashCode();
        }
        if (getFallback() != null) {
            _hashCode += getFallback().hashCode();
        }
        if (getFallbackCondition() != null) {
            _hashCode += getFallbackCondition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmvRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedTags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "combinedTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aidAndDFname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "aidAndDFname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fallback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fallbackCondition"));
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
