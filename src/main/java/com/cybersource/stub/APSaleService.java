/**
 * APSaleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APSaleService  implements java.io.Serializable {
    private java.lang.String cancelURL;

    private java.lang.String successURL;

    private java.lang.String failureURL;

    private java.lang.String reconciliationID;

    private java.lang.String overridePaymentMethod;

    private java.lang.String paymentOptionID;

    private java.lang.String transactionTimeout;

    private java.lang.String orderRequestID;

    private java.lang.String billingAgreementID;

    private java.lang.String run;  // attribute

    public APSaleService() {
    }

    public APSaleService(
           java.lang.String cancelURL,
           java.lang.String successURL,
           java.lang.String failureURL,
           java.lang.String reconciliationID,
           java.lang.String overridePaymentMethod,
           java.lang.String paymentOptionID,
           java.lang.String transactionTimeout,
           java.lang.String orderRequestID,
           java.lang.String billingAgreementID,
           java.lang.String run) {
           this.cancelURL = cancelURL;
           this.successURL = successURL;
           this.failureURL = failureURL;
           this.reconciliationID = reconciliationID;
           this.overridePaymentMethod = overridePaymentMethod;
           this.paymentOptionID = paymentOptionID;
           this.transactionTimeout = transactionTimeout;
           this.orderRequestID = orderRequestID;
           this.billingAgreementID = billingAgreementID;
           this.run = run;
    }


    /**
     * Gets the cancelURL value for this APSaleService.
     * 
     * @return cancelURL
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this APSaleService.
     * 
     * @param cancelURL
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the successURL value for this APSaleService.
     * 
     * @return successURL
     */
    public java.lang.String getSuccessURL() {
        return successURL;
    }


    /**
     * Sets the successURL value for this APSaleService.
     * 
     * @param successURL
     */
    public void setSuccessURL(java.lang.String successURL) {
        this.successURL = successURL;
    }


    /**
     * Gets the failureURL value for this APSaleService.
     * 
     * @return failureURL
     */
    public java.lang.String getFailureURL() {
        return failureURL;
    }


    /**
     * Sets the failureURL value for this APSaleService.
     * 
     * @param failureURL
     */
    public void setFailureURL(java.lang.String failureURL) {
        this.failureURL = failureURL;
    }


    /**
     * Gets the reconciliationID value for this APSaleService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APSaleService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the overridePaymentMethod value for this APSaleService.
     * 
     * @return overridePaymentMethod
     */
    public java.lang.String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }


    /**
     * Sets the overridePaymentMethod value for this APSaleService.
     * 
     * @param overridePaymentMethod
     */
    public void setOverridePaymentMethod(java.lang.String overridePaymentMethod) {
        this.overridePaymentMethod = overridePaymentMethod;
    }


    /**
     * Gets the paymentOptionID value for this APSaleService.
     * 
     * @return paymentOptionID
     */
    public java.lang.String getPaymentOptionID() {
        return paymentOptionID;
    }


    /**
     * Sets the paymentOptionID value for this APSaleService.
     * 
     * @param paymentOptionID
     */
    public void setPaymentOptionID(java.lang.String paymentOptionID) {
        this.paymentOptionID = paymentOptionID;
    }


    /**
     * Gets the transactionTimeout value for this APSaleService.
     * 
     * @return transactionTimeout
     */
    public java.lang.String getTransactionTimeout() {
        return transactionTimeout;
    }


    /**
     * Sets the transactionTimeout value for this APSaleService.
     * 
     * @param transactionTimeout
     */
    public void setTransactionTimeout(java.lang.String transactionTimeout) {
        this.transactionTimeout = transactionTimeout;
    }


    /**
     * Gets the orderRequestID value for this APSaleService.
     * 
     * @return orderRequestID
     */
    public java.lang.String getOrderRequestID() {
        return orderRequestID;
    }


    /**
     * Sets the orderRequestID value for this APSaleService.
     * 
     * @param orderRequestID
     */
    public void setOrderRequestID(java.lang.String orderRequestID) {
        this.orderRequestID = orderRequestID;
    }


    /**
     * Gets the billingAgreementID value for this APSaleService.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this APSaleService.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the run value for this APSaleService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this APSaleService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APSaleService)) return false;
        APSaleService other = (APSaleService) obj;
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
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.overridePaymentMethod==null && other.getOverridePaymentMethod()==null) || 
             (this.overridePaymentMethod!=null &&
              this.overridePaymentMethod.equals(other.getOverridePaymentMethod()))) &&
            ((this.paymentOptionID==null && other.getPaymentOptionID()==null) || 
             (this.paymentOptionID!=null &&
              this.paymentOptionID.equals(other.getPaymentOptionID()))) &&
            ((this.transactionTimeout==null && other.getTransactionTimeout()==null) || 
             (this.transactionTimeout!=null &&
              this.transactionTimeout.equals(other.getTransactionTimeout()))) &&
            ((this.orderRequestID==null && other.getOrderRequestID()==null) || 
             (this.orderRequestID!=null &&
              this.orderRequestID.equals(other.getOrderRequestID()))) &&
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
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
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getOverridePaymentMethod() != null) {
            _hashCode += getOverridePaymentMethod().hashCode();
        }
        if (getPaymentOptionID() != null) {
            _hashCode += getPaymentOptionID().hashCode();
        }
        if (getTransactionTimeout() != null) {
            _hashCode += getTransactionTimeout().hashCode();
        }
        if (getOrderRequestID() != null) {
            _hashCode += getOrderRequestID().hashCode();
        }
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APSaleService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSaleService"));
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
        elemField.setFieldName("reconciliationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reconciliationID"));
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
        elemField.setFieldName("paymentOptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentOptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionTimeout"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingAgreementID"));
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
