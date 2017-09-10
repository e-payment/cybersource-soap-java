/**
 * APAuthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APAuthService  implements java.io.Serializable {
    private java.lang.String cancelURL;

    private java.lang.String successURL;

    private java.lang.String failureURL;

    private java.lang.String overridePaymentMethod;

    private java.lang.String reconciliationID;

    private java.lang.String preapprovalToken;

    private java.lang.String orderRequestID;

    private java.lang.String run;  // attribute

    public APAuthService() {
    }

    public APAuthService(
           java.lang.String cancelURL,
           java.lang.String successURL,
           java.lang.String failureURL,
           java.lang.String overridePaymentMethod,
           java.lang.String reconciliationID,
           java.lang.String preapprovalToken,
           java.lang.String orderRequestID,
           java.lang.String run) {
           this.cancelURL = cancelURL;
           this.successURL = successURL;
           this.failureURL = failureURL;
           this.overridePaymentMethod = overridePaymentMethod;
           this.reconciliationID = reconciliationID;
           this.preapprovalToken = preapprovalToken;
           this.orderRequestID = orderRequestID;
           this.run = run;
    }


    /**
     * Gets the cancelURL value for this APAuthService.
     * 
     * @return cancelURL
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this APAuthService.
     * 
     * @param cancelURL
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the successURL value for this APAuthService.
     * 
     * @return successURL
     */
    public java.lang.String getSuccessURL() {
        return successURL;
    }


    /**
     * Sets the successURL value for this APAuthService.
     * 
     * @param successURL
     */
    public void setSuccessURL(java.lang.String successURL) {
        this.successURL = successURL;
    }


    /**
     * Gets the failureURL value for this APAuthService.
     * 
     * @return failureURL
     */
    public java.lang.String getFailureURL() {
        return failureURL;
    }


    /**
     * Sets the failureURL value for this APAuthService.
     * 
     * @param failureURL
     */
    public void setFailureURL(java.lang.String failureURL) {
        this.failureURL = failureURL;
    }


    /**
     * Gets the overridePaymentMethod value for this APAuthService.
     * 
     * @return overridePaymentMethod
     */
    public java.lang.String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }


    /**
     * Sets the overridePaymentMethod value for this APAuthService.
     * 
     * @param overridePaymentMethod
     */
    public void setOverridePaymentMethod(java.lang.String overridePaymentMethod) {
        this.overridePaymentMethod = overridePaymentMethod;
    }


    /**
     * Gets the reconciliationID value for this APAuthService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APAuthService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the preapprovalToken value for this APAuthService.
     * 
     * @return preapprovalToken
     */
    public java.lang.String getPreapprovalToken() {
        return preapprovalToken;
    }


    /**
     * Sets the preapprovalToken value for this APAuthService.
     * 
     * @param preapprovalToken
     */
    public void setPreapprovalToken(java.lang.String preapprovalToken) {
        this.preapprovalToken = preapprovalToken;
    }


    /**
     * Gets the orderRequestID value for this APAuthService.
     * 
     * @return orderRequestID
     */
    public java.lang.String getOrderRequestID() {
        return orderRequestID;
    }


    /**
     * Sets the orderRequestID value for this APAuthService.
     * 
     * @param orderRequestID
     */
    public void setOrderRequestID(java.lang.String orderRequestID) {
        this.orderRequestID = orderRequestID;
    }


    /**
     * Gets the run value for this APAuthService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this APAuthService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APAuthService)) return false;
        APAuthService other = (APAuthService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.successURL==null && other.getSuccessURL()==null) || 
             (this.successURL!=null &&
              this.successURL.equals(other.getSuccessURL()))) &&
            ((this.failureURL==null && other.getFailureURL()==null) || 
             (this.failureURL!=null &&
              this.failureURL.equals(other.getFailureURL()))) &&
            ((this.overridePaymentMethod==null && other.getOverridePaymentMethod()==null) || 
             (this.overridePaymentMethod!=null &&
              this.overridePaymentMethod.equals(other.getOverridePaymentMethod()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.preapprovalToken==null && other.getPreapprovalToken()==null) || 
             (this.preapprovalToken!=null &&
              this.preapprovalToken.equals(other.getPreapprovalToken()))) &&
            ((this.orderRequestID==null && other.getOrderRequestID()==null) || 
             (this.orderRequestID!=null &&
              this.orderRequestID.equals(other.getOrderRequestID()))) &&
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
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getSuccessURL() != null) {
            _hashCode += getSuccessURL().hashCode();
        }
        if (getFailureURL() != null) {
            _hashCode += getFailureURL().hashCode();
        }
        if (getOverridePaymentMethod() != null) {
            _hashCode += getOverridePaymentMethod().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getPreapprovalToken() != null) {
            _hashCode += getPreapprovalToken().hashCode();
        }
        if (getOrderRequestID() != null) {
            _hashCode += getOrderRequestID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APAuthService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cancelURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "successURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "failureURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridePaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "overridePaymentMethod"));
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
        elemField.setFieldName("preapprovalToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "preapprovalToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderRequestID"));
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
