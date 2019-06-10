
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerBillingAddressChange" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerEmailChange" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerHasCheckingAccount" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerHasSavingsAccount" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerPasswordChange" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerPhoneChange" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grossHouseholdIncome" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="householdIncomeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantPromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preapprovalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDeliveryTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearsAtCurrentResidence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="yearsWithCurrentEmployer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="employerStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipToPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billToPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerAuthenticatedByMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backOfficeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipToEqualsBillToNameIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipToEqualsBillToAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessMainPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisorFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessDAndBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessYearsInBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessNumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgAnnualIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgIncomeCurrencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgResidenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgCheckingAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgSavingsAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgYearsAtEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgYearsAtResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomeAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomeAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pgTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BML", propOrder = {
    "customerBillingAddressChange",
    "customerEmailChange",
    "customerHasCheckingAccount",
    "customerHasSavingsAccount",
    "customerPasswordChange",
    "customerPhoneChange",
    "customerRegistrationDate",
    "customerTypeFlag",
    "grossHouseholdIncome",
    "householdIncomeCurrency",
    "itemCategory",
    "merchantPromotionCode",
    "preapprovalNumber",
    "productDeliveryTypeIndicator",
    "residenceStatus",
    "tcVersion",
    "yearsAtCurrentResidence",
    "yearsWithCurrentEmployer",
    "employerStreet1",
    "employerStreet2",
    "employerCity",
    "employerCompanyName",
    "employerCountry",
    "employerPhoneNumber",
    "employerPhoneType",
    "employerState",
    "employerPostalCode",
    "shipToPhoneType",
    "billToPhoneType",
    "methodOfPayment",
    "productType",
    "customerAuthenticatedByMerchant",
    "backOfficeIndicator",
    "shipToEqualsBillToNameIndicator",
    "shipToEqualsBillToAddressIndicator",
    "alternateIPAddress",
    "businessLegalName",
    "dbaName",
    "businessAddress1",
    "businessAddress2",
    "businessCity",
    "businessState",
    "businessPostalCode",
    "businessCountry",
    "businessMainPhone",
    "userID",
    "pin",
    "adminLastName",
    "adminFirstName",
    "adminPhone",
    "adminFax",
    "adminEmailAddress",
    "adminTitle",
    "supervisorLastName",
    "supervisorFirstName",
    "supervisorEmailAddress",
    "businessDAndBNumber",
    "businessTaxID",
    "businessNAICSCode",
    "businessType",
    "businessYearsInBusiness",
    "businessNumberOfEmployees",
    "businessPONumber",
    "businessLoanType",
    "businessApplicationID",
    "businessProductCode",
    "pgLastName",
    "pgFirstName",
    "pgSSN",
    "pgDateOfBirth",
    "pgAnnualIncome",
    "pgIncomeCurrencyType",
    "pgResidenceStatus",
    "pgCheckingAccountIndicator",
    "pgSavingsAccountIndicator",
    "pgYearsAtEmployer",
    "pgYearsAtResidence",
    "pgHomeAddress1",
    "pgHomeAddress2",
    "pgHomeCity",
    "pgHomeState",
    "pgHomePostalCode",
    "pgHomeCountry",
    "pgEmailAddress",
    "pgHomePhone",
    "pgTitle"
})
public class BML {

