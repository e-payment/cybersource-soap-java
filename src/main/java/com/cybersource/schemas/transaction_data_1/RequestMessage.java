
package com.cybersource.schemas.transaction_data_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="clientLibrary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientSecurityLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientApplicationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceHeader" type="{urn:schemas-cybersource-com:transaction-data-1.141}InvoiceHeader" minOccurs="0"/&gt;
 *         &lt;element name="aggregatorMerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billTo" type="{urn:schemas-cybersource-com:transaction-data-1.141}BillTo" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{urn:schemas-cybersource-com:transaction-data-1.141}ShipTo" minOccurs="0"/&gt;
 *         &lt;element name="personalID" type="{urn:schemas-cybersource-com:transaction-data-1.141}PersonalID" minOccurs="0"/&gt;
 *         &lt;element name="shipFrom" type="{urn:schemas-cybersource-com:transaction-data-1.141}ShipFrom" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.141}Item" maxOccurs="1000" minOccurs="0"/&gt;
 *         &lt;element name="purchaseTotals" type="{urn:schemas-cybersource-com:transaction-data-1.141}PurchaseTotals" minOccurs="0"/&gt;
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.141}FundingTotals" minOccurs="0"/&gt;
 *         &lt;element name="dcc" type="{urn:schemas-cybersource-com:transaction-data-1.141}DCC" minOccurs="0"/&gt;
 *         &lt;element name="pos" type="{urn:schemas-cybersource-com:transaction-data-1.141}Pos" minOccurs="0"/&gt;
 *         &lt;element name="pin" type="{urn:schemas-cybersource-com:transaction-data-1.141}Pin" minOccurs="0"/&gt;
 *         &lt;element name="encryptedPayment" type="{urn:schemas-cybersource-com:transaction-data-1.141}EncryptedPayment" minOccurs="0"/&gt;
 *         &lt;element name="installment" type="{urn:schemas-cybersource-com:transaction-data-1.141}Installment" minOccurs="0"/&gt;
 *         &lt;element name="card" type="{urn:schemas-cybersource-com:transaction-data-1.141}Card" minOccurs="0"/&gt;
 *         &lt;element name="check" type="{urn:schemas-cybersource-com:transaction-data-1.141}Check" minOccurs="0"/&gt;
 *         &lt;element name="bml" type="{urn:schemas-cybersource-com:transaction-data-1.141}BML" minOccurs="0"/&gt;
 *         &lt;element name="gecc" type="{urn:schemas-cybersource-com:transaction-data-1.141}GECC" minOccurs="0"/&gt;
 *         &lt;element name="ucaf" type="{urn:schemas-cybersource-com:transaction-data-1.141}UCAF" minOccurs="0"/&gt;
 *         &lt;element name="fundTransfer" type="{urn:schemas-cybersource-com:transaction-data-1.141}FundTransfer" minOccurs="0"/&gt;
 *         &lt;element name="bankInfo" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankInfo" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{urn:schemas-cybersource-com:transaction-data-1.141}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="recurringSubscriptionInfo" type="{urn:schemas-cybersource-com:transaction-data-1.141}RecurringSubscriptionInfo" minOccurs="0"/&gt;
 *         &lt;element name="decisionManager" type="{urn:schemas-cybersource-com:transaction-data-1.141}DecisionManager" minOccurs="0"/&gt;
 *         &lt;element name="otherTax" type="{urn:schemas-cybersource-com:transaction-data-1.141}OtherTax" minOccurs="0"/&gt;
 *         &lt;element name="paypal" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPal" minOccurs="0"/&gt;
 *         &lt;element name="merchantDefinedData" type="{urn:schemas-cybersource-com:transaction-data-1.141}MerchantDefinedData" minOccurs="0"/&gt;
 *         &lt;element name="merchantSecureData" type="{urn:schemas-cybersource-com:transaction-data-1.141}MerchantSecureData" minOccurs="0"/&gt;
 *         &lt;element name="jpo" type="{urn:schemas-cybersource-com:transaction-data-1.141}JPO" minOccurs="0"/&gt;
 *         &lt;element name="orderRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkToRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceFee" type="{urn:schemas-cybersource-com:transaction-data-1.141}ServiceFee" minOccurs="0"/&gt;
 *         &lt;element name="ccAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAuthService" minOccurs="0"/&gt;
 *         &lt;element name="octService" type="{urn:schemas-cybersource-com:transaction-data-1.141}OCTService" minOccurs="0"/&gt;
 *         &lt;element name="verificationService" type="{urn:schemas-cybersource-com:transaction-data-1.141}VerificationService" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleService" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleCreditService" minOccurs="0"/&gt;
 *         &lt;element name="ccSaleReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCSaleReversalService" minOccurs="0"/&gt;
 *         &lt;element name="ccIncrementalAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCIncrementalAuthService" minOccurs="0"/&gt;
 *         &lt;element name="ccCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCCaptureService" minOccurs="0"/&gt;
 *         &lt;element name="ccCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCCreditService" minOccurs="0"/&gt;
 *         &lt;element name="ccAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAuthReversalService" minOccurs="0"/&gt;
 *         &lt;element name="ccAutoAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCAutoAuthReversalService" minOccurs="0"/&gt;
 *         &lt;element name="ccDCCService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCDCCService" minOccurs="0"/&gt;
 *         &lt;element name="serviceFeeCalculateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ServiceFeeCalculateService" minOccurs="0"/&gt;
 *         &lt;element name="ecDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECDebitService" minOccurs="0"/&gt;
 *         &lt;element name="ecCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECCreditService" minOccurs="0"/&gt;
 *         &lt;element name="ecAuthenticateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ECAuthenticateService" minOccurs="0"/&gt;
 *         &lt;element name="payerAuthEnrollService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayerAuthEnrollService" minOccurs="0"/&gt;
 *         &lt;element name="payerAuthValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayerAuthValidateService" minOccurs="0"/&gt;
 *         &lt;element name="taxService" type="{urn:schemas-cybersource-com:transaction-data-1.141}TaxService" minOccurs="0"/&gt;
 *         &lt;element name="dmeService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DMEService" minOccurs="0"/&gt;
 *         &lt;element name="afsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}AFSService" minOccurs="0"/&gt;
 *         &lt;element name="davService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DAVService" minOccurs="0"/&gt;
 *         &lt;element name="exportService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ExportService" minOccurs="0"/&gt;
 *         &lt;element name="fxRatesService" type="{urn:schemas-cybersource-com:transaction-data-1.141}FXRatesService" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferService" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferService" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferRefundService" minOccurs="0"/&gt;
 *         &lt;element name="bankTransferRealTimeService" type="{urn:schemas-cybersource-com:transaction-data-1.141}BankTransferRealTimeService" minOccurs="0"/&gt;
 *         &lt;element name="directDebitMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitMandateService" minOccurs="0"/&gt;
 *         &lt;element name="directDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitService" minOccurs="0"/&gt;
 *         &lt;element name="directDebitRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitRefundService" minOccurs="0"/&gt;
 *         &lt;element name="directDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DirectDebitValidateService" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionCreateService" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionEventUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionEventUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionRetrieveService" minOccurs="0"/&gt;
 *         &lt;element name="paySubscriptionDeleteService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaySubscriptionDeleteService" minOccurs="0"/&gt;
 *         &lt;element name="payPalPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPaymentService" minOccurs="0"/&gt;
 *         &lt;element name="payPalCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalCreditService" minOccurs="0"/&gt;
 *         &lt;element name="voidService" type="{urn:schemas-cybersource-com:transaction-data-1.141}VoidService" minOccurs="0"/&gt;
 *         &lt;element name="businessRules" type="{urn:schemas-cybersource-com:transaction-data-1.141}BusinessRules" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitService" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitValidateService" minOccurs="0"/&gt;
 *         &lt;element name="pinlessDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinlessDebitReversalService" minOccurs="0"/&gt;
 *         &lt;element name="batch" type="{urn:schemas-cybersource-com:transaction-data-1.141}Batch" minOccurs="0"/&gt;
 *         &lt;element name="airlineData" type="{urn:schemas-cybersource-com:transaction-data-1.141}AirlineData" minOccurs="0"/&gt;
 *         &lt;element name="ancillaryData" type="{urn:schemas-cybersource-com:transaction-data-1.141}AncillaryData" minOccurs="0"/&gt;
 *         &lt;element name="lodgingData" type="{urn:schemas-cybersource-com:transaction-data-1.141}LodgingData" minOccurs="0"/&gt;
 *         &lt;element name="payPalButtonCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalButtonCreateService" minOccurs="0"/&gt;
 *         &lt;element name="payPalPreapprovedPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPreapprovedPaymentService" minOccurs="0"/&gt;
 *         &lt;element name="payPalPreapprovedUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalPreapprovedUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="riskUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}RiskUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="fraudUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}FraudUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="caseManagementActionService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CaseManagementActionService" minOccurs="0"/&gt;
 *         &lt;element name="reserved" type="{urn:schemas-cybersource-com:transaction-data-1.141}RequestReserved" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="deviceFingerprintID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceFingerprintRaw" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceFingerprintHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payPalRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalRefundService" minOccurs="0"/&gt;
 *         &lt;element name="payPalAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalAuthReversalService" minOccurs="0"/&gt;
 *         &lt;element name="payPalDoCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalDoCaptureService" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcDoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcDoPaymentService" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcGetDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcGetDetailsService" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcSetService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcSetService" minOccurs="0"/&gt;
 *         &lt;element name="payPalEcOrderSetupService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalEcOrderSetupService" minOccurs="0"/&gt;
 *         &lt;element name="payPalAuthorizationService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalAuthorizationService" minOccurs="0"/&gt;
 *         &lt;element name="payPalUpdateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalUpdateAgreementService" minOccurs="0"/&gt;
 *         &lt;element name="payPalCreateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalCreateAgreementService" minOccurs="0"/&gt;
 *         &lt;element name="payPalDoRefTransactionService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalDoRefTransactionService" minOccurs="0"/&gt;
 *         &lt;element name="chinaPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ChinaPaymentService" minOccurs="0"/&gt;
 *         &lt;element name="chinaRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.141}ChinaRefundService" minOccurs="0"/&gt;
 *         &lt;element name="boletoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.141}BoletoPaymentService" minOccurs="0"/&gt;
 *         &lt;element name="apPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apInitiateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APInitiateService" minOccurs="0"/&gt;
 *         &lt;element name="apCheckStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCheckStatusService" minOccurs="0"/&gt;
 *         &lt;element name="ignoreCardExpiration" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reportGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyCertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionLocalDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.141}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="solutionProviderTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surchargeAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="surchargeSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pinDataEncryptedPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pinDataKeySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cashbackAmount" type="{urn:schemas-cybersource-com:transaction-data-1.141}amount" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitPurchaseService" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitCreditService" minOccurs="0"/&gt;
 *         &lt;element name="pinDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PinDebitReversalService" minOccurs="0"/&gt;
 *         &lt;element name="ap" type="{urn:schemas-cybersource-com:transaction-data-1.141}AP" minOccurs="0"/&gt;
 *         &lt;element name="apAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APAuthService" minOccurs="0"/&gt;
 *         &lt;element name="apAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APAuthReversalService" minOccurs="0"/&gt;
 *         &lt;element name="apCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCaptureService" minOccurs="0"/&gt;
 *         &lt;element name="apOptionsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APOptionsService" minOccurs="0"/&gt;
 *         &lt;element name="apRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APRefundService" minOccurs="0"/&gt;
 *         &lt;element name="apSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APSaleService" minOccurs="0"/&gt;
 *         &lt;element name="apCheckoutDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCheckOutDetailsService" minOccurs="0"/&gt;
 *         &lt;element name="apSessionsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APSessionsService" minOccurs="0"/&gt;
 *         &lt;element name="apUI" type="{urn:schemas-cybersource-com:transaction-data-1.141}APUI" minOccurs="0"/&gt;
 *         &lt;element name="apTransactionDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APTransactionDetailsService" minOccurs="0"/&gt;
 *         &lt;element name="apConfirmPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APConfirmPurchaseService" minOccurs="0"/&gt;
 *         &lt;element name="payPalGetTxnDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalGetTxnDetailsService" minOccurs="0"/&gt;
 *         &lt;element name="payPalTransactionSearchService" type="{urn:schemas-cybersource-com:transaction-data-1.141}PayPalTransactionSearchService" minOccurs="0"/&gt;
 *         &lt;element name="ccDCCUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}CCDCCUpdateService" minOccurs="0"/&gt;
 *         &lt;element name="emvRequest" type="{urn:schemas-cybersource-com:transaction-data-1.141}EmvRequest" minOccurs="0"/&gt;
 *         &lt;element name="merchantTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostedDataCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.141}HostedDataCreateService" minOccurs="0"/&gt;
 *         &lt;element name="hostedDataRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.141}HostedDataRetrieveService" minOccurs="0"/&gt;
 *         &lt;element name="merchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesSlipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchandiseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchandiseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentInitiationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendedCreditTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-cybersource-com:transaction-data-1.141}PaymentNetworkToken" minOccurs="0"/&gt;
 *         &lt;element name="recipient" type="{urn:schemas-cybersource-com:transaction-data-1.141}Recipient" minOccurs="0"/&gt;
 *         &lt;element name="sender" type="{urn:schemas-cybersource-com:transaction-data-1.141}Sender" minOccurs="0"/&gt;
 *         &lt;element name="autoRentalData" type="{urn:schemas-cybersource-com:transaction-data-1.141}AutoRentalData" minOccurs="0"/&gt;
 *         &lt;element name="paymentSolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vc" type="{urn:schemas-cybersource-com:transaction-data-1.141}VC" minOccurs="0"/&gt;
 *         &lt;element name="decryptVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.141}DecryptVisaCheckoutDataService" minOccurs="0"/&gt;
 *         &lt;element name="taxManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotionGroup" type="{urn:schemas-cybersource-com:transaction-data-1.141}PromotionGroup" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="wallet" type="{urn:schemas-cybersource-com:transaction-data-1.141}Wallet" minOccurs="0"/&gt;
 *         &lt;element name="aft" type="{urn:schemas-cybersource-com:transaction-data-1.141}Aft" minOccurs="0"/&gt;
 *         &lt;element name="balanceInquiry" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="prenoteTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" minOccurs="0"/&gt;
 *         &lt;element name="encryptPaymentDataService" type="{urn:schemas-cybersource-com:transaction-data-1.141}EncryptPaymentDataService" minOccurs="0"/&gt;
 *         &lt;element name="nationalNetDomesticData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsequentAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binLookupService" type="{urn:schemas-cybersource-com:transaction-data-1.141}BinLookupService" minOccurs="0"/&gt;
 *         &lt;element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuer" type="{urn:schemas-cybersource-com:transaction-data-1.141}issuer" minOccurs="0"/&gt;
 *         &lt;element name="partnerSolutionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="developerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="getVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.141}GETVisaCheckoutDataService" minOccurs="0"/&gt;
 *         &lt;element name="customerSignatureImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionMetadataService" type="{urn:schemas-cybersource-com:transaction-data-1.141}TransactionMetadataService" minOccurs="0"/&gt;
 *         &lt;element name="subsequentAuthFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsequentAuthReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsequentAuthTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loan" type="{urn:schemas-cybersource-com:transaction-data-1.141}Loan" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeProgramIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apOrderService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APOrderService" minOccurs="0"/&gt;
 *         &lt;element name="apCancelService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APCancelService" minOccurs="0"/&gt;
 *         &lt;element name="apBillingAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.141}APBillingAgreementService" minOccurs="0"/&gt;
 *         &lt;element name="note_toPayee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note_toPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerSDKversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerOriginalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardTypeSelectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "merchantID",
    "merchantReferenceCode",
    "debtIndicator",
    "clientLibrary",
    "clientLibraryVersion",
    "clientEnvironment",
    "clientSecurityLibraryVersion",
    "clientApplication",
    "clientApplicationVersion",
    "clientApplicationUser",
    "routingCode",
    "comments",
    "returnURL",
    "invoiceHeader",
    "aggregatorMerchantIdentifier",
    "customerID",
    "customerFirstName",
    "customerLastName",
    "billTo",
    "shipTo",
    "personalID",
    "shipFrom",
    "item",
    "purchaseTotals",
    "fundingTotals",
    "dcc",
    "pos",
    "pin",
    "encryptedPayment",
    "installment",
    "card",
    "check",
    "bml",
    "gecc",
    "ucaf",
    "fundTransfer",
    "bankInfo",
    "subscription",
    "recurringSubscriptionInfo",
    "decisionManager",
    "otherTax",
    "paypal",
    "merchantDefinedData",
    "merchantSecureData",
    "jpo",
    "orderRequestToken",
    "linkToRequest",
    "serviceFee",
    "ccAuthService",
    "octService",
    "verificationService",
    "ccSaleService",
    "ccSaleCreditService",
    "ccSaleReversalService",
    "ccIncrementalAuthService",
    "ccCaptureService",
    "ccCreditService",
    "ccAuthReversalService",
    "ccAutoAuthReversalService",
    "ccDCCService",
    "serviceFeeCalculateService",
    "ecDebitService",
    "ecCreditService",
    "ecAuthenticateService",
    "payerAuthEnrollService",
    "payerAuthValidateService",
    "taxService",
    "dmeService",
    "afsService",
    "davService",
    "exportService",
    "fxRatesService",
    "bankTransferService",
    "bankTransferRefundService",
    "bankTransferRealTimeService",
    "directDebitMandateService",
    "directDebitService",
    "directDebitRefundService",
    "directDebitValidateService",
    "paySubscriptionCreateService",
    "paySubscriptionUpdateService",
    "paySubscriptionEventUpdateService",
    "paySubscriptionRetrieveService",
    "paySubscriptionDeleteService",
    "payPalPaymentService",
    "payPalCreditService",
    "voidService",
    "businessRules",
    "pinlessDebitService",
    "pinlessDebitValidateService",
    "pinlessDebitReversalService",
    "batch",
    "airlineData",
    "ancillaryData",
    "lodgingData",
    "payPalButtonCreateService",
    "payPalPreapprovedPaymentService",
    "payPalPreapprovedUpdateService",
    "riskUpdateService",
    "fraudUpdateService",
    "caseManagementActionService",
    "reserved",
    "deviceFingerprintID",
    "deviceFingerprintRaw",
    "deviceFingerprintHash",
    "payPalRefundService",
    "payPalAuthReversalService",
    "payPalDoCaptureService",
    "payPalEcDoPaymentService",
    "payPalEcGetDetailsService",
    "payPalEcSetService",
    "payPalEcOrderSetupService",
    "payPalAuthorizationService",
    "payPalUpdateAgreementService",
    "payPalCreateAgreementService",
    "payPalDoRefTransactionService",
    "chinaPaymentService",
    "chinaRefundService",
    "boletoPaymentService",
    "apPaymentType",
    "apInitiateService",
    "apCheckStatusService",
    "ignoreCardExpiration",
    "reportGroup",
    "processorID",
    "thirdPartyCertificationNumber",
    "transactionLocalDateTime",
    "solutionProviderTransactionID",
    "surchargeAmount",
    "surchargeSign",
    "pinDataEncryptedPIN",
    "pinDataKeySerialNumber",
    "cashbackAmount",
    "pinDebitPurchaseService",
    "pinDebitCreditService",
    "pinDebitReversalService",
    "ap",
    "apAuthService",
    "apAuthReversalService",
    "apCaptureService",
    "apOptionsService",
    "apRefundService",
    "apSaleService",
    "apCheckoutDetailsService",
    "apSessionsService",
    "apUI",
    "apTransactionDetailsService",
    "apConfirmPurchaseService",
    "payPalGetTxnDetailsService",
    "payPalTransactionSearchService",
    "ccDCCUpdateService",
    "emvRequest",
    "merchantTransactionIdentifier",
    "hostedDataCreateService",
    "hostedDataRetrieveService",
    "merchantCategoryCode",
    "salesSlipNumber",
    "merchandiseCode",
    "merchandiseDescription",
    "paymentInitiationChannel",
    "extendedCreditTotalCount",
    "authIndicator",
    "paymentNetworkToken",
    "recipient",
    "sender",
    "autoRentalData",
    "paymentSolution",
    "vc",
    "decryptVisaCheckoutDataService",
    "taxManagementIndicator",
    "promotionGroup",
    "wallet",
    "aft",
    "balanceInquiry",
    "prenoteTransaction",
    "encryptPaymentDataService",
    "nationalNetDomesticData",
    "subsequentAuth",
    "binLookupService",
    "verificationCode",
    "mobileNumber",
    "issuer",
    "partnerSolutionID",
    "developerID",
    "getVisaCheckoutDataService",
    "customerSignatureImage",
    "transactionMetadataService",
    "subsequentAuthFirst",
    "subsequentAuthReason",
    "subsequentAuthTransactionID",
    "loan",
    "eligibilityInquiry",
    "redemptionInquiry",
    "feeProgramIndicator",
    "apOrderService",
    "apCancelService",
    "apBillingAgreementService",
    "noteToPayee",
    "noteToPayer",
    "partnerSDKversion",
    "partnerOriginalTransactionID",
    "cardTypeSelectionIndicator"
})
public class RequestMessage {

