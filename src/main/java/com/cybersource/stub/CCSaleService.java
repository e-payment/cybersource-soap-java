/**
 * CCSaleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class CCSaleService  implements java.io.Serializable {
    private java.lang.String overridePaymentMethod;

    private java.lang.String commerceIndicator;

    private java.lang.String partialAuthIndicator;

    private java.lang.String cavv;

    private java.lang.String xid;

    private java.lang.String reconciliationID;

    private java.lang.String industryDatatype;

    private java.lang.String run;  // attribute

    public CCSaleService() {
    }

    public CCSaleService(
           java.lang.String overridePaymentMethod,
           java.lang.String commerceIndicator,
           java.lang.String partialAuthIndicator,
           java.lang.String cavv,
           java.lang.String xid,
           java.lang.String reconciliationID,
           java.lang.String industryDatatype,
           java.lang.String run) {
           this.overridePaymentMethod = overridePaymentMethod;
           this.commerceIndicator = commerceIndicator;
           this.partialAuthIndicator = partialAuthIndicator;
           this.cavv = cavv;
           this.xid = xid;
           this.reconciliationID = reconciliationID;
           this.industryDatatype = industryDatatype;
           this.run = run;
    }


    /**
     * Gets the overridePaymentMethod value for this CCSaleService.
     * 
     * @return overridePaymentMethod
     */
    public java.lang.String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }


    /**
     * Sets the overridePaymentMethod value for this CCSaleService.
     * 
     * @param overridePaymentMethod
     */
    public void setOverridePaymentMethod(java.lang.String overridePaymentMethod) {
        this.overridePaymentMethod = overridePaymentMethod;
    }


    /**
     * Gets the commerceIndicator value for this CCSaleService.
     * 
     * @return commerceIndicator
     */
    public java.lang.String getCommerceIndicator() {
        return commerceIndicator;
    }


    /**
     * Sets the commerceIndicator value for this CCSaleService.
     * 
     * @param commerceIndicator
     */
    public void setCommerceIndicator(java.lang.String commerceIndicator) {
        this.commerceIndicator = commerceIndicator;
    }


    /**
     * Gets the partialAuthIndicator value for this CCSaleService.
     * 
     * @return partialAuthIndicator
     */
    public java.lang.String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }


    /**
     * Sets the partialAuthIndicator value for this CCSaleService.
     * 
     * @param partialAuthIndicator
     */
    public void setPartialAuthIndicator(java.lang.String partialAuthIndicator) {
        this.partialAuthIndicator = partialAuthIndicator;
    }


    /**
     * Gets the cavv value for this CCSaleService.
     * 
     * @return cavv
     */
    public java.lang.String getCavv() {
        return cavv;
    }


    /**
     * Sets the cavv value for this CCSaleService.
     * 
     * @param cavv
     */
    public void setCavv(java.lang.String cavv) {
        this.cavv = cavv;
    }


    /**
     * Gets the xid value for this CCSaleService.
     * 
     * @return xid
     */
    public java.lang.String getXid() {
        return xid;
    }


    /**
     * Sets the xid value for this CCSaleService.
     * 
     * @param xid
     */
    public void setXid(java.lang.String xid) {
        this.xid = xid;
    }


    /**
     * Gets the reconciliationID value for this CCSaleService.
     * 
     * @return reconciliationID
     */
    public java.lang.String getReconciliationID() {
        return reconciliationID;
    }


    /**
     * Sets the reconciliationID value for this CCSaleService.
     * 
     * @param reconciliationID
     */
    public void setReconciliationID(java.lang.String reconciliationID) {
        this.reconciliationID = reconciliationID;
    }


    /**
     * Gets the industryDatatype value for this CCSaleService.
     * 
     * @return industryDatatype
     */
    public java.lang.String getIndustryDatatype() {
        return industryDatatype;
    }


    /**
     * Sets the industryDatatype value for this CCSaleService.
     * 
     * @param industryDatatype
     */
    public void setIndustryDatatype(java.lang.String industryDatatype) {
        this.industryDatatype = industryDatatype;
    }


    /**
     * Gets the run value for this CCSaleService.
     * 
     * @return run
     */
    public java.lang.String getRun() {
        return run;
    }


    /**
     * Sets the run value for this CCSaleService.
     * 
     * @param run
     */
    public void setRun(java.lang.String run) {
        this.run = run;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCSaleService)) return false;
        CCSaleService other = (CCSaleService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overridePaymentMethod==null && other.getOverridePaymentMethod()==null) || 
             (this.overridePaymentMethod!=null &&
              this.overridePaymentMethod.equals(other.getOverridePaymentMethod()))) &&
            ((this.commerceIndicator==null && other.getCommerceIndicator()==null) || 
             (this.commerceIndicator!=null &&
              this.commerceIndicator.equals(other.getCommerceIndicator()))) &&
            ((this.partialAuthIndicator==null && other.getPartialAuthIndicator()==null) || 
             (this.partialAuthIndicator!=null &&
              this.partialAuthIndicator.equals(other.getPartialAuthIndicator()))) &&
            ((this.cavv==null && other.getCavv()==null) || 
             (this.cavv!=null &&
              this.cavv.equals(other.getCavv()))) &&
            ((this.xid==null && other.getXid()==null) || 
             (this.xid!=null &&
              this.xid.equals(other.getXid()))) &&
            ((this.reconciliationID==null && other.getReconciliationID()==null) || 
             (this.reconciliationID!=null &&
              this.reconciliationID.equals(other.getReconciliationID()))) &&
            ((this.industryDatatype==null && other.getIndustryDatatype()==null) || 
             (this.industryDatatype!=null &&
              this.industryDatatype.equals(other.getIndustryDatatype()))) &&
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
        if (getOverridePaymentMethod() != null) {
            _hashCode += getOverridePaymentMethod().hashCode();
        }
        if (getCommerceIndicator() != null) {
            _hashCode += getCommerceIndicator().hashCode();
        }
        if (getPartialAuthIndicator() != null) {
            _hashCode += getPartialAuthIndicator().hashCode();
        }
        if (getCavv() != null) {
            _hashCode += getCavv().hashCode();
        }
        if (getXid() != null) {
            _hashCode += getXid().hashCode();
        }
        if (getReconciliationID() != null) {
            _hashCode += getReconciliationID().hashCode();
        }
        if (getIndustryDatatype() != null) {
            _hashCode += getIndustryDatatype().hashCode();
        }
        if (getRun() != null) {
            _hashCode += getRun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCSaleService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleService"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("run");
        attrField.setXmlName(new javax.xml.namespace.QName("", "run"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridePaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "overridePaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commerceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "commerceIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialAuthIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "partialAuthIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cavv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cavv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "xid"));
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
        elemField.setFieldName("industryDatatype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "industryDatatype"));
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
