/**
 * APRefundService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APRefundService  implements java.io.Serializable {
    private java.lang.String captureRequestID;

    private java.lang.String refundRequestID;

    private java.lang.String reason;

    private java.lang.String note;

    private java.lang.String apInitiateRequestID;

    private java.lang.String returnRef;

    private java.lang.String reconciliationID;

    private java.lang.String saleRequestID;

    private java.lang.String run;  // attribute

    public APRefundService() {
    }

    public APRefundService(
           java.lang.String captureRequestID,
           java.lang.String refundRequestID,
           java.lang.String reason,
           java.lang.String note,
           java.lang.String apInitiateRequestID,
           java.lang.String returnRef,
           java.lang.String reconciliationID,
           java.lang.String saleRequestID,
           java.lang.String run) {
           this.captureRequestID = captureRequestID;
           this.refundRequestID = refundRequestID;
           this.reason = reason;
           this.note = note;
           this.apInitiateRequestID = apInitiateRequestID;
           this.returnRef = returnRef;
           this.reconciliationID = reconciliationID;
           this.saleRequestID = saleRequestID;
           this.run = run;
    }


    /**
     * Gets the captureRequestID value for this APRefundService.
     * 
     * @return captureRequestID
     */
    public java.lang.String getCaptureRequestID() {
        return captureRequestID;
    }


    /**
     * Sets the captureRequestID value for this APRefundService.
     * 
     * @param captureRequestID
     */
    public void setCaptureRequestID(java.lang.String captureRequestID) {
        this.captureRequestID = captureRequestID;
    }


    /**
     * Gets the refundRequestID value for this APRefundService.
     * 
     * @return refundRequestID
     */
    public java.lang.String getRefundRequestID() {
        return refundRequestID;
    }


    /**
     * Sets the refundRequestID value for this APRefundService.
     * 
     * @param refundRequestID
     */
    public void setRefundRequestID(java.lang.String refundRequestID) {
        this.refundRequestID = refundRequestID;
    }


    /**
     * Gets the reason value for this APRefundService.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this APRefundService.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the note value for this APRefundService.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this APRefundService.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the apInitiateRequestID value for this APRefundService.
     * 
     * @return apInitiateRequestID
     */
    public java.lang.String getApInitiateRequestID() {
        return apInitiateRequestID;
    }


    /**
     * Sets the apInitiateRequestID value for this APRefundService.
     * 
     * @param apInitiateRequestID
     */
    public void setApInitiateRequestID(java.lang.String apInitiateRequestID) {
        this.apInitiateRequestID = apInitiateRequestID;
    }


    /**
     * Gets the returnRef value for this APRefundService.
     * 
     * @return returnRef
     */
    public java.lang.String getReturnRef() {
        return returnRef;
    }


    /**
     * Sets the returnRef value for this APRefundService.
     * 
     * @param returnRef
     */
    public void setReturnRef(java.lang.String returnRef) {
        this.returnRef = returnRef;
    }


    /**
     * Gets the reconciliationID value for this APRefundService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APRefundService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the saleRequestID value for this APRefundService.
     * 
     * @return saleRequestID
     */
    public java.lang.String getSaleRequestID() {
        return saleRequestID;
    }


    /**
     * Sets the saleRequestID value for this APRefundService.
     * 
     * @param saleRequestID
     */
    public void setSaleRequestID(java.lang.String saleRequestID) {
        this.saleRequestID = saleRequestID;
    }


    /**
     * Gets the run value for this APRefundService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this APRefundService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APRefundService)) return false;
        APRefundService other = (APRefundService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.captureRequestID==null && other.getCaptureRequestID()==null) || 
             (this.captureRequestID!=null &&
              this.captureRequestID.equals(other.getCaptureRequestID()))) &&
            ((this.refundRequestID==null && other.getRefundRequestID()==null) || 
             (this.refundRequestID!=null &&
              this.refundRequestID.equals(other.getRefundRequestID()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.apInitiateRequestID==null && other.getApInitiateRequestID()==null) || 
             (this.apInitiateRequestID!=null &&
              this.apInitiateRequestID.equals(other.getApInitiateRequestID()))) &&
            ((this.returnRef==null && other.getReturnRef()==null) || 
             (this.returnRef!=null &&
              this.returnRef.equals(other.getReturnRef()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.saleRequestID==null && other.getSaleRequestID()==null) || 
             (this.saleRequestID!=null &&
              this.saleRequestID.equals(other.getSaleRequestID()))) &&
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
        if (getCaptureRequestID() != null) {
            _hashCode += getCaptureRequestID().hashCode();
        }
        if (getRefundRequestID() != null) {
            _hashCode += getRefundRequestID().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getApInitiateRequestID() != null) {
            _hashCode += getApInitiateRequestID().hashCode();
        }
        if (getReturnRef() != null) {
            _hashCode += getReturnRef().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getSaleRequestID() != null) {
            _hashCode += getSaleRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APRefundService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APRefundService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "captureRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "refundRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apInitiateRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apInitiateRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "returnRef"));
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
        elemField.setFieldName("saleRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "saleRequestID"));
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