    protected String merchantID;
    protected String merchantReferenceCode;
    protected String debtIndicator;
    protected String clientLibrary;
    protected String clientLibraryVersion;
    protected String clientEnvironment;
    protected String clientSecurityLibraryVersion;
    protected String clientApplication;
    protected String clientApplicationVersion;
    protected String clientApplicationUser;
    protected String routingCode;
    protected String comments;
    protected String returnURL;
    protected InvoiceHeader invoiceHeader;
    protected String aggregatorMerchantIdentifier;
    protected String customerID;
    protected String customerFirstName;
    protected String customerLastName;
    protected BillTo billTo;
    protected ShipTo shipTo;
    protected PersonalID personalID;
    protected ShipFrom shipFrom;
    protected List<Item> item;
    protected PurchaseTotals purchaseTotals;
    protected FundingTotals fundingTotals;
    protected DCC dcc;
    protected Pos pos;
    protected Pin pin;
    protected EncryptedPayment encryptedPayment;
    protected Installment installment;
    protected Card card;
    protected Check check;
    protected BML bml;
    protected GECC gecc;
    protected UCAF ucaf;
    protected FundTransfer fundTransfer;
    protected BankInfo bankInfo;
    protected Subscription subscription;
    protected RecurringSubscriptionInfo recurringSubscriptionInfo;
    protected DecisionManager decisionManager;
    protected OtherTax otherTax;
    protected PayPal paypal;
    protected MerchantDefinedData merchantDefinedData;
    protected MerchantSecureData merchantSecureData;
    protected JPO jpo;
    protected String orderRequestToken;
    protected String linkToRequest;
    protected ServiceFee serviceFee;
    protected CCAuthService ccAuthService;
    protected OCTService octService;
    protected VerificationService verificationService;
    protected CCSaleService ccSaleService;
    protected CCSaleCreditService ccSaleCreditService;
    protected CCSaleReversalService ccSaleReversalService;
    protected CCIncrementalAuthService ccIncrementalAuthService;
    protected CCCaptureService ccCaptureService;
    protected CCCreditService ccCreditService;
    protected CCAuthReversalService ccAuthReversalService;
    protected CCAutoAuthReversalService ccAutoAuthReversalService;
    protected CCDCCService ccDCCService;
    protected ServiceFeeCalculateService serviceFeeCalculateService;
    protected ECDebitService ecDebitService;
    protected ECCreditService ecCreditService;
    protected ECAuthenticateService ecAuthenticateService;
    protected PayerAuthEnrollService payerAuthEnrollService;
    protected PayerAuthValidateService payerAuthValidateService;
    protected TaxService taxService;
    protected DMEService dmeService;
    protected AFSService afsService;
    protected DAVService davService;
    protected ExportService exportService;
    protected FXRatesService fxRatesService;
    protected BankTransferService bankTransferService;
    protected BankTransferRefundService bankTransferRefundService;
    protected BankTransferRealTimeService bankTransferRealTimeService;
    protected DirectDebitMandateService directDebitMandateService;
    protected DirectDebitService directDebitService;
    protected DirectDebitRefundService directDebitRefundService;
    protected DirectDebitValidateService directDebitValidateService;
    protected PaySubscriptionCreateService paySubscriptionCreateService;
    protected PaySubscriptionUpdateService paySubscriptionUpdateService;
    protected PaySubscriptionEventUpdateService paySubscriptionEventUpdateService;
    protected PaySubscriptionRetrieveService paySubscriptionRetrieveService;
    protected PaySubscriptionDeleteService paySubscriptionDeleteService;
    protected PayPalPaymentService payPalPaymentService;
    protected PayPalCreditService payPalCreditService;
    protected VoidService voidService;
    protected BusinessRules businessRules;
    protected PinlessDebitService pinlessDebitService;
    protected PinlessDebitValidateService pinlessDebitValidateService;
    protected PinlessDebitReversalService pinlessDebitReversalService;
    protected Batch batch;
    protected AirlineData airlineData;
    protected AncillaryData ancillaryData;
    protected LodgingData lodgingData;
    protected PayPalButtonCreateService payPalButtonCreateService;
    protected PayPalPreapprovedPaymentService payPalPreapprovedPaymentService;
    protected PayPalPreapprovedUpdateService payPalPreapprovedUpdateService;
    protected RiskUpdateService riskUpdateService;
    protected FraudUpdateService fraudUpdateService;
    protected CaseManagementActionService caseManagementActionService;
    protected List<RequestReserved> reserved;
    protected String deviceFingerprintID;
    protected String deviceFingerprintRaw;
    protected String deviceFingerprintHash;
    protected PayPalRefundService payPalRefundService;
    protected PayPalAuthReversalService payPalAuthReversalService;
    protected PayPalDoCaptureService payPalDoCaptureService;
    protected PayPalEcDoPaymentService payPalEcDoPaymentService;
    protected PayPalEcGetDetailsService payPalEcGetDetailsService;
    protected PayPalEcSetService payPalEcSetService;
    protected PayPalEcOrderSetupService payPalEcOrderSetupService;
    protected PayPalAuthorizationService payPalAuthorizationService;
    protected PayPalUpdateAgreementService payPalUpdateAgreementService;
    protected PayPalCreateAgreementService payPalCreateAgreementService;
    protected PayPalDoRefTransactionService payPalDoRefTransactionService;
    protected ChinaPaymentService chinaPaymentService;
    protected ChinaRefundService chinaRefundService;
    protected BoletoPaymentService boletoPaymentService;
    protected String apPaymentType;
    protected APInitiateService apInitiateService;
    protected APCheckStatusService apCheckStatusService;
    protected String ignoreCardExpiration;
    protected String reportGroup;
    protected String processorID;
    protected String thirdPartyCertificationNumber;
    protected String transactionLocalDateTime;
    protected String solutionProviderTransactionID;
    protected String surchargeAmount;
    protected String surchargeSign;
    protected String pinDataEncryptedPIN;
    protected String pinDataKeySerialNumber;
    protected String cashbackAmount;
    protected PinDebitPurchaseService pinDebitPurchaseService;
    protected PinDebitCreditService pinDebitCreditService;
    protected PinDebitReversalService pinDebitReversalService;
    protected AP ap;
    protected APAuthService apAuthService;
    protected APAuthReversalService apAuthReversalService;
    protected APCaptureService apCaptureService;
    protected APOptionsService apOptionsService;
    protected APRefundService apRefundService;
    protected APSaleService apSaleService;
    protected APCheckOutDetailsService apCheckoutDetailsService;
    protected APSessionsService apSessionsService;
    protected APUI apUI;
    protected APTransactionDetailsService apTransactionDetailsService;
    protected APConfirmPurchaseService apConfirmPurchaseService;
    protected PayPalGetTxnDetailsService payPalGetTxnDetailsService;
    protected PayPalTransactionSearchService payPalTransactionSearchService;
    protected CCDCCUpdateService ccDCCUpdateService;
    protected EmvRequest emvRequest;
    protected String merchantTransactionIdentifier;
    protected HostedDataCreateService hostedDataCreateService;
    protected HostedDataRetrieveService hostedDataRetrieveService;
    protected String merchantCategoryCode;
    protected String salesSlipNumber;
    protected String merchandiseCode;
    protected String merchandiseDescription;
    protected String paymentInitiationChannel;
    protected String extendedCreditTotalCount;
    protected String authIndicator;
    protected PaymentNetworkToken paymentNetworkToken;
    protected Recipient recipient;
    protected Sender sender;
    protected AutoRentalData autoRentalData;
    protected String paymentSolution;
    protected VC vc;
    protected DecryptVisaCheckoutDataService decryptVisaCheckoutDataService;
    protected String taxManagementIndicator;
    protected List<PromotionGroup> promotionGroup;
    protected Wallet wallet;
    protected Aft aft;
    protected String balanceInquiry;
    protected String prenoteTransaction;
    protected EncryptPaymentDataService encryptPaymentDataService;
    protected String nationalNetDomesticData;
    protected String subsequentAuth;
    protected BinLookupService binLookupService;
    protected String verificationCode;
    protected String mobileNumber;
    protected Issuer issuer;
    protected String partnerSolutionID;
    protected String developerID;
    protected GETVisaCheckoutDataService getVisaCheckoutDataService;
    protected String customerSignatureImage;
    protected TransactionMetadataService transactionMetadataService;
    protected String subsequentAuthFirst;
    protected String subsequentAuthReason;
    protected String subsequentAuthTransactionID;
    protected Loan loan;
    protected String eligibilityInquiry;
    protected String redemptionInquiry;
    protected String feeProgramIndicator;
    protected APOrderService apOrderService;
    protected APCancelService apCancelService;
    protected APBillingAgreementService apBillingAgreementService;
    @XmlElement(name = "note_toPayee")
    protected String noteToPayee;
    @XmlElement(name = "note_toPayer")
    protected String noteToPayer;
    protected String partnerSDKversion;
    protected String partnerOriginalTransactionID;
    protected String cardTypeSelectionIndicator;

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

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
     * Gets the value of the debtIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtIndicator() {
        return debtIndicator;
    }

