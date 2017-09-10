/**
 * OCTReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class OCTReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String requestDateTime;

    private java.lang.String reconciliationID;

    private java.lang.String processorResponse;

    private java.lang.String approvalCode;

    private java.lang.String amount;

    private java.lang.String paymentNetworkTransactionID;

    private java.lang.String prepaidBalanceCurrency;

    private java.lang.String prepaidBalanceAmount;

    private java.lang.String processorResponseSource;

    private java.lang.String reconciliationIdType;

    public OCTReply() {
    }

    public OCTReply(
           java.math.BigInteger reasonCode,
           java.lang.String requestDateTime,
           java.lang.String reconciliationID,
           java.lang.String processorResponse,
           java.lang.String approvalCode,
           java.lang.String amount,
           java.lang.String paymentNetworkTransactionID,
           java.lang.String prepaidBalanceCurrency,
           java.lang.String prepaidBalanceAmount,
           java.lang.String processorResponseSource,
           java.lang.String reconciliationIdType) {
           this.reasonCode = reasonCode;
           this.requestDateTime = requestDateTime;
           this.reconciliationID = reconciliationID;
           this.processorResponse = processorResponse;
           this.approvalCode = approvalCode;
           this.amount = amount;
           this.paymentNetworkTransactionID = paymentNetworkTransactionID;
           this.prepaidBalanceCurrency = prepaidBalanceCurrency;
           this.prepaidBalanceAmount = prepaidBalanceAmount;
           this.processorResponseSource = processorResponseSource;
           this.reconciliationIdType = reconciliationIdType;
    }


    /**
     * Gets the reasonCode value for this OCTReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this OCTReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the requestDateTime value for this OCTReply.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this OCTReply.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the reconciliationID value for this OCTReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this OCTReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the processorResponse value for this OCTReply.
     * 
     * @return processorResponse
     */
    public java.lang.String getProcessorResponse() {
        return processorResponse;
    }


    /**
     * Sets the processorResponse value for this OCTReply.
     * 
     * @param processorResponse
     */
    public void setProcessorResponse(java.lang.String processorResponse) {
        this.processorResponse = processorResponse;
    }


    /**
     * Gets the approvalCode value for this OCTReply.
     * 
     * @return approvalCode
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this OCTReply.
     * 
     * @param approvalCode
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the amount value for this OCTReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OCTReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the paymentNetworkTransactionID value for this OCTReply.
     * 
     * @return paymentNetworkTransactionID
     */
    public java.lang.String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }


    /**
     * Sets the paymentNetworkTransactionID value for this OCTReply.
     * 
     * @param paymentNetworkTransactionID
     */
    public void setPaymentNetworkTransactionID(java.lang.String paymentNetworkTransactionID) {
        this.paymentNetworkTransactionID = paymentNetworkTransactionID;
    }


    /**
     * Gets the prepaidBalanceCurrency value for this OCTReply.
     * 
     * @return prepaidBalanceCurrency
     */
    public java.lang.String getPrepaidBalanceCurrency() {
        return prepaidBalanceCurrency;
    }


    /**
     * Sets the prepaidBalanceCurrency value for this OCTReply.
     * 
     * @param prepaidBalanceCurrency
     */
    public void setPrepaidBalanceCurrency(java.lang.String prepaidBalanceCurrency) {
        this.prepaidBalanceCurrency = prepaidBalanceCurrency;
    }


    /**
     * Gets the prepaidBalanceAmount value for this OCTReply.
     * 
     * @return prepaidBalanceAmount
     */
    public java.lang.String getPrepaidBalanceAmount() {
        return prepaidBalanceAmount;
    }


    /**
     * Sets the prepaidBalanceAmount value for this OCTReply.
     * 
     * @param prepaidBalanceAmount
     */
    public void setPrepaidBalanceAmount(java.lang.String prepaidBalanceAmount) {
        this.prepaidBalanceAmount = prepaidBalanceAmount;
    }


    /**
     * Gets the processorResponseSource value for this OCTReply.
     * 
     * @return processorResponseSource
     */
    public java.lang.String getProcessorResponseSource() {
        return processorResponseSource;
    }


    /**
     * Sets the processorResponseSource value for this OCTReply.
     * 
     * @param processorResponseSource
     */
    public void setProcessorResponseSource(java.lang.String processorResponseSource) {
        this.processorResponseSource = processorResponseSource;
    }


    /**
     * Gets the reconciliationIdType value for this OCTReply.
     * 
     * @return reconciliationIdType
     */
    public java.lang.String getReconciliationIdType() {
        return reconciliationIdType;
    }


    /**
     * Sets the reconciliationIdType value for this OCTReply.
     * 
     * @param reconciliationIdType
     */
    public void setReconciliationIdType(java.lang.String reconciliationIdType) {
        this.reconciliationIdType = reconciliationIdType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OCTReply)) return false;
        OCTReply other = (OCTReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.requestDateTime==null && other.getRequestDateTime()==null) || 
             (this.requestDateTime!=null &&
              this.requestDateTime.equals(other.getRequestDateTime()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.processorResponse==null && other.getProcessorResponse()==null) || 
             (this.processorResponse!=null &&
              this.processorResponse.equals(other.getProcessorResponse()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.paymentNetworkTransactionID==null && other.getPaymentNetworkTransactionID()==null) || 
             (this.paymentNetworkTransactionID!=null &&
              this.paymentNetworkTransactionID.equals(other.getPaymentNetworkTransactionID()))) &&
            ((this.prepaidBalanceCurrency==null && other.getPrepaidBalanceCurrency()==null) || 
             (this.prepaidBalanceCurrency!=null &&
              this.prepaidBalanceCurrency.equals(other.getPrepaidBalanceCurrency()))) &&
            ((this.prepaidBalanceAmount==null && other.getPrepaidBalanceAmount()==null) || 
             (this.prepaidBalanceAmount!=null &&
              this.prepaidBalanceAmount.equals(other.getPrepaidBalanceAmount()))) &&
            ((this.processorResponseSource==null && other.getProcessorResponseSource()==null) || 
             (this.processorResponseSource!=null &&
              this.processorResponseSource.equals(other.getProcessorResponseSource()))) &&
            ((this.reconciliationIdType==null && other.getReconciliationIdType()==null) || 
             (this.reconciliationIdType!=null &&
              this.reconciliationIdType.equals(other.getReconciliationIdType())));
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
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getRequestDateTime() != null) {
            _hashCode += getRequestDateTime().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getProcessorResponse() != null) {
            _hashCode += getProcessorResponse().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPaymentNetworkTransactionID() != null) {
            _hashCode += getPaymentNetworkTransactionID().hashCode();
        }
        if (getPrepaidBalanceCurrency() != null) {
            _hashCode += getPrepaidBalanceCurrency().hashCode();
        }
        if (getPrepaidBalanceAmount() != null) {
            _hashCode += getPrepaidBalanceAmount().hashCode();
        }
        if (getProcessorResponseSource() != null) {
            _hashCode += getProcessorResponseSource().hashCode();
        }
        if (getReconciliationIdType() != null) {
            _hashCode += getReconciliationIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OCTReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OCTReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestDateTime"));
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
        elemField.setFieldName("processorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "approvalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNetworkTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentNetworkTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidBalanceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "prepaidBalanceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidBalanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "prepaidBalanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorResponseSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorResponseSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reconciliationIdType"));
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
