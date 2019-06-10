
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitPrice" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productRisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="cityOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="cityOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countyOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countyOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="districtOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="districtOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="stateOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="stateOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countryOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="countryOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptanceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAcceptancePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderOriginPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipFromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipFromCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipFromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipFromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipFromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalTax" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="vatRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellerRegistration9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middlemanRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfTitleTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCategory" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="velocityHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonsensicalHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obscenitiesHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="discountRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="commodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grossNetIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxTypeApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxTypeApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="alternateTaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localTax" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="zeroCostToCustomerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeOfSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "unitPrice",
    "quantity",
    "productCode",
    "productName",
    "productSKU",
    "productRisk",
    "taxAmount",
    "cityOverrideAmount",
    "cityOverrideRate",
    "countyOverrideAmount",
    "countyOverrideRate",
    "districtOverrideAmount",
    "districtOverrideRate",
    "stateOverrideAmount",
    "stateOverrideRate",
    "countryOverrideAmount",
    "countryOverrideRate",
    "orderAcceptanceCity",
    "orderAcceptanceCounty",
    "orderAcceptanceCountry",
    "orderAcceptanceState",
    "orderAcceptancePostalCode",
    "orderOriginCity",
    "orderOriginCounty",
    "orderOriginCountry",
    "orderOriginState",
    "orderOriginPostalCode",
    "shipFromCity",
    "shipFromCounty",
    "shipFromCountry",
    "shipFromState",
    "shipFromPostalCode",
    "export",
    "noExport",
    "nationalTax",
    "vatRate",
    "sellerRegistration",
    "sellerRegistration0",
    "sellerRegistration1",
    "sellerRegistration2",
    "sellerRegistration3",
    "sellerRegistration4",
    "sellerRegistration5",
    "sellerRegistration6",
    "sellerRegistration7",
    "sellerRegistration8",
    "sellerRegistration9",
    "buyerRegistration",
    "middlemanRegistration",
    "pointOfTitleTransfer",
    "giftCategory",
    "timeCategory",
    "hostHedge",
    "timeHedge",
    "velocityHedge",
    "nonsensicalHedge",
    "phoneHedge",
    "obscenitiesHedge",
    "unitOfMeasure",
    "taxRate",
    "totalAmount",
    "discountAmount",
    "discountRate",
    "commodityCode",
    "grossNetIndicator",
    "taxTypeApplied",
    "discountIndicator",
    "alternateTaxID",
    "alternateTaxAmount",
    "alternateTaxTypeApplied",
    "alternateTaxRate",
    "alternateTaxType",
    "localTax",
    "zeroCostToCustomerIndicator",
    "passengerFirstName",
    "passengerLastName",
    "passengerID",
    "passengerStatus",
    "passengerType",
    "passengerEmail",
    "passengerPhone",
    "invoiceNumber",
    "productDescription",
    "taxStatusIndicator",
    "discountManagementIndicator",
    "typeOfSupply",
    "sign",
    "unitTaxAmount"
})
public class Item {

