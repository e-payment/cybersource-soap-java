
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DeviceFingerprint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceFingerprint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cookiesEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="flashEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagesEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="javascriptEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="proxyIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proxyIPAddressActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proxyIPAddressAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proxyServerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddressActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddressAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trueIPAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smartIDConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="browserLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="profileDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="profiledURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeOnPage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deviceMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstEncounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flashOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flashVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gpsAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jbRoot" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="jbRootReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceFingerprint", propOrder = {
    "cookiesEnabled",
    "flashEnabled",
    "hash",
    "imagesEnabled",
    "javascriptEnabled",
    "proxyIPAddress",
    "proxyIPAddressActivities",
    "proxyIPAddressAttributes",
    "proxyServerType",
    "trueIPAddress",
    "trueIPAddressActivities",
    "trueIPAddressAttributes",
    "trueIPAddressCity",
    "trueIPAddressState",
    "trueIPAddressCountry",
    "smartID",
    "smartIDConfidenceLevel",
    "screenResolution",
    "browserLanguage",
    "agentType",
    "dateTime",
    "profileDuration",
    "profiledURL",
    "timeOnPage",
    "deviceMatch",
    "firstEncounter",
    "flashOS",
    "flashVersion",
    "deviceLatitude",
    "deviceLongitude",
    "gpsAccuracy",
    "jbRoot",
    "jbRootReason"
})
public class DeviceFingerprint {

    protected String cookiesEnabled;
    protected String flashEnabled;
    protected String hash;
    protected String imagesEnabled;
    protected String javascriptEnabled;
    protected String proxyIPAddress;
    protected String proxyIPAddressActivities;
    protected String proxyIPAddressAttributes;
    protected String proxyServerType;
    protected String trueIPAddress;
    protected String trueIPAddressActivities;
    protected String trueIPAddressAttributes;
    protected String trueIPAddressCity;
    protected String trueIPAddressState;
    protected String trueIPAddressCountry;
    protected String smartID;
    protected String smartIDConfidenceLevel;
    protected String screenResolution;
    protected String browserLanguage;
    protected String agentType;
    protected String dateTime;
    protected BigInteger profileDuration;
    protected String profiledURL;
    protected BigInteger timeOnPage;
    protected String deviceMatch;
    protected String firstEncounter;
    protected String flashOS;
    protected String flashVersion;
    protected String deviceLatitude;
    protected String deviceLongitude;
    protected String gpsAccuracy;
    protected BigInteger jbRoot;
    protected String jbRootReason;

