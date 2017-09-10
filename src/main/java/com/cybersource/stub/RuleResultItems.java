/**
 * RuleResultItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class RuleResultItems  implements java.io.Serializable {
    private com.cybersource.stub.RuleResultItem[] ruleResultItem;

    public RuleResultItems() {
    }

    public RuleResultItems(
           com.cybersource.stub.RuleResultItem[] ruleResultItem) {
           this.ruleResultItem = ruleResultItem;
    }


    /**
     * Gets the ruleResultItem value for this RuleResultItems.
     * 
     * @return ruleResultItem
     */
    public com.cybersource.stub.RuleResultItem[] getRuleResultItem() {
        return ruleResultItem;
    }


    /**
     * Sets the ruleResultItem value for this RuleResultItems.
     * 
     * @param ruleResultItem
     */
    public void setRuleResultItem(com.cybersource.stub.RuleResultItem[] ruleResultItem) {
        this.ruleResultItem = ruleResultItem;
    }

    public com.cybersource.stub.RuleResultItem getRuleResultItem(int i) {
        return this.ruleResultItem[i];
    }

    public void setRuleResultItem(int i, com.cybersource.stub.RuleResultItem _value) {
        this.ruleResultItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleResultItems)) return false;
        RuleResultItems other = (RuleResultItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ruleResultItem==null && other.getRuleResultItem()==null) || 
             (this.ruleResultItem!=null &&
              java.util.Arrays.equals(this.ruleResultItem, other.getRuleResultItem())));
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
        if (getRuleResultItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleResultItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleResultItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleResultItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RuleResultItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleResultItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ruleResultItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RuleResultItem"));
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
