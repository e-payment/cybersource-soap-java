/**
 * TaxReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class TaxReply  implements java.io.Serializable {
    private java.math.BigInteger reasonCode;

    private java.lang.String currency;

    private java.lang.String grandTotalAmount;

    private java.lang.String totalTaxableAmount;

    private java.lang.String totalExemptAmount;

    private java.lang.String totalSpecialTaxAmount;

    private java.lang.String totalCityTaxAmount;

    private java.lang.String city;

    private java.lang.String totalCountyTaxAmount;

    private java.lang.String county;

    private java.lang.String totalDistrictTaxAmount;

    private java.lang.String totalStateTaxAmount;

    private java.lang.String state;

    private java.lang.String totalCountryTaxAmount;

    private java.lang.String totalTaxAmount;

    private java.lang.String postalCode;

    private java.lang.String geocode;

    private com.cybersource.stub.TaxReplyItem[] item;

    public TaxReply() {
    }

    public TaxReply(
           java.math.BigInteger reasonCode,
           java.lang.String currency,
           java.lang.String grandTotalAmount,
           java.lang.String totalTaxableAmount,
           java.lang.String totalExemptAmount,
           java.lang.String totalSpecialTaxAmount,
           java.lang.String totalCityTaxAmount,
           java.lang.String city,
           java.lang.String totalCountyTaxAmount,
           java.lang.String county,
           java.lang.String totalDistrictTaxAmount,
           java.lang.String totalStateTaxAmount,
           java.lang.String state,
           java.lang.String totalCountryTaxAmount,
           java.lang.String totalTaxAmount,
           java.lang.String postalCode,
           java.lang.String geocode,
           com.cybersource.stub.TaxReplyItem[] item) {
           this.reasonCode = reasonCode;
           this.currency = currency;
           this.grandTotalAmount = grandTotalAmount;
           this.totalTaxableAmount = totalTaxableAmount;
           this.totalExemptAmount = totalExemptAmount;
           this.totalSpecialTaxAmount = totalSpecialTaxAmount;
           this.totalCityTaxAmount = totalCityTaxAmount;
           this.city = city;
           this.totalCountyTaxAmount = totalCountyTaxAmount;
           this.county = county;
           this.totalDistrictTaxAmount = totalDistrictTaxAmount;
           this.totalStateTaxAmount = totalStateTaxAmount;
           this.state = state;
           this.totalCountryTaxAmount = totalCountryTaxAmount;
           this.totalTaxAmount = totalTaxAmount;
           this.postalCode = postalCode;
           this.geocode = geocode;
           this.item = item;
    }


    /**
     * Gets the reasonCode value for this TaxReply.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this TaxReply.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the currency value for this TaxReply.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TaxReply.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the grandTotalAmount value for this TaxReply.
     * 
     * @return grandTotalAmount
     */
    public java.lang.String getGrandTotalAmount() {
        return grandTotalAmount;
    }


    /**
     * Sets the grandTotalAmount value for this TaxReply.
     * 
     * @param grandTotalAmount
     */
    public void setGrandTotalAmount(java.lang.String grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }


    /**
     * Gets the totalTaxableAmount value for this TaxReply.
     * 
     * @return totalTaxableAmount
     */
    public java.lang.String getTotalTaxableAmount() {
        return totalTaxableAmount;
    }


    /**
     * Sets the totalTaxableAmount value for this TaxReply.
     * 
     * @param totalTaxableAmount
     */
    public void setTotalTaxableAmount(java.lang.String totalTaxableAmount) {
        this.totalTaxableAmount = totalTaxableAmount;
    }


    /**
     * Gets the totalExemptAmount value for this TaxReply.
     * 
     * @return totalExemptAmount
     */
    public java.lang.String getTotalExemptAmount() {
        return totalExemptAmount;
    }


    /**
     * Sets the totalExemptAmount value for this TaxReply.
     * 
     * @param totalExemptAmount
     */
    public void setTotalExemptAmount(java.lang.String totalExemptAmount) {
        this.totalExemptAmount = totalExemptAmount;
    }


    /**
     * Gets the totalSpecialTaxAmount value for this TaxReply.
     * 
     * @return totalSpecialTaxAmount
     */
    public java.lang.String getTotalSpecialTaxAmount() {
        return totalSpecialTaxAmount;
    }


    /**
     * Sets the totalSpecialTaxAmount value for this TaxReply.
     * 
     * @param totalSpecialTaxAmount
     */
    public void setTotalSpecialTaxAmount(java.lang.String totalSpecialTaxAmount) {
        this.totalSpecialTaxAmount = totalSpecialTaxAmount;
    }


    /**
     * Gets the totalCityTaxAmount value for this TaxReply.
     * 
     * @return totalCityTaxAmount
     */
    public java.lang.String getTotalCityTaxAmount() {
        return totalCityTaxAmount;
    }


    /**
     * Sets the totalCityTaxAmount value for this TaxReply.
     * 
     * @param totalCityTaxAmount
     */
    public void setTotalCityTaxAmount(java.lang.String totalCityTaxAmount) {
        this.totalCityTaxAmount = totalCityTaxAmount;
    }


    /**
     * Gets the city value for this TaxReply.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TaxReply.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the totalCountyTaxAmount value for this TaxReply.
     * 
     * @return totalCountyTaxAmount
     */
    public java.lang.String getTotalCountyTaxAmount() {
        return totalCountyTaxAmount;
    }


    /**
     * Sets the totalCountyTaxAmount value for this TaxReply.
     * 
     * @param totalCountyTaxAmount
     */
    public void setTotalCountyTaxAmount(java.lang.String totalCountyTaxAmount) {
        this.totalCountyTaxAmount = totalCountyTaxAmount;
    }


    /**
     * Gets the county value for this TaxReply.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this TaxReply.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the totalDistrictTaxAmount value for this TaxReply.
     * 
     * @return totalDistrictTaxAmount
     */
    public java.lang.String getTotalDistrictTaxAmount() {
        return totalDistrictTaxAmount;
    }


    /**
     * Sets the totalDistrictTaxAmount value for this TaxReply.
     * 
     * @param totalDistrictTaxAmount
     */
    public void setTotalDistrictTaxAmount(java.lang.String totalDistrictTaxAmount) {
        this.totalDistrictTaxAmount = totalDistrictTaxAmount;
    }


    /**
     * Gets the totalStateTaxAmount value for this TaxReply.
     * 
     * @return totalStateTaxAmount
     */
    public java.lang.String getTotalStateTaxAmount() {
        return totalStateTaxAmount;
    }


    /**
     * Sets the totalStateTaxAmount value for this TaxReply.
     * 
     * @param totalStateTaxAmount
     */
    public void setTotalStateTaxAmount(java.lang.String totalStateTaxAmount) {
        this.totalStateTaxAmount = totalStateTaxAmount;
    }


    /**
     * Gets the state value for this TaxReply.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaxReply.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the totalCountryTaxAmount value for this TaxReply.
     * 
     * @return totalCountryTaxAmount
     */
    public java.lang.String getTotalCountryTaxAmount() {
        return totalCountryTaxAmount;
    }


    /**
     * Sets the totalCountryTaxAmount value for this TaxReply.
     * 
     * @param totalCountryTaxAmount
     */
    public void setTotalCountryTaxAmount(java.lang.String totalCountryTaxAmount) {
        this.totalCountryTaxAmount = totalCountryTaxAmount;
    }


    /**
     * Gets the totalTaxAmount value for this TaxReply.
     * 
     * @return totalTaxAmount
     */
    public java.lang.String getTotalTaxAmount() {
        return totalTaxAmount;
    }


    /**
     * Sets the totalTaxAmount value for this TaxReply.
     * 
     * @param totalTaxAmount
     */
    public void setTotalTaxAmount(java.lang.String totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }


    /**
     * Gets the postalCode value for this TaxReply.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this TaxReply.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the geocode value for this TaxReply.
     * 
     * @return geocode
     */
    public java.lang.String getGeocode() {
        return geocode;
    }


    /**
     * Sets the geocode value for this TaxReply.
     * 
     * @param geocode
     */
    public void setGeocode(java.lang.String geocode) {
        this.geocode = geocode;
    }


    /**
     * Gets the item value for this TaxReply.
     * 
     * @return item
     */
    public com.cybersource.stub.TaxReplyItem[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TaxReply.
     * 
     * @param item
     */
    public void setItem(com.cybersource.stub.TaxReplyItem[] item) {
        this.item = item;
    }

    public com.cybersource.stub.TaxReplyItem getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.cybersource.stub.TaxReplyItem _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxReply)) return false;
        TaxReply other = (TaxReply) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.grandTotalAmount==null && other.getGrandTotalAmount()==null) || 
             (this.grandTotalAmount!=null &&
              this.grandTotalAmount.equals(other.getGrandTotalAmount()))) &&
            ((this.totalTaxableAmount==null && other.getTotalTaxableAmount()==null) || 
             (this.totalTaxableAmount!=null &&
              this.totalTaxableAmount.equals(other.getTotalTaxableAmount()))) &&
            ((this.totalExemptAmount==null && other.getTotalExemptAmount()==null) || 
             (this.totalExemptAmount!=null &&
              this.totalExemptAmount.equals(other.getTotalExemptAmount()))) &&
            ((this.totalSpecialTaxAmount==null && other.getTotalSpecialTaxAmount()==null) || 
             (this.totalSpecialTaxAmount!=null &&
              this.totalSpecialTaxAmount.equals(other.getTotalSpecialTaxAmount()))) &&
            ((this.totalCityTaxAmount==null && other.getTotalCityTaxAmount()==null) || 
             (this.totalCityTaxAmount!=null &&
              this.totalCityTaxAmount.equals(other.getTotalCityTaxAmount()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.totalCountyTaxAmount==null && other.getTotalCountyTaxAmount()==null) || 
             (this.totalCountyTaxAmount!=null &&
              this.totalCountyTaxAmount.equals(other.getTotalCountyTaxAmount()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.totalDistrictTaxAmount==null && other.getTotalDistrictTaxAmount()==null) || 
             (this.totalDistrictTaxAmount!=null &&
              this.totalDistrictTaxAmount.equals(other.getTotalDistrictTaxAmount()))) &&
            ((this.totalStateTaxAmount==null && other.getTotalStateTaxAmount()==null) || 
             (this.totalStateTaxAmount!=null &&
              this.totalStateTaxAmount.equals(other.getTotalStateTaxAmount()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.totalCountryTaxAmount==null && other.getTotalCountryTaxAmount()==null) || 
             (this.totalCountryTaxAmount!=null &&
              this.totalCountryTaxAmount.equals(other.getTotalCountryTaxAmount()))) &&
            ((this.totalTaxAmount==null && other.getTotalTaxAmount()==null) || 
             (this.totalTaxAmount!=null &&
              this.totalTaxAmount.equals(other.getTotalTaxAmount()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.geocode==null && other.getGeocode()==null) || 
             (this.geocode!=null &&
              this.geocode.equals(other.getGeocode()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getGrandTotalAmount() != null) {
            _hashCode += getGrandTotalAmount().hashCode();
        }
        if (getTotalTaxableAmount() != null) {
            _hashCode += getTotalTaxableAmount().hashCode();
        }
        if (getTotalExemptAmount() != null) {
            _hashCode += getTotalExemptAmount().hashCode();
        }
        if (getTotalSpecialTaxAmount() != null) {
            _hashCode += getTotalSpecialTaxAmount().hashCode();
        }
        if (getTotalCityTaxAmount() != null) {
            _hashCode += getTotalCityTaxAmount().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getTotalCountyTaxAmount() != null) {
            _hashCode += getTotalCountyTaxAmount().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getTotalDistrictTaxAmount() != null) {
            _hashCode += getTotalDistrictTaxAmount().hashCode();
        }
        if (getTotalStateTaxAmount() != null) {
            _hashCode += getTotalStateTaxAmount().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTotalCountryTaxAmount() != null) {
            _hashCode += getTotalCountryTaxAmount().hashCode();
        }
        if (getTotalTaxAmount() != null) {
            _hashCode += getTotalTaxAmount().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getGeocode() != null) {
            _hashCode += getGeocode().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("grandTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "grandTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalTaxableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalExemptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalExemptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSpecialTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalSpecialTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCityTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalCityTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCountyTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalCountyTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDistrictTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalDistrictTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalStateTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalStateTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCountryTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalCountryTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geocode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "geocode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReplyItem"));
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