    protected String unitPrice;
    protected String quantity;
    protected String productCode;
    protected String productName;
    protected String productSKU;
    protected String productRisk;
    protected String taxAmount;
    protected String cityOverrideAmount;
    protected String cityOverrideRate;
    protected String countyOverrideAmount;
    protected String countyOverrideRate;
    protected String districtOverrideAmount;
    protected String districtOverrideRate;
    protected String stateOverrideAmount;
    protected String stateOverrideRate;
    protected String countryOverrideAmount;
    protected String countryOverrideRate;
    protected String orderAcceptanceCity;
    protected String orderAcceptanceCounty;
    protected String orderAcceptanceCountry;
    protected String orderAcceptanceState;
    protected String orderAcceptancePostalCode;
    protected String orderOriginCity;
    protected String orderOriginCounty;
    protected String orderOriginCountry;
    protected String orderOriginState;
    protected String orderOriginPostalCode;
    protected String shipFromCity;
    protected String shipFromCounty;
    protected String shipFromCountry;
    protected String shipFromState;
    protected String shipFromPostalCode;
    protected String export;
    protected String noExport;
    protected String nationalTax;
    protected String vatRate;
    protected String sellerRegistration;
    protected String sellerRegistration0;
    protected String sellerRegistration1;
    protected String sellerRegistration2;
    protected String sellerRegistration3;
    protected String sellerRegistration4;
    protected String sellerRegistration5;
    protected String sellerRegistration6;
    protected String sellerRegistration7;
    protected String sellerRegistration8;
    protected String sellerRegistration9;
    protected String buyerRegistration;
    protected String middlemanRegistration;
    protected String pointOfTitleTransfer;
    protected String giftCategory;
    protected String timeCategory;
    protected String hostHedge;
    protected String timeHedge;
    protected String velocityHedge;
    protected String nonsensicalHedge;
    protected String phoneHedge;
    protected String obscenitiesHedge;
    protected String unitOfMeasure;
    protected String taxRate;
    protected String totalAmount;
    protected String discountAmount;
    protected String discountRate;
    protected String commodityCode;
    protected String grossNetIndicator;
    protected String taxTypeApplied;
    protected String discountIndicator;
    protected String alternateTaxID;
    protected String alternateTaxAmount;
    protected String alternateTaxTypeApplied;
    protected String alternateTaxRate;
    protected String alternateTaxType;
    protected String localTax;
    protected String zeroCostToCustomerIndicator;
    protected String passengerFirstName;
    protected String passengerLastName;
    protected String passengerID;
    protected String passengerStatus;
    protected String passengerType;
    protected String passengerEmail;
    protected String passengerPhone;
    protected String invoiceNumber;
    protected String productDescription;
    protected String taxStatusIndicator;
    protected String discountManagementIndicator;
    protected String typeOfSupply;
    protected String sign;
    protected String unitTaxAmount;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Sets the value of the productSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

