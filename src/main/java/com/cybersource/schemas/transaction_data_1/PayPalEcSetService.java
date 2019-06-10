
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PayPalEcSetService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPalEcSetService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paypalReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalCancelReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalMaxamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalReqconfirmshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalNoshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalAddressOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalLc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalPagestyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalHdrimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalHdrbordercolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalHdrbackcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalPayflowcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcSetRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcSetRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promoCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestBillingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalBillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalBillingAgreementDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalBillingAgreementCustom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalLogoimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalEcSetService", propOrder = {
    "paypalReturn",
    "paypalCancelReturn",
    "paypalMaxamt",
    "paypalCustomerEmail",
    "paypalDesc",
    "paypalReqconfirmshipping",
    "paypalNoshipping",
    "paypalAddressOverride",
    "paypalToken",
    "paypalLc",
    "paypalPagestyle",
    "paypalHdrimg",
    "paypalHdrbordercolor",
    "paypalHdrbackcolor",
    "paypalPayflowcolor",
    "paypalEcSetRequestID",
    "paypalEcSetRequestToken",
    "promoCode0",
    "requestBillingAddress",
    "invoiceNumber",
    "paypalBillingType",
    "paypalBillingAgreementDesc",
    "paypalPaymentType",
    "paypalBillingAgreementCustom",
    "paypalLogoimg"
})
public class PayPalEcSetService {

    protected String paypalReturn;
    protected String paypalCancelReturn;
    protected String paypalMaxamt;
    protected String paypalCustomerEmail;
    protected String paypalDesc;
    protected String paypalReqconfirmshipping;
    protected String paypalNoshipping;
    protected String paypalAddressOverride;
    protected String paypalToken;
    protected String paypalLc;
    protected String paypalPagestyle;
    protected String paypalHdrimg;
    protected String paypalHdrbordercolor;
    protected String paypalHdrbackcolor;
    protected String paypalPayflowcolor;
    protected String paypalEcSetRequestID;
    protected String paypalEcSetRequestToken;
    protected String promoCode0;
    protected String requestBillingAddress;
    protected String invoiceNumber;
    protected String paypalBillingType;
    protected String paypalBillingAgreementDesc;
    protected String paypalPaymentType;
    protected String paypalBillingAgreementCustom;
    protected String paypalLogoimg;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReturn() {
        return paypalReturn;
    }

