
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ReplyMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="missingField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/&gt;
 *         &lt;element name="invalidField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/&gt;
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purchaseTotals" type="{urn:schemas-cybersource-com:transaction-data-1.141}PurchaseTotals" minOccurs="0"/&gt;
 *         &lt;element name="deniedPartiesMatch" type="{urn:schemas-cybersource-com:transaction-data-1.141}DeniedPartiesMatch" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="ccAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAuthReply" minOccurs="0"/&gt;
 *         &lt;element name="octReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}OCTReply" minOccurs="0"/&gt;
 *         &lt;element name="verificationReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}VerificationReply" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleReply" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleCreditReply" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="ccIncrementalAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCIncrementalAuthReply" minOccurs="0"/&gt;
 *         &lt;element name="serviceFeeCalculateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ServiceFeeCalculateReply" minOccurs="0"/&gt;
 *         &lt;element name="ccCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCCaptureReply" minOccurs="0"/&gt;
 *         &lt;element name="ccCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCCreditReply" minOccurs="0"/&gt;
 *         &lt;element name="ccAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAuthReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="ccAutoAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAutoAuthReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="ccDCCReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCDCCReply" minOccurs="0"/&gt;
 *         &lt;element name="ccDCCUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCDCCUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="ecDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECDebitReply" minOccurs="0"/&gt;
 *         &lt;element name="ecCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECCreditReply" minOccurs="0"/&gt;
 *         &lt;element name="ecAuthenticateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECAuthenticateReply" minOccurs="0"/&gt;
 *         &lt;element name="payerAuthEnrollReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayerAuthEnrollReply" minOccurs="0"/&gt;
 *         &lt;element name="payerAuthValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayerAuthValidateReply" minOccurs="0"/&gt;
 *         &lt;element name="taxReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}TaxReply" minOccurs="0"/&gt;
 *         &lt;element name="encryptedPayment" type="{urn:schemas-cybersource-com:transaction-data-1.141}EncryptedPayment" minOccurs="0"/&gt;
 *         &lt;element name="encryptPaymentDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}EncryptPaymentDataReply" minOccurs="0"/&gt;
 *         &lt;element name="dmeReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DMEReply" minOccurs="0"/&gt;
 *         &lt;element name="afsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}AFSReply" minOccurs="0"/&gt;
 *         &lt;element name="davReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DAVReply" minOccurs="0"/&gt;
 *         &lt;element name="exportReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ExportReply" minOccurs="0"/&gt;
 *         &lt;element name="fxRatesReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}FXRatesReply" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferReply" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferRefundReply" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferRealTimeReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferRealTimeReply" minOccurs="0"/&gt;
 *         &lt;element name="directDebitMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitMandateReply" minOccurs="0"/&gt;
 *         &lt;element name="directDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitReply" minOccurs="0"/&gt;
 *         &lt;element name="directDebitValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitValidateReply" minOccurs="0"/&gt;
 *         &lt;element name="directDebitRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitRefundReply" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionCreateReply" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionEventUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionEventUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionRetrieveReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionRetrieveReply" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionDeleteReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionDeleteReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPaymentReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalCreditReply" minOccurs="0"/&gt;
 *         &lt;element name="voidReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}VoidReply" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitReply" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitValidateReply" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalButtonCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalButtonCreateReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalPreapprovedPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPreapprovedPaymentReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalPreapprovedUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPreapprovedUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="riskUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}RiskUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="fraudUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}FraudUpdateReply" minOccurs="0"/&gt;
 *         &lt;element name="caseManagementActionReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}CaseManagementActionReply" minOccurs="0"/&gt;
 *         &lt;element name="decisionReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DecisionReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalRefundReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalAuthReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalDoCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalDoCaptureReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcDoPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcDoPaymentReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcGetDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcGetDetailsReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcSetReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcSetReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalAuthorizationReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalAuthorizationReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcOrderSetupReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcOrderSetupReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalUpdateAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalUpdateAgreementReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalCreateAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalCreateAgreementReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalDoRefTransactionReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalDoRefTransactionReply" minOccurs="0"/&gt;
 *         &lt;element name="chinaPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ChinaPaymentReply" minOccurs="0"/&gt;
 *         &lt;element name="chinaRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}ChinaRefundReply" minOccurs="0"/&gt;
 *         &lt;element name="boletoPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}BoletoPaymentReply" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitPurchaseReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitPurchaseReply" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitCreditReply" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="apInitiateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APInitiateReply" minOccurs="0"/&gt;
 *         &lt;element name="apCheckStatusReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCheckStatusReply" minOccurs="0"/&gt;
 *         &lt;element name="receiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="solutionProviderTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APReply" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{urn:schemas-cybersource-com:transaction-data-1.141}ShipTo" minOccurs="0"/&gt;
 *         &lt;element name="billTo" type="{urn:schemas-cybersource-com:transaction-data-1.141}BillTo" minOccurs="0"/&gt;
 *         &lt;element name="apAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APAuthReply" minOccurs="0"/&gt;
 *         &lt;element name="apSessionsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APSessionsReply" minOccurs="0"/&gt;
 *         &lt;element name="apAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APAuthReversalReply" minOccurs="0"/&gt;
 *         &lt;element name="apCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCaptureReply" minOccurs="0"/&gt;
 *         &lt;element name="apOptionsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APOptionsReply" minOccurs="0"/&gt;
 *         &lt;element name="apRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APRefundReply" minOccurs="0"/&gt;
 *         &lt;element name="apSaleReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APSaleReply" minOccurs="0"/&gt;
 *         &lt;element name="apCheckoutDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCheckOutDetailsReply" minOccurs="0"/&gt;
 *         &lt;element name="apTransactionDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APTransactionDetailsReply" minOccurs="0"/&gt;
 *         &lt;element name="apConfirmPurchaseReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APConfirmPurchaseReply" minOccurs="0"/&gt;
 *         &lt;element name="promotion" type="{urn:schemas-cybersource-com:transaction-data-1.141}Promotion" minOccurs="0"/&gt;
 *         &lt;element name="promotionGroup" type="{urn:schemas-cybersource-com:transaction-data-1.141}PromotionGroupReply" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="payPalGetTxnDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalGetTxnDetailsReply" minOccurs="0"/&gt;
 *         &lt;element name="payPalTransactionSearchReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalTransactionSearchReply" minOccurs="0"/&gt;
 *         &lt;element name="emvReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}EmvReply" minOccurs="0"/&gt;
 *         &lt;element name="originalTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.141}OriginalTransaction" minOccurs="0"/&gt;
 *         &lt;element name="hostedDataCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}HostedDataCreateReply" minOccurs="0"/&gt;
 *         &lt;element name="hostedDataRetrieveReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}HostedDataRetrieveReply" minOccurs="0"/&gt;
 *         &lt;element name="salesSlipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalProcessorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jpo" type="{urn:schemas-cybersource-com:transaction-data-1.141}JPO" minOccurs="0"/&gt;
 *         &lt;element name="card" type="{urn:schemas-cybersource-com:transaction-data-1.141}Card" minOccurs="0"/&gt;
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaymentNetworkToken" minOccurs="0"/&gt;
 *         &lt;element name="vcReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}VCReply" minOccurs="0"/&gt;
 *         &lt;element name="decryptVisaCheckoutDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}DecryptVisaCheckoutDataReply" minOccurs="0"/&gt;
 *         &lt;element name="getVisaCheckoutDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}GetVisaCheckoutDataReply" minOccurs="0"/&gt;
 *         &lt;element name="binLookupReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}BinLookupReply" minOccurs="0"/&gt;
 *         &lt;element name="issuerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{urn:schemas-cybersource-com:transaction-data-1.141}Token" minOccurs="0"/&gt;
 *         &lt;element name="issuer" type="{urn:schemas-cybersource-com:transaction-data-1.141}issuer" minOccurs="0"/&gt;
 *         &lt;element name="recipient" type="{urn:schemas-cybersource-com:transaction-data-1.141}Recipient" minOccurs="0"/&gt;
 *         &lt;element name="feeProgramIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installment" type="{urn:schemas-cybersource-com:transaction-data-1.141}Installment" minOccurs="0"/&gt;
 *         &lt;element name="paymentAccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ucaf" type="{urn:schemas-cybersource-com:transaction-data-1.141}UCAF" minOccurs="0"/&gt;
 *         &lt;element name="invoiceHeader" type="{urn:schemas-cybersource-com:transaction-data-1.141}InvoiceHeader" minOccurs="0"/&gt;
 *         &lt;element name="apOrderReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APOrderReply" minOccurs="0"/&gt;
 *         &lt;element name="apCancelReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCancelReply" minOccurs="0"/&gt;
 *         &lt;element name="apBillingAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.141}APBillingAgreementReply" minOccurs="0"/&gt;
 *         &lt;element name="customerVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalID" type="{urn:schemas-cybersource-com:transaction-data-1.141}PersonalID" minOccurs="0"/&gt;
 *         &lt;element name="acquirerMerchantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pos" type="{urn:schemas-cybersource-com:transaction-data-1.141}Pos" minOccurs="0"/&gt;
 *         &lt;element name="issuerMessageAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserved" type="{urn:schemas-cybersource-com:transaction-data-1.141}ReplyReserved" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyMessage", propOrder = {
    "merchantReferenceCode",
    "requestID",
    "decision",
    "reasonCode",
    "missingField",
    "invalidField",
    "requestToken",
    "purchaseTotals",
    "deniedPartiesMatch",
    "ccAuthReply",
    "octReply",
    "verificationReply",
    "ccSaleReply",
    "ccSaleCreditReply",
    "ccSaleReversalReply",
    "ccIncrementalAuthReply",
    "serviceFeeCalculateReply",
    "ccCaptureReply",
    "ccCreditReply",
    "ccAuthReversalReply",
    "ccAutoAuthReversalReply",
    "ccDCCReply",
    "ccDCCUpdateReply",
    "ecDebitReply",
    "ecCreditReply",
    "ecAuthenticateReply",
    "payerAuthEnrollReply",
    "payerAuthValidateReply",
    "taxReply",
    "encryptedPayment",
    "encryptPaymentDataReply",
    "dmeReply",
    "afsReply",
    "davReply",
    "exportReply",
    "fxRatesReply",
    "bankTransferReply",
    "bankTransferRefundReply",
    "bankTransferRealTimeReply",
    "directDebitMandateReply",
    "directDebitReply",
    "directDebitValidateReply",
    "directDebitRefundReply",
    "paySubscriptionCreateReply",
    "paySubscriptionUpdateReply",
    "paySubscriptionEventUpdateReply",
    "paySubscriptionRetrieveReply",
    "paySubscriptionDeleteReply",
    "payPalPaymentReply",
    "payPalCreditReply",
    "voidReply",
    "pinlessDebitReply",
    "pinlessDebitValidateReply",
    "pinlessDebitReversalReply",
    "payPalButtonCreateReply",
    "payPalPreapprovedPaymentReply",
    "payPalPreapprovedUpdateReply",
    "riskUpdateReply",
    "fraudUpdateReply",
    "caseManagementActionReply",
    "decisionReply",
    "payPalRefundReply",
    "payPalAuthReversalReply",
    "payPalDoCaptureReply",
    "payPalEcDoPaymentReply",
    "payPalEcGetDetailsReply",
    "payPalEcSetReply",
    "payPalAuthorizationReply",
    "payPalEcOrderSetupReply",
    "payPalUpdateAgreementReply",
    "payPalCreateAgreementReply",
    "payPalDoRefTransactionReply",
    "chinaPaymentReply",
    "chinaRefundReply",
    "boletoPaymentReply",
    "pinDebitPurchaseReply",
    "pinDebitCreditReply",
    "pinDebitReversalReply",
    "apInitiateReply",
    "apCheckStatusReply",
    "receiptNumber",
    "additionalData",
    "solutionProviderTransactionID",
    "apReply",
    "shipTo",
    "billTo",
    "apAuthReply",
    "apSessionsReply",
    "apAuthReversalReply",
    "apCaptureReply",
    "apOptionsReply",
    "apRefundReply",
    "apSaleReply",
    "apCheckoutDetailsReply",
    "apTransactionDetailsReply",
    "apConfirmPurchaseReply",
    "promotion",
    "promotionGroup",
    "payPalGetTxnDetailsReply",
    "payPalTransactionSearchReply",
    "emvReply",
    "originalTransaction",
    "hostedDataCreateReply",
    "hostedDataRetrieveReply",
    "salesSlipNumber",
    "additionalProcessorResponse",
    "jpo",
    "card",
    "paymentNetworkToken",
    "vcReply",
    "decryptVisaCheckoutDataReply",
    "getVisaCheckoutDataReply",
    "binLookupReply",
    "issuerMessage",
    "token",
    "issuer",
    "recipient",
    "feeProgramIndicator",
    "installment",
    "paymentAccountReference",
    "authIndicator",
    "ucaf",
    "invoiceHeader",
    "apOrderReply",
    "apCancelReply",
    "apBillingAgreementReply",
    "customerVerificationStatus",
    "personalID",
    "acquirerMerchantNumber",
    "pos",
    "issuerMessageAction",
    "reserved"
})
public class ReplyMessage {

