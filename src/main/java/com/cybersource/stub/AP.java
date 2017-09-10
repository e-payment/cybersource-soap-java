/**
 * AP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class AP  implements java.io.Serializable {
    private java.lang.String orderID;

    private java.lang.String customerRepresentativeID;

    private java.lang.String productDescription;

    private java.lang.String settlementCurrency;

    private java.lang.String subtotalAmount;

    private java.lang.String shippingAmount;

    private java.lang.String handlingAmount;

    private java.lang.String shippingHandlingAmount;

    private java.lang.String additionalAmount;

    private java.lang.String taxAmount;

    private java.lang.String giftWrapAmount;

    private java.lang.String discountAmount;

    private java.lang.String purchaseID;

    private java.lang.String productID;

    private com.cybersource.stub.APDevice device;

    private java.lang.String apiKey;

    private java.lang.String insuranceAmount;

    private java.lang.String billingAgreementIndicator;

    private java.lang.String billingAgreementID;

    private java.lang.String billingAgreementDescription;

    private java.lang.String payerID;

    private java.lang.String fundingSource;

    private java.lang.String shippingAddressImmutable;

    public AP() {
    }

    public AP(
           java.lang.String orderID,
           java.lang.String customerRepresentativeID,
           java.lang.String productDescription,
           java.lang.String settlementCurrency,
           java.lang.String subtotalAmount,
           java.lang.String shippingAmount,
           java.lang.String handlingAmount,
           java.lang.String shippingHandlingAmount,
           java.lang.String additionalAmount,
           java.lang.String taxAmount,
           java.lang.String giftWrapAmount,
           java.lang.String discountAmount,
           java.lang.String purchaseID,
           java.lang.String productID,
           com.cybersource.stub.APDevice device,
           java.lang.String apiKey,
           java.lang.String insuranceAmount,
           java.lang.String billingAgreementIndicator,
           java.lang.String billingAgreementID,
           java.lang.String billingAgreementDescription,
           java.lang.String payerID,
           java.lang.String fundingSource,
           java.lang.String shippingAddressImmutable) {
           this.orderID = orderID;
           this.customerRepresentativeID = customerRepresentativeID;
           this.productDescription = productDescription;
           this.settlementCurrency = settlementCurrency;
           this.subtotalAmount = subtotalAmount;
           this.shippingAmount = shippingAmount;
           this.handlingAmount = handlingAmount;
           this.shippingHandlingAmount = shippingHandlingAmount;
           this.additionalAmount = additionalAmount;
           this.taxAmount = taxAmount;
           this.giftWrapAmount = giftWrapAmount;
           this.discountAmount = discountAmount;
           this.purchaseID = purchaseID;
           this.productID = productID;
           this.device = device;
           this.apiKey = apiKey;
           this.insuranceAmount = insuranceAmount;
           this.billingAgreementIndicator = billingAgreementIndicator;
           this.billingAgreementID = billingAgreementID;
           this.billingAgreementDescription = billingAgreementDescription;
           this.payerID = payerID;
           this.fundingSource = fundingSource;
           this.shippingAddressImmutable = shippingAddressImmutable;
    }


    /**
     * Gets the orderID value for this AP.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this AP.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the customerRepresentativeID value for this AP.
     * 
     * @return customerRepresentativeID
     */
    public java.lang.String getCustomerRepresentativeID() {
        return customerRepresentativeID;
    }


    /**
     * Sets the customerRepresentativeID value for this AP.
     * 
     * @param customerRepresentativeID
     */
    public void setCustomerRepresentativeID(java.lang.String customerRepresentativeID) {
        this.customerRepresentativeID = customerRepresentativeID;
    }


    /**
     * Gets the productDescription value for this AP.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this AP.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the settlementCurrency value for this AP.
     * 
     * @return settlementCurrency
     */
    public java.lang.String getSettlementCurrency() {
        return settlementCurrency;
    }


    /**
     * Sets the settlementCurrency value for this AP.
     * 
     * @param settlementCurrency
     */
    public void setSettlementCurrency(java.lang.String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }


    /**
     * Gets the subtotalAmount value for this AP.
     * 
     * @return subtotalAmount
     */
    public java.lang.String getSubtotalAmount() {
        return subtotalAmount;
    }


    /**
     * Sets the subtotalAmount value for this AP.
     * 
     * @param subtotalAmount
     */
    public void setSubtotalAmount(java.lang.String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }


    /**
     * Gets the shippingAmount value for this AP.
     * 
     * @return shippingAmount
     */
    public java.lang.String getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this AP.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(java.lang.String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the handlingAmount value for this AP.
     * 
     * @return handlingAmount
     */
    public java.lang.String getHandlingAmount() {
        return handlingAmount;
    }


    /**
     * Sets the handlingAmount value for this AP.
     * 
     * @param handlingAmount
     */
    public void setHandlingAmount(java.lang.String handlingAmount) {
        this.handlingAmount = handlingAmount;
    }


    /**
     * Gets the shippingHandlingAmount value for this AP.
     * 
     * @return shippingHandlingAmount
     */
    public java.lang.String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }


    /**
     * Sets the shippingHandlingAmount value for this AP.
     * 
     * @param shippingHandlingAmount
     */
    public void setShippingHandlingAmount(java.lang.String shippingHandlingAmount) {
        this.shippingHandlingAmount = shippingHandlingAmount;
    }


    /**
     * Gets the additionalAmount value for this AP.
     * 
     * @return additionalAmount
     */
    public java.lang.String getAdditionalAmount() {
        return additionalAmount;
    }


    /**
     * Sets the additionalAmount value for this AP.
     * 
     * @param additionalAmount
     */
    public void setAdditionalAmount(java.lang.String additionalAmount) {
        this.additionalAmount = additionalAmount;
    }


    /**
     * Gets the taxAmount value for this AP.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this AP.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the giftWrapAmount value for this AP.
     * 
     * @return giftWrapAmount
     */
    public java.lang.String getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this AP.
     * 
     * @param giftWrapAmount
     */
    public void setGiftWrapAmount(java.lang.String giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the discountAmount value for this AP.
     * 
     * @return discountAmount
     */
    public java.lang.String getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this AP.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.String discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the purchaseID value for this AP.
     * 
     * @return purchaseID
     */
    public java.lang.String getPurchaseID() {
        return purchaseID;
    }


    /**
     * Sets the purchaseID value for this AP.
     * 
     * @param purchaseID
     */
    public void setPurchaseID(java.lang.String purchaseID) {
        this.purchaseID = purchaseID;
    }


    /**
     * Gets the productID value for this AP.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this AP.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the device value for this AP.
     * 
     * @return device
     */
    public com.cybersource.stub.APDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this AP.
     * 
     * @param device
     */
    public void setDevice(com.cybersource.stub.APDevice device) {
        this.device = device;
    }


    /**
     * Gets the apiKey value for this AP.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this AP.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the insuranceAmount value for this AP.
     * 
     * @return insuranceAmount
     */
    public java.lang.String getInsuranceAmount() {
        return insuranceAmount;
    }


    /**
     * Sets the insuranceAmount value for this AP.
     * 
     * @param insuranceAmount
     */
    public void setInsuranceAmount(java.lang.String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }


    /**
     * Gets the billingAgreementIndicator value for this AP.
     * 
     * @return billingAgreementIndicator
     */
    public java.lang.String getBillingAgreementIndicator() {
        return billingAgreementIndicator;
    }


    /**
     * Sets the billingAgreementIndicator value for this AP.
     * 
     * @param billingAgreementIndicator
     */
    public void setBillingAgreementIndicator(java.lang.String billingAgreementIndicator) {
        this.billingAgreementIndicator = billingAgreementIndicator;
    }


    /**
     * Gets the billingAgreementID value for this AP.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this AP.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the billingAgreementDescription value for this AP.
     * 
     * @return billingAgreementDescription
     */
    public java.lang.String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }


    /**
     * Sets the billingAgreementDescription value for this AP.
     * 
     * @param billingAgreementDescription
     */
    public void setBillingAgreementDescription(java.lang.String billingAgreementDescription) {
        this.billingAgreementDescription = billingAgreementDescription;
    }


    /**
     * Gets the payerID value for this AP.
     * 
     * @return payerID
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this AP.
     * 
     * @param payerID
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }


    /**
     * Gets the fundingSource value for this AP.
     * 
     * @return fundingSource
     */
    public java.lang.String getFundingSource() {
        return fundingSource;
    }


    /**
     * Sets the fundingSource value for this AP.
     * 
     * @param fundingSource
     */
    public void setFundingSource(java.lang.String fundingSource) {
        this.fundingSource = fundingSource;
    }


    /**
     * Gets the shippingAddressImmutable value for this AP.
     * 
     * @return shippingAddressImmutable
     */
    public java.lang.String getShippingAddressImmutable() {
        return shippingAddressImmutable;
    }


    /**
     * Sets the shippingAddressImmutable value for this AP.
     * 
     * @param shippingAddressImmutable
     */
    public void setShippingAddressImmutable(java.lang.String shippingAddressImmutable) {
        this.shippingAddressImmutable = shippingAddressImmutable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AP)) return false;
        AP other = (AP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.customerRepresentativeID==null && other.getCustomerRepresentativeID()==null) || 
             (this.customerRepresentativeID!=null &&
              this.customerRepresentativeID.equals(other.getCustomerRepresentativeID()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.settlementCurrency==null && other.getSettlementCurrency()==null) || 
             (this.settlementCurrency!=null &&
              this.settlementCurrency.equals(other.getSettlementCurrency()))) &&
            ((this.subtotalAmount==null && other.getSubtotalAmount()==null) || 
             (this.subtotalAmount!=null &&
              this.subtotalAmount.equals(other.getSubtotalAmount()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.handlingAmount==null && other.getHandlingAmount()==null) || 
             (this.handlingAmount!=null &&
              this.handlingAmount.equals(other.getHandlingAmount()))) &&
            ((this.shippingHandlingAmount==null && other.getShippingHandlingAmount()==null) || 
             (this.shippingHandlingAmount!=null &&
              this.shippingHandlingAmount.equals(other.getShippingHandlingAmount()))) &&
            ((this.additionalAmount==null && other.getAdditionalAmount()==null) || 
             (this.additionalAmount!=null &&
              this.additionalAmount.equals(other.getAdditionalAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.purchaseID==null && other.getPurchaseID()==null) || 
             (this.purchaseID!=null &&
              this.purchaseID.equals(other.getPurchaseID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.insuranceAmount==null && other.getInsuranceAmount()==null) || 
             (this.insuranceAmount!=null &&
              this.insuranceAmount.equals(other.getInsuranceAmount()))) &&
            ((this.billingAgreementIndicator==null && other.getBillingAgreementIndicator()==null) || 
             (this.billingAgreementIndicator!=null &&
              this.billingAgreementIndicator.equals(other.getBillingAgreementIndicator()))) &&
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
            ((this.billingAgreementDescription==null && other.getBillingAgreementDescription()==null) || 
             (this.billingAgreementDescription!=null &&
              this.billingAgreementDescription.equals(other.getBillingAgreementDescription()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID()))) &&
            ((this.fundingSource==null && other.getFundingSource()==null) || 
             (this.fundingSource!=null &&
              this.fundingSource.equals(other.getFundingSource()))) &&
            ((this.shippingAddressImmutable==null && other.getShippingAddressImmutable()==null) || 
             (this.shippingAddressImmutable!=null &&
              this.shippingAddressImmutable.equals(other.getShippingAddressImmutable())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getCustomerRepresentativeID() != null) {
            _hashCode += getCustomerRepresentativeID().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getSettlementCurrency() != null) {
            _hashCode += getSettlementCurrency().hashCode();
        }
        if (getSubtotalAmount() != null) {
            _hashCode += getSubtotalAmount().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getHandlingAmount() != null) {
            _hashCode += getHandlingAmount().hashCode();
        }
        if (getShippingHandlingAmount() != null) {
            _hashCode += getShippingHandlingAmount().hashCode();
        }
        if (getAdditionalAmount() != null) {
            _hashCode += getAdditionalAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getPurchaseID() != null) {
            _hashCode += getPurchaseID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getInsuranceAmount() != null) {
            _hashCode += getInsuranceAmount().hashCode();
        }
        if (getBillingAgreementIndicator() != null) {
            _hashCode += getBillingAgreementIndicator().hashCode();
        }
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getBillingAgreementDescription() != null) {
            _hashCode += getBillingAgreementDescription().hashCode();
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        if (getFundingSource() != null) {
            _hashCode += getFundingSource().hashCode();
        }
        if (getShippingAddressImmutable() != null) {
            _hashCode += getShippingAddressImmutable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRepresentativeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerRepresentativeID"));
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
        elemField.setFieldName("settlementCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "settlementCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subtotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "handlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingHandlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shippingHandlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "giftWrapAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "insuranceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingAgreementIndicator"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingAgreementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddressImmutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shippingAddressImmutable"));
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
