
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for LodgingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LodgingData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkInDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dailyRoomRate1" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="dailyRoomRate2" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="dailyRoomRate3" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="roomNights1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="roomNights2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="roomNights3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="guestSmokingPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRoomsBooked" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfGuests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="roomBedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTaxElements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporateClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalCoupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="prepaidCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="foodAndBeverageCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="roomTax" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="phoneCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="restaurantCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="roomServiceCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="miniBarCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="laundryCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="miscellaneousCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="giftShopCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="movieCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="healthClubCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="valetParkingCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="cashDisbursementCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="nonRoomCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="businessCenterCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="loungeBarCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="transportationCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="gratuityCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="conferenceRoomCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="audioVisualCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="banquetCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="internetAccessCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="earlyCheckOutCost" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="nonRoomTax" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="travelAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingData", propOrder = {
    "checkInDate",
    "checkOutDate",
    "dailyRoomRate1",
    "dailyRoomRate2",
    "dailyRoomRate3",
    "roomNights1",
    "roomNights2",
    "roomNights3",
    "guestSmokingPreference",
    "numberOfRoomsBooked",
    "numberOfGuests",
    "roomBedType",
    "roomTaxElements",
    "roomRateType",
    "guestName",
    "customerServicePhoneNumber",
    "corporateClientCode",
    "promotionalCode",
    "additionalCoupon",
    "roomLocation",
    "specialProgramCode",
    "tax",
    "prepaidCost",
    "foodAndBeverageCost",
    "roomTax",
    "adjustmentAmount",
    "phoneCost",
    "restaurantCost",
    "roomServiceCost",
    "miniBarCost",
    "laundryCost",
    "miscellaneousCost",
    "giftShopCost",
    "movieCost",
    "healthClubCost",
    "valetParkingCost",
    "cashDisbursementCost",
    "nonRoomCost",
    "businessCenterCost",
    "loungeBarCost",
    "transportationCost",
    "gratuityCost",
    "conferenceRoomCost",
    "audioVisualCost",
    "banquetCost",
    "internetAccessCost",
    "earlyCheckOutCost",
    "nonRoomTax",
    "travelAgencyCode",
    "travelAgencyName"
})
public class LodgingData {