    /**
     * Sets the value of the debtIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtIndicator(String value) {
        this.debtIndicator = value;
    }

    /**
     * Gets the value of the clientLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibrary() {
        return clientLibrary;
    }

    /**
     * Sets the value of the clientLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibrary(String value) {
        this.clientLibrary = value;
    }

    /**
     * Gets the value of the clientLibraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibraryVersion() {
        return clientLibraryVersion;
    }

    /**
     * Sets the value of the clientLibraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibraryVersion(String value) {
        this.clientLibraryVersion = value;
    }

    /**
     * Gets the value of the clientEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEnvironment() {
        return clientEnvironment;
    }

    /**
     * Sets the value of the clientEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEnvironment(String value) {
        this.clientEnvironment = value;
    }

    /**
     * Gets the value of the clientSecurityLibraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecurityLibraryVersion() {
        return clientSecurityLibraryVersion;
    }

    /**
     * Sets the value of the clientSecurityLibraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecurityLibraryVersion(String value) {
        this.clientSecurityLibraryVersion = value;
    }

    /**
     * Gets the value of the clientApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplication() {
        return clientApplication;
    }

    /**
     * Sets the value of the clientApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplication(String value) {
        this.clientApplication = value;
    }

    /**
     * Gets the value of the clientApplicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationVersion() {
        return clientApplicationVersion;
    }

    /**
     * Sets the value of the clientApplicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationVersion(String value) {
        this.clientApplicationVersion = value;
    }

    /**
     * Gets the value of the clientApplicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationUser() {
        return clientApplicationUser;
    }

    /**
     * Sets the value of the clientApplicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationUser(String value) {
        this.clientApplicationUser = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
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
     * Gets the value of the aggregatorMerchantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorMerchantIdentifier() {
        return aggregatorMerchantIdentifier;
    }

    /**
     * Sets the value of the aggregatorMerchantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorMerchantIdentifier(String value) {
        this.aggregatorMerchantIdentifier = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
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
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFrom }
     *     
     */
    public ShipFrom getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFrom }
     *     
     */
    public void setShipFrom(ShipFrom value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
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
     * Gets the value of the dcc property.
     * 
     * @return
     *     possible object is
     *     {@link DCC }
     *     
     */
    public DCC getDcc() {
        return dcc;
    }

    /**
     * Sets the value of the dcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCC }
     *     
     */
    public void setDcc(DCC value) {
        this.dcc = value;
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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link Pin }
     *     
     */
    public Pin getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pin }
     *     
     */
    public void setPin(Pin value) {
        this.pin = value;
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
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Gets the value of the bml property.
     * 
     * @return
     *     possible object is
     *     {@link BML }
     *     
     */
    public BML getBml() {
        return bml;
    }

    /**
     * Sets the value of the bml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BML }
     *     
     */
    public void setBml(BML value) {
        this.bml = value;
    }

    /**
     * Gets the value of the gecc property.
     * 
     * @return
     *     possible object is
     *     {@link GECC }
     *     
     */
    public GECC getGecc() {
        return gecc;
    }

    /**
     * Sets the value of the gecc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GECC }
     *     
     */
    public void setGecc(GECC value) {
        this.gecc = value;
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
     * Gets the value of the fundTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link FundTransfer }
     *     
     */
    public FundTransfer getFundTransfer() {
        return fundTransfer;
    }

    /**
     * Sets the value of the fundTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransfer }
     *     
     */
    public void setFundTransfer(FundTransfer value) {
        this.fundTransfer = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the recurringSubscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public RecurringSubscriptionInfo getRecurringSubscriptionInfo() {
        return recurringSubscriptionInfo;
    }

    /**
     * Sets the value of the recurringSubscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public void setRecurringSubscriptionInfo(RecurringSubscriptionInfo value) {
        this.recurringSubscriptionInfo = value;
    }

    /**
     * Gets the value of the decisionManager property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionManager }
     *     
     */
    public DecisionManager getDecisionManager() {
        return decisionManager;
    }

    /**
     * Sets the value of the decisionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionManager }
     *     
     */
    public void setDecisionManager(DecisionManager value) {
        this.decisionManager = value;
    }

    /**
     * Gets the value of the otherTax property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTax }
     *     
     */
    public OtherTax getOtherTax() {
        return otherTax;
    }

    /**
     * Sets the value of the otherTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTax }
     *     
     */
    public void setOtherTax(OtherTax value) {
        this.otherTax = value;
    }

    /**
     * Gets the value of the paypal property.
     * 
     * @return
     *     possible object is
     *     {@link PayPal }
     *     
     */
    public PayPal getPaypal() {
        return paypal;
    }

    /**
     * Sets the value of the paypal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPal }
     *     
     */
    public void setPaypal(PayPal value) {
        this.paypal = value;
    }

    /**
     * Gets the value of the merchantDefinedData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDefinedData }
     *     
     */
    public MerchantDefinedData getMerchantDefinedData() {
        return merchantDefinedData;
    }

    /**
     * Sets the value of the merchantDefinedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDefinedData }
     *     
     */
    public void setMerchantDefinedData(MerchantDefinedData value) {
        this.merchantDefinedData = value;
    }

    /**
     * Gets the value of the merchantSecureData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantSecureData }
     *     
     */
    public MerchantSecureData getMerchantSecureData() {
        return merchantSecureData;
    }

    /**
     * Sets the value of the merchantSecureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantSecureData }
     *     
     */
    public void setMerchantSecureData(MerchantSecureData value) {
        this.merchantSecureData = value;
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
     * Gets the value of the orderRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRequestToken() {
        return orderRequestToken;
    }

    /**
     * Sets the value of the orderRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRequestToken(String value) {
        this.orderRequestToken = value;
    }

    /**
     * Gets the value of the linkToRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToRequest() {
        return linkToRequest;
    }

    /**
     * Sets the value of the linkToRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToRequest(String value) {
        this.linkToRequest = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFee }
     *     
     */
    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFee }
     *     
     */
    public void setServiceFee(ServiceFee value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the ccAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthService }
     *     
     */
    public CCAuthService getCcAuthService() {
        return ccAuthService;
    }

    /**
     * Sets the value of the ccAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthService }
     *     
     */
    public void setCcAuthService(CCAuthService value) {
        this.ccAuthService = value;
    }

    /**
     * Gets the value of the octService property.
     * 
     * @return
     *     possible object is
     *     {@link OCTService }
     *     
     */
    public OCTService getOctService() {
        return octService;
    }

    /**
     * Sets the value of the octService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCTService }
     *     
     */
    public void setOctService(OCTService value) {
        this.octService = value;
    }

    /**
     * Gets the value of the verificationService property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationService }
     *     
     */
    public VerificationService getVerificationService() {
        return verificationService;
    }

    /**
     * Sets the value of the verificationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationService }
     *     
     */
    public void setVerificationService(VerificationService value) {
        this.verificationService = value;
    }

    /**
     * Gets the value of the ccSaleService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleService }
     *     
     */
    public CCSaleService getCcSaleService() {
        return ccSaleService;
    }

    /**
     * Sets the value of the ccSaleService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleService }
     *     
     */
    public void setCcSaleService(CCSaleService value) {
        this.ccSaleService = value;
    }

    /**
     * Gets the value of the ccSaleCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleCreditService }
     *     
     */
    public CCSaleCreditService getCcSaleCreditService() {
        return ccSaleCreditService;
    }

    /**
     * Sets the value of the ccSaleCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleCreditService }
     *     
     */
    public void setCcSaleCreditService(CCSaleCreditService value) {
        this.ccSaleCreditService = value;
    }

    /**
     * Gets the value of the ccSaleReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReversalService }
     *     
     */
    public CCSaleReversalService getCcSaleReversalService() {
        return ccSaleReversalService;
    }

    /**
     * Sets the value of the ccSaleReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReversalService }
     *     
     */
    public void setCcSaleReversalService(CCSaleReversalService value) {
        this.ccSaleReversalService = value;
    }

    /**
     * Gets the value of the ccIncrementalAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public CCIncrementalAuthService getCcIncrementalAuthService() {
        return ccIncrementalAuthService;
    }

    /**
     * Sets the value of the ccIncrementalAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public void setCcIncrementalAuthService(CCIncrementalAuthService value) {
        this.ccIncrementalAuthService = value;
    }

    /**
     * Gets the value of the ccCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureService }
     *     
     */
    public CCCaptureService getCcCaptureService() {
        return ccCaptureService;
    }

    /**
     * Sets the value of the ccCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureService }
     *     
     */
    public void setCcCaptureService(CCCaptureService value) {
        this.ccCaptureService = value;
    }

    /**
     * Gets the value of the ccCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditService }
     *     
     */
    public CCCreditService getCcCreditService() {
        return ccCreditService;
    }

    /**
     * Sets the value of the ccCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditService }
     *     
     */
    public void setCcCreditService(CCCreditService value) {
        this.ccCreditService = value;
    }

    /**
     * Gets the value of the ccAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalService }
     *     
     */
    public CCAuthReversalService getCcAuthReversalService() {
        return ccAuthReversalService;
    }

    /**
     * Sets the value of the ccAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalService }
     *     
     */
    public void setCcAuthReversalService(CCAuthReversalService value) {
        this.ccAuthReversalService = value;
    }

    /**
     * Gets the value of the ccAutoAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public CCAutoAuthReversalService getCcAutoAuthReversalService() {
        return ccAutoAuthReversalService;
    }

    /**
     * Sets the value of the ccAutoAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public void setCcAutoAuthReversalService(CCAutoAuthReversalService value) {
        this.ccAutoAuthReversalService = value;
    }

    /**
     * Gets the value of the ccDCCService property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCService }
     *     
     */
    public CCDCCService getCcDCCService() {
        return ccDCCService;
    }

    /**
     * Sets the value of the ccDCCService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCService }
     *     
     */
    public void setCcDCCService(CCDCCService value) {
        this.ccDCCService = value;
    }

    /**
     * Gets the value of the serviceFeeCalculateService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public ServiceFeeCalculateService getServiceFeeCalculateService() {
        return serviceFeeCalculateService;
    }

    /**
     * Sets the value of the serviceFeeCalculateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public void setServiceFeeCalculateService(ServiceFeeCalculateService value) {
        this.serviceFeeCalculateService = value;
    }

    /**
     * Gets the value of the ecDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link ECDebitService }
     *     
     */
    public ECDebitService getEcDebitService() {
        return ecDebitService;
    }

    /**
     * Sets the value of the ecDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDebitService }
     *     
     */
    public void setEcDebitService(ECDebitService value) {
        this.ecDebitService = value;
    }

    /**
     * Gets the value of the ecCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link ECCreditService }
     *     
     */
    public ECCreditService getEcCreditService() {
        return ecCreditService;
    }

    /**
     * Sets the value of the ecCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCreditService }
     *     
     */
    public void setEcCreditService(ECCreditService value) {
        this.ecCreditService = value;
    }

    /**
     * Gets the value of the ecAuthenticateService property.
     * 
     * @return
     *     possible object is
     *     {@link ECAuthenticateService }
     *     
     */
    public ECAuthenticateService getEcAuthenticateService() {
        return ecAuthenticateService;
    }

    /**
     * Sets the value of the ecAuthenticateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAuthenticateService }
     *     
     */
    public void setEcAuthenticateService(ECAuthenticateService value) {
        this.ecAuthenticateService = value;
    }

    /**
     * Gets the value of the payerAuthEnrollService property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public PayerAuthEnrollService getPayerAuthEnrollService() {
        return payerAuthEnrollService;
    }

    /**
     * Sets the value of the payerAuthEnrollService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public void setPayerAuthEnrollService(PayerAuthEnrollService value) {
        this.payerAuthEnrollService = value;
    }

    /**
     * Gets the value of the payerAuthValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public PayerAuthValidateService getPayerAuthValidateService() {
        return payerAuthValidateService;
    }

    /**
     * Sets the value of the payerAuthValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public void setPayerAuthValidateService(PayerAuthValidateService value) {
        this.payerAuthValidateService = value;
    }

    /**
     * Gets the value of the taxService property.
     * 
     * @return
     *     possible object is
     *     {@link TaxService }
     *     
     */
    public TaxService getTaxService() {
        return taxService;
    }

    /**
     * Sets the value of the taxService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxService }
     *     
     */
    public void setTaxService(TaxService value) {
        this.taxService = value;
    }

    /**
     * Gets the value of the dmeService property.
     * 
     * @return
     *     possible object is
     *     {@link DMEService }
     *     
     */
    public DMEService getDmeService() {
        return dmeService;
    }

    /**
     * Sets the value of the dmeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMEService }
     *     
     */
    public void setDmeService(DMEService value) {
        this.dmeService = value;
    }

    /**
     * Gets the value of the afsService property.
     * 
     * @return
     *     possible object is
     *     {@link AFSService }
     *     
     */
    public AFSService getAfsService() {
        return afsService;
    }

    /**
     * Sets the value of the afsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSService }
     *     
     */
    public void setAfsService(AFSService value) {
        this.afsService = value;
    }

    /**
     * Gets the value of the davService property.
     * 
     * @return
     *     possible object is
     *     {@link DAVService }
     *     
     */
    public DAVService getDavService() {
        return davService;
    }

    /**
     * Sets the value of the davService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DAVService }
     *     
     */
    public void setDavService(DAVService value) {
        this.davService = value;
    }

    /**
     * Gets the value of the exportService property.
     * 
     * @return
     *     possible object is
     *     {@link ExportService }
     *     
     */
    public ExportService getExportService() {
        return exportService;
    }

    /**
     * Sets the value of the exportService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportService }
     *     
     */
    public void setExportService(ExportService value) {
        this.exportService = value;
    }

    /**
     * Gets the value of the fxRatesService property.
     * 
     * @return
     *     possible object is
     *     {@link FXRatesService }
     *     
     */
    public FXRatesService getFxRatesService() {
        return fxRatesService;
    }

    /**
     * Sets the value of the fxRatesService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXRatesService }
     *     
     */
    public void setFxRatesService(FXRatesService value) {
        this.fxRatesService = value;
    }

    /**
     * Gets the value of the bankTransferService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferService }
     *     
     */
    public BankTransferService getBankTransferService() {
        return bankTransferService;
    }

    /**
     * Sets the value of the bankTransferService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferService }
     *     
     */
    public void setBankTransferService(BankTransferService value) {
        this.bankTransferService = value;
    }

    /**
     * Gets the value of the bankTransferRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRefundService }
     *     
     */
    public BankTransferRefundService getBankTransferRefundService() {
        return bankTransferRefundService;
    }

    /**
     * Sets the value of the bankTransferRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRefundService }
     *     
     */
    public void setBankTransferRefundService(BankTransferRefundService value) {
        this.bankTransferRefundService = value;
    }

    /**
     * Gets the value of the bankTransferRealTimeService property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public BankTransferRealTimeService getBankTransferRealTimeService() {
        return bankTransferRealTimeService;
    }

    /**
     * Sets the value of the bankTransferRealTimeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public void setBankTransferRealTimeService(BankTransferRealTimeService value) {
        this.bankTransferRealTimeService = value;
    }

    /**
     * Gets the value of the directDebitMandateService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public DirectDebitMandateService getDirectDebitMandateService() {
        return directDebitMandateService;
    }

    /**
     * Sets the value of the directDebitMandateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public void setDirectDebitMandateService(DirectDebitMandateService value) {
        this.directDebitMandateService = value;
    }

    /**
     * Gets the value of the directDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitService }
     *     
     */
    public DirectDebitService getDirectDebitService() {
        return directDebitService;
    }

    /**
     * Sets the value of the directDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitService }
     *     
     */
    public void setDirectDebitService(DirectDebitService value) {
        this.directDebitService = value;
    }

    /**
     * Gets the value of the directDebitRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public DirectDebitRefundService getDirectDebitRefundService() {
        return directDebitRefundService;
    }

    /**
     * Sets the value of the directDebitRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public void setDirectDebitRefundService(DirectDebitRefundService value) {
        this.directDebitRefundService = value;
    }

    /**
     * Gets the value of the directDebitValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public DirectDebitValidateService getDirectDebitValidateService() {
        return directDebitValidateService;
    }

    /**
     * Sets the value of the directDebitValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public void setDirectDebitValidateService(DirectDebitValidateService value) {
        this.directDebitValidateService = value;
    }

    /**
     * Gets the value of the paySubscriptionCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public PaySubscriptionCreateService getPaySubscriptionCreateService() {
        return paySubscriptionCreateService;
    }

    /**
     * Sets the value of the paySubscriptionCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public void setPaySubscriptionCreateService(PaySubscriptionCreateService value) {
        this.paySubscriptionCreateService = value;
    }

    /**
     * Gets the value of the paySubscriptionUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public PaySubscriptionUpdateService getPaySubscriptionUpdateService() {
        return paySubscriptionUpdateService;
    }

    /**
     * Sets the value of the paySubscriptionUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public void setPaySubscriptionUpdateService(PaySubscriptionUpdateService value) {
        this.paySubscriptionUpdateService = value;
    }

    /**
     * Gets the value of the paySubscriptionEventUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public PaySubscriptionEventUpdateService getPaySubscriptionEventUpdateService() {
        return paySubscriptionEventUpdateService;
    }

    /**
     * Sets the value of the paySubscriptionEventUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public void setPaySubscriptionEventUpdateService(PaySubscriptionEventUpdateService value) {
        this.paySubscriptionEventUpdateService = value;
    }

    /**
     * Gets the value of the paySubscriptionRetrieveService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public PaySubscriptionRetrieveService getPaySubscriptionRetrieveService() {
        return paySubscriptionRetrieveService;
    }

    /**
     * Sets the value of the paySubscriptionRetrieveService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public void setPaySubscriptionRetrieveService(PaySubscriptionRetrieveService value) {
        this.paySubscriptionRetrieveService = value;
    }

    /**
     * Gets the value of the paySubscriptionDeleteService property.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public PaySubscriptionDeleteService getPaySubscriptionDeleteService() {
        return paySubscriptionDeleteService;
    }

    /**
     * Sets the value of the paySubscriptionDeleteService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public void setPaySubscriptionDeleteService(PaySubscriptionDeleteService value) {
        this.paySubscriptionDeleteService = value;
    }

    /**
     * Gets the value of the payPalPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPaymentService }
     *     
     */
    public PayPalPaymentService getPayPalPaymentService() {
        return payPalPaymentService;
    }

    /**
     * Sets the value of the payPalPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPaymentService }
     *     
     */
    public void setPayPalPaymentService(PayPalPaymentService value) {
        this.payPalPaymentService = value;
    }

    /**
     * Gets the value of the payPalCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreditService }
     *     
     */
    public PayPalCreditService getPayPalCreditService() {
        return payPalCreditService;
    }

    /**
     * Sets the value of the payPalCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreditService }
     *     
     */
    public void setPayPalCreditService(PayPalCreditService value) {
        this.payPalCreditService = value;
    }

    /**
     * Gets the value of the voidService property.
     * 
     * @return
     *     possible object is
     *     {@link VoidService }
     *     
     */
    public VoidService getVoidService() {
        return voidService;
    }

    /**
     * Sets the value of the voidService property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidService }
     *     
     */
    public void setVoidService(VoidService value) {
        this.voidService = value;
    }

    /**
     * Gets the value of the businessRules property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRules }
     *     
     */
    public BusinessRules getBusinessRules() {
        return businessRules;
    }

    /**
     * Sets the value of the businessRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRules }
     *     
     */
    public void setBusinessRules(BusinessRules value) {
        this.businessRules = value;
    }

    /**
     * Gets the value of the pinlessDebitService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitService }
     *     
     */
    public PinlessDebitService getPinlessDebitService() {
        return pinlessDebitService;
    }

    /**
     * Sets the value of the pinlessDebitService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitService }
     *     
     */
    public void setPinlessDebitService(PinlessDebitService value) {
        this.pinlessDebitService = value;
    }

    /**
     * Gets the value of the pinlessDebitValidateService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public PinlessDebitValidateService getPinlessDebitValidateService() {
        return pinlessDebitValidateService;
    }

    /**
     * Sets the value of the pinlessDebitValidateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public void setPinlessDebitValidateService(PinlessDebitValidateService value) {
        this.pinlessDebitValidateService = value;
    }

    /**
     * Gets the value of the pinlessDebitReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public PinlessDebitReversalService getPinlessDebitReversalService() {
        return pinlessDebitReversalService;
    }

    /**
     * Sets the value of the pinlessDebitReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public void setPinlessDebitReversalService(PinlessDebitReversalService value) {
        this.pinlessDebitReversalService = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

    /**
     * Gets the value of the airlineData property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineData }
     *     
     */
    public AirlineData getAirlineData() {
        return airlineData;
    }

    /**
     * Sets the value of the airlineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineData }
     *     
     */
    public void setAirlineData(AirlineData value) {
        this.airlineData = value;
    }

    /**
     * Gets the value of the ancillaryData property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryData }
     *     
     */
    public AncillaryData getAncillaryData() {
        return ancillaryData;
    }

    /**
     * Sets the value of the ancillaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryData }
     *     
     */
    public void setAncillaryData(AncillaryData value) {
        this.ancillaryData = value;
    }

    /**
     * Gets the value of the lodgingData property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingData }
     *     
     */
    public LodgingData getLodgingData() {
        return lodgingData;
    }

    /**
     * Sets the value of the lodgingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingData }
     *     
     */
    public void setLodgingData(LodgingData value) {
        this.lodgingData = value;
    }

    /**
     * Gets the value of the payPalButtonCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public PayPalButtonCreateService getPayPalButtonCreateService() {
        return payPalButtonCreateService;
    }

    /**
     * Sets the value of the payPalButtonCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public void setPayPalButtonCreateService(PayPalButtonCreateService value) {
        this.payPalButtonCreateService = value;
    }

    /**
     * Gets the value of the payPalPreapprovedPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public PayPalPreapprovedPaymentService getPayPalPreapprovedPaymentService() {
        return payPalPreapprovedPaymentService;
    }

    /**
     * Sets the value of the payPalPreapprovedPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public void setPayPalPreapprovedPaymentService(PayPalPreapprovedPaymentService value) {
        this.payPalPreapprovedPaymentService = value;
    }

    /**
     * Gets the value of the payPalPreapprovedUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public PayPalPreapprovedUpdateService getPayPalPreapprovedUpdateService() {
        return payPalPreapprovedUpdateService;
    }

    /**
     * Sets the value of the payPalPreapprovedUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public void setPayPalPreapprovedUpdateService(PayPalPreapprovedUpdateService value) {
        this.payPalPreapprovedUpdateService = value;
    }

    /**
     * Gets the value of the riskUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link RiskUpdateService }
     *     
     */
    public RiskUpdateService getRiskUpdateService() {
        return riskUpdateService;
    }

    /**
     * Sets the value of the riskUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUpdateService }
     *     
     */
    public void setRiskUpdateService(RiskUpdateService value) {
        this.riskUpdateService = value;
    }

    /**
     * Gets the value of the fraudUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link FraudUpdateService }
     *     
     */
    public FraudUpdateService getFraudUpdateService() {
        return fraudUpdateService;
    }

    /**
     * Sets the value of the fraudUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudUpdateService }
     *     
     */
    public void setFraudUpdateService(FraudUpdateService value) {
        this.fraudUpdateService = value;
    }

    /**
     * Gets the value of the caseManagementActionService property.
     * 
     * @return
     *     possible object is
     *     {@link CaseManagementActionService }
     *     
     */
    public CaseManagementActionService getCaseManagementActionService() {
        return caseManagementActionService;
    }

    /**
     * Sets the value of the caseManagementActionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseManagementActionService }
     *     
     */
    public void setCaseManagementActionService(CaseManagementActionService value) {
        this.caseManagementActionService = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReserved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestReserved }
     * 
     * 
     */
    public List<RequestReserved> getReserved() {
        if (reserved == null) {
            reserved = new ArrayList<RequestReserved>();
        }
        return this.reserved;
    }

    /**
     * Gets the value of the deviceFingerprintID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintID() {
        return deviceFingerprintID;
    }

    /**
     * Sets the value of the deviceFingerprintID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintID(String value) {
        this.deviceFingerprintID = value;
    }

    /**
     * Gets the value of the deviceFingerprintRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintRaw() {
        return deviceFingerprintRaw;
    }

    /**
     * Sets the value of the deviceFingerprintRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintRaw(String value) {
        this.deviceFingerprintRaw = value;
    }

    /**
     * Gets the value of the deviceFingerprintHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintHash() {
        return deviceFingerprintHash;
    }

    /**
     * Sets the value of the deviceFingerprintHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintHash(String value) {
        this.deviceFingerprintHash = value;
    }

    /**
     * Gets the value of the payPalRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRefundService }
     *     
     */
    public PayPalRefundService getPayPalRefundService() {
        return payPalRefundService;
    }

    /**
     * Sets the value of the payPalRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRefundService }
     *     
     */
    public void setPayPalRefundService(PayPalRefundService value) {
        this.payPalRefundService = value;
    }

    /**
     * Gets the value of the payPalAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public PayPalAuthReversalService getPayPalAuthReversalService() {
        return payPalAuthReversalService;
    }

    /**
     * Sets the value of the payPalAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public void setPayPalAuthReversalService(PayPalAuthReversalService value) {
        this.payPalAuthReversalService = value;
    }

    /**
     * Gets the value of the payPalDoCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public PayPalDoCaptureService getPayPalDoCaptureService() {
        return payPalDoCaptureService;
    }

    /**
     * Sets the value of the payPalDoCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public void setPayPalDoCaptureService(PayPalDoCaptureService value) {
        this.payPalDoCaptureService = value;
    }

    /**
     * Gets the value of the payPalEcDoPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public PayPalEcDoPaymentService getPayPalEcDoPaymentService() {
        return payPalEcDoPaymentService;
    }

    /**
     * Sets the value of the payPalEcDoPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public void setPayPalEcDoPaymentService(PayPalEcDoPaymentService value) {
        this.payPalEcDoPaymentService = value;
    }

    /**
     * Gets the value of the payPalEcGetDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public PayPalEcGetDetailsService getPayPalEcGetDetailsService() {
        return payPalEcGetDetailsService;
    }

    /**
     * Sets the value of the payPalEcGetDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public void setPayPalEcGetDetailsService(PayPalEcGetDetailsService value) {
        this.payPalEcGetDetailsService = value;
    }

    /**
     * Gets the value of the payPalEcSetService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcSetService }
     *     
     */
    public PayPalEcSetService getPayPalEcSetService() {
        return payPalEcSetService;
    }

    /**
     * Sets the value of the payPalEcSetService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcSetService }
     *     
     */
    public void setPayPalEcSetService(PayPalEcSetService value) {
        this.payPalEcSetService = value;
    }

    /**
     * Gets the value of the payPalEcOrderSetupService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public PayPalEcOrderSetupService getPayPalEcOrderSetupService() {
        return payPalEcOrderSetupService;
    }

    /**
     * Sets the value of the payPalEcOrderSetupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public void setPayPalEcOrderSetupService(PayPalEcOrderSetupService value) {
        this.payPalEcOrderSetupService = value;
    }

    /**
     * Gets the value of the payPalAuthorizationService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public PayPalAuthorizationService getPayPalAuthorizationService() {
        return payPalAuthorizationService;
    }

    /**
     * Sets the value of the payPalAuthorizationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public void setPayPalAuthorizationService(PayPalAuthorizationService value) {
        this.payPalAuthorizationService = value;
    }

    /**
     * Gets the value of the payPalUpdateAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public PayPalUpdateAgreementService getPayPalUpdateAgreementService() {
        return payPalUpdateAgreementService;
    }

    /**
     * Sets the value of the payPalUpdateAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public void setPayPalUpdateAgreementService(PayPalUpdateAgreementService value) {
        this.payPalUpdateAgreementService = value;
    }

    /**
     * Gets the value of the payPalCreateAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public PayPalCreateAgreementService getPayPalCreateAgreementService() {
        return payPalCreateAgreementService;
    }

    /**
     * Sets the value of the payPalCreateAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public void setPayPalCreateAgreementService(PayPalCreateAgreementService value) {
        this.payPalCreateAgreementService = value;
    }

    /**
     * Gets the value of the payPalDoRefTransactionService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public PayPalDoRefTransactionService getPayPalDoRefTransactionService() {
        return payPalDoRefTransactionService;
    }

    /**
     * Sets the value of the payPalDoRefTransactionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public void setPayPalDoRefTransactionService(PayPalDoRefTransactionService value) {
        this.payPalDoRefTransactionService = value;
    }

    /**
     * Gets the value of the chinaPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaPaymentService }
     *     
     */
    public ChinaPaymentService getChinaPaymentService() {
        return chinaPaymentService;
    }

    /**
     * Sets the value of the chinaPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaPaymentService }
     *     
     */
    public void setChinaPaymentService(ChinaPaymentService value) {
        this.chinaPaymentService = value;
    }

    /**
     * Gets the value of the chinaRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link ChinaRefundService }
     *     
     */
    public ChinaRefundService getChinaRefundService() {
        return chinaRefundService;
    }

    /**
     * Sets the value of the chinaRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaRefundService }
     *     
     */
    public void setChinaRefundService(ChinaRefundService value) {
        this.chinaRefundService = value;
    }

    /**
     * Gets the value of the boletoPaymentService property.
     * 
     * @return
     *     possible object is
     *     {@link BoletoPaymentService }
     *     
     */
    public BoletoPaymentService getBoletoPaymentService() {
        return boletoPaymentService;
    }

    /**
     * Sets the value of the boletoPaymentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletoPaymentService }
     *     
     */
    public void setBoletoPaymentService(BoletoPaymentService value) {
        this.boletoPaymentService = value;
    }

    /**
     * Gets the value of the apPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaymentType() {
        return apPaymentType;
    }

    /**
     * Sets the value of the apPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaymentType(String value) {
        this.apPaymentType = value;
    }

    /**
     * Gets the value of the apInitiateService property.
     * 
     * @return
     *     possible object is
     *     {@link APInitiateService }
     *     
     */
    public APInitiateService getApInitiateService() {
        return apInitiateService;
    }

    /**
     * Sets the value of the apInitiateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APInitiateService }
     *     
     */
    public void setApInitiateService(APInitiateService value) {
        this.apInitiateService = value;
    }

    /**
     * Gets the value of the apCheckStatusService property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckStatusService }
     *     
     */
    public APCheckStatusService getApCheckStatusService() {
        return apCheckStatusService;
    }

    /**
     * Sets the value of the apCheckStatusService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckStatusService }
     *     
     */
    public void setApCheckStatusService(APCheckStatusService value) {
        this.apCheckStatusService = value;
    }

    /**
     * Gets the value of the ignoreCardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCardExpiration() {
        return ignoreCardExpiration;
    }

    /**
     * Sets the value of the ignoreCardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCardExpiration(String value) {
        this.ignoreCardExpiration = value;
    }

    /**
     * Gets the value of the reportGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportGroup() {
        return reportGroup;
    }

    /**
     * Sets the value of the reportGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportGroup(String value) {
        this.reportGroup = value;
    }

    /**
     * Gets the value of the processorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorID() {
        return processorID;
    }

    /**
     * Sets the value of the processorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorID(String value) {
        this.processorID = value;
    }

    /**
     * Gets the value of the thirdPartyCertificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCertificationNumber() {
        return thirdPartyCertificationNumber;
    }

    /**
     * Sets the value of the thirdPartyCertificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCertificationNumber(String value) {
        this.thirdPartyCertificationNumber = value;
    }

    /**
     * Gets the value of the transactionLocalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLocalDateTime() {
        return transactionLocalDateTime;
    }

    /**
     * Sets the value of the transactionLocalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLocalDateTime(String value) {
        this.transactionLocalDateTime = value;
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
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeAmount(String value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the surchargeSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeSign() {
        return surchargeSign;
    }

    /**
     * Sets the value of the surchargeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeSign(String value) {
        this.surchargeSign = value;
    }

    /**
     * Gets the value of the pinDataEncryptedPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataEncryptedPIN() {
        return pinDataEncryptedPIN;
    }

    /**
     * Sets the value of the pinDataEncryptedPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataEncryptedPIN(String value) {
        this.pinDataEncryptedPIN = value;
    }

    /**
     * Gets the value of the pinDataKeySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataKeySerialNumber() {
        return pinDataKeySerialNumber;
    }

    /**
     * Sets the value of the pinDataKeySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataKeySerialNumber(String value) {
        this.pinDataKeySerialNumber = value;
    }

    /**
     * Gets the value of the cashbackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashbackAmount() {
        return cashbackAmount;
    }

    /**
     * Sets the value of the cashbackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashbackAmount(String value) {
        this.cashbackAmount = value;
    }

    /**
     * Gets the value of the pinDebitPurchaseService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public PinDebitPurchaseService getPinDebitPurchaseService() {
        return pinDebitPurchaseService;
    }

    /**
     * Sets the value of the pinDebitPurchaseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public void setPinDebitPurchaseService(PinDebitPurchaseService value) {
        this.pinDebitPurchaseService = value;
    }

    /**
     * Gets the value of the pinDebitCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditService }
     *     
     */
    public PinDebitCreditService getPinDebitCreditService() {
        return pinDebitCreditService;
    }

    /**
     * Sets the value of the pinDebitCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditService }
     *     
     */
    public void setPinDebitCreditService(PinDebitCreditService value) {
        this.pinDebitCreditService = value;
    }

    /**
     * Gets the value of the pinDebitReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalService }
     *     
     */
    public PinDebitReversalService getPinDebitReversalService() {
        return pinDebitReversalService;
    }

    /**
     * Sets the value of the pinDebitReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalService }
     *     
     */
    public void setPinDebitReversalService(PinDebitReversalService value) {
        this.pinDebitReversalService = value;
    }

    /**
     * Gets the value of the ap property.
     * 
     * @return
     *     possible object is
     *     {@link AP }
     *     
     */
    public AP getAp() {
        return ap;
    }

    /**
     * Sets the value of the ap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AP }
     *     
     */
    public void setAp(AP value) {
        this.ap = value;
    }

    /**
     * Gets the value of the apAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthService }
     *     
     */
    public APAuthService getApAuthService() {
        return apAuthService;
    }

    /**
     * Sets the value of the apAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthService }
     *     
     */
    public void setApAuthService(APAuthService value) {
        this.apAuthService = value;
    }

    /**
     * Gets the value of the apAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReversalService }
     *     
     */
    public APAuthReversalService getApAuthReversalService() {
        return apAuthReversalService;
    }

    /**
     * Sets the value of the apAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReversalService }
     *     
     */
    public void setApAuthReversalService(APAuthReversalService value) {
        this.apAuthReversalService = value;
    }

    /**
     * Gets the value of the apCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link APCaptureService }
     *     
     */
    public APCaptureService getApCaptureService() {
        return apCaptureService;
    }

    /**
     * Sets the value of the apCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCaptureService }
     *     
     */
    public void setApCaptureService(APCaptureService value) {
        this.apCaptureService = value;
    }

    /**
     * Gets the value of the apOptionsService property.
     * 
     * @return
     *     possible object is
     *     {@link APOptionsService }
     *     
     */
    public APOptionsService getApOptionsService() {
        return apOptionsService;
    }

    /**
     * Sets the value of the apOptionsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOptionsService }
     *     
     */
    public void setApOptionsService(APOptionsService value) {
        this.apOptionsService = value;
    }

    /**
     * Gets the value of the apRefundService property.
     * 
     * @return
     *     possible object is
     *     {@link APRefundService }
     *     
     */
    public APRefundService getApRefundService() {
        return apRefundService;
    }

    /**
     * Sets the value of the apRefundService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APRefundService }
     *     
     */
    public void setApRefundService(APRefundService value) {
        this.apRefundService = value;
    }

    /**
     * Gets the value of the apSaleService property.
     * 
     * @return
     *     possible object is
     *     {@link APSaleService }
     *     
     */
    public APSaleService getApSaleService() {
        return apSaleService;
    }

    /**
     * Sets the value of the apSaleService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSaleService }
     *     
     */
    public void setApSaleService(APSaleService value) {
        this.apSaleService = value;
    }

    /**
     * Gets the value of the apCheckoutDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public APCheckOutDetailsService getApCheckoutDetailsService() {
        return apCheckoutDetailsService;
    }

    /**
     * Sets the value of the apCheckoutDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public void setApCheckoutDetailsService(APCheckOutDetailsService value) {
        this.apCheckoutDetailsService = value;
    }

    /**
     * Gets the value of the apSessionsService property.
     * 
     * @return
     *     possible object is
     *     {@link APSessionsService }
     *     
     */
    public APSessionsService getApSessionsService() {
        return apSessionsService;
    }

    /**
     * Sets the value of the apSessionsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSessionsService }
     *     
     */
    public void setApSessionsService(APSessionsService value) {
        this.apSessionsService = value;
    }

    /**
     * Gets the value of the apUI property.
     * 
     * @return
     *     possible object is
     *     {@link APUI }
     *     
     */
    public APUI getApUI() {
        return apUI;
    }

    /**
     * Sets the value of the apUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link APUI }
     *     
     */
    public void setApUI(APUI value) {
        this.apUI = value;
    }

    /**
     * Gets the value of the apTransactionDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public APTransactionDetailsService getApTransactionDetailsService() {
        return apTransactionDetailsService;
    }

    /**
     * Sets the value of the apTransactionDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public void setApTransactionDetailsService(APTransactionDetailsService value) {
        this.apTransactionDetailsService = value;
    }

    /**
     * Gets the value of the apConfirmPurchaseService property.
     * 
     * @return
     *     possible object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public APConfirmPurchaseService getApConfirmPurchaseService() {
        return apConfirmPurchaseService;
    }

    /**
     * Sets the value of the apConfirmPurchaseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public void setApConfirmPurchaseService(APConfirmPurchaseService value) {
        this.apConfirmPurchaseService = value;
    }

    /**
     * Gets the value of the payPalGetTxnDetailsService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public PayPalGetTxnDetailsService getPayPalGetTxnDetailsService() {
        return payPalGetTxnDetailsService;
    }

    /**
     * Sets the value of the payPalGetTxnDetailsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public void setPayPalGetTxnDetailsService(PayPalGetTxnDetailsService value) {
        this.payPalGetTxnDetailsService = value;
    }

    /**
     * Gets the value of the payPalTransactionSearchService property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public PayPalTransactionSearchService getPayPalTransactionSearchService() {
        return payPalTransactionSearchService;
    }

    /**
     * Sets the value of the payPalTransactionSearchService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public void setPayPalTransactionSearchService(PayPalTransactionSearchService value) {
        this.payPalTransactionSearchService = value;
    }

    /**
     * Gets the value of the ccDCCUpdateService property.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public CCDCCUpdateService getCcDCCUpdateService() {
        return ccDCCUpdateService;
    }

    /**
     * Sets the value of the ccDCCUpdateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public void setCcDCCUpdateService(CCDCCUpdateService value) {
        this.ccDCCUpdateService = value;
    }

    /**
     * Gets the value of the emvRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EmvRequest }
     *     
     */
    public EmvRequest getEmvRequest() {
        return emvRequest;
    }

    /**
     * Sets the value of the emvRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvRequest }
     *     
     */
    public void setEmvRequest(EmvRequest value) {
        this.emvRequest = value;
    }

    /**
     * Gets the value of the merchantTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionIdentifier() {
        return merchantTransactionIdentifier;
    }

    /**
     * Sets the value of the merchantTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionIdentifier(String value) {
        this.merchantTransactionIdentifier = value;
    }

    /**
     * Gets the value of the hostedDataCreateService property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataCreateService }
     *     
     */
    public HostedDataCreateService getHostedDataCreateService() {
        return hostedDataCreateService;
    }

    /**
     * Sets the value of the hostedDataCreateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataCreateService }
     *     
     */
    public void setHostedDataCreateService(HostedDataCreateService value) {
        this.hostedDataCreateService = value;
    }

    /**
     * Gets the value of the hostedDataRetrieveService property.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public HostedDataRetrieveService getHostedDataRetrieveService() {
        return hostedDataRetrieveService;
    }

    /**
     * Sets the value of the hostedDataRetrieveService property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public void setHostedDataRetrieveService(HostedDataRetrieveService value) {
        this.hostedDataRetrieveService = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
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
     * Gets the value of the merchandiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    /**
     * Sets the value of the merchandiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseCode(String value) {
        this.merchandiseCode = value;
    }

    /**
     * Gets the value of the merchandiseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseDescription() {
        return merchandiseDescription;
    }

    /**
     * Sets the value of the merchandiseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseDescription(String value) {
        this.merchandiseDescription = value;
    }

    /**
     * Gets the value of the paymentInitiationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInitiationChannel() {
        return paymentInitiationChannel;
    }

    /**
     * Sets the value of the paymentInitiationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInitiationChannel(String value) {
        this.paymentInitiationChannel = value;
    }

    /**
     * Gets the value of the extendedCreditTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCreditTotalCount() {
        return extendedCreditTotalCount;
    }

    /**
     * Sets the value of the extendedCreditTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCreditTotalCount(String value) {
        this.extendedCreditTotalCount = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the autoRentalData property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRentalData }
     *     
     */
    public AutoRentalData getAutoRentalData() {
        return autoRentalData;
    }

    /**
     * Sets the value of the autoRentalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRentalData }
     *     
     */
    public void setAutoRentalData(AutoRentalData value) {
        this.autoRentalData = value;
    }

    /**
     * Gets the value of the paymentSolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSolution() {
        return paymentSolution;
    }

    /**
     * Sets the value of the paymentSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSolution(String value) {
        this.paymentSolution = value;
    }

    /**
     * Gets the value of the vc property.
     * 
     * @return
     *     possible object is
     *     {@link VC }
     *     
     */
    public VC getVc() {
        return vc;
    }

    /**
     * Sets the value of the vc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VC }
     *     
     */
    public void setVc(VC value) {
        this.vc = value;
    }

    /**
     * Gets the value of the decryptVisaCheckoutDataService property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public DecryptVisaCheckoutDataService getDecryptVisaCheckoutDataService() {
        return decryptVisaCheckoutDataService;
    }

    /**
     * Sets the value of the decryptVisaCheckoutDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public void setDecryptVisaCheckoutDataService(DecryptVisaCheckoutDataService value) {
        this.decryptVisaCheckoutDataService = value;
    }

    /**
     * Gets the value of the taxManagementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxManagementIndicator() {
        return taxManagementIndicator;
    }

    /**
     * Sets the value of the taxManagementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxManagementIndicator(String value) {
        this.taxManagementIndicator = value;
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
     * {@link PromotionGroup }
     * 
     * 
     */
    public List<PromotionGroup> getPromotionGroup() {
        if (promotionGroup == null) {
            promotionGroup = new ArrayList<PromotionGroup>();
        }
        return this.promotionGroup;
    }

    /**
     * Gets the value of the wallet property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet }
     *     
     */
    public Wallet getWallet() {
        return wallet;
    }

    /**
     * Sets the value of the wallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet }
     *     
     */
    public void setWallet(Wallet value) {
        this.wallet = value;
    }

    /**
     * Gets the value of the aft property.
     * 
     * @return
     *     possible object is
     *     {@link Aft }
     *     
     */
    public Aft getAft() {
        return aft;
    }

    /**
     * Sets the value of the aft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aft }
     *     
     */
    public void setAft(Aft value) {
        this.aft = value;
    }

    /**
     * Gets the value of the balanceInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceInquiry() {
        return balanceInquiry;
    }

    /**
     * Sets the value of the balanceInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceInquiry(String value) {
        this.balanceInquiry = value;
    }

    /**
     * Gets the value of the prenoteTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenoteTransaction() {
        return prenoteTransaction;
    }

    /**
     * Sets the value of the prenoteTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenoteTransaction(String value) {
        this.prenoteTransaction = value;
    }

    /**
     * Gets the value of the encryptPaymentDataService property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public EncryptPaymentDataService getEncryptPaymentDataService() {
        return encryptPaymentDataService;
    }

    /**
     * Sets the value of the encryptPaymentDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public void setEncryptPaymentDataService(EncryptPaymentDataService value) {
        this.encryptPaymentDataService = value;
    }

    /**
     * Gets the value of the nationalNetDomesticData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalNetDomesticData() {
        return nationalNetDomesticData;
    }

    /**
     * Sets the value of the nationalNetDomesticData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalNetDomesticData(String value) {
        this.nationalNetDomesticData = value;
    }

    /**
     * Gets the value of the subsequentAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuth() {
        return subsequentAuth;
    }

    /**
     * Sets the value of the subsequentAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuth(String value) {
        this.subsequentAuth = value;
    }

    /**
     * Gets the value of the binLookupService property.
     * 
     * @return
     *     possible object is
     *     {@link BinLookupService }
     *     
     */
    public BinLookupService getBinLookupService() {
        return binLookupService;
    }

    /**
     * Sets the value of the binLookupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinLookupService }
     *     
     */
    public void setBinLookupService(BinLookupService value) {
        this.binLookupService = value;
    }

    /**
     * Gets the value of the verificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets the value of the verificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
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
     * Gets the value of the partnerSolutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSolutionID() {
        return partnerSolutionID;
    }

    /**
     * Sets the value of the partnerSolutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSolutionID(String value) {
        this.partnerSolutionID = value;
    }

    /**
     * Gets the value of the developerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperID() {
        return developerID;
    }

    /**
     * Sets the value of the developerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperID(String value) {
        this.developerID = value;
    }

    /**
     * Gets the value of the getVisaCheckoutDataService property.
     * 
     * @return
     *     possible object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public GETVisaCheckoutDataService getGetVisaCheckoutDataService() {
        return getVisaCheckoutDataService;
    }

    /**
     * Sets the value of the getVisaCheckoutDataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public void setGetVisaCheckoutDataService(GETVisaCheckoutDataService value) {
        this.getVisaCheckoutDataService = value;
    }

    /**
     * Gets the value of the customerSignatureImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignatureImage() {
        return customerSignatureImage;
    }

    /**
     * Sets the value of the customerSignatureImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignatureImage(String value) {
        this.customerSignatureImage = value;
    }

    /**
     * Gets the value of the transactionMetadataService property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMetadataService }
     *     
     */
    public TransactionMetadataService getTransactionMetadataService() {
        return transactionMetadataService;
    }

    /**
     * Sets the value of the transactionMetadataService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMetadataService }
     *     
     */
    public void setTransactionMetadataService(TransactionMetadataService value) {
        this.transactionMetadataService = value;
    }

    /**
     * Gets the value of the subsequentAuthFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthFirst() {
        return subsequentAuthFirst;
    }

    /**
     * Sets the value of the subsequentAuthFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthFirst(String value) {
        this.subsequentAuthFirst = value;
    }

    /**
     * Gets the value of the subsequentAuthReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthReason() {
        return subsequentAuthReason;
    }

    /**
     * Sets the value of the subsequentAuthReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthReason(String value) {
        this.subsequentAuthReason = value;
    }

    /**
     * Gets the value of the subsequentAuthTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthTransactionID() {
        return subsequentAuthTransactionID;
    }

    /**
     * Sets the value of the subsequentAuthTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthTransactionID(String value) {
        this.subsequentAuthTransactionID = value;
    }

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link Loan }
     *     
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan }
     *     
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

    /**
     * Gets the value of the eligibilityInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityInquiry() {
        return eligibilityInquiry;
    }

    /**
     * Sets the value of the eligibilityInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityInquiry(String value) {
        this.eligibilityInquiry = value;
    }

    /**
     * Gets the value of the redemptionInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionInquiry() {
        return redemptionInquiry;
    }

    /**
     * Sets the value of the redemptionInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionInquiry(String value) {
        this.redemptionInquiry = value;
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
     * Gets the value of the apOrderService property.
     * 
     * @return
     *     possible object is
     *     {@link APOrderService }
     *     
     */
    public APOrderService getApOrderService() {
        return apOrderService;
    }

    /**
     * Sets the value of the apOrderService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APOrderService }
     *     
     */
    public void setApOrderService(APOrderService value) {
        this.apOrderService = value;
    }

    /**
     * Gets the value of the apCancelService property.
     * 
     * @return
     *     possible object is
     *     {@link APCancelService }
     *     
     */
    public APCancelService getApCancelService() {
        return apCancelService;
    }

    /**
     * Sets the value of the apCancelService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APCancelService }
     *     
     */
    public void setApCancelService(APCancelService value) {
        this.apCancelService = value;
    }

    /**
     * Gets the value of the apBillingAgreementService property.
     * 
     * @return
     *     possible object is
     *     {@link APBillingAgreementService }
     *     
     */
    public APBillingAgreementService getApBillingAgreementService() {
        return apBillingAgreementService;
    }

    /**
     * Sets the value of the apBillingAgreementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link APBillingAgreementService }
     *     
     */
    public void setApBillingAgreementService(APBillingAgreementService value) {
        this.apBillingAgreementService = value;
    }

    /**
     * Gets the value of the noteToPayee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayee() {
        return noteToPayee;
    }

    /**
     * Sets the value of the noteToPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayee(String value) {
        this.noteToPayee = value;
    }

    /**
     * Gets the value of the noteToPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Sets the value of the noteToPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayer(String value) {
        this.noteToPayer = value;
    }

    /**
     * Gets the value of the partnerSDKversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSDKversion() {
        return partnerSDKversion;
    }

    /**
     * Sets the value of the partnerSDKversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSDKversion(String value) {
        this.partnerSDKversion = value;
    }

    /**
     * Gets the value of the partnerOriginalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerOriginalTransactionID() {
        return partnerOriginalTransactionID;
    }

    /**
     * Sets the value of the partnerOriginalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerOriginalTransactionID(String value) {
        this.partnerOriginalTransactionID = value;
    }

    /**
     * Gets the value of the cardTypeSelectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeSelectionIndicator() {
        return cardTypeSelectionIndicator;
    }

    /**
     * Sets the value of the cardTypeSelectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeSelectionIndicator(String value) {
        this.cardTypeSelectionIndicator = value;
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
