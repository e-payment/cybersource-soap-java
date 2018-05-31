/**
 * PayPalTransactionSearchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class PayPalTransactionSearchService  implements java.io.Serializable {
    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String paypalCustomerEmail;

    private java.lang.String paypalReceiptId;

    private java.lang.String transactionID;

    private java.lang.String invoiceNumber;

    private java.lang.String grandTotalAmount;

    private java.lang.String currency;

    private java.lang.String paymentStatus;

    private java.lang.String payerSalutation;

    private java.lang.String payerFirstname;

    private java.lang.String payerMiddlename;

    private java.lang.String payerLastname;

    private java.lang.String payerSuffix;

    private java.lang.String run;  // attribute

    public PayPalTransactionSearchService() {
    }

    public PayPalTransactionSearchService(
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String paypalCustomerEmail,
           java.lang.String paypalReceiptId,
           java.lang.String transactionID,
           java.lang.String invoiceNumber,
           java.lang.String grandTotalAmount,
           java.lang.String currency,
           java.lang.String paymentStatus,
           java.lang.String payerSalutation,
           java.lang.String payerFirstname,
           java.lang.String payerMiddlename,
           java.lang.String payerLastname,
           java.lang.String payerSuffix,
           java.lang.String run) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.paypalCustomerEmail = paypalCustomerEmail;
           this.paypalReceiptId = paypalReceiptId;
           this.transactionID = transactionID;
           this.invoiceNumber = invoiceNumber;
           this.grandTotalAmount = grandTotalAmount;
           this.currency = currency;
           this.paymentStatus = paymentStatus;
           this.payerSalutation = payerSalutation;
           this.payerFirstname = payerFirstname;
           this.payerMiddlename = payerMiddlename;
           this.payerLastname = payerLastname;
           this.payerSuffix = payerSuffix;
           this.run = run;
    }


    /**
     * Gets the startDate value for this PayPalTransactionSearchService.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PayPalTransactionSearchService.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PayPalTransactionSearchService.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PayPalTransactionSearchService.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the paypalCustomerEmail value for this PayPalTransactionSearchService.
     * 
     * @return paypalCustomerEmail
     */
    public java.lang.String getPaypalCustomerEmail() {
        return paypalCustomerEmail;
    }


    /**
     * Sets the paypalCustomerEmail value for this PayPalTransactionSearchService.
     * 
     * @param paypalCustomerEmail
     */
    public void setPaypalCustomerEmail(java.lang.String paypalCustomerEmail) {
        this.paypalCustomerEmail = paypalCustomerEmail;
    }


    /**
     * Gets the paypalReceiptId value for this PayPalTransactionSearchService.
     * 
     * @return paypalReceiptId
     */
    public java.lang.String getPaypalReceiptId() {
        return paypalReceiptId;
    }


    /**
     * Sets the paypalReceiptId value for this PayPalTransactionSearchService.
     * 
     * @param paypalReceiptId
     */
    public void setPaypalReceiptId(java.lang.String paypalReceiptId) {
        this.paypalReceiptId = paypalReceiptId;
    }


    /**
     * Gets the transactionID value for this PayPalTransactionSearchService.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PayPalTransactionSearchService.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the invoiceNumber value for this PayPalTransactionSearchService.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this PayPalTransactionSearchService.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the grandTotalAmount value for this PayPalTransactionSearchService.
     * 
     * @return grandTotalAmount
     */
    public java.lang.String getGrandTotalAmount() {
        return grandTotalAmount;
    }


    /**
     * Sets the grandTotalAmount value for this PayPalTransactionSearchService.
     * 
     * @param grandTotalAmount
     */
    public void setGrandTotalAmount(java.lang.String grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }


    /**
     * Gets the currency value for this PayPalTransactionSearchService.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PayPalTransactionSearchService.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the paymentStatus value for this PayPalTransactionSearchService.
     * 
     * @return paymentStatus
     */
    public java.lang.String getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this PayPalTransactionSearchService.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the payerSalutation value for this PayPalTransactionSearchService.
     * 
     * @return payerSalutation
     */
    public java.lang.String getPayerSalutation() {
        return payerSalutation;
    }


    /**
     * Sets the payerSalutation value for this PayPalTransactionSearchService.
     * 
     * @param payerSalutation
     */
    public void setPayerSalutation(java.lang.String payerSalutation) {
        this.payerSalutation = payerSalutation;
    }


    /**
     * Gets the payerFirstname value for this PayPalTransactionSearchService.
     * 
     * @return payerFirstname
     */
    public java.lang.String getPayerFirstname() {
        return payerFirstname;
    }


    /**
     * Sets the payerFirstname value for this PayPalTransactionSearchService.
     * 
     * @param payerFirstname
     */
    public void setPayerFirstname(java.lang.String payerFirstname) {
        this.payerFirstname = payerFirstname;
    }


    /**
     * Gets the payerMiddlename value for this PayPalTransactionSearchService.
     * 
     * @return payerMiddlename
     */
    public java.lang.String getPayerMiddlename() {
        return payerMiddlename;
    }


    /**
     * Sets the payerMiddlename value for this PayPalTransactionSearchService.
     * 
     * @param payerMiddlename
     */
    public void setPayerMiddlename(java.lang.String payerMiddlename) {
        this.payerMiddlename = payerMiddlename;
    }


    /**
     * Gets the payerLastname value for this PayPalTransactionSearchService.
     * 
     * @return payerLastname
     */
    public java.lang.String getPayerLastname() {
        return payerLastname;
    }


    /**
     * Sets the payerLastname value for this PayPalTransactionSearchService.
     * 
     * @param payerLastname
     */
    public void setPayerLastname(java.lang.String payerLastname) {
        this.payerLastname = payerLastname;
    }


    /**
     * Gets the payerSuffix value for this PayPalTransactionSearchService.
     * 
     * @return payerSuffix
     */
    public java.lang.String getPayerSuffix() {
        return payerSuffix;
    }


    /**
     * Sets the payerSuffix value for this PayPalTransactionSearchService.
     * 
     * @param payerSuffix
     */
    public void setPayerSuffix(java.lang.String payerSuffix) {
        this.payerSuffix = payerSuffix;
    }


    /**
     * Gets the run value for this PayPalTransactionSearchService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this PayPalTransactionSearchService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayPalTransactionSearchService)) return false;
        PayPalTransactionSearchService other = (PayPalTransactionSearchService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.paypalCustomerEmail==null && other.getPaypalCustomerEmail()==null) || 
             (this.paypalCustomerEmail!=null &&
              this.paypalCustomerEmail.equals(other.getPaypalCustomerEmail()))) &&
            ((this.paypalReceiptId==null && other.getPaypalReceiptId()==null) || 
             (this.paypalReceiptId!=null &&
              this.paypalReceiptId.equals(other.getPaypalReceiptId()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.grandTotalAmount==null && other.getGrandTotalAmount()==null) || 
             (this.grandTotalAmount!=null &&
              this.grandTotalAmount.equals(other.getGrandTotalAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.payerSalutation==null && other.getPayerSalutation()==null) || 
             (this.payerSalutation!=null &&
              this.payerSalutation.equals(other.getPayerSalutation()))) &&
            ((this.payerFirstname==null && other.getPayerFirstname()==null) || 
             (this.payerFirstname!=null &&
              this.payerFirstname.equals(other.getPayerFirstname()))) &&
            ((this.payerMiddlename==null && other.getPayerMiddlename()==null) || 
             (this.payerMiddlename!=null &&
              this.payerMiddlename.equals(other.getPayerMiddlename()))) &&
            ((this.payerLastname==null && other.getPayerLastname()==null) || 
             (this.payerLastname!=null &&
              this.payerLastname.equals(other.getPayerLastname()))) &&
            ((this.payerSuffix==null && other.getPayerSuffix()==null) || 
             (this.payerSuffix!=null &&
              this.payerSuffix.equals(other.getPayerSuffix()))) &&
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPaypalCustomerEmail() != null) {
            _hashCode += getPaypalCustomerEmail().hashCode();
        }
        if (getPaypalReceiptId() != null) {
            _hashCode += getPaypalReceiptId().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getGrandTotalAmount() != null) {
            _hashCode += getGrandTotalAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getPayerSalutation() != null) {
            _hashCode += getPayerSalutation().hashCode();
        }
        if (getPayerFirstname() != null) {
            _hashCode += getPayerFirstname().hashCode();
        }
        if (getPayerMiddlename() != null) {
            _hashCode += getPayerMiddlename().hashCode();
        }
        if (getPayerLastname() != null) {
            _hashCode += getPayerLastname().hashCode();
        }
        if (getPayerSuffix() != null) {
            _hashCode += getPayerSuffix().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayPalTransactionSearchService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalTransactionSearchService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalCustomerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalCustomerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalReceiptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypalReceiptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grandTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "grandTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerSalutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerSalutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerFirstname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerFirstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerMiddlename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerMiddlename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerLastname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerLastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerSuffix"));
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
