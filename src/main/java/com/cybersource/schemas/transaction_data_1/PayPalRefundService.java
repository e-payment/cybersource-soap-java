
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PayPalRefundService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPalRefundService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paypalDoCaptureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalDoCaptureRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalCaptureId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PayPalRefundService", propOrder = {
    "paypalDoCaptureRequestID",
    "paypalDoCaptureRequestToken",
    "paypalCaptureId",
    "paypalNote"
})
public class PayPalRefundService {

    protected String paypalDoCaptureRequestID;
    protected String paypalDoCaptureRequestToken;
    protected String paypalCaptureId;
    protected String paypalNote;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the paypalDoCaptureRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoCaptureRequestID() {
        return paypalDoCaptureRequestID;
    }

    /**
     * Sets the value of the paypalDoCaptureRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoCaptureRequestID(String value) {
        this.paypalDoCaptureRequestID = value;
    }

    /**
     * Gets the value of the paypalDoCaptureRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoCaptureRequestToken() {
        return paypalDoCaptureRequestToken;
    }

    /**
     * Sets the value of the paypalDoCaptureRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoCaptureRequestToken(String value) {
        this.paypalDoCaptureRequestToken = value;
    }

    /**
     * Gets the value of the paypalCaptureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCaptureId() {
        return paypalCaptureId;
    }

    /**
     * Sets the value of the paypalCaptureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCaptureId(String value) {
        this.paypalCaptureId = value;
    }

    /**
     * Gets the value of the paypalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNote() {
        return paypalNote;
    }

    /**
     * Sets the value of the paypalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNote(String value) {
        this.paypalNote = value;
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
