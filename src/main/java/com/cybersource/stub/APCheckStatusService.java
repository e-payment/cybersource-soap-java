/**
 * APCheckStatusService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APCheckStatusService  implements java.io.Serializable {
    private java.lang.String apInitiateRequestID;

    private java.lang.String reconciliationID;

    private java.lang.String checkStatusRequestID;

    private java.lang.String sessionsRequestID;

    private java.lang.String run;  // attribute

    public APCheckStatusService() {
    }

    public APCheckStatusService(
           java.lang.String apInitiateRequestID,
           java.lang.String reconciliationID,
           java.lang.String checkStatusRequestID,
           java.lang.String sessionsRequestID,
           java.lang.String run) {
           this.apInitiateRequestID = apInitiateRequestID;
           this.reconciliationID = reconciliationID;
           this.checkStatusRequestID = checkStatusRequestID;
           this.sessionsRequestID = sessionsRequestID;
           this.run = run;
    }


    /**
     * Gets the apInitiateRequestID value for this APCheckStatusService.
     * 
     * @return apInitiateRequestID
     */
    public java.lang.String getApInitiateRequestID() {
        return apInitiateRequestID;
    }


    /**
     * Sets the apInitiateRequestID value for this APCheckStatusService.
     * 
     * @param apInitiateRequestID
     */
    public void setApInitiateRequestID(java.lang.String apInitiateRequestID) {
        this.apInitiateRequestID = apInitiateRequestID;
    }


    /**
     * Gets the reconciliationID value for this APCheckStatusService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APCheckStatusService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the checkStatusRequestID value for this APCheckStatusService.
     * 
     * @return checkStatusRequestID
     */
    public java.lang.String getCheckStatusRequestID() {
        return checkStatusRequestID;
    }


    /**
     * Sets the checkStatusRequestID value for this APCheckStatusService.
     * 
     * @param checkStatusRequestID
     */
    public void setCheckStatusRequestID(java.lang.String checkStatusRequestID) {
        this.checkStatusRequestID = checkStatusRequestID;
    }


    /**
     * Gets the sessionsRequestID value for this APCheckStatusService.
     * 
     * @return sessionsRequestID
     */
    public java.lang.String getSessionsRequestID() {
        return sessionsRequestID;
    }


    /**
     * Sets the sessionsRequestID value for this APCheckStatusService.
     * 
     * @param sessionsRequestID
     */
    public void setSessionsRequestID(java.lang.String sessionsRequestID) {
        this.sessionsRequestID = sessionsRequestID;
    }


    /**
     * Gets the run value for this APCheckStatusService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this APCheckStatusService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APCheckStatusService)) return false;
        APCheckStatusService other = (APCheckStatusService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apInitiateRequestID==null && other.getApInitiateRequestID()==null) || 
             (this.apInitiateRequestID!=null &&
              this.apInitiateRequestID.equals(other.getApInitiateRequestID()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.checkStatusRequestID==null && other.getCheckStatusRequestID()==null) || 
             (this.checkStatusRequestID!=null &&
              this.checkStatusRequestID.equals(other.getCheckStatusRequestID()))) &&
            ((this.sessionsRequestID==null && other.getSessionsRequestID()==null) || 
             (this.sessionsRequestID!=null &&
              this.sessionsRequestID.equals(other.getSessionsRequestID()))) &&
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
        if (getApInitiateRequestID() != null) {
            _hashCode += getApInitiateRequestID().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getCheckStatusRequestID() != null) {
            _hashCode += getCheckStatusRequestID().hashCode();
        }
        if (getSessionsRequestID() != null) {
            _hashCode += getSessionsRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APCheckStatusService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckStatusService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apInitiateRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apInitiateRequestID"));
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
        elemField.setFieldName("checkStatusRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "checkStatusRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionsRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sessionsRequestID"));
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