    protected String merchantReferenceCode;
    @XmlElement(required = true)
    protected String requestID;
    @XmlElement(required = true)
    protected String decision;
    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected List<String> missingField;
    protected List<String> invalidField;
    @XmlElement(required = true)
    protected String requestToken;
    protected PurchaseTotals purchaseTotals;
    protected List<DeniedPartiesMatch> deniedPartiesMatch;
    protected CCAuthReply ccAuthReply;
    protected OCTReply octReply;
    protected VerificationReply verificationReply;
    protected CCSaleReply ccSaleReply;
    protected CCSaleCreditReply ccSaleCreditReply;
    protected CCSaleReversalReply ccSaleReversalReply;
    protected CCIncrementalAuthReply ccIncrementalAuthReply;
    protected ServiceFeeCalculateReply serviceFeeCalculateReply;
    protected CCCaptureReply ccCaptureReply;
    protected CCCreditReply ccCreditReply;
    protected CCAuthReversalReply ccAuthReversalReply;
    protected CCAutoAuthReversalReply ccAutoAuthReversalReply;
    protected CCDCCReply ccDCCReply;
    protected CCDCCUpdateReply ccDCCUpdateReply;
    protected ECDebitReply ecDebitReply;
    protected ECCreditReply ecCreditReply;
    protected ECAuthenticateReply ecAuthenticateReply;
    protected PayerAuthEnrollReply payerAuthEnrollReply;
    protected PayerAuthValidateReply payerAuthValidateReply;
    protected TaxReply taxReply;
    protected EncryptedPayment encryptedPayment;
    protected EncryptPaymentDataReply encryptPaymentDataReply;
    protected DMEReply dmeReply;
    protected AFSReply afsReply;
    protected DAVReply davReply;
    protected ExportReply exportReply;
    protected FXRatesReply fxRatesReply;
    protected BankTransferReply bankTransferReply;
    protected BankTransferRefundReply bankTransferRefundReply;
    protected BankTransferRealTimeReply bankTransferRealTimeReply;
    protected DirectDebitMandateReply directDebitMandateReply;
    protected DirectDebitReply directDebitReply;
    protected DirectDebitValidateReply directDebitValidateReply;
    protected DirectDebitRefundReply directDebitRefundReply;
    protected PaySubscriptionCreateReply paySubscriptionCreateReply;
    protected PaySubscriptionUpdateReply paySubscriptionUpdateReply;
    protected PaySubscriptionEventUpdateReply paySubscriptionEventUpdateReply;
    protected PaySubscriptionRetrieveReply paySubscriptionRetrieveReply;
    protected PaySubscriptionDeleteReply paySubscriptionDeleteReply;
    protected PayPalPaymentReply payPalPaymentReply;
    protected PayPalCreditReply payPalCreditReply;
    protected VoidReply voidReply;
    protected PinlessDebitReply pinlessDebitReply;
    protected PinlessDebitValidateReply pinlessDebitValidateReply;
    protected PinlessDebitReversalReply pinlessDebitReversalReply;
    protected PayPalButtonCreateReply payPalButtonCreateReply;
    protected PayPalPreapprovedPaymentReply payPalPreapprovedPaymentReply;
    protected PayPalPreapprovedUpdateReply payPalPreapprovedUpdateReply;
    protected RiskUpdateReply riskUpdateReply;
    protected FraudUpdateReply fraudUpdateReply;
    protected CaseManagementActionReply caseManagementActionReply;
    protected DecisionReply decisionReply;
    protected PayPalRefundReply payPalRefundReply;
    protected PayPalAuthReversalReply payPalAuthReversalReply;
    protected PayPalDoCaptureReply payPalDoCaptureReply;
    protected PayPalEcDoPaymentReply payPalEcDoPaymentReply;
    protected PayPalEcGetDetailsReply payPalEcGetDetailsReply;
    protected PayPalEcSetReply payPalEcSetReply;
    protected PayPalAuthorizationReply payPalAuthorizationReply;
    protected PayPalEcOrderSetupReply payPalEcOrderSetupReply;
    protected PayPalUpdateAgreementReply payPalUpdateAgreementReply;
    protected PayPalCreateAgreementReply payPalCreateAgreementReply;
    protected PayPalDoRefTransactionReply payPalDoRefTransactionReply;
    protected ChinaPaymentReply chinaPaymentReply;
    protected ChinaRefundReply chinaRefundReply;
    protected BoletoPaymentReply boletoPaymentReply;
    protected PinDebitPurchaseReply pinDebitPurchaseReply;
    protected PinDebitCreditReply pinDebitCreditReply;
    protected PinDebitReversalReply pinDebitReversalReply;
    protected APInitiateReply apInitiateReply;
    protected APCheckStatusReply apCheckStatusReply;
    protected String receiptNumber;
    protected String additionalData;
    protected String solutionProviderTransactionID;
    protected APReply apReply;
    protected ShipTo shipTo;
    protected BillTo billTo;
    protected APAuthReply apAuthReply;
    protected APSessionsReply apSessionsReply;
    protected APAuthReversalReply apAuthReversalReply;
    protected APCaptureReply apCaptureReply;
    protected APOptionsReply apOptionsReply;
    protected APRefundReply apRefundReply;
    protected APSaleReply apSaleReply;
    protected APCheckOutDetailsReply apCheckoutDetailsReply;
    protected APTransactionDetailsReply apTransactionDetailsReply;
    protected APConfirmPurchaseReply apConfirmPurchaseReply;
    protected Promotion promotion;
    protected List<PromotionGroupReply> promotionGroup;
    protected PayPalGetTxnDetailsReply payPalGetTxnDetailsReply;
    protected PayPalTransactionSearchReply payPalTransactionSearchReply;
    protected EmvReply emvReply;
    protected OriginalTransaction originalTransaction;
    protected HostedDataCreateReply hostedDataCreateReply;
    protected HostedDataRetrieveReply hostedDataRetrieveReply;
    protected String salesSlipNumber;
    protected String additionalProcessorResponse;
    protected JPO jpo;
    protected Card card;
    protected PaymentNetworkToken paymentNetworkToken;
    protected VCReply vcReply;
    protected DecryptVisaCheckoutDataReply decryptVisaCheckoutDataReply;
    protected GetVisaCheckoutDataReply getVisaCheckoutDataReply;
    protected BinLookupReply binLookupReply;
    protected String issuerMessage;
    protected Token token;
    protected Issuer issuer;
    protected Recipient recipient;
    protected String feeProgramIndicator;
    protected Installment installment;
    protected String paymentAccountReference;
    protected String authIndicator;
    protected UCAF ucaf;
    protected InvoiceHeader invoiceHeader;
    protected APOrderReply apOrderReply;
    protected APCancelReply apCancelReply;
    protected APBillingAgreementReply apBillingAgreementReply;
    protected String customerVerificationStatus;
    protected PersonalID personalID;
    protected String acquirerMerchantNumber;
    protected Pos pos;
    protected String issuerMessageAction;
    protected ReplyReserved reserved;

