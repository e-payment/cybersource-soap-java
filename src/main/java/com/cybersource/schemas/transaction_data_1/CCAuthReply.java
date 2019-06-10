
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for CCAuthReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAuthReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalIDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bmlAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authFactorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.141}FundingTotals" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteRate" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fxQuoteExpirationDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="authRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantAdviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantAdviceCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cavvResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cavvResponseCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processorCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBalance" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="forwardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enhancedDataEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referralResponseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvedTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="requestCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountBalanceSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affluenceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evEmailRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evPhoneNumberRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evPostalCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evNameRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evStreetRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="posData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardIssuerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardRegulated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardCommercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardPrepaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardPayroll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardHealthcare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardSignatureDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardPINlessDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardLevel3Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processorTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerPassThroughData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerCVNResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerAVSResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerAcquirerBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardServiceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionQualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionIntegrity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emsTransactionRiskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reconciliationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAuthReply", propOrder = {
    "reasonCode",
    "amount",
    "authorizationCode",
    "avsCode",
    "avsCodeRaw",
    "cvCode",
    "cvCodeRaw",
    "personalIDCode",
    "authorizedDateTime",
    "processorResponse",
    "bmlAccountNumber",
    "authFactorCode",
    "reconciliationID",
    "fundingTotals",
    "fxQuoteID",
    "fxQuoteRate",
    "fxQuoteType",
    "fxQuoteExpirationDateTime",
    "authRecord",
    "merchantAdviceCode",
    "merchantAdviceCodeRaw",
    "cavvResponseCode",
    "cavvResponseCodeRaw",
    "authenticationXID",
    "authorizationXID",
    "processorCardType",
    "accountBalance",
    "forwardCode",
    "enhancedDataEnabled",
    "referralResponseNumber",
    "subResponseCode",
    "approvedAmount",
    "creditLine",
    "approvedTerms",
    "paymentNetworkTransactionID",
    "cardCategory",
    "ownerMerchantID",
    "requestAmount",
    "requestCurrency",
    "accountBalanceCurrency",
    "accountBalanceSign",
    "amountType",
    "accountType",
    "affluenceIndicator",
    "evEmail",
    "evPhoneNumber",
    "evPostalCode",
    "evName",
    "evStreet",
    "evEmailRaw",
    "evPhoneNumberRaw",
    "evPostalCodeRaw",
    "evNameRaw",
    "evStreetRaw",
    "cardGroup",
    "posData",
    "transactionID",
    "cardIssuerCountry",
    "cardRegulated",
    "cardCommercial",
    "cardPrepaid",
    "cardPayroll",
    "cardHealthcare",
    "cardSignatureDebit",
    "cardPINlessDebit",
    "cardLevel3Eligible",
    "processorTransactionID",
    "providerReasonCode",
    "providerReasonDescription",
    "providerPassThroughData",
    "providerCVNResponseCode",
    "providerAVSResponseCode",
    "providerAcquirerBankCode",
    "paymentCardService",
    "paymentCardServiceResult",
    "transactionQualification",
    "transactionIntegrity",
    "emsTransactionRiskScore",
    "reconciliationReferenceNumber"
})
public class CCAuthReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String authorizationCode;
    protected String avsCode;
    protected String avsCodeRaw;
    protected String cvCode;
    protected String cvCodeRaw;
    protected String personalIDCode;
    protected String authorizedDateTime;
    protected String processorResponse;
    protected String bmlAccountNumber;
    protected String authFactorCode;
    protected String reconciliationID;
    protected FundingTotals fundingTotals;
    protected String fxQuoteID;
    protected String fxQuoteRate;
    protected String fxQuoteType;
    protected String fxQuoteExpirationDateTime;
    protected String authRecord;
    protected String merchantAdviceCode;
    protected String merchantAdviceCodeRaw;
    protected String cavvResponseCode;
    protected String cavvResponseCodeRaw;
    protected String authenticationXID;
    protected String authorizationXID;
    protected String processorCardType;
    protected String accountBalance;
    protected String forwardCode;
    protected String enhancedDataEnabled;
    protected String referralResponseNumber;
    protected String subResponseCode;
    protected String approvedAmount;
    protected String creditLine;
    protected String approvedTerms;
    protected String paymentNetworkTransactionID;
    protected String cardCategory;
    protected String ownerMerchantID;
    protected String requestAmount;
    protected String requestCurrency;
    protected String accountBalanceCurrency;
    protected String accountBalanceSign;
    protected String amountType;
    protected String accountType;
    protected String affluenceIndicator;
    protected String evEmail;
    protected String evPhoneNumber;
    protected String evPostalCode;
    protected String evName;
    protected String evStreet;
    protected String evEmailRaw;
    protected String evPhoneNumberRaw;
    protected String evPostalCodeRaw;
    protected String evNameRaw;
    protected String evStreetRaw;
    protected String cardGroup;
    protected String posData;
    protected String transactionID;
    protected String cardIssuerCountry;
    protected String cardRegulated;
    protected String cardCommercial;
    protected String cardPrepaid;
    protected String cardPayroll;
    protected String cardHealthcare;
    protected String cardSignatureDebit;
    protected String cardPINlessDebit;
    protected String cardLevel3Eligible;
    protected String processorTransactionID;
    protected String providerReasonCode;
    protected String providerReasonDescription;
    protected String providerPassThroughData;
    protected String providerCVNResponseCode;
    protected String providerAVSResponseCode;
    protected String providerAcquirerBankCode;
    protected String paymentCardService;
    protected String paymentCardServiceResult;
    protected String transactionQualification;
    protected String transactionIntegrity;
    protected String emsTransactionRiskScore;
    protected String reconciliationReferenceNumber;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the avsCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCodeRaw() {
        return avsCodeRaw;
    }

    /**
     * Sets the value of the avsCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCodeRaw(String value) {
        this.avsCodeRaw = value;
    }

    /**
     * Gets the value of the cvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCode() {
        return cvCode;
    }

    /**
     * Sets the value of the cvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCode(String value) {
        this.cvCode = value;
    }

    /**
     * Gets the value of the cvCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCodeRaw() {
        return cvCodeRaw;
    }

    /**
     * Sets the value of the cvCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCodeRaw(String value) {
        this.cvCodeRaw = value;
    }

    /**
     * Gets the value of the personalIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalIDCode() {
        return personalIDCode;
    }

    /**
     * Sets the value of the personalIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalIDCode(String value) {
        this.personalIDCode = value;
    }

    /**
     * Gets the value of the authorizedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDateTime() {
        return authorizedDateTime;
    }

    /**
     * Sets the value of the authorizedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDateTime(String value) {
        this.authorizedDateTime = value;
    }

    /**
     * Gets the value of the processorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Sets the value of the processorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
    }

    /**
     * Gets the value of the bmlAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmlAccountNumber() {
        return bmlAccountNumber;
    }

    /**
     * Sets the value of the bmlAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmlAccountNumber(String value) {
        this.bmlAccountNumber = value;
    }

    /**
     * Gets the value of the authFactorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFactorCode() {
        return authFactorCode;
    }

    /**
     * Sets the value of the authFactorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFactorCode(String value) {
        this.authFactorCode = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the fundingTotals property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Sets the value of the fundingTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Gets the value of the fxQuoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteID() {
        return fxQuoteID;
    }

    /**
     * Sets the value of the fxQuoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteID(String value) {
        this.fxQuoteID = value;
    }

    /**
     * Gets the value of the fxQuoteRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteRate() {
        return fxQuoteRate;
    }

    /**
     * Sets the value of the fxQuoteRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteRate(String value) {
        this.fxQuoteRate = value;
    }

    /**
     * Gets the value of the fxQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteType() {
        return fxQuoteType;
    }

    /**
     * Sets the value of the fxQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteType(String value) {
        this.fxQuoteType = value;
    }

    /**
     * Gets the value of the fxQuoteExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteExpirationDateTime() {
        return fxQuoteExpirationDateTime;
    }

    /**
     * Sets the value of the fxQuoteExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteExpirationDateTime(String value) {
        this.fxQuoteExpirationDateTime = value;
    }

    /**
     * Gets the value of the authRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRecord() {
        return authRecord;
    }

    /**
     * Sets the value of the authRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRecord(String value) {
        this.authRecord = value;
    }

    /**
     * Gets the value of the merchantAdviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }

    /**
     * Sets the value of the merchantAdviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCode(String value) {
        this.merchantAdviceCode = value;
    }

    /**
     * Gets the value of the merchantAdviceCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCodeRaw() {
        return merchantAdviceCodeRaw;
    }

    /**
     * Sets the value of the merchantAdviceCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCodeRaw(String value) {
        this.merchantAdviceCodeRaw = value;
    }

    /**
     * Gets the value of the cavvResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCode() {
        return cavvResponseCode;
    }

    /**
     * Sets the value of the cavvResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCode(String value) {
        this.cavvResponseCode = value;
    }

    /**
     * Gets the value of the cavvResponseCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCodeRaw() {
        return cavvResponseCodeRaw;
    }

    /**
     * Sets the value of the cavvResponseCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCodeRaw(String value) {
        this.cavvResponseCodeRaw = value;
    }

    /**
     * Gets the value of the authenticationXID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationXID() {
        return authenticationXID;
    }

    /**
     * Sets the value of the authenticationXID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationXID(String value) {
        this.authenticationXID = value;
    }

    /**
     * Gets the value of the authorizationXID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationXID() {
        return authorizationXID;
    }

    /**
     * Sets the value of the authorizationXID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationXID(String value) {
        this.authorizationXID = value;
    }

    /**
     * Gets the value of the processorCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorCardType() {
        return processorCardType;
    }

    /**
     * Sets the value of the processorCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorCardType(String value) {
        this.processorCardType = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the forwardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardCode() {
        return forwardCode;
    }

    /**
     * Sets the value of the forwardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardCode(String value) {
        this.forwardCode = value;
    }

    /**
     * Gets the value of the enhancedDataEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }

    /**
     * Sets the value of the enhancedDataEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedDataEnabled(String value) {
        this.enhancedDataEnabled = value;
    }

    /**
     * Gets the value of the referralResponseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralResponseNumber() {
        return referralResponseNumber;
    }

    /**
     * Sets the value of the referralResponseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralResponseNumber(String value) {
        this.referralResponseNumber = value;
    }

    /**
     * Gets the value of the subResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubResponseCode() {
        return subResponseCode;
    }

    /**
     * Sets the value of the subResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubResponseCode(String value) {
        this.subResponseCode = value;
    }

    /**
     * Gets the value of the approvedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Sets the value of the approvedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedAmount(String value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the creditLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLine() {
        return creditLine;
    }

    /**
     * Sets the value of the creditLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLine(String value) {
        this.creditLine = value;
    }

    /**
     * Gets the value of the approvedTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedTerms() {
        return approvedTerms;
    }

    /**
     * Sets the value of the approvedTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedTerms(String value) {
        this.approvedTerms = value;
    }

    /**
     * Gets the value of the paymentNetworkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }

    /**
     * Sets the value of the paymentNetworkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkTransactionID(String value) {
        this.paymentNetworkTransactionID = value;
    }

    /**
     * Gets the value of the cardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCategory() {
        return cardCategory;
    }

    /**
     * Sets the value of the cardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCategory(String value) {
        this.cardCategory = value;
    }

    /**
     * Gets the value of the ownerMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMerchantID() {
        return ownerMerchantID;
    }

    /**
     * Sets the value of the ownerMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMerchantID(String value) {
        this.ownerMerchantID = value;
    }

    /**
     * Gets the value of the requestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * Sets the value of the requestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAmount(String value) {
        this.requestAmount = value;
    }

    /**
     * Gets the value of the requestCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCurrency() {
        return requestCurrency;
    }

    /**
     * Sets the value of the requestCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCurrency(String value) {
        this.requestCurrency = value;
    }

    /**
     * Gets the value of the accountBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }

    /**
     * Sets the value of the accountBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceCurrency(String value) {
        this.accountBalanceCurrency = value;
    }

    /**
     * Gets the value of the accountBalanceSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceSign() {
        return accountBalanceSign;
    }

    /**
     * Sets the value of the accountBalanceSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceSign(String value) {
        this.accountBalanceSign = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the affluenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffluenceIndicator() {
        return affluenceIndicator;
    }

    /**
     * Sets the value of the affluenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffluenceIndicator(String value) {
        this.affluenceIndicator = value;
    }

    /**
     * Gets the value of the evEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvEmail() {
        return evEmail;
    }

    /**
     * Sets the value of the evEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvEmail(String value) {
        this.evEmail = value;
    }

    /**
     * Gets the value of the evPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPhoneNumber() {
        return evPhoneNumber;
    }

    /**
     * Sets the value of the evPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPhoneNumber(String value) {
        this.evPhoneNumber = value;
    }

    /**
     * Gets the value of the evPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPostalCode() {
        return evPostalCode;
    }

    /**
     * Sets the value of the evPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPostalCode(String value) {
        this.evPostalCode = value;
    }

    /**
     * Gets the value of the evName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvName() {
        return evName;
    }

    /**
     * Sets the value of the evName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvName(String value) {
        this.evName = value;
    }

    /**
     * Gets the value of the evStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvStreet() {
        return evStreet;
    }

    /**
     * Sets the value of the evStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvStreet(String value) {
        this.evStreet = value;
    }

    /**
     * Gets the value of the evEmailRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvEmailRaw() {
        return evEmailRaw;
    }

    /**
     * Sets the value of the evEmailRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvEmailRaw(String value) {
        this.evEmailRaw = value;
    }

    /**
     * Gets the value of the evPhoneNumberRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPhoneNumberRaw() {
        return evPhoneNumberRaw;
    }

    /**
     * Sets the value of the evPhoneNumberRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPhoneNumberRaw(String value) {
        this.evPhoneNumberRaw = value;
    }

    /**
     * Gets the value of the evPostalCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPostalCodeRaw() {
        return evPostalCodeRaw;
    }

    /**
     * Sets the value of the evPostalCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPostalCodeRaw(String value) {
        this.evPostalCodeRaw = value;
    }

    /**
     * Gets the value of the evNameRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvNameRaw() {
        return evNameRaw;
    }

    /**
     * Sets the value of the evNameRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvNameRaw(String value) {
        this.evNameRaw = value;
    }

    /**
     * Gets the value of the evStreetRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvStreetRaw() {
        return evStreetRaw;
    }

    /**
     * Sets the value of the evStreetRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvStreetRaw(String value) {
        this.evStreetRaw = value;
    }

    /**
     * Gets the value of the cardGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardGroup() {
        return cardGroup;
    }

    /**
     * Sets the value of the cardGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardGroup(String value) {
        this.cardGroup = value;
    }

    /**
     * Gets the value of the posData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosData() {
        return posData;
    }

    /**
     * Sets the value of the posData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosData(String value) {
        this.posData = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the cardIssuerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuerCountry() {
        return cardIssuerCountry;
    }

    /**
     * Sets the value of the cardIssuerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuerCountry(String value) {
        this.cardIssuerCountry = value;
    }

    /**
     * Gets the value of the cardRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRegulated() {
        return cardRegulated;
    }

    /**
     * Sets the value of the cardRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRegulated(String value) {
        this.cardRegulated = value;
    }

    /**
     * Gets the value of the cardCommercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCommercial() {
        return cardCommercial;
    }

    /**
     * Sets the value of the cardCommercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCommercial(String value) {
        this.cardCommercial = value;
    }

    /**
     * Gets the value of the cardPrepaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrepaid() {
        return cardPrepaid;
    }

    /**
     * Sets the value of the cardPrepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrepaid(String value) {
        this.cardPrepaid = value;
    }

    /**
     * Gets the value of the cardPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPayroll() {
        return cardPayroll;
    }

    /**
     * Sets the value of the cardPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPayroll(String value) {
        this.cardPayroll = value;
    }

    /**
     * Gets the value of the cardHealthcare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHealthcare() {
        return cardHealthcare;
    }

    /**
     * Sets the value of the cardHealthcare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHealthcare(String value) {
        this.cardHealthcare = value;
    }

    /**
     * Gets the value of the cardSignatureDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSignatureDebit() {
        return cardSignatureDebit;
    }

    /**
     * Sets the value of the cardSignatureDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSignatureDebit(String value) {
        this.cardSignatureDebit = value;
    }

    /**
     * Gets the value of the cardPINlessDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPINlessDebit() {
        return cardPINlessDebit;
    }

    /**
     * Sets the value of the cardPINlessDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPINlessDebit(String value) {
        this.cardPINlessDebit = value;
    }

    /**
     * Gets the value of the cardLevel3Eligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevel3Eligible() {
        return cardLevel3Eligible;
    }

    /**
     * Sets the value of the cardLevel3Eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevel3Eligible(String value) {
        this.cardLevel3Eligible = value;
    }

    /**
     * Gets the value of the processorTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorTransactionID() {
        return processorTransactionID;
    }

    /**
     * Sets the value of the processorTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorTransactionID(String value) {
        this.processorTransactionID = value;
    }

    /**
     * Gets the value of the providerReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReasonCode() {
        return providerReasonCode;
    }

    /**
     * Sets the value of the providerReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReasonCode(String value) {
        this.providerReasonCode = value;
    }

    /**
     * Gets the value of the providerReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReasonDescription() {
        return providerReasonDescription;
    }

    /**
     * Sets the value of the providerReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReasonDescription(String value) {
        this.providerReasonDescription = value;
    }

    /**
     * Gets the value of the providerPassThroughData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderPassThroughData() {
        return providerPassThroughData;
    }

    /**
     * Sets the value of the providerPassThroughData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderPassThroughData(String value) {
        this.providerPassThroughData = value;
    }

    /**
     * Gets the value of the providerCVNResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCVNResponseCode() {
        return providerCVNResponseCode;
    }

    /**
     * Sets the value of the providerCVNResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCVNResponseCode(String value) {
        this.providerCVNResponseCode = value;
    }

    /**
     * Gets the value of the providerAVSResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAVSResponseCode() {
        return providerAVSResponseCode;
    }

    /**
     * Sets the value of the providerAVSResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAVSResponseCode(String value) {
        this.providerAVSResponseCode = value;
    }

    /**
     * Gets the value of the providerAcquirerBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAcquirerBankCode() {
        return providerAcquirerBankCode;
    }

    /**
     * Sets the value of the providerAcquirerBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAcquirerBankCode(String value) {
        this.providerAcquirerBankCode = value;
    }

    /**
     * Gets the value of the paymentCardService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardService() {
        return paymentCardService;
    }

    /**
     * Sets the value of the paymentCardService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardService(String value) {
        this.paymentCardService = value;
    }

    /**
     * Gets the value of the paymentCardServiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardServiceResult() {
        return paymentCardServiceResult;
    }

    /**
     * Sets the value of the paymentCardServiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardServiceResult(String value) {
        this.paymentCardServiceResult = value;
    }

    /**
     * Gets the value of the transactionQualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionQualification() {
        return transactionQualification;
    }

    /**
     * Sets the value of the transactionQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionQualification(String value) {
        this.transactionQualification = value;
    }

    /**
     * Gets the value of the transactionIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIntegrity() {
        return transactionIntegrity;
    }

    /**
     * Sets the value of the transactionIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIntegrity(String value) {
        this.transactionIntegrity = value;
    }

    /**
     * Gets the value of the emsTransactionRiskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsTransactionRiskScore() {
        return emsTransactionRiskScore;
    }

    /**
     * Sets the value of the emsTransactionRiskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsTransactionRiskScore(String value) {
        this.emsTransactionRiskScore = value;
    }

    /**
     * Gets the value of the reconciliationReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }

    /**
     * Sets the value of the reconciliationReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationReferenceNumber(String value) {
        this.reconciliationReferenceNumber = value;
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
