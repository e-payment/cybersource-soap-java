
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for AutoRentalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoRentalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dailyRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="mileageCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="gasCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="insuranceCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="lateReturnCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="maximumFreeMiles" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="milesTraveled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="oneWayCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="parkingViolationCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="pickUpCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickUpCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickUpState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ratePerMile" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="renterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="specialProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoRentalData", propOrder = {
    "adjustmentCost",
    "adjustmentCode",
    "agreementNumber",
    "classCode",
    "customerServicePhoneNumber",
    "dailyRate",
    "mileageCost",
    "gasCost",
    "insuranceCost",
    "lateReturnCost",
    "maximumFreeMiles",
    "milesTraveled",
    "oneWayCost",
    "parkingViolationCost",
    "pickUpCity",
    "pickUpCountry",
    "pickUpDate",
    "pickUpState",
    "pickUpTime",
    "ratePerMile",
    "renterName",
    "returnCity",
    "returnCountry",
    "returnDate",
    "returnLocationID",
    "returnState",
    "returnTime",
    "specialProgramCode"
})
public class AutoRentalData {

    protected String adjustmentCost;
    protected String adjustmentCode;
    protected String agreementNumber;
    protected String classCode;
    protected String customerServicePhoneNumber;
    protected String dailyRate;
    protected String mileageCost;
    protected String gasCost;
    protected String insuranceCost;
    protected String lateReturnCost;
    protected BigInteger maximumFreeMiles;
    protected BigInteger milesTraveled;
    protected String oneWayCost;
    protected String parkingViolationCost;
    protected String pickUpCity;
    protected String pickUpCountry;
    protected String pickUpDate;
    protected String pickUpState;
    protected BigInteger pickUpTime;
    protected String ratePerMile;
    protected String renterName;
    protected String returnCity;
    protected String returnCountry;
    protected String returnDate;
    protected String returnLocationID;
    protected String returnState;
    protected BigInteger returnTime;
    protected String specialProgramCode;

    /**
     * Gets the value of the adjustmentCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCost() {
        return adjustmentCost;
    }

    /**
     * Sets the value of the adjustmentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCost(String value) {
        this.adjustmentCost = value;
    }

    /**
     * Gets the value of the adjustmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCode() {
        return adjustmentCode;
    }

    /**
     * Sets the value of the adjustmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCode(String value) {
        this.adjustmentCode = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the customerServicePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * Sets the value of the customerServicePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

    /**
     * Gets the value of the dailyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRate() {
        return dailyRate;
    }

    /**
     * Sets the value of the dailyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRate(String value) {
        this.dailyRate = value;
    }

    /**
     * Gets the value of the mileageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileageCost() {
        return mileageCost;
    }

    /**
     * Sets the value of the mileageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileageCost(String value) {
        this.mileageCost = value;
    }

    /**
     * Gets the value of the gasCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasCost() {
        return gasCost;
    }

    /**
     * Sets the value of the gasCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasCost(String value) {
        this.gasCost = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCost(String value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the lateReturnCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateReturnCost() {
        return lateReturnCost;
    }

    /**
     * Sets the value of the lateReturnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateReturnCost(String value) {
        this.lateReturnCost = value;
    }

    /**
     * Gets the value of the maximumFreeMiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumFreeMiles() {
        return maximumFreeMiles;
    }

    /**
     * Sets the value of the maximumFreeMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumFreeMiles(BigInteger value) {
        this.maximumFreeMiles = value;
    }

    /**
     * Gets the value of the milesTraveled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMilesTraveled() {
        return milesTraveled;
    }

    /**
     * Sets the value of the milesTraveled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMilesTraveled(BigInteger value) {
        this.milesTraveled = value;
    }

    /**
     * Gets the value of the oneWayCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayCost() {
        return oneWayCost;
    }

    /**
     * Sets the value of the oneWayCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayCost(String value) {
        this.oneWayCost = value;
    }

    /**
     * Gets the value of the parkingViolationCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingViolationCost() {
        return parkingViolationCost;
    }

    /**
     * Sets the value of the parkingViolationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingViolationCost(String value) {
        this.parkingViolationCost = value;
    }

    /**
     * Gets the value of the pickUpCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCity() {
        return pickUpCity;
    }

    /**
     * Sets the value of the pickUpCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCity(String value) {
        this.pickUpCity = value;
    }

    /**
     * Gets the value of the pickUpCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCountry() {
        return pickUpCountry;
    }

    /**
     * Sets the value of the pickUpCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCountry(String value) {
        this.pickUpCountry = value;
    }

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDate(String value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the pickUpState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpState() {
        return pickUpState;
    }

    /**
     * Sets the value of the pickUpState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpState(String value) {
        this.pickUpState = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickUpTime(BigInteger value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the ratePerMile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerMile() {
        return ratePerMile;
    }

    /**
     * Sets the value of the ratePerMile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerMile(String value) {
        this.ratePerMile = value;
    }

    /**
     * Gets the value of the renterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenterName() {
        return renterName;
    }

    /**
     * Sets the value of the renterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenterName(String value) {
        this.renterName = value;
    }

    /**
     * Gets the value of the returnCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Sets the value of the returnCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Gets the value of the returnCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCountry() {
        return returnCountry;
    }

    /**
     * Sets the value of the returnCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCountry(String value) {
        this.returnCountry = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the returnLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocationID() {
        return returnLocationID;
    }

    /**
     * Sets the value of the returnLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocationID(String value) {
        this.returnLocationID = value;
    }

    /**
     * Gets the value of the returnState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Sets the value of the returnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnTime(BigInteger value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the specialProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialProgramCode() {
        return specialProgramCode;
    }

    /**
     * Sets the value of the specialProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialProgramCode(String value) {
        this.specialProgramCode = value;
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
