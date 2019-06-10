
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for AFSReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFSReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="afsResult" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="hostSeverity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="consumerLocalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="afsFactorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotlistInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internetInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suspiciousInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="velocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipRoutingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipAnonymizerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreModelUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceFingerprint" type="{urn:schemas-cybersource-com:transaction-data-1.141}DeviceFingerprint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSReply", propOrder = {
    "reasonCode",
    "afsResult",
    "hostSeverity",
    "consumerLocalTime",
    "afsFactorCode",
    "addressInfoCode",
    "hotlistInfoCode",
    "internetInfoCode",
    "phoneInfoCode",
    "suspiciousInfoCode",
    "velocityInfoCode",
    "identityInfoCode",
    "ipCountry",
    "ipState",
    "ipCity",
    "ipRoutingMethod",
    "ipAnonymizerStatus",
    "scoreModelUsed",
    "cardBin",
    "binCountry",
    "cardAccountType",
    "cardScheme",
    "cardIssuer",
    "deviceFingerprint"
})
public class AFSReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected BigInteger afsResult;
    protected BigInteger hostSeverity;
    protected String consumerLocalTime;
    protected String afsFactorCode;
    protected String addressInfoCode;
    protected String hotlistInfoCode;
    protected String internetInfoCode;
    protected String phoneInfoCode;
    protected String suspiciousInfoCode;
    protected String velocityInfoCode;
    protected String identityInfoCode;
    protected String ipCountry;
    protected String ipState;
    protected String ipCity;
    protected String ipRoutingMethod;
    protected String ipAnonymizerStatus;
    protected String scoreModelUsed;
    protected String cardBin;
    protected String binCountry;
    protected String cardAccountType;
    protected String cardScheme;
    protected String cardIssuer;
    protected DeviceFingerprint deviceFingerprint;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the afsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfsResult() {
        return afsResult;
    }

    /**
     * Sets the value of the afsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfsResult(BigInteger value) {
        this.afsResult = value;
    }

    /**
     * Gets the value of the hostSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHostSeverity() {
        return hostSeverity;
    }

    /**
     * Sets the value of the hostSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHostSeverity(BigInteger value) {
        this.hostSeverity = value;
    }

    /**
     * Gets the value of the consumerLocalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLocalTime() {
        return consumerLocalTime;
    }

    /**
     * Sets the value of the consumerLocalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLocalTime(String value) {
        this.consumerLocalTime = value;
    }

    /**
     * Gets the value of the afsFactorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfsFactorCode() {
        return afsFactorCode;
    }

    /**
     * Sets the value of the afsFactorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfsFactorCode(String value) {
        this.afsFactorCode = value;
    }

    /**
     * Gets the value of the addressInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInfoCode() {
        return addressInfoCode;
    }

    /**
     * Sets the value of the addressInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInfoCode(String value) {
        this.addressInfoCode = value;
    }

    /**
     * Gets the value of the hotlistInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotlistInfoCode() {
        return hotlistInfoCode;
    }

    /**
     * Sets the value of the hotlistInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotlistInfoCode(String value) {
        this.hotlistInfoCode = value;
    }

    /**
     * Gets the value of the internetInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetInfoCode() {
        return internetInfoCode;
    }

    /**
     * Sets the value of the internetInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetInfoCode(String value) {
        this.internetInfoCode = value;
    }

    /**
     * Gets the value of the phoneInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneInfoCode() {
        return phoneInfoCode;
    }

    /**
     * Sets the value of the phoneInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneInfoCode(String value) {
        this.phoneInfoCode = value;
    }

    /**
     * Gets the value of the suspiciousInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspiciousInfoCode() {
        return suspiciousInfoCode;
    }

    /**
     * Sets the value of the suspiciousInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspiciousInfoCode(String value) {
        this.suspiciousInfoCode = value;
    }

    /**
     * Gets the value of the velocityInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityInfoCode() {
        return velocityInfoCode;
    }

    /**
     * Sets the value of the velocityInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityInfoCode(String value) {
        this.velocityInfoCode = value;
    }

    /**
     * Gets the value of the identityInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityInfoCode() {
        return identityInfoCode;
    }

    /**
     * Sets the value of the identityInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityInfoCode(String value) {
        this.identityInfoCode = value;
    }

    /**
     * Gets the value of the ipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCountry() {
        return ipCountry;
    }

    /**
     * Sets the value of the ipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCountry(String value) {
        this.ipCountry = value;
    }

    /**
     * Gets the value of the ipState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpState() {
        return ipState;
    }

    /**
     * Sets the value of the ipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpState(String value) {
        this.ipState = value;
    }

    /**
     * Gets the value of the ipCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCity() {
        return ipCity;
    }

    /**
     * Sets the value of the ipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCity(String value) {
        this.ipCity = value;
    }

    /**
     * Gets the value of the ipRoutingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRoutingMethod() {
        return ipRoutingMethod;
    }

    /**
     * Sets the value of the ipRoutingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRoutingMethod(String value) {
        this.ipRoutingMethod = value;
    }

    /**
     * Gets the value of the ipAnonymizerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAnonymizerStatus() {
        return ipAnonymizerStatus;
    }

    /**
     * Sets the value of the ipAnonymizerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAnonymizerStatus(String value) {
        this.ipAnonymizerStatus = value;
    }

    /**
     * Gets the value of the scoreModelUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreModelUsed() {
        return scoreModelUsed;
    }

    /**
     * Sets the value of the scoreModelUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreModelUsed(String value) {
        this.scoreModelUsed = value;
    }

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Gets the value of the binCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCountry() {
        return binCountry;
    }

    /**
     * Sets the value of the binCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCountry(String value) {
        this.binCountry = value;
    }

    /**
     * Gets the value of the cardAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountType() {
        return cardAccountType;
    }

    /**
     * Sets the value of the cardAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountType(String value) {
        this.cardAccountType = value;
    }

    /**
     * Gets the value of the cardScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Sets the value of the cardScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Gets the value of the cardIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuer() {
        return cardIssuer;
    }

    /**
     * Sets the value of the cardIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuer(String value) {
        this.cardIssuer = value;
    }

    /**
     * Gets the value of the deviceFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFingerprint }
     *     
     */
    public DeviceFingerprint getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Sets the value of the deviceFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFingerprint }
     *     
     */
    public void setDeviceFingerprint(DeviceFingerprint value) {
        this.deviceFingerprint = value;
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
