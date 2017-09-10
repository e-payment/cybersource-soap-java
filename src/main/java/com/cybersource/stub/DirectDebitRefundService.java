/**
 * DirectDebitRefundService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class DirectDebitRefundService  implements java.io.Serializable {
    private java.lang.String directDebitRequestID;

    private java.lang.String reconciliationID;

    private java.lang.String directDebitRequestToken;

    private java.lang.String directDebitType;

    private java.lang.String recurringType;

    private java.lang.String mandateID;

    private java.lang.String mandateAuthenticationDate;

    private java.lang.String run;  // attribute

    public DirectDebitRefundService() {
    }

    public DirectDebitRefundService(
           java.lang.String directDebitRequestID,
           java.lang.String reconciliationID,
           java.lang.String directDebitRequestToken,
           java.lang.String directDebitType,
           java.lang.String recurringType,
           java.lang.String mandateID,
           java.lang.String mandateAuthenticationDate,
           java.lang.String run) {
           this.directDebitRequestID = directDebitRequestID;
           this.reconciliationID = reconciliationID;
           this.directDebitRequestToken = directDebitRequestToken;
           this.directDebitType = directDebitType;
           this.recurringType = recurringType;
           this.mandateID = mandateID;
           this.mandateAuthenticationDate = mandateAuthenticationDate;
           this.run = run;
    }


    /**
     * Gets the directDebitRequestID value for this DirectDebitRefundService.
     * 
     * @return directDebitRequestID
     */
    public java.lang.String getDirectDebitRequestID() {
        return directDebitRequestID;
    }


    /**
     * Sets the directDebitRequestID value for this DirectDebitRefundService.
     * 
     * @param directDebitRequestID
     */
    public void setDirectDebitRequestID(java.lang.String directDebitRequestID) {
        this.directDebitRequestID = directDebitRequestID;
    }


    /**
     * Gets the reconciliationID value for this DirectDebitRefundService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this DirectDebitRefundService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the directDebitRequestToken value for this DirectDebitRefundService.
     * 
     * @return directDebitRequestToken
     */
    public java.lang.String getDirectDebitRequestToken() {
        return directDebitRequestToken;
    }


    /**
     * Sets the directDebitRequestToken value for this DirectDebitRefundService.
     * 
     * @param directDebitRequestToken
     */
    public void setDirectDebitRequestToken(java.lang.String directDebitRequestToken) {
        this.directDebitRequestToken = directDebitRequestToken;
    }


    /**
     * Gets the directDebitType value for this DirectDebitRefundService.
     * 
     * @return directDebitType
     */
    public java.lang.String getDirectDebitType() {
        return directDebitType;
    }


    /**
     * Sets the directDebitType value for this DirectDebitRefundService.
     * 
     * @param directDebitType
     */
    public void setDirectDebitType(java.lang.String directDebitType) {
        this.directDebitType = directDebitType;
    }


    /**
     * Gets the recurringType value for this DirectDebitRefundService.
     * 
     * @return recurringType
     */
    public java.lang.String getRecurringType() {
        return recurringType;
    }


    /**
     * Sets the recurringType value for this DirectDebitRefundService.
     * 
     * @param recurringType
     */
    public void setRecurringType(java.lang.String recurringType) {
        this.recurringType = recurringType;
    }


    /**
     * Gets the mandateID value for this DirectDebitRefundService.
     * 
     * @return mandateID
     */
    public java.lang.String getMandateID() {
        return mandateID;
    }


    /**
     * Sets the mandateID value for this DirectDebitRefundService.
     * 
     * @param mandateID
     */
    public void setMandateID(java.lang.String mandateID) {
        this.mandateID = mandateID;
    }


    /**
     * Gets the mandateAuthenticationDate value for this DirectDebitRefundService.
     * 
     * @return mandateAuthenticationDate
     */
    public java.lang.String getMandateAuthenticationDate() {
        return mandateAuthenticationDate;
    }


    /**
     * Sets the mandateAuthenticationDate value for this DirectDebitRefundService.
     * 
     * @param mandateAuthenticationDate
     */
    public void setMandateAuthenticationDate(java.lang.String mandateAuthenticationDate) {
        this.mandateAuthenticationDate = mandateAuthenticationDate;
    }


    /**
     * Gets the run value for this DirectDebitRefundService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this DirectDebitRefundService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitRefundService)) return false;
        DirectDebitRefundService other = (DirectDebitRefundService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.directDebitRequestID==null && other.getDirectDebitRequestID()==null) || 
             (this.directDebitRequestID!=null &&
              this.directDebitRequestID.equals(other.getDirectDebitRequestID()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.directDebitRequestToken==null && other.getDirectDebitRequestToken()==null) || 
             (this.directDebitRequestToken!=null &&
              this.directDebitRequestToken.equals(other.getDirectDebitRequestToken()))) &&
            ((this.directDebitType==null && other.getDirectDebitType()==null) || 
             (this.directDebitType!=null &&
              this.directDebitType.equals(other.getDirectDebitType()))) &&
            ((this.recurringType==null && other.getRecurringType()==null) || 
             (this.recurringType!=null &&
              this.recurringType.equals(other.getRecurringType()))) &&
            ((this.mandateID==null && other.getMandateID()==null) || 
             (this.mandateID!=null &&
              this.mandateID.equals(other.getMandateID()))) &&
            ((this.mandateAuthenticationDate==null && other.getMandateAuthenticationDate()==null) || 
             (this.mandateAuthenticationDate!=null &&
              this.mandateAuthenticationDate.equals(other.getMandateAuthenticationDate()))) &&
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
        if (getDirectDebitRequestID() != null) {
            _hashCode += getDirectDebitRequestID().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getDirectDebitRequestToken() != null) {
            _hashCode += getDirectDebitRequestToken().hashCode();
        }
        if (getDirectDebitType() != null) {
            _hashCode += getDirectDebitType().hashCode();
        }
        if (getRecurringType() != null) {
            _hashCode += getRecurringType().hashCode();
        }
        if (getMandateID() != null) {
            _hashCode += getMandateID().hashCode();
        }
        if (getMandateAuthenticationDate() != null) {
            _hashCode += getMandateAuthenticationDate().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitRefundService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitRefundService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitRequestID"));
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
        elemField.setFieldName("directDebitRequestToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitRequestToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "recurringType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "mandateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateAuthenticationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "mandateAuthenticationDate"));
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
