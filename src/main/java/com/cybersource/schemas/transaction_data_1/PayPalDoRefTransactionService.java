
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PayPalDoRefTransactionService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPalDoRefTransactionService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paypalBillingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalReqconfirmshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalReturnFmfDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalSoftDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalShippingdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcNotifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PayPalDoRefTransactionService", propOrder = {
    "paypalBillingAgreementId",
    "paypalPaymentType",
    "paypalReqconfirmshipping",
    "paypalReturnFmfDetails",
    "paypalSoftDescriptor",
    "paypalShippingdiscount",
    "paypalDesc",
    "invoiceNumber",
    "paypalEcNotifyUrl"
})
public class PayPalDoRefTransactionService {

    protected String paypalBillingAgreementId;
    protected String paypalPaymentType;
    protected String paypalReqconfirmshipping;
    protected String paypalReturnFmfDetails;
    protected String paypalSoftDescriptor;
    protected String paypalShippingdiscount;
    protected String paypalDesc;
    protected String invoiceNumber;
    protected String paypalEcNotifyUrl;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalBillingAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementId() {
        return paypalBillingAgreementId;
    }

    /**
     * Sets the value of the paypalBillingAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementId(String value) {
        this.paypalBillingAgreementId = value;
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
     * Gets the value of the paypalReturnFmfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReturnFmfDetails() {
        return paypalReturnFmfDetails;
    }

    /**
     * Sets the value of the paypalReturnFmfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReturnFmfDetails(String value) {
        this.paypalReturnFmfDetails = value;
    }

    /**
     * Gets the value of the paypalSoftDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalSoftDescriptor() {
        return paypalSoftDescriptor;
    }

    /**
     * Sets the value of the paypalSoftDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalSoftDescriptor(String value) {
        this.paypalSoftDescriptor = value;
    }

    /**
     * Gets the value of the paypalShippingdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalShippingdiscount() {
        return paypalShippingdiscount;
    }

    /**
     * Sets the value of the paypalShippingdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalShippingdiscount(String value) {
        this.paypalShippingdiscount = value;
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
     * Gets the value of the paypalEcNotifyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcNotifyUrl() {
        return paypalEcNotifyUrl;
    }

    /**
     * Sets the value of the paypalEcNotifyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcNotifyUrl(String value) {
        this.paypalEcNotifyUrl = value;
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
