/**
 * AncillaryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class AncillaryData  implements java.io.Serializable {
    private java.lang.String ticketNumber;

    private java.lang.String passengerName;

    private java.lang.String connectedTicketNumber;

    private java.lang.String creditReasonIndicator;

    private com.cybersource.stub.Service[] service;

    public AncillaryData() {
    }

    public AncillaryData(
           java.lang.String ticketNumber,
           java.lang.String passengerName,
           java.lang.String connectedTicketNumber,
           java.lang.String creditReasonIndicator,
           com.cybersource.stub.Service[] service) {
           this.ticketNumber = ticketNumber;
           this.passengerName = passengerName;
           this.connectedTicketNumber = connectedTicketNumber;
           this.creditReasonIndicator = creditReasonIndicator;
           this.service = service;
    }


    /**
     * Gets the ticketNumber value for this AncillaryData.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this AncillaryData.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the passengerName value for this AncillaryData.
     * 
     * @return passengerName
     */
    public java.lang.String getPassengerName() {
        return passengerName;
    }


    /**
     * Sets the passengerName value for this AncillaryData.
     * 
     * @param passengerName
     */
    public void setPassengerName(java.lang.String passengerName) {
        this.passengerName = passengerName;
    }


    /**
     * Gets the connectedTicketNumber value for this AncillaryData.
     * 
     * @return connectedTicketNumber
     */
    public java.lang.String getConnectedTicketNumber() {
        return connectedTicketNumber;
    }


    /**
     * Sets the connectedTicketNumber value for this AncillaryData.
     * 
     * @param connectedTicketNumber
     */
    public void setConnectedTicketNumber(java.lang.String connectedTicketNumber) {
        this.connectedTicketNumber = connectedTicketNumber;
    }


    /**
     * Gets the creditReasonIndicator value for this AncillaryData.
     * 
     * @return creditReasonIndicator
     */
    public java.lang.String getCreditReasonIndicator() {
        return creditReasonIndicator;
    }


    /**
     * Sets the creditReasonIndicator value for this AncillaryData.
     * 
     * @param creditReasonIndicator
     */
    public void setCreditReasonIndicator(java.lang.String creditReasonIndicator) {
        this.creditReasonIndicator = creditReasonIndicator;
    }


    /**
     * Gets the service value for this AncillaryData.
     * 
     * @return service
     */
    public com.cybersource.stub.Service[] getService() {
        return service;
    }


    /**
     * Sets the service value for this AncillaryData.
     * 
     * @param service
     */
    public void setService(com.cybersource.stub.Service[] service) {
        this.service = service;
    }

    public com.cybersource.stub.Service getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.cybersource.stub.Service _value) {
        this.service[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AncillaryData)) return false;
        AncillaryData other = (AncillaryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.passengerName==null && other.getPassengerName()==null) || 
             (this.passengerName!=null &&
              this.passengerName.equals(other.getPassengerName()))) &&
            ((this.connectedTicketNumber==null && other.getConnectedTicketNumber()==null) || 
             (this.connectedTicketNumber!=null &&
              this.connectedTicketNumber.equals(other.getConnectedTicketNumber()))) &&
            ((this.creditReasonIndicator==null && other.getCreditReasonIndicator()==null) || 
             (this.creditReasonIndicator!=null &&
              this.creditReasonIndicator.equals(other.getCreditReasonIndicator()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService())));
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
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getPassengerName() != null) {
            _hashCode += getPassengerName().hashCode();
        }
        if (getConnectedTicketNumber() != null) {
            _hashCode += getConnectedTicketNumber().hashCode();
        }
        if (getCreditReasonIndicator() != null) {
            _hashCode += getCreditReasonIndicator().hashCode();
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
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
        new org.apache.axis.description.TypeDesc(AncillaryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AncillaryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedTicketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "connectedTicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReasonIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "creditReasonIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Service"));
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
