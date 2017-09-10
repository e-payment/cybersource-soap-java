/**
 * FraudUpdateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class FraudUpdateService  implements java.io.Serializable {
    private java.lang.String actionCode;

    private java.lang.String markedData;

    private java.lang.String markingReason;

    private java.lang.String markingNotes;

    private java.lang.String markingRequestID;

    private java.lang.String run;  // attribute

    public FraudUpdateService() {
    }

    public FraudUpdateService(
           java.lang.String actionCode,
           java.lang.String markedData,
           java.lang.String markingReason,
           java.lang.String markingNotes,
           java.lang.String markingRequestID,
           java.lang.String run) {
           this.actionCode = actionCode;
           this.markedData = markedData;
           this.markingReason = markingReason;
           this.markingNotes = markingNotes;
           this.markingRequestID = markingRequestID;
           this.run = run;
    }


    /**
     * Gets the actionCode value for this FraudUpdateService.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this FraudUpdateService.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }


    /**
     * Gets the markedData value for this FraudUpdateService.
     * 
     * @return markedData
     */
    public java.lang.String getMarkedData() {
        return markedData;
    }


    /**
     * Sets the markedData value for this FraudUpdateService.
     * 
     * @param markedData
     */
    public void setMarkedData(java.lang.String markedData) {
        this.markedData = markedData;
    }


    /**
     * Gets the markingReason value for this FraudUpdateService.
     * 
     * @return markingReason
     */
    public java.lang.String getMarkingReason() {
        return markingReason;
    }


    /**
     * Sets the markingReason value for this FraudUpdateService.
     * 
     * @param markingReason
     */
    public void setMarkingReason(java.lang.String markingReason) {
        this.markingReason = markingReason;
    }


    /**
     * Gets the markingNotes value for this FraudUpdateService.
     * 
     * @return markingNotes
     */
    public java.lang.String getMarkingNotes() {
        return markingNotes;
    }


    /**
     * Sets the markingNotes value for this FraudUpdateService.
     * 
     * @param markingNotes
     */
    public void setMarkingNotes(java.lang.String markingNotes) {
        this.markingNotes = markingNotes;
    }


    /**
     * Gets the markingRequestID value for this FraudUpdateService.
     * 
     * @return markingRequestID
     */
    public java.lang.String getMarkingRequestID() {
        return markingRequestID;
    }


    /**
     * Sets the markingRequestID value for this FraudUpdateService.
     * 
     * @param markingRequestID
     */
    public void setMarkingRequestID(java.lang.String markingRequestID) {
        this.markingRequestID = markingRequestID;
    }


    /**
     * Gets the run value for this FraudUpdateService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this FraudUpdateService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FraudUpdateService)) return false;
        FraudUpdateService other = (FraudUpdateService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode()))) &&
            ((this.markedData==null && other.getMarkedData()==null) || 
             (this.markedData!=null &&
              this.markedData.equals(other.getMarkedData()))) &&
            ((this.markingReason==null && other.getMarkingReason()==null) || 
             (this.markingReason!=null &&
              this.markingReason.equals(other.getMarkingReason()))) &&
            ((this.markingNotes==null && other.getMarkingNotes()==null) || 
             (this.markingNotes!=null &&
              this.markingNotes.equals(other.getMarkingNotes()))) &&
            ((this.markingRequestID==null && other.getMarkingRequestID()==null) || 
             (this.markingRequestID!=null &&
              this.markingRequestID.equals(other.getMarkingRequestID()))) &&
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
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        if (getMarkedData() != null) {
            _hashCode += getMarkedData().hashCode();
        }
        if (getMarkingReason() != null) {
            _hashCode += getMarkingReason().hashCode();
        }
        if (getMarkingNotes() != null) {
            _hashCode += getMarkingNotes().hashCode();
        }
        if (getMarkingRequestID() != null) {
            _hashCode += getMarkingRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FraudUpdateService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FraudUpdateService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "actionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "markedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "markingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markingNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "markingNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markingRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "markingRequestID"));
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
