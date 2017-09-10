/**
 * BoletoPaymentReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class BoletoPaymentReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String requestDateTime;

    private java.lang.String amount;

    private java.lang.String reconciliationID;

    private java.lang.String boletoNumber;

    private java.lang.String expirationDate;

    private java.lang.String url;

    private java.lang.String avsCode;

    private java.lang.String avsCodeRaw;

    private java.lang.String barCodeNumber;

    private java.lang.String assignor;

    public BoletoPaymentReply() {
    }

    public BoletoPaymentReply(
           java.math.BigInteger reasonCode,
           java.lang.String requestDateTime,
           java.lang.String amount,
           java.lang.String reconciliationID,
           java.lang.String boletoNumber,
           java.lang.String expirationDate,
           java.lang.String url,
           java.lang.String avsCode,
           java.lang.String avsCodeRaw,
           java.lang.String barCodeNumber,
           java.lang.String assignor) {
           this.reasonCode = reasonCode;
           this.requestDateTime = requestDateTime;
           this.amount = amount;
           this.reconciliationID = reconciliationID;
           this.boletoNumber = boletoNumber;
           this.expirationDate = expirationDate;
           this.url = url;
           this.avsCode = avsCode;
           this.avsCodeRaw = avsCodeRaw;
           this.barCodeNumber = barCodeNumber;
           this.assignor = assignor;
    }


    /**
     * Gets the reasonCode value for this BoletoPaymentReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this BoletoPaymentReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the requestDateTime value for this BoletoPaymentReply.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this BoletoPaymentReply.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the amount value for this BoletoPaymentReply.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BoletoPaymentReply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the reconciliationID value for this BoletoPaymentReply.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this BoletoPaymentReply.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the boletoNumber value for this BoletoPaymentReply.
     * 
     * @return boletoNumber
     */
    public java.lang.String getBoletoNumber() {
        return boletoNumber;
    }


    /**
     * Sets the boletoNumber value for this BoletoPaymentReply.
     * 
     * @param boletoNumber
     */
    public void setBoletoNumber(java.lang.String boletoNumber) {
        this.boletoNumber = boletoNumber;
    }


    /**
     * Gets the expirationDate value for this BoletoPaymentReply.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this BoletoPaymentReply.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the url value for this BoletoPaymentReply.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this BoletoPaymentReply.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the avsCode value for this BoletoPaymentReply.
     * 
     * @return avsCode
     */
    public java.lang.String getAvsCode() {
        return avsCode;
    }


    /**
     * Sets the avsCode value for this BoletoPaymentReply.
     * 
     * @param avsCode
     */
    public void setAvsCode(java.lang.String avsCode) {
        this.avsCode = avsCode;
    }


    /**
     * Gets the avsCodeRaw value for this BoletoPaymentReply.
     * 
     * @return avsCodeRaw
     */
    public java.lang.String getAvsCodeRaw() {
        return avsCodeRaw;
    }


    /**
     * Sets the avsCodeRaw value for this BoletoPaymentReply.
     * 
     * @param avsCodeRaw
     */
    public void setAvsCodeRaw(java.lang.String avsCodeRaw) {
        this.avsCodeRaw = avsCodeRaw;
    }


    /**
     * Gets the barCodeNumber value for this BoletoPaymentReply.
     * 
     * @return barCodeNumber
     */
    public java.lang.String getBarCodeNumber() {
        return barCodeNumber;
    }


    /**
     * Sets the barCodeNumber value for this BoletoPaymentReply.
     * 
     * @param barCodeNumber
     */
    public void setBarCodeNumber(java.lang.String barCodeNumber) {
        this.barCodeNumber = barCodeNumber;
    }


    /**
     * Gets the assignor value for this BoletoPaymentReply.
     * 
     * @return assignor
     */
    public java.lang.String getAssignor() {
        return assignor;
    }


    /**
     * Sets the assignor value for this BoletoPaymentReply.
     * 
     * @param assignor
     */
    public void setAssignor(java.lang.String assignor) {
        this.assignor = assignor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BoletoPaymentReply)) return false;
        BoletoPaymentReply other = (BoletoPaymentReply) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.boletoNumber==null && other.getBoletoNumber()==null) || 
             (this.boletoNumber!=null &&
              this.boletoNumber.equals(other.getBoletoNumber()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.avsCode==null && other.getAvsCode()==null) || 
             (this.avsCode!=null &&
              this.avsCode.equals(other.getAvsCode()))) &&
            ((this.avsCodeRaw==null && other.getAvsCodeRaw()==null) || 
             (this.avsCodeRaw!=null &&
              this.avsCodeRaw.equals(other.getAvsCodeRaw()))) &&
            ((this.barCodeNumber==null && other.getBarCodeNumber()==null) || 
             (this.barCodeNumber!=null &&
              this.barCodeNumber.equals(other.getBarCodeNumber()))) &&
            ((this.assignor==null && other.getAssignor()==null) || 
             (this.assignor!=null &&
              this.assignor.equals(other.getAssignor())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getBoletoNumber() != null) {
            _hashCode += getBoletoNumber().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getAvsCode() != null) {
            _hashCode += getAvsCode().hashCode();
        }
        if (getAvsCodeRaw() != null) {
            _hashCode += getAvsCodeRaw().hashCode();
        }
        if (getBarCodeNumber() != null) {
            _hashCode += getBarCodeNumber().hashCode();
        }
        if (getAssignor() != null) {
            _hashCode += getAssignor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BoletoPaymentReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BoletoPaymentReply"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount"));
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
        elemField.setFieldName("boletoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boletoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "avsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCodeRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "avsCodeRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barCodeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "barCodeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "assignor"));
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