    protected String customerBillingAddressChange;
    protected String customerEmailChange;
    protected String customerHasCheckingAccount;
    protected String customerHasSavingsAccount;
    protected String customerPasswordChange;
    protected String customerPhoneChange;
    protected String customerRegistrationDate;
    protected String customerTypeFlag;
    protected String grossHouseholdIncome;
    protected String householdIncomeCurrency;
    protected String itemCategory;
    protected String merchantPromotionCode;
    protected String preapprovalNumber;
    protected String productDeliveryTypeIndicator;
    protected String residenceStatus;
    protected String tcVersion;
    protected BigInteger yearsAtCurrentResidence;
    protected BigInteger yearsWithCurrentEmployer;
    protected String employerStreet1;
    protected String employerStreet2;
    protected String employerCity;
    protected String employerCompanyName;
    protected String employerCountry;
    protected String employerPhoneNumber;
    protected String employerPhoneType;
    protected String employerState;
    protected String employerPostalCode;
    protected String shipToPhoneType;
    protected String billToPhoneType;
    protected String methodOfPayment;
    protected String productType;
    protected String customerAuthenticatedByMerchant;
    protected String backOfficeIndicator;
    protected String shipToEqualsBillToNameIndicator;
    protected String shipToEqualsBillToAddressIndicator;
    protected String alternateIPAddress;
    protected String businessLegalName;
    protected String dbaName;
    protected String businessAddress1;
    protected String businessAddress2;
    protected String businessCity;
    protected String businessState;
    protected String businessPostalCode;
    protected String businessCountry;
    protected String businessMainPhone;
    protected String userID;
    protected String pin;
    protected String adminLastName;
    protected String adminFirstName;
    protected String adminPhone;
    protected String adminFax;
    protected String adminEmailAddress;
    protected String adminTitle;
    protected String supervisorLastName;
    protected String supervisorFirstName;
    protected String supervisorEmailAddress;
    protected String businessDAndBNumber;
    protected String businessTaxID;
    protected String businessNAICSCode;
    protected String businessType;
    protected String businessYearsInBusiness;
    protected String businessNumberOfEmployees;
    protected String businessPONumber;
    protected String businessLoanType;
    protected String businessApplicationID;
    protected String businessProductCode;
    protected String pgLastName;
    protected String pgFirstName;
    protected String pgSSN;
    protected String pgDateOfBirth;
    protected String pgAnnualIncome;
    protected String pgIncomeCurrencyType;
    protected String pgResidenceStatus;
    protected String pgCheckingAccountIndicator;
    protected String pgSavingsAccountIndicator;
    protected String pgYearsAtEmployer;
    protected String pgYearsAtResidence;
    protected String pgHomeAddress1;
    protected String pgHomeAddress2;
    protected String pgHomeCity;
    protected String pgHomeState;
    protected String pgHomePostalCode;
    protected String pgHomeCountry;
    protected String pgEmailAddress;
    protected String pgHomePhone;
    protected String pgTitle;

