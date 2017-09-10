/**
 * APInitiateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APInitiateService  implements java.io.Serializable {
    private java.lang.String returnURL;

    private java.lang.String productName;

    private java.lang.String productDescription;

    private java.lang.String reconciliationID;

    private java.lang.String bankID;

    private java.lang.String countryCode;

    private java.lang.String escrowAgreement;

    private java.lang.String languageInterface;

    private java.lang.String intent;

    private java.lang.String successURL;

    private java.lang.String cancelURL;

    private java.lang.String failureURL;

    private java.lang.String overridePaymentMethod;

    private java.lang.String run;  // attribute

    public APInitiateService() {
    }

    public APInitiateService(
           java.lang.String returnURL,
           java.lang.String productName,
           java.lang.String productDescription,
           java.lang.String reconciliationID,
           java.lang.String bankID,
           java.lang.String countryCode,
           java.lang.String escrowAgreement,
           java.lang.String languageInterface,
           java.lang.String intent,
           java.lang.String successURL,
           java.lang.String cancelURL,
           java.lang.String failureURL,
           java.lang.String overridePaymentMethod,
           java.lang.String run) {
           this.returnURL = returnURL;
           this.productName = productName;
           this.productDescription = productDescription;
           this.reconciliationID = reconciliationID;
           this.bankID = bankID;
           this.countryCode = countryCode;
           this.escrowAgreement = escrowAgreement;
           this.languageInterface = languageInterface;
           this.intent = intent;
           this.successURL = successURL;
           this.cancelURL = cancelURL;
           this.failureURL = failureURL;
           this.overridePaymentMethod = overridePaymentMethod;
           this.run = run;
    }


    /**
     * Gets the returnURL value for this APInitiateService.
     * 
     * @return returnURL
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this APInitiateService.
     * 
     * @param returnURL
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the productName value for this APInitiateService.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this APInitiateService.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productDescription value for this APInitiateService.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this APInitiateService.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the reconciliationID value for this APInitiateService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this APInitiateService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the bankID value for this APInitiateService.
     * 
     * @return bankID
     */
    public java.lang.String getBankID() {
        return bankID;
    }


    /**
     * Sets the bankID value for this APInitiateService.
     * 
     * @param bankID
     */
    public void setBankID(java.lang.String bankID) {
        this.bankID = bankID;
    }


    /**
     * Gets the countryCode value for this APInitiateService.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this APInitiateService.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the escrowAgreement value for this APInitiateService.
     * 
     * @return escrowAgreement
     */
    public java.lang.String getEscrowAgreement() {
        return escrowAgreement;
    }


    /**
     * Sets the escrowAgreement value for this APInitiateService.
     * 
     * @param escrowAgreement
     */
    public void setEscrowAgreement(java.lang.String escrowAgreement) {
        this.escrowAgreement = escrowAgreement;
    }


    /**
     * Gets the languageInterface value for this APInitiateService.
     * 
     * @return languageInterface
     */
    public java.lang.String getLanguageInterface() {
        return languageInterface;
    }


    /**
     * Sets the languageInterface value for this APInitiateService.
     * 
     * @param languageInterface
     */
    public void setLanguageInterface(java.lang.String languageInterface) {
        this.languageInterface = languageInterface;
    }


    /**
     * Gets the intent value for this APInitiateService.
     * 
     * @return intent
     */
    public java.lang.String getIntent() {
        return intent;
    }


    /**
     * Sets the intent value for this APInitiateService.
     * 
     * @param intent
     */
    public void setIntent(java.lang.String intent) {
        this.intent = intent;
    }


    /**
     * Gets the successURL value for this APInitiateService.
     * 
     * @return successURL
     */
    public java.lang.String getSuccessURL() {
        return successURL;
    }


    /**
     * Sets the successURL value for this APInitiateService.
     * 
     * @param successURL
     */
    public void setSuccessURL(java.lang.String successURL) {
        this.successURL = successURL;
    }


    /**
     * Gets the cancelURL value for this APInitiateService.
     * 
     * @return cancelURL
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this APInitiateService.
     * 
     * @param cancelURL
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the failureURL value for this APInitiateService.
     * 
     * @return failureURL
     */
    public java.lang.String getFailureURL() {
        return failureURL;
    }


    /**
     * Sets the failureURL value for this APInitiateService.
     * 
     * @param failureURL
     */
    public void setFailureURL(java.lang.String failureURL) {
        this.failureURL = failureURL;
    }


    /**
     * Gets the overridePaymentMethod value for this APInitiateService.
     * 
     * @return overridePaymentMethod
     */
    public java.lang.String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }


    /**
     * Sets the overridePaymentMethod value for this APInitiateService.
     * 
     * @param overridePaymentMethod
     */
    public void setOverridePaymentMethod(java.lang.String overridePaymentMethod) {
        this.overridePaymentMethod = overridePaymentMethod;
    }


    /**
     * Gets the run value for this APInitiateService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this APInitiateService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APInitiateService)) return false;
        APInitiateService other = (APInitiateService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.bankID==null && other.getBankID()==null) || 
             (this.bankID!=null &&
              this.bankID.equals(other.getBankID()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.escrowAgreement==null && other.getEscrowAgreement()==null) || 
             (this.escrowAgreement!=null &&
              this.escrowAgreement.equals(other.getEscrowAgreement()))) &&
            ((this.languageInterface==null && other.getLanguageInterface()==null) || 
             (this.languageInterface!=null &&
              this.languageInterface.equals(other.getLanguageInterface()))) &&
            ((this.intent==null && other.getIntent()==null) || 
             (this.intent!=null &&
              this.intent.equals(other.getIntent()))) &&
            ((this.successURL==null && other.getSuccessURL()==null) || 
             (this.successURL!=null &&
              this.successURL.equals(other.getSuccessURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.failureURL==null && other.getFailureURL()==null) || 
             (this.failureURL!=null &&
              this.failureURL.equals(other.getFailureURL()))) &&
            ((this.overridePaymentMethod==null && other.getOverridePaymentMethod()==null) || 
             (this.overridePaymentMethod!=null &&
              this.overridePaymentMethod.equals(other.getOverridePaymentMethod()))) &&
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
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getBankID() != null) {
            _hashCode += getBankID().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getEscrowAgreement() != null) {
            _hashCode += getEscrowAgreement().hashCode();
        }
        if (getLanguageInterface() != null) {
            _hashCode += getLanguageInterface().hashCode();
        }
        if (getIntent() != null) {
            _hashCode += getIntent().hashCode();
        }
        if (getSuccessURL() != null) {
            _hashCode += getSuccessURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getFailureURL() != null) {
            _hashCode += getFailureURL().hashCode();
        }
        if (getOverridePaymentMethod() != null) {
            _hashCode += getOverridePaymentMethod().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APInitiateService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APInitiateService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "returnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productDescription"));
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
        elemField.setFieldName("bankID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escrowAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "escrowAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageInterface");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "languageInterface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "intent"));
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
        elemField.setFieldName("cancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cancelURL"));
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