    /**
     * Gets the value of the merchantReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }

    /**
     * Sets the value of the merchantReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceCode(String value) {
        this.merchantReferenceCode = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

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
     * Gets the value of the missingField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMissingField() {
        if (missingField == null) {
            missingField = new ArrayList<String>();
        }
        return this.missingField;
    }

    /**
     * Gets the value of the invalidField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invalidField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvalidField() {
        if (invalidField == null) {
            invalidField = new ArrayList<String>();
        }
        return this.invalidField;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the purchaseTotals property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseTotals }
     *     
     */
    public PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }

    /**
     * Sets the value of the purchaseTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseTotals }
     *     
     */
    public void setPurchaseTotals(PurchaseTotals value) {
        this.purchaseTotals = value;
    }

    /**
     * Gets the value of the deniedPartiesMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deniedPartiesMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeniedPartiesMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeniedPartiesMatch }
     * 
     * 
     */
    public List<DeniedPartiesMatch> getDeniedPartiesMatch() {
        if (deniedPartiesMatch == null) {
            deniedPartiesMatch = new ArrayList<DeniedPartiesMatch>();
        }
        return this.deniedPartiesMatch;
    }

    /**
     * Gets the value of the ccAuthReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReply }
     *     
     */
    public CCAuthReply getCcAuthReply() {
        return ccAuthReply;
    }

    /**
     * Sets the value of the ccAuthReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReply }
     *     
     */
    public void setCcAuthReply(CCAuthReply value) {
        this.ccAuthReply = value;
    }

    /**
     * Gets the value of the octReply property.
     * 
     * @return
     *     possible object is
     *     {@link OCTReply }
     *     
     */
    public OCTReply getOctReply() {
        return octReply;
    }

    /**
     * Sets the value of the octReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCTReply }
     *     
     */
    public void setOctReply(OCTReply value) {
        this.octReply = value;
    }

    /**
     * Gets the value of the verificationReply property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationReply }
     *     
     */
    public VerificationReply getVerificationReply() {
        return verificationReply;
    }

    /**
     * Sets the value of the verificationReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReply }
     *     
     */
    public void setVerificationReply(VerificationReply value) {
        this.verificationReply = value;
    }

    /**
     * Gets the value of the ccSaleReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReply }
     *     
     */
    public CCSaleReply getCcSaleReply() {
        return ccSaleReply;
    }

    /**
     * Sets the value of the ccSaleReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReply }
     *     
     */
    public void setCcSaleReply(CCSaleReply value) {
        this.ccSaleReply = value;
    }

    /**
     * Gets the value of the ccSaleCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleCreditReply }
     *     
     */
    public CCSaleCreditReply getCcSaleCreditReply() {
        return ccSaleCreditReply;
    }

    /**
     * Sets the value of the ccSaleCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleCreditReply }
     *     
     */
    public void setCcSaleCreditReply(CCSaleCreditReply value) {
        this.ccSaleCreditReply = value;
    }

    /**
     * Gets the value of the ccSaleReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReversalReply }
     *     
     */
    public CCSaleReversalReply getCcSaleReversalReply() {
        return ccSaleReversalReply;
    }

    /**
     * Sets the value of the ccSaleReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReversalReply }
     *     
     */
    public void setCcSaleReversalReply(CCSaleReversalReply value) {
        this.ccSaleReversalReply = value;
    }

    /**
     * Gets the value of the ccIncrementalAuthReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCIncrementalAuthReply }
     *     
     */
    public CCIncrementalAuthReply getCcIncrementalAuthReply() {
        return ccIncrementalAuthReply;
    }

    /**
     * Sets the value of the ccIncrementalAuthReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCIncrementalAuthReply }
     *     
     */
    public void setCcIncrementalAuthReply(CCIncrementalAuthReply value) {
        this.ccIncrementalAuthReply = value;
    }

    /**
     * Gets the value of the serviceFeeCalculateReply property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeCalculateReply }
     *     
     */
    public ServiceFeeCalculateReply getServiceFeeCalculateReply() {
        return serviceFeeCalculateReply;
    }

    /**
     * Sets the value of the serviceFeeCalculateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeCalculateReply }
     *     
     */
    public void setServiceFeeCalculateReply(ServiceFeeCalculateReply value) {
        this.serviceFeeCalculateReply = value;
    }

    /**
     * Gets the value of the ccCaptureReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureReply }
     *     
     */
    public CCCaptureReply getCcCaptureReply() {
        return ccCaptureReply;
    }

    /**
     * Sets the value of the ccCaptureReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureReply }
     *     
     */
    public void setCcCaptureReply(CCCaptureReply value) {
        this.ccCaptureReply = value;
    }

    /**
     * Gets the value of the ccCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditReply }
     *     
     */
    public CCCreditReply getCcCreditReply() {
        return ccCreditReply;
    }

    /**
     * Sets the value of the ccCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditReply }
     *     
     */
    public void setCcCreditReply(CCCreditReply value) {
        this.ccCreditReply = value;
    }

    /**
     * Gets the value of the ccAuthReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public CCAuthReversalReply getCcAuthReversalReply() {
        return ccAuthReversalReply;
    }

    /**
     * Sets the value of the ccAuthReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public void setCcAuthReversalReply(CCAuthReversalReply value) {
        this.ccAuthReversalReply = value;
    }

    /**
     * Gets the value of the ccAutoAuthReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCAutoAuthReversalReply }
     *     
     */
    public CCAutoAuthReversalReply getCcAutoAuthReversalReply() {
        return ccAutoAuthReversalReply;
    }

    /**
     * Sets the value of the ccAutoAuthReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAutoAuthReversalReply }
     *     
     */
    public void setCcAutoAuthReversalReply(CCAutoAuthReversalReply value) {
        this.ccAutoAuthReversalReply = value;
    }

    /**
     * Gets the value of the ccDCCReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCReply }
     *     
     */
    public CCDCCReply getCcDCCReply() {
        return ccDCCReply;
    }

    /**
     * Sets the value of the ccDCCReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCReply }
     *     
     */
    public void setCcDCCReply(CCDCCReply value) {
        this.ccDCCReply = value;
    }

    /**
     * Gets the value of the ccDCCUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCUpdateReply }
     *     
     */
    public CCDCCUpdateReply getCcDCCUpdateReply() {
        return ccDCCUpdateReply;
    }

    /**
     * Sets the value of the ccDCCUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCUpdateReply }
     *     
     */
    public void setCcDCCUpdateReply(CCDCCUpdateReply value) {
        this.ccDCCUpdateReply = value;
    }

    /**
     * Gets the value of the ecDebitReply property.
     * 
     * @return
     *     possible object is
     *     {@link ECDebitReply }
     *     
     */
    public ECDebitReply getEcDebitReply() {
        return ecDebitReply;
    }

    /**
     * Sets the value of the ecDebitReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDebitReply }
     *     
     */
    public void setEcDebitReply(ECDebitReply value) {
        this.ecDebitReply = value;
    }

    /**
     * Gets the value of the ecCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link ECCreditReply }
     *     
     */
    public ECCreditReply getEcCreditReply() {
        return ecCreditReply;
    }

    /**
     * Sets the value of the ecCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCreditReply }
     *     
     */
    public void setEcCreditReply(ECCreditReply value) {
        this.ecCreditReply = value;
    }

    /**
     * Gets the value of the ecAuthenticateReply property.
     * 
     * @return
     *     possible object is
     *     {@link ECAuthenticateReply }
     *     
     */
    public ECAuthenticateReply getEcAuthenticateReply() {
        return ecAuthenticateReply;
    }

    /**
     * Sets the value of the ecAuthenticateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAuthenticateReply }
     *     
     */
    public void setEcAuthenticateReply(ECAuthenticateReply value) {
        this.ecAuthenticateReply = value;
    }

    /**
     * Gets the value of the payerAuthEnrollReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthEnrollReply }
     *     
     */
    public PayerAuthEnrollReply getPayerAuthEnrollReply() {
        return payerAuthEnrollReply;
    }

    /**
     * Sets the value of the payerAuthEnrollReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthEnrollReply }
     *     
     */
    public void setPayerAuthEnrollReply(PayerAuthEnrollReply value) {
        this.payerAuthEnrollReply = value;
    }

    /**
     * Gets the value of the payerAuthValidateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthValidateReply }
     *     
     */
    public PayerAuthValidateReply getPayerAuthValidateReply() {
        return payerAuthValidateReply;
    }

    /**
     * Sets the value of the payerAuthValidateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthValidateReply }
     *     
     */
    public void setPayerAuthValidateReply(PayerAuthValidateReply value) {
        this.payerAuthValidateReply = value;
    }

    /**
     * Gets the value of the taxReply property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReply }
     *     
     */
    public TaxReply getTaxReply() {
        return taxReply;
    }

    /**
     * Sets the value of the taxReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReply }
     *     
     */
    public void setTaxReply(TaxReply value) {
        this.taxReply = value;
    }

    /**
     * Gets the value of the encryptedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedPayment }
     *     
     */
    public EncryptedPayment getEncryptedPayment() {
        return encryptedPayment;
    }

    /**
     * Sets the value of the encryptedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedPayment }
     *     
     */
    public void setEncryptedPayment(EncryptedPayment value) {
        this.encryptedPayment = value;
    }

    /**
     * Gets the value of the encryptPaymentDataReply property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptPaymentDataReply }
     *     
     */
    public EncryptPaymentDataReply getEncryptPaymentDataReply() {
        return encryptPaymentDataReply;
    }

    /**
     * Sets the value of the encryptPaymentDataReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptPaymentDataReply }
     *     
     */
    public void setEncryptPaymentDataReply(EncryptPaymentDataReply value) {
        this.encryptPaymentDataReply = value;
    }

    /**
     * Gets the value of the dmeReply property.
     * 
     * @return
     *     possible object is
     *     {@link DMEReply }
     *     
     */
    public DMEReply getDmeReply() {
        return dmeReply;
    }

    /**
     * Sets the value of the dmeReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMEReply }
     *     
     */
    public void setDmeReply(DMEReply value) {
        this.dmeReply = value;
    }

    /**
     * Gets the value of the afsReply property.
     * 
     * @return
     *     possible object is
     *     {@link AFSReply }
     *     
     */
    public AFSReply getAfsReply() {
        return afsReply;
    }

    /**
     * Sets the value of the afsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSReply }
     *     
     */
    public void setAfsReply(AFSReply value) {
        this.afsReply = value;
    }

    /**
     * Gets the value of the davReply property.
     * 
     * @return
     *     possible object is
     *     {@link DAVReply }
     *     
     */
    public DAVReply getDavReply() {
        return davReply;
    }

    /**
     * Sets the value of the davReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DAVReply }
     *     
     */
    public void setDavReply(DAVReply value) {
        this.davReply = value;
    }

    /**
     * Gets the value of the exportReply property.
     * 
     * @return
     *     possible object is
     *     {@link ExportReply }
     *     
     */
    public ExportReply getExportReply() {
        return exportReply;
    }

    /**
     * Sets the value of the exportReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportReply }
     *     
     */
    public void setExportReply(ExportReply value) {
        this.exportReply = value;
    }

    /**
     * Gets the value of the fxRatesReply property.
     * 
     * @return
     *     possible object is
     *     {@link FXRatesReply }
     *     
     */
    public FXRatesReply getFxRatesReply() {
        return fxRatesReply;
    }

    /**
     * Sets the value of the fxRatesReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXRatesReply }
     *     
     */
    public void setFxRatesReply(FXRatesReply value) {
        this.fxRatesReply = value;
    }

    /**
     * Gets the value of the bankTransferReply property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferReply }
     *     
     */
    public BankTransferReply getBankTransferReply() {
        return bankTransferReply;
    }

    /**
     * Sets the value of the bankTransferReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferReply }
     *     
     */
    public void setBankTransferReply(BankTransferReply value) {
        this.bankTransferReply = value;
    }

    /**
     * Gets the value of the bankTransferRefundReply property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRefundReply }
     *     
     */
    public BankTransferRefundReply getBankTransferRefundReply() {
        return bankTransferRefundReply;
    }

    /**
     * Sets the value of the bankTransferRefundReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRefundReply }
     *     
     */
    public void setBankTransferRefundReply(BankTransferRefundReply value) {
        this.bankTransferRefundReply = value;
    }

    /**
     * Gets the value of the bankTransferRealTimeReply property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRealTimeReply }
     *     
     */
    public BankTransferRealTimeReply getBankTransferRealTimeReply() {
        return bankTransferRealTimeReply;
    }

    /**
     * Sets the value of the bankTransferRealTimeReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRealTimeReply }
     *     
     */
    public void setBankTransferRealTimeReply(BankTransferRealTimeReply value) {
        this.bankTransferRealTimeReply = value;
    }

    /**
     * Gets the value of the directDebitMandateReply property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateReply }
     *     
     */
    public DirectDebitMandateReply getDirectDebitMandateReply() {
        return directDebitMandateReply;
    }

    /**
     * Sets the value of the directDebitMandateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateReply }
     *     
     */
    public void setDirectDebitMandateReply(DirectDebitMandateReply value) {
        this.directDebitMandateReply = value;
    }

    /**
     * Gets the value of the directDebitReply property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitReply }
     *     
     */
    public DirectDebitReply getDirectDebitReply() {
        return directDebitReply;
    }

    /**
     * Sets the value of the directDebitReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitReply }
     *     
     */
    public void setDirectDebitReply(DirectDebitReply value) {
        this.directDebitReply = value;
    }

    /**
     * Gets the value of the directDebitValidateReply property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitValidateReply }
     *     
     */
    public DirectDebitValidateReply getDirectDebitValidateReply() {
        return directDebitValidateReply;
    }

    /**
     * Sets the value of the directDebitValidateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitValidateReply }
     *     
     */
    public void setDirectDebitValidateReply(DirectDebitValidateReply value) {
        this.directDebitValidateReply = value;
    }

    /**
     * Gets the value of the directDebitRefundReply property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitRefundReply }
     *     
     */
    public DirectDebitRefundReply getDirectDebitRefundReply() {
        return directDebitRefundReply;
    }

    /**
     * Sets the value of the directDebitRefundReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitRefundReply }
     *     
     */
    public void setDirectDebitRefundReply(DirectDebitRefundReply value) {
        this.directDebitRefundReply = value;
    }

    /**
     * Gets the value of the paySubscriptionCreateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionCreateReply }
     *     
     */
    public PaySubscriptionCreateReply getPaySubscriptionCreateReply() {
        return paySubscriptionCreateReply;
    }

    /**
     * Sets the value of the paySubscriptionCreateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionCreateReply }
     *     
     */
    public void setPaySubscriptionCreateReply(PaySubscriptionCreateReply value) {
        this.paySubscriptionCreateReply = value;
    }

    /**
     * Gets the value of the paySubscriptionUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionUpdateReply }
     *     
     */
    public PaySubscriptionUpdateReply getPaySubscriptionUpdateReply() {
        return paySubscriptionUpdateReply;
    }

    /**
     * Sets the value of the paySubscriptionUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionUpdateReply }
     *     
     */
    public void setPaySubscriptionUpdateReply(PaySubscriptionUpdateReply value) {
        this.paySubscriptionUpdateReply = value;
    }

    /**
     * Gets the value of the paySubscriptionEventUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEventUpdateReply }
     *     
     */
    public PaySubscriptionEventUpdateReply getPaySubscriptionEventUpdateReply() {
        return paySubscriptionEventUpdateReply;
    }

    /**
     * Sets the value of the paySubscriptionEventUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEventUpdateReply }
     *     
     */
    public void setPaySubscriptionEventUpdateReply(PaySubscriptionEventUpdateReply value) {
        this.paySubscriptionEventUpdateReply = value;
    }

    /**
     * Gets the value of the paySubscriptionRetrieveReply property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionRetrieveReply }
     *     
     */
    public PaySubscriptionRetrieveReply getPaySubscriptionRetrieveReply() {
        return paySubscriptionRetrieveReply;
    }

    /**
     * Sets the value of the paySubscriptionRetrieveReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionRetrieveReply }
     *     
     */
    public void setPaySubscriptionRetrieveReply(PaySubscriptionRetrieveReply value) {
        this.paySubscriptionRetrieveReply = value;
    }

    /**
     * Gets the value of the paySubscriptionDeleteReply property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionDeleteReply }
     *     
     */
    public PaySubscriptionDeleteReply getPaySubscriptionDeleteReply() {
        return paySubscriptionDeleteReply;
    }

    /**
     * Sets the value of the paySubscriptionDeleteReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionDeleteReply }
     *     
     */
    public void setPaySubscriptionDeleteReply(PaySubscriptionDeleteReply value) {
        this.paySubscriptionDeleteReply = value;
    }

    /**
     * Gets the value of the payPalPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPaymentReply }
     *     
     */
    public PayPalPaymentReply getPayPalPaymentReply() {
        return payPalPaymentReply;
    }

    /**
     * Sets the value of the payPalPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPaymentReply }
     *     
     */
    public void setPayPalPaymentReply(PayPalPaymentReply value) {
        this.payPalPaymentReply = value;
    }

    /**
     * Gets the value of the payPalCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreditReply }
     *     
     */
    public PayPalCreditReply getPayPalCreditReply() {
        return payPalCreditReply;
    }

    /**
     * Sets the value of the payPalCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreditReply }
     *     
     */
    public void setPayPalCreditReply(PayPalCreditReply value) {
        this.payPalCreditReply = value;
    }

    /**
     * Gets the value of the voidReply property.
     * 
     * @return
     *     possible object is
     *     {@link VoidReply }
     *     
     */
    public VoidReply getVoidReply() {
        return voidReply;
    }

    /**
     * Sets the value of the voidReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidReply }
     *     
     */
    public void setVoidReply(VoidReply value) {
        this.voidReply = value;
    }

    /**
     * Gets the value of the pinlessDebitReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReply }
     *     
     */
    public PinlessDebitReply getPinlessDebitReply() {
        return pinlessDebitReply;
    }

    /**
     * Sets the value of the pinlessDebitReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReply }
     *     
     */
    public void setPinlessDebitReply(PinlessDebitReply value) {
        this.pinlessDebitReply = value;
    }

    /**
     * Gets the value of the pinlessDebitValidateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitValidateReply }
     *     
     */
    public PinlessDebitValidateReply getPinlessDebitValidateReply() {
        return pinlessDebitValidateReply;
    }

    /**
     * Sets the value of the pinlessDebitValidateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitValidateReply }
     *     
     */
    public void setPinlessDebitValidateReply(PinlessDebitValidateReply value) {
        this.pinlessDebitValidateReply = value;
    }

    /**
     * Gets the value of the pinlessDebitReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReversalReply }
     *     
     */
    public PinlessDebitReversalReply getPinlessDebitReversalReply() {
        return pinlessDebitReversalReply;
    }

    /**
     * Sets the value of the pinlessDebitReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReversalReply }
     *     
     */
    public void setPinlessDebitReversalReply(PinlessDebitReversalReply value) {
        this.pinlessDebitReversalReply = value;
    }

    /**
     * Gets the value of the payPalButtonCreateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalButtonCreateReply }
     *     
     */
    public PayPalButtonCreateReply getPayPalButtonCreateReply() {
        return payPalButtonCreateReply;
    }

    /**
     * Sets the value of the payPalButtonCreateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalButtonCreateReply }
     *     
     */
    public void setPayPalButtonCreateReply(PayPalButtonCreateReply value) {
        this.payPalButtonCreateReply = value;
    }

    /**
     * Gets the value of the payPalPreapprovedPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedPaymentReply }
     *     
     */
    public PayPalPreapprovedPaymentReply getPayPalPreapprovedPaymentReply() {
        return payPalPreapprovedPaymentReply;
    }

    /**
     * Sets the value of the payPalPreapprovedPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedPaymentReply }
     *     
     */
    public void setPayPalPreapprovedPaymentReply(PayPalPreapprovedPaymentReply value) {
        this.payPalPreapprovedPaymentReply = value;
    }

    /**
     * Gets the value of the payPalPreapprovedUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedUpdateReply }
     *     
     */
    public PayPalPreapprovedUpdateReply getPayPalPreapprovedUpdateReply() {
        return payPalPreapprovedUpdateReply;
    }

    /**
     * Sets the value of the payPalPreapprovedUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedUpdateReply }
     *     
     */
    public void setPayPalPreapprovedUpdateReply(PayPalPreapprovedUpdateReply value) {
        this.payPalPreapprovedUpdateReply = value;
    }

    /**
     * Gets the value of the riskUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link RiskUpdateReply }
     *     
     */
    public RiskUpdateReply getRiskUpdateReply() {
        return riskUpdateReply;
    }

    /**
     * Sets the value of the riskUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUpdateReply }
     *     
     */
    public void setRiskUpdateReply(RiskUpdateReply value) {
        this.riskUpdateReply = value;
    }

    /**
     * Gets the value of the fraudUpdateReply property.
     * 
     * @return
     *     possible object is
     *     {@link FraudUpdateReply }
     *     
     */
    public FraudUpdateReply getFraudUpdateReply() {
        return fraudUpdateReply;
    }

    /**
     * Sets the value of the fraudUpdateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudUpdateReply }
     *     
     */
    public void setFraudUpdateReply(FraudUpdateReply value) {
        this.fraudUpdateReply = value;
    }

    /**
     * Gets the value of the caseManagementActionReply property.
     * 
     * @return
     *     possible object is
     *     {@link CaseManagementActionReply }
     *     
     */
    public CaseManagementActionReply getCaseManagementActionReply() {
        return caseManagementActionReply;
    }

    /**
     * Sets the value of the caseManagementActionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseManagementActionReply }
     *     
     */
    public void setCaseManagementActionReply(CaseManagementActionReply value) {
        this.caseManagementActionReply = value;
    }

    /**
     * Gets the value of the decisionReply property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionReply }
     *     
     */
    public DecisionReply getDecisionReply() {
        return decisionReply;
    }

    /**
     * Sets the value of the decisionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionReply }
     *     
     */
    public void setDecisionReply(DecisionReply value) {
        this.decisionReply = value;
    }

    /**
     * Gets the value of the payPalRefundReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRefundReply }
     *     
     */
    public PayPalRefundReply getPayPalRefundReply() {
        return payPalRefundReply;
    }

    /**
     * Sets the value of the payPalRefundReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRefundReply }
     *     
     */
    public void setPayPalRefundReply(PayPalRefundReply value) {
        this.payPalRefundReply = value;
    }

    /**
     * Gets the value of the payPalAuthReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthReversalReply }
     *     
     */
    public PayPalAuthReversalReply getPayPalAuthReversalReply() {
        return payPalAuthReversalReply;
    }

    /**
     * Sets the value of the payPalAuthReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthReversalReply }
     *     
     */
    public void setPayPalAuthReversalReply(PayPalAuthReversalReply value) {
        this.payPalAuthReversalReply = value;
    }

    /**
     * Gets the value of the payPalDoCaptureReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoCaptureReply }
     *     
     */
    public PayPalDoCaptureReply getPayPalDoCaptureReply() {
        return payPalDoCaptureReply;
    }

    /**
     * Sets the value of the payPalDoCaptureReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoCaptureReply }
     *     
     */
    public void setPayPalDoCaptureReply(PayPalDoCaptureReply value) {
        this.payPalDoCaptureReply = value;
    }

    /**
     * Gets the value of the payPalEcDoPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcDoPaymentReply }
     *     
     */
    public PayPalEcDoPaymentReply getPayPalEcDoPaymentReply() {
        return payPalEcDoPaymentReply;
    }

    /**
     * Sets the value of the payPalEcDoPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcDoPaymentReply }
     *     
     */
    public void setPayPalEcDoPaymentReply(PayPalEcDoPaymentReply value) {
        this.payPalEcDoPaymentReply = value;
    }

    /**
     * Gets the value of the payPalEcGetDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcGetDetailsReply }
     *     
     */
    public PayPalEcGetDetailsReply getPayPalEcGetDetailsReply() {
        return payPalEcGetDetailsReply;
    }

    /**
     * Sets the value of the payPalEcGetDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcGetDetailsReply }
     *     
     */
    public void setPayPalEcGetDetailsReply(PayPalEcGetDetailsReply value) {
        this.payPalEcGetDetailsReply = value;
    }

    /**
     * Gets the value of the payPalEcSetReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcSetReply }
     *     
     */
    public PayPalEcSetReply getPayPalEcSetReply() {
        return payPalEcSetReply;
    }

    /**
     * Sets the value of the payPalEcSetReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcSetReply }
     *     
     */
    public void setPayPalEcSetReply(PayPalEcSetReply value) {
        this.payPalEcSetReply = value;
    }

    /**
     * Gets the value of the payPalAuthorizationReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthorizationReply }
     *     
     */
    public PayPalAuthorizationReply getPayPalAuthorizationReply() {
        return payPalAuthorizationReply;
    }

    /**
     * Sets the value of the payPalAuthorizationReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthorizationReply }
     *     
     */
    public void setPayPalAuthorizationReply(PayPalAuthorizationReply value) {
        this.payPalAuthorizationReply = value;
    }

    /**
     * Gets the value of the payPalEcOrderSetupReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcOrderSetupReply }
     *     
     */
    public PayPalEcOrderSetupReply getPayPalEcOrderSetupReply() {
        return payPalEcOrderSetupReply;
    }

    /**
     * Sets the value of the payPalEcOrderSetupReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcOrderSetupReply }
     *     
     */
    public void setPayPalEcOrderSetupReply(PayPalEcOrderSetupReply value) {
        this.payPalEcOrderSetupReply = value;
    }

    /**
     * Gets the value of the payPalUpdateAgreementReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUpdateAgreementReply }
     *     
     */
    public PayPalUpdateAgreementReply getPayPalUpdateAgreementReply() {
        return payPalUpdateAgreementReply;
    }

    /**
     * Sets the value of the payPalUpdateAgreementReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUpdateAgreementReply }
     *     
     */
    public void setPayPalUpdateAgreementReply(PayPalUpdateAgreementReply value) {
        this.payPalUpdateAgreementReply = value;
    }

    /**
     * Gets the value of the payPalCreateAgreementReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreateAgreementReply }
     *     
     */
    public PayPalCreateAgreementReply getPayPalCreateAgreementReply() {
        return payPalCreateAgreementReply;
    }

    /**
     * Sets the value of the payPalCreateAgreementReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreateAgreementReply }
     *     
     */
    public void setPayPalCreateAgreementReply(PayPalCreateAgreementReply value) {
        this.payPalCreateAgreementReply = value;
    }

    /**
     * Gets the value of the payPalDoRefTransactionReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoRefTransactionReply }
     *     
     */
    public PayPalDoRefTransactionReply getPayPalDoRefTransactionReply() {
        return payPalDoRefTransactionReply;
    }

    /**
     * Sets the value of the payPalDoRefTransactionReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoRefTransactionReply }
     *     
     */
    public void setPayPalDoRefTransactionReply(PayPalDoRefTransactionReply value) {
        this.payPalDoRefTransactionReply = value;
    }

    /**
     * Gets the value of the chinaPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaPaymentReply }
     *     
     */
    public ChinaPaymentReply getChinaPaymentReply() {
        return chinaPaymentReply;
    }

    /**
     * Sets the value of the chinaPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaPaymentReply }
     *     
     */
    public void setChinaPaymentReply(ChinaPaymentReply value) {
        this.chinaPaymentReply = value;
    }

    /**
     * Gets the value of the chinaRefundReply property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaRefundReply }
     *     
     */
    public ChinaRefundReply getChinaRefundReply() {
        return chinaRefundReply;
    }

    /**
     * Sets the value of the chinaRefundReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaRefundReply }
     *     
     */
    public void setChinaRefundReply(ChinaRefundReply value) {
        this.chinaRefundReply = value;
    }

    /**
     * Gets the value of the boletoPaymentReply property.
     * 
     * @return
     *     possible object is
     *     {@link BoletoPaymentReply }
     *     
     */
    public BoletoPaymentReply getBoletoPaymentReply() {
        return boletoPaymentReply;
    }

    /**
     * Sets the value of the boletoPaymentReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletoPaymentReply }
     *     
     */
    public void setBoletoPaymentReply(BoletoPaymentReply value) {
        this.boletoPaymentReply = value;
    }

    /**
     * Gets the value of the pinDebitPurchaseReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public PinDebitPurchaseReply getPinDebitPurchaseReply() {
        return pinDebitPurchaseReply;
    }

    /**
     * Sets the value of the pinDebitPurchaseReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public void setPinDebitPurchaseReply(PinDebitPurchaseReply value) {
        this.pinDebitPurchaseReply = value;
    }

    /**
     * Gets the value of the pinDebitCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public PinDebitCreditReply getPinDebitCreditReply() {
        return pinDebitCreditReply;
    }

    /**
     * Sets the value of the pinDebitCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public void setPinDebitCreditReply(PinDebitCreditReply value) {
        this.pinDebitCreditReply = value;
    }

    /**
     * Gets the value of the pinDebitReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public PinDebitReversalReply getPinDebitReversalReply() {
        return pinDebitReversalReply;
    }

    /**
     * Sets the value of the pinDebitReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public void setPinDebitReversalReply(PinDebitReversalReply value) {
        this.pinDebitReversalReply = value;
    }

    /**
     * Gets the value of the apInitiateReply property.
     * 
     * @return
     *     possible object is
     *     {@link APInitiateReply }
     *     
     */
    public APInitiateReply getApInitiateReply() {
        return apInitiateReply;
    }

    /**
     * Sets the value of the apInitiateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APInitiateReply }
     *     
     */
    public void setApInitiateReply(APInitiateReply value) {
        this.apInitiateReply = value;
    }

    /**
     * Gets the value of the apCheckStatusReply property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckStatusReply }
     *     
     */
    public APCheckStatusReply getApCheckStatusReply() {
        return apCheckStatusReply;
    }

    /**
     * Sets the value of the apCheckStatusReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckStatusReply }
     *     
     */
    public void setApCheckStatusReply(APCheckStatusReply value) {
        this.apCheckStatusReply = value;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the solutionProviderTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionProviderTransactionID() {
        return solutionProviderTransactionID;
    }

    /**
     * Sets the value of the solutionProviderTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionProviderTransactionID(String value) {
        this.solutionProviderTransactionID = value;
    }

    /**
     * Gets the value of the apReply property.
     * 
     * @return
     *     possible object is
     *     {@link APReply }
     *     
     */
    public APReply getApReply() {
        return apReply;
    }

    /**
     * Sets the value of the apReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APReply }
     *     
     */
    public void setApReply(APReply value) {
        this.apReply = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipTo }
     *     
     */
    public ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipTo }
     *     
     */
    public void setShipTo(ShipTo value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link BillTo }
     *     
     */
    public BillTo getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTo }
     *     
     */
    public void setBillTo(BillTo value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the apAuthReply property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReply }
     *     
     */
    public APAuthReply getApAuthReply() {
        return apAuthReply;
    }

    /**
     * Sets the value of the apAuthReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReply }
     *     
     */
    public void setApAuthReply(APAuthReply value) {
        this.apAuthReply = value;
    }

    /**
     * Gets the value of the apSessionsReply property.
     * 
     * @return
     *     possible object is
     *     {@link APSessionsReply }
     *     
     */
    public APSessionsReply getApSessionsReply() {
        return apSessionsReply;
    }

    /**
     * Sets the value of the apSessionsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSessionsReply }
     *     
     */
    public void setApSessionsReply(APSessionsReply value) {
        this.apSessionsReply = value;
    }

    /**
     * Gets the value of the apAuthReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReversalReply }
     *     
     */
    public APAuthReversalReply getApAuthReversalReply() {
        return apAuthReversalReply;
    }

    /**
     * Sets the value of the apAuthReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReversalReply }
     *     
     */
    public void setApAuthReversalReply(APAuthReversalReply value) {
        this.apAuthReversalReply = value;
    }

    /**
     * Gets the value of the apCaptureReply property.
     * 
     * @return
     *     possible object is
     *     {@link APCaptureReply }
     *     
     */
    public APCaptureReply getApCaptureReply() {
        return apCaptureReply;
    }

    /**
     * Sets the value of the apCaptureReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCaptureReply }
     *     
     */
    public void setApCaptureReply(APCaptureReply value) {
        this.apCaptureReply = value;
    }

    /**
     * Gets the value of the apOptionsReply property.
     * 
     * @return
     *     possible object is
     *     {@link APOptionsReply }
     *     
     */
    public APOptionsReply getApOptionsReply() {
        return apOptionsReply;
    }

    /**
     * Sets the value of the apOptionsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOptionsReply }
     *     
     */
    public void setApOptionsReply(APOptionsReply value) {
        this.apOptionsReply = value;
    }

    /**
     * Gets the value of the apRefundReply property.
     * 
     * @return
     *     possible object is
     *     {@link APRefundReply }
     *     
     */
    public APRefundReply getApRefundReply() {
        return apRefundReply;
    }

    /**
     * Sets the value of the apRefundReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APRefundReply }
     *     
     */
    public void setApRefundReply(APRefundReply value) {
        this.apRefundReply = value;
    }

    /**
     * Gets the value of the apSaleReply property.
     * 
     * @return
     *     possible object is
     *     {@link APSaleReply }
     *     
     */
    public APSaleReply getApSaleReply() {
        return apSaleReply;
    }

    /**
     * Sets the value of the apSaleReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSaleReply }
     *     
     */
    public void setApSaleReply(APSaleReply value) {
        this.apSaleReply = value;
    }

    /**
     * Gets the value of the apCheckoutDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckOutDetailsReply }
     *     
     */
    public APCheckOutDetailsReply getApCheckoutDetailsReply() {
        return apCheckoutDetailsReply;
    }

    /**
     * Sets the value of the apCheckoutDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckOutDetailsReply }
     *     
     */
    public void setApCheckoutDetailsReply(APCheckOutDetailsReply value) {
        this.apCheckoutDetailsReply = value;
    }

    /**
     * Gets the value of the apTransactionDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link APTransactionDetailsReply }
     *     
     */
    public APTransactionDetailsReply getApTransactionDetailsReply() {
        return apTransactionDetailsReply;
    }

    /**
     * Sets the value of the apTransactionDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APTransactionDetailsReply }
     *     
     */
    public void setApTransactionDetailsReply(APTransactionDetailsReply value) {
        this.apTransactionDetailsReply = value;
    }

    /**
     * Gets the value of the apConfirmPurchaseReply property.
     * 
     * @return
     *     possible object is
     *     {@link APConfirmPurchaseReply }
     *     
     */
    public APConfirmPurchaseReply getApConfirmPurchaseReply() {
        return apConfirmPurchaseReply;
    }

    /**
     * Sets the value of the apConfirmPurchaseReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APConfirmPurchaseReply }
     *     
     */
    public void setApConfirmPurchaseReply(APConfirmPurchaseReply value) {
        this.apConfirmPurchaseReply = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the promotionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionGroupReply }
     * 
     * 
     */
    public List<PromotionGroupReply> getPromotionGroup() {
        if (promotionGroup == null) {
            promotionGroup = new ArrayList<PromotionGroupReply>();
        }
        return this.promotionGroup;
    }

    /**
     * Gets the value of the payPalGetTxnDetailsReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalGetTxnDetailsReply }
     *     
     */
    public PayPalGetTxnDetailsReply getPayPalGetTxnDetailsReply() {
        return payPalGetTxnDetailsReply;
    }

    /**
     * Sets the value of the payPalGetTxnDetailsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalGetTxnDetailsReply }
     *     
     */
    public void setPayPalGetTxnDetailsReply(PayPalGetTxnDetailsReply value) {
        this.payPalGetTxnDetailsReply = value;
    }

    /**
     * Gets the value of the payPalTransactionSearchReply property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalTransactionSearchReply }
     *     
     */
    public PayPalTransactionSearchReply getPayPalTransactionSearchReply() {
        return payPalTransactionSearchReply;
    }

    /**
     * Sets the value of the payPalTransactionSearchReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalTransactionSearchReply }
     *     
     */
    public void setPayPalTransactionSearchReply(PayPalTransactionSearchReply value) {
        this.payPalTransactionSearchReply = value;
    }

    /**
     * Gets the value of the emvReply property.
     * 
     * @return
     *     possible object is
     *     {@link EmvReply }
     *     
     */
    public EmvReply getEmvReply() {
        return emvReply;
    }

    /**
     * Sets the value of the emvReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvReply }
     *     
     */
    public void setEmvReply(EmvReply value) {
        this.emvReply = value;
    }

    /**
     * Gets the value of the originalTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransaction }
     *     
     */
    public OriginalTransaction getOriginalTransaction() {
        return originalTransaction;
    }

    /**
     * Sets the value of the originalTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransaction }
     *     
     */
    public void setOriginalTransaction(OriginalTransaction value) {
        this.originalTransaction = value;
    }

    /**
     * Gets the value of the hostedDataCreateReply property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataCreateReply }
     *     
     */
    public HostedDataCreateReply getHostedDataCreateReply() {
        return hostedDataCreateReply;
    }

    /**
     * Sets the value of the hostedDataCreateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataCreateReply }
     *     
     */
    public void setHostedDataCreateReply(HostedDataCreateReply value) {
        this.hostedDataCreateReply = value;
    }

    /**
     * Gets the value of the hostedDataRetrieveReply property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataRetrieveReply }
     *     
     */
    public HostedDataRetrieveReply getHostedDataRetrieveReply() {
        return hostedDataRetrieveReply;
    }

    /**
     * Sets the value of the hostedDataRetrieveReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataRetrieveReply }
     *     
     */
    public void setHostedDataRetrieveReply(HostedDataRetrieveReply value) {
        this.hostedDataRetrieveReply = value;
    }

    /**
     * Gets the value of the salesSlipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSlipNumber() {
        return salesSlipNumber;
    }

    /**
     * Sets the value of the salesSlipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSlipNumber(String value) {
        this.salesSlipNumber = value;
    }

    /**
     * Gets the value of the additionalProcessorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalProcessorResponse() {
        return additionalProcessorResponse;
    }

    /**
     * Sets the value of the additionalProcessorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalProcessorResponse(String value) {
        this.additionalProcessorResponse = value;
    }

    /**
     * Gets the value of the jpo property.
     * 
     * @return
     *     possible object is
     *     {@link JPO }
     *     
     */
    public JPO getJpo() {
        return jpo;
    }

    /**
     * Sets the value of the jpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPO }
     *     
     */
    public void setJpo(JPO value) {
        this.jpo = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the paymentNetworkToken property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }

    /**
     * Sets the value of the paymentNetworkToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public void setPaymentNetworkToken(PaymentNetworkToken value) {
        this.paymentNetworkToken = value;
    }

    /**
     * Gets the value of the vcReply property.
     * 
     * @return
     *     possible object is
     *     {@link VCReply }
     *     
     */
    public VCReply getVcReply() {
        return vcReply;
    }

    /**
     * Sets the value of the vcReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCReply }
     *     
     */
    public void setVcReply(VCReply value) {
        this.vcReply = value;
    }

    /**
     * Gets the value of the decryptVisaCheckoutDataReply property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptVisaCheckoutDataReply }
     *     
     */
    public DecryptVisaCheckoutDataReply getDecryptVisaCheckoutDataReply() {
        return decryptVisaCheckoutDataReply;
    }

    /**
     * Sets the value of the decryptVisaCheckoutDataReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptVisaCheckoutDataReply }
     *     
     */
    public void setDecryptVisaCheckoutDataReply(DecryptVisaCheckoutDataReply value) {
        this.decryptVisaCheckoutDataReply = value;
    }

    /**
     * Gets the value of the getVisaCheckoutDataReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetVisaCheckoutDataReply }
     *     
     */
    public GetVisaCheckoutDataReply getGetVisaCheckoutDataReply() {
        return getVisaCheckoutDataReply;
    }

    /**
     * Sets the value of the getVisaCheckoutDataReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVisaCheckoutDataReply }
     *     
     */
    public void setGetVisaCheckoutDataReply(GetVisaCheckoutDataReply value) {
        this.getVisaCheckoutDataReply = value;
    }

    /**
     * Gets the value of the binLookupReply property.
     * 
     * @return
     *     possible object is
     *     {@link BinLookupReply }
     *     
     */
    public BinLookupReply getBinLookupReply() {
        return binLookupReply;
    }

    /**
     * Sets the value of the binLookupReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinLookupReply }
     *     
     */
    public void setBinLookupReply(BinLookupReply value) {
        this.binLookupReply = value;
    }

    /**
     * Gets the value of the issuerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerMessage() {
        return issuerMessage;
    }

    /**
     * Sets the value of the issuerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerMessage(String value) {
        this.issuerMessage = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setToken(Token value) {
        this.token = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setIssuer(Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient }
     *     
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient }
     *     
     */
    public void setRecipient(Recipient value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the feeProgramIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }

    /**
     * Sets the value of the feeProgramIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProgramIndicator(String value) {
        this.feeProgramIndicator = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link Installment }
     *     
     */
    public Installment getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Installment }
     *     
     */
    public void setInstallment(Installment value) {
        this.installment = value;
    }

    /**
     * Gets the value of the paymentAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Sets the value of the paymentAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
    }

    /**
     * Gets the value of the authIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIndicator() {
        return authIndicator;
    }

    /**
     * Sets the value of the authIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIndicator(String value) {
        this.authIndicator = value;
    }

    /**
     * Gets the value of the ucaf property.
     * 
     * @return
     *     possible object is
     *     {@link UCAF }
     *     
     */
    public UCAF getUcaf() {
        return ucaf;
    }

    /**
     * Sets the value of the ucaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAF }
     *     
     */
    public void setUcaf(UCAF value) {
        this.ucaf = value;
    }

    /**
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setInvoiceHeader(InvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the apOrderReply property.
     * 
     * @return
     *     possible object is
     *     {@link APOrderReply }
     *     
     */
    public APOrderReply getApOrderReply() {
        return apOrderReply;
    }

    /**
     * Sets the value of the apOrderReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOrderReply }
     *     
     */
    public void setApOrderReply(APOrderReply value) {
        this.apOrderReply = value;
    }

    /**
     * Gets the value of the apCancelReply property.
     * 
     * @return
     *     possible object is
     *     {@link APCancelReply }
     *     
     */
    public APCancelReply getApCancelReply() {
        return apCancelReply;
    }

    /**
     * Sets the value of the apCancelReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCancelReply }
     *     
     */
    public void setApCancelReply(APCancelReply value) {
        this.apCancelReply = value;
    }

    /**
     * Gets the value of the apBillingAgreementReply property.
     * 
     * @return
     *     possible object is
     *     {@link APBillingAgreementReply }
     *     
     */
    public APBillingAgreementReply getApBillingAgreementReply() {
        return apBillingAgreementReply;
    }

    /**
     * Sets the value of the apBillingAgreementReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link APBillingAgreementReply }
     *     
     */
    public void setApBillingAgreementReply(APBillingAgreementReply value) {
        this.apBillingAgreementReply = value;
    }

    /**
     * Gets the value of the customerVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerVerificationStatus() {
        return customerVerificationStatus;
    }

    /**
     * Sets the value of the customerVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerVerificationStatus(String value) {
        this.customerVerificationStatus = value;
    }

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalID }
     *     
     */
    public PersonalID getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalID }
     *     
     */
    public void setPersonalID(PersonalID value) {
        this.personalID = value;
    }

    /**
     * Gets the value of the acquirerMerchantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerMerchantNumber() {
        return acquirerMerchantNumber;
    }

    /**
     * Sets the value of the acquirerMerchantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerMerchantNumber(String value) {
        this.acquirerMerchantNumber = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setPos(Pos value) {
        this.pos = value;
    }

    /**
     * Gets the value of the issuerMessageAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerMessageAction() {
        return issuerMessageAction;
    }

    /**
     * Sets the value of the issuerMessageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerMessageAction(String value) {
        this.issuerMessageAction = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyReserved }
     *     
     */
    public ReplyReserved getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyReserved }
     *     
     */
    public void setReserved(ReplyReserved value) {
        this.reserved = value;
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