    protected String checkInDate;
    protected String checkOutDate;
    protected String dailyRoomRate1;
    protected String dailyRoomRate2;
    protected String dailyRoomRate3;
    protected BigInteger roomNights1;
    protected BigInteger roomNights2;
    protected BigInteger roomNights3;
    protected String guestSmokingPreference;
    protected BigInteger numberOfRoomsBooked;
    protected BigInteger numberOfGuests;
    protected String roomBedType;
    protected String roomTaxElements;
    protected String roomRateType;
    protected String guestName;
    protected String customerServicePhoneNumber;
    protected String corporateClientCode;
    protected String promotionalCode;
    protected String additionalCoupon;
    protected String roomLocation;
    protected String specialProgramCode;
    protected String tax;
    protected String prepaidCost;
    protected String foodAndBeverageCost;
    protected String roomTax;
    protected String adjustmentAmount;
    protected String phoneCost;
    protected String restaurantCost;
    protected String roomServiceCost;
    protected String miniBarCost;
    protected String laundryCost;
    protected String miscellaneousCost;
    protected String giftShopCost;
    protected String movieCost;
    protected String healthClubCost;
    protected String valetParkingCost;
    protected String cashDisbursementCost;
    protected String nonRoomCost;
    protected String businessCenterCost;
    protected String loungeBarCost;
    protected String transportationCost;
    protected String gratuityCost;
    protected String conferenceRoomCost;
    protected String audioVisualCost;
    protected String banquetCost;
    protected String internetAccessCost;
    protected String earlyCheckOutCost;
    protected String nonRoomTax;
    protected String travelAgencyCode;
    protected String travelAgencyName;

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(String value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(String value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the dailyRoomRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate1() {
        return dailyRoomRate1;
    }

    /**
     * Sets the value of the dailyRoomRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate1(String value) {
        this.dailyRoomRate1 = value;
    }

    /**
     * Gets the value of the dailyRoomRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate2() {
        return dailyRoomRate2;
    }

    /**
     * Sets the value of the dailyRoomRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate2(String value) {
        this.dailyRoomRate2 = value;
    }

    /**
     * Gets the value of the dailyRoomRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate3() {
        return dailyRoomRate3;
    }

    /**
     * Sets the value of the dailyRoomRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate3(String value) {
        this.dailyRoomRate3 = value;
    }

    /**
     * Gets the value of the roomNights1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights1() {
        return roomNights1;
    }

    /**
     * Sets the value of the roomNights1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights1(BigInteger value) {
        this.roomNights1 = value;
    }

    /**
     * Gets the value of the roomNights2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights2() {
        return roomNights2;
    }

    /**
     * Sets the value of the roomNights2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights2(BigInteger value) {
        this.roomNights2 = value;
    }

    /**
     * Gets the value of the roomNights3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights3() {
        return roomNights3;
    }

    /**
     * Sets the value of the roomNights3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights3(BigInteger value) {
        this.roomNights3 = value;
    }

    /**
     * Gets the value of the guestSmokingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSmokingPreference() {
        return guestSmokingPreference;
    }

    /**
     * Sets the value of the guestSmokingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSmokingPreference(String value) {
        this.guestSmokingPreference = value;
    }

    /**
     * Gets the value of the numberOfRoomsBooked property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    /**
     * Sets the value of the numberOfRoomsBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRoomsBooked(BigInteger value) {
        this.numberOfRoomsBooked = value;
    }

    /**
     * Gets the value of the numberOfGuests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * Sets the value of the numberOfGuests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGuests(BigInteger value) {
        this.numberOfGuests = value;
    }

    /**
     * Gets the value of the roomBedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomBedType() {
        return roomBedType;
    }

    /**
     * Sets the value of the roomBedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomBedType(String value) {
        this.roomBedType = value;
    }

    /**
     * Gets the value of the roomTaxElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTaxElements() {
        return roomTaxElements;
    }

    /**
     * Sets the value of the roomTaxElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTaxElements(String value) {
        this.roomTaxElements = value;
    }

    /**
     * Gets the value of the roomRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomRateType() {
        return roomRateType;
    }

    /**
     * Sets the value of the roomRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomRateType(String value) {
        this.roomRateType = value;
    }

    /**
     * Gets the value of the guestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Sets the value of the guestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
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
     * Gets the value of the corporateClientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateClientCode() {
        return corporateClientCode;
    }

    /**
     * Sets the value of the corporateClientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateClientCode(String value) {
        this.corporateClientCode = value;
    }

    /**
     * Gets the value of the promotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Sets the value of the promotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the additionalCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCoupon() {
        return additionalCoupon;
    }

    /**
     * Sets the value of the additionalCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCoupon(String value) {
        this.additionalCoupon = value;
    }

    /**
     * Gets the value of the roomLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLocation() {
        return roomLocation;
    }

    /**
     * Sets the value of the roomLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLocation(String value) {
        this.roomLocation = value;
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
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the prepaidCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidCost() {
        return prepaidCost;
    }

    /**
     * Sets the value of the prepaidCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidCost(String value) {
        this.prepaidCost = value;
    }

    /**
     * Gets the value of the foodAndBeverageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodAndBeverageCost() {
        return foodAndBeverageCost;
    }

    /**
     * Sets the value of the foodAndBeverageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodAndBeverageCost(String value) {
        this.foodAndBeverageCost = value;
    }

    /**
     * Gets the value of the roomTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTax() {
        return roomTax;
    }

    /**
     * Sets the value of the roomTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTax(String value) {
        this.roomTax = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentAmount(String value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the phoneCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCost() {
        return phoneCost;
    }

    /**
     * Sets the value of the phoneCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCost(String value) {
        this.phoneCost = value;
    }

    /**
     * Gets the value of the restaurantCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantCost() {
        return restaurantCost;
    }

    /**
     * Sets the value of the restaurantCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantCost(String value) {
        this.restaurantCost = value;
    }

    /**
     * Gets the value of the roomServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomServiceCost() {
        return roomServiceCost;
    }

    /**
     * Sets the value of the roomServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomServiceCost(String value) {
        this.roomServiceCost = value;
    }

    /**
     * Gets the value of the miniBarCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniBarCost() {
        return miniBarCost;
    }

    /**
     * Sets the value of the miniBarCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniBarCost(String value) {
        this.miniBarCost = value;
    }

    /**
     * Gets the value of the laundryCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaundryCost() {
        return laundryCost;
    }

    /**
     * Sets the value of the laundryCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaundryCost(String value) {
        this.laundryCost = value;
    }

    /**
     * Gets the value of the miscellaneousCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneousCost() {
        return miscellaneousCost;
    }

    /**
     * Sets the value of the miscellaneousCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneousCost(String value) {
        this.miscellaneousCost = value;
    }

    /**
     * Gets the value of the giftShopCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftShopCost() {
        return giftShopCost;
    }

    /**
     * Sets the value of the giftShopCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftShopCost(String value) {
        this.giftShopCost = value;
    }

    /**
     * Gets the value of the movieCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieCost() {
        return movieCost;
    }

    /**
     * Sets the value of the movieCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieCost(String value) {
        this.movieCost = value;
    }

    /**
     * Gets the value of the healthClubCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthClubCost() {
        return healthClubCost;
    }

    /**
     * Sets the value of the healthClubCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthClubCost(String value) {
        this.healthClubCost = value;
    }

    /**
     * Gets the value of the valetParkingCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValetParkingCost() {
        return valetParkingCost;
    }

    /**
     * Sets the value of the valetParkingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValetParkingCost(String value) {
        this.valetParkingCost = value;
    }

    /**
     * Gets the value of the cashDisbursementCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDisbursementCost() {
        return cashDisbursementCost;
    }

    /**
     * Sets the value of the cashDisbursementCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDisbursementCost(String value) {
        this.cashDisbursementCost = value;
    }

    /**
     * Gets the value of the nonRoomCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRoomCost() {
        return nonRoomCost;
    }

    /**
     * Sets the value of the nonRoomCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRoomCost(String value) {
        this.nonRoomCost = value;
    }

    /**
     * Gets the value of the businessCenterCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCenterCost() {
        return businessCenterCost;
    }

    /**
     * Sets the value of the businessCenterCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCenterCost(String value) {
        this.businessCenterCost = value;
    }

    /**
     * Gets the value of the loungeBarCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoungeBarCost() {
        return loungeBarCost;
    }

    /**
     * Sets the value of the loungeBarCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoungeBarCost(String value) {
        this.loungeBarCost = value;
    }

    /**
     * Gets the value of the transportationCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCost() {
        return transportationCost;
    }

    /**
     * Sets the value of the transportationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCost(String value) {
        this.transportationCost = value;
    }

    /**
     * Gets the value of the gratuityCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGratuityCost() {
        return gratuityCost;
    }

    /**
     * Sets the value of the gratuityCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGratuityCost(String value) {
        this.gratuityCost = value;
    }

    /**
     * Gets the value of the conferenceRoomCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceRoomCost() {
        return conferenceRoomCost;
    }

    /**
     * Sets the value of the conferenceRoomCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceRoomCost(String value) {
        this.conferenceRoomCost = value;
    }

    /**
     * Gets the value of the audioVisualCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioVisualCost() {
        return audioVisualCost;
    }

    /**
     * Sets the value of the audioVisualCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualCost(String value) {
        this.audioVisualCost = value;
    }

    /**
     * Gets the value of the banquetCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanquetCost() {
        return banquetCost;
    }

    /**
     * Sets the value of the banquetCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanquetCost(String value) {
        this.banquetCost = value;
    }

    /**
     * Gets the value of the internetAccessCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAccessCost() {
        return internetAccessCost;
    }

    /**
     * Sets the value of the internetAccessCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAccessCost(String value) {
        this.internetAccessCost = value;
    }

    /**
     * Gets the value of the earlyCheckOutCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyCheckOutCost() {
        return earlyCheckOutCost;
    }

    /**
     * Sets the value of the earlyCheckOutCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyCheckOutCost(String value) {
        this.earlyCheckOutCost = value;
    }

    /**
     * Gets the value of the nonRoomTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRoomTax() {
        return nonRoomTax;
    }

    /**
     * Sets the value of the nonRoomTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRoomTax(String value) {
        this.nonRoomTax = value;
    }

    /**
     * Gets the value of the travelAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyCode() {
        return travelAgencyCode;
    }

    /**
     * Sets the value of the travelAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyCode(String value) {
        this.travelAgencyCode = value;
    }

    /**
     * Gets the value of the travelAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    /**
     * Sets the value of the travelAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyName(String value) {
        this.travelAgencyName = value;
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
