
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PayPalAuthReversalService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPalAuthReversalService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paypalAuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcDoPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcDoPaymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalAuthorizationRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalAuthorizationRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcOrderSetupRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalEcOrderSetupRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PayPalAuthReversalService", propOrder = {
    "paypalAuthorizationId",
    "paypalEcDoPaymentRequestID",
    "paypalEcDoPaymentRequestToken",
    "paypalAuthorizationRequestID",
    "paypalAuthorizationRequestToken",
    "paypalEcOrderSetupRequestID",
    "paypalEcOrderSetupRequestToken"
})
public class PayPalAuthReversalService {

    protected String paypalAuthorizationId;
    protected String paypalEcDoPaymentRequestID;
    protected String paypalEcDoPaymentRequestToken;
    protected String paypalAuthorizationRequestID;
    protected String paypalAuthorizationRequestToken;
    protected String paypalEcOrderSetupRequestID;
    protected String paypalEcOrderSetupRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalAuthorizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationId() {
        return paypalAuthorizationId;
    }

    /**
     * Sets the value of the paypalAuthorizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationId(String value) {
        this.paypalAuthorizationId = value;
    }

    /**
     * Gets the value of the paypalEcDoPaymentRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestID() {
        return paypalEcDoPaymentRequestID;
    }

    /**
     * Sets the value of the paypalEcDoPaymentRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestID(String value) {
        this.paypalEcDoPaymentRequestID = value;
    }

    /**
     * Gets the value of the paypalEcDoPaymentRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestToken() {
        return paypalEcDoPaymentRequestToken;
    }

    /**
     * Sets the value of the paypalEcDoPaymentRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestToken(String value) {
        this.paypalEcDoPaymentRequestToken = value;
    }

    /**
     * Gets the value of the paypalAuthorizationRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestID() {
        return paypalAuthorizationRequestID;
    }

    /**
     * Sets the value of the paypalAuthorizationRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestID(String value) {
        this.paypalAuthorizationRequestID = value;
    }

    /**
     * Gets the value of the paypalAuthorizationRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestToken() {
        return paypalAuthorizationRequestToken;
    }

    /**
     * Sets the value of the paypalAuthorizationRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestToken(String value) {
        this.paypalAuthorizationRequestToken = value;
    }

    /**
     * Gets the value of the paypalEcOrderSetupRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestID() {
        return paypalEcOrderSetupRequestID;
    }

    /**
     * Sets the value of the paypalEcOrderSetupRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestID(String value) {
        this.paypalEcOrderSetupRequestID = value;
    }

    /**
     * Gets the value of the paypalEcOrderSetupRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestToken() {
        return paypalEcOrderSetupRequestToken;
    }

    /**
     * Sets the value of the paypalEcOrderSetupRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestToken(String value) {
        this.paypalEcOrderSetupRequestToken = value;
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