    /**
     * Gets the value of the customerBillingAddressChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBillingAddressChange() {
        return customerBillingAddressChange;
    }

    /**
     * Sets the value of the customerBillingAddressChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBillingAddressChange(String value) {
        this.customerBillingAddressChange = value;
    }

    /**
     * Gets the value of the customerEmailChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmailChange() {
        return customerEmailChange;
    }

    /**
     * Sets the value of the customerEmailChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmailChange(String value) {
        this.customerEmailChange = value;
    }

    /**
     * Gets the value of the customerHasCheckingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHasCheckingAccount() {
        return customerHasCheckingAccount;
    }

    /**
     * Sets the value of the customerHasCheckingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHasCheckingAccount(String value) {
        this.customerHasCheckingAccount = value;
    }

    /**
     * Gets the value of the customerHasSavingsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHasSavingsAccount() {
        return customerHasSavingsAccount;
    }

    /**
     * Sets the value of the customerHasSavingsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHasSavingsAccount(String value) {
        this.customerHasSavingsAccount = value;
    }

    /**
     * Gets the value of the customerPasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPasswordChange() {
        return customerPasswordChange;
    }

    /**
     * Sets the value of the customerPasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPasswordChange(String value) {
        this.customerPasswordChange = value;
    }

    /**
     * Gets the value of the customerPhoneChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneChange() {
        return customerPhoneChange;
    }

    /**
     * Sets the value of the customerPhoneChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneChange(String value) {
        this.customerPhoneChange = value;
    }

    /**
     * Gets the value of the customerRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    /**
     * Sets the value of the customerRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRegistrationDate(String value) {
        this.customerRegistrationDate = value;
    }

    /**
     * Gets the value of the customerTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeFlag() {
        return customerTypeFlag;
    }

    /**
     * Sets the value of the customerTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeFlag(String value) {
        this.customerTypeFlag = value;
    }

    /**
     * Gets the value of the grossHouseholdIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossHouseholdIncome() {
        return grossHouseholdIncome;
    }

    /**
     * Sets the value of the grossHouseholdIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossHouseholdIncome(String value) {
        this.grossHouseholdIncome = value;
    }

    /**
     * Gets the value of the householdIncomeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdIncomeCurrency() {
        return householdIncomeCurrency;
    }

    /**
     * Sets the value of the householdIncomeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdIncomeCurrency(String value) {
        this.householdIncomeCurrency = value;
    }

    /**
     * Gets the value of the itemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategory() {
        return itemCategory;
    }

    /**
     * Sets the value of the itemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategory(String value) {
        this.itemCategory = value;
    }

    /**
     * Gets the value of the merchantPromotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPromotionCode() {
        return merchantPromotionCode;
    }

    /**
     * Sets the value of the merchantPromotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPromotionCode(String value) {
        this.merchantPromotionCode = value;
    }

    /**
     * Gets the value of the preapprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalNumber() {
        return preapprovalNumber;
    }

    /**
     * Sets the value of the preapprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalNumber(String value) {
        this.preapprovalNumber = value;
    }

    /**
     * Gets the value of the productDeliveryTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDeliveryTypeIndicator() {
        return productDeliveryTypeIndicator;
    }

    /**
     * Sets the value of the productDeliveryTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDeliveryTypeIndicator(String value) {
        this.productDeliveryTypeIndicator = value;
    }

    /**
     * Gets the value of the residenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /**
     * Sets the value of the residenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceStatus(String value) {
        this.residenceStatus = value;
    }

    /**
     * Gets the value of the tcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcVersion() {
        return tcVersion;
    }

    /**
     * Sets the value of the tcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcVersion(String value) {
        this.tcVersion = value;
    }

    /**
     * Gets the value of the yearsAtCurrentResidence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearsAtCurrentResidence() {
        return yearsAtCurrentResidence;
    }

    /**
     * Sets the value of the yearsAtCurrentResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearsAtCurrentResidence(BigInteger value) {
        this.yearsAtCurrentResidence = value;
    }

    /**
     * Gets the value of the yearsWithCurrentEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearsWithCurrentEmployer() {
        return yearsWithCurrentEmployer;
    }

    /**
     * Sets the value of the yearsWithCurrentEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearsWithCurrentEmployer(BigInteger value) {
        this.yearsWithCurrentEmployer = value;
    }

    /**
     * Gets the value of the employerStreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerStreet1() {
        return employerStreet1;
    }

    /**
     * Sets the value of the employerStreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerStreet1(String value) {
        this.employerStreet1 = value;
    }

    /**
     * Gets the value of the employerStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerStreet2() {
        return employerStreet2;
    }

    /**
     * Sets the value of the employerStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerStreet2(String value) {
        this.employerStreet2 = value;
    }

    /**
     * Gets the value of the employerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCity() {
        return employerCity;
    }

    /**
     * Sets the value of the employerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCity(String value) {
        this.employerCity = value;
    }

    /**
     * Gets the value of the employerCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCompanyName() {
        return employerCompanyName;
    }

    /**
     * Sets the value of the employerCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCompanyName(String value) {
        this.employerCompanyName = value;
    }

    /**
     * Gets the value of the employerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCountry() {
        return employerCountry;
    }

    /**
     * Sets the value of the employerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCountry(String value) {
        this.employerCountry = value;
    }

    /**
     * Gets the value of the employerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    /**
     * Sets the value of the employerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPhoneNumber(String value) {
        this.employerPhoneNumber = value;
    }

    /**
     * Gets the value of the employerPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPhoneType() {
        return employerPhoneType;
    }

    /**
     * Sets the value of the employerPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPhoneType(String value) {
        this.employerPhoneType = value;
    }

    /**
     * Gets the value of the employerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerState() {
        return employerState;
    }

    /**
     * Sets the value of the employerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerState(String value) {
        this.employerState = value;
    }

    /**
     * Gets the value of the employerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPostalCode() {
        return employerPostalCode;
    }

    /**
     * Sets the value of the employerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPostalCode(String value) {
        this.employerPostalCode = value;
    }

    /**
     * Gets the value of the shipToPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPhoneType() {
        return shipToPhoneType;
    }

    /**
     * Sets the value of the shipToPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPhoneType(String value) {
        this.shipToPhoneType = value;
    }

    /**
     * Gets the value of the billToPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPhoneType() {
        return billToPhoneType;
    }

    /**
     * Sets the value of the billToPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPhoneType(String value) {
        this.billToPhoneType = value;
    }

    /**
     * Gets the value of the methodOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    /**
     * Sets the value of the methodOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfPayment(String value) {
        this.methodOfPayment = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the customerAuthenticatedByMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAuthenticatedByMerchant() {
        return customerAuthenticatedByMerchant;
    }

    /**
     * Sets the value of the customerAuthenticatedByMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAuthenticatedByMerchant(String value) {
        this.customerAuthenticatedByMerchant = value;
    }

    /**
     * Gets the value of the backOfficeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeIndicator() {
        return backOfficeIndicator;
    }

    /**
     * Sets the value of the backOfficeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeIndicator(String value) {
        this.backOfficeIndicator = value;
    }

    /**
     * Gets the value of the shipToEqualsBillToNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEqualsBillToNameIndicator() {
        return shipToEqualsBillToNameIndicator;
    }

    /**
     * Sets the value of the shipToEqualsBillToNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEqualsBillToNameIndicator(String value) {
        this.shipToEqualsBillToNameIndicator = value;
    }

    /**
     * Gets the value of the shipToEqualsBillToAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEqualsBillToAddressIndicator() {
        return shipToEqualsBillToAddressIndicator;
    }

    /**
     * Sets the value of the shipToEqualsBillToAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEqualsBillToAddressIndicator(String value) {
        this.shipToEqualsBillToAddressIndicator = value;
    }

    /**
     * Gets the value of the alternateIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIPAddress() {
        return alternateIPAddress;
    }

    /**
     * Sets the value of the alternateIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIPAddress(String value) {
        this.alternateIPAddress = value;
    }

    /**
     * Gets the value of the businessLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLegalName() {
        return businessLegalName;
    }

    /**
     * Sets the value of the businessLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLegalName(String value) {
        this.businessLegalName = value;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbaName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the businessAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAddress1() {
        return businessAddress1;
    }

    /**
     * Sets the value of the businessAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAddress1(String value) {
        this.businessAddress1 = value;
    }

    /**
     * Gets the value of the businessAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAddress2() {
        return businessAddress2;
    }

    /**
     * Sets the value of the businessAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAddress2(String value) {
        this.businessAddress2 = value;
    }

    /**
     * Gets the value of the businessCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCity() {
        return businessCity;
    }

    /**
     * Sets the value of the businessCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCity(String value) {
        this.businessCity = value;
    }

    /**
     * Gets the value of the businessState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessState() {
        return businessState;
    }

    /**
     * Sets the value of the businessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessState(String value) {
        this.businessState = value;
    }

    /**
     * Gets the value of the businessPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPostalCode() {
        return businessPostalCode;
    }

    /**
     * Sets the value of the businessPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPostalCode(String value) {
        this.businessPostalCode = value;
    }

    /**
     * Gets the value of the businessCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCountry() {
        return businessCountry;
    }

    /**
     * Sets the value of the businessCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCountry(String value) {
        this.businessCountry = value;
    }

    /**
     * Gets the value of the businessMainPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessMainPhone() {
        return businessMainPhone;
    }

    /**
     * Sets the value of the businessMainPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessMainPhone(String value) {
        this.businessMainPhone = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the adminLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLastName() {
        return adminLastName;
    }

    /**
     * Sets the value of the adminLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLastName(String value) {
        this.adminLastName = value;
    }

    /**
     * Gets the value of the adminFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFirstName() {
        return adminFirstName;
    }

    /**
     * Sets the value of the adminFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFirstName(String value) {
        this.adminFirstName = value;
    }

    /**
     * Gets the value of the adminPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * Sets the value of the adminPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPhone(String value) {
        this.adminPhone = value;
    }

    /**
     * Gets the value of the adminFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFax() {
        return adminFax;
    }

    /**
     * Sets the value of the adminFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFax(String value) {
        this.adminFax = value;
    }

    /**
     * Gets the value of the adminEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminEmailAddress() {
        return adminEmailAddress;
    }

    /**
     * Sets the value of the adminEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminEmailAddress(String value) {
        this.adminEmailAddress = value;
    }

    /**
     * Gets the value of the adminTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminTitle() {
        return adminTitle;
    }

    /**
     * Sets the value of the adminTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminTitle(String value) {
        this.adminTitle = value;
    }

    /**
     * Gets the value of the supervisorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorLastName() {
        return supervisorLastName;
    }

    /**
     * Sets the value of the supervisorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorLastName(String value) {
        this.supervisorLastName = value;
    }

    /**
     * Gets the value of the supervisorFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorFirstName() {
        return supervisorFirstName;
    }

    /**
     * Sets the value of the supervisorFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorFirstName(String value) {
        this.supervisorFirstName = value;
    }

    /**
     * Gets the value of the supervisorEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorEmailAddress() {
        return supervisorEmailAddress;
    }

    /**
     * Sets the value of the supervisorEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorEmailAddress(String value) {
        this.supervisorEmailAddress = value;
    }

    /**
     * Gets the value of the businessDAndBNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDAndBNumber() {
        return businessDAndBNumber;
    }

    /**
     * Sets the value of the businessDAndBNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDAndBNumber(String value) {
        this.businessDAndBNumber = value;
    }

    /**
     * Gets the value of the businessTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTaxID() {
        return businessTaxID;
    }

    /**
     * Sets the value of the businessTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTaxID(String value) {
        this.businessTaxID = value;
    }

    /**
     * Gets the value of the businessNAICSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNAICSCode() {
        return businessNAICSCode;
    }

    /**
     * Sets the value of the businessNAICSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNAICSCode(String value) {
        this.businessNAICSCode = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the businessYearsInBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessYearsInBusiness() {
        return businessYearsInBusiness;
    }

    /**
     * Sets the value of the businessYearsInBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessYearsInBusiness(String value) {
        this.businessYearsInBusiness = value;
    }

    /**
     * Gets the value of the businessNumberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumberOfEmployees() {
        return businessNumberOfEmployees;
    }

    /**
     * Sets the value of the businessNumberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumberOfEmployees(String value) {
        this.businessNumberOfEmployees = value;
    }

    /**
     * Gets the value of the businessPONumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPONumber() {
        return businessPONumber;
    }

    /**
     * Sets the value of the businessPONumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPONumber(String value) {
        this.businessPONumber = value;
    }

    /**
     * Gets the value of the businessLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLoanType() {
        return businessLoanType;
    }

    /**
     * Sets the value of the businessLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLoanType(String value) {
        this.businessLoanType = value;
    }

    /**
     * Gets the value of the businessApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessApplicationID() {
        return businessApplicationID;
    }

    /**
     * Sets the value of the businessApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessApplicationID(String value) {
        this.businessApplicationID = value;
    }

    /**
     * Gets the value of the businessProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProductCode() {
        return businessProductCode;
    }

    /**
     * Sets the value of the businessProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProductCode(String value) {
        this.businessProductCode = value;
    }

    /**
     * Gets the value of the pgLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgLastName() {
        return pgLastName;
    }

    /**
     * Sets the value of the pgLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgLastName(String value) {
        this.pgLastName = value;
    }

    /**
     * Gets the value of the pgFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgFirstName() {
        return pgFirstName;
    }

    /**
     * Sets the value of the pgFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgFirstName(String value) {
        this.pgFirstName = value;
    }

    /**
     * Gets the value of the pgSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSSN() {
        return pgSSN;
    }

    /**
     * Sets the value of the pgSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSSN(String value) {
        this.pgSSN = value;
    }

    /**
     * Gets the value of the pgDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgDateOfBirth() {
        return pgDateOfBirth;
    }

    /**
     * Sets the value of the pgDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgDateOfBirth(String value) {
        this.pgDateOfBirth = value;
    }

    /**
     * Gets the value of the pgAnnualIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgAnnualIncome() {
        return pgAnnualIncome;
    }

    /**
     * Sets the value of the pgAnnualIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgAnnualIncome(String value) {
        this.pgAnnualIncome = value;
    }

    /**
     * Gets the value of the pgIncomeCurrencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgIncomeCurrencyType() {
        return pgIncomeCurrencyType;
    }

    /**
     * Sets the value of the pgIncomeCurrencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgIncomeCurrencyType(String value) {
        this.pgIncomeCurrencyType = value;
    }

    /**
     * Gets the value of the pgResidenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgResidenceStatus() {
        return pgResidenceStatus;
    }

    /**
     * Sets the value of the pgResidenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgResidenceStatus(String value) {
        this.pgResidenceStatus = value;
    }

    /**
     * Gets the value of the pgCheckingAccountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgCheckingAccountIndicator() {
        return pgCheckingAccountIndicator;
    }

    /**
     * Sets the value of the pgCheckingAccountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgCheckingAccountIndicator(String value) {
        this.pgCheckingAccountIndicator = value;
    }

    /**
     * Gets the value of the pgSavingsAccountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSavingsAccountIndicator() {
        return pgSavingsAccountIndicator;
    }

    /**
     * Sets the value of the pgSavingsAccountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSavingsAccountIndicator(String value) {
        this.pgSavingsAccountIndicator = value;
    }

    /**
     * Gets the value of the pgYearsAtEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgYearsAtEmployer() {
        return pgYearsAtEmployer;
    }

    /**
     * Sets the value of the pgYearsAtEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgYearsAtEmployer(String value) {
        this.pgYearsAtEmployer = value;
    }

    /**
     * Gets the value of the pgYearsAtResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgYearsAtResidence() {
        return pgYearsAtResidence;
    }

    /**
     * Sets the value of the pgYearsAtResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgYearsAtResidence(String value) {
        this.pgYearsAtResidence = value;
    }

    /**
     * Gets the value of the pgHomeAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeAddress1() {
        return pgHomeAddress1;
    }

    /**
     * Sets the value of the pgHomeAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeAddress1(String value) {
        this.pgHomeAddress1 = value;
    }

    /**
     * Gets the value of the pgHomeAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeAddress2() {
        return pgHomeAddress2;
    }

    /**
     * Sets the value of the pgHomeAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeAddress2(String value) {
        this.pgHomeAddress2 = value;
    }

    /**
     * Gets the value of the pgHomeCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeCity() {
        return pgHomeCity;
    }

    /**
     * Sets the value of the pgHomeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeCity(String value) {
        this.pgHomeCity = value;
    }

    /**
     * Gets the value of the pgHomeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeState() {
        return pgHomeState;
    }

    /**
     * Sets the value of the pgHomeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeState(String value) {
        this.pgHomeState = value;
    }

    /**
     * Gets the value of the pgHomePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomePostalCode() {
        return pgHomePostalCode;
    }

    /**
     * Sets the value of the pgHomePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomePostalCode(String value) {
        this.pgHomePostalCode = value;
    }

    /**
     * Gets the value of the pgHomeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeCountry() {
        return pgHomeCountry;
    }

    /**
     * Sets the value of the pgHomeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeCountry(String value) {
        this.pgHomeCountry = value;
    }

    /**
     * Gets the value of the pgEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgEmailAddress() {
        return pgEmailAddress;
    }

    /**
     * Sets the value of the pgEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgEmailAddress(String value) {
        this.pgEmailAddress = value;
    }

    /**
     * Gets the value of the pgHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomePhone() {
        return pgHomePhone;
    }

    /**
     * Sets the value of the pgHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomePhone(String value) {
        this.pgHomePhone = value;
    }

    /**
     * Gets the value of the pgTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgTitle() {
        return pgTitle;
    }

    /**
     * Sets the value of the pgTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgTitle(String value) {
        this.pgTitle = value;
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
