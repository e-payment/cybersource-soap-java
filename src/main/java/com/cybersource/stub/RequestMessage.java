/**
 * RequestMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class RequestMessage  implements java.io.Serializable {
    private java.lang.String merchantID;

    private java.lang.String merchantReferenceCode;

    private java.lang.String debtIndicator;

    private java.lang.String clientLibrary;

    private java.lang.String clientLibraryVersion;

    private java.lang.String clientEnvironment;

    private java.lang.String clientSecurityLibraryVersion;

    private java.lang.String clientApplication;

    private java.lang.String clientApplicationVersion;

    private java.lang.String clientApplicationUser;

    private java.lang.String routingCode;

    private java.lang.String comments;

    private java.lang.String returnURL;

    private com.cybersource.stub.InvoiceHeader invoiceHeader;

    private java.lang.String aggregatorMerchantIdentifier;

    private java.lang.String customerID;

    private java.lang.String customerFirstName;

    private java.lang.String customerLastName;

    private com.cybersource.stub.BillTo billTo;

    private com.cybersource.stub.ShipTo shipTo;

    private com.cybersource.stub.PersonalID personalID;

    private com.cybersource.stub.ShipFrom shipFrom;

    private com.cybersource.stub.Item[] item;

    private com.cybersource.stub.PurchaseTotals purchaseTotals;

    private com.cybersource.stub.FundingTotals fundingTotals;

    private com.cybersource.stub.DCC dcc;

    private com.cybersource.stub.Pos pos;

    private com.cybersource.stub.Pin pin;

    private com.cybersource.stub.EncryptedPayment encryptedPayment;

    private com.cybersource.stub.Installment installment;

    private com.cybersource.stub.Card card;

    private com.cybersource.stub.Check check;

    private com.cybersource.stub.BML bml;

    private com.cybersource.stub.GECC gecc;

    private com.cybersource.stub.UCAF ucaf;

    private com.cybersource.stub.FundTransfer fundTransfer;

    private com.cybersource.stub.BankInfo bankInfo;

    private com.cybersource.stub.Subscription subscription;

    private com.cybersource.stub.RecurringSubscriptionInfo recurringSubscriptionInfo;

    private com.cybersource.stub.DecisionManager decisionManager;

    private com.cybersource.stub.OtherTax otherTax;

    private com.cybersource.stub.PayPal paypal;

    private com.cybersource.stub.MerchantDefinedData merchantDefinedData;

    private com.cybersource.stub.MerchantSecureData merchantSecureData;

    private com.cybersource.stub.JPO jpo;

    private java.lang.String orderRequestToken;

    private java.lang.String linkToRequest;

    private com.cybersource.stub.ServiceFee serviceFee;

    private com.cybersource.stub.CCAuthService ccAuthService;

    private com.cybersource.stub.OCTService octService;

    private com.cybersource.stub.VerificationService verificationService;

    private com.cybersource.stub.CCSaleService ccSaleService;

    private com.cybersource.stub.CCSaleCreditService ccSaleCreditService;

    private com.cybersource.stub.CCSaleReversalService ccSaleReversalService;

    private com.cybersource.stub.CCIncrementalAuthService ccIncrementalAuthService;

    private com.cybersource.stub.CCCaptureService ccCaptureService;

    private com.cybersource.stub.CCCreditService ccCreditService;

    private com.cybersource.stub.CCAuthReversalService ccAuthReversalService;

    private com.cybersource.stub.CCAutoAuthReversalService ccAutoAuthReversalService;

    private com.cybersource.stub.CCDCCService ccDCCService;

    private com.cybersource.stub.ServiceFeeCalculateService serviceFeeCalculateService;

    private com.cybersource.stub.ECDebitService ecDebitService;

    private com.cybersource.stub.ECCreditService ecCreditService;

    private com.cybersource.stub.ECAuthenticateService ecAuthenticateService;

    private com.cybersource.stub.PayerAuthEnrollService payerAuthEnrollService;

    private com.cybersource.stub.PayerAuthValidateService payerAuthValidateService;

    private com.cybersource.stub.TaxService taxService;

    private com.cybersource.stub.DMEService dmeService;

    private com.cybersource.stub.AFSService afsService;

    private com.cybersource.stub.DAVService davService;

    private com.cybersource.stub.ExportService exportService;

    private com.cybersource.stub.FXRatesService fxRatesService;

    private com.cybersource.stub.BankTransferService bankTransferService;

    private com.cybersource.stub.BankTransferRefundService bankTransferRefundService;

    private com.cybersource.stub.BankTransferRealTimeService bankTransferRealTimeService;

    private com.cybersource.stub.DirectDebitMandateService directDebitMandateService;

    private com.cybersource.stub.DirectDebitService directDebitService;

    private com.cybersource.stub.DirectDebitRefundService directDebitRefundService;

    private com.cybersource.stub.DirectDebitValidateService directDebitValidateService;

    private com.cybersource.stub.PaySubscriptionCreateService paySubscriptionCreateService;

    private com.cybersource.stub.PaySubscriptionUpdateService paySubscriptionUpdateService;

    private com.cybersource.stub.PaySubscriptionEventUpdateService paySubscriptionEventUpdateService;

    private com.cybersource.stub.PaySubscriptionRetrieveService paySubscriptionRetrieveService;

    private com.cybersource.stub.PaySubscriptionDeleteService paySubscriptionDeleteService;

    private com.cybersource.stub.PayPalPaymentService payPalPaymentService;

    private com.cybersource.stub.PayPalCreditService payPalCreditService;

    private com.cybersource.stub.VoidService voidService;

    private com.cybersource.stub.BusinessRules businessRules;

    private com.cybersource.stub.PinlessDebitService pinlessDebitService;

    private com.cybersource.stub.PinlessDebitValidateService pinlessDebitValidateService;

    private com.cybersource.stub.PinlessDebitReversalService pinlessDebitReversalService;

    private com.cybersource.stub.Batch batch;

    private com.cybersource.stub.AirlineData airlineData;

    private com.cybersource.stub.AncillaryData ancillaryData;

    private com.cybersource.stub.LodgingData lodgingData;

    private com.cybersource.stub.PayPalButtonCreateService payPalButtonCreateService;

    private com.cybersource.stub.PayPalPreapprovedPaymentService payPalPreapprovedPaymentService;

    private com.cybersource.stub.PayPalPreapprovedUpdateService payPalPreapprovedUpdateService;

    private com.cybersource.stub.RiskUpdateService riskUpdateService;

    private com.cybersource.stub.FraudUpdateService fraudUpdateService;

    private com.cybersource.stub.CaseManagementActionService caseManagementActionService;

    private com.cybersource.stub.RequestReserved[] reserved;

    private java.lang.String deviceFingerprintID;

    private java.lang.String deviceFingerprintRaw;

    private java.lang.String deviceFingerprintHash;

    private com.cybersource.stub.PayPalRefundService payPalRefundService;

    private com.cybersource.stub.PayPalAuthReversalService payPalAuthReversalService;

    private com.cybersource.stub.PayPalDoCaptureService payPalDoCaptureService;

    private com.cybersource.stub.PayPalEcDoPaymentService payPalEcDoPaymentService;

    private com.cybersource.stub.PayPalEcGetDetailsService payPalEcGetDetailsService;

    private com.cybersource.stub.PayPalEcSetService payPalEcSetService;

    private com.cybersource.stub.PayPalEcOrderSetupService payPalEcOrderSetupService;

    private com.cybersource.stub.PayPalAuthorizationService payPalAuthorizationService;

    private com.cybersource.stub.PayPalUpdateAgreementService payPalUpdateAgreementService;

    private com.cybersource.stub.PayPalCreateAgreementService payPalCreateAgreementService;

    private com.cybersource.stub.PayPalDoRefTransactionService payPalDoRefTransactionService;

    private com.cybersource.stub.ChinaPaymentService chinaPaymentService;

    private com.cybersource.stub.ChinaRefundService chinaRefundService;

    private com.cybersource.stub.BoletoPaymentService boletoPaymentService;

    private java.lang.String apPaymentType;

    private com.cybersource.stub.APInitiateService apInitiateService;

    private com.cybersource.stub.APCheckStatusService apCheckStatusService;

    private java.lang.String ignoreCardExpiration;

    private java.lang.String reportGroup;

    private java.lang.String processorID;

    private java.lang.String thirdPartyCertificationNumber;

    private java.lang.String transactionLocalDateTime;

    private java.lang.String solutionProviderTransactionID;

    private java.lang.String surchargeAmount;

    private java.lang.String surchargeSign;

    private java.lang.String pinDataEncryptedPIN;

    private java.lang.String pinDataKeySerialNumber;

    private java.lang.String cashbackAmount;

    private com.cybersource.stub.PinDebitPurchaseService pinDebitPurchaseService;

    private com.cybersource.stub.PinDebitCreditService pinDebitCreditService;

    private com.cybersource.stub.PinDebitReversalService pinDebitReversalService;

    private com.cybersource.stub.AP ap;

    private com.cybersource.stub.APAuthService apAuthService;

    private com.cybersource.stub.APAuthReversalService apAuthReversalService;

    private com.cybersource.stub.APCaptureService apCaptureService;

    private com.cybersource.stub.APOptionsService apOptionsService;

    private com.cybersource.stub.APRefundService apRefundService;

    private com.cybersource.stub.APSaleService apSaleService;

    private com.cybersource.stub.APCheckOutDetailsService apCheckoutDetailsService;

    private com.cybersource.stub.APSessionsService apSessionsService;

    private com.cybersource.stub.APUI apUI;

    private com.cybersource.stub.APTransactionDetailsService apTransactionDetailsService;

    private com.cybersource.stub.APConfirmPurchaseService apConfirmPurchaseService;

    private com.cybersource.stub.PayPalGetTxnDetailsService payPalGetTxnDetailsService;

    private com.cybersource.stub.PayPalTransactionSearchService payPalTransactionSearchService;

    private com.cybersource.stub.CCDCCUpdateService ccDCCUpdateService;

    private com.cybersource.stub.EmvRequest emvRequest;

    private java.lang.String merchantTransactionIdentifier;

    private com.cybersource.stub.HostedDataCreateService hostedDataCreateService;

    private com.cybersource.stub.HostedDataRetrieveService hostedDataRetrieveService;

    private java.lang.String merchantCategoryCode;

    private java.lang.String salesSlipNumber;

    private java.lang.String merchandiseCode;

    private java.lang.String merchandiseDescription;

    private java.lang.String paymentInitiationChannel;

    private java.lang.String extendedCreditTotalCount;

    private java.lang.String authIndicator;

    private com.cybersource.stub.PaymentNetworkToken paymentNetworkToken;

    private com.cybersource.stub.Recipient recipient;

    private com.cybersource.stub.Sender sender;

    private com.cybersource.stub.AutoRentalData autoRentalData;

    private java.lang.String paymentSolution;

    private com.cybersource.stub.VC vc;

    private com.cybersource.stub.DecryptVisaCheckoutDataService decryptVisaCheckoutDataService;

    private java.lang.String taxManagementIndicator;

    private com.cybersource.stub.PromotionGroup[] promotionGroup;

    private com.cybersource.stub.Wallet wallet;

    private com.cybersource.stub.Aft aft;

    private java.lang.String balanceInquiry;

    private java.lang.String prenoteTransaction;

    private com.cybersource.stub.EncryptPaymentDataService encryptPaymentDataService;

    private java.lang.String nationalNetDomesticData;

    private java.lang.String subsequentAuth;

    private com.cybersource.stub.BinLookupService binLookupService;

    private java.lang.String verificationCode;

    private java.lang.String mobileNumber;

    private com.cybersource.stub.Issuer issuer;

    private java.lang.String partnerSolutionID;

    private java.lang.String developerID;

    private com.cybersource.stub.GETVisaCheckoutDataService getVisaCheckoutDataService;

    private java.lang.String customerSignatureImage;

    private com.cybersource.stub.TransactionMetadataService transactionMetadataService;

    private java.lang.String subsequentAuthFirst;

    private java.lang.String subsequentAuthReason;

    private java.lang.String subsequentAuthTransactionID;

    private com.cybersource.stub.Loan loan;

    private java.lang.String eligibilityInquiry;

    private java.lang.String redemptionInquiry;

    private java.lang.String feeProgramIndicator;

    private com.cybersource.stub.APOrderService apOrderService;

    private com.cybersource.stub.APCancelService apCancelService;

    private com.cybersource.stub.APBillingAgreementService apBillingAgreementService;

    private java.lang.String note_toPayee;

    private java.lang.String note_toPayer;

    private java.lang.String partnerSDKversion;

    private java.lang.String partnerOriginalTransactionID;

    private java.lang.String cardTypeSelectionIndicator;

    public RequestMessage() {
    }

    public RequestMessage(
           java.lang.String merchantID,
           java.lang.String merchantReferenceCode,
           java.lang.String debtIndicator,
           java.lang.String clientLibrary,
           java.lang.String clientLibraryVersion,
           java.lang.String clientEnvironment,
           java.lang.String clientSecurityLibraryVersion,
           java.lang.String clientApplication,
           java.lang.String clientApplicationVersion,
           java.lang.String clientApplicationUser,
           java.lang.String routingCode,
           java.lang.String comments,
           java.lang.String returnURL,
           com.cybersource.stub.InvoiceHeader invoiceHeader,
           java.lang.String aggregatorMerchantIdentifier,
           java.lang.String customerID,
           java.lang.String customerFirstName,
           java.lang.String customerLastName,
           com.cybersource.stub.BillTo billTo,
           com.cybersource.stub.ShipTo shipTo,
           com.cybersource.stub.PersonalID personalID,
           com.cybersource.stub.ShipFrom shipFrom,
           com.cybersource.stub.Item[] item,
           com.cybersource.stub.PurchaseTotals purchaseTotals,
           com.cybersource.stub.FundingTotals fundingTotals,
           com.cybersource.stub.DCC dcc,
           com.cybersource.stub.Pos pos,
           com.cybersource.stub.Pin pin,
           com.cybersource.stub.EncryptedPayment encryptedPayment,
           com.cybersource.stub.Installment installment,
           com.cybersource.stub.Card card,
           com.cybersource.stub.Check check,
           com.cybersource.stub.BML bml,
           com.cybersource.stub.GECC gecc,
           com.cybersource.stub.UCAF ucaf,
           com.cybersource.stub.FundTransfer fundTransfer,
           com.cybersource.stub.BankInfo bankInfo,
           com.cybersource.stub.Subscription subscription,
           com.cybersource.stub.RecurringSubscriptionInfo recurringSubscriptionInfo,
           com.cybersource.stub.DecisionManager decisionManager,
           com.cybersource.stub.OtherTax otherTax,
           com.cybersource.stub.PayPal paypal,
           com.cybersource.stub.MerchantDefinedData merchantDefinedData,
           com.cybersource.stub.MerchantSecureData merchantSecureData,
           com.cybersource.stub.JPO jpo,
           java.lang.String orderRequestToken,
           java.lang.String linkToRequest,
           com.cybersource.stub.ServiceFee serviceFee,
           com.cybersource.stub.CCAuthService ccAuthService,
           com.cybersource.stub.OCTService octService,
           com.cybersource.stub.VerificationService verificationService,
           com.cybersource.stub.CCSaleService ccSaleService,
           com.cybersource.stub.CCSaleCreditService ccSaleCreditService,
           com.cybersource.stub.CCSaleReversalService ccSaleReversalService,
           com.cybersource.stub.CCIncrementalAuthService ccIncrementalAuthService,
           com.cybersource.stub.CCCaptureService ccCaptureService,
           com.cybersource.stub.CCCreditService ccCreditService,
           com.cybersource.stub.CCAuthReversalService ccAuthReversalService,
           com.cybersource.stub.CCAutoAuthReversalService ccAutoAuthReversalService,
           com.cybersource.stub.CCDCCService ccDCCService,
           com.cybersource.stub.ServiceFeeCalculateService serviceFeeCalculateService,
           com.cybersource.stub.ECDebitService ecDebitService,
           com.cybersource.stub.ECCreditService ecCreditService,
           com.cybersource.stub.ECAuthenticateService ecAuthenticateService,
           com.cybersource.stub.PayerAuthEnrollService payerAuthEnrollService,
           com.cybersource.stub.PayerAuthValidateService payerAuthValidateService,
           com.cybersource.stub.TaxService taxService,
           com.cybersource.stub.DMEService dmeService,
           com.cybersource.stub.AFSService afsService,
           com.cybersource.stub.DAVService davService,
           com.cybersource.stub.ExportService exportService,
           com.cybersource.stub.FXRatesService fxRatesService,
           com.cybersource.stub.BankTransferService bankTransferService,
           com.cybersource.stub.BankTransferRefundService bankTransferRefundService,
           com.cybersource.stub.BankTransferRealTimeService bankTransferRealTimeService,
           com.cybersource.stub.DirectDebitMandateService directDebitMandateService,
           com.cybersource.stub.DirectDebitService directDebitService,
           com.cybersource.stub.DirectDebitRefundService directDebitRefundService,
           com.cybersource.stub.DirectDebitValidateService directDebitValidateService,
           com.cybersource.stub.PaySubscriptionCreateService paySubscriptionCreateService,
           com.cybersource.stub.PaySubscriptionUpdateService paySubscriptionUpdateService,
           com.cybersource.stub.PaySubscriptionEventUpdateService paySubscriptionEventUpdateService,
           com.cybersource.stub.PaySubscriptionRetrieveService paySubscriptionRetrieveService,
           com.cybersource.stub.PaySubscriptionDeleteService paySubscriptionDeleteService,
           com.cybersource.stub.PayPalPaymentService payPalPaymentService,
           com.cybersource.stub.PayPalCreditService payPalCreditService,
           com.cybersource.stub.VoidService voidService,
           com.cybersource.stub.BusinessRules businessRules,
           com.cybersource.stub.PinlessDebitService pinlessDebitService,
           com.cybersource.stub.PinlessDebitValidateService pinlessDebitValidateService,
           com.cybersource.stub.PinlessDebitReversalService pinlessDebitReversalService,
           com.cybersource.stub.Batch batch,
           com.cybersource.stub.AirlineData airlineData,
           com.cybersource.stub.AncillaryData ancillaryData,
           com.cybersource.stub.LodgingData lodgingData,
           com.cybersource.stub.PayPalButtonCreateService payPalButtonCreateService,
           com.cybersource.stub.PayPalPreapprovedPaymentService payPalPreapprovedPaymentService,
           com.cybersource.stub.PayPalPreapprovedUpdateService payPalPreapprovedUpdateService,
           com.cybersource.stub.RiskUpdateService riskUpdateService,
           com.cybersource.stub.FraudUpdateService fraudUpdateService,
           com.cybersource.stub.CaseManagementActionService caseManagementActionService,
           com.cybersource.stub.RequestReserved[] reserved,
           java.lang.String deviceFingerprintID,
           java.lang.String deviceFingerprintRaw,
           java.lang.String deviceFingerprintHash,
           com.cybersource.stub.PayPalRefundService payPalRefundService,
           com.cybersource.stub.PayPalAuthReversalService payPalAuthReversalService,
           com.cybersource.stub.PayPalDoCaptureService payPalDoCaptureService,
           com.cybersource.stub.PayPalEcDoPaymentService payPalEcDoPaymentService,
           com.cybersource.stub.PayPalEcGetDetailsService payPalEcGetDetailsService,
           com.cybersource.stub.PayPalEcSetService payPalEcSetService,
           com.cybersource.stub.PayPalEcOrderSetupService payPalEcOrderSetupService,
           com.cybersource.stub.PayPalAuthorizationService payPalAuthorizationService,
           com.cybersource.stub.PayPalUpdateAgreementService payPalUpdateAgreementService,
           com.cybersource.stub.PayPalCreateAgreementService payPalCreateAgreementService,
           com.cybersource.stub.PayPalDoRefTransactionService payPalDoRefTransactionService,
           com.cybersource.stub.ChinaPaymentService chinaPaymentService,
           com.cybersource.stub.ChinaRefundService chinaRefundService,
           com.cybersource.stub.BoletoPaymentService boletoPaymentService,
           java.lang.String apPaymentType,
           com.cybersource.stub.APInitiateService apInitiateService,
           com.cybersource.stub.APCheckStatusService apCheckStatusService,
           java.lang.String ignoreCardExpiration,
           java.lang.String reportGroup,
           java.lang.String processorID,
           java.lang.String thirdPartyCertificationNumber,
           java.lang.String transactionLocalDateTime,
           java.lang.String solutionProviderTransactionID,
           java.lang.String surchargeAmount,
           java.lang.String surchargeSign,
           java.lang.String pinDataEncryptedPIN,
           java.lang.String pinDataKeySerialNumber,
           java.lang.String cashbackAmount,
           com.cybersource.stub.PinDebitPurchaseService pinDebitPurchaseService,
           com.cybersource.stub.PinDebitCreditService pinDebitCreditService,
           com.cybersource.stub.PinDebitReversalService pinDebitReversalService,
           com.cybersource.stub.AP ap,
           com.cybersource.stub.APAuthService apAuthService,
           com.cybersource.stub.APAuthReversalService apAuthReversalService,
           com.cybersource.stub.APCaptureService apCaptureService,
           com.cybersource.stub.APOptionsService apOptionsService,
           com.cybersource.stub.APRefundService apRefundService,
           com.cybersource.stub.APSaleService apSaleService,
           com.cybersource.stub.APCheckOutDetailsService apCheckoutDetailsService,
           com.cybersource.stub.APSessionsService apSessionsService,
           com.cybersource.stub.APUI apUI,
           com.cybersource.stub.APTransactionDetailsService apTransactionDetailsService,
           com.cybersource.stub.APConfirmPurchaseService apConfirmPurchaseService,
           com.cybersource.stub.PayPalGetTxnDetailsService payPalGetTxnDetailsService,
           com.cybersource.stub.PayPalTransactionSearchService payPalTransactionSearchService,
           com.cybersource.stub.CCDCCUpdateService ccDCCUpdateService,
           com.cybersource.stub.EmvRequest emvRequest,
           java.lang.String merchantTransactionIdentifier,
           com.cybersource.stub.HostedDataCreateService hostedDataCreateService,
           com.cybersource.stub.HostedDataRetrieveService hostedDataRetrieveService,
           java.lang.String merchantCategoryCode,
           java.lang.String salesSlipNumber,
           java.lang.String merchandiseCode,
           java.lang.String merchandiseDescription,
           java.lang.String paymentInitiationChannel,
           java.lang.String extendedCreditTotalCount,
           java.lang.String authIndicator,
           com.cybersource.stub.PaymentNetworkToken paymentNetworkToken,
           com.cybersource.stub.Recipient recipient,
           com.cybersource.stub.Sender sender,
           com.cybersource.stub.AutoRentalData autoRentalData,
           java.lang.String paymentSolution,
           com.cybersource.stub.VC vc,
           com.cybersource.stub.DecryptVisaCheckoutDataService decryptVisaCheckoutDataService,
           java.lang.String taxManagementIndicator,
           com.cybersource.stub.PromotionGroup[] promotionGroup,
           com.cybersource.stub.Wallet wallet,
           com.cybersource.stub.Aft aft,
           java.lang.String balanceInquiry,
           java.lang.String prenoteTransaction,
           com.cybersource.stub.EncryptPaymentDataService encryptPaymentDataService,
           java.lang.String nationalNetDomesticData,
           java.lang.String subsequentAuth,
           com.cybersource.stub.BinLookupService binLookupService,
           java.lang.String verificationCode,
           java.lang.String mobileNumber,
           com.cybersource.stub.Issuer issuer,
           java.lang.String partnerSolutionID,
           java.lang.String developerID,
           com.cybersource.stub.GETVisaCheckoutDataService getVisaCheckoutDataService,
           java.lang.String customerSignatureImage,
           com.cybersource.stub.TransactionMetadataService transactionMetadataService,
           java.lang.String subsequentAuthFirst,
           java.lang.String subsequentAuthReason,
           java.lang.String subsequentAuthTransactionID,
           com.cybersource.stub.Loan loan,
           java.lang.String eligibilityInquiry,
           java.lang.String redemptionInquiry,
           java.lang.String feeProgramIndicator,
           com.cybersource.stub.APOrderService apOrderService,
           com.cybersource.stub.APCancelService apCancelService,
           com.cybersource.stub.APBillingAgreementService apBillingAgreementService,
           java.lang.String note_toPayee,
           java.lang.String note_toPayer,
           java.lang.String partnerSDKversion,
           java.lang.String partnerOriginalTransactionID,
           java.lang.String cardTypeSelectionIndicator) {
           this.merchantID = merchantID;
           this.merchantReferenceCode = merchantReferenceCode;
           this.debtIndicator = debtIndicator;
           this.clientLibrary = clientLibrary;
           this.clientLibraryVersion = clientLibraryVersion;
           this.clientEnvironment = clientEnvironment;
           this.clientSecurityLibraryVersion = clientSecurityLibraryVersion;
           this.clientApplication = clientApplication;
           this.clientApplicationVersion = clientApplicationVersion;
           this.clientApplicationUser = clientApplicationUser;
           this.routingCode = routingCode;
           this.comments = comments;
           this.returnURL = returnURL;
           this.invoiceHeader = invoiceHeader;
           this.aggregatorMerchantIdentifier = aggregatorMerchantIdentifier;
           this.customerID = customerID;
           this.customerFirstName = customerFirstName;
           this.customerLastName = customerLastName;
           this.billTo = billTo;
           this.shipTo = shipTo;
           this.personalID = personalID;
           this.shipFrom = shipFrom;
           this.item = item;
           this.purchaseTotals = purchaseTotals;
           this.fundingTotals = fundingTotals;
           this.dcc = dcc;
           this.pos = pos;
           this.pin = pin;
           this.encryptedPayment = encryptedPayment;
           this.installment = installment;
           this.card = card;
           this.check = check;
           this.bml = bml;
           this.gecc = gecc;
           this.ucaf = ucaf;
           this.fundTransfer = fundTransfer;
           this.bankInfo = bankInfo;
           this.subscription = subscription;
           this.recurringSubscriptionInfo = recurringSubscriptionInfo;
           this.decisionManager = decisionManager;
           this.otherTax = otherTax;
           this.paypal = paypal;
           this.merchantDefinedData = merchantDefinedData;
           this.merchantSecureData = merchantSecureData;
           this.jpo = jpo;
           this.orderRequestToken = orderRequestToken;
           this.linkToRequest = linkToRequest;
           this.serviceFee = serviceFee;
           this.ccAuthService = ccAuthService;
           this.octService = octService;
           this.verificationService = verificationService;
           this.ccSaleService = ccSaleService;
           this.ccSaleCreditService = ccSaleCreditService;
           this.ccSaleReversalService = ccSaleReversalService;
           this.ccIncrementalAuthService = ccIncrementalAuthService;
           this.ccCaptureService = ccCaptureService;
           this.ccCreditService = ccCreditService;
           this.ccAuthReversalService = ccAuthReversalService;
           this.ccAutoAuthReversalService = ccAutoAuthReversalService;
           this.ccDCCService = ccDCCService;
           this.serviceFeeCalculateService = serviceFeeCalculateService;
           this.ecDebitService = ecDebitService;
           this.ecCreditService = ecCreditService;
           this.ecAuthenticateService = ecAuthenticateService;
           this.payerAuthEnrollService = payerAuthEnrollService;
           this.payerAuthValidateService = payerAuthValidateService;
           this.taxService = taxService;
           this.dmeService = dmeService;
           this.afsService = afsService;
           this.davService = davService;
           this.exportService = exportService;
           this.fxRatesService = fxRatesService;
           this.bankTransferService = bankTransferService;
           this.bankTransferRefundService = bankTransferRefundService;
           this.bankTransferRealTimeService = bankTransferRealTimeService;
           this.directDebitMandateService = directDebitMandateService;
           this.directDebitService = directDebitService;
           this.directDebitRefundService = directDebitRefundService;
           this.directDebitValidateService = directDebitValidateService;
           this.paySubscriptionCreateService = paySubscriptionCreateService;
           this.paySubscriptionUpdateService = paySubscriptionUpdateService;
           this.paySubscriptionEventUpdateService = paySubscriptionEventUpdateService;
           this.paySubscriptionRetrieveService = paySubscriptionRetrieveService;
           this.paySubscriptionDeleteService = paySubscriptionDeleteService;
           this.payPalPaymentService = payPalPaymentService;
           this.payPalCreditService = payPalCreditService;
           this.voidService = voidService;
           this.businessRules = businessRules;
           this.pinlessDebitService = pinlessDebitService;
           this.pinlessDebitValidateService = pinlessDebitValidateService;
           this.pinlessDebitReversalService = pinlessDebitReversalService;
           this.batch = batch;
           this.airlineData = airlineData;
           this.ancillaryData = ancillaryData;
           this.lodgingData = lodgingData;
           this.payPalButtonCreateService = payPalButtonCreateService;
           this.payPalPreapprovedPaymentService = payPalPreapprovedPaymentService;
           this.payPalPreapprovedUpdateService = payPalPreapprovedUpdateService;
           this.riskUpdateService = riskUpdateService;
           this.fraudUpdateService = fraudUpdateService;
           this.caseManagementActionService = caseManagementActionService;
           this.reserved = reserved;
           this.deviceFingerprintID = deviceFingerprintID;
           this.deviceFingerprintRaw = deviceFingerprintRaw;
           this.deviceFingerprintHash = deviceFingerprintHash;
           this.payPalRefundService = payPalRefundService;
           this.payPalAuthReversalService = payPalAuthReversalService;
           this.payPalDoCaptureService = payPalDoCaptureService;
           this.payPalEcDoPaymentService = payPalEcDoPaymentService;
           this.payPalEcGetDetailsService = payPalEcGetDetailsService;
           this.payPalEcSetService = payPalEcSetService;
           this.payPalEcOrderSetupService = payPalEcOrderSetupService;
           this.payPalAuthorizationService = payPalAuthorizationService;
           this.payPalUpdateAgreementService = payPalUpdateAgreementService;
           this.payPalCreateAgreementService = payPalCreateAgreementService;
           this.payPalDoRefTransactionService = payPalDoRefTransactionService;
           this.chinaPaymentService = chinaPaymentService;
           this.chinaRefundService = chinaRefundService;
           this.boletoPaymentService = boletoPaymentService;
           this.apPaymentType = apPaymentType;
           this.apInitiateService = apInitiateService;
           this.apCheckStatusService = apCheckStatusService;
           this.ignoreCardExpiration = ignoreCardExpiration;
           this.reportGroup = reportGroup;
           this.processorID = processorID;
           this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
           this.transactionLocalDateTime = transactionLocalDateTime;
           this.solutionProviderTransactionID = solutionProviderTransactionID;
           this.surchargeAmount = surchargeAmount;
           this.surchargeSign = surchargeSign;
           this.pinDataEncryptedPIN = pinDataEncryptedPIN;
           this.pinDataKeySerialNumber = pinDataKeySerialNumber;
           this.cashbackAmount = cashbackAmount;
           this.pinDebitPurchaseService = pinDebitPurchaseService;
           this.pinDebitCreditService = pinDebitCreditService;
           this.pinDebitReversalService = pinDebitReversalService;
           this.ap = ap;
           this.apAuthService = apAuthService;
           this.apAuthReversalService = apAuthReversalService;
           this.apCaptureService = apCaptureService;
           this.apOptionsService = apOptionsService;
           this.apRefundService = apRefundService;
           this.apSaleService = apSaleService;
           this.apCheckoutDetailsService = apCheckoutDetailsService;
           this.apSessionsService = apSessionsService;
           this.apUI = apUI;
           this.apTransactionDetailsService = apTransactionDetailsService;
           this.apConfirmPurchaseService = apConfirmPurchaseService;
           this.payPalGetTxnDetailsService = payPalGetTxnDetailsService;
           this.payPalTransactionSearchService = payPalTransactionSearchService;
           this.ccDCCUpdateService = ccDCCUpdateService;
           this.emvRequest = emvRequest;
           this.merchantTransactionIdentifier = merchantTransactionIdentifier;
           this.hostedDataCreateService = hostedDataCreateService;
           this.hostedDataRetrieveService = hostedDataRetrieveService;
           this.merchantCategoryCode = merchantCategoryCode;
           this.salesSlipNumber = salesSlipNumber;
           this.merchandiseCode = merchandiseCode;
           this.merchandiseDescription = merchandiseDescription;
           this.paymentInitiationChannel = paymentInitiationChannel;
           this.extendedCreditTotalCount = extendedCreditTotalCount;
           this.authIndicator = authIndicator;
           this.paymentNetworkToken = paymentNetworkToken;
           this.recipient = recipient;
           this.sender = sender;
           this.autoRentalData = autoRentalData;
           this.paymentSolution = paymentSolution;
           this.vc = vc;
           this.decryptVisaCheckoutDataService = decryptVisaCheckoutDataService;
           this.taxManagementIndicator = taxManagementIndicator;
           this.promotionGroup = promotionGroup;
           this.wallet = wallet;
           this.aft = aft;
           this.balanceInquiry = balanceInquiry;
           this.prenoteTransaction = prenoteTransaction;
           this.encryptPaymentDataService = encryptPaymentDataService;
           this.nationalNetDomesticData = nationalNetDomesticData;
           this.subsequentAuth = subsequentAuth;
           this.binLookupService = binLookupService;
           this.verificationCode = verificationCode;
           this.mobileNumber = mobileNumber;
           this.issuer = issuer;
           this.partnerSolutionID = partnerSolutionID;
           this.developerID = developerID;
           this.getVisaCheckoutDataService = getVisaCheckoutDataService;
           this.customerSignatureImage = customerSignatureImage;
           this.transactionMetadataService = transactionMetadataService;
           this.subsequentAuthFirst = subsequentAuthFirst;
           this.subsequentAuthReason = subsequentAuthReason;
           this.subsequentAuthTransactionID = subsequentAuthTransactionID;
           this.loan = loan;
           this.eligibilityInquiry = eligibilityInquiry;
           this.redemptionInquiry = redemptionInquiry;
           this.feeProgramIndicator = feeProgramIndicator;
           this.apOrderService = apOrderService;
           this.apCancelService = apCancelService;
           this.apBillingAgreementService = apBillingAgreementService;
           this.note_toPayee = note_toPayee;
           this.note_toPayer = note_toPayer;
           this.partnerSDKversion = partnerSDKversion;
           this.partnerOriginalTransactionID = partnerOriginalTransactionID;
           this.cardTypeSelectionIndicator = cardTypeSelectionIndicator;
    }


    /**
     * Gets the merchantID value for this RequestMessage.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this RequestMessage.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the merchantReferenceCode value for this RequestMessage.
     * 
     * @return merchantReferenceCode
     */
    public java.lang.String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }


    /**
     * Sets the merchantReferenceCode value for this RequestMessage.
     * 
     * @param merchantReferenceCode
     */
    public void setMerchantReferenceCode(java.lang.String merchantReferenceCode) {
        this.merchantReferenceCode = merchantReferenceCode;
    }


    /**
     * Gets the debtIndicator value for this RequestMessage.
     * 
     * @return debtIndicator
     */
    public java.lang.String getDebtIndicator() {
        return debtIndicator;
    }


    /**
     * Sets the debtIndicator value for this RequestMessage.
     * 
     * @param debtIndicator
     */
    public void setDebtIndicator(java.lang.String debtIndicator) {
        this.debtIndicator = debtIndicator;
    }


    /**
     * Gets the clientLibrary value for this RequestMessage.
     * 
     * @return clientLibrary
     */
    public java.lang.String getClientLibrary() {
        return clientLibrary;
    }


    /**
     * Sets the clientLibrary value for this RequestMessage.
     * 
     * @param clientLibrary
     */
    public void setClientLibrary(java.lang.String clientLibrary) {
        this.clientLibrary = clientLibrary;
    }


    /**
     * Gets the clientLibraryVersion value for this RequestMessage.
     * 
     * @return clientLibraryVersion
     */
    public java.lang.String getClientLibraryVersion() {
        return clientLibraryVersion;
    }


    /**
     * Sets the clientLibraryVersion value for this RequestMessage.
     * 
     * @param clientLibraryVersion
     */
    public void setClientLibraryVersion(java.lang.String clientLibraryVersion) {
        this.clientLibraryVersion = clientLibraryVersion;
    }


    /**
     * Gets the clientEnvironment value for this RequestMessage.
     * 
     * @return clientEnvironment
     */
    public java.lang.String getClientEnvironment() {
        return clientEnvironment;
    }


    /**
     * Sets the clientEnvironment value for this RequestMessage.
     * 
     * @param clientEnvironment
     */
    public void setClientEnvironment(java.lang.String clientEnvironment) {
        this.clientEnvironment = clientEnvironment;
    }


    /**
     * Gets the clientSecurityLibraryVersion value for this RequestMessage.
     * 
     * @return clientSecurityLibraryVersion
     */
    public java.lang.String getClientSecurityLibraryVersion() {
        return clientSecurityLibraryVersion;
    }


    /**
     * Sets the clientSecurityLibraryVersion value for this RequestMessage.
     * 
     * @param clientSecurityLibraryVersion
     */
    public void setClientSecurityLibraryVersion(java.lang.String clientSecurityLibraryVersion) {
        this.clientSecurityLibraryVersion = clientSecurityLibraryVersion;
    }


    /**
     * Gets the clientApplication value for this RequestMessage.
     * 
     * @return clientApplication
     */
    public java.lang.String getClientApplication() {
        return clientApplication;
    }


    /**
     * Sets the clientApplication value for this RequestMessage.
     * 
     * @param clientApplication
     */
    public void setClientApplication(java.lang.String clientApplication) {
        this.clientApplication = clientApplication;
    }


    /**
     * Gets the clientApplicationVersion value for this RequestMessage.
     * 
     * @return clientApplicationVersion
     */
    public java.lang.String getClientApplicationVersion() {
        return clientApplicationVersion;
    }


    /**
     * Sets the clientApplicationVersion value for this RequestMessage.
     * 
     * @param clientApplicationVersion
     */
    public void setClientApplicationVersion(java.lang.String clientApplicationVersion) {
        this.clientApplicationVersion = clientApplicationVersion;
    }


    /**
     * Gets the clientApplicationUser value for this RequestMessage.
     * 
     * @return clientApplicationUser
     */
    public java.lang.String getClientApplicationUser() {
        return clientApplicationUser;
    }


    /**
     * Sets the clientApplicationUser value for this RequestMessage.
     * 
     * @param clientApplicationUser
     */
    public void setClientApplicationUser(java.lang.String clientApplicationUser) {
        this.clientApplicationUser = clientApplicationUser;
    }


    /**
     * Gets the routingCode value for this RequestMessage.
     * 
     * @return routingCode
     */
    public java.lang.String getRoutingCode() {
        return routingCode;
    }


    /**
     * Sets the routingCode value for this RequestMessage.
     * 
     * @param routingCode
     */
    public void setRoutingCode(java.lang.String routingCode) {
        this.routingCode = routingCode;
    }


    /**
     * Gets the comments value for this RequestMessage.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RequestMessage.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the returnURL value for this RequestMessage.
     * 
     * @return returnURL
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this RequestMessage.
     * 
     * @param returnURL
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the invoiceHeader value for this RequestMessage.
     * 
     * @return invoiceHeader
     */
    public com.cybersource.stub.InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }


    /**
     * Sets the invoiceHeader value for this RequestMessage.
     * 
     * @param invoiceHeader
     */
    public void setInvoiceHeader(com.cybersource.stub.InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }


    /**
     * Gets the aggregatorMerchantIdentifier value for this RequestMessage.
     * 
     * @return aggregatorMerchantIdentifier
     */
    public java.lang.String getAggregatorMerchantIdentifier() {
        return aggregatorMerchantIdentifier;
    }


    /**
     * Sets the aggregatorMerchantIdentifier value for this RequestMessage.
     * 
     * @param aggregatorMerchantIdentifier
     */
    public void setAggregatorMerchantIdentifier(java.lang.String aggregatorMerchantIdentifier) {
        this.aggregatorMerchantIdentifier = aggregatorMerchantIdentifier;
    }


    /**
     * Gets the customerID value for this RequestMessage.
     * 
     * @return customerID
     */
    public java.lang.String getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this RequestMessage.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.String customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the customerFirstName value for this RequestMessage.
     * 
     * @return customerFirstName
     */
    public java.lang.String getCustomerFirstName() {
        return customerFirstName;
    }


    /**
     * Sets the customerFirstName value for this RequestMessage.
     * 
     * @param customerFirstName
     */
    public void setCustomerFirstName(java.lang.String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }


    /**
     * Gets the customerLastName value for this RequestMessage.
     * 
     * @return customerLastName
     */
    public java.lang.String getCustomerLastName() {
        return customerLastName;
    }


    /**
     * Sets the customerLastName value for this RequestMessage.
     * 
     * @param customerLastName
     */
    public void setCustomerLastName(java.lang.String customerLastName) {
        this.customerLastName = customerLastName;
    }


    /**
     * Gets the billTo value for this RequestMessage.
     * 
     * @return billTo
     */
    public com.cybersource.stub.BillTo getBillTo() {
        return billTo;
    }


    /**
     * Sets the billTo value for this RequestMessage.
     * 
     * @param billTo
     */
    public void setBillTo(com.cybersource.stub.BillTo billTo) {
        this.billTo = billTo;
    }


    /**
     * Gets the shipTo value for this RequestMessage.
     * 
     * @return shipTo
     */
    public com.cybersource.stub.ShipTo getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this RequestMessage.
     * 
     * @param shipTo
     */
    public void setShipTo(com.cybersource.stub.ShipTo shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the personalID value for this RequestMessage.
     * 
     * @return personalID
     */
    public com.cybersource.stub.PersonalID getPersonalID() {
        return personalID;
    }


    /**
     * Sets the personalID value for this RequestMessage.
     * 
     * @param personalID
     */
    public void setPersonalID(com.cybersource.stub.PersonalID personalID) {
        this.personalID = personalID;
    }


    /**
     * Gets the shipFrom value for this RequestMessage.
     * 
     * @return shipFrom
     */
    public com.cybersource.stub.ShipFrom getShipFrom() {
        return shipFrom;
    }


    /**
     * Sets the shipFrom value for this RequestMessage.
     * 
     * @param shipFrom
     */
    public void setShipFrom(com.cybersource.stub.ShipFrom shipFrom) {
        this.shipFrom = shipFrom;
    }


    /**
     * Gets the item value for this RequestMessage.
     * 
     * @return item
     */
    public com.cybersource.stub.Item[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this RequestMessage.
     * 
     * @param item
     */
    public void setItem(com.cybersource.stub.Item[] item) {
        this.item = item;
    }

    public com.cybersource.stub.Item getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.cybersource.stub.Item _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the purchaseTotals value for this RequestMessage.
     * 
     * @return purchaseTotals
     */
    public com.cybersource.stub.PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }


    /**
     * Sets the purchaseTotals value for this RequestMessage.
     * 
     * @param purchaseTotals
     */
    public void setPurchaseTotals(com.cybersource.stub.PurchaseTotals purchaseTotals) {
        this.purchaseTotals = purchaseTotals;
    }


    /**
     * Gets the fundingTotals value for this RequestMessage.
     * 
     * @return fundingTotals
     */
    public com.cybersource.stub.FundingTotals getFundingTotals() {
        return fundingTotals;
    }


    /**
     * Sets the fundingTotals value for this RequestMessage.
     * 
     * @param fundingTotals
     */
    public void setFundingTotals(com.cybersource.stub.FundingTotals fundingTotals) {
        this.fundingTotals = fundingTotals;
    }


    /**
     * Gets the dcc value for this RequestMessage.
     * 
     * @return dcc
     */
    public com.cybersource.stub.DCC getDcc() {
        return dcc;
    }


    /**
     * Sets the dcc value for this RequestMessage.
     * 
     * @param dcc
     */
    public void setDcc(com.cybersource.stub.DCC dcc) {
        this.dcc = dcc;
    }


    /**
     * Gets the pos value for this RequestMessage.
     * 
     * @return pos
     */
    public com.cybersource.stub.Pos getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this RequestMessage.
     * 
     * @param pos
     */
    public void setPos(com.cybersource.stub.Pos pos) {
        this.pos = pos;
    }


    /**
     * Gets the pin value for this RequestMessage.
     * 
     * @return pin
     */
    public com.cybersource.stub.Pin getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this RequestMessage.
     * 
     * @param pin
     */
    public void setPin(com.cybersource.stub.Pin pin) {
        this.pin = pin;
    }


    /**
     * Gets the encryptedPayment value for this RequestMessage.
     * 
     * @return encryptedPayment
     */
    public com.cybersource.stub.EncryptedPayment getEncryptedPayment() {
        return encryptedPayment;
    }


    /**
     * Sets the encryptedPayment value for this RequestMessage.
     * 
     * @param encryptedPayment
     */
    public void setEncryptedPayment(com.cybersource.stub.EncryptedPayment encryptedPayment) {
        this.encryptedPayment = encryptedPayment;
    }


    /**
     * Gets the installment value for this RequestMessage.
     * 
     * @return installment
     */
    public com.cybersource.stub.Installment getInstallment() {
        return installment;
    }


    /**
     * Sets the installment value for this RequestMessage.
     * 
     * @param installment
     */
    public void setInstallment(com.cybersource.stub.Installment installment) {
        this.installment = installment;
    }


    /**
     * Gets the card value for this RequestMessage.
     * 
     * @return card
     */
    public com.cybersource.stub.Card getCard() {
        return card;
    }


    /**
     * Sets the card value for this RequestMessage.
     * 
     * @param card
     */
    public void setCard(com.cybersource.stub.Card card) {
        this.card = card;
    }


    /**
     * Gets the check value for this RequestMessage.
     * 
     * @return check
     */
    public com.cybersource.stub.Check getCheck() {
        return check;
    }


    /**
     * Sets the check value for this RequestMessage.
     * 
     * @param check
     */
    public void setCheck(com.cybersource.stub.Check check) {
        this.check = check;
    }


    /**
     * Gets the bml value for this RequestMessage.
     * 
     * @return bml
     */
    public com.cybersource.stub.BML getBml() {
        return bml;
    }


    /**
     * Sets the bml value for this RequestMessage.
     * 
     * @param bml
     */
    public void setBml(com.cybersource.stub.BML bml) {
        this.bml = bml;
    }


    /**
     * Gets the gecc value for this RequestMessage.
     * 
     * @return gecc
     */
    public com.cybersource.stub.GECC getGecc() {
        return gecc;
    }


    /**
     * Sets the gecc value for this RequestMessage.
     * 
     * @param gecc
     */
    public void setGecc(com.cybersource.stub.GECC gecc) {
        this.gecc = gecc;
    }


    /**
     * Gets the ucaf value for this RequestMessage.
     * 
     * @return ucaf
     */
    public com.cybersource.stub.UCAF getUcaf() {
        return ucaf;
    }


    /**
     * Sets the ucaf value for this RequestMessage.
     * 
     * @param ucaf
     */
    public void setUcaf(com.cybersource.stub.UCAF ucaf) {
        this.ucaf = ucaf;
    }


    /**
     * Gets the fundTransfer value for this RequestMessage.
     * 
     * @return fundTransfer
     */
    public com.cybersource.stub.FundTransfer getFundTransfer() {
        return fundTransfer;
    }


    /**
     * Sets the fundTransfer value for this RequestMessage.
     * 
     * @param fundTransfer
     */
    public void setFundTransfer(com.cybersource.stub.FundTransfer fundTransfer) {
        this.fundTransfer = fundTransfer;
    }


    /**
     * Gets the bankInfo value for this RequestMessage.
     * 
     * @return bankInfo
     */
    public com.cybersource.stub.BankInfo getBankInfo() {
        return bankInfo;
    }


    /**
     * Sets the bankInfo value for this RequestMessage.
     * 
     * @param bankInfo
     */
    public void setBankInfo(com.cybersource.stub.BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }


    /**
     * Gets the subscription value for this RequestMessage.
     * 
     * @return subscription
     */
    public com.cybersource.stub.Subscription getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this RequestMessage.
     * 
     * @param subscription
     */
    public void setSubscription(com.cybersource.stub.Subscription subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the recurringSubscriptionInfo value for this RequestMessage.
     * 
     * @return recurringSubscriptionInfo
     */
    public com.cybersource.stub.RecurringSubscriptionInfo getRecurringSubscriptionInfo() {
        return recurringSubscriptionInfo;
    }


    /**
     * Sets the recurringSubscriptionInfo value for this RequestMessage.
     * 
     * @param recurringSubscriptionInfo
     */
    public void setRecurringSubscriptionInfo(com.cybersource.stub.RecurringSubscriptionInfo recurringSubscriptionInfo) {
        this.recurringSubscriptionInfo = recurringSubscriptionInfo;
    }


    /**
     * Gets the decisionManager value for this RequestMessage.
     * 
     * @return decisionManager
     */
    public com.cybersource.stub.DecisionManager getDecisionManager() {
        return decisionManager;
    }


    /**
     * Sets the decisionManager value for this RequestMessage.
     * 
     * @param decisionManager
     */
    public void setDecisionManager(com.cybersource.stub.DecisionManager decisionManager) {
        this.decisionManager = decisionManager;
    }


    /**
     * Gets the otherTax value for this RequestMessage.
     * 
     * @return otherTax
     */
    public com.cybersource.stub.OtherTax getOtherTax() {
        return otherTax;
    }


    /**
     * Sets the otherTax value for this RequestMessage.
     * 
     * @param otherTax
     */
    public void setOtherTax(com.cybersource.stub.OtherTax otherTax) {
        this.otherTax = otherTax;
    }


    /**
     * Gets the paypal value for this RequestMessage.
     * 
     * @return paypal
     */
    public com.cybersource.stub.PayPal getPaypal() {
        return paypal;
    }


    /**
     * Sets the paypal value for this RequestMessage.
     * 
     * @param paypal
     */
    public void setPaypal(com.cybersource.stub.PayPal paypal) {
        this.paypal = paypal;
    }


    /**
     * Gets the merchantDefinedData value for this RequestMessage.
     * 
     * @return merchantDefinedData
     */
    public com.cybersource.stub.MerchantDefinedData getMerchantDefinedData() {
        return merchantDefinedData;
    }


    /**
     * Sets the merchantDefinedData value for this RequestMessage.
     * 
     * @param merchantDefinedData
     */
    public void setMerchantDefinedData(com.cybersource.stub.MerchantDefinedData merchantDefinedData) {
        this.merchantDefinedData = merchantDefinedData;
    }


    /**
     * Gets the merchantSecureData value for this RequestMessage.
     * 
     * @return merchantSecureData
     */
    public com.cybersource.stub.MerchantSecureData getMerchantSecureData() {
        return merchantSecureData;
    }


    /**
     * Sets the merchantSecureData value for this RequestMessage.
     * 
     * @param merchantSecureData
     */
    public void setMerchantSecureData(com.cybersource.stub.MerchantSecureData merchantSecureData) {
        this.merchantSecureData = merchantSecureData;
    }


    /**
     * Gets the jpo value for this RequestMessage.
     * 
     * @return jpo
     */
    public com.cybersource.stub.JPO getJpo() {
        return jpo;
    }


    /**
     * Sets the jpo value for this RequestMessage.
     * 
     * @param jpo
     */
    public void setJpo(com.cybersource.stub.JPO jpo) {
        this.jpo = jpo;
    }


    /**
     * Gets the orderRequestToken value for this RequestMessage.
     * 
     * @return orderRequestToken
     */
    public java.lang.String getOrderRequestToken() {
        return orderRequestToken;
    }


    /**
     * Sets the orderRequestToken value for this RequestMessage.
     * 
     * @param orderRequestToken
     */
    public void setOrderRequestToken(java.lang.String orderRequestToken) {
        this.orderRequestToken = orderRequestToken;
    }


    /**
     * Gets the linkToRequest value for this RequestMessage.
     * 
     * @return linkToRequest
     */
    public java.lang.String getLinkToRequest() {
        return linkToRequest;
    }


    /**
     * Sets the linkToRequest value for this RequestMessage.
     * 
     * @param linkToRequest
     */
    public void setLinkToRequest(java.lang.String linkToRequest) {
        this.linkToRequest = linkToRequest;
    }


    /**
     * Gets the serviceFee value for this RequestMessage.
     * 
     * @return serviceFee
     */
    public com.cybersource.stub.ServiceFee getServiceFee() {
        return serviceFee;
    }


    /**
     * Sets the serviceFee value for this RequestMessage.
     * 
     * @param serviceFee
     */
    public void setServiceFee(com.cybersource.stub.ServiceFee serviceFee) {
        this.serviceFee = serviceFee;
    }


    /**
     * Gets the ccAuthService value for this RequestMessage.
     * 
     * @return ccAuthService
     */
    public com.cybersource.stub.CCAuthService getCcAuthService() {
        return ccAuthService;
    }


    /**
     * Sets the ccAuthService value for this RequestMessage.
     * 
     * @param ccAuthService
     */
    public void setCcAuthService(com.cybersource.stub.CCAuthService ccAuthService) {
        this.ccAuthService = ccAuthService;
    }


    /**
     * Gets the octService value for this RequestMessage.
     * 
     * @return octService
     */
    public com.cybersource.stub.OCTService getOctService() {
        return octService;
    }


    /**
     * Sets the octService value for this RequestMessage.
     * 
     * @param octService
     */
    public void setOctService(com.cybersource.stub.OCTService octService) {
        this.octService = octService;
    }


    /**
     * Gets the verificationService value for this RequestMessage.
     * 
     * @return verificationService
     */
    public com.cybersource.stub.VerificationService getVerificationService() {
        return verificationService;
    }


    /**
     * Sets the verificationService value for this RequestMessage.
     * 
     * @param verificationService
     */
    public void setVerificationService(com.cybersource.stub.VerificationService verificationService) {
        this.verificationService = verificationService;
    }


    /**
     * Gets the ccSaleService value for this RequestMessage.
     * 
     * @return ccSaleService
     */
    public com.cybersource.stub.CCSaleService getCcSaleService() {
        return ccSaleService;
    }


    /**
     * Sets the ccSaleService value for this RequestMessage.
     * 
     * @param ccSaleService
     */
    public void setCcSaleService(com.cybersource.stub.CCSaleService ccSaleService) {
        this.ccSaleService = ccSaleService;
    }


    /**
     * Gets the ccSaleCreditService value for this RequestMessage.
     * 
     * @return ccSaleCreditService
     */
    public com.cybersource.stub.CCSaleCreditService getCcSaleCreditService() {
        return ccSaleCreditService;
    }


    /**
     * Sets the ccSaleCreditService value for this RequestMessage.
     * 
     * @param ccSaleCreditService
     */
    public void setCcSaleCreditService(com.cybersource.stub.CCSaleCreditService ccSaleCreditService) {
        this.ccSaleCreditService = ccSaleCreditService;
    }


    /**
     * Gets the ccSaleReversalService value for this RequestMessage.
     * 
     * @return ccSaleReversalService
     */
    public com.cybersource.stub.CCSaleReversalService getCcSaleReversalService() {
        return ccSaleReversalService;
    }


    /**
     * Sets the ccSaleReversalService value for this RequestMessage.
     * 
     * @param ccSaleReversalService
     */
    public void setCcSaleReversalService(com.cybersource.stub.CCSaleReversalService ccSaleReversalService) {
        this.ccSaleReversalService = ccSaleReversalService;
    }


    /**
     * Gets the ccIncrementalAuthService value for this RequestMessage.
     * 
     * @return ccIncrementalAuthService
     */
    public com.cybersource.stub.CCIncrementalAuthService getCcIncrementalAuthService() {
        return ccIncrementalAuthService;
    }


    /**
     * Sets the ccIncrementalAuthService value for this RequestMessage.
     * 
     * @param ccIncrementalAuthService
     */
    public void setCcIncrementalAuthService(com.cybersource.stub.CCIncrementalAuthService ccIncrementalAuthService) {
        this.ccIncrementalAuthService = ccIncrementalAuthService;
    }


    /**
     * Gets the ccCaptureService value for this RequestMessage.
     * 
     * @return ccCaptureService
     */
    public com.cybersource.stub.CCCaptureService getCcCaptureService() {
        return ccCaptureService;
    }


    /**
     * Sets the ccCaptureService value for this RequestMessage.
     * 
     * @param ccCaptureService
     */
    public void setCcCaptureService(com.cybersource.stub.CCCaptureService ccCaptureService) {
        this.ccCaptureService = ccCaptureService;
    }


    /**
     * Gets the ccCreditService value for this RequestMessage.
     * 
     * @return ccCreditService
     */
    public com.cybersource.stub.CCCreditService getCcCreditService() {
        return ccCreditService;
    }


    /**
     * Sets the ccCreditService value for this RequestMessage.
     * 
     * @param ccCreditService
     */
    public void setCcCreditService(com.cybersource.stub.CCCreditService ccCreditService) {
        this.ccCreditService = ccCreditService;
    }


    /**
     * Gets the ccAuthReversalService value for this RequestMessage.
     * 
     * @return ccAuthReversalService
     */
    public com.cybersource.stub.CCAuthReversalService getCcAuthReversalService() {
        return ccAuthReversalService;
    }


    /**
     * Sets the ccAuthReversalService value for this RequestMessage.
     * 
     * @param ccAuthReversalService
     */
    public void setCcAuthReversalService(com.cybersource.stub.CCAuthReversalService ccAuthReversalService) {
        this.ccAuthReversalService = ccAuthReversalService;
    }


    /**
     * Gets the ccAutoAuthReversalService value for this RequestMessage.
     * 
     * @return ccAutoAuthReversalService
     */
    public com.cybersource.stub.CCAutoAuthReversalService getCcAutoAuthReversalService() {
        return ccAutoAuthReversalService;
    }


    /**
     * Sets the ccAutoAuthReversalService value for this RequestMessage.
     * 
     * @param ccAutoAuthReversalService
     */
    public void setCcAutoAuthReversalService(com.cybersource.stub.CCAutoAuthReversalService ccAutoAuthReversalService) {
        this.ccAutoAuthReversalService = ccAutoAuthReversalService;
    }


    /**
     * Gets the ccDCCService value for this RequestMessage.
     * 
     * @return ccDCCService
     */
    public com.cybersource.stub.CCDCCService getCcDCCService() {
        return ccDCCService;
    }


    /**
     * Sets the ccDCCService value for this RequestMessage.
     * 
     * @param ccDCCService
     */
    public void setCcDCCService(com.cybersource.stub.CCDCCService ccDCCService) {
        this.ccDCCService = ccDCCService;
    }


    /**
     * Gets the serviceFeeCalculateService value for this RequestMessage.
     * 
     * @return serviceFeeCalculateService
     */
    public com.cybersource.stub.ServiceFeeCalculateService getServiceFeeCalculateService() {
        return serviceFeeCalculateService;
    }


    /**
     * Sets the serviceFeeCalculateService value for this RequestMessage.
     * 
     * @param serviceFeeCalculateService
     */
    public void setServiceFeeCalculateService(com.cybersource.stub.ServiceFeeCalculateService serviceFeeCalculateService) {
        this.serviceFeeCalculateService = serviceFeeCalculateService;
    }


    /**
     * Gets the ecDebitService value for this RequestMessage.
     * 
     * @return ecDebitService
     */
    public com.cybersource.stub.ECDebitService getEcDebitService() {
        return ecDebitService;
    }


    /**
     * Sets the ecDebitService value for this RequestMessage.
     * 
     * @param ecDebitService
     */
    public void setEcDebitService(com.cybersource.stub.ECDebitService ecDebitService) {
        this.ecDebitService = ecDebitService;
    }


    /**
     * Gets the ecCreditService value for this RequestMessage.
     * 
     * @return ecCreditService
     */
    public com.cybersource.stub.ECCreditService getEcCreditService() {
        return ecCreditService;
    }


    /**
     * Sets the ecCreditService value for this RequestMessage.
     * 
     * @param ecCreditService
     */
    public void setEcCreditService(com.cybersource.stub.ECCreditService ecCreditService) {
        this.ecCreditService = ecCreditService;
    }


    /**
     * Gets the ecAuthenticateService value for this RequestMessage.
     * 
     * @return ecAuthenticateService
     */
    public com.cybersource.stub.ECAuthenticateService getEcAuthenticateService() {
        return ecAuthenticateService;
    }


    /**
     * Sets the ecAuthenticateService value for this RequestMessage.
     * 
     * @param ecAuthenticateService
     */
    public void setEcAuthenticateService(com.cybersource.stub.ECAuthenticateService ecAuthenticateService) {
        this.ecAuthenticateService = ecAuthenticateService;
    }


    /**
     * Gets the payerAuthEnrollService value for this RequestMessage.
     * 
     * @return payerAuthEnrollService
     */
    public com.cybersource.stub.PayerAuthEnrollService getPayerAuthEnrollService() {
        return payerAuthEnrollService;
    }


    /**
     * Sets the payerAuthEnrollService value for this RequestMessage.
     * 
     * @param payerAuthEnrollService
     */
    public void setPayerAuthEnrollService(com.cybersource.stub.PayerAuthEnrollService payerAuthEnrollService) {
        this.payerAuthEnrollService = payerAuthEnrollService;
    }


    /**
     * Gets the payerAuthValidateService value for this RequestMessage.
     * 
     * @return payerAuthValidateService
     */
    public com.cybersource.stub.PayerAuthValidateService getPayerAuthValidateService() {
        return payerAuthValidateService;
    }


    /**
     * Sets the payerAuthValidateService value for this RequestMessage.
     * 
     * @param payerAuthValidateService
     */
    public void setPayerAuthValidateService(com.cybersource.stub.PayerAuthValidateService payerAuthValidateService) {
        this.payerAuthValidateService = payerAuthValidateService;
    }


    /**
     * Gets the taxService value for this RequestMessage.
     * 
     * @return taxService
     */
    public com.cybersource.stub.TaxService getTaxService() {
        return taxService;
    }


    /**
     * Sets the taxService value for this RequestMessage.
     * 
     * @param taxService
     */
    public void setTaxService(com.cybersource.stub.TaxService taxService) {
        this.taxService = taxService;
    }


    /**
     * Gets the dmeService value for this RequestMessage.
     * 
     * @return dmeService
     */
    public com.cybersource.stub.DMEService getDmeService() {
        return dmeService;
    }


    /**
     * Sets the dmeService value for this RequestMessage.
     * 
     * @param dmeService
     */
    public void setDmeService(com.cybersource.stub.DMEService dmeService) {
        this.dmeService = dmeService;
    }


    /**
     * Gets the afsService value for this RequestMessage.
     * 
     * @return afsService
     */
    public com.cybersource.stub.AFSService getAfsService() {
        return afsService;
    }


    /**
     * Sets the afsService value for this RequestMessage.
     * 
     * @param afsService
     */
    public void setAfsService(com.cybersource.stub.AFSService afsService) {
        this.afsService = afsService;
    }


    /**
     * Gets the davService value for this RequestMessage.
     * 
     * @return davService
     */
    public com.cybersource.stub.DAVService getDavService() {
        return davService;
    }


    /**
     * Sets the davService value for this RequestMessage.
     * 
     * @param davService
     */
    public void setDavService(com.cybersource.stub.DAVService davService) {
        this.davService = davService;
    }


    /**
     * Gets the exportService value for this RequestMessage.
     * 
     * @return exportService
     */
    public com.cybersource.stub.ExportService getExportService() {
        return exportService;
    }


    /**
     * Sets the exportService value for this RequestMessage.
     * 
     * @param exportService
     */
    public void setExportService(com.cybersource.stub.ExportService exportService) {
        this.exportService = exportService;
    }


    /**
     * Gets the fxRatesService value for this RequestMessage.
     * 
     * @return fxRatesService
     */
    public com.cybersource.stub.FXRatesService getFxRatesService() {
        return fxRatesService;
    }


    /**
     * Sets the fxRatesService value for this RequestMessage.
     * 
     * @param fxRatesService
     */
    public void setFxRatesService(com.cybersource.stub.FXRatesService fxRatesService) {
        this.fxRatesService = fxRatesService;
    }


    /**
     * Gets the bankTransferService value for this RequestMessage.
     * 
     * @return bankTransferService
     */
    public com.cybersource.stub.BankTransferService getBankTransferService() {
        return bankTransferService;
    }


    /**
     * Sets the bankTransferService value for this RequestMessage.
     * 
     * @param bankTransferService
     */
    public void setBankTransferService(com.cybersource.stub.BankTransferService bankTransferService) {
        this.bankTransferService = bankTransferService;
    }


    /**
     * Gets the bankTransferRefundService value for this RequestMessage.
     * 
     * @return bankTransferRefundService
     */
    public com.cybersource.stub.BankTransferRefundService getBankTransferRefundService() {
        return bankTransferRefundService;
    }


    /**
     * Sets the bankTransferRefundService value for this RequestMessage.
     * 
     * @param bankTransferRefundService
     */
    public void setBankTransferRefundService(com.cybersource.stub.BankTransferRefundService bankTransferRefundService) {
        this.bankTransferRefundService = bankTransferRefundService;
    }


    /**
     * Gets the bankTransferRealTimeService value for this RequestMessage.
     * 
     * @return bankTransferRealTimeService
     */
    public com.cybersource.stub.BankTransferRealTimeService getBankTransferRealTimeService() {
        return bankTransferRealTimeService;
    }


    /**
     * Sets the bankTransferRealTimeService value for this RequestMessage.
     * 
     * @param bankTransferRealTimeService
     */
    public void setBankTransferRealTimeService(com.cybersource.stub.BankTransferRealTimeService bankTransferRealTimeService) {
        this.bankTransferRealTimeService = bankTransferRealTimeService;
    }


    /**
     * Gets the directDebitMandateService value for this RequestMessage.
     * 
     * @return directDebitMandateService
     */
    public com.cybersource.stub.DirectDebitMandateService getDirectDebitMandateService() {
        return directDebitMandateService;
    }


    /**
     * Sets the directDebitMandateService value for this RequestMessage.
     * 
     * @param directDebitMandateService
     */
    public void setDirectDebitMandateService(com.cybersource.stub.DirectDebitMandateService directDebitMandateService) {
        this.directDebitMandateService = directDebitMandateService;
    }


    /**
     * Gets the directDebitService value for this RequestMessage.
     * 
     * @return directDebitService
     */
    public com.cybersource.stub.DirectDebitService getDirectDebitService() {
        return directDebitService;
    }


    /**
     * Sets the directDebitService value for this RequestMessage.
     * 
     * @param directDebitService
     */
    public void setDirectDebitService(com.cybersource.stub.DirectDebitService directDebitService) {
        this.directDebitService = directDebitService;
    }


    /**
     * Gets the directDebitRefundService value for this RequestMessage.
     * 
     * @return directDebitRefundService
     */
    public com.cybersource.stub.DirectDebitRefundService getDirectDebitRefundService() {
        return directDebitRefundService;
    }


    /**
     * Sets the directDebitRefundService value for this RequestMessage.
     * 
     * @param directDebitRefundService
     */
    public void setDirectDebitRefundService(com.cybersource.stub.DirectDebitRefundService directDebitRefundService) {
        this.directDebitRefundService = directDebitRefundService;
    }


    /**
     * Gets the directDebitValidateService value for this RequestMessage.
     * 
     * @return directDebitValidateService
     */
    public com.cybersource.stub.DirectDebitValidateService getDirectDebitValidateService() {
        return directDebitValidateService;
    }


    /**
     * Sets the directDebitValidateService value for this RequestMessage.
     * 
     * @param directDebitValidateService
     */
    public void setDirectDebitValidateService(com.cybersource.stub.DirectDebitValidateService directDebitValidateService) {
        this.directDebitValidateService = directDebitValidateService;
    }


    /**
     * Gets the paySubscriptionCreateService value for this RequestMessage.
     * 
     * @return paySubscriptionCreateService
     */
    public com.cybersource.stub.PaySubscriptionCreateService getPaySubscriptionCreateService() {
        return paySubscriptionCreateService;
    }


    /**
     * Sets the paySubscriptionCreateService value for this RequestMessage.
     * 
     * @param paySubscriptionCreateService
     */
    public void setPaySubscriptionCreateService(com.cybersource.stub.PaySubscriptionCreateService paySubscriptionCreateService) {
        this.paySubscriptionCreateService = paySubscriptionCreateService;
    }


    /**
     * Gets the paySubscriptionUpdateService value for this RequestMessage.
     * 
     * @return paySubscriptionUpdateService
     */
    public com.cybersource.stub.PaySubscriptionUpdateService getPaySubscriptionUpdateService() {
        return paySubscriptionUpdateService;
    }


    /**
     * Sets the paySubscriptionUpdateService value for this RequestMessage.
     * 
     * @param paySubscriptionUpdateService
     */
    public void setPaySubscriptionUpdateService(com.cybersource.stub.PaySubscriptionUpdateService paySubscriptionUpdateService) {
        this.paySubscriptionUpdateService = paySubscriptionUpdateService;
    }


    /**
     * Gets the paySubscriptionEventUpdateService value for this RequestMessage.
     * 
     * @return paySubscriptionEventUpdateService
     */
    public com.cybersource.stub.PaySubscriptionEventUpdateService getPaySubscriptionEventUpdateService() {
        return paySubscriptionEventUpdateService;
    }


    /**
     * Sets the paySubscriptionEventUpdateService value for this RequestMessage.
     * 
     * @param paySubscriptionEventUpdateService
     */
    public void setPaySubscriptionEventUpdateService(com.cybersource.stub.PaySubscriptionEventUpdateService paySubscriptionEventUpdateService) {
        this.paySubscriptionEventUpdateService = paySubscriptionEventUpdateService;
    }


    /**
     * Gets the paySubscriptionRetrieveService value for this RequestMessage.
     * 
     * @return paySubscriptionRetrieveService
     */
    public com.cybersource.stub.PaySubscriptionRetrieveService getPaySubscriptionRetrieveService() {
        return paySubscriptionRetrieveService;
    }


    /**
     * Sets the paySubscriptionRetrieveService value for this RequestMessage.
     * 
     * @param paySubscriptionRetrieveService
     */
    public void setPaySubscriptionRetrieveService(com.cybersource.stub.PaySubscriptionRetrieveService paySubscriptionRetrieveService) {
        this.paySubscriptionRetrieveService = paySubscriptionRetrieveService;
    }


    /**
     * Gets the paySubscriptionDeleteService value for this RequestMessage.
     * 
     * @return paySubscriptionDeleteService
     */
    public com.cybersource.stub.PaySubscriptionDeleteService getPaySubscriptionDeleteService() {
        return paySubscriptionDeleteService;
    }


    /**
     * Sets the paySubscriptionDeleteService value for this RequestMessage.
     * 
     * @param paySubscriptionDeleteService
     */
    public void setPaySubscriptionDeleteService(com.cybersource.stub.PaySubscriptionDeleteService paySubscriptionDeleteService) {
        this.paySubscriptionDeleteService = paySubscriptionDeleteService;
    }


    /**
     * Gets the payPalPaymentService value for this RequestMessage.
     * 
     * @return payPalPaymentService
     */
    public com.cybersource.stub.PayPalPaymentService getPayPalPaymentService() {
        return payPalPaymentService;
    }


    /**
     * Sets the payPalPaymentService value for this RequestMessage.
     * 
     * @param payPalPaymentService
     */
    public void setPayPalPaymentService(com.cybersource.stub.PayPalPaymentService payPalPaymentService) {
        this.payPalPaymentService = payPalPaymentService;
    }


    /**
     * Gets the payPalCreditService value for this RequestMessage.
     * 
     * @return payPalCreditService
     */
    public com.cybersource.stub.PayPalCreditService getPayPalCreditService() {
        return payPalCreditService;
    }


    /**
     * Sets the payPalCreditService value for this RequestMessage.
     * 
     * @param payPalCreditService
     */
    public void setPayPalCreditService(com.cybersource.stub.PayPalCreditService payPalCreditService) {
        this.payPalCreditService = payPalCreditService;
    }


    /**
     * Gets the voidService value for this RequestMessage.
     * 
     * @return voidService
     */
    public com.cybersource.stub.VoidService getVoidService() {
        return voidService;
    }


    /**
     * Sets the voidService value for this RequestMessage.
     * 
     * @param voidService
     */
    public void setVoidService(com.cybersource.stub.VoidService voidService) {
        this.voidService = voidService;
    }


    /**
     * Gets the businessRules value for this RequestMessage.
     * 
     * @return businessRules
     */
    public com.cybersource.stub.BusinessRules getBusinessRules() {
        return businessRules;
    }


    /**
     * Sets the businessRules value for this RequestMessage.
     * 
     * @param businessRules
     */
    public void setBusinessRules(com.cybersource.stub.BusinessRules businessRules) {
        this.businessRules = businessRules;
    }


    /**
     * Gets the pinlessDebitService value for this RequestMessage.
     * 
     * @return pinlessDebitService
     */
    public com.cybersource.stub.PinlessDebitService getPinlessDebitService() {
        return pinlessDebitService;
    }


    /**
     * Sets the pinlessDebitService value for this RequestMessage.
     * 
     * @param pinlessDebitService
     */
    public void setPinlessDebitService(com.cybersource.stub.PinlessDebitService pinlessDebitService) {
        this.pinlessDebitService = pinlessDebitService;
    }


    /**
     * Gets the pinlessDebitValidateService value for this RequestMessage.
     * 
     * @return pinlessDebitValidateService
     */
    public com.cybersource.stub.PinlessDebitValidateService getPinlessDebitValidateService() {
        return pinlessDebitValidateService;
    }


    /**
     * Sets the pinlessDebitValidateService value for this RequestMessage.
     * 
     * @param pinlessDebitValidateService
     */
    public void setPinlessDebitValidateService(com.cybersource.stub.PinlessDebitValidateService pinlessDebitValidateService) {
        this.pinlessDebitValidateService = pinlessDebitValidateService;
    }


    /**
     * Gets the pinlessDebitReversalService value for this RequestMessage.
     * 
     * @return pinlessDebitReversalService
     */
    public com.cybersource.stub.PinlessDebitReversalService getPinlessDebitReversalService() {
        return pinlessDebitReversalService;
    }


    /**
     * Sets the pinlessDebitReversalService value for this RequestMessage.
     * 
     * @param pinlessDebitReversalService
     */
    public void setPinlessDebitReversalService(com.cybersource.stub.PinlessDebitReversalService pinlessDebitReversalService) {
        this.pinlessDebitReversalService = pinlessDebitReversalService;
    }


    /**
     * Gets the batch value for this RequestMessage.
     * 
     * @return batch
     */
    public com.cybersource.stub.Batch getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this RequestMessage.
     * 
     * @param batch
     */
    public void setBatch(com.cybersource.stub.Batch batch) {
        this.batch = batch;
    }


    /**
     * Gets the airlineData value for this RequestMessage.
     * 
     * @return airlineData
     */
    public com.cybersource.stub.AirlineData getAirlineData() {
        return airlineData;
    }


    /**
     * Sets the airlineData value for this RequestMessage.
     * 
     * @param airlineData
     */
    public void setAirlineData(com.cybersource.stub.AirlineData airlineData) {
        this.airlineData = airlineData;
    }


    /**
     * Gets the ancillaryData value for this RequestMessage.
     * 
     * @return ancillaryData
     */
    public com.cybersource.stub.AncillaryData getAncillaryData() {
        return ancillaryData;
    }


    /**
     * Sets the ancillaryData value for this RequestMessage.
     * 
     * @param ancillaryData
     */
    public void setAncillaryData(com.cybersource.stub.AncillaryData ancillaryData) {
        this.ancillaryData = ancillaryData;
    }


    /**
     * Gets the lodgingData value for this RequestMessage.
     * 
     * @return lodgingData
     */
    public com.cybersource.stub.LodgingData getLodgingData() {
        return lodgingData;
    }


    /**
     * Sets the lodgingData value for this RequestMessage.
     * 
     * @param lodgingData
     */
    public void setLodgingData(com.cybersource.stub.LodgingData lodgingData) {
        this.lodgingData = lodgingData;
    }


    /**
     * Gets the payPalButtonCreateService value for this RequestMessage.
     * 
     * @return payPalButtonCreateService
     */
    public com.cybersource.stub.PayPalButtonCreateService getPayPalButtonCreateService() {
        return payPalButtonCreateService;
    }


    /**
     * Sets the payPalButtonCreateService value for this RequestMessage.
     * 
     * @param payPalButtonCreateService
     */
    public void setPayPalButtonCreateService(com.cybersource.stub.PayPalButtonCreateService payPalButtonCreateService) {
        this.payPalButtonCreateService = payPalButtonCreateService;
    }


    /**
     * Gets the payPalPreapprovedPaymentService value for this RequestMessage.
     * 
     * @return payPalPreapprovedPaymentService
     */
    public com.cybersource.stub.PayPalPreapprovedPaymentService getPayPalPreapprovedPaymentService() {
        return payPalPreapprovedPaymentService;
    }


    /**
     * Sets the payPalPreapprovedPaymentService value for this RequestMessage.
     * 
     * @param payPalPreapprovedPaymentService
     */
    public void setPayPalPreapprovedPaymentService(com.cybersource.stub.PayPalPreapprovedPaymentService payPalPreapprovedPaymentService) {
        this.payPalPreapprovedPaymentService = payPalPreapprovedPaymentService;
    }


    /**
     * Gets the payPalPreapprovedUpdateService value for this RequestMessage.
     * 
     * @return payPalPreapprovedUpdateService
     */
    public com.cybersource.stub.PayPalPreapprovedUpdateService getPayPalPreapprovedUpdateService() {
        return payPalPreapprovedUpdateService;
    }


    /**
     * Sets the payPalPreapprovedUpdateService value for this RequestMessage.
     * 
     * @param payPalPreapprovedUpdateService
     */
    public void setPayPalPreapprovedUpdateService(com.cybersource.stub.PayPalPreapprovedUpdateService payPalPreapprovedUpdateService) {
        this.payPalPreapprovedUpdateService = payPalPreapprovedUpdateService;
    }


    /**
     * Gets the riskUpdateService value for this RequestMessage.
     * 
     * @return riskUpdateService
     */
    public com.cybersource.stub.RiskUpdateService getRiskUpdateService() {
        return riskUpdateService;
    }


    /**
     * Sets the riskUpdateService value for this RequestMessage.
     * 
     * @param riskUpdateService
     */
    public void setRiskUpdateService(com.cybersource.stub.RiskUpdateService riskUpdateService) {
        this.riskUpdateService = riskUpdateService;
    }


    /**
     * Gets the fraudUpdateService value for this RequestMessage.
     * 
     * @return fraudUpdateService
     */
    public com.cybersource.stub.FraudUpdateService getFraudUpdateService() {
        return fraudUpdateService;
    }


    /**
     * Sets the fraudUpdateService value for this RequestMessage.
     * 
     * @param fraudUpdateService
     */
    public void setFraudUpdateService(com.cybersource.stub.FraudUpdateService fraudUpdateService) {
        this.fraudUpdateService = fraudUpdateService;
    }


    /**
     * Gets the caseManagementActionService value for this RequestMessage.
     * 
     * @return caseManagementActionService
     */
    public com.cybersource.stub.CaseManagementActionService getCaseManagementActionService() {
        return caseManagementActionService;
    }


    /**
     * Sets the caseManagementActionService value for this RequestMessage.
     * 
     * @param caseManagementActionService
     */
    public void setCaseManagementActionService(com.cybersource.stub.CaseManagementActionService caseManagementActionService) {
        this.caseManagementActionService = caseManagementActionService;
    }


    /**
     * Gets the reserved value for this RequestMessage.
     * 
     * @return reserved
     */
    public com.cybersource.stub.RequestReserved[] getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this RequestMessage.
     * 
     * @param reserved
     */
    public void setReserved(com.cybersource.stub.RequestReserved[] reserved) {
        this.reserved = reserved;
    }

    public com.cybersource.stub.RequestReserved getReserved(int i) {
        return this.reserved[i];
    }

    public void setReserved(int i, com.cybersource.stub.RequestReserved _value) {
        this.reserved[i] = _value;
    }


    /**
     * Gets the deviceFingerprintID value for this RequestMessage.
     * 
     * @return deviceFingerprintID
     */
    public java.lang.String getDeviceFingerprintID() {
        return deviceFingerprintID;
    }


    /**
     * Sets the deviceFingerprintID value for this RequestMessage.
     * 
     * @param deviceFingerprintID
     */
    public void setDeviceFingerprintID(java.lang.String deviceFingerprintID) {
        this.deviceFingerprintID = deviceFingerprintID;
    }


    /**
     * Gets the deviceFingerprintRaw value for this RequestMessage.
     * 
     * @return deviceFingerprintRaw
     */
    public java.lang.String getDeviceFingerprintRaw() {
        return deviceFingerprintRaw;
    }


    /**
     * Sets the deviceFingerprintRaw value for this RequestMessage.
     * 
     * @param deviceFingerprintRaw
     */
    public void setDeviceFingerprintRaw(java.lang.String deviceFingerprintRaw) {
        this.deviceFingerprintRaw = deviceFingerprintRaw;
    }


    /**
     * Gets the deviceFingerprintHash value for this RequestMessage.
     * 
     * @return deviceFingerprintHash
     */
    public java.lang.String getDeviceFingerprintHash() {
        return deviceFingerprintHash;
    }


    /**
     * Sets the deviceFingerprintHash value for this RequestMessage.
     * 
     * @param deviceFingerprintHash
     */
    public void setDeviceFingerprintHash(java.lang.String deviceFingerprintHash) {
        this.deviceFingerprintHash = deviceFingerprintHash;
    }


    /**
     * Gets the payPalRefundService value for this RequestMessage.
     * 
     * @return payPalRefundService
     */
    public com.cybersource.stub.PayPalRefundService getPayPalRefundService() {
        return payPalRefundService;
    }


    /**
     * Sets the payPalRefundService value for this RequestMessage.
     * 
     * @param payPalRefundService
     */
    public void setPayPalRefundService(com.cybersource.stub.PayPalRefundService payPalRefundService) {
        this.payPalRefundService = payPalRefundService;
    }


    /**
     * Gets the payPalAuthReversalService value for this RequestMessage.
     * 
     * @return payPalAuthReversalService
     */
    public com.cybersource.stub.PayPalAuthReversalService getPayPalAuthReversalService() {
        return payPalAuthReversalService;
    }


    /**
     * Sets the payPalAuthReversalService value for this RequestMessage.
     * 
     * @param payPalAuthReversalService
     */
    public void setPayPalAuthReversalService(com.cybersource.stub.PayPalAuthReversalService payPalAuthReversalService) {
        this.payPalAuthReversalService = payPalAuthReversalService;
    }


    /**
     * Gets the payPalDoCaptureService value for this RequestMessage.
     * 
     * @return payPalDoCaptureService
     */
    public com.cybersource.stub.PayPalDoCaptureService getPayPalDoCaptureService() {
        return payPalDoCaptureService;
    }


    /**
     * Sets the payPalDoCaptureService value for this RequestMessage.
     * 
     * @param payPalDoCaptureService
     */
    public void setPayPalDoCaptureService(com.cybersource.stub.PayPalDoCaptureService payPalDoCaptureService) {
        this.payPalDoCaptureService = payPalDoCaptureService;
    }


    /**
     * Gets the payPalEcDoPaymentService value for this RequestMessage.
     * 
     * @return payPalEcDoPaymentService
     */
    public com.cybersource.stub.PayPalEcDoPaymentService getPayPalEcDoPaymentService() {
        return payPalEcDoPaymentService;
    }


    /**
     * Sets the payPalEcDoPaymentService value for this RequestMessage.
     * 
     * @param payPalEcDoPaymentService
     */
    public void setPayPalEcDoPaymentService(com.cybersource.stub.PayPalEcDoPaymentService payPalEcDoPaymentService) {
        this.payPalEcDoPaymentService = payPalEcDoPaymentService;
    }


    /**
     * Gets the payPalEcGetDetailsService value for this RequestMessage.
     * 
     * @return payPalEcGetDetailsService
     */
    public com.cybersource.stub.PayPalEcGetDetailsService getPayPalEcGetDetailsService() {
        return payPalEcGetDetailsService;
    }


    /**
     * Sets the payPalEcGetDetailsService value for this RequestMessage.
     * 
     * @param payPalEcGetDetailsService
     */
    public void setPayPalEcGetDetailsService(com.cybersource.stub.PayPalEcGetDetailsService payPalEcGetDetailsService) {
        this.payPalEcGetDetailsService = payPalEcGetDetailsService;
    }


    /**
     * Gets the payPalEcSetService value for this RequestMessage.
     * 
     * @return payPalEcSetService
     */
    public com.cybersource.stub.PayPalEcSetService getPayPalEcSetService() {
        return payPalEcSetService;
    }


    /**
     * Sets the payPalEcSetService value for this RequestMessage.
     * 
     * @param payPalEcSetService
     */
    public void setPayPalEcSetService(com.cybersource.stub.PayPalEcSetService payPalEcSetService) {
        this.payPalEcSetService = payPalEcSetService;
    }


    /**
     * Gets the payPalEcOrderSetupService value for this RequestMessage.
     * 
     * @return payPalEcOrderSetupService
     */
    public com.cybersource.stub.PayPalEcOrderSetupService getPayPalEcOrderSetupService() {
        return payPalEcOrderSetupService;
    }


    /**
     * Sets the payPalEcOrderSetupService value for this RequestMessage.
     * 
     * @param payPalEcOrderSetupService
     */
    public void setPayPalEcOrderSetupService(com.cybersource.stub.PayPalEcOrderSetupService payPalEcOrderSetupService) {
        this.payPalEcOrderSetupService = payPalEcOrderSetupService;
    }


    /**
     * Gets the payPalAuthorizationService value for this RequestMessage.
     * 
     * @return payPalAuthorizationService
     */
    public com.cybersource.stub.PayPalAuthorizationService getPayPalAuthorizationService() {
        return payPalAuthorizationService;
    }


    /**
     * Sets the payPalAuthorizationService value for this RequestMessage.
     * 
     * @param payPalAuthorizationService
     */
    public void setPayPalAuthorizationService(com.cybersource.stub.PayPalAuthorizationService payPalAuthorizationService) {
        this.payPalAuthorizationService = payPalAuthorizationService;
    }


    /**
     * Gets the payPalUpdateAgreementService value for this RequestMessage.
     * 
     * @return payPalUpdateAgreementService
     */
    public com.cybersource.stub.PayPalUpdateAgreementService getPayPalUpdateAgreementService() {
        return payPalUpdateAgreementService;
    }


    /**
     * Sets the payPalUpdateAgreementService value for this RequestMessage.
     * 
     * @param payPalUpdateAgreementService
     */
    public void setPayPalUpdateAgreementService(com.cybersource.stub.PayPalUpdateAgreementService payPalUpdateAgreementService) {
        this.payPalUpdateAgreementService = payPalUpdateAgreementService;
    }


    /**
     * Gets the payPalCreateAgreementService value for this RequestMessage.
     * 
     * @return payPalCreateAgreementService
     */
    public com.cybersource.stub.PayPalCreateAgreementService getPayPalCreateAgreementService() {
        return payPalCreateAgreementService;
    }


    /**
     * Sets the payPalCreateAgreementService value for this RequestMessage.
     * 
     * @param payPalCreateAgreementService
     */
    public void setPayPalCreateAgreementService(com.cybersource.stub.PayPalCreateAgreementService payPalCreateAgreementService) {
        this.payPalCreateAgreementService = payPalCreateAgreementService;
    }


    /**
     * Gets the payPalDoRefTransactionService value for this RequestMessage.
     * 
     * @return payPalDoRefTransactionService
     */
    public com.cybersource.stub.PayPalDoRefTransactionService getPayPalDoRefTransactionService() {
        return payPalDoRefTransactionService;
    }


    /**
     * Sets the payPalDoRefTransactionService value for this RequestMessage.
     * 
     * @param payPalDoRefTransactionService
     */
    public void setPayPalDoRefTransactionService(com.cybersource.stub.PayPalDoRefTransactionService payPalDoRefTransactionService) {
        this.payPalDoRefTransactionService = payPalDoRefTransactionService;
    }


    /**
     * Gets the chinaPaymentService value for this RequestMessage.
     * 
     * @return chinaPaymentService
     */
    public com.cybersource.stub.ChinaPaymentService getChinaPaymentService() {
        return chinaPaymentService;
    }


    /**
     * Sets the chinaPaymentService value for this RequestMessage.
     * 
     * @param chinaPaymentService
     */
    public void setChinaPaymentService(com.cybersource.stub.ChinaPaymentService chinaPaymentService) {
        this.chinaPaymentService = chinaPaymentService;
    }


    /**
     * Gets the chinaRefundService value for this RequestMessage.
     * 
     * @return chinaRefundService
     */
    public com.cybersource.stub.ChinaRefundService getChinaRefundService() {
        return chinaRefundService;
    }


    /**
     * Sets the chinaRefundService value for this RequestMessage.
     * 
     * @param chinaRefundService
     */
    public void setChinaRefundService(com.cybersource.stub.ChinaRefundService chinaRefundService) {
        this.chinaRefundService = chinaRefundService;
    }


    /**
     * Gets the boletoPaymentService value for this RequestMessage.
     * 
     * @return boletoPaymentService
     */
    public com.cybersource.stub.BoletoPaymentService getBoletoPaymentService() {
        return boletoPaymentService;
    }


    /**
     * Sets the boletoPaymentService value for this RequestMessage.
     * 
     * @param boletoPaymentService
     */
    public void setBoletoPaymentService(com.cybersource.stub.BoletoPaymentService boletoPaymentService) {
        this.boletoPaymentService = boletoPaymentService;
    }


    /**
     * Gets the apPaymentType value for this RequestMessage.
     * 
     * @return apPaymentType
     */
    public java.lang.String getApPaymentType() {
        return apPaymentType;
    }


    /**
     * Sets the apPaymentType value for this RequestMessage.
     * 
     * @param apPaymentType
     */
    public void setApPaymentType(java.lang.String apPaymentType) {
        this.apPaymentType = apPaymentType;
    }


    /**
     * Gets the apInitiateService value for this RequestMessage.
     * 
     * @return apInitiateService
     */
    public com.cybersource.stub.APInitiateService getApInitiateService() {
        return apInitiateService;
    }


    /**
     * Sets the apInitiateService value for this RequestMessage.
     * 
     * @param apInitiateService
     */
    public void setApInitiateService(com.cybersource.stub.APInitiateService apInitiateService) {
        this.apInitiateService = apInitiateService;
    }


    /**
     * Gets the apCheckStatusService value for this RequestMessage.
     * 
     * @return apCheckStatusService
     */
    public com.cybersource.stub.APCheckStatusService getApCheckStatusService() {
        return apCheckStatusService;
    }


    /**
     * Sets the apCheckStatusService value for this RequestMessage.
     * 
     * @param apCheckStatusService
     */
    public void setApCheckStatusService(com.cybersource.stub.APCheckStatusService apCheckStatusService) {
        this.apCheckStatusService = apCheckStatusService;
    }


    /**
     * Gets the ignoreCardExpiration value for this RequestMessage.
     * 
     * @return ignoreCardExpiration
     */
    public java.lang.String getIgnoreCardExpiration() {
        return ignoreCardExpiration;
    }


    /**
     * Sets the ignoreCardExpiration value for this RequestMessage.
     * 
     * @param ignoreCardExpiration
     */
    public void setIgnoreCardExpiration(java.lang.String ignoreCardExpiration) {
        this.ignoreCardExpiration = ignoreCardExpiration;
    }


    /**
     * Gets the reportGroup value for this RequestMessage.
     * 
     * @return reportGroup
     */
    public java.lang.String getReportGroup() {
        return reportGroup;
    }


    /**
     * Sets the reportGroup value for this RequestMessage.
     * 
     * @param reportGroup
     */
    public void setReportGroup(java.lang.String reportGroup) {
        this.reportGroup = reportGroup;
    }


    /**
     * Gets the processorID value for this RequestMessage.
     * 
     * @return processorID
     */
    public java.lang.String getProcessorID() {
        return processorID;
    }


    /**
     * Sets the processorID value for this RequestMessage.
     * 
     * @param processorID
     */
    public void setProcessorID(java.lang.String processorID) {
        this.processorID = processorID;
    }


    /**
     * Gets the thirdPartyCertificationNumber value for this RequestMessage.
     * 
     * @return thirdPartyCertificationNumber
     */
    public java.lang.String getThirdPartyCertificationNumber() {
        return thirdPartyCertificationNumber;
    }


    /**
     * Sets the thirdPartyCertificationNumber value for this RequestMessage.
     * 
     * @param thirdPartyCertificationNumber
     */
    public void setThirdPartyCertificationNumber(java.lang.String thirdPartyCertificationNumber) {
        this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
    }


    /**
     * Gets the transactionLocalDateTime value for this RequestMessage.
     * 
     * @return transactionLocalDateTime
     */
    public java.lang.String getTransactionLocalDateTime() {
        return transactionLocalDateTime;
    }


    /**
     * Sets the transactionLocalDateTime value for this RequestMessage.
     * 
     * @param transactionLocalDateTime
     */
    public void setTransactionLocalDateTime(java.lang.String transactionLocalDateTime) {
        this.transactionLocalDateTime = transactionLocalDateTime;
    }


    /**
     * Gets the solutionProviderTransactionID value for this RequestMessage.
     * 
     * @return solutionProviderTransactionID
     */
    public java.lang.String getSolutionProviderTransactionID() {
        return solutionProviderTransactionID;
    }


    /**
     * Sets the solutionProviderTransactionID value for this RequestMessage.
     * 
     * @param solutionProviderTransactionID
     */
    public void setSolutionProviderTransactionID(java.lang.String solutionProviderTransactionID) {
        this.solutionProviderTransactionID = solutionProviderTransactionID;
    }


    /**
     * Gets the surchargeAmount value for this RequestMessage.
     * 
     * @return surchargeAmount
     */
    public java.lang.String getSurchargeAmount() {
        return surchargeAmount;
    }


    /**
     * Sets the surchargeAmount value for this RequestMessage.
     * 
     * @param surchargeAmount
     */
    public void setSurchargeAmount(java.lang.String surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }


    /**
     * Gets the surchargeSign value for this RequestMessage.
     * 
     * @return surchargeSign
     */
    public java.lang.String getSurchargeSign() {
        return surchargeSign;
    }


    /**
     * Sets the surchargeSign value for this RequestMessage.
     * 
     * @param surchargeSign
     */
    public void setSurchargeSign(java.lang.String surchargeSign) {
        this.surchargeSign = surchargeSign;
    }


    /**
     * Gets the pinDataEncryptedPIN value for this RequestMessage.
     * 
     * @return pinDataEncryptedPIN
     */
    public java.lang.String getPinDataEncryptedPIN() {
        return pinDataEncryptedPIN;
    }


    /**
     * Sets the pinDataEncryptedPIN value for this RequestMessage.
     * 
     * @param pinDataEncryptedPIN
     */
    public void setPinDataEncryptedPIN(java.lang.String pinDataEncryptedPIN) {
        this.pinDataEncryptedPIN = pinDataEncryptedPIN;
    }


    /**
     * Gets the pinDataKeySerialNumber value for this RequestMessage.
     * 
     * @return pinDataKeySerialNumber
     */
    public java.lang.String getPinDataKeySerialNumber() {
        return pinDataKeySerialNumber;
    }


    /**
     * Sets the pinDataKeySerialNumber value for this RequestMessage.
     * 
     * @param pinDataKeySerialNumber
     */
    public void setPinDataKeySerialNumber(java.lang.String pinDataKeySerialNumber) {
        this.pinDataKeySerialNumber = pinDataKeySerialNumber;
    }


    /**
     * Gets the cashbackAmount value for this RequestMessage.
     * 
     * @return cashbackAmount
     */
    public java.lang.String getCashbackAmount() {
        return cashbackAmount;
    }


    /**
     * Sets the cashbackAmount value for this RequestMessage.
     * 
     * @param cashbackAmount
     */
    public void setCashbackAmount(java.lang.String cashbackAmount) {
        this.cashbackAmount = cashbackAmount;
    }


    /**
     * Gets the pinDebitPurchaseService value for this RequestMessage.
     * 
     * @return pinDebitPurchaseService
     */
    public com.cybersource.stub.PinDebitPurchaseService getPinDebitPurchaseService() {
        return pinDebitPurchaseService;
    }


    /**
     * Sets the pinDebitPurchaseService value for this RequestMessage.
     * 
     * @param pinDebitPurchaseService
     */
    public void setPinDebitPurchaseService(com.cybersource.stub.PinDebitPurchaseService pinDebitPurchaseService) {
        this.pinDebitPurchaseService = pinDebitPurchaseService;
    }


    /**
     * Gets the pinDebitCreditService value for this RequestMessage.
     * 
     * @return pinDebitCreditService
     */
    public com.cybersource.stub.PinDebitCreditService getPinDebitCreditService() {
        return pinDebitCreditService;
    }


    /**
     * Sets the pinDebitCreditService value for this RequestMessage.
     * 
     * @param pinDebitCreditService
     */
    public void setPinDebitCreditService(com.cybersource.stub.PinDebitCreditService pinDebitCreditService) {
        this.pinDebitCreditService = pinDebitCreditService;
    }


    /**
     * Gets the pinDebitReversalService value for this RequestMessage.
     * 
     * @return pinDebitReversalService
     */
    public com.cybersource.stub.PinDebitReversalService getPinDebitReversalService() {
        return pinDebitReversalService;
    }


    /**
     * Sets the pinDebitReversalService value for this RequestMessage.
     * 
     * @param pinDebitReversalService
     */
    public void setPinDebitReversalService(com.cybersource.stub.PinDebitReversalService pinDebitReversalService) {
        this.pinDebitReversalService = pinDebitReversalService;
    }


    /**
     * Gets the ap value for this RequestMessage.
     * 
     * @return ap
     */
    public com.cybersource.stub.AP getAp() {
        return ap;
    }


    /**
     * Sets the ap value for this RequestMessage.
     * 
     * @param ap
     */
    public void setAp(com.cybersource.stub.AP ap) {
        this.ap = ap;
    }


    /**
     * Gets the apAuthService value for this RequestMessage.
     * 
     * @return apAuthService
     */
    public com.cybersource.stub.APAuthService getApAuthService() {
        return apAuthService;
    }


    /**
     * Sets the apAuthService value for this RequestMessage.
     * 
     * @param apAuthService
     */
    public void setApAuthService(com.cybersource.stub.APAuthService apAuthService) {
        this.apAuthService = apAuthService;
    }


    /**
     * Gets the apAuthReversalService value for this RequestMessage.
     * 
     * @return apAuthReversalService
     */
    public com.cybersource.stub.APAuthReversalService getApAuthReversalService() {
        return apAuthReversalService;
    }


    /**
     * Sets the apAuthReversalService value for this RequestMessage.
     * 
     * @param apAuthReversalService
     */
    public void setApAuthReversalService(com.cybersource.stub.APAuthReversalService apAuthReversalService) {
        this.apAuthReversalService = apAuthReversalService;
    }


    /**
     * Gets the apCaptureService value for this RequestMessage.
     * 
     * @return apCaptureService
     */
    public com.cybersource.stub.APCaptureService getApCaptureService() {
        return apCaptureService;
    }


    /**
     * Sets the apCaptureService value for this RequestMessage.
     * 
     * @param apCaptureService
     */
    public void setApCaptureService(com.cybersource.stub.APCaptureService apCaptureService) {
        this.apCaptureService = apCaptureService;
    }


    /**
     * Gets the apOptionsService value for this RequestMessage.
     * 
     * @return apOptionsService
     */
    public com.cybersource.stub.APOptionsService getApOptionsService() {
        return apOptionsService;
    }


    /**
     * Sets the apOptionsService value for this RequestMessage.
     * 
     * @param apOptionsService
     */
    public void setApOptionsService(com.cybersource.stub.APOptionsService apOptionsService) {
        this.apOptionsService = apOptionsService;
    }


    /**
     * Gets the apRefundService value for this RequestMessage.
     * 
     * @return apRefundService
     */
    public com.cybersource.stub.APRefundService getApRefundService() {
        return apRefundService;
    }


    /**
     * Sets the apRefundService value for this RequestMessage.
     * 
     * @param apRefundService
     */
    public void setApRefundService(com.cybersource.stub.APRefundService apRefundService) {
        this.apRefundService = apRefundService;
    }


    /**
     * Gets the apSaleService value for this RequestMessage.
     * 
     * @return apSaleService
     */
    public com.cybersource.stub.APSaleService getApSaleService() {
        return apSaleService;
    }


    /**
     * Sets the apSaleService value for this RequestMessage.
     * 
     * @param apSaleService
     */
    public void setApSaleService(com.cybersource.stub.APSaleService apSaleService) {
        this.apSaleService = apSaleService;
    }


    /**
     * Gets the apCheckoutDetailsService value for this RequestMessage.
     * 
     * @return apCheckoutDetailsService
     */
    public com.cybersource.stub.APCheckOutDetailsService getApCheckoutDetailsService() {
        return apCheckoutDetailsService;
    }


    /**
     * Sets the apCheckoutDetailsService value for this RequestMessage.
     * 
     * @param apCheckoutDetailsService
     */
    public void setApCheckoutDetailsService(com.cybersource.stub.APCheckOutDetailsService apCheckoutDetailsService) {
        this.apCheckoutDetailsService = apCheckoutDetailsService;
    }


    /**
     * Gets the apSessionsService value for this RequestMessage.
     * 
     * @return apSessionsService
     */
    public com.cybersource.stub.APSessionsService getApSessionsService() {
        return apSessionsService;
    }


    /**
     * Sets the apSessionsService value for this RequestMessage.
     * 
     * @param apSessionsService
     */
    public void setApSessionsService(com.cybersource.stub.APSessionsService apSessionsService) {
        this.apSessionsService = apSessionsService;
    }


    /**
     * Gets the apUI value for this RequestMessage.
     * 
     * @return apUI
     */
    public com.cybersource.stub.APUI getApUI() {
        return apUI;
    }


    /**
     * Sets the apUI value for this RequestMessage.
     * 
     * @param apUI
     */
    public void setApUI(com.cybersource.stub.APUI apUI) {
        this.apUI = apUI;
    }


    /**
     * Gets the apTransactionDetailsService value for this RequestMessage.
     * 
     * @return apTransactionDetailsService
     */
    public com.cybersource.stub.APTransactionDetailsService getApTransactionDetailsService() {
        return apTransactionDetailsService;
    }


    /**
     * Sets the apTransactionDetailsService value for this RequestMessage.
     * 
     * @param apTransactionDetailsService
     */
    public void setApTransactionDetailsService(com.cybersource.stub.APTransactionDetailsService apTransactionDetailsService) {
        this.apTransactionDetailsService = apTransactionDetailsService;
    }


    /**
     * Gets the apConfirmPurchaseService value for this RequestMessage.
     * 
     * @return apConfirmPurchaseService
     */
    public com.cybersource.stub.APConfirmPurchaseService getApConfirmPurchaseService() {
        return apConfirmPurchaseService;
    }


    /**
     * Sets the apConfirmPurchaseService value for this RequestMessage.
     * 
     * @param apConfirmPurchaseService
     */
    public void setApConfirmPurchaseService(com.cybersource.stub.APConfirmPurchaseService apConfirmPurchaseService) {
        this.apConfirmPurchaseService = apConfirmPurchaseService;
    }


    /**
     * Gets the payPalGetTxnDetailsService value for this RequestMessage.
     * 
     * @return payPalGetTxnDetailsService
     */
    public com.cybersource.stub.PayPalGetTxnDetailsService getPayPalGetTxnDetailsService() {
        return payPalGetTxnDetailsService;
    }


    /**
     * Sets the payPalGetTxnDetailsService value for this RequestMessage.
     * 
     * @param payPalGetTxnDetailsService
     */
    public void setPayPalGetTxnDetailsService(com.cybersource.stub.PayPalGetTxnDetailsService payPalGetTxnDetailsService) {
        this.payPalGetTxnDetailsService = payPalGetTxnDetailsService;
    }


    /**
     * Gets the payPalTransactionSearchService value for this RequestMessage.
     * 
     * @return payPalTransactionSearchService
     */
    public com.cybersource.stub.PayPalTransactionSearchService getPayPalTransactionSearchService() {
        return payPalTransactionSearchService;
    }


    /**
     * Sets the payPalTransactionSearchService value for this RequestMessage.
     * 
     * @param payPalTransactionSearchService
     */
    public void setPayPalTransactionSearchService(com.cybersource.stub.PayPalTransactionSearchService payPalTransactionSearchService) {
        this.payPalTransactionSearchService = payPalTransactionSearchService;
    }


    /**
     * Gets the ccDCCUpdateService value for this RequestMessage.
     * 
     * @return ccDCCUpdateService
     */
    public com.cybersource.stub.CCDCCUpdateService getCcDCCUpdateService() {
        return ccDCCUpdateService;
    }


    /**
     * Sets the ccDCCUpdateService value for this RequestMessage.
     * 
     * @param ccDCCUpdateService
     */
    public void setCcDCCUpdateService(com.cybersource.stub.CCDCCUpdateService ccDCCUpdateService) {
        this.ccDCCUpdateService = ccDCCUpdateService;
    }


    /**
     * Gets the emvRequest value for this RequestMessage.
     * 
     * @return emvRequest
     */
    public com.cybersource.stub.EmvRequest getEmvRequest() {
        return emvRequest;
    }


    /**
     * Sets the emvRequest value for this RequestMessage.
     * 
     * @param emvRequest
     */
    public void setEmvRequest(com.cybersource.stub.EmvRequest emvRequest) {
        this.emvRequest = emvRequest;
    }


    /**
     * Gets the merchantTransactionIdentifier value for this RequestMessage.
     * 
     * @return merchantTransactionIdentifier
     */
    public java.lang.String getMerchantTransactionIdentifier() {
        return merchantTransactionIdentifier;
    }


    /**
     * Sets the merchantTransactionIdentifier value for this RequestMessage.
     * 
     * @param merchantTransactionIdentifier
     */
    public void setMerchantTransactionIdentifier(java.lang.String merchantTransactionIdentifier) {
        this.merchantTransactionIdentifier = merchantTransactionIdentifier;
    }


    /**
     * Gets the hostedDataCreateService value for this RequestMessage.
     * 
     * @return hostedDataCreateService
     */
    public com.cybersource.stub.HostedDataCreateService getHostedDataCreateService() {
        return hostedDataCreateService;
    }


    /**
     * Sets the hostedDataCreateService value for this RequestMessage.
     * 
     * @param hostedDataCreateService
     */
    public void setHostedDataCreateService(com.cybersource.stub.HostedDataCreateService hostedDataCreateService) {
        this.hostedDataCreateService = hostedDataCreateService;
    }


    /**
     * Gets the hostedDataRetrieveService value for this RequestMessage.
     * 
     * @return hostedDataRetrieveService
     */
    public com.cybersource.stub.HostedDataRetrieveService getHostedDataRetrieveService() {
        return hostedDataRetrieveService;
    }


    /**
     * Sets the hostedDataRetrieveService value for this RequestMessage.
     * 
     * @param hostedDataRetrieveService
     */
    public void setHostedDataRetrieveService(com.cybersource.stub.HostedDataRetrieveService hostedDataRetrieveService) {
        this.hostedDataRetrieveService = hostedDataRetrieveService;
    }


    /**
     * Gets the merchantCategoryCode value for this RequestMessage.
     * 
     * @return merchantCategoryCode
     */
    public java.lang.String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }


    /**
     * Sets the merchantCategoryCode value for this RequestMessage.
     * 
     * @param merchantCategoryCode
     */
    public void setMerchantCategoryCode(java.lang.String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }


    /**
     * Gets the salesSlipNumber value for this RequestMessage.
     * 
     * @return salesSlipNumber
     */
    public java.lang.String getSalesSlipNumber() {
        return salesSlipNumber;
    }


    /**
     * Sets the salesSlipNumber value for this RequestMessage.
     * 
     * @param salesSlipNumber
     */
    public void setSalesSlipNumber(java.lang.String salesSlipNumber) {
        this.salesSlipNumber = salesSlipNumber;
    }


    /**
     * Gets the merchandiseCode value for this RequestMessage.
     * 
     * @return merchandiseCode
     */
    public java.lang.String getMerchandiseCode() {
        return merchandiseCode;
    }


    /**
     * Sets the merchandiseCode value for this RequestMessage.
     * 
     * @param merchandiseCode
     */
    public void setMerchandiseCode(java.lang.String merchandiseCode) {
        this.merchandiseCode = merchandiseCode;
    }


    /**
     * Gets the merchandiseDescription value for this RequestMessage.
     * 
     * @return merchandiseDescription
     */
    public java.lang.String getMerchandiseDescription() {
        return merchandiseDescription;
    }


    /**
     * Sets the merchandiseDescription value for this RequestMessage.
     * 
     * @param merchandiseDescription
     */
    public void setMerchandiseDescription(java.lang.String merchandiseDescription) {
        this.merchandiseDescription = merchandiseDescription;
    }


    /**
     * Gets the paymentInitiationChannel value for this RequestMessage.
     * 
     * @return paymentInitiationChannel
     */
    public java.lang.String getPaymentInitiationChannel() {
        return paymentInitiationChannel;
    }


    /**
     * Sets the paymentInitiationChannel value for this RequestMessage.
     * 
     * @param paymentInitiationChannel
     */
    public void setPaymentInitiationChannel(java.lang.String paymentInitiationChannel) {
        this.paymentInitiationChannel = paymentInitiationChannel;
    }


    /**
     * Gets the extendedCreditTotalCount value for this RequestMessage.
     * 
     * @return extendedCreditTotalCount
     */
    public java.lang.String getExtendedCreditTotalCount() {
        return extendedCreditTotalCount;
    }


    /**
     * Sets the extendedCreditTotalCount value for this RequestMessage.
     * 
     * @param extendedCreditTotalCount
     */
    public void setExtendedCreditTotalCount(java.lang.String extendedCreditTotalCount) {
        this.extendedCreditTotalCount = extendedCreditTotalCount;
    }


    /**
     * Gets the authIndicator value for this RequestMessage.
     * 
     * @return authIndicator
     */
    public java.lang.String getAuthIndicator() {
        return authIndicator;
    }


    /**
     * Sets the authIndicator value for this RequestMessage.
     * 
     * @param authIndicator
     */
    public void setAuthIndicator(java.lang.String authIndicator) {
        this.authIndicator = authIndicator;
    }


    /**
     * Gets the paymentNetworkToken value for this RequestMessage.
     * 
     * @return paymentNetworkToken
     */
    public com.cybersource.stub.PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }


    /**
     * Sets the paymentNetworkToken value for this RequestMessage.
     * 
     * @param paymentNetworkToken
     */
    public void setPaymentNetworkToken(com.cybersource.stub.PaymentNetworkToken paymentNetworkToken) {
        this.paymentNetworkToken = paymentNetworkToken;
    }


    /**
     * Gets the recipient value for this RequestMessage.
     * 
     * @return recipient
     */
    public com.cybersource.stub.Recipient getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestMessage.
     * 
     * @param recipient
     */
    public void setRecipient(com.cybersource.stub.Recipient recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the sender value for this RequestMessage.
     * 
     * @return sender
     */
    public com.cybersource.stub.Sender getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this RequestMessage.
     * 
     * @param sender
     */
    public void setSender(com.cybersource.stub.Sender sender) {
        this.sender = sender;
    }


    /**
     * Gets the autoRentalData value for this RequestMessage.
     * 
     * @return autoRentalData
     */
    public com.cybersource.stub.AutoRentalData getAutoRentalData() {
        return autoRentalData;
    }


    /**
     * Sets the autoRentalData value for this RequestMessage.
     * 
     * @param autoRentalData
     */
    public void setAutoRentalData(com.cybersource.stub.AutoRentalData autoRentalData) {
        this.autoRentalData = autoRentalData;
    }


    /**
     * Gets the paymentSolution value for this RequestMessage.
     * 
     * @return paymentSolution
     */
    public java.lang.String getPaymentSolution() {
        return paymentSolution;
    }


    /**
     * Sets the paymentSolution value for this RequestMessage.
     * 
     * @param paymentSolution
     */
    public void setPaymentSolution(java.lang.String paymentSolution) {
        this.paymentSolution = paymentSolution;
    }


    /**
     * Gets the vc value for this RequestMessage.
     * 
     * @return vc
     */
    public com.cybersource.stub.VC getVc() {
        return vc;
    }


    /**
     * Sets the vc value for this RequestMessage.
     * 
     * @param vc
     */
    public void setVc(com.cybersource.stub.VC vc) {
        this.vc = vc;
    }


    /**
     * Gets the decryptVisaCheckoutDataService value for this RequestMessage.
     * 
     * @return decryptVisaCheckoutDataService
     */
    public com.cybersource.stub.DecryptVisaCheckoutDataService getDecryptVisaCheckoutDataService() {
        return decryptVisaCheckoutDataService;
    }


    /**
     * Sets the decryptVisaCheckoutDataService value for this RequestMessage.
     * 
     * @param decryptVisaCheckoutDataService
     */
    public void setDecryptVisaCheckoutDataService(com.cybersource.stub.DecryptVisaCheckoutDataService decryptVisaCheckoutDataService) {
        this.decryptVisaCheckoutDataService = decryptVisaCheckoutDataService;
    }


    /**
     * Gets the taxManagementIndicator value for this RequestMessage.
     * 
     * @return taxManagementIndicator
     */
    public java.lang.String getTaxManagementIndicator() {
        return taxManagementIndicator;
    }


    /**
     * Sets the taxManagementIndicator value for this RequestMessage.
     * 
     * @param taxManagementIndicator
     */
    public void setTaxManagementIndicator(java.lang.String taxManagementIndicator) {
        this.taxManagementIndicator = taxManagementIndicator;
    }


    /**
     * Gets the promotionGroup value for this RequestMessage.
     * 
     * @return promotionGroup
     */
    public com.cybersource.stub.PromotionGroup[] getPromotionGroup() {
        return promotionGroup;
    }


    /**
     * Sets the promotionGroup value for this RequestMessage.
     * 
     * @param promotionGroup
     */
    public void setPromotionGroup(com.cybersource.stub.PromotionGroup[] promotionGroup) {
        this.promotionGroup = promotionGroup;
    }

    public com.cybersource.stub.PromotionGroup getPromotionGroup(int i) {
        return this.promotionGroup[i];
    }

    public void setPromotionGroup(int i, com.cybersource.stub.PromotionGroup _value) {
        this.promotionGroup[i] = _value;
    }


    /**
     * Gets the wallet value for this RequestMessage.
     * 
     * @return wallet
     */
    public com.cybersource.stub.Wallet getWallet() {
        return wallet;
    }


    /**
     * Sets the wallet value for this RequestMessage.
     * 
     * @param wallet
     */
    public void setWallet(com.cybersource.stub.Wallet wallet) {
        this.wallet = wallet;
    }


    /**
     * Gets the aft value for this RequestMessage.
     * 
     * @return aft
     */
    public com.cybersource.stub.Aft getAft() {
        return aft;
    }


    /**
     * Sets the aft value for this RequestMessage.
     * 
     * @param aft
     */
    public void setAft(com.cybersource.stub.Aft aft) {
        this.aft = aft;
    }


    /**
     * Gets the balanceInquiry value for this RequestMessage.
     * 
     * @return balanceInquiry
     */
    public java.lang.String getBalanceInquiry() {
        return balanceInquiry;
    }


    /**
     * Sets the balanceInquiry value for this RequestMessage.
     * 
     * @param balanceInquiry
     */
    public void setBalanceInquiry(java.lang.String balanceInquiry) {
        this.balanceInquiry = balanceInquiry;
    }


    /**
     * Gets the prenoteTransaction value for this RequestMessage.
     * 
     * @return prenoteTransaction
     */
    public java.lang.String getPrenoteTransaction() {
        return prenoteTransaction;
    }


    /**
     * Sets the prenoteTransaction value for this RequestMessage.
     * 
     * @param prenoteTransaction
     */
    public void setPrenoteTransaction(java.lang.String prenoteTransaction) {
        this.prenoteTransaction = prenoteTransaction;
    }


    /**
     * Gets the encryptPaymentDataService value for this RequestMessage.
     * 
     * @return encryptPaymentDataService
     */
    public com.cybersource.stub.EncryptPaymentDataService getEncryptPaymentDataService() {
        return encryptPaymentDataService;
    }


    /**
     * Sets the encryptPaymentDataService value for this RequestMessage.
     * 
     * @param encryptPaymentDataService
     */
    public void setEncryptPaymentDataService(com.cybersource.stub.EncryptPaymentDataService encryptPaymentDataService) {
        this.encryptPaymentDataService = encryptPaymentDataService;
    }


    /**
     * Gets the nationalNetDomesticData value for this RequestMessage.
     * 
     * @return nationalNetDomesticData
     */
    public java.lang.String getNationalNetDomesticData() {
        return nationalNetDomesticData;
    }


    /**
     * Sets the nationalNetDomesticData value for this RequestMessage.
     * 
     * @param nationalNetDomesticData
     */
    public void setNationalNetDomesticData(java.lang.String nationalNetDomesticData) {
        this.nationalNetDomesticData = nationalNetDomesticData;
    }


    /**
     * Gets the subsequentAuth value for this RequestMessage.
     * 
     * @return subsequentAuth
     */
    public java.lang.String getSubsequentAuth() {
        return subsequentAuth;
    }


    /**
     * Sets the subsequentAuth value for this RequestMessage.
     * 
     * @param subsequentAuth
     */
    public void setSubsequentAuth(java.lang.String subsequentAuth) {
        this.subsequentAuth = subsequentAuth;
    }


    /**
     * Gets the binLookupService value for this RequestMessage.
     * 
     * @return binLookupService
     */
    public com.cybersource.stub.BinLookupService getBinLookupService() {
        return binLookupService;
    }


    /**
     * Sets the binLookupService value for this RequestMessage.
     * 
     * @param binLookupService
     */
    public void setBinLookupService(com.cybersource.stub.BinLookupService binLookupService) {
        this.binLookupService = binLookupService;
    }


    /**
     * Gets the verificationCode value for this RequestMessage.
     * 
     * @return verificationCode
     */
    public java.lang.String getVerificationCode() {
        return verificationCode;
    }


    /**
     * Sets the verificationCode value for this RequestMessage.
     * 
     * @param verificationCode
     */
    public void setVerificationCode(java.lang.String verificationCode) {
        this.verificationCode = verificationCode;
    }


    /**
     * Gets the mobileNumber value for this RequestMessage.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this RequestMessage.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the issuer value for this RequestMessage.
     * 
     * @return issuer
     */
    public com.cybersource.stub.Issuer getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this RequestMessage.
     * 
     * @param issuer
     */
    public void setIssuer(com.cybersource.stub.Issuer issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the partnerSolutionID value for this RequestMessage.
     * 
     * @return partnerSolutionID
     */
    public java.lang.String getPartnerSolutionID() {
        return partnerSolutionID;
    }


    /**
     * Sets the partnerSolutionID value for this RequestMessage.
     * 
     * @param partnerSolutionID
     */
    public void setPartnerSolutionID(java.lang.String partnerSolutionID) {
        this.partnerSolutionID = partnerSolutionID;
    }


    /**
     * Gets the developerID value for this RequestMessage.
     * 
     * @return developerID
     */
    public java.lang.String getDeveloperID() {
        return developerID;
    }


    /**
     * Sets the developerID value for this RequestMessage.
     * 
     * @param developerID
     */
    public void setDeveloperID(java.lang.String developerID) {
        this.developerID = developerID;
    }


    /**
     * Gets the getVisaCheckoutDataService value for this RequestMessage.
     * 
     * @return getVisaCheckoutDataService
     */
    public com.cybersource.stub.GETVisaCheckoutDataService getGetVisaCheckoutDataService() {
        return getVisaCheckoutDataService;
    }


    /**
     * Sets the getVisaCheckoutDataService value for this RequestMessage.
     * 
     * @param getVisaCheckoutDataService
     */
    public void setGetVisaCheckoutDataService(com.cybersource.stub.GETVisaCheckoutDataService getVisaCheckoutDataService) {
        this.getVisaCheckoutDataService = getVisaCheckoutDataService;
    }


    /**
     * Gets the customerSignatureImage value for this RequestMessage.
     * 
     * @return customerSignatureImage
     */
    public java.lang.String getCustomerSignatureImage() {
        return customerSignatureImage;
    }


    /**
     * Sets the customerSignatureImage value for this RequestMessage.
     * 
     * @param customerSignatureImage
     */
    public void setCustomerSignatureImage(java.lang.String customerSignatureImage) {
        this.customerSignatureImage = customerSignatureImage;
    }


    /**
     * Gets the transactionMetadataService value for this RequestMessage.
     * 
     * @return transactionMetadataService
     */
    public com.cybersource.stub.TransactionMetadataService getTransactionMetadataService() {
        return transactionMetadataService;
    }


    /**
     * Sets the transactionMetadataService value for this RequestMessage.
     * 
     * @param transactionMetadataService
     */
    public void setTransactionMetadataService(com.cybersource.stub.TransactionMetadataService transactionMetadataService) {
        this.transactionMetadataService = transactionMetadataService;
    }


    /**
     * Gets the subsequentAuthFirst value for this RequestMessage.
     * 
     * @return subsequentAuthFirst
     */
    public java.lang.String getSubsequentAuthFirst() {
        return subsequentAuthFirst;
    }


    /**
     * Sets the subsequentAuthFirst value for this RequestMessage.
     * 
     * @param subsequentAuthFirst
     */
    public void setSubsequentAuthFirst(java.lang.String subsequentAuthFirst) {
        this.subsequentAuthFirst = subsequentAuthFirst;
    }


    /**
     * Gets the subsequentAuthReason value for this RequestMessage.
     * 
     * @return subsequentAuthReason
     */
    public java.lang.String getSubsequentAuthReason() {
        return subsequentAuthReason;
    }


    /**
     * Sets the subsequentAuthReason value for this RequestMessage.
     * 
     * @param subsequentAuthReason
     */
    public void setSubsequentAuthReason(java.lang.String subsequentAuthReason) {
        this.subsequentAuthReason = subsequentAuthReason;
    }


    /**
     * Gets the subsequentAuthTransactionID value for this RequestMessage.
     * 
     * @return subsequentAuthTransactionID
     */
    public java.lang.String getSubsequentAuthTransactionID() {
        return subsequentAuthTransactionID;
    }


    /**
     * Sets the subsequentAuthTransactionID value for this RequestMessage.
     * 
     * @param subsequentAuthTransactionID
     */
    public void setSubsequentAuthTransactionID(java.lang.String subsequentAuthTransactionID) {
        this.subsequentAuthTransactionID = subsequentAuthTransactionID;
    }


    /**
     * Gets the loan value for this RequestMessage.
     * 
     * @return loan
     */
    public com.cybersource.stub.Loan getLoan() {
        return loan;
    }


    /**
     * Sets the loan value for this RequestMessage.
     * 
     * @param loan
     */
    public void setLoan(com.cybersource.stub.Loan loan) {
        this.loan = loan;
    }


    /**
     * Gets the eligibilityInquiry value for this RequestMessage.
     * 
     * @return eligibilityInquiry
     */
    public java.lang.String getEligibilityInquiry() {
        return eligibilityInquiry;
    }


    /**
     * Sets the eligibilityInquiry value for this RequestMessage.
     * 
     * @param eligibilityInquiry
     */
    public void setEligibilityInquiry(java.lang.String eligibilityInquiry) {
        this.eligibilityInquiry = eligibilityInquiry;
    }


    /**
     * Gets the redemptionInquiry value for this RequestMessage.
     * 
     * @return redemptionInquiry
     */
    public java.lang.String getRedemptionInquiry() {
        return redemptionInquiry;
    }


    /**
     * Sets the redemptionInquiry value for this RequestMessage.
     * 
     * @param redemptionInquiry
     */
    public void setRedemptionInquiry(java.lang.String redemptionInquiry) {
        this.redemptionInquiry = redemptionInquiry;
    }


    /**
     * Gets the feeProgramIndicator value for this RequestMessage.
     * 
     * @return feeProgramIndicator
     */
    public java.lang.String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }


    /**
     * Sets the feeProgramIndicator value for this RequestMessage.
     * 
     * @param feeProgramIndicator
     */
    public void setFeeProgramIndicator(java.lang.String feeProgramIndicator) {
        this.feeProgramIndicator = feeProgramIndicator;
    }


    /**
     * Gets the apOrderService value for this RequestMessage.
     * 
     * @return apOrderService
     */
    public com.cybersource.stub.APOrderService getApOrderService() {
        return apOrderService;
    }


    /**
     * Sets the apOrderService value for this RequestMessage.
     * 
     * @param apOrderService
     */
    public void setApOrderService(com.cybersource.stub.APOrderService apOrderService) {
        this.apOrderService = apOrderService;
    }


    /**
     * Gets the apCancelService value for this RequestMessage.
     * 
     * @return apCancelService
     */
    public com.cybersource.stub.APCancelService getApCancelService() {
        return apCancelService;
    }


    /**
     * Sets the apCancelService value for this RequestMessage.
     * 
     * @param apCancelService
     */
    public void setApCancelService(com.cybersource.stub.APCancelService apCancelService) {
        this.apCancelService = apCancelService;
    }


    /**
     * Gets the apBillingAgreementService value for this RequestMessage.
     * 
     * @return apBillingAgreementService
     */
    public com.cybersource.stub.APBillingAgreementService getApBillingAgreementService() {
        return apBillingAgreementService;
    }


    /**
     * Sets the apBillingAgreementService value for this RequestMessage.
     * 
     * @param apBillingAgreementService
     */
    public void setApBillingAgreementService(com.cybersource.stub.APBillingAgreementService apBillingAgreementService) {
        this.apBillingAgreementService = apBillingAgreementService;
    }


    /**
     * Gets the note_toPayee value for this RequestMessage.
     * 
     * @return note_toPayee
     */
    public java.lang.String getNote_toPayee() {
        return note_toPayee;
    }


    /**
     * Sets the note_toPayee value for this RequestMessage.
     * 
     * @param note_toPayee
     */
    public void setNote_toPayee(java.lang.String note_toPayee) {
        this.note_toPayee = note_toPayee;
    }


    /**
     * Gets the note_toPayer value for this RequestMessage.
     * 
     * @return note_toPayer
     */
    public java.lang.String getNote_toPayer() {
        return note_toPayer;
    }


    /**
     * Sets the note_toPayer value for this RequestMessage.
     * 
     * @param note_toPayer
     */
    public void setNote_toPayer(java.lang.String note_toPayer) {
        this.note_toPayer = note_toPayer;
    }


    /**
     * Gets the partnerSDKversion value for this RequestMessage.
     * 
     * @return partnerSDKversion
     */
    public java.lang.String getPartnerSDKversion() {
        return partnerSDKversion;
    }


    /**
     * Sets the partnerSDKversion value for this RequestMessage.
     * 
     * @param partnerSDKversion
     */
    public void setPartnerSDKversion(java.lang.String partnerSDKversion) {
        this.partnerSDKversion = partnerSDKversion;
    }


    /**
     * Gets the partnerOriginalTransactionID value for this RequestMessage.
     * 
     * @return partnerOriginalTransactionID
     */
    public java.lang.String getPartnerOriginalTransactionID() {
        return partnerOriginalTransactionID;
    }


    /**
     * Sets the partnerOriginalTransactionID value for this RequestMessage.
     * 
     * @param partnerOriginalTransactionID
     */
    public void setPartnerOriginalTransactionID(java.lang.String partnerOriginalTransactionID) {
        this.partnerOriginalTransactionID = partnerOriginalTransactionID;
    }


    /**
     * Gets the cardTypeSelectionIndicator value for this RequestMessage.
     * 
     * @return cardTypeSelectionIndicator
     */
    public java.lang.String getCardTypeSelectionIndicator() {
        return cardTypeSelectionIndicator;
    }


    /**
     * Sets the cardTypeSelectionIndicator value for this RequestMessage.
     * 
     * @param cardTypeSelectionIndicator
     */
    public void setCardTypeSelectionIndicator(java.lang.String cardTypeSelectionIndicator) {
        this.cardTypeSelectionIndicator = cardTypeSelectionIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestMessage)) return false;
        RequestMessage other = (RequestMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.merchantReferenceCode==null && other.getMerchantReferenceCode()==null) || 
             (this.merchantReferenceCode!=null &&
              this.merchantReferenceCode.equals(other.getMerchantReferenceCode()))) &&
            ((this.debtIndicator==null && other.getDebtIndicator()==null) || 
             (this.debtIndicator!=null &&
              this.debtIndicator.equals(other.getDebtIndicator()))) &&
            ((this.clientLibrary==null && other.getClientLibrary()==null) || 
             (this.clientLibrary!=null &&
              this.clientLibrary.equals(other.getClientLibrary()))) &&
            ((this.clientLibraryVersion==null && other.getClientLibraryVersion()==null) || 
             (this.clientLibraryVersion!=null &&
              this.clientLibraryVersion.equals(other.getClientLibraryVersion()))) &&
            ((this.clientEnvironment==null && other.getClientEnvironment()==null) || 
             (this.clientEnvironment!=null &&
              this.clientEnvironment.equals(other.getClientEnvironment()))) &&
            ((this.clientSecurityLibraryVersion==null && other.getClientSecurityLibraryVersion()==null) || 
             (this.clientSecurityLibraryVersion!=null &&
              this.clientSecurityLibraryVersion.equals(other.getClientSecurityLibraryVersion()))) &&
            ((this.clientApplication==null && other.getClientApplication()==null) || 
             (this.clientApplication!=null &&
              this.clientApplication.equals(other.getClientApplication()))) &&
            ((this.clientApplicationVersion==null && other.getClientApplicationVersion()==null) || 
             (this.clientApplicationVersion!=null &&
              this.clientApplicationVersion.equals(other.getClientApplicationVersion()))) &&
            ((this.clientApplicationUser==null && other.getClientApplicationUser()==null) || 
             (this.clientApplicationUser!=null &&
              this.clientApplicationUser.equals(other.getClientApplicationUser()))) &&
            ((this.routingCode==null && other.getRoutingCode()==null) || 
             (this.routingCode!=null &&
              this.routingCode.equals(other.getRoutingCode()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.invoiceHeader==null && other.getInvoiceHeader()==null) || 
             (this.invoiceHeader!=null &&
              this.invoiceHeader.equals(other.getInvoiceHeader()))) &&
            ((this.aggregatorMerchantIdentifier==null && other.getAggregatorMerchantIdentifier()==null) || 
             (this.aggregatorMerchantIdentifier!=null &&
              this.aggregatorMerchantIdentifier.equals(other.getAggregatorMerchantIdentifier()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.customerFirstName==null && other.getCustomerFirstName()==null) || 
             (this.customerFirstName!=null &&
              this.customerFirstName.equals(other.getCustomerFirstName()))) &&
            ((this.customerLastName==null && other.getCustomerLastName()==null) || 
             (this.customerLastName!=null &&
              this.customerLastName.equals(other.getCustomerLastName()))) &&
            ((this.billTo==null && other.getBillTo()==null) || 
             (this.billTo!=null &&
              this.billTo.equals(other.getBillTo()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.personalID==null && other.getPersonalID()==null) || 
             (this.personalID!=null &&
              this.personalID.equals(other.getPersonalID()))) &&
            ((this.shipFrom==null && other.getShipFrom()==null) || 
             (this.shipFrom!=null &&
              this.shipFrom.equals(other.getShipFrom()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.purchaseTotals==null && other.getPurchaseTotals()==null) || 
             (this.purchaseTotals!=null &&
              this.purchaseTotals.equals(other.getPurchaseTotals()))) &&
            ((this.fundingTotals==null && other.getFundingTotals()==null) || 
             (this.fundingTotals!=null &&
              this.fundingTotals.equals(other.getFundingTotals()))) &&
            ((this.dcc==null && other.getDcc()==null) || 
             (this.dcc!=null &&
              this.dcc.equals(other.getDcc()))) &&
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.encryptedPayment==null && other.getEncryptedPayment()==null) || 
             (this.encryptedPayment!=null &&
              this.encryptedPayment.equals(other.getEncryptedPayment()))) &&
            ((this.installment==null && other.getInstallment()==null) || 
             (this.installment!=null &&
              this.installment.equals(other.getInstallment()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.bml==null && other.getBml()==null) || 
             (this.bml!=null &&
              this.bml.equals(other.getBml()))) &&
            ((this.gecc==null && other.getGecc()==null) || 
             (this.gecc!=null &&
              this.gecc.equals(other.getGecc()))) &&
            ((this.ucaf==null && other.getUcaf()==null) || 
             (this.ucaf!=null &&
              this.ucaf.equals(other.getUcaf()))) &&
            ((this.fundTransfer==null && other.getFundTransfer()==null) || 
             (this.fundTransfer!=null &&
              this.fundTransfer.equals(other.getFundTransfer()))) &&
            ((this.bankInfo==null && other.getBankInfo()==null) || 
             (this.bankInfo!=null &&
              this.bankInfo.equals(other.getBankInfo()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.recurringSubscriptionInfo==null && other.getRecurringSubscriptionInfo()==null) || 
             (this.recurringSubscriptionInfo!=null &&
              this.recurringSubscriptionInfo.equals(other.getRecurringSubscriptionInfo()))) &&
            ((this.decisionManager==null && other.getDecisionManager()==null) || 
             (this.decisionManager!=null &&
              this.decisionManager.equals(other.getDecisionManager()))) &&
            ((this.otherTax==null && other.getOtherTax()==null) || 
             (this.otherTax!=null &&
              this.otherTax.equals(other.getOtherTax()))) &&
            ((this.paypal==null && other.getPaypal()==null) || 
             (this.paypal!=null &&
              this.paypal.equals(other.getPaypal()))) &&
            ((this.merchantDefinedData==null && other.getMerchantDefinedData()==null) || 
             (this.merchantDefinedData!=null &&
              this.merchantDefinedData.equals(other.getMerchantDefinedData()))) &&
            ((this.merchantSecureData==null && other.getMerchantSecureData()==null) || 
             (this.merchantSecureData!=null &&
              this.merchantSecureData.equals(other.getMerchantSecureData()))) &&
            ((this.jpo==null && other.getJpo()==null) || 
             (this.jpo!=null &&
              this.jpo.equals(other.getJpo()))) &&
            ((this.orderRequestToken==null && other.getOrderRequestToken()==null) || 
             (this.orderRequestToken!=null &&
              this.orderRequestToken.equals(other.getOrderRequestToken()))) &&
            ((this.linkToRequest==null && other.getLinkToRequest()==null) || 
             (this.linkToRequest!=null &&
              this.linkToRequest.equals(other.getLinkToRequest()))) &&
            ((this.serviceFee==null && other.getServiceFee()==null) || 
             (this.serviceFee!=null &&
              this.serviceFee.equals(other.getServiceFee()))) &&
            ((this.ccAuthService==null && other.getCcAuthService()==null) || 
             (this.ccAuthService!=null &&
              this.ccAuthService.equals(other.getCcAuthService()))) &&
            ((this.octService==null && other.getOctService()==null) || 
             (this.octService!=null &&
              this.octService.equals(other.getOctService()))) &&
            ((this.verificationService==null && other.getVerificationService()==null) || 
             (this.verificationService!=null &&
              this.verificationService.equals(other.getVerificationService()))) &&
            ((this.ccSaleService==null && other.getCcSaleService()==null) || 
             (this.ccSaleService!=null &&
              this.ccSaleService.equals(other.getCcSaleService()))) &&
            ((this.ccSaleCreditService==null && other.getCcSaleCreditService()==null) || 
             (this.ccSaleCreditService!=null &&
              this.ccSaleCreditService.equals(other.getCcSaleCreditService()))) &&
            ((this.ccSaleReversalService==null && other.getCcSaleReversalService()==null) || 
             (this.ccSaleReversalService!=null &&
              this.ccSaleReversalService.equals(other.getCcSaleReversalService()))) &&
            ((this.ccIncrementalAuthService==null && other.getCcIncrementalAuthService()==null) || 
             (this.ccIncrementalAuthService!=null &&
              this.ccIncrementalAuthService.equals(other.getCcIncrementalAuthService()))) &&
            ((this.ccCaptureService==null && other.getCcCaptureService()==null) || 
             (this.ccCaptureService!=null &&
              this.ccCaptureService.equals(other.getCcCaptureService()))) &&
            ((this.ccCreditService==null && other.getCcCreditService()==null) || 
             (this.ccCreditService!=null &&
              this.ccCreditService.equals(other.getCcCreditService()))) &&
            ((this.ccAuthReversalService==null && other.getCcAuthReversalService()==null) || 
             (this.ccAuthReversalService!=null &&
              this.ccAuthReversalService.equals(other.getCcAuthReversalService()))) &&
            ((this.ccAutoAuthReversalService==null && other.getCcAutoAuthReversalService()==null) || 
             (this.ccAutoAuthReversalService!=null &&
              this.ccAutoAuthReversalService.equals(other.getCcAutoAuthReversalService()))) &&
            ((this.ccDCCService==null && other.getCcDCCService()==null) || 
             (this.ccDCCService!=null &&
              this.ccDCCService.equals(other.getCcDCCService()))) &&
            ((this.serviceFeeCalculateService==null && other.getServiceFeeCalculateService()==null) || 
             (this.serviceFeeCalculateService!=null &&
              this.serviceFeeCalculateService.equals(other.getServiceFeeCalculateService()))) &&
            ((this.ecDebitService==null && other.getEcDebitService()==null) || 
             (this.ecDebitService!=null &&
              this.ecDebitService.equals(other.getEcDebitService()))) &&
            ((this.ecCreditService==null && other.getEcCreditService()==null) || 
             (this.ecCreditService!=null &&
              this.ecCreditService.equals(other.getEcCreditService()))) &&
            ((this.ecAuthenticateService==null && other.getEcAuthenticateService()==null) || 
             (this.ecAuthenticateService!=null &&
              this.ecAuthenticateService.equals(other.getEcAuthenticateService()))) &&
            ((this.payerAuthEnrollService==null && other.getPayerAuthEnrollService()==null) || 
             (this.payerAuthEnrollService!=null &&
              this.payerAuthEnrollService.equals(other.getPayerAuthEnrollService()))) &&
            ((this.payerAuthValidateService==null && other.getPayerAuthValidateService()==null) || 
             (this.payerAuthValidateService!=null &&
              this.payerAuthValidateService.equals(other.getPayerAuthValidateService()))) &&
            ((this.taxService==null && other.getTaxService()==null) || 
             (this.taxService!=null &&
              this.taxService.equals(other.getTaxService()))) &&
            ((this.dmeService==null && other.getDmeService()==null) || 
             (this.dmeService!=null &&
              this.dmeService.equals(other.getDmeService()))) &&
            ((this.afsService==null && other.getAfsService()==null) || 
             (this.afsService!=null &&
              this.afsService.equals(other.getAfsService()))) &&
            ((this.davService==null && other.getDavService()==null) || 
             (this.davService!=null &&
              this.davService.equals(other.getDavService()))) &&
            ((this.exportService==null && other.getExportService()==null) || 
             (this.exportService!=null &&
              this.exportService.equals(other.getExportService()))) &&
            ((this.fxRatesService==null && other.getFxRatesService()==null) || 
             (this.fxRatesService!=null &&
              this.fxRatesService.equals(other.getFxRatesService()))) &&
            ((this.bankTransferService==null && other.getBankTransferService()==null) || 
             (this.bankTransferService!=null &&
              this.bankTransferService.equals(other.getBankTransferService()))) &&
            ((this.bankTransferRefundService==null && other.getBankTransferRefundService()==null) || 
             (this.bankTransferRefundService!=null &&
              this.bankTransferRefundService.equals(other.getBankTransferRefundService()))) &&
            ((this.bankTransferRealTimeService==null && other.getBankTransferRealTimeService()==null) || 
             (this.bankTransferRealTimeService!=null &&
              this.bankTransferRealTimeService.equals(other.getBankTransferRealTimeService()))) &&
            ((this.directDebitMandateService==null && other.getDirectDebitMandateService()==null) || 
             (this.directDebitMandateService!=null &&
              this.directDebitMandateService.equals(other.getDirectDebitMandateService()))) &&
            ((this.directDebitService==null && other.getDirectDebitService()==null) || 
             (this.directDebitService!=null &&
              this.directDebitService.equals(other.getDirectDebitService()))) &&
            ((this.directDebitRefundService==null && other.getDirectDebitRefundService()==null) || 
             (this.directDebitRefundService!=null &&
              this.directDebitRefundService.equals(other.getDirectDebitRefundService()))) &&
            ((this.directDebitValidateService==null && other.getDirectDebitValidateService()==null) || 
             (this.directDebitValidateService!=null &&
              this.directDebitValidateService.equals(other.getDirectDebitValidateService()))) &&
            ((this.paySubscriptionCreateService==null && other.getPaySubscriptionCreateService()==null) || 
             (this.paySubscriptionCreateService!=null &&
              this.paySubscriptionCreateService.equals(other.getPaySubscriptionCreateService()))) &&
            ((this.paySubscriptionUpdateService==null && other.getPaySubscriptionUpdateService()==null) || 
             (this.paySubscriptionUpdateService!=null &&
              this.paySubscriptionUpdateService.equals(other.getPaySubscriptionUpdateService()))) &&
            ((this.paySubscriptionEventUpdateService==null && other.getPaySubscriptionEventUpdateService()==null) || 
             (this.paySubscriptionEventUpdateService!=null &&
              this.paySubscriptionEventUpdateService.equals(other.getPaySubscriptionEventUpdateService()))) &&
            ((this.paySubscriptionRetrieveService==null && other.getPaySubscriptionRetrieveService()==null) || 
             (this.paySubscriptionRetrieveService!=null &&
              this.paySubscriptionRetrieveService.equals(other.getPaySubscriptionRetrieveService()))) &&
            ((this.paySubscriptionDeleteService==null && other.getPaySubscriptionDeleteService()==null) || 
             (this.paySubscriptionDeleteService!=null &&
              this.paySubscriptionDeleteService.equals(other.getPaySubscriptionDeleteService()))) &&
            ((this.payPalPaymentService==null && other.getPayPalPaymentService()==null) || 
             (this.payPalPaymentService!=null &&
              this.payPalPaymentService.equals(other.getPayPalPaymentService()))) &&
            ((this.payPalCreditService==null && other.getPayPalCreditService()==null) || 
             (this.payPalCreditService!=null &&
              this.payPalCreditService.equals(other.getPayPalCreditService()))) &&
            ((this.voidService==null && other.getVoidService()==null) || 
             (this.voidService!=null &&
              this.voidService.equals(other.getVoidService()))) &&
            ((this.businessRules==null && other.getBusinessRules()==null) || 
             (this.businessRules!=null &&
              this.businessRules.equals(other.getBusinessRules()))) &&
            ((this.pinlessDebitService==null && other.getPinlessDebitService()==null) || 
             (this.pinlessDebitService!=null &&
              this.pinlessDebitService.equals(other.getPinlessDebitService()))) &&
            ((this.pinlessDebitValidateService==null && other.getPinlessDebitValidateService()==null) || 
             (this.pinlessDebitValidateService!=null &&
              this.pinlessDebitValidateService.equals(other.getPinlessDebitValidateService()))) &&
            ((this.pinlessDebitReversalService==null && other.getPinlessDebitReversalService()==null) || 
             (this.pinlessDebitReversalService!=null &&
              this.pinlessDebitReversalService.equals(other.getPinlessDebitReversalService()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
            ((this.airlineData==null && other.getAirlineData()==null) || 
             (this.airlineData!=null &&
              this.airlineData.equals(other.getAirlineData()))) &&
            ((this.ancillaryData==null && other.getAncillaryData()==null) || 
             (this.ancillaryData!=null &&
              this.ancillaryData.equals(other.getAncillaryData()))) &&
            ((this.lodgingData==null && other.getLodgingData()==null) || 
             (this.lodgingData!=null &&
              this.lodgingData.equals(other.getLodgingData()))) &&
            ((this.payPalButtonCreateService==null && other.getPayPalButtonCreateService()==null) || 
             (this.payPalButtonCreateService!=null &&
              this.payPalButtonCreateService.equals(other.getPayPalButtonCreateService()))) &&
            ((this.payPalPreapprovedPaymentService==null && other.getPayPalPreapprovedPaymentService()==null) || 
             (this.payPalPreapprovedPaymentService!=null &&
              this.payPalPreapprovedPaymentService.equals(other.getPayPalPreapprovedPaymentService()))) &&
            ((this.payPalPreapprovedUpdateService==null && other.getPayPalPreapprovedUpdateService()==null) || 
             (this.payPalPreapprovedUpdateService!=null &&
              this.payPalPreapprovedUpdateService.equals(other.getPayPalPreapprovedUpdateService()))) &&
            ((this.riskUpdateService==null && other.getRiskUpdateService()==null) || 
             (this.riskUpdateService!=null &&
              this.riskUpdateService.equals(other.getRiskUpdateService()))) &&
            ((this.fraudUpdateService==null && other.getFraudUpdateService()==null) || 
             (this.fraudUpdateService!=null &&
              this.fraudUpdateService.equals(other.getFraudUpdateService()))) &&
            ((this.caseManagementActionService==null && other.getCaseManagementActionService()==null) || 
             (this.caseManagementActionService!=null &&
              this.caseManagementActionService.equals(other.getCaseManagementActionService()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              java.util.Arrays.equals(this.reserved, other.getReserved()))) &&
            ((this.deviceFingerprintID==null && other.getDeviceFingerprintID()==null) || 
             (this.deviceFingerprintID!=null &&
              this.deviceFingerprintID.equals(other.getDeviceFingerprintID()))) &&
            ((this.deviceFingerprintRaw==null && other.getDeviceFingerprintRaw()==null) || 
             (this.deviceFingerprintRaw!=null &&
              this.deviceFingerprintRaw.equals(other.getDeviceFingerprintRaw()))) &&
            ((this.deviceFingerprintHash==null && other.getDeviceFingerprintHash()==null) || 
             (this.deviceFingerprintHash!=null &&
              this.deviceFingerprintHash.equals(other.getDeviceFingerprintHash()))) &&
            ((this.payPalRefundService==null && other.getPayPalRefundService()==null) || 
             (this.payPalRefundService!=null &&
              this.payPalRefundService.equals(other.getPayPalRefundService()))) &&
            ((this.payPalAuthReversalService==null && other.getPayPalAuthReversalService()==null) || 
             (this.payPalAuthReversalService!=null &&
              this.payPalAuthReversalService.equals(other.getPayPalAuthReversalService()))) &&
            ((this.payPalDoCaptureService==null && other.getPayPalDoCaptureService()==null) || 
             (this.payPalDoCaptureService!=null &&
              this.payPalDoCaptureService.equals(other.getPayPalDoCaptureService()))) &&
            ((this.payPalEcDoPaymentService==null && other.getPayPalEcDoPaymentService()==null) || 
             (this.payPalEcDoPaymentService!=null &&
              this.payPalEcDoPaymentService.equals(other.getPayPalEcDoPaymentService()))) &&
            ((this.payPalEcGetDetailsService==null && other.getPayPalEcGetDetailsService()==null) || 
             (this.payPalEcGetDetailsService!=null &&
              this.payPalEcGetDetailsService.equals(other.getPayPalEcGetDetailsService()))) &&
            ((this.payPalEcSetService==null && other.getPayPalEcSetService()==null) || 
             (this.payPalEcSetService!=null &&
              this.payPalEcSetService.equals(other.getPayPalEcSetService()))) &&
            ((this.payPalEcOrderSetupService==null && other.getPayPalEcOrderSetupService()==null) || 
             (this.payPalEcOrderSetupService!=null &&
              this.payPalEcOrderSetupService.equals(other.getPayPalEcOrderSetupService()))) &&
            ((this.payPalAuthorizationService==null && other.getPayPalAuthorizationService()==null) || 
             (this.payPalAuthorizationService!=null &&
              this.payPalAuthorizationService.equals(other.getPayPalAuthorizationService()))) &&
            ((this.payPalUpdateAgreementService==null && other.getPayPalUpdateAgreementService()==null) || 
             (this.payPalUpdateAgreementService!=null &&
              this.payPalUpdateAgreementService.equals(other.getPayPalUpdateAgreementService()))) &&
            ((this.payPalCreateAgreementService==null && other.getPayPalCreateAgreementService()==null) || 
             (this.payPalCreateAgreementService!=null &&
              this.payPalCreateAgreementService.equals(other.getPayPalCreateAgreementService()))) &&
            ((this.payPalDoRefTransactionService==null && other.getPayPalDoRefTransactionService()==null) || 
             (this.payPalDoRefTransactionService!=null &&
              this.payPalDoRefTransactionService.equals(other.getPayPalDoRefTransactionService()))) &&
            ((this.chinaPaymentService==null && other.getChinaPaymentService()==null) || 
             (this.chinaPaymentService!=null &&
              this.chinaPaymentService.equals(other.getChinaPaymentService()))) &&
            ((this.chinaRefundService==null && other.getChinaRefundService()==null) || 
             (this.chinaRefundService!=null &&
              this.chinaRefundService.equals(other.getChinaRefundService()))) &&
            ((this.boletoPaymentService==null && other.getBoletoPaymentService()==null) || 
             (this.boletoPaymentService!=null &&
              this.boletoPaymentService.equals(other.getBoletoPaymentService()))) &&
            ((this.apPaymentType==null && other.getApPaymentType()==null) || 
             (this.apPaymentType!=null &&
              this.apPaymentType.equals(other.getApPaymentType()))) &&
            ((this.apInitiateService==null && other.getApInitiateService()==null) || 
             (this.apInitiateService!=null &&
              this.apInitiateService.equals(other.getApInitiateService()))) &&
            ((this.apCheckStatusService==null && other.getApCheckStatusService()==null) || 
             (this.apCheckStatusService!=null &&
              this.apCheckStatusService.equals(other.getApCheckStatusService()))) &&
            ((this.ignoreCardExpiration==null && other.getIgnoreCardExpiration()==null) || 
             (this.ignoreCardExpiration!=null &&
              this.ignoreCardExpiration.equals(other.getIgnoreCardExpiration()))) &&
            ((this.reportGroup==null && other.getReportGroup()==null) || 
             (this.reportGroup!=null &&
              this.reportGroup.equals(other.getReportGroup()))) &&
            ((this.processorID==null && other.getProcessorID()==null) || 
             (this.processorID!=null &&
              this.processorID.equals(other.getProcessorID()))) &&
            ((this.thirdPartyCertificationNumber==null && other.getThirdPartyCertificationNumber()==null) || 
             (this.thirdPartyCertificationNumber!=null &&
              this.thirdPartyCertificationNumber.equals(other.getThirdPartyCertificationNumber()))) &&
            ((this.transactionLocalDateTime==null && other.getTransactionLocalDateTime()==null) || 
             (this.transactionLocalDateTime!=null &&
              this.transactionLocalDateTime.equals(other.getTransactionLocalDateTime()))) &&
            ((this.solutionProviderTransactionID==null && other.getSolutionProviderTransactionID()==null) || 
             (this.solutionProviderTransactionID!=null &&
              this.solutionProviderTransactionID.equals(other.getSolutionProviderTransactionID()))) &&
            ((this.surchargeAmount==null && other.getSurchargeAmount()==null) || 
             (this.surchargeAmount!=null &&
              this.surchargeAmount.equals(other.getSurchargeAmount()))) &&
            ((this.surchargeSign==null && other.getSurchargeSign()==null) || 
             (this.surchargeSign!=null &&
              this.surchargeSign.equals(other.getSurchargeSign()))) &&
            ((this.pinDataEncryptedPIN==null && other.getPinDataEncryptedPIN()==null) || 
             (this.pinDataEncryptedPIN!=null &&
              this.pinDataEncryptedPIN.equals(other.getPinDataEncryptedPIN()))) &&
            ((this.pinDataKeySerialNumber==null && other.getPinDataKeySerialNumber()==null) || 
             (this.pinDataKeySerialNumber!=null &&
              this.pinDataKeySerialNumber.equals(other.getPinDataKeySerialNumber()))) &&
            ((this.cashbackAmount==null && other.getCashbackAmount()==null) || 
             (this.cashbackAmount!=null &&
              this.cashbackAmount.equals(other.getCashbackAmount()))) &&
            ((this.pinDebitPurchaseService==null && other.getPinDebitPurchaseService()==null) || 
             (this.pinDebitPurchaseService!=null &&
              this.pinDebitPurchaseService.equals(other.getPinDebitPurchaseService()))) &&
            ((this.pinDebitCreditService==null && other.getPinDebitCreditService()==null) || 
             (this.pinDebitCreditService!=null &&
              this.pinDebitCreditService.equals(other.getPinDebitCreditService()))) &&
            ((this.pinDebitReversalService==null && other.getPinDebitReversalService()==null) || 
             (this.pinDebitReversalService!=null &&
              this.pinDebitReversalService.equals(other.getPinDebitReversalService()))) &&
            ((this.ap==null && other.getAp()==null) || 
             (this.ap!=null &&
              this.ap.equals(other.getAp()))) &&
            ((this.apAuthService==null && other.getApAuthService()==null) || 
             (this.apAuthService!=null &&
              this.apAuthService.equals(other.getApAuthService()))) &&
            ((this.apAuthReversalService==null && other.getApAuthReversalService()==null) || 
             (this.apAuthReversalService!=null &&
              this.apAuthReversalService.equals(other.getApAuthReversalService()))) &&
            ((this.apCaptureService==null && other.getApCaptureService()==null) || 
             (this.apCaptureService!=null &&
              this.apCaptureService.equals(other.getApCaptureService()))) &&
            ((this.apOptionsService==null && other.getApOptionsService()==null) || 
             (this.apOptionsService!=null &&
              this.apOptionsService.equals(other.getApOptionsService()))) &&
            ((this.apRefundService==null && other.getApRefundService()==null) || 
             (this.apRefundService!=null &&
              this.apRefundService.equals(other.getApRefundService()))) &&
            ((this.apSaleService==null && other.getApSaleService()==null) || 
             (this.apSaleService!=null &&
              this.apSaleService.equals(other.getApSaleService()))) &&
            ((this.apCheckoutDetailsService==null && other.getApCheckoutDetailsService()==null) || 
             (this.apCheckoutDetailsService!=null &&
              this.apCheckoutDetailsService.equals(other.getApCheckoutDetailsService()))) &&
            ((this.apSessionsService==null && other.getApSessionsService()==null) || 
             (this.apSessionsService!=null &&
              this.apSessionsService.equals(other.getApSessionsService()))) &&
            ((this.apUI==null && other.getApUI()==null) || 
             (this.apUI!=null &&
              this.apUI.equals(other.getApUI()))) &&
            ((this.apTransactionDetailsService==null && other.getApTransactionDetailsService()==null) || 
             (this.apTransactionDetailsService!=null &&
              this.apTransactionDetailsService.equals(other.getApTransactionDetailsService()))) &&
            ((this.apConfirmPurchaseService==null && other.getApConfirmPurchaseService()==null) || 
             (this.apConfirmPurchaseService!=null &&
              this.apConfirmPurchaseService.equals(other.getApConfirmPurchaseService()))) &&
            ((this.payPalGetTxnDetailsService==null && other.getPayPalGetTxnDetailsService()==null) || 
             (this.payPalGetTxnDetailsService!=null &&
              this.payPalGetTxnDetailsService.equals(other.getPayPalGetTxnDetailsService()))) &&
            ((this.payPalTransactionSearchService==null && other.getPayPalTransactionSearchService()==null) || 
             (this.payPalTransactionSearchService!=null &&
              this.payPalTransactionSearchService.equals(other.getPayPalTransactionSearchService()))) &&
            ((this.ccDCCUpdateService==null && other.getCcDCCUpdateService()==null) || 
             (this.ccDCCUpdateService!=null &&
              this.ccDCCUpdateService.equals(other.getCcDCCUpdateService()))) &&
            ((this.emvRequest==null && other.getEmvRequest()==null) || 
             (this.emvRequest!=null &&
              this.emvRequest.equals(other.getEmvRequest()))) &&
            ((this.merchantTransactionIdentifier==null && other.getMerchantTransactionIdentifier()==null) || 
             (this.merchantTransactionIdentifier!=null &&
              this.merchantTransactionIdentifier.equals(other.getMerchantTransactionIdentifier()))) &&
            ((this.hostedDataCreateService==null && other.getHostedDataCreateService()==null) || 
             (this.hostedDataCreateService!=null &&
              this.hostedDataCreateService.equals(other.getHostedDataCreateService()))) &&
            ((this.hostedDataRetrieveService==null && other.getHostedDataRetrieveService()==null) || 
             (this.hostedDataRetrieveService!=null &&
              this.hostedDataRetrieveService.equals(other.getHostedDataRetrieveService()))) &&
            ((this.merchantCategoryCode==null && other.getMerchantCategoryCode()==null) || 
             (this.merchantCategoryCode!=null &&
              this.merchantCategoryCode.equals(other.getMerchantCategoryCode()))) &&
            ((this.salesSlipNumber==null && other.getSalesSlipNumber()==null) || 
             (this.salesSlipNumber!=null &&
              this.salesSlipNumber.equals(other.getSalesSlipNumber()))) &&
            ((this.merchandiseCode==null && other.getMerchandiseCode()==null) || 
             (this.merchandiseCode!=null &&
              this.merchandiseCode.equals(other.getMerchandiseCode()))) &&
            ((this.merchandiseDescription==null && other.getMerchandiseDescription()==null) || 
             (this.merchandiseDescription!=null &&
              this.merchandiseDescription.equals(other.getMerchandiseDescription()))) &&
            ((this.paymentInitiationChannel==null && other.getPaymentInitiationChannel()==null) || 
             (this.paymentInitiationChannel!=null &&
              this.paymentInitiationChannel.equals(other.getPaymentInitiationChannel()))) &&
            ((this.extendedCreditTotalCount==null && other.getExtendedCreditTotalCount()==null) || 
             (this.extendedCreditTotalCount!=null &&
              this.extendedCreditTotalCount.equals(other.getExtendedCreditTotalCount()))) &&
            ((this.authIndicator==null && other.getAuthIndicator()==null) || 
             (this.authIndicator!=null &&
              this.authIndicator.equals(other.getAuthIndicator()))) &&
            ((this.paymentNetworkToken==null && other.getPaymentNetworkToken()==null) || 
             (this.paymentNetworkToken!=null &&
              this.paymentNetworkToken.equals(other.getPaymentNetworkToken()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.autoRentalData==null && other.getAutoRentalData()==null) || 
             (this.autoRentalData!=null &&
              this.autoRentalData.equals(other.getAutoRentalData()))) &&
            ((this.paymentSolution==null && other.getPaymentSolution()==null) || 
             (this.paymentSolution!=null &&
              this.paymentSolution.equals(other.getPaymentSolution()))) &&
            ((this.vc==null && other.getVc()==null) || 
             (this.vc!=null &&
              this.vc.equals(other.getVc()))) &&
            ((this.decryptVisaCheckoutDataService==null && other.getDecryptVisaCheckoutDataService()==null) || 
             (this.decryptVisaCheckoutDataService!=null &&
              this.decryptVisaCheckoutDataService.equals(other.getDecryptVisaCheckoutDataService()))) &&
            ((this.taxManagementIndicator==null && other.getTaxManagementIndicator()==null) || 
             (this.taxManagementIndicator!=null &&
              this.taxManagementIndicator.equals(other.getTaxManagementIndicator()))) &&
            ((this.promotionGroup==null && other.getPromotionGroup()==null) || 
             (this.promotionGroup!=null &&
              java.util.Arrays.equals(this.promotionGroup, other.getPromotionGroup()))) &&
            ((this.wallet==null && other.getWallet()==null) || 
             (this.wallet!=null &&
              this.wallet.equals(other.getWallet()))) &&
            ((this.aft==null && other.getAft()==null) || 
             (this.aft!=null &&
              this.aft.equals(other.getAft()))) &&
            ((this.balanceInquiry==null && other.getBalanceInquiry()==null) || 
             (this.balanceInquiry!=null &&
              this.balanceInquiry.equals(other.getBalanceInquiry()))) &&
            ((this.prenoteTransaction==null && other.getPrenoteTransaction()==null) || 
             (this.prenoteTransaction!=null &&
              this.prenoteTransaction.equals(other.getPrenoteTransaction()))) &&
            ((this.encryptPaymentDataService==null && other.getEncryptPaymentDataService()==null) || 
             (this.encryptPaymentDataService!=null &&
              this.encryptPaymentDataService.equals(other.getEncryptPaymentDataService()))) &&
            ((this.nationalNetDomesticData==null && other.getNationalNetDomesticData()==null) || 
             (this.nationalNetDomesticData!=null &&
              this.nationalNetDomesticData.equals(other.getNationalNetDomesticData()))) &&
            ((this.subsequentAuth==null && other.getSubsequentAuth()==null) || 
             (this.subsequentAuth!=null &&
              this.subsequentAuth.equals(other.getSubsequentAuth()))) &&
            ((this.binLookupService==null && other.getBinLookupService()==null) || 
             (this.binLookupService!=null &&
              this.binLookupService.equals(other.getBinLookupService()))) &&
            ((this.verificationCode==null && other.getVerificationCode()==null) || 
             (this.verificationCode!=null &&
              this.verificationCode.equals(other.getVerificationCode()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.partnerSolutionID==null && other.getPartnerSolutionID()==null) || 
             (this.partnerSolutionID!=null &&
              this.partnerSolutionID.equals(other.getPartnerSolutionID()))) &&
            ((this.developerID==null && other.getDeveloperID()==null) || 
             (this.developerID!=null &&
              this.developerID.equals(other.getDeveloperID()))) &&
            ((this.getVisaCheckoutDataService==null && other.getGetVisaCheckoutDataService()==null) || 
             (this.getVisaCheckoutDataService!=null &&
              this.getVisaCheckoutDataService.equals(other.getGetVisaCheckoutDataService()))) &&
            ((this.customerSignatureImage==null && other.getCustomerSignatureImage()==null) || 
             (this.customerSignatureImage!=null &&
              this.customerSignatureImage.equals(other.getCustomerSignatureImage()))) &&
            ((this.transactionMetadataService==null && other.getTransactionMetadataService()==null) || 
             (this.transactionMetadataService!=null &&
              this.transactionMetadataService.equals(other.getTransactionMetadataService()))) &&
            ((this.subsequentAuthFirst==null && other.getSubsequentAuthFirst()==null) || 
             (this.subsequentAuthFirst!=null &&
              this.subsequentAuthFirst.equals(other.getSubsequentAuthFirst()))) &&
            ((this.subsequentAuthReason==null && other.getSubsequentAuthReason()==null) || 
             (this.subsequentAuthReason!=null &&
              this.subsequentAuthReason.equals(other.getSubsequentAuthReason()))) &&
            ((this.subsequentAuthTransactionID==null && other.getSubsequentAuthTransactionID()==null) || 
             (this.subsequentAuthTransactionID!=null &&
              this.subsequentAuthTransactionID.equals(other.getSubsequentAuthTransactionID()))) &&
            ((this.loan==null && other.getLoan()==null) || 
             (this.loan!=null &&
              this.loan.equals(other.getLoan()))) &&
            ((this.eligibilityInquiry==null && other.getEligibilityInquiry()==null) || 
             (this.eligibilityInquiry!=null &&
              this.eligibilityInquiry.equals(other.getEligibilityInquiry()))) &&
            ((this.redemptionInquiry==null && other.getRedemptionInquiry()==null) || 
             (this.redemptionInquiry!=null &&
              this.redemptionInquiry.equals(other.getRedemptionInquiry()))) &&
            ((this.feeProgramIndicator==null && other.getFeeProgramIndicator()==null) || 
             (this.feeProgramIndicator!=null &&
              this.feeProgramIndicator.equals(other.getFeeProgramIndicator()))) &&
            ((this.apOrderService==null && other.getApOrderService()==null) || 
             (this.apOrderService!=null &&
              this.apOrderService.equals(other.getApOrderService()))) &&
            ((this.apCancelService==null && other.getApCancelService()==null) || 
             (this.apCancelService!=null &&
              this.apCancelService.equals(other.getApCancelService()))) &&
            ((this.apBillingAgreementService==null && other.getApBillingAgreementService()==null) || 
             (this.apBillingAgreementService!=null &&
              this.apBillingAgreementService.equals(other.getApBillingAgreementService()))) &&
            ((this.note_toPayee==null && other.getNote_toPayee()==null) || 
             (this.note_toPayee!=null &&
              this.note_toPayee.equals(other.getNote_toPayee()))) &&
            ((this.note_toPayer==null && other.getNote_toPayer()==null) || 
             (this.note_toPayer!=null &&
              this.note_toPayer.equals(other.getNote_toPayer()))) &&
            ((this.partnerSDKversion==null && other.getPartnerSDKversion()==null) || 
             (this.partnerSDKversion!=null &&
              this.partnerSDKversion.equals(other.getPartnerSDKversion()))) &&
            ((this.partnerOriginalTransactionID==null && other.getPartnerOriginalTransactionID()==null) || 
             (this.partnerOriginalTransactionID!=null &&
              this.partnerOriginalTransactionID.equals(other.getPartnerOriginalTransactionID()))) &&
            ((this.cardTypeSelectionIndicator==null && other.getCardTypeSelectionIndicator()==null) || 
             (this.cardTypeSelectionIndicator!=null &&
              this.cardTypeSelectionIndicator.equals(other.getCardTypeSelectionIndicator())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getMerchantReferenceCode() != null) {
            _hashCode += getMerchantReferenceCode().hashCode();
        }
        if (getDebtIndicator() != null) {
            _hashCode += getDebtIndicator().hashCode();
        }
        if (getClientLibrary() != null) {
            _hashCode += getClientLibrary().hashCode();
        }
        if (getClientLibraryVersion() != null) {
            _hashCode += getClientLibraryVersion().hashCode();
        }
        if (getClientEnvironment() != null) {
            _hashCode += getClientEnvironment().hashCode();
        }
        if (getClientSecurityLibraryVersion() != null) {
            _hashCode += getClientSecurityLibraryVersion().hashCode();
        }
        if (getClientApplication() != null) {
            _hashCode += getClientApplication().hashCode();
        }
        if (getClientApplicationVersion() != null) {
            _hashCode += getClientApplicationVersion().hashCode();
        }
        if (getClientApplicationUser() != null) {
            _hashCode += getClientApplicationUser().hashCode();
        }
        if (getRoutingCode() != null) {
            _hashCode += getRoutingCode().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getInvoiceHeader() != null) {
            _hashCode += getInvoiceHeader().hashCode();
        }
        if (getAggregatorMerchantIdentifier() != null) {
            _hashCode += getAggregatorMerchantIdentifier().hashCode();
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        if (getCustomerFirstName() != null) {
            _hashCode += getCustomerFirstName().hashCode();
        }
        if (getCustomerLastName() != null) {
            _hashCode += getCustomerLastName().hashCode();
        }
        if (getBillTo() != null) {
            _hashCode += getBillTo().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getPersonalID() != null) {
            _hashCode += getPersonalID().hashCode();
        }
        if (getShipFrom() != null) {
            _hashCode += getShipFrom().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseTotals() != null) {
            _hashCode += getPurchaseTotals().hashCode();
        }
        if (getFundingTotals() != null) {
            _hashCode += getFundingTotals().hashCode();
        }
        if (getDcc() != null) {
            _hashCode += getDcc().hashCode();
        }
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getEncryptedPayment() != null) {
            _hashCode += getEncryptedPayment().hashCode();
        }
        if (getInstallment() != null) {
            _hashCode += getInstallment().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getBml() != null) {
            _hashCode += getBml().hashCode();
        }
        if (getGecc() != null) {
            _hashCode += getGecc().hashCode();
        }
        if (getUcaf() != null) {
            _hashCode += getUcaf().hashCode();
        }
        if (getFundTransfer() != null) {
            _hashCode += getFundTransfer().hashCode();
        }
        if (getBankInfo() != null) {
            _hashCode += getBankInfo().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getRecurringSubscriptionInfo() != null) {
            _hashCode += getRecurringSubscriptionInfo().hashCode();
        }
        if (getDecisionManager() != null) {
            _hashCode += getDecisionManager().hashCode();
        }
        if (getOtherTax() != null) {
            _hashCode += getOtherTax().hashCode();
        }
        if (getPaypal() != null) {
            _hashCode += getPaypal().hashCode();
        }
        if (getMerchantDefinedData() != null) {
            _hashCode += getMerchantDefinedData().hashCode();
        }
        if (getMerchantSecureData() != null) {
            _hashCode += getMerchantSecureData().hashCode();
        }
        if (getJpo() != null) {
            _hashCode += getJpo().hashCode();
        }
        if (getOrderRequestToken() != null) {
            _hashCode += getOrderRequestToken().hashCode();
        }
        if (getLinkToRequest() != null) {
            _hashCode += getLinkToRequest().hashCode();
        }
        if (getServiceFee() != null) {
            _hashCode += getServiceFee().hashCode();
        }
        if (getCcAuthService() != null) {
            _hashCode += getCcAuthService().hashCode();
        }
        if (getOctService() != null) {
            _hashCode += getOctService().hashCode();
        }
        if (getVerificationService() != null) {
            _hashCode += getVerificationService().hashCode();
        }
        if (getCcSaleService() != null) {
            _hashCode += getCcSaleService().hashCode();
        }
        if (getCcSaleCreditService() != null) {
            _hashCode += getCcSaleCreditService().hashCode();
        }
        if (getCcSaleReversalService() != null) {
            _hashCode += getCcSaleReversalService().hashCode();
        }
        if (getCcIncrementalAuthService() != null) {
            _hashCode += getCcIncrementalAuthService().hashCode();
        }
        if (getCcCaptureService() != null) {
            _hashCode += getCcCaptureService().hashCode();
        }
        if (getCcCreditService() != null) {
            _hashCode += getCcCreditService().hashCode();
        }
        if (getCcAuthReversalService() != null) {
            _hashCode += getCcAuthReversalService().hashCode();
        }
        if (getCcAutoAuthReversalService() != null) {
            _hashCode += getCcAutoAuthReversalService().hashCode();
        }
        if (getCcDCCService() != null) {
            _hashCode += getCcDCCService().hashCode();
        }
        if (getServiceFeeCalculateService() != null) {
            _hashCode += getServiceFeeCalculateService().hashCode();
        }
        if (getEcDebitService() != null) {
            _hashCode += getEcDebitService().hashCode();
        }
        if (getEcCreditService() != null) {
            _hashCode += getEcCreditService().hashCode();
        }
        if (getEcAuthenticateService() != null) {
            _hashCode += getEcAuthenticateService().hashCode();
        }
        if (getPayerAuthEnrollService() != null) {
            _hashCode += getPayerAuthEnrollService().hashCode();
        }
        if (getPayerAuthValidateService() != null) {
            _hashCode += getPayerAuthValidateService().hashCode();
        }
        if (getTaxService() != null) {
            _hashCode += getTaxService().hashCode();
        }
        if (getDmeService() != null) {
            _hashCode += getDmeService().hashCode();
        }
        if (getAfsService() != null) {
            _hashCode += getAfsService().hashCode();
        }
        if (getDavService() != null) {
            _hashCode += getDavService().hashCode();
        }
        if (getExportService() != null) {
            _hashCode += getExportService().hashCode();
        }
        if (getFxRatesService() != null) {
            _hashCode += getFxRatesService().hashCode();
        }
        if (getBankTransferService() != null) {
            _hashCode += getBankTransferService().hashCode();
        }
        if (getBankTransferRefundService() != null) {
            _hashCode += getBankTransferRefundService().hashCode();
        }
        if (getBankTransferRealTimeService() != null) {
            _hashCode += getBankTransferRealTimeService().hashCode();
        }
        if (getDirectDebitMandateService() != null) {
            _hashCode += getDirectDebitMandateService().hashCode();
        }
        if (getDirectDebitService() != null) {
            _hashCode += getDirectDebitService().hashCode();
        }
        if (getDirectDebitRefundService() != null) {
            _hashCode += getDirectDebitRefundService().hashCode();
        }
        if (getDirectDebitValidateService() != null) {
            _hashCode += getDirectDebitValidateService().hashCode();
        }
        if (getPaySubscriptionCreateService() != null) {
            _hashCode += getPaySubscriptionCreateService().hashCode();
        }
        if (getPaySubscriptionUpdateService() != null) {
            _hashCode += getPaySubscriptionUpdateService().hashCode();
        }
        if (getPaySubscriptionEventUpdateService() != null) {
            _hashCode += getPaySubscriptionEventUpdateService().hashCode();
        }
        if (getPaySubscriptionRetrieveService() != null) {
            _hashCode += getPaySubscriptionRetrieveService().hashCode();
        }
        if (getPaySubscriptionDeleteService() != null) {
            _hashCode += getPaySubscriptionDeleteService().hashCode();
        }
        if (getPayPalPaymentService() != null) {
            _hashCode += getPayPalPaymentService().hashCode();
        }
        if (getPayPalCreditService() != null) {
            _hashCode += getPayPalCreditService().hashCode();
        }
        if (getVoidService() != null) {
            _hashCode += getVoidService().hashCode();
        }
        if (getBusinessRules() != null) {
            _hashCode += getBusinessRules().hashCode();
        }
        if (getPinlessDebitService() != null) {
            _hashCode += getPinlessDebitService().hashCode();
        }
        if (getPinlessDebitValidateService() != null) {
            _hashCode += getPinlessDebitValidateService().hashCode();
        }
        if (getPinlessDebitReversalService() != null) {
            _hashCode += getPinlessDebitReversalService().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
        }
        if (getAirlineData() != null) {
            _hashCode += getAirlineData().hashCode();
        }
        if (getAncillaryData() != null) {
            _hashCode += getAncillaryData().hashCode();
        }
        if (getLodgingData() != null) {
            _hashCode += getLodgingData().hashCode();
        }
        if (getPayPalButtonCreateService() != null) {
            _hashCode += getPayPalButtonCreateService().hashCode();
        }
        if (getPayPalPreapprovedPaymentService() != null) {
            _hashCode += getPayPalPreapprovedPaymentService().hashCode();
        }
        if (getPayPalPreapprovedUpdateService() != null) {
            _hashCode += getPayPalPreapprovedUpdateService().hashCode();
        }
        if (getRiskUpdateService() != null) {
            _hashCode += getRiskUpdateService().hashCode();
        }
        if (getFraudUpdateService() != null) {
            _hashCode += getFraudUpdateService().hashCode();
        }
        if (getCaseManagementActionService() != null) {
            _hashCode += getCaseManagementActionService().hashCode();
        }
        if (getReserved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReserved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReserved(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceFingerprintID() != null) {
            _hashCode += getDeviceFingerprintID().hashCode();
        }
        if (getDeviceFingerprintRaw() != null) {
            _hashCode += getDeviceFingerprintRaw().hashCode();
        }
        if (getDeviceFingerprintHash() != null) {
            _hashCode += getDeviceFingerprintHash().hashCode();
        }
        if (getPayPalRefundService() != null) {
            _hashCode += getPayPalRefundService().hashCode();
        }
        if (getPayPalAuthReversalService() != null) {
            _hashCode += getPayPalAuthReversalService().hashCode();
        }
        if (getPayPalDoCaptureService() != null) {
            _hashCode += getPayPalDoCaptureService().hashCode();
        }
        if (getPayPalEcDoPaymentService() != null) {
            _hashCode += getPayPalEcDoPaymentService().hashCode();
        }
        if (getPayPalEcGetDetailsService() != null) {
            _hashCode += getPayPalEcGetDetailsService().hashCode();
        }
        if (getPayPalEcSetService() != null) {
            _hashCode += getPayPalEcSetService().hashCode();
        }
        if (getPayPalEcOrderSetupService() != null) {
            _hashCode += getPayPalEcOrderSetupService().hashCode();
        }
        if (getPayPalAuthorizationService() != null) {
            _hashCode += getPayPalAuthorizationService().hashCode();
        }
        if (getPayPalUpdateAgreementService() != null) {
            _hashCode += getPayPalUpdateAgreementService().hashCode();
        }
        if (getPayPalCreateAgreementService() != null) {
            _hashCode += getPayPalCreateAgreementService().hashCode();
        }
        if (getPayPalDoRefTransactionService() != null) {
            _hashCode += getPayPalDoRefTransactionService().hashCode();
        }
        if (getChinaPaymentService() != null) {
            _hashCode += getChinaPaymentService().hashCode();
        }
        if (getChinaRefundService() != null) {
            _hashCode += getChinaRefundService().hashCode();
        }
        if (getBoletoPaymentService() != null) {
            _hashCode += getBoletoPaymentService().hashCode();
        }
        if (getApPaymentType() != null) {
            _hashCode += getApPaymentType().hashCode();
        }
        if (getApInitiateService() != null) {
            _hashCode += getApInitiateService().hashCode();
        }
        if (getApCheckStatusService() != null) {
            _hashCode += getApCheckStatusService().hashCode();
        }
        if (getIgnoreCardExpiration() != null) {
            _hashCode += getIgnoreCardExpiration().hashCode();
        }
        if (getReportGroup() != null) {
            _hashCode += getReportGroup().hashCode();
        }
        if (getProcessorID() != null) {
            _hashCode += getProcessorID().hashCode();
        }
        if (getThirdPartyCertificationNumber() != null) {
            _hashCode += getThirdPartyCertificationNumber().hashCode();
        }
        if (getTransactionLocalDateTime() != null) {
            _hashCode += getTransactionLocalDateTime().hashCode();
        }
        if (getSolutionProviderTransactionID() != null) {
            _hashCode += getSolutionProviderTransactionID().hashCode();
        }
        if (getSurchargeAmount() != null) {
            _hashCode += getSurchargeAmount().hashCode();
        }
        if (getSurchargeSign() != null) {
            _hashCode += getSurchargeSign().hashCode();
        }
        if (getPinDataEncryptedPIN() != null) {
            _hashCode += getPinDataEncryptedPIN().hashCode();
        }
        if (getPinDataKeySerialNumber() != null) {
            _hashCode += getPinDataKeySerialNumber().hashCode();
        }
        if (getCashbackAmount() != null) {
            _hashCode += getCashbackAmount().hashCode();
        }
        if (getPinDebitPurchaseService() != null) {
            _hashCode += getPinDebitPurchaseService().hashCode();
        }
        if (getPinDebitCreditService() != null) {
            _hashCode += getPinDebitCreditService().hashCode();
        }
        if (getPinDebitReversalService() != null) {
            _hashCode += getPinDebitReversalService().hashCode();
        }
        if (getAp() != null) {
            _hashCode += getAp().hashCode();
        }
        if (getApAuthService() != null) {
            _hashCode += getApAuthService().hashCode();
        }
        if (getApAuthReversalService() != null) {
            _hashCode += getApAuthReversalService().hashCode();
        }
        if (getApCaptureService() != null) {
            _hashCode += getApCaptureService().hashCode();
        }
        if (getApOptionsService() != null) {
            _hashCode += getApOptionsService().hashCode();
        }
        if (getApRefundService() != null) {
            _hashCode += getApRefundService().hashCode();
        }
        if (getApSaleService() != null) {
            _hashCode += getApSaleService().hashCode();
        }
        if (getApCheckoutDetailsService() != null) {
            _hashCode += getApCheckoutDetailsService().hashCode();
        }
        if (getApSessionsService() != null) {
            _hashCode += getApSessionsService().hashCode();
        }
        if (getApUI() != null) {
            _hashCode += getApUI().hashCode();
        }
        if (getApTransactionDetailsService() != null) {
            _hashCode += getApTransactionDetailsService().hashCode();
        }
        if (getApConfirmPurchaseService() != null) {
            _hashCode += getApConfirmPurchaseService().hashCode();
        }
        if (getPayPalGetTxnDetailsService() != null) {
            _hashCode += getPayPalGetTxnDetailsService().hashCode();
        }
        if (getPayPalTransactionSearchService() != null) {
            _hashCode += getPayPalTransactionSearchService().hashCode();
        }
        if (getCcDCCUpdateService() != null) {
            _hashCode += getCcDCCUpdateService().hashCode();
        }
        if (getEmvRequest() != null) {
            _hashCode += getEmvRequest().hashCode();
        }
        if (getMerchantTransactionIdentifier() != null) {
            _hashCode += getMerchantTransactionIdentifier().hashCode();
        }
        if (getHostedDataCreateService() != null) {
            _hashCode += getHostedDataCreateService().hashCode();
        }
        if (getHostedDataRetrieveService() != null) {
            _hashCode += getHostedDataRetrieveService().hashCode();
        }
        if (getMerchantCategoryCode() != null) {
            _hashCode += getMerchantCategoryCode().hashCode();
        }
        if (getSalesSlipNumber() != null) {
            _hashCode += getSalesSlipNumber().hashCode();
        }
        if (getMerchandiseCode() != null) {
            _hashCode += getMerchandiseCode().hashCode();
        }
        if (getMerchandiseDescription() != null) {
            _hashCode += getMerchandiseDescription().hashCode();
        }
        if (getPaymentInitiationChannel() != null) {
            _hashCode += getPaymentInitiationChannel().hashCode();
        }
        if (getExtendedCreditTotalCount() != null) {
            _hashCode += getExtendedCreditTotalCount().hashCode();
        }
        if (getAuthIndicator() != null) {
            _hashCode += getAuthIndicator().hashCode();
        }
        if (getPaymentNetworkToken() != null) {
            _hashCode += getPaymentNetworkToken().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getAutoRentalData() != null) {
            _hashCode += getAutoRentalData().hashCode();
        }
        if (getPaymentSolution() != null) {
            _hashCode += getPaymentSolution().hashCode();
        }
        if (getVc() != null) {
            _hashCode += getVc().hashCode();
        }
        if (getDecryptVisaCheckoutDataService() != null) {
            _hashCode += getDecryptVisaCheckoutDataService().hashCode();
        }
        if (getTaxManagementIndicator() != null) {
            _hashCode += getTaxManagementIndicator().hashCode();
        }
        if (getPromotionGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWallet() != null) {
            _hashCode += getWallet().hashCode();
        }
        if (getAft() != null) {
            _hashCode += getAft().hashCode();
        }
        if (getBalanceInquiry() != null) {
            _hashCode += getBalanceInquiry().hashCode();
        }
        if (getPrenoteTransaction() != null) {
            _hashCode += getPrenoteTransaction().hashCode();
        }
        if (getEncryptPaymentDataService() != null) {
            _hashCode += getEncryptPaymentDataService().hashCode();
        }
        if (getNationalNetDomesticData() != null) {
            _hashCode += getNationalNetDomesticData().hashCode();
        }
        if (getSubsequentAuth() != null) {
            _hashCode += getSubsequentAuth().hashCode();
        }
        if (getBinLookupService() != null) {
            _hashCode += getBinLookupService().hashCode();
        }
        if (getVerificationCode() != null) {
            _hashCode += getVerificationCode().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getPartnerSolutionID() != null) {
            _hashCode += getPartnerSolutionID().hashCode();
        }
        if (getDeveloperID() != null) {
            _hashCode += getDeveloperID().hashCode();
        }
        if (getGetVisaCheckoutDataService() != null) {
            _hashCode += getGetVisaCheckoutDataService().hashCode();
        }
        if (getCustomerSignatureImage() != null) {
            _hashCode += getCustomerSignatureImage().hashCode();
        }
        if (getTransactionMetadataService() != null) {
            _hashCode += getTransactionMetadataService().hashCode();
        }
        if (getSubsequentAuthFirst() != null) {
            _hashCode += getSubsequentAuthFirst().hashCode();
        }
        if (getSubsequentAuthReason() != null) {
            _hashCode += getSubsequentAuthReason().hashCode();
        }
        if (getSubsequentAuthTransactionID() != null) {
            _hashCode += getSubsequentAuthTransactionID().hashCode();
        }
        if (getLoan() != null) {
            _hashCode += getLoan().hashCode();
        }
        if (getEligibilityInquiry() != null) {
            _hashCode += getEligibilityInquiry().hashCode();
        }
        if (getRedemptionInquiry() != null) {
            _hashCode += getRedemptionInquiry().hashCode();
        }
        if (getFeeProgramIndicator() != null) {
            _hashCode += getFeeProgramIndicator().hashCode();
        }
        if (getApOrderService() != null) {
            _hashCode += getApOrderService().hashCode();
        }
        if (getApCancelService() != null) {
            _hashCode += getApCancelService().hashCode();
        }
        if (getApBillingAgreementService() != null) {
            _hashCode += getApBillingAgreementService().hashCode();
        }
        if (getNote_toPayee() != null) {
            _hashCode += getNote_toPayee().hashCode();
        }
        if (getNote_toPayer() != null) {
            _hashCode += getNote_toPayer().hashCode();
        }
        if (getPartnerSDKversion() != null) {
            _hashCode += getPartnerSDKversion().hashCode();
        }
        if (getPartnerOriginalTransactionID() != null) {
            _hashCode += getPartnerOriginalTransactionID().hashCode();
        }
        if (getCardTypeSelectionIndicator() != null) {
            _hashCode += getCardTypeSelectionIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RequestMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "debtIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientLibrary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientLibrary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientLibraryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientLibraryVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSecurityLibraryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientSecurityLibraryVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientApplicationVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientApplicationVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientApplicationUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clientApplicationUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "routingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "returnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "InvoiceHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatorMerchantIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "aggregatorMerchantIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BillTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ShipTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "personalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PersonalID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "shipFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ShipFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaseTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PurchaseTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fundingTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FundingTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DCC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Pos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Pin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "encryptedPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptedPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "installment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Installment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Card"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "check"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Check"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bml"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BML"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gecc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "gecc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GECC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ucaf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ucaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "UCAF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fundTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FundTransfer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Subscription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringSubscriptionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "recurringSubscriptionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RecurringSubscriptionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decisionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionManager"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "otherTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OtherTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paypal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDefinedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantDefinedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MerchantDefinedData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSecureData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantSecureData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MerchantSecureData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jpo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "jpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "JPO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderRequestToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "orderRequestToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkToRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "linkToRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "serviceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAuthService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAuthService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("octService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "octService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OCTService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "verificationService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VerificationService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleCreditService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleCreditService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleCreditService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccIncrementalAuthService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccIncrementalAuthService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCIncrementalAuthService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCaptureService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccCaptureService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCaptureService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCreditService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccCreditService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCreditService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAuthReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAuthReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAutoAuthReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAutoAuthReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAutoAuthReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDCCService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccDCCService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeeCalculateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "serviceFeeCalculateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFeeCalculateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecDebitService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecDebitService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECDebitService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecCreditService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecCreditService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECCreditService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecAuthenticateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecAuthenticateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECAuthenticateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerAuthEnrollService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerAuthEnrollService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthEnrollService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerAuthValidateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerAuthValidateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthValidateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmeService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dmeService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DMEService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "afsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AFSService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("davService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "davService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DAVService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "exportService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ExportService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxRatesService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxRatesService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FXRatesService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferRefundService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferRefundService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRefundService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferRealTimeService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferRealTimeService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRealTimeService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitMandateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitMandateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitMandateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitRefundService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitRefundService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitRefundService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitValidateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitValidateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitValidateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionCreateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionCreateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionCreateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionEventUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionEventUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionEventUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionRetrieveService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionRetrieveService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionRetrieveService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionDeleteService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionDeleteService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionDeleteService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPaymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPaymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPaymentService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalCreditService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalCreditService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreditService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "voidService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VoidService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessRules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "businessRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BusinessRules"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitValidateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitValidateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitValidateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Batch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "airlineData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AirlineData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ancillaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AncillaryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lodgingData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "lodgingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "LodgingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalButtonCreateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalButtonCreateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalButtonCreateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPreapprovedPaymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPreapprovedPaymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedPaymentService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPreapprovedUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPreapprovedUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RiskUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fraudUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FraudUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseManagementActionService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "caseManagementActionService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CaseManagementActionService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RequestReserved"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFingerprintID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "deviceFingerprintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFingerprintRaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "deviceFingerprintRaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFingerprintHash");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "deviceFingerprintHash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalRefundService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalRefundService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalRefundService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalAuthReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalDoCaptureService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalDoCaptureService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoCaptureService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcDoPaymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcDoPaymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcDoPaymentService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcGetDetailsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcGetDetailsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcGetDetailsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcSetService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcSetService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcSetService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcOrderSetupService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcOrderSetupService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcOrderSetupService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthorizationService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalAuthorizationService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthorizationService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalUpdateAgreementService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalUpdateAgreementService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalUpdateAgreementService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalCreateAgreementService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalCreateAgreementService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreateAgreementService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalDoRefTransactionService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalDoRefTransactionService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoRefTransactionService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chinaPaymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chinaPaymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaPaymentService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chinaRefundService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chinaRefundService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaRefundService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boletoPaymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boletoPaymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BoletoPaymentService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apInitiateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apInitiateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APInitiateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCheckStatusService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCheckStatusService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckStatusService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreCardExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ignoreCardExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reportGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processorID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCertificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "thirdPartyCertificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLocalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionLocalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionProviderTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "solutionProviderTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "surchargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surchargeSign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "surchargeSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDataEncryptedPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDataEncryptedPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDataKeySerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDataKeySerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashbackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cashbackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitPurchaseService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitPurchaseService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitPurchaseService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitCreditService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitCreditService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitCreditService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apAuthService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apAuthService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apAuthReversalService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apAuthReversalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReversalService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCaptureService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCaptureService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCaptureService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apOptionsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apOptionsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOptionsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apRefundService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apRefundService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APRefundService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apSaleService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apSaleService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSaleService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCheckoutDetailsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCheckoutDetailsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckOutDetailsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apSessionsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apSessionsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSessionsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apUI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apUI"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APUI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apTransactionDetailsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apTransactionDetailsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APTransactionDetailsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apConfirmPurchaseService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apConfirmPurchaseService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APConfirmPurchaseService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalGetTxnDetailsService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalGetTxnDetailsService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalGetTxnDetailsService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTransactionSearchService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalTransactionSearchService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalTransactionSearchService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDCCUpdateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccDCCUpdateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCUpdateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "emvRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantTransactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantTransactionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedDataCreateService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "hostedDataCreateService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataCreateService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedDataRetrieveService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "hostedDataRetrieveService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataRetrieveService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesSlipNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "salesSlipNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchandiseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchandiseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInitiationChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentInitiationChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedCreditTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "extendedCreditTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "authIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNetworkToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentNetworkToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaymentNetworkToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Recipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Sender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRentalData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "autoRentalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AutoRentalData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSolution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentSolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decryptVisaCheckoutDataService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decryptVisaCheckoutDataService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecryptVisaCheckoutDataService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxManagementIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxManagementIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "promotionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PromotionGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wallet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "wallet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Wallet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aft");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "aft"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Aft"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceInquiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "balanceInquiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenoteTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "prenoteTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptPaymentDataService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "encryptPaymentDataService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptPaymentDataService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalNetDomesticData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "nationalNetDomesticData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsequentAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subsequentAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binLookupService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "binLookupService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BinLookupService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "verificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerSolutionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "partnerSolutionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "developerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVisaCheckoutDataService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "getVisaCheckoutDataService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GETVisaCheckoutDataService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSignatureImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerSignatureImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionMetadataService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionMetadataService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TransactionMetadataService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsequentAuthFirst");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subsequentAuthFirst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsequentAuthReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subsequentAuthReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsequentAuthTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "subsequentAuthTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "loan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Loan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityInquiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "eligibilityInquiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redemptionInquiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "redemptionInquiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeProgramIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "feeProgramIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apOrderService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apOrderService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOrderService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCancelService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCancelService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCancelService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apBillingAgreementService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apBillingAgreementService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APBillingAgreementService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_toPayee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "note_toPayee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_toPayer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "note_toPayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerSDKversion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "partnerSDKversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerOriginalTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "partnerOriginalTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeSelectionIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardTypeSelectionIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