    /**
     * Gets the value of the productRisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRisk() {
        return productRisk;
    }

    /**
     * Sets the value of the productRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRisk(String value) {
        this.productRisk = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the cityOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOverrideAmount() {
        return cityOverrideAmount;
    }

    /**
     * Sets the value of the cityOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOverrideAmount(String value) {
        this.cityOverrideAmount = value;
    }

    /**
     * Gets the value of the cityOverrideRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOverrideRate() {
        return cityOverrideRate;
    }

    /**
     * Sets the value of the cityOverrideRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOverrideRate(String value) {
        this.cityOverrideRate = value;
    }

    /**
     * Gets the value of the countyOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOverrideAmount() {
        return countyOverrideAmount;
    }

    /**
     * Sets the value of the countyOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOverrideAmount(String value) {
        this.countyOverrideAmount = value;
    }

    /**
     * Gets the value of the countyOverrideRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOverrideRate() {
        return countyOverrideRate;
    }

    /**
     * Sets the value of the countyOverrideRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOverrideRate(String value) {
        this.countyOverrideRate = value;
    }

    /**
     * Gets the value of the districtOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOverrideAmount() {
        return districtOverrideAmount;
    }

    /**
     * Sets the value of the districtOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOverrideAmount(String value) {
        this.districtOverrideAmount = value;
    }

    /**
     * Gets the value of the districtOverrideRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOverrideRate() {
        return districtOverrideRate;
    }

    /**
     * Sets the value of the districtOverrideRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOverrideRate(String value) {
        this.districtOverrideRate = value;
    }

    /**
     * Gets the value of the stateOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOverrideAmount() {
        return stateOverrideAmount;
    }

    /**
     * Sets the value of the stateOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOverrideAmount(String value) {
        this.stateOverrideAmount = value;
    }

    /**
     * Gets the value of the stateOverrideRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOverrideRate() {
        return stateOverrideRate;
    }

    /**
     * Sets the value of the stateOverrideRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOverrideRate(String value) {
        this.stateOverrideRate = value;
    }

    /**
     * Gets the value of the countryOverrideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOverrideAmount() {
        return countryOverrideAmount;
    }

    /**
     * Sets the value of the countryOverrideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOverrideAmount(String value) {
        this.countryOverrideAmount = value;
    }

    /**
     * Gets the value of the countryOverrideRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOverrideRate() {
        return countryOverrideRate;
    }

    /**
     * Sets the value of the countryOverrideRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOverrideRate(String value) {
        this.countryOverrideRate = value;
    }

    /**
     * Gets the value of the orderAcceptanceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCity() {
        return orderAcceptanceCity;
    }

    /**
     * Sets the value of the orderAcceptanceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCity(String value) {
        this.orderAcceptanceCity = value;
    }

    /**
     * Gets the value of the orderAcceptanceCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCounty() {
        return orderAcceptanceCounty;
    }

    /**
     * Sets the value of the orderAcceptanceCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCounty(String value) {
        this.orderAcceptanceCounty = value;
    }

    /**
     * Gets the value of the orderAcceptanceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCountry() {
        return orderAcceptanceCountry;
    }

    /**
     * Sets the value of the orderAcceptanceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCountry(String value) {
        this.orderAcceptanceCountry = value;
    }

    /**
     * Gets the value of the orderAcceptanceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceState() {
        return orderAcceptanceState;
    }

    /**
     * Sets the value of the orderAcceptanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceState(String value) {
        this.orderAcceptanceState = value;
    }

    /**
     * Gets the value of the orderAcceptancePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptancePostalCode() {
        return orderAcceptancePostalCode;
    }

    /**
     * Sets the value of the orderAcceptancePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptancePostalCode(String value) {
        this.orderAcceptancePostalCode = value;
    }

    /**
     * Gets the value of the orderOriginCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCity() {
        return orderOriginCity;
    }

    /**
     * Sets the value of the orderOriginCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCity(String value) {
        this.orderOriginCity = value;
    }

    /**
     * Gets the value of the orderOriginCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCounty() {
        return orderOriginCounty;
    }

    /**
     * Sets the value of the orderOriginCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCounty(String value) {
        this.orderOriginCounty = value;
    }

    /**
     * Gets the value of the orderOriginCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCountry() {
        return orderOriginCountry;
    }

    /**
     * Sets the value of the orderOriginCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCountry(String value) {
        this.orderOriginCountry = value;
    }

    /**
     * Gets the value of the orderOriginState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginState() {
        return orderOriginState;
    }

    /**
     * Sets the value of the orderOriginState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginState(String value) {
        this.orderOriginState = value;
    }

    /**
     * Gets the value of the orderOriginPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginPostalCode() {
        return orderOriginPostalCode;
    }

    /**
     * Sets the value of the orderOriginPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginPostalCode(String value) {
        this.orderOriginPostalCode = value;
    }

    /**
     * Gets the value of the shipFromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCity() {
        return shipFromCity;
    }

    /**
     * Sets the value of the shipFromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCity(String value) {
        this.shipFromCity = value;
    }

    /**
     * Gets the value of the shipFromCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCounty() {
        return shipFromCounty;
    }

    /**
     * Sets the value of the shipFromCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCounty(String value) {
        this.shipFromCounty = value;
    }

    /**
     * Gets the value of the shipFromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCountry() {
        return shipFromCountry;
    }

    /**
     * Sets the value of the shipFromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCountry(String value) {
        this.shipFromCountry = value;
    }

    /**
     * Gets the value of the shipFromState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromState() {
        return shipFromState;
    }

    /**
     * Sets the value of the shipFromState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromState(String value) {
        this.shipFromState = value;
    }

    /**
     * Gets the value of the shipFromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromPostalCode() {
        return shipFromPostalCode;
    }

    /**
     * Sets the value of the shipFromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromPostalCode(String value) {
        this.shipFromPostalCode = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExport(String value) {
        this.export = value;
    }

    /**
     * Gets the value of the noExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoExport() {
        return noExport;
    }

    /**
     * Sets the value of the noExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExport(String value) {
        this.noExport = value;
    }

    /**
     * Gets the value of the nationalTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalTax() {
        return nationalTax;
    }

    /**
     * Sets the value of the nationalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalTax(String value) {
        this.nationalTax = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRate(String value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the sellerRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration() {
        return sellerRegistration;
    }

    /**
     * Sets the value of the sellerRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration(String value) {
        this.sellerRegistration = value;
    }

    /**
     * Gets the value of the sellerRegistration0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration0() {
        return sellerRegistration0;
    }

    /**
     * Sets the value of the sellerRegistration0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration0(String value) {
        this.sellerRegistration0 = value;
    }

    /**
     * Gets the value of the sellerRegistration1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration1() {
        return sellerRegistration1;
    }

    /**
     * Sets the value of the sellerRegistration1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration1(String value) {
        this.sellerRegistration1 = value;
    }

    /**
     * Gets the value of the sellerRegistration2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration2() {
        return sellerRegistration2;
    }

    /**
     * Sets the value of the sellerRegistration2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration2(String value) {
        this.sellerRegistration2 = value;
    }

    /**
     * Gets the value of the sellerRegistration3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration3() {
        return sellerRegistration3;
    }

    /**
     * Sets the value of the sellerRegistration3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration3(String value) {
        this.sellerRegistration3 = value;
    }

    /**
     * Gets the value of the sellerRegistration4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration4() {
        return sellerRegistration4;
    }

    /**
     * Sets the value of the sellerRegistration4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration4(String value) {
        this.sellerRegistration4 = value;
    }

    /**
     * Gets the value of the sellerRegistration5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration5() {
        return sellerRegistration5;
    }

    /**
     * Sets the value of the sellerRegistration5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration5(String value) {
        this.sellerRegistration5 = value;
    }

    /**
     * Gets the value of the sellerRegistration6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration6() {
        return sellerRegistration6;
    }

    /**
     * Sets the value of the sellerRegistration6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration6(String value) {
        this.sellerRegistration6 = value;
    }

    /**
     * Gets the value of the sellerRegistration7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration7() {
        return sellerRegistration7;
    }

    /**
     * Sets the value of the sellerRegistration7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration7(String value) {
        this.sellerRegistration7 = value;
    }

    /**
     * Gets the value of the sellerRegistration8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration8() {
        return sellerRegistration8;
    }

    /**
     * Sets the value of the sellerRegistration8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration8(String value) {
        this.sellerRegistration8 = value;
    }

    /**
     * Gets the value of the sellerRegistration9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration9() {
        return sellerRegistration9;
    }

    /**
     * Sets the value of the sellerRegistration9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration9(String value) {
        this.sellerRegistration9 = value;
    }

    /**
     * Gets the value of the buyerRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerRegistration() {
        return buyerRegistration;
    }

    /**
     * Sets the value of the buyerRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerRegistration(String value) {
        this.buyerRegistration = value;
    }

    /**
     * Gets the value of the middlemanRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlemanRegistration() {
        return middlemanRegistration;
    }

    /**
     * Sets the value of the middlemanRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlemanRegistration(String value) {
        this.middlemanRegistration = value;
    }

    /**
     * Gets the value of the pointOfTitleTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfTitleTransfer() {
        return pointOfTitleTransfer;
    }

    /**
     * Sets the value of the pointOfTitleTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfTitleTransfer(String value) {
        this.pointOfTitleTransfer = value;
    }

    /**
     * Gets the value of the giftCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCategory() {
        return giftCategory;
    }

    /**
     * Sets the value of the giftCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCategory(String value) {
        this.giftCategory = value;
    }

    /**
     * Gets the value of the timeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCategory() {
        return timeCategory;
    }

    /**
     * Sets the value of the timeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCategory(String value) {
        this.timeCategory = value;
    }

    /**
     * Gets the value of the hostHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostHedge() {
        return hostHedge;
    }

    /**
     * Sets the value of the hostHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostHedge(String value) {
        this.hostHedge = value;
    }

    /**
     * Gets the value of the timeHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeHedge() {
        return timeHedge;
    }

    /**
     * Sets the value of the timeHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeHedge(String value) {
        this.timeHedge = value;
    }

    /**
     * Gets the value of the velocityHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityHedge() {
        return velocityHedge;
    }

    /**
     * Sets the value of the velocityHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityHedge(String value) {
        this.velocityHedge = value;
    }

    /**
     * Gets the value of the nonsensicalHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonsensicalHedge() {
        return nonsensicalHedge;
    }

    /**
     * Sets the value of the nonsensicalHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonsensicalHedge(String value) {
        this.nonsensicalHedge = value;
    }

    /**
     * Gets the value of the phoneHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHedge() {
        return phoneHedge;
    }

    /**
     * Sets the value of the phoneHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHedge(String value) {
        this.phoneHedge = value;
    }

    /**
     * Gets the value of the obscenitiesHedge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObscenitiesHedge() {
        return obscenitiesHedge;
    }

    /**
     * Sets the value of the obscenitiesHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObscenitiesHedge(String value) {
        this.obscenitiesHedge = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountRate(String value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the grossNetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossNetIndicator() {
        return grossNetIndicator;
    }

    /**
     * Sets the value of the grossNetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossNetIndicator(String value) {
        this.grossNetIndicator = value;
    }

    /**
     * Gets the value of the taxTypeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeApplied() {
        return taxTypeApplied;
    }

    /**
     * Sets the value of the taxTypeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeApplied(String value) {
        this.taxTypeApplied = value;
    }

    /**
     * Gets the value of the discountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * Sets the value of the discountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountIndicator(String value) {
        this.discountIndicator = value;
    }

    /**
     * Gets the value of the alternateTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxID() {
        return alternateTaxID;
    }

    /**
     * Sets the value of the alternateTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxID(String value) {
        this.alternateTaxID = value;
    }

    /**
     * Gets the value of the alternateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxAmount() {
        return alternateTaxAmount;
    }

    /**
     * Sets the value of the alternateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxAmount(String value) {
        this.alternateTaxAmount = value;
    }

    /**
     * Gets the value of the alternateTaxTypeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxTypeApplied() {
        return alternateTaxTypeApplied;
    }

    /**
     * Sets the value of the alternateTaxTypeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxTypeApplied(String value) {
        this.alternateTaxTypeApplied = value;
    }

    /**
     * Gets the value of the alternateTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxRate() {
        return alternateTaxRate;
    }

    /**
     * Sets the value of the alternateTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxRate(String value) {
        this.alternateTaxRate = value;
    }

    /**
     * Gets the value of the alternateTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxType() {
        return alternateTaxType;
    }

    /**
     * Sets the value of the alternateTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxType(String value) {
        this.alternateTaxType = value;
    }

    /**
     * Gets the value of the localTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTax() {
        return localTax;
    }

    /**
     * Sets the value of the localTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTax(String value) {
        this.localTax = value;
    }

    /**
     * Gets the value of the zeroCostToCustomerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroCostToCustomerIndicator() {
        return zeroCostToCustomerIndicator;
    }

    /**
     * Sets the value of the zeroCostToCustomerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroCostToCustomerIndicator(String value) {
        this.zeroCostToCustomerIndicator = value;
    }

    /**
     * Gets the value of the passengerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    /**
     * Sets the value of the passengerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFirstName(String value) {
        this.passengerFirstName = value;
    }

    /**
     * Gets the value of the passengerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerLastName() {
        return passengerLastName;
    }

    /**
     * Sets the value of the passengerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerLastName(String value) {
        this.passengerLastName = value;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the passengerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerStatus() {
        return passengerStatus;
    }

    /**
     * Sets the value of the passengerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerStatus(String value) {
        this.passengerStatus = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the passengerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerEmail() {
        return passengerEmail;
    }

    /**
     * Sets the value of the passengerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerEmail(String value) {
        this.passengerEmail = value;
    }

    /**
     * Gets the value of the passengerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerPhone() {
        return passengerPhone;
    }

    /**
     * Sets the value of the passengerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerPhone(String value) {
        this.passengerPhone = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the taxStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatusIndicator() {
        return taxStatusIndicator;
    }

    /**
     * Sets the value of the taxStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatusIndicator(String value) {
        this.taxStatusIndicator = value;
    }

    /**
     * Gets the value of the discountManagementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountManagementIndicator() {
        return discountManagementIndicator;
    }

    /**
     * Sets the value of the discountManagementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountManagementIndicator(String value) {
        this.discountManagementIndicator = value;
    }

    /**
     * Gets the value of the typeOfSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSupply() {
        return typeOfSupply;
    }

    /**
     * Sets the value of the typeOfSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSupply(String value) {
        this.typeOfSupply = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Gets the value of the unitTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTaxAmount() {
        return unitTaxAmount;
    }

    /**
     * Sets the value of the unitTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTaxAmount(String value) {
        this.unitTaxAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
