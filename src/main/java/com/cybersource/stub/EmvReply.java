/**
 * EmvReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class EmvReply  implements java.io.Serializable {
    private java.lang.String combinedTags;

    private java.lang.String decryptedRequestTags;

    private java.lang.String chipValidationResults;

    private java.lang.String chipValidationType;

    public EmvReply() {
    }

    public EmvReply(
           java.lang.String combinedTags,
           java.lang.String decryptedRequestTags,
           java.lang.String chipValidationResults,
           java.lang.String chipValidationType) {
           this.combinedTags = combinedTags;
           this.decryptedRequestTags = decryptedRequestTags;
           this.chipValidationResults = chipValidationResults;
           this.chipValidationType = chipValidationType;
    }


    /**
     * Gets the combinedTags value for this EmvReply.
     * 
     * @return combinedTags
     */
    public java.lang.String getCombinedTags() {
        return combinedTags;
    }


    /**
     * Sets the combinedTags value for this EmvReply.
     * 
     * @param combinedTags
     */
    public void setCombinedTags(java.lang.String combinedTags) {
        this.combinedTags = combinedTags;
    }


    /**
     * Gets the decryptedRequestTags value for this EmvReply.
     * 
     * @return decryptedRequestTags
     */
    public java.lang.String getDecryptedRequestTags() {
        return decryptedRequestTags;
    }


    /**
     * Sets the decryptedRequestTags value for this EmvReply.
     * 
     * @param decryptedRequestTags
     */
    public void setDecryptedRequestTags(java.lang.String decryptedRequestTags) {
        this.decryptedRequestTags = decryptedRequestTags;
    }


    /**
     * Gets the chipValidationResults value for this EmvReply.
     * 
     * @return chipValidationResults
     */
    public java.lang.String getChipValidationResults() {
        return chipValidationResults;
    }


    /**
     * Sets the chipValidationResults value for this EmvReply.
     * 
     * @param chipValidationResults
     */
    public void setChipValidationResults(java.lang.String chipValidationResults) {
        this.chipValidationResults = chipValidationResults;
    }


    /**
     * Gets the chipValidationType value for this EmvReply.
     * 
     * @return chipValidationType
     */
    public java.lang.String getChipValidationType() {
        return chipValidationType;
    }


    /**
     * Sets the chipValidationType value for this EmvReply.
     * 
     * @param chipValidationType
     */
    public void setChipValidationType(java.lang.String chipValidationType) {
        this.chipValidationType = chipValidationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmvReply)) return false;
        EmvReply other = (EmvReply) obj;
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
            ((this.decryptedRequestTags==null && other.getDecryptedRequestTags()==null) || 
             (this.decryptedRequestTags!=null &&
              this.decryptedRequestTags.equals(other.getDecryptedRequestTags()))) &&
            ((this.chipValidationResults==null && other.getChipValidationResults()==null) || 
             (this.chipValidationResults!=null &&
              this.chipValidationResults.equals(other.getChipValidationResults()))) &&
            ((this.chipValidationType==null && other.getChipValidationType()==null) || 
             (this.chipValidationType!=null &&
              this.chipValidationType.equals(other.getChipValidationType())));
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
        if (getDecryptedRequestTags() != null) {
            _hashCode += getDecryptedRequestTags().hashCode();
        }
        if (getChipValidationResults() != null) {
            _hashCode += getChipValidationResults().hashCode();
        }
        if (getChipValidationType() != null) {
            _hashCode += getChipValidationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmvReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedTags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "combinedTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decryptedRequestTags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decryptedRequestTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chipValidationResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chipValidationResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chipValidationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chipValidationType"));
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