    /**
     * Gets the value of the cookiesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookiesEnabled() {
        return cookiesEnabled;
    }

    /**
     * Sets the value of the cookiesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookiesEnabled(String value) {
        this.cookiesEnabled = value;
    }

    /**
     * Gets the value of the flashEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashEnabled() {
        return flashEnabled;
    }

    /**
     * Sets the value of the flashEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashEnabled(String value) {
        this.flashEnabled = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Gets the value of the imagesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagesEnabled() {
        return imagesEnabled;
    }

    /**
     * Sets the value of the imagesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagesEnabled(String value) {
        this.imagesEnabled = value;
    }

    /**
     * Gets the value of the javascriptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascriptEnabled() {
        return javascriptEnabled;
    }

    /**
     * Sets the value of the javascriptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascriptEnabled(String value) {
        this.javascriptEnabled = value;
    }

    /**
     * Gets the value of the proxyIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddress() {
        return proxyIPAddress;
    }

    /**
     * Sets the value of the proxyIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddress(String value) {
        this.proxyIPAddress = value;
    }

    /**
     * Gets the value of the proxyIPAddressActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddressActivities() {
        return proxyIPAddressActivities;
    }

    /**
     * Sets the value of the proxyIPAddressActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddressActivities(String value) {
        this.proxyIPAddressActivities = value;
    }

    /**
     * Gets the value of the proxyIPAddressAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddressAttributes() {
        return proxyIPAddressAttributes;
    }

    /**
     * Sets the value of the proxyIPAddressAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddressAttributes(String value) {
        this.proxyIPAddressAttributes = value;
    }

    /**
     * Gets the value of the proxyServerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyServerType() {
        return proxyServerType;
    }

    /**
     * Sets the value of the proxyServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyServerType(String value) {
        this.proxyServerType = value;
    }

    /**
     * Gets the value of the trueIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddress() {
        return trueIPAddress;
    }

    /**
     * Sets the value of the trueIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddress(String value) {
        this.trueIPAddress = value;
    }

    /**
     * Gets the value of the trueIPAddressActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressActivities() {
        return trueIPAddressActivities;
    }

    /**
     * Sets the value of the trueIPAddressActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressActivities(String value) {
        this.trueIPAddressActivities = value;
    }

    /**
     * Gets the value of the trueIPAddressAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressAttributes() {
        return trueIPAddressAttributes;
    }

    /**
     * Sets the value of the trueIPAddressAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressAttributes(String value) {
        this.trueIPAddressAttributes = value;
    }

    /**
     * Gets the value of the trueIPAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressCity() {
        return trueIPAddressCity;
    }

    /**
     * Sets the value of the trueIPAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressCity(String value) {
        this.trueIPAddressCity = value;
    }

    /**
     * Gets the value of the trueIPAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressState() {
        return trueIPAddressState;
    }

    /**
     * Sets the value of the trueIPAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressState(String value) {
        this.trueIPAddressState = value;
    }

    /**
     * Gets the value of the trueIPAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressCountry() {
        return trueIPAddressCountry;
    }

    /**
     * Sets the value of the trueIPAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressCountry(String value) {
        this.trueIPAddressCountry = value;
    }

    /**
     * Gets the value of the smartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartID() {
        return smartID;
    }

    /**
     * Sets the value of the smartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartID(String value) {
        this.smartID = value;
    }

    /**
     * Gets the value of the smartIDConfidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartIDConfidenceLevel() {
        return smartIDConfidenceLevel;
    }

    /**
     * Sets the value of the smartIDConfidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartIDConfidenceLevel(String value) {
        this.smartIDConfidenceLevel = value;
    }

    /**
     * Gets the value of the screenResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * Sets the value of the screenResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenResolution(String value) {
        this.screenResolution = value;
    }

    /**
     * Gets the value of the browserLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserLanguage() {
        return browserLanguage;
    }

    /**
     * Sets the value of the browserLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserLanguage(String value) {
        this.browserLanguage = value;
    }

    /**
     * Gets the value of the agentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentType() {
        return agentType;
    }

    /**
     * Sets the value of the agentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentType(String value) {
        this.agentType = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the profileDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfileDuration() {
        return profileDuration;
    }

    /**
     * Sets the value of the profileDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfileDuration(BigInteger value) {
        this.profileDuration = value;
    }

    /**
     * Gets the value of the profiledURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfiledURL() {
        return profiledURL;
    }

    /**
     * Sets the value of the profiledURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfiledURL(String value) {
        this.profiledURL = value;
    }

    /**
     * Gets the value of the timeOnPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOnPage() {
        return timeOnPage;
    }

    /**
     * Sets the value of the timeOnPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOnPage(BigInteger value) {
        this.timeOnPage = value;
    }

    /**
     * Gets the value of the deviceMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMatch() {
        return deviceMatch;
    }

    /**
     * Sets the value of the deviceMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMatch(String value) {
        this.deviceMatch = value;
    }

    /**
     * Gets the value of the firstEncounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstEncounter() {
        return firstEncounter;
    }

    /**
     * Sets the value of the firstEncounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEncounter(String value) {
        this.firstEncounter = value;
    }

    /**
     * Gets the value of the flashOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashOS() {
        return flashOS;
    }

    /**
     * Sets the value of the flashOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashOS(String value) {
        this.flashOS = value;
    }

    /**
     * Gets the value of the flashVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashVersion() {
        return flashVersion;
    }

    /**
     * Sets the value of the flashVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashVersion(String value) {
        this.flashVersion = value;
    }

    /**
     * Gets the value of the deviceLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLatitude() {
        return deviceLatitude;
    }

    /**
     * Sets the value of the deviceLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLatitude(String value) {
        this.deviceLatitude = value;
    }

    /**
     * Gets the value of the deviceLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLongitude() {
        return deviceLongitude;
    }

    /**
     * Sets the value of the deviceLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLongitude(String value) {
        this.deviceLongitude = value;
    }

    /**
     * Gets the value of the gpsAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    /**
     * Sets the value of the gpsAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsAccuracy(String value) {
        this.gpsAccuracy = value;
    }

    /**
     * Gets the value of the jbRoot property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJbRoot() {
        return jbRoot;
    }

    /**
     * Sets the value of the jbRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJbRoot(BigInteger value) {
        this.jbRoot = value;
    }

    /**
     * Gets the value of the jbRootReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJbRootReason() {
        return jbRootReason;
    }

    /**
     * Sets the value of the jbRootReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJbRootReason(String value) {
        this.jbRootReason = value;
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
