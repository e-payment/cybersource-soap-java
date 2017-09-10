/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class Item  implements java.io.Serializable {
    private java.lang.String unitPrice;

    private java.lang.String quantity;

    private java.lang.String productCode;

    private java.lang.String productName;

    private java.lang.String productSKU;

    private java.lang.String productRisk;

    private java.lang.String taxAmount;

    private java.lang.String cityOverrideAmount;

    private java.lang.String cityOverrideRate;

    private java.lang.String countyOverrideAmount;

    private java.lang.String countyOverrideRate;

    private java.lang.String districtOverrideAmount;

    private java.lang.String districtOverrideRate;

    private java.lang.String stateOverrideAmount;

    private java.lang.String stateOverrideRate;

    private java.lang.String countryOverrideAmount;

    private java.lang.String countryOverrideRate;

    private java.lang.String orderAcceptanceCity;

    private java.lang.String orderAcceptanceCounty;

    private java.lang.String orderAcceptanceCountry;

    private java.lang.String orderAcceptanceState;

    private java.lang.String orderAcceptancePostalCode;

    private java.lang.String orderOriginCity;

    private java.lang.String orderOriginCounty;

    private java.lang.String orderOriginCountry;

    private java.lang.String orderOriginState;

    private java.lang.String orderOriginPostalCode;

    private java.lang.String shipFromCity;

    private java.lang.String shipFromCounty;

    private java.lang.String shipFromCountry;

    private java.lang.String shipFromState;

    private java.lang.String shipFromPostalCode;

    private java.lang.String export;

    private java.lang.String noExport;

    private java.lang.String nationalTax;

    private java.lang.String vatRate;

    private java.lang.String sellerRegistration;

    private java.lang.String sellerRegistration0;

    private java.lang.String sellerRegistration1;

    private java.lang.String sellerRegistration2;

    private java.lang.String sellerRegistration3;

    private java.lang.String sellerRegistration4;

    private java.lang.String sellerRegistration5;

    private java.lang.String sellerRegistration6;

    private java.lang.String sellerRegistration7;

    private java.lang.String sellerRegistration8;

    private java.lang.String sellerRegistration9;

    private java.lang.String buyerRegistration;

    private java.lang.String middlemanRegistration;

    private java.lang.String pointOfTitleTransfer;

    private java.lang.String giftCategory;

    private java.lang.String timeCategory;

    private java.lang.String hostHedge;

    private java.lang.String timeHedge;

    private java.lang.String velocityHedge;

    private java.lang.String nonsensicalHedge;

    private java.lang.String phoneHedge;

    private java.lang.String obscenitiesHedge;

    private java.lang.String unitOfMeasure;

    private java.lang.String taxRate;

    private java.lang.String totalAmount;

    private java.lang.String discountAmount;

    private java.lang.String discountRate;

    private java.lang.String commodityCode;

    private java.lang.String grossNetIndicator;

    private java.lang.String taxTypeApplied;

    private java.lang.String discountIndicator;

    private java.lang.String alternateTaxID;

    private java.lang.String alternateTaxAmount;

    private java.lang.String alternateTaxTypeApplied;

    private java.lang.String alternateTaxRate;

    private java.lang.String alternateTaxType;

    private java.lang.String localTax;

    private java.lang.String zeroCostToCustomerIndicator;

    private java.lang.String passengerFirstName;

    private java.lang.String passengerLastName;

    private java.lang.String passengerID;

    private java.lang.String passengerStatus;

    private java.lang.String passengerType;

    private java.lang.String passengerEmail;

    private java.lang.String passengerPhone;

    private java.lang.String invoiceNumber;

    private java.lang.String productDescription;

    private java.lang.String taxStatusIndicator;

    private java.lang.String discountManagementIndicator;

    private java.lang.String typeOfSupply;

    private java.lang.String sign;

    private java.lang.String unitTaxAmount;

    private java.math.BigInteger id;  // attribute

    public Item() {
    }

    public Item(
           java.lang.String unitPrice,
           java.lang.String quantity,
           java.lang.String productCode,
           java.lang.String productName,
           java.lang.String productSKU,
           java.lang.String productRisk,
           java.lang.String taxAmount,
           java.lang.String cityOverrideAmount,
           java.lang.String cityOverrideRate,
           java.lang.String countyOverrideAmount,
           java.lang.String countyOverrideRate,
           java.lang.String districtOverrideAmount,
           java.lang.String districtOverrideRate,
           java.lang.String stateOverrideAmount,
           java.lang.String stateOverrideRate,
           java.lang.String countryOverrideAmount,
           java.lang.String countryOverrideRate,
           java.lang.String orderAcceptanceCity,
           java.lang.String orderAcceptanceCounty,
           java.lang.String orderAcceptanceCountry,
           java.lang.String orderAcceptanceState,
           java.lang.String orderAcceptancePostalCode,
           java.lang.String orderOriginCity,
           java.lang.String orderOriginCounty,
           java.lang.String orderOriginCountry,
           java.lang.String orderOriginState,
           java.lang.String orderOriginPostalCode,
           java.lang.String shipFromCity,
           java.lang.String shipFromCounty,
           java.lang.String shipFromCountry,
           java.lang.String shipFromState,
           java.lang.String shipFromPostalCode,
           java.lang.String export,
           java.lang.String noExport,
           java.lang.String nationalTax,
           java.lang.String vatRate,
           java.lang.String sellerRegistration,
           java.lang.String sellerRegistration0,
           java.lang.String sellerRegistration1,
           java.lang.String sellerRegistration2,
           java.lang.String sellerRegistration3,
           java.lang.String sellerRegistration4,
           java.lang.String sellerRegistration5,
           java.lang.String sellerRegistration6,
           java.lang.String sellerRegistration7,
           java.lang.String sellerRegistration8,
           java.lang.String sellerRegistration9,
           java.lang.String buyerRegistration,
           java.lang.String middlemanRegistration,
           java.lang.String pointOfTitleTransfer,
           java.lang.String giftCategory,
           java.lang.String timeCategory,
           java.lang.String hostHedge,
           java.lang.String timeHedge,
           java.lang.String velocityHedge,
           java.lang.String nonsensicalHedge,
           java.lang.String phoneHedge,
           java.lang.String obscenitiesHedge,
           java.lang.String unitOfMeasure,
           java.lang.String taxRate,
           java.lang.String totalAmount,
           java.lang.String discountAmount,
           java.lang.String discountRate,
           java.lang.String commodityCode,
           java.lang.String grossNetIndicator,
           java.lang.String taxTypeApplied,
           java.lang.String discountIndicator,
           java.lang.String alternateTaxID,
           java.lang.String alternateTaxAmount,
           java.lang.String alternateTaxTypeApplied,
           java.lang.String alternateTaxRate,
           java.lang.String alternateTaxType,
           java.lang.String localTax,
           java.lang.String zeroCostToCustomerIndicator,
           java.lang.String passengerFirstName,
           java.lang.String passengerLastName,
           java.lang.String passengerID,
           java.lang.String passengerStatus,
           java.lang.String passengerType,
           java.lang.String passengerEmail,
           java.lang.String passengerPhone,
           java.lang.String invoiceNumber,
           java.lang.String productDescription,
           java.lang.String taxStatusIndicator,
           java.lang.String discountManagementIndicator,
           java.lang.String typeOfSupply,
           java.lang.String sign,
           java.lang.String unitTaxAmount,
           java.math.BigInteger id) {
           this.unitPrice = unitPrice;
           this.quantity = quantity;
           this.productCode = productCode;
           this.productName = productName;
           this.productSKU = productSKU;
           this.productRisk = productRisk;
           this.taxAmount = taxAmount;
           this.cityOverrideAmount = cityOverrideAmount;
           this.cityOverrideRate = cityOverrideRate;
           this.countyOverrideAmount = countyOverrideAmount;
           this.countyOverrideRate = countyOverrideRate;
           this.districtOverrideAmount = districtOverrideAmount;
           this.districtOverrideRate = districtOverrideRate;
           this.stateOverrideAmount = stateOverrideAmount;
           this.stateOverrideRate = stateOverrideRate;
           this.countryOverrideAmount = countryOverrideAmount;
           this.countryOverrideRate = countryOverrideRate;
           this.orderAcceptanceCity = orderAcceptanceCity;
           this.orderAcceptanceCounty = orderAcceptanceCounty;
           this.orderAcceptanceCountry = orderAcceptanceCountry;
           this.orderAcceptanceState = orderAcceptanceState;
           this.orderAcceptancePostalCode = orderAcceptancePostalCode;
           this.orderOriginCity = orderOriginCity;
           this.orderOriginCounty = orderOriginCounty;
           this.orderOriginCountry = orderOriginCountry;
           this.orderOriginState = orderOriginState;
           this.orderOriginPostalCode = orderOriginPostalCode;
           this.shipFromCity = shipFromCity;
           this.shipFromCounty = shipFromCounty;
           this.shipFromCountry = shipFromCountry;
           this.shipFromState = shipFromState;
           this.shipFromPostalCode = shipFromPostalCode;
           this.export = export;
           this.noExport = noExport;
           this.nationalTax = nationalTax;
           this.vatRate = vatRate;
           this.sellerRegistration = sellerRegistration;
           this.sellerRegistration0 = sellerRegistration0;
           this.sellerRegistration1 = sellerRegistration1;
           this.sellerRegistration2 = sellerRegistration2;
           this.sellerRegistration3 = sellerRegistration3;
           this.sellerRegistration4 = sellerRegistration4;
           this.sellerRegistration5 = sellerRegistration5;
           this.sellerRegistration6 = sellerRegistration6;
           this.sellerRegistration7 = sellerRegistration7;
           this.sellerRegistration8 = sellerRegistration8;
           this.sellerRegistration9 = sellerRegistration9;
           this.buyerRegistration = buyerRegistration;
           this.middlemanRegistration = middlemanRegistration;
           this.pointOfTitleTransfer = pointOfTitleTransfer;
           this.giftCategory = giftCategory;
           this.timeCategory = timeCategory;
           this.hostHedge = hostHedge;
           this.timeHedge = timeHedge;
           this.velocityHedge = velocityHedge;
           this.nonsensicalHedge = nonsensicalHedge;
           this.phoneHedge = phoneHedge;
           this.obscenitiesHedge = obscenitiesHedge;
           this.unitOfMeasure = unitOfMeasure;
           this.taxRate = taxRate;
           this.totalAmount = totalAmount;
           this.discountAmount = discountAmount;
           this.discountRate = discountRate;
           this.commodityCode = commodityCode;
           this.grossNetIndicator = grossNetIndicator;
           this.taxTypeApplied = taxTypeApplied;
           this.discountIndicator = discountIndicator;
           this.alternateTaxID = alternateTaxID;
           this.alternateTaxAmount = alternateTaxAmount;
           this.alternateTaxTypeApplied = alternateTaxTypeApplied;
           this.alternateTaxRate = alternateTaxRate;
           this.alternateTaxType = alternateTaxType;
           this.localTax = localTax;
           this.zeroCostToCustomerIndicator = zeroCostToCustomerIndicator;
           this.passengerFirstName = passengerFirstName;
           this.passengerLastName = passengerLastName;
           this.passengerID = passengerID;
           this.passengerStatus = passengerStatus;
           this.passengerType = passengerType;
           this.passengerEmail = passengerEmail;
           this.passengerPhone = passengerPhone;
           this.invoiceNumber = invoiceNumber;
           this.productDescription = productDescription;
           this.taxStatusIndicator = taxStatusIndicator;
           this.discountManagementIndicator = discountManagementIndicator;
           this.typeOfSupply = typeOfSupply;
           this.sign = sign;
           this.unitTaxAmount = unitTaxAmount;
           this.id = id;
    }


    /**
     * Gets the unitPrice value for this Item.
     * 
     * @return unitPrice
     */
    public java.lang.String getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this Item.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.String unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the quantity value for this Item.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Item.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the productCode value for this Item.
     * 
     * @return productCode
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this Item.
     * 
     * @param productCode
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productName value for this Item.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this Item.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productSKU value for this Item.
     * 
     * @return productSKU
     */
    public java.lang.String getProductSKU() {
        return productSKU;
    }


    /**
     * Sets the productSKU value for this Item.
     * 
     * @param productSKU
     */
    public void setProductSKU(java.lang.String productSKU) {
        this.productSKU = productSKU;
    }


    /**
     * Gets the productRisk value for this Item.
     * 
     * @return productRisk
     */
    public java.lang.String getProductRisk() {
        return productRisk;
    }


    /**
     * Sets the productRisk value for this Item.
     * 
     * @param productRisk
     */
    public void setProductRisk(java.lang.String productRisk) {
        this.productRisk = productRisk;
    }


    /**
     * Gets the taxAmount value for this Item.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this Item.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the cityOverrideAmount value for this Item.
     * 
     * @return cityOverrideAmount
     */
    public java.lang.String getCityOverrideAmount() {
        return cityOverrideAmount;
    }


    /**
     * Sets the cityOverrideAmount value for this Item.
     * 
     * @param cityOverrideAmount
     */
    public void setCityOverrideAmount(java.lang.String cityOverrideAmount) {
        this.cityOverrideAmount = cityOverrideAmount;
    }


    /**
     * Gets the cityOverrideRate value for this Item.
     * 
     * @return cityOverrideRate
     */
    public java.lang.String getCityOverrideRate() {
        return cityOverrideRate;
    }


    /**
     * Sets the cityOverrideRate value for this Item.
     * 
     * @param cityOverrideRate
     */
    public void setCityOverrideRate(java.lang.String cityOverrideRate) {
        this.cityOverrideRate = cityOverrideRate;
    }


    /**
     * Gets the countyOverrideAmount value for this Item.
     * 
     * @return countyOverrideAmount
     */
    public java.lang.String getCountyOverrideAmount() {
        return countyOverrideAmount;
    }


    /**
     * Sets the countyOverrideAmount value for this Item.
     * 
     * @param countyOverrideAmount
     */
    public void setCountyOverrideAmount(java.lang.String countyOverrideAmount) {
        this.countyOverrideAmount = countyOverrideAmount;
    }


    /**
     * Gets the countyOverrideRate value for this Item.
     * 
     * @return countyOverrideRate
     */
    public java.lang.String getCountyOverrideRate() {
        return countyOverrideRate;
    }


    /**
     * Sets the countyOverrideRate value for this Item.
     * 
     * @param countyOverrideRate
     */
    public void setCountyOverrideRate(java.lang.String countyOverrideRate) {
        this.countyOverrideRate = countyOverrideRate;
    }


    /**
     * Gets the districtOverrideAmount value for this Item.
     * 
     * @return districtOverrideAmount
     */
    public java.lang.String getDistrictOverrideAmount() {
        return districtOverrideAmount;
    }


    /**
     * Sets the districtOverrideAmount value for this Item.
     * 
     * @param districtOverrideAmount
     */
    public void setDistrictOverrideAmount(java.lang.String districtOverrideAmount) {
        this.districtOverrideAmount = districtOverrideAmount;
    }


    /**
     * Gets the districtOverrideRate value for this Item.
     * 
     * @return districtOverrideRate
     */
    public java.lang.String getDistrictOverrideRate() {
        return districtOverrideRate;
    }


    /**
     * Sets the districtOverrideRate value for this Item.
     * 
     * @param districtOverrideRate
     */
    public void setDistrictOverrideRate(java.lang.String districtOverrideRate) {
        this.districtOverrideRate = districtOverrideRate;
    }


    /**
     * Gets the stateOverrideAmount value for this Item.
     * 
     * @return stateOverrideAmount
     */
    public java.lang.String getStateOverrideAmount() {
        return stateOverrideAmount;
    }


    /**
     * Sets the stateOverrideAmount value for this Item.
     * 
     * @param stateOverrideAmount
     */
    public void setStateOverrideAmount(java.lang.String stateOverrideAmount) {
        this.stateOverrideAmount = stateOverrideAmount;
    }


    /**
     * Gets the stateOverrideRate value for this Item.
     * 
     * @return stateOverrideRate
     */
    public java.lang.String getStateOverrideRate() {
        return stateOverrideRate;
    }


    /**
     * Sets the stateOverrideRate value for this Item.
     * 
     * @param stateOverrideRate
     */
    public void setStateOverrideRate(java.lang.String stateOverrideRate) {
        this.stateOverrideRate = stateOverrideRate;
    }


    /**
     * Gets the countryOverrideAmount value for this Item.
     * 
     * @return countryOverrideAmount
     */
    public java.lang.String getCountryOverrideAmount() {
        return countryOverrideAmount;
    }


    /**
     * Sets the countryOverrideAmount value for this Item.
     * 
     * @param countryOverrideAmount
     */
    public void setCountryOverrideAmount(java.lang.String countryOverrideAmount) {
        this.countryOverrideAmount = countryOverrideAmount;
    }


    /**
     * Gets the countryOverrideRate value for this Item.
     * 
     * @return countryOverrideRate
     */
    public java.lang.String getCountryOverrideRate() {
        return countryOverrideRate;
    }


    /**
     * Sets the countryOverrideRate value for this Item.
     * 
     * @param countryOverrideRate
     */
    public void setCountryOverrideRate(java.lang.String countryOverrideRate) {
        this.countryOverrideRate = countryOverrideRate;
    }


    /**
     * Gets the orderAcceptanceCity value for this Item.
     * 
     * @return orderAcceptanceCity
     */
    public java.lang.String getOrderAcceptanceCity() {
        return orderAcceptanceCity;
    }


    /**
     * Sets the orderAcceptanceCity value for this Item.
     * 
     * @param orderAcceptanceCity
     */
    public void setOrderAcceptanceCity(java.lang.String orderAcceptanceCity) {
        this.orderAcceptanceCity = orderAcceptanceCity;
    }


    /**
     * Gets the orderAcceptanceCounty value for this Item.
     * 
     * @return orderAcceptanceCounty
     */
    public java.lang.String getOrderAcceptanceCounty() {
        return orderAcceptanceCounty;
    }


    /**
     * Sets the orderAcceptanceCounty value for this Item.
     * 
     * @param orderAcceptanceCounty
     */
    public void setOrderAcceptanceCounty(java.lang.String orderAcceptanceCounty) {
        this.orderAcceptanceCounty = orderAcceptanceCounty;
    }


    /**
     * Gets the orderAcceptanceCountry value for this Item.
     * 
     * @return orderAcceptanceCountry
     */
    public java.lang.String getOrderAcceptanceCountry() {
        return orderAcceptanceCountry;
    }


    /**
     * Sets the orderAcceptanceCountry value for this Item.
     * 
     * @param orderAcceptanceCountry
     */
    public void setOrderAcceptanceCountry(java.lang.String orderAcceptanceCountry) {
        this.orderAcceptanceCountry = orderAcceptanceCountry;
    }


    /**
     * Gets the orderAcceptanceState value for this Item.
     * 
     * @return orderAcceptanceState
     */
    public java.lang.String getOrderAcceptanceState() {
        return orderAcceptanceState;
    }


    /**
     * Sets the orderAcceptanceState value for this Item.
     * 
     * @param orderAcceptanceState
     */
    public void setOrderAcceptanceState(java.lang.String orderAcceptanceState) {
        this.orderAcceptanceState = orderAcceptanceState;
    }


    /**
     * Gets the orderAcceptancePostalCode value for this Item.
     * 
     * @return orderAcceptancePostalCode
     */
    public java.lang.String getOrderAcceptancePostalCode() {
        return orderAcceptancePostalCode;
    }


    /**
     * Sets the orderAcceptancePostalCode value for this Item.
     * 
     * @param orderAcceptancePostalCode
     */
    public void setOrderAcceptancePostalCode(java.lang.String orderAcceptancePostalCode) {
        this.orderAcceptancePostalCode = orderAcceptancePostalCode;
    }


    /**
     * Gets the orderOriginCity value for this Item.
     * 
     * @return orderOriginCity
     */
    public java.lang.String getOrderOriginCity() {
        return orderOriginCity;
    }


    /**
     * Sets the orderOriginCity value for this Item.
     * 
     * @param orderOriginCity
     */
    public void setOrderOriginCity(java.lang.String orderOriginCity) {
        this.orderOriginCity = orderOriginCity;
    }


    /**
     * Gets the orderOriginCounty value for this Item.
     * 
     * @return orderOriginCounty
     */
    public java.lang.String getOrderOriginCounty() {
        return orderOriginCounty;
    }


    /**
     * Sets the orderOriginCounty value for this Item.
     * 
     * @param orderOriginCounty
     */
    public void setOrderOriginCounty(java.lang.String orderOriginCounty) {
        this.orderOriginCounty = orderOriginCounty;
    }


    /**
     * Gets the orderOriginCountry value for this Item.
     * 
     * @return orderOriginCountry
     */
    public java.lang.String getOrderOriginCountry() {
        return orderOriginCountry;
    }


    /**
     * Sets the orderOriginCountry value for this Item.
     * 
     * @param orderOriginCountry
     */
    public void setOrderOriginCountry(java.lang.String orderOriginCountry) {
        this.orderOriginCountry = orderOriginCountry;
    }


    /**
     * Gets the orderOriginState value for this Item.
     * 
     * @return orderOriginState
     */
    public java.lang.String getOrderOriginState() {
        return orderOriginState;
    }


    /**
     * Sets the orderOriginState value for this Item.
     * 
     * @param orderOriginState
     */
    public void setOrderOriginState(java.lang.String orderOriginState) {
        this.orderOriginState = orderOriginState;
    }


    /**
     * Gets the orderOriginPostalCode value for this Item.
     * 
     * @return orderOriginPostalCode
     */
    public java.lang.String getOrderOriginPostalCode() {
        return orderOriginPostalCode;
    }


    /**
     * Sets the orderOriginPostalCode value for this Item.
     * 
     * @param orderOriginPostalCode
     */
    public void setOrderOriginPostalCode(java.lang.String orderOriginPostalCode) {
        this.orderOriginPostalCode = orderOriginPostalCode;
    }


    /**
     * Gets the shipFromCity value for this Item.
     * 
     * @return shipFromCity
     */
    public java.lang.String getShipFromCity() {
        return shipFromCity;
    }


    /**
     * Sets the shipFromCity value for this Item.
     * 
     * @param shipFromCity
     */
    public void setShipFromCity(java.lang.String shipFromCity) {
        this.shipFromCity = shipFromCity;
    }


    /**
     * Gets the shipFromCounty value for this Item.
     * 
     * @return shipFromCounty
     */
    public java.lang.String getShipFromCounty() {
        return shipFromCounty;
    }


    /**
     * Sets the shipFromCounty value for this Item.
     * 
     * @param shipFromCounty
     */
    public void setShipFromCounty(java.lang.String shipFromCounty) {
        this.shipFromCounty = shipFromCounty;
    }


    /**
     * Gets the shipFromCountry value for this Item.
     * 
     * @return shipFromCountry
     */
    public java.lang.String getShipFromCountry() {
        return shipFromCountry;
    }


    /**
     * Sets the shipFromCountry value for this Item.
     * 
     * @param shipFromCountry
     */
    public void setShipFromCountry(java.lang.String shipFromCountry) {
        this.shipFromCountry = shipFromCountry;
    }


    /**
     * Gets the shipFromState value for this Item.
     * 
     * @return shipFromState
     */
    public java.lang.String getShipFromState() {
        return shipFromState;
    }


    /**
     * Sets the shipFromState value for this Item.
     * 
     * @param shipFromState
     */
    public void setShipFromState(java.lang.String shipFromState) {
        this.shipFromState = shipFromState;
    }


    /**
     * Gets the shipFromPostalCode value for this Item.
     * 
     * @return shipFromPostalCode
     */
    public java.lang.String getShipFromPostalCode() {
        return shipFromPostalCode;
    }


    /**
     * Sets the shipFromPostalCode value for this Item.
     * 
     * @param shipFromPostalCode
     */
    public void setShipFromPostalCode(java.lang.String shipFromPostalCode) {
        this.shipFromPostalCode = shipFromPostalCode;
    }


    /**
     * Gets the export value for this Item.
     * 
     * @return export
     */
    public java.lang.String getExport() {
        return export;
    }


    /**
     * Sets the export value for this Item.
     * 
     * @param export
     */
    public void setExport(java.lang.String export) {
        this.export = export;
    }


    /**
     * Gets the noExport value for this Item.
     * 
     * @return noExport
     */
    public java.lang.String getNoExport() {
        return noExport;
    }


    /**
     * Sets the noExport value for this Item.
     * 
     * @param noExport
     */
    public void setNoExport(java.lang.String noExport) {
        this.noExport = noExport;
    }


    /**
     * Gets the nationalTax value for this Item.
     * 
     * @return nationalTax
     */
    public java.lang.String getNationalTax() {
        return nationalTax;
    }


    /**
     * Sets the nationalTax value for this Item.
     * 
     * @param nationalTax
     */
    public void setNationalTax(java.lang.String nationalTax) {
        this.nationalTax = nationalTax;
    }


    /**
     * Gets the vatRate value for this Item.
     * 
     * @return vatRate
     */
    public java.lang.String getVatRate() {
        return vatRate;
    }


    /**
     * Sets the vatRate value for this Item.
     * 
     * @param vatRate
     */
    public void setVatRate(java.lang.String vatRate) {
        this.vatRate = vatRate;
    }


    /**
     * Gets the sellerRegistration value for this Item.
     * 
     * @return sellerRegistration
     */
    public java.lang.String getSellerRegistration() {
        return sellerRegistration;
    }


    /**
     * Sets the sellerRegistration value for this Item.
     * 
     * @param sellerRegistration
     */
    public void setSellerRegistration(java.lang.String sellerRegistration) {
        this.sellerRegistration = sellerRegistration;
    }


    /**
     * Gets the sellerRegistration0 value for this Item.
     * 
     * @return sellerRegistration0
     */
    public java.lang.String getSellerRegistration0() {
        return sellerRegistration0;
    }


    /**
     * Sets the sellerRegistration0 value for this Item.
     * 
     * @param sellerRegistration0
     */
    public void setSellerRegistration0(java.lang.String sellerRegistration0) {
        this.sellerRegistration0 = sellerRegistration0;
    }


    /**
     * Gets the sellerRegistration1 value for this Item.
     * 
     * @return sellerRegistration1
     */
    public java.lang.String getSellerRegistration1() {
        return sellerRegistration1;
    }


    /**
     * Sets the sellerRegistration1 value for this Item.
     * 
     * @param sellerRegistration1
     */
    public void setSellerRegistration1(java.lang.String sellerRegistration1) {
        this.sellerRegistration1 = sellerRegistration1;
    }


    /**
     * Gets the sellerRegistration2 value for this Item.
     * 
     * @return sellerRegistration2
     */
    public java.lang.String getSellerRegistration2() {
        return sellerRegistration2;
    }


    /**
     * Sets the sellerRegistration2 value for this Item.
     * 
     * @param sellerRegistration2
     */
    public void setSellerRegistration2(java.lang.String sellerRegistration2) {
        this.sellerRegistration2 = sellerRegistration2;
    }


    /**
     * Gets the sellerRegistration3 value for this Item.
     * 
     * @return sellerRegistration3
     */
    public java.lang.String getSellerRegistration3() {
        return sellerRegistration3;
    }


    /**
     * Sets the sellerRegistration3 value for this Item.
     * 
     * @param sellerRegistration3
     */
    public void setSellerRegistration3(java.lang.String sellerRegistration3) {
        this.sellerRegistration3 = sellerRegistration3;
    }


    /**
     * Gets the sellerRegistration4 value for this Item.
     * 
     * @return sellerRegistration4
     */
    public java.lang.String getSellerRegistration4() {
        return sellerRegistration4;
    }


    /**
     * Sets the sellerRegistration4 value for this Item.
     * 
     * @param sellerRegistration4
     */
    public void setSellerRegistration4(java.lang.String sellerRegistration4) {
        this.sellerRegistration4 = sellerRegistration4;
    }


    /**
     * Gets the sellerRegistration5 value for this Item.
     * 
     * @return sellerRegistration5
     */
    public java.lang.String getSellerRegistration5() {
        return sellerRegistration5;
    }


    /**
     * Sets the sellerRegistration5 value for this Item.
     * 
     * @param sellerRegistration5
     */
    public void setSellerRegistration5(java.lang.String sellerRegistration5) {
        this.sellerRegistration5 = sellerRegistration5;
    }


    /**
     * Gets the sellerRegistration6 value for this Item.
     * 
     * @return sellerRegistration6
     */
    public java.lang.String getSellerRegistration6() {
        return sellerRegistration6;
    }


    /**
     * Sets the sellerRegistration6 value for this Item.
     * 
     * @param sellerRegistration6
     */
    public void setSellerRegistration6(java.lang.String sellerRegistration6) {
        this.sellerRegistration6 = sellerRegistration6;
    }


    /**
     * Gets the sellerRegistration7 value for this Item.
     * 
     * @return sellerRegistration7
     */
    public java.lang.String getSellerRegistration7() {
        return sellerRegistration7;
    }


    /**
     * Sets the sellerRegistration7 value for this Item.
     * 
     * @param sellerRegistration7
     */
    public void setSellerRegistration7(java.lang.String sellerRegistration7) {
        this.sellerRegistration7 = sellerRegistration7;
    }


    /**
     * Gets the sellerRegistration8 value for this Item.
     * 
     * @return sellerRegistration8
     */
    public java.lang.String getSellerRegistration8() {
        return sellerRegistration8;
    }


    /**
     * Sets the sellerRegistration8 value for this Item.
     * 
     * @param sellerRegistration8
     */
    public void setSellerRegistration8(java.lang.String sellerRegistration8) {
        this.sellerRegistration8 = sellerRegistration8;
    }


    /**
     * Gets the sellerRegistration9 value for this Item.
     * 
     * @return sellerRegistration9
     */
    public java.lang.String getSellerRegistration9() {
        return sellerRegistration9;
    }


    /**
     * Sets the sellerRegistration9 value for this Item.
     * 
     * @param sellerRegistration9
     */
    public void setSellerRegistration9(java.lang.String sellerRegistration9) {
        this.sellerRegistration9 = sellerRegistration9;
    }


    /**
     * Gets the buyerRegistration value for this Item.
     * 
     * @return buyerRegistration
     */
    public java.lang.String getBuyerRegistration() {
        return buyerRegistration;
    }


    /**
     * Sets the buyerRegistration value for this Item.
     * 
     * @param buyerRegistration
     */
    public void setBuyerRegistration(java.lang.String buyerRegistration) {
        this.buyerRegistration = buyerRegistration;
    }


    /**
     * Gets the middlemanRegistration value for this Item.
     * 
     * @return middlemanRegistration
     */
    public java.lang.String getMiddlemanRegistration() {
        return middlemanRegistration;
    }


    /**
     * Sets the middlemanRegistration value for this Item.
     * 
     * @param middlemanRegistration
     */
    public void setMiddlemanRegistration(java.lang.String middlemanRegistration) {
        this.middlemanRegistration = middlemanRegistration;
    }


    /**
     * Gets the pointOfTitleTransfer value for this Item.
     * 
     * @return pointOfTitleTransfer
     */
    public java.lang.String getPointOfTitleTransfer() {
        return pointOfTitleTransfer;
    }


    /**
     * Sets the pointOfTitleTransfer value for this Item.
     * 
     * @param pointOfTitleTransfer
     */
    public void setPointOfTitleTransfer(java.lang.String pointOfTitleTransfer) {
        this.pointOfTitleTransfer = pointOfTitleTransfer;
    }


    /**
     * Gets the giftCategory value for this Item.
     * 
     * @return giftCategory
     */
    public java.lang.String getGiftCategory() {
        return giftCategory;
    }


    /**
     * Sets the giftCategory value for this Item.
     * 
     * @param giftCategory
     */
    public void setGiftCategory(java.lang.String giftCategory) {
        this.giftCategory = giftCategory;
    }


    /**
     * Gets the timeCategory value for this Item.
     * 
     * @return timeCategory
     */
    public java.lang.String getTimeCategory() {
        return timeCategory;
    }


    /**
     * Sets the timeCategory value for this Item.
     * 
     * @param timeCategory
     */
    public void setTimeCategory(java.lang.String timeCategory) {
        this.timeCategory = timeCategory;
    }


    /**
     * Gets the hostHedge value for this Item.
     * 
     * @return hostHedge
     */
    public java.lang.String getHostHedge() {
        return hostHedge;
    }


    /**
     * Sets the hostHedge value for this Item.
     * 
     * @param hostHedge
     */
    public void setHostHedge(java.lang.String hostHedge) {
        this.hostHedge = hostHedge;
    }


    /**
     * Gets the timeHedge value for this Item.
     * 
     * @return timeHedge
     */
    public java.lang.String getTimeHedge() {
        return timeHedge;
    }


    /**
     * Sets the timeHedge value for this Item.
     * 
     * @param timeHedge
     */
    public void setTimeHedge(java.lang.String timeHedge) {
        this.timeHedge = timeHedge;
    }


    /**
     * Gets the velocityHedge value for this Item.
     * 
     * @return velocityHedge
     */
    public java.lang.String getVelocityHedge() {
        return velocityHedge;
    }


    /**
     * Sets the velocityHedge value for this Item.
     * 
     * @param velocityHedge
     */
    public void setVelocityHedge(java.lang.String velocityHedge) {
        this.velocityHedge = velocityHedge;
    }


    /**
     * Gets the nonsensicalHedge value for this Item.
     * 
     * @return nonsensicalHedge
     */
    public java.lang.String getNonsensicalHedge() {
        return nonsensicalHedge;
    }


    /**
     * Sets the nonsensicalHedge value for this Item.
     * 
     * @param nonsensicalHedge
     */
    public void setNonsensicalHedge(java.lang.String nonsensicalHedge) {
        this.nonsensicalHedge = nonsensicalHedge;
    }


    /**
     * Gets the phoneHedge value for this Item.
     * 
     * @return phoneHedge
     */
    public java.lang.String getPhoneHedge() {
        return phoneHedge;
    }


    /**
     * Sets the phoneHedge value for this Item.
     * 
     * @param phoneHedge
     */
    public void setPhoneHedge(java.lang.String phoneHedge) {
        this.phoneHedge = phoneHedge;
    }


    /**
     * Gets the obscenitiesHedge value for this Item.
     * 
     * @return obscenitiesHedge
     */
    public java.lang.String getObscenitiesHedge() {
        return obscenitiesHedge;
    }


    /**
     * Sets the obscenitiesHedge value for this Item.
     * 
     * @param obscenitiesHedge
     */
    public void setObscenitiesHedge(java.lang.String obscenitiesHedge) {
        this.obscenitiesHedge = obscenitiesHedge;
    }


    /**
     * Gets the unitOfMeasure value for this Item.
     * 
     * @return unitOfMeasure
     */
    public java.lang.String getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this Item.
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(java.lang.String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the taxRate value for this Item.
     * 
     * @return taxRate
     */
    public java.lang.String getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this Item.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.String taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the totalAmount value for this Item.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this Item.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the discountAmount value for this Item.
     * 
     * @return discountAmount
     */
    public java.lang.String getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this Item.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.String discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the discountRate value for this Item.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this Item.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the commodityCode value for this Item.
     * 
     * @return commodityCode
     */
    public java.lang.String getCommodityCode() {
        return commodityCode;
    }


    /**
     * Sets the commodityCode value for this Item.
     * 
     * @param commodityCode
     */
    public void setCommodityCode(java.lang.String commodityCode) {
        this.commodityCode = commodityCode;
    }


    /**
     * Gets the grossNetIndicator value for this Item.
     * 
     * @return grossNetIndicator
     */
    public java.lang.String getGrossNetIndicator() {
        return grossNetIndicator;
    }


    /**
     * Sets the grossNetIndicator value for this Item.
     * 
     * @param grossNetIndicator
     */
    public void setGrossNetIndicator(java.lang.String grossNetIndicator) {
        this.grossNetIndicator = grossNetIndicator;
    }


    /**
     * Gets the taxTypeApplied value for this Item.
     * 
     * @return taxTypeApplied
     */
    public java.lang.String getTaxTypeApplied() {
        return taxTypeApplied;
    }


    /**
     * Sets the taxTypeApplied value for this Item.
     * 
     * @param taxTypeApplied
     */
    public void setTaxTypeApplied(java.lang.String taxTypeApplied) {
        this.taxTypeApplied = taxTypeApplied;
    }


    /**
     * Gets the discountIndicator value for this Item.
     * 
     * @return discountIndicator
     */
    public java.lang.String getDiscountIndicator() {
        return discountIndicator;
    }


    /**
     * Sets the discountIndicator value for this Item.
     * 
     * @param discountIndicator
     */
    public void setDiscountIndicator(java.lang.String discountIndicator) {
        this.discountIndicator = discountIndicator;
    }


    /**
     * Gets the alternateTaxID value for this Item.
     * 
     * @return alternateTaxID
     */
    public java.lang.String getAlternateTaxID() {
        return alternateTaxID;
    }


    /**
     * Sets the alternateTaxID value for this Item.
     * 
     * @param alternateTaxID
     */
    public void setAlternateTaxID(java.lang.String alternateTaxID) {
        this.alternateTaxID = alternateTaxID;
    }


    /**
     * Gets the alternateTaxAmount value for this Item.
     * 
     * @return alternateTaxAmount
     */
    public java.lang.String getAlternateTaxAmount() {
        return alternateTaxAmount;
    }


    /**
     * Sets the alternateTaxAmount value for this Item.
     * 
     * @param alternateTaxAmount
     */
    public void setAlternateTaxAmount(java.lang.String alternateTaxAmount) {
        this.alternateTaxAmount = alternateTaxAmount;
    }


    /**
     * Gets the alternateTaxTypeApplied value for this Item.
     * 
     * @return alternateTaxTypeApplied
     */
    public java.lang.String getAlternateTaxTypeApplied() {
        return alternateTaxTypeApplied;
    }


    /**
     * Sets the alternateTaxTypeApplied value for this Item.
     * 
     * @param alternateTaxTypeApplied
     */
    public void setAlternateTaxTypeApplied(java.lang.String alternateTaxTypeApplied) {
        this.alternateTaxTypeApplied = alternateTaxTypeApplied;
    }


    /**
     * Gets the alternateTaxRate value for this Item.
     * 
     * @return alternateTaxRate
     */
    public java.lang.String getAlternateTaxRate() {
        return alternateTaxRate;
    }


    /**
     * Sets the alternateTaxRate value for this Item.
     * 
     * @param alternateTaxRate
     */
    public void setAlternateTaxRate(java.lang.String alternateTaxRate) {
        this.alternateTaxRate = alternateTaxRate;
    }


    /**
     * Gets the alternateTaxType value for this Item.
     * 
     * @return alternateTaxType
     */
    public java.lang.String getAlternateTaxType() {
        return alternateTaxType;
    }


    /**
     * Sets the alternateTaxType value for this Item.
     * 
     * @param alternateTaxType
     */
    public void setAlternateTaxType(java.lang.String alternateTaxType) {
        this.alternateTaxType = alternateTaxType;
    }


    /**
     * Gets the localTax value for this Item.
     * 
     * @return localTax
     */
    public java.lang.String getLocalTax() {
        return localTax;
    }


    /**
     * Sets the localTax value for this Item.
     * 
     * @param localTax
     */
    public void setLocalTax(java.lang.String localTax) {
        this.localTax = localTax;
    }


    /**
     * Gets the zeroCostToCustomerIndicator value for this Item.
     * 
     * @return zeroCostToCustomerIndicator
     */
    public java.lang.String getZeroCostToCustomerIndicator() {
        return zeroCostToCustomerIndicator;
    }


    /**
     * Sets the zeroCostToCustomerIndicator value for this Item.
     * 
     * @param zeroCostToCustomerIndicator
     */
    public void setZeroCostToCustomerIndicator(java.lang.String zeroCostToCustomerIndicator) {
        this.zeroCostToCustomerIndicator = zeroCostToCustomerIndicator;
    }


    /**
     * Gets the passengerFirstName value for this Item.
     * 
     * @return passengerFirstName
     */
    public java.lang.String getPassengerFirstName() {
        return passengerFirstName;
    }


    /**
     * Sets the passengerFirstName value for this Item.
     * 
     * @param passengerFirstName
     */
    public void setPassengerFirstName(java.lang.String passengerFirstName) {
        this.passengerFirstName = passengerFirstName;
    }


    /**
     * Gets the passengerLastName value for this Item.
     * 
     * @return passengerLastName
     */
    public java.lang.String getPassengerLastName() {
        return passengerLastName;
    }


    /**
     * Sets the passengerLastName value for this Item.
     * 
     * @param passengerLastName
     */
    public void setPassengerLastName(java.lang.String passengerLastName) {
        this.passengerLastName = passengerLastName;
    }


    /**
     * Gets the passengerID value for this Item.
     * 
     * @return passengerID
     */
    public java.lang.String getPassengerID() {
        return passengerID;
    }


    /**
     * Sets the passengerID value for this Item.
     * 
     * @param passengerID
     */
    public void setPassengerID(java.lang.String passengerID) {
        this.passengerID = passengerID;
    }


    /**
     * Gets the passengerStatus value for this Item.
     * 
     * @return passengerStatus
     */
    public java.lang.String getPassengerStatus() {
        return passengerStatus;
    }


    /**
     * Sets the passengerStatus value for this Item.
     * 
     * @param passengerStatus
     */
    public void setPassengerStatus(java.lang.String passengerStatus) {
        this.passengerStatus = passengerStatus;
    }


    /**
     * Gets the passengerType value for this Item.
     * 
     * @return passengerType
     */
    public java.lang.String getPassengerType() {
        return passengerType;
    }


    /**
     * Sets the passengerType value for this Item.
     * 
     * @param passengerType
     */
    public void setPassengerType(java.lang.String passengerType) {
        this.passengerType = passengerType;
    }


    /**
     * Gets the passengerEmail value for this Item.
     * 
     * @return passengerEmail
     */
    public java.lang.String getPassengerEmail() {
        return passengerEmail;
    }


    /**
     * Sets the passengerEmail value for this Item.
     * 
     * @param passengerEmail
     */
    public void setPassengerEmail(java.lang.String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }


    /**
     * Gets the passengerPhone value for this Item.
     * 
     * @return passengerPhone
     */
    public java.lang.String getPassengerPhone() {
        return passengerPhone;
    }


    /**
     * Sets the passengerPhone value for this Item.
     * 
     * @param passengerPhone
     */
    public void setPassengerPhone(java.lang.String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }


    /**
     * Gets the invoiceNumber value for this Item.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Item.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the productDescription value for this Item.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this Item.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the taxStatusIndicator value for this Item.
     * 
     * @return taxStatusIndicator
     */
    public java.lang.String getTaxStatusIndicator() {
        return taxStatusIndicator;
    }


    /**
     * Sets the taxStatusIndicator value for this Item.
     * 
     * @param taxStatusIndicator
     */
    public void setTaxStatusIndicator(java.lang.String taxStatusIndicator) {
        this.taxStatusIndicator = taxStatusIndicator;
    }


    /**
     * Gets the discountManagementIndicator value for this Item.
     * 
     * @return discountManagementIndicator
     */
    public java.lang.String getDiscountManagementIndicator() {
        return discountManagementIndicator;
    }


    /**
     * Sets the discountManagementIndicator value for this Item.
     * 
     * @param discountManagementIndicator
     */
    public void setDiscountManagementIndicator(java.lang.String discountManagementIndicator) {
        this.discountManagementIndicator = discountManagementIndicator;
    }


    /**
     * Gets the typeOfSupply value for this Item.
     * 
     * @return typeOfSupply
     */
    public java.lang.String getTypeOfSupply() {
        return typeOfSupply;
    }


    /**
     * Sets the typeOfSupply value for this Item.
     * 
     * @param typeOfSupply
     */
    public void setTypeOfSupply(java.lang.String typeOfSupply) {
        this.typeOfSupply = typeOfSupply;
    }


    /**
     * Gets the sign value for this Item.
     * 
     * @return sign
     */
    public java.lang.String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this Item.
     * 
     * @param sign
     */
    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }


    /**
     * Gets the unitTaxAmount value for this Item.
     * 
     * @return unitTaxAmount
     */
    public java.lang.String getUnitTaxAmount() {
        return unitTaxAmount;
    }


    /**
     * Sets the unitTaxAmount value for this Item.
     * 
     * @param unitTaxAmount
     */
    public void setUnitTaxAmount(java.lang.String unitTaxAmount) {
        this.unitTaxAmount = unitTaxAmount;
    }


    /**
     * Gets the id value for this Item.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this Item.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productSKU==null && other.getProductSKU()==null) || 
             (this.productSKU!=null &&
              this.productSKU.equals(other.getProductSKU()))) &&
            ((this.productRisk==null && other.getProductRisk()==null) || 
             (this.productRisk!=null &&
              this.productRisk.equals(other.getProductRisk()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.cityOverrideAmount==null && other.getCityOverrideAmount()==null) || 
             (this.cityOverrideAmount!=null &&
              this.cityOverrideAmount.equals(other.getCityOverrideAmount()))) &&
            ((this.cityOverrideRate==null && other.getCityOverrideRate()==null) || 
             (this.cityOverrideRate!=null &&
              this.cityOverrideRate.equals(other.getCityOverrideRate()))) &&
            ((this.countyOverrideAmount==null && other.getCountyOverrideAmount()==null) || 
             (this.countyOverrideAmount!=null &&
              this.countyOverrideAmount.equals(other.getCountyOverrideAmount()))) &&
            ((this.countyOverrideRate==null && other.getCountyOverrideRate()==null) || 
             (this.countyOverrideRate!=null &&
              this.countyOverrideRate.equals(other.getCountyOverrideRate()))) &&
            ((this.districtOverrideAmount==null && other.getDistrictOverrideAmount()==null) || 
             (this.districtOverrideAmount!=null &&
              this.districtOverrideAmount.equals(other.getDistrictOverrideAmount()))) &&
            ((this.districtOverrideRate==null && other.getDistrictOverrideRate()==null) || 
             (this.districtOverrideRate!=null &&
              this.districtOverrideRate.equals(other.getDistrictOverrideRate()))) &&
            ((this.stateOverrideAmount==null && other.getStateOverrideAmount()==null) || 
             (this.stateOverrideAmount!=null &&
              this.stateOverrideAmount.equals(other.getStateOverrideAmount()))) &&
            ((this.stateOverrideRate==null && other.getStateOverrideRate()==null) || 
             (this.stateOverrideRate!=null &&
              this.stateOverrideRate.equals(other.getStateOverrideRate()))) &&
            ((this.countryOverrideAmount==null && other.getCountryOverrideAmount()==null) || 
             (this.countryOverrideAmount!=null &&
              this.countryOverrideAmount.equals(other.getCountryOverrideAmount()))) &&
            ((this.countryOverrideRate==null && other.getCountryOverrideRate()==null) || 
             (this.countryOverrideRate!=null &&
              this.countryOverrideRate.equals(other.getCountryOverrideRate()))) &&
            ((this.orderAcceptanceCity==null && other.getOrderAcceptanceCity()==null) || 
             (this.orderAcceptanceCity!=null &&
              this.orderAcceptanceCity.equals(other.getOrderAcceptanceCity()))) &&
            ((this.orderAcceptanceCounty==null && other.getOrderAcceptanceCounty()==null) || 
             (this.orderAcceptanceCounty!=null &&
              this.orderAcceptanceCounty.equals(other.getOrderAcceptanceCounty()))) &&
            ((this.orderAcceptanceCountry==null && other.getOrderAcceptanceCountry()==null) || 
             (this.orderAcceptanceCountry!=null &&
              this.orderAcceptanceCountry.equals(other.getOrderAcceptanceCountry()))) &&
            ((this.orderAcceptanceState==null && other.getOrderAcceptanceState()==null) || 
             (this.orderAcceptanceState!=null &&
              this.orderAcceptanceState.equals(other.getOrderAcceptanceState()))) &&
            ((this.orderAcceptancePostalCode==null && other.getOrderAcceptancePostalCode()==null) || 
             (this.orderAcceptancePostalCode!=null &&
              this.orderAcceptancePostalCode.equals(other.getOrderAcceptancePostalCode()))) &&
            ((this.orderOriginCity==null && other.getOrderOriginCity()==null) || 
             (this.orderOriginCity!=null &&
              this.orderOriginCity.equals(other.getOrderOriginCity()))) &&
            ((this.orderOriginCounty==null && other.getOrderOriginCounty()==null) || 
             (this.orderOriginCounty!=null &&
              this.orderOriginCounty.equals(other.getOrderOriginCounty()))) &&
            ((this.orderOriginCountry==null && other.getOrderOriginCountry()==null) || 
             (this.orderOriginCountry!=null &&
              this.orderOriginCountry.equals(other.getOrderOriginCountry()))) &&
            ((this.orderOriginState==null && other.getOrderOriginState()==null) || 
             (this.orderOriginState!=null &&
              this.orderOriginState.equals(other.getOrderOriginState()))) &&
            ((this.orderOriginPostalCode==null && other.getOrderOriginPostalCode()==null) || 
             (this.orderOriginPostalCode!=null &&
              this.orderOriginPostalCode.equals(other.getOrderOriginPostalCode()))) &&
            ((this.shipFromCity==null && other.getShipFromCity()==null) || 
             (this.shipFromCity!=null &&
              this.shipFromCity.equals(other.getShipFromCity()))) &&
            ((this.shipFromCounty==null && other.getShipFromCounty()==null) || 
             (this.shipFromCounty!=null &&
              this.shipFromCounty.equals(other.getShipFromCounty()))) &&
            ((this.shipFromCountry==null && other.getShipFromCountry()==null) || 
             (this.shipFromCountry!=null &&
              this.shipFromCountry.equals(other.getShipFromCountry()))) &&
            ((this.shipFromState==null && other.getShipFromState()==null) || 
             (this.shipFromState!=null &&
              this.shipFromState.equals(other.getShipFromState()))) &&
            ((this.shipFromPostalCode==null && other.getShipFromPostalCode()==null) || 
             (this.shipFromPostalCode!=null &&
              this.shipFromPostalCode.equals(other.getShipFromPostalCode()))) &&
            ((this.export==null && other.getExport()==null) || 
             (this.export!=null &&
              this.export.equals(other.getExport()))) &&
            ((this.noExport==null && other.getNoExport()==null) || 
             (this.noExport!=null &&
              this.noExport.equals(other.getNoExport()))) &&
            ((this.nationalTax==null && other.getNationalTax()==null) || 
             (this.nationalTax!=null &&
              this.nationalTax.equals(other.getNationalTax()))) &&
            ((this.vatRate==null && other.getVatRate()==null) || 
             (this.vatRate!=null &&
              this.vatRate.equals(other.getVatRate()))) &&
            ((this.sellerRegistration==null && other.getSellerRegistration()==null) || 
             (this.sellerRegistration!=null &&
              this.sellerRegistration.equals(other.getSellerRegistration()))) &&
            ((this.sellerRegistration0==null && other.getSellerRegistration0()==null) || 
             (this.sellerRegistration0!=null &&
              this.sellerRegistration0.equals(other.getSellerRegistration0()))) &&
            ((this.sellerRegistration1==null && other.getSellerRegistration1()==null) || 
             (this.sellerRegistration1!=null &&
              this.sellerRegistration1.equals(other.getSellerRegistration1()))) &&
            ((this.sellerRegistration2==null && other.getSellerRegistration2()==null) || 
             (this.sellerRegistration2!=null &&
              this.sellerRegistration2.equals(other.getSellerRegistration2()))) &&
            ((this.sellerRegistration3==null && other.getSellerRegistration3()==null) || 
             (this.sellerRegistration3!=null &&
              this.sellerRegistration3.equals(other.getSellerRegistration3()))) &&
            ((this.sellerRegistration4==null && other.getSellerRegistration4()==null) || 
             (this.sellerRegistration4!=null &&
              this.sellerRegistration4.equals(other.getSellerRegistration4()))) &&
            ((this.sellerRegistration5==null && other.getSellerRegistration5()==null) || 
             (this.sellerRegistration5!=null &&
              this.sellerRegistration5.equals(other.getSellerRegistration5()))) &&
            ((this.sellerRegistration6==null && other.getSellerRegistration6()==null) || 
             (this.sellerRegistration6!=null &&
              this.sellerRegistration6.equals(other.getSellerRegistration6()))) &&
            ((this.sellerRegistration7==null && other.getSellerRegistration7()==null) || 
             (this.sellerRegistration7!=null &&
              this.sellerRegistration7.equals(other.getSellerRegistration7()))) &&
            ((this.sellerRegistration8==null && other.getSellerRegistration8()==null) || 
             (this.sellerRegistration8!=null &&
              this.sellerRegistration8.equals(other.getSellerRegistration8()))) &&
            ((this.sellerRegistration9==null && other.getSellerRegistration9()==null) || 
             (this.sellerRegistration9!=null &&
              this.sellerRegistration9.equals(other.getSellerRegistration9()))) &&
            ((this.buyerRegistration==null && other.getBuyerRegistration()==null) || 
             (this.buyerRegistration!=null &&
              this.buyerRegistration.equals(other.getBuyerRegistration()))) &&
            ((this.middlemanRegistration==null && other.getMiddlemanRegistration()==null) || 
             (this.middlemanRegistration!=null &&
              this.middlemanRegistration.equals(other.getMiddlemanRegistration()))) &&
            ((this.pointOfTitleTransfer==null && other.getPointOfTitleTransfer()==null) || 
             (this.pointOfTitleTransfer!=null &&
              this.pointOfTitleTransfer.equals(other.getPointOfTitleTransfer()))) &&
            ((this.giftCategory==null && other.getGiftCategory()==null) || 
             (this.giftCategory!=null &&
              this.giftCategory.equals(other.getGiftCategory()))) &&
            ((this.timeCategory==null && other.getTimeCategory()==null) || 
             (this.timeCategory!=null &&
              this.timeCategory.equals(other.getTimeCategory()))) &&
            ((this.hostHedge==null && other.getHostHedge()==null) || 
             (this.hostHedge!=null &&
              this.hostHedge.equals(other.getHostHedge()))) &&
            ((this.timeHedge==null && other.getTimeHedge()==null) || 
             (this.timeHedge!=null &&
              this.timeHedge.equals(other.getTimeHedge()))) &&
            ((this.velocityHedge==null && other.getVelocityHedge()==null) || 
             (this.velocityHedge!=null &&
              this.velocityHedge.equals(other.getVelocityHedge()))) &&
            ((this.nonsensicalHedge==null && other.getNonsensicalHedge()==null) || 
             (this.nonsensicalHedge!=null &&
              this.nonsensicalHedge.equals(other.getNonsensicalHedge()))) &&
            ((this.phoneHedge==null && other.getPhoneHedge()==null) || 
             (this.phoneHedge!=null &&
              this.phoneHedge.equals(other.getPhoneHedge()))) &&
            ((this.obscenitiesHedge==null && other.getObscenitiesHedge()==null) || 
             (this.obscenitiesHedge!=null &&
              this.obscenitiesHedge.equals(other.getObscenitiesHedge()))) &&
            ((this.unitOfMeasure==null && other.getUnitOfMeasure()==null) || 
             (this.unitOfMeasure!=null &&
              this.unitOfMeasure.equals(other.getUnitOfMeasure()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.commodityCode==null && other.getCommodityCode()==null) || 
             (this.commodityCode!=null &&
              this.commodityCode.equals(other.getCommodityCode()))) &&
            ((this.grossNetIndicator==null && other.getGrossNetIndicator()==null) || 
             (this.grossNetIndicator!=null &&
              this.grossNetIndicator.equals(other.getGrossNetIndicator()))) &&
            ((this.taxTypeApplied==null && other.getTaxTypeApplied()==null) || 
             (this.taxTypeApplied!=null &&
              this.taxTypeApplied.equals(other.getTaxTypeApplied()))) &&
            ((this.discountIndicator==null && other.getDiscountIndicator()==null) || 
             (this.discountIndicator!=null &&
              this.discountIndicator.equals(other.getDiscountIndicator()))) &&
            ((this.alternateTaxID==null && other.getAlternateTaxID()==null) || 
             (this.alternateTaxID!=null &&
              this.alternateTaxID.equals(other.getAlternateTaxID()))) &&
            ((this.alternateTaxAmount==null && other.getAlternateTaxAmount()==null) || 
             (this.alternateTaxAmount!=null &&
              this.alternateTaxAmount.equals(other.getAlternateTaxAmount()))) &&
            ((this.alternateTaxTypeApplied==null && other.getAlternateTaxTypeApplied()==null) || 
             (this.alternateTaxTypeApplied!=null &&
              this.alternateTaxTypeApplied.equals(other.getAlternateTaxTypeApplied()))) &&
            ((this.alternateTaxRate==null && other.getAlternateTaxRate()==null) || 
             (this.alternateTaxRate!=null &&
              this.alternateTaxRate.equals(other.getAlternateTaxRate()))) &&
            ((this.alternateTaxType==null && other.getAlternateTaxType()==null) || 
             (this.alternateTaxType!=null &&
              this.alternateTaxType.equals(other.getAlternateTaxType()))) &&
            ((this.localTax==null && other.getLocalTax()==null) || 
             (this.localTax!=null &&
              this.localTax.equals(other.getLocalTax()))) &&
            ((this.zeroCostToCustomerIndicator==null && other.getZeroCostToCustomerIndicator()==null) || 
             (this.zeroCostToCustomerIndicator!=null &&
              this.zeroCostToCustomerIndicator.equals(other.getZeroCostToCustomerIndicator()))) &&
            ((this.passengerFirstName==null && other.getPassengerFirstName()==null) || 
             (this.passengerFirstName!=null &&
              this.passengerFirstName.equals(other.getPassengerFirstName()))) &&
            ((this.passengerLastName==null && other.getPassengerLastName()==null) || 
             (this.passengerLastName!=null &&
              this.passengerLastName.equals(other.getPassengerLastName()))) &&
            ((this.passengerID==null && other.getPassengerID()==null) || 
             (this.passengerID!=null &&
              this.passengerID.equals(other.getPassengerID()))) &&
            ((this.passengerStatus==null && other.getPassengerStatus()==null) || 
             (this.passengerStatus!=null &&
              this.passengerStatus.equals(other.getPassengerStatus()))) &&
            ((this.passengerType==null && other.getPassengerType()==null) || 
             (this.passengerType!=null &&
              this.passengerType.equals(other.getPassengerType()))) &&
            ((this.passengerEmail==null && other.getPassengerEmail()==null) || 
             (this.passengerEmail!=null &&
              this.passengerEmail.equals(other.getPassengerEmail()))) &&
            ((this.passengerPhone==null && other.getPassengerPhone()==null) || 
             (this.passengerPhone!=null &&
              this.passengerPhone.equals(other.getPassengerPhone()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.taxStatusIndicator==null && other.getTaxStatusIndicator()==null) || 
             (this.taxStatusIndicator!=null &&
              this.taxStatusIndicator.equals(other.getTaxStatusIndicator()))) &&
            ((this.discountManagementIndicator==null && other.getDiscountManagementIndicator()==null) || 
             (this.discountManagementIndicator!=null &&
              this.discountManagementIndicator.equals(other.getDiscountManagementIndicator()))) &&
            ((this.typeOfSupply==null && other.getTypeOfSupply()==null) || 
             (this.typeOfSupply!=null &&
              this.typeOfSupply.equals(other.getTypeOfSupply()))) &&
            ((this.sign==null && other.getSign()==null) || 
             (this.sign!=null &&
              this.sign.equals(other.getSign()))) &&
            ((this.unitTaxAmount==null && other.getUnitTaxAmount()==null) || 
             (this.unitTaxAmount!=null &&
              this.unitTaxAmount.equals(other.getUnitTaxAmount()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductSKU() != null) {
            _hashCode += getProductSKU().hashCode();
        }
        if (getProductRisk() != null) {
            _hashCode += getProductRisk().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getCityOverrideAmount() != null) {
            _hashCode += getCityOverrideAmount().hashCode();
        }
        if (getCityOverrideRate() != null) {
            _hashCode += getCityOverrideRate().hashCode();
        }
        if (getCountyOverrideAmount() != null) {
            _hashCode += getCountyOverrideAmount().hashCode();
        }
        if (getCountyOverrideRate() != null) {
            _hashCode += getCountyOverrideRate().hashCode();
        }
        if (getDistrictOverrideAmount() != null) {
            _hashCode += getDistrictOverrideAmount().hashCode();
        }
        if (getDistrictOverrideRate() != null) {
            _hashCode += getDistrictOverrideRate().hashCode();
        }
        if (getStateOverrideAmount() != null) {
            _hashCode += getStateOverrideAmount().hashCode();
        }
        if (getStateOverrideRate() != null) {
            _hashCode += getStateOverrideRate().hashCode();
        }
        if (getCountryOverrideAmount() != null) {
            _hashCode += getCountryOverrideAmount().hashCode();
        }
        if (getCountryOverrideRate() != null) {
            _hashCode += getCountryOverrideRate().hashCode();
        }
        if (getOrderAcceptanceCity() != null) {
            _hashCode += getOrderAcceptanceCity().hashCode();
        }
        if (getOrderAcceptanceCounty() != null) {
            _hashCode += getOrderAcceptanceCounty().hashCode();
        }
        if (getOrderAcceptanceCountry() != null) {
            _hashCode += getOrderAcceptanceCountry().hashCode();
        }
        if (getOrderAcceptanceState() != null) {
            _hashCode += getOrderAcceptanceState().hashCode();
        }
        if (getOrderAcceptancePostalCode() != null) {
            _hashCode += getOrderAcceptancePostalCode().hashCode();
        }
        if (getOrderOriginCity() != null) {
            _hashCode += getOrderOriginCity().hashCode();
        }
        if (getOrderOriginCounty() != null) {
            _hashCode += getOrderOriginCounty().hashCode();
        }
        if (getOrderOriginCountry() != null) {
            _hashCode += getOrderOriginCountry().hashCode();
        }
        if (getOrderOriginState() != null) {
            _hashCode += getOrderOriginState().hashCode();
        }
        if (getOrderOriginPostalCode() != null) {
            _hashCode += getOrderOriginPostalCode().hashCode();
        }
        if (getShipFromCity() != null) {
            _hashCode += getShipFromCity().hashCode();
        }
        if (getShipFromCounty() != null) {
            _hashCode += getShipFromCounty().hashCode();
        }
        if (getShipFromCountry() != null) {
            _hashCode += getShipFromCountry().hashCode();
        }
        if (getShipFromState() != null) {
            _hashCode += getShipFromState().hashCode();
        }
        if (getShipFromPostalCode() != null) {
            _hashCode += getShipFromPostalCode().hashCode();
        }
        if (getExport() != null) {
            _hashCode += getExport().hashCode();
        }
        if (getNoExport() != null) {
            _hashCode += getNoExport().hashCode();
        }
        if (getNationalTax() != null) {
            _hashCode += getNationalTax().hashCode();
        }
        if (getVatRate() != null) {
            _hashCode += getVatRate().hashCode();
        }
        if (getSellerRegistration() != null) {
            _hashCode += getSellerRegistration().hashCode();
        }
        if (getSellerRegistration0() != null) {
            _hashCode += getSellerRegistration0().hashCode();
        }
        if (getSellerRegistration1() != null) {
            _hashCode += getSellerRegistration1().hashCode();
        }
        if (getSellerRegistration2() != null) {
            _hashCode += getSellerRegistration2().hashCode();
        }
        if (getSellerRegistration3() != null) {
            _hashCode += getSellerRegistration3().hashCode();
        }
        if (getSellerRegistration4() != null) {
            _hashCode += getSellerRegistration4().hashCode();
        }
        if (getSellerRegistration5() != null) {
            _hashCode += getSellerRegistration5().hashCode();
        }
        if (getSellerRegistration6() != null) {
            _hashCode += getSellerRegistration6().hashCode();
        }
        if (getSellerRegistration7() != null) {
            _hashCode += getSellerRegistration7().hashCode();
        }
        if (getSellerRegistration8() != null) {
            _hashCode += getSellerRegistration8().hashCode();
        }
        if (getSellerRegistration9() != null) {
            _hashCode += getSellerRegistration9().hashCode();
        }
        if (getBuyerRegistration() != null) {
            _hashCode += getBuyerRegistration().hashCode();
        }
        if (getMiddlemanRegistration() != null) {
            _hashCode += getMiddlemanRegistration().hashCode();
        }
        if (getPointOfTitleTransfer() != null) {
            _hashCode += getPointOfTitleTransfer().hashCode();
        }
        if (getGiftCategory() != null) {
            _hashCode += getGiftCategory().hashCode();
        }
        if (getTimeCategory() != null) {
            _hashCode += getTimeCategory().hashCode();
        }
        if (getHostHedge() != null) {
            _hashCode += getHostHedge().hashCode();
        }
        if (getTimeHedge() != null) {
            _hashCode += getTimeHedge().hashCode();
        }
        if (getVelocityHedge() != null) {
            _hashCode += getVelocityHedge().hashCode();
        }
        if (getNonsensicalHedge() != null) {
            _hashCode += getNonsensicalHedge().hashCode();
        }
        if (getPhoneHedge() != null) {
            _hashCode += getPhoneHedge().hashCode();
        }
        if (getObscenitiesHedge() != null) {
            _hashCode += getObscenitiesHedge().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getCommodityCode() != null) {
            _hashCode += getCommodityCode().hashCode();
        }
        if (getGrossNetIndicator() != null) {
            _hashCode += getGrossNetIndicator().hashCode();
        }
        if (getTaxTypeApplied() != null) {
            _hashCode += getTaxTypeApplied().hashCode();
        }
        if (getDiscountIndicator() != null) {
            _hashCode += getDiscountIndicator().hashCode();
        }
        if (getAlternateTaxID() != null) {
            _hashCode += getAlternateTaxID().hashCode();
        }
        if (getAlternateTaxAmount() != null) {
            _hashCode += getAlternateTaxAmount().hashCode();
        }
        if (getAlternateTaxTypeApplied() != null) {
            _hashCode += getAlternateTaxTypeApplied().hashCode();
        }
        if (getAlternateTaxRate() != null) {
            _hashCode += getAlternateTaxRate().hashCode();
        }
        if (getAlternateTaxType() != null) {
            _hashCode += getAlternateTaxType().hashCode();
        }
        if (getLocalTax() != null) {
            _hashCode += getLocalTax().hashCode();
        }
        if (getZeroCostToCustomerIndicator() != null) {
            _hashCode += getZeroCostToCustomerIndicator().hashCode();
        }
        if (getPassengerFirstName() != null) {
            _hashCode += getPassengerFirstName().hashCode();
        }
        if (getPassengerLastName() != null) {
            _hashCode += getPassengerLastName().hashCode();
        }
        if (getPassengerID() != null) {
            _hashCode += getPassengerID().hashCode();
        }
        if (getPassengerStatus() != null) {
            _hashCode += getPassengerStatus().hashCode();
        }
        if (getPassengerType() != null) {
            _hashCode += getPassengerType().hashCode();
        }
        if (getPassengerEmail() != null) {
            _hashCode += getPassengerEmail().hashCode();
        }
        if (getPassengerPhone() != null) {
            _hashCode += getPassengerPhone().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getTaxStatusIndicator() != null) {
            _hashCode += getTaxStatusIndicator().hashCode();
        }
        if (getDiscountManagementIndicator() != null) {
            _hashCode += getDiscountManagementIndicator().hashCode();
        }
        if (getTypeOfSupply() != null) {
            _hashCode += getTypeOfSupply().hashCode();
        }
        if (getSign() != null) {
            _hashCode += getSign().hashCode();
        }
        if (getUnitTaxAmount() != null) {
            _hashCode += getUnitTaxAmount().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Item"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productCode"));
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
        elemField.setFieldName("productSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productRisk"));
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
        elemField.setFieldName("cityOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cityOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityOverrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cityOverrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "countyOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyOverrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "countyOverrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districtOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "districtOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districtOverrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "districtOverrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "stateOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOverrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "stateOverrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOverrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "countryOverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOverrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "countryOverrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAcceptanceCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderAcceptanceCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAcceptanceCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderAcceptanceCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAcceptanceCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderAcceptanceCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAcceptanceState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderAcceptanceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAcceptancePostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderAcceptancePostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderOriginCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderOriginCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderOriginCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderOriginCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderOriginCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderOriginCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderOriginState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderOriginState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderOriginPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderOriginPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFromCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFromCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFromCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFromState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFromPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "export"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noExport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "noExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "nationalTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vatRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration0");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration7");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistration9");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sellerRegistration9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "buyerRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlemanRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "middlemanRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointOfTitleTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pointOfTitleTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "giftCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "timeCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "hostHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "timeHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocityHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "velocityHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonsensicalHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "nonsensicalHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "phoneHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obscenitiesHedge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "obscenitiesHedge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "unitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalAmount"));
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
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "commodityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossNetIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "grossNetIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTypeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxTypeApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "discountIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTaxID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateTaxID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTaxTypeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateTaxTypeApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateTaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTaxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "alternateTaxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "localTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zeroCostToCustomerIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "zeroCostToCustomerIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerPhone"));
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
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxStatusIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxStatusIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountManagementIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "discountManagementIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfSupply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "typeOfSupply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "unitTaxAmount"));
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
