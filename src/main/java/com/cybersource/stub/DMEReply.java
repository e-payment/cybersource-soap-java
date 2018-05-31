/**
 * DMEReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class DMEReply  implements java.io.Serializable {
    private java.lang.String eventType;

    private java.lang.String eventInfo;

    private java.lang.String eventHotlistInfo;

    private java.lang.String eventPolicy;

    private java.lang.String eventVelocityInfoCode;

    private com.cybersource.stub.AdditionalFields additionalFields;

    private com.cybersource.stub.MorphingElement morphingElement;

    private java.lang.String cardBin;

    private java.lang.String binCountry;

    private java.lang.String cardAccountType;

    private java.lang.String cardScheme;

    private java.lang.String cardIssuer;

    public DMEReply() {
    }

    public DMEReply(
           java.lang.String eventType,
           java.lang.String eventInfo,
           java.lang.String eventHotlistInfo,
           java.lang.String eventPolicy,
           java.lang.String eventVelocityInfoCode,
           com.cybersource.stub.AdditionalFields additionalFields,
           com.cybersource.stub.MorphingElement morphingElement,
           java.lang.String cardBin,
           java.lang.String binCountry,
           java.lang.String cardAccountType,
           java.lang.String cardScheme,
           java.lang.String cardIssuer) {
           this.eventType = eventType;
           this.eventInfo = eventInfo;
           this.eventHotlistInfo = eventHotlistInfo;
           this.eventPolicy = eventPolicy;
           this.eventVelocityInfoCode = eventVelocityInfoCode;
           this.additionalFields = additionalFields;
           this.morphingElement = morphingElement;
           this.cardBin = cardBin;
           this.binCountry = binCountry;
           this.cardAccountType = cardAccountType;
           this.cardScheme = cardScheme;
           this.cardIssuer = cardIssuer;
    }


    /**
     * Gets the eventType value for this DMEReply.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this DMEReply.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the eventInfo value for this DMEReply.
     * 
     * @return eventInfo
     */
    public java.lang.String getEventInfo() {
        return eventInfo;
    }


    /**
     * Sets the eventInfo value for this DMEReply.
     * 
     * @param eventInfo
     */
    public void setEventInfo(java.lang.String eventInfo) {
        this.eventInfo = eventInfo;
    }


    /**
     * Gets the eventHotlistInfo value for this DMEReply.
     * 
     * @return eventHotlistInfo
     */
    public java.lang.String getEventHotlistInfo() {
        return eventHotlistInfo;
    }


    /**
     * Sets the eventHotlistInfo value for this DMEReply.
     * 
     * @param eventHotlistInfo
     */
    public void setEventHotlistInfo(java.lang.String eventHotlistInfo) {
        this.eventHotlistInfo = eventHotlistInfo;
    }


    /**
     * Gets the eventPolicy value for this DMEReply.
     * 
     * @return eventPolicy
     */
    public java.lang.String getEventPolicy() {
        return eventPolicy;
    }


    /**
     * Sets the eventPolicy value for this DMEReply.
     * 
     * @param eventPolicy
     */
    public void setEventPolicy(java.lang.String eventPolicy) {
        this.eventPolicy = eventPolicy;
    }


    /**
     * Gets the eventVelocityInfoCode value for this DMEReply.
     * 
     * @return eventVelocityInfoCode
     */
    public java.lang.String getEventVelocityInfoCode() {
        return eventVelocityInfoCode;
    }


    /**
     * Sets the eventVelocityInfoCode value for this DMEReply.
     * 
     * @param eventVelocityInfoCode
     */
    public void setEventVelocityInfoCode(java.lang.String eventVelocityInfoCode) {
        this.eventVelocityInfoCode = eventVelocityInfoCode;
    }


    /**
     * Gets the additionalFields value for this DMEReply.
     * 
     * @return additionalFields
     */
    public com.cybersource.stub.AdditionalFields getAdditionalFields() {
        return additionalFields;
    }


    /**
     * Sets the additionalFields value for this DMEReply.
     * 
     * @param additionalFields
     */
    public void setAdditionalFields(com.cybersource.stub.AdditionalFields additionalFields) {
        this.additionalFields = additionalFields;
    }


    /**
     * Gets the morphingElement value for this DMEReply.
     * 
     * @return morphingElement
     */
    public com.cybersource.stub.MorphingElement getMorphingElement() {
        return morphingElement;
    }


    /**
     * Sets the morphingElement value for this DMEReply.
     * 
     * @param morphingElement
     */
    public void setMorphingElement(com.cybersource.stub.MorphingElement morphingElement) {
        this.morphingElement = morphingElement;
    }


    /**
     * Gets the cardBin value for this DMEReply.
     * 
     * @return cardBin
     */
    public java.lang.String getCardBin() {
        return cardBin;
    }


    /**
     * Sets the cardBin value for this DMEReply.
     * 
     * @param cardBin
     */
    public void setCardBin(java.lang.String cardBin) {
        this.cardBin = cardBin;
    }


    /**
     * Gets the binCountry value for this DMEReply.
     * 
     * @return binCountry
     */
    public java.lang.String getBinCountry() {
        return binCountry;
    }


    /**
     * Sets the binCountry value for this DMEReply.
     * 
     * @param binCountry
     */
    public void setBinCountry(java.lang.String binCountry) {
        this.binCountry = binCountry;
    }


    /**
     * Gets the cardAccountType value for this DMEReply.
     * 
     * @return cardAccountType
     */
    public java.lang.String getCardAccountType() {
        return cardAccountType;
    }


    /**
     * Sets the cardAccountType value for this DMEReply.
     * 
     * @param cardAccountType
     */
    public void setCardAccountType(java.lang.String cardAccountType) {
        this.cardAccountType = cardAccountType;
    }


    /**
     * Gets the cardScheme value for this DMEReply.
     * 
     * @return cardScheme
     */
    public java.lang.String getCardScheme() {
        return cardScheme;
    }


    /**
     * Sets the cardScheme value for this DMEReply.
     * 
     * @param cardScheme
     */
    public void setCardScheme(java.lang.String cardScheme) {
        this.cardScheme = cardScheme;
    }


    /**
     * Gets the cardIssuer value for this DMEReply.
     * 
     * @return cardIssuer
     */
    public java.lang.String getCardIssuer() {
        return cardIssuer;
    }


    /**
     * Sets the cardIssuer value for this DMEReply.
     * 
     * @param cardIssuer
     */
    public void setCardIssuer(java.lang.String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DMEReply)) return false;
        DMEReply other = (DMEReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.eventInfo==null && other.getEventInfo()==null) || 
             (this.eventInfo!=null &&
              this.eventInfo.equals(other.getEventInfo()))) &&
            ((this.eventHotlistInfo==null && other.getEventHotlistInfo()==null) || 
             (this.eventHotlistInfo!=null &&
              this.eventHotlistInfo.equals(other.getEventHotlistInfo()))) &&
            ((this.eventPolicy==null && other.getEventPolicy()==null) || 
             (this.eventPolicy!=null &&
              this.eventPolicy.equals(other.getEventPolicy()))) &&
            ((this.eventVelocityInfoCode==null && other.getEventVelocityInfoCode()==null) || 
             (this.eventVelocityInfoCode!=null &&
              this.eventVelocityInfoCode.equals(other.getEventVelocityInfoCode()))) &&
            ((this.additionalFields==null && other.getAdditionalFields()==null) || 
             (this.additionalFields!=null &&
              this.additionalFields.equals(other.getAdditionalFields()))) &&
            ((this.morphingElement==null && other.getMorphingElement()==null) || 
             (this.morphingElement!=null &&
              this.morphingElement.equals(other.getMorphingElement()))) &&
            ((this.cardBin==null && other.getCardBin()==null) || 
             (this.cardBin!=null &&
              this.cardBin.equals(other.getCardBin()))) &&
            ((this.binCountry==null && other.getBinCountry()==null) || 
             (this.binCountry!=null &&
              this.binCountry.equals(other.getBinCountry()))) &&
            ((this.cardAccountType==null && other.getCardAccountType()==null) || 
             (this.cardAccountType!=null &&
              this.cardAccountType.equals(other.getCardAccountType()))) &&
            ((this.cardScheme==null && other.getCardScheme()==null) || 
             (this.cardScheme!=null &&
              this.cardScheme.equals(other.getCardScheme()))) &&
            ((this.cardIssuer==null && other.getCardIssuer()==null) || 
             (this.cardIssuer!=null &&
              this.cardIssuer.equals(other.getCardIssuer())));
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
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getEventInfo() != null) {
            _hashCode += getEventInfo().hashCode();
        }
        if (getEventHotlistInfo() != null) {
            _hashCode += getEventHotlistInfo().hashCode();
        }
        if (getEventPolicy() != null) {
            _hashCode += getEventPolicy().hashCode();
        }
        if (getEventVelocityInfoCode() != null) {
            _hashCode += getEventVelocityInfoCode().hashCode();
        }
        if (getAdditionalFields() != null) {
            _hashCode += getAdditionalFields().hashCode();
        }
        if (getMorphingElement() != null) {
            _hashCode += getMorphingElement().hashCode();
        }
        if (getCardBin() != null) {
            _hashCode += getCardBin().hashCode();
        }
        if (getBinCountry() != null) {
            _hashCode += getBinCountry().hashCode();
        }
        if (getCardAccountType() != null) {
            _hashCode += getCardAccountType().hashCode();
        }
        if (getCardScheme() != null) {
            _hashCode += getCardScheme().hashCode();
        }
        if (getCardIssuer() != null) {
            _hashCode += getCardIssuer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DMEReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DMEReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventHotlistInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eventHotlistInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eventPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventVelocityInfoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eventVelocityInfoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AdditionalFields"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("morphingElement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "morphingElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MorphingElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "binCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIssuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardIssuer"));
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
