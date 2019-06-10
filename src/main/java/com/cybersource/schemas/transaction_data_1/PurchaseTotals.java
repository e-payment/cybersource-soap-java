
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PurchaseTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="discountAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="dutyAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="dutyAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grandTotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="freightAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="freightAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreignAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="foreignCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="originalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmountType0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmountType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmountType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmountType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmountType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmount4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceFeeAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="subtotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="shippingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="handlingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="shippingHandlingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="shippingDiscountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="giftWrapAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="insuranceAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseTotals", propOrder = {
    "currency",
    "discountAmount",
    "discountAmountSign",
    "discountManagementIndicator",
    "taxAmount",
    "dutyAmount",
    "dutyAmountSign",
    "grandTotalAmount",
    "freightAmount",
    "freightAmountSign",
    "foreignAmount",
    "foreignCurrency",
    "originalAmount",
    "originalCurrency",
    "exchangeRate",
    "exchangeRateTimeStamp",
    "additionalAmountType0",
    "additionalAmount0",
    "additionalAmountType1",
    "additionalAmount1",
    "additionalAmountType2",
    "additionalAmount2",
    "additionalAmountType3",
    "additionalAmount3",
    "additionalAmountType4",
    "additionalAmount4",
    "serviceFeeAmount",
    "subtotalAmount",
    "shippingAmount",
    "handlingAmount",
    "shippingHandlingAmount",
    "shippingDiscountAmount",
    "giftWrapAmount",
    "insuranceAmount"
})
public class PurchaseTotals {

    protected String currency;
    protected String discountAmount;
    protected String discountAmountSign;
    protected String discountManagementIndicator;
    protected String taxAmount;
    protected String dutyAmount;
    protected String dutyAmountSign;
    protected String grandTotalAmount;
    protected String freightAmount;
    protected String freightAmountSign;
    protected String foreignAmount;
    protected String foreignCurrency;
    protected String originalAmount;
    protected String originalCurrency;
    protected String exchangeRate;
    protected String exchangeRateTimeStamp;
    protected String additionalAmountType0;
    protected String additionalAmount0;
    protected String additionalAmountType1;
    protected String additionalAmount1;
    protected String additionalAmountType2;
    protected String additionalAmount2;
    protected String additionalAmountType3;
    protected String additionalAmount3;
    protected String additionalAmountType4;
    protected String additionalAmount4;
    protected String serviceFeeAmount;
    protected String subtotalAmount;
    protected String shippingAmount;
    protected String handlingAmount;
    protected String shippingHandlingAmount;
    protected String shippingDiscountAmount;
    protected String giftWrapAmount;
    protected String insuranceAmount;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the discountAmountSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmountSign() {
        return discountAmountSign;
    }

    /**
     * Sets the value of the discountAmountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmountSign(String value) {
        this.discountAmountSign = value;
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
     * Gets the value of the dutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyAmount() {
        return dutyAmount;
    }

    /**
     * Sets the value of the dutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyAmount(String value) {
        this.dutyAmount = value;
    }

    /**
     * Gets the value of the dutyAmountSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyAmountSign() {
        return dutyAmountSign;
    }

    /**
     * Sets the value of the dutyAmountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyAmountSign(String value) {
        this.dutyAmountSign = value;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotalAmount(String value) {
        this.grandTotalAmount = value;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmount(String value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the freightAmountSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmountSign() {
        return freightAmountSign;
    }

    /**
     * Sets the value of the freightAmountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmountSign(String value) {
        this.freightAmountSign = value;
    }

    /**
     * Gets the value of the foreignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignAmount() {
        return foreignAmount;
    }

    /**
     * Sets the value of the foreignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignAmount(String value) {
        this.foreignAmount = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCurrency(String value) {
        this.foreignCurrency = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAmount(String value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the originalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Sets the value of the originalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCurrency(String value) {
        this.originalCurrency = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateTimeStamp() {
        return exchangeRateTimeStamp;
    }

    /**
     * Sets the value of the exchangeRateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateTimeStamp(String value) {
        this.exchangeRateTimeStamp = value;
    }

    /**
     * Gets the value of the additionalAmountType0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType0() {
        return additionalAmountType0;
    }

    /**
     * Sets the value of the additionalAmountType0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType0(String value) {
        this.additionalAmountType0 = value;
    }

    /**
     * Gets the value of the additionalAmount0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount0() {
        return additionalAmount0;
    }

    /**
     * Sets the value of the additionalAmount0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount0(String value) {
        this.additionalAmount0 = value;
    }

    /**
     * Gets the value of the additionalAmountType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType1() {
        return additionalAmountType1;
    }

    /**
     * Sets the value of the additionalAmountType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType1(String value) {
        this.additionalAmountType1 = value;
    }

    /**
     * Gets the value of the additionalAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount1() {
        return additionalAmount1;
    }

    /**
     * Sets the value of the additionalAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount1(String value) {
        this.additionalAmount1 = value;
    }

    /**
     * Gets the value of the additionalAmountType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType2() {
        return additionalAmountType2;
    }

    /**
     * Sets the value of the additionalAmountType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType2(String value) {
        this.additionalAmountType2 = value;
    }

    /**
     * Gets the value of the additionalAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount2() {
        return additionalAmount2;
    }

    /**
     * Sets the value of the additionalAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount2(String value) {
        this.additionalAmount2 = value;
    }

    /**
     * Gets the value of the additionalAmountType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType3() {
        return additionalAmountType3;
    }

    /**
     * Sets the value of the additionalAmountType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType3(String value) {
        this.additionalAmountType3 = value;
    }

    /**
     * Gets the value of the additionalAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount3() {
        return additionalAmount3;
    }

    /**
     * Sets the value of the additionalAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount3(String value) {
        this.additionalAmount3 = value;
    }

    /**
     * Gets the value of the additionalAmountType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType4() {
        return additionalAmountType4;
    }

    /**
     * Sets the value of the additionalAmountType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType4(String value) {
        this.additionalAmountType4 = value;
    }

    /**
     * Gets the value of the additionalAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount4() {
        return additionalAmount4;
    }

    /**
     * Sets the value of the additionalAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount4(String value) {
        this.additionalAmount4 = value;
    }

    /**
     * Gets the value of the serviceFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeAmount() {
        return serviceFeeAmount;
    }

    /**
     * Sets the value of the serviceFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeAmount(String value) {
        this.serviceFeeAmount = value;
    }

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalAmount(String value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAmount(String value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the handlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingAmount() {
        return handlingAmount;
    }

    /**
     * Sets the value of the handlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingAmount(String value) {
        this.handlingAmount = value;
    }

    /**
     * Gets the value of the shippingHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }

    /**
     * Sets the value of the shippingHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHandlingAmount(String value) {
        this.shippingHandlingAmount = value;
    }

    /**
     * Gets the value of the shippingDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * Sets the value of the shippingDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDiscountAmount(String value) {
        this.shippingDiscountAmount = value;
    }

    /**
     * Gets the value of the giftWrapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * Sets the value of the giftWrapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapAmount(String value) {
        this.giftWrapAmount = value;
    }

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceAmount(String value) {
        this.insuranceAmount = value;
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