    /**
     * Sets the value of the paypalReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReturn(String value) {
        this.paypalReturn = value;
    }

    /**
     * Gets the value of the paypalCancelReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCancelReturn() {
        return paypalCancelReturn;
    }

    /**
     * Sets the value of the paypalCancelReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCancelReturn(String value) {
        this.paypalCancelReturn = value;
    }

    /**
     * Gets the value of the paypalMaxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalMaxamt() {
        return paypalMaxamt;
    }

    /**
     * Sets the value of the paypalMaxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalMaxamt(String value) {
        this.paypalMaxamt = value;
    }

    /**
     * Gets the value of the paypalCustomerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCustomerEmail() {
        return paypalCustomerEmail;
    }

    /**
     * Sets the value of the paypalCustomerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCustomerEmail(String value) {
        this.paypalCustomerEmail = value;
    }

    /**
     * Gets the value of the paypalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDesc() {
        return paypalDesc;
    }

    /**
     * Sets the value of the paypalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDesc(String value) {
        this.paypalDesc = value;
    }

    /**
     * Gets the value of the paypalReqconfirmshipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReqconfirmshipping() {
        return paypalReqconfirmshipping;
    }

    /**
     * Sets the value of the paypalReqconfirmshipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReqconfirmshipping(String value) {
        this.paypalReqconfirmshipping = value;
    }

    /**
     * Gets the value of the paypalNoshipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNoshipping() {
        return paypalNoshipping;
    }

    /**
     * Sets the value of the paypalNoshipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNoshipping(String value) {
        this.paypalNoshipping = value;
    }

    /**
     * Gets the value of the paypalAddressOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAddressOverride() {
        return paypalAddressOverride;
    }

    /**
     * Sets the value of the paypalAddressOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAddressOverride(String value) {
        this.paypalAddressOverride = value;
    }

    /**
     * Gets the value of the paypalToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalToken() {
        return paypalToken;
    }

    /**
     * Sets the value of the paypalToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalToken(String value) {
        this.paypalToken = value;
    }

    /**
     * Gets the value of the paypalLc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalLc() {
        return paypalLc;
    }

    /**
     * Sets the value of the paypalLc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalLc(String value) {
        this.paypalLc = value;
    }

    /**
     * Gets the value of the paypalPagestyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPagestyle() {
        return paypalPagestyle;
    }

    /**
     * Sets the value of the paypalPagestyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPagestyle(String value) {
        this.paypalPagestyle = value;
    }

    /**
     * Gets the value of the paypalHdrimg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrimg() {
        return paypalHdrimg;
    }

    /**
     * Sets the value of the paypalHdrimg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrimg(String value) {
        this.paypalHdrimg = value;
    }

    /**
     * Gets the value of the paypalHdrbordercolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrbordercolor() {
        return paypalHdrbordercolor;
    }

    /**
     * Sets the value of the paypalHdrbordercolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrbordercolor(String value) {
        this.paypalHdrbordercolor = value;
    }

    /**
     * Gets the value of the paypalHdrbackcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrbackcolor() {
        return paypalHdrbackcolor;
    }

    /**
     * Sets the value of the paypalHdrbackcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrbackcolor(String value) {
        this.paypalHdrbackcolor = value;
    }

    /**
     * Gets the value of the paypalPayflowcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPayflowcolor() {
        return paypalPayflowcolor;
    }

    /**
     * Sets the value of the paypalPayflowcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPayflowcolor(String value) {
        this.paypalPayflowcolor = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }

    /**
     * Sets the value of the paypalEcSetRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestID(String value) {
        this.paypalEcSetRequestID = value;
    }

    /**
     * Gets the value of the paypalEcSetRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }

    /**
     * Sets the value of the paypalEcSetRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestToken(String value) {
        this.paypalEcSetRequestToken = value;
    }

    /**
     * Gets the value of the promoCode0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode0() {
        return promoCode0;
    }

    /**
     * Sets the value of the promoCode0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode0(String value) {
        this.promoCode0 = value;
    }

    /**
     * Gets the value of the requestBillingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBillingAddress() {
        return requestBillingAddress;
    }

    /**
     * Sets the value of the requestBillingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBillingAddress(String value) {
        this.requestBillingAddress = value;
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
     * Gets the value of the paypalBillingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingType() {
        return paypalBillingType;
    }

    /**
     * Sets the value of the paypalBillingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingType(String value) {
        this.paypalBillingType = value;
    }

    /**
     * Gets the value of the paypalBillingAgreementDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementDesc() {
        return paypalBillingAgreementDesc;
    }

    /**
     * Sets the value of the paypalBillingAgreementDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementDesc(String value) {
        this.paypalBillingAgreementDesc = value;
    }

    /**
     * Gets the value of the paypalPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentType() {
        return paypalPaymentType;
    }

    /**
     * Sets the value of the paypalPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentType(String value) {
        this.paypalPaymentType = value;
    }

    /**
     * Gets the value of the paypalBillingAgreementCustom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementCustom() {
        return paypalBillingAgreementCustom;
    }

    /**
     * Sets the value of the paypalBillingAgreementCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementCustom(String value) {
        this.paypalBillingAgreementCustom = value;
    }

    /**
     * Gets the value of the paypalLogoimg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalLogoimg() {
        return paypalLogoimg;
    }

    /**
     * Sets the value of the paypalLogoimg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalLogoimg(String value) {
        this.paypalLogoimg = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
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
