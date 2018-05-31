/**
 * CCDCCUpdateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCDCCUpdateService  implements java.io.Serializable {
    private java.lang.String reason;

    private java.lang.String action;

    private java.lang.String dccRequestID;

    private java.lang.String captureRequestID;

    private java.lang.String creditRequestID;

    private java.lang.String run;  // attribute

    public CCDCCUpdateService() {
    }

    public CCDCCUpdateService(
           java.lang.String reason,
           java.lang.String action,
           java.lang.String dccRequestID,
           java.lang.String captureRequestID,
           java.lang.String creditRequestID,
           java.lang.String run) {
           this.reason = reason;
           this.action = action;
           this.dccRequestID = dccRequestID;
           this.captureRequestID = captureRequestID;
           this.creditRequestID = creditRequestID;
           this.run = run;
    }


    /**
     * Gets the reason value for this CCDCCUpdateService.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this CCDCCUpdateService.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the action value for this CCDCCUpdateService.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CCDCCUpdateService.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the dccRequestID value for this CCDCCUpdateService.
     * 
     * @return dccRequestID
     */
    public java.lang.String getDccRequestID() {
        return dccRequestID;
    }


    /**
     * Sets the dccRequestID value for this CCDCCUpdateService.
     * 
     * @param dccRequestID
     */
    public void setDccRequestID(java.lang.String dccRequestID) {
        this.dccRequestID = dccRequestID;
    }


    /**
     * Gets the captureRequestID value for this CCDCCUpdateService.
     * 
     * @return captureRequestID
     */
    public java.lang.String getCaptureRequestID() {
        return captureRequestID;
    }


    /**
     * Sets the captureRequestID value for this CCDCCUpdateService.
     * 
     * @param captureRequestID
     */
    public void setCaptureRequestID(java.lang.String captureRequestID) {
        this.captureRequestID = captureRequestID;
    }


    /**
     * Gets the creditRequestID value for this CCDCCUpdateService.
     * 
     * @return creditRequestID
     */
    public java.lang.String getCreditRequestID() {
        return creditRequestID;
    }


    /**
     * Sets the creditRequestID value for this CCDCCUpdateService.
     * 
     * @param creditRequestID
     */
    public void setCreditRequestID(java.lang.String creditRequestID) {
        this.creditRequestID = creditRequestID;
    }


    /**
     * Gets the run value for this CCDCCUpdateService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this CCDCCUpdateService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCDCCUpdateService)) return false;
        CCDCCUpdateService other = (CCDCCUpdateService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.dccRequestID==null && other.getDccRequestID()==null) || 
             (this.dccRequestID!=null &&
              this.dccRequestID.equals(other.getDccRequestID()))) &&
            ((this.captureRequestID==null && other.getCaptureRequestID()==null) || 
             (this.captureRequestID!=null &&
              this.captureRequestID.equals(other.getCaptureRequestID()))) &&
            ((this.creditRequestID==null && other.getCreditRequestID()==null) || 
             (this.creditRequestID!=null &&
              this.creditRequestID.equals(other.getCreditRequestID()))) &&
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getDccRequestID() != null) {
            _hashCode += getDccRequestID().hashCode();
        }
        if (getCaptureRequestID() != null) {
            _hashCode += getCaptureRequestID().hashCode();
        }
        if (getCreditRequestID() != null) {
            _hashCode += getCreditRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCDCCUpdateService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCUpdateService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dccRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dccRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "captureRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "creditRequestID"));
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
