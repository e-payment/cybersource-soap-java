/**
 * ReplyMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class ReplyMessage  implements java.io.Serializable {
    private java.lang.String merchantReferenceCode;

    private java.lang.String requestID;

    private java.lang.String decision;

    private java.math.BigInteger reasonCode;

    private java.lang.String[] missingField;

    private java.lang.String[] invalidField;

    private java.lang.String requestToken;

    private com.cybersource.stub.PurchaseTotals purchaseTotals;

    private com.cybersource.stub.DeniedPartiesMatch[] deniedPartiesMatch;

    private com.cybersource.stub.CCAuthReply ccAuthReply;

    private com.cybersource.stub.OCTReply octReply;

    private com.cybersource.stub.VerificationReply verificationReply;

    private com.cybersource.stub.CCSaleReply ccSaleReply;

    private com.cybersource.stub.CCSaleCreditReply ccSaleCreditReply;

    private com.cybersource.stub.CCSaleReversalReply ccSaleReversalReply;

    private com.cybersource.stub.CCIncrementalAuthReply ccIncrementalAuthReply;

    private com.cybersource.stub.ServiceFeeCalculateReply serviceFeeCalculateReply;

    private com.cybersource.stub.CCCaptureReply ccCaptureReply;

    private com.cybersource.stub.CCCreditReply ccCreditReply;

    private com.cybersource.stub.CCAuthReversalReply ccAuthReversalReply;

    private com.cybersource.stub.CCAutoAuthReversalReply ccAutoAuthReversalReply;

    private com.cybersource.stub.CCDCCReply ccDCCReply;

    private com.cybersource.stub.CCDCCUpdateReply ccDCCUpdateReply;

    private com.cybersource.stub.ECDebitReply ecDebitReply;

    private com.cybersource.stub.ECCreditReply ecCreditReply;

    private com.cybersource.stub.ECAuthenticateReply ecAuthenticateReply;

    private com.cybersource.stub.PayerAuthEnrollReply payerAuthEnrollReply;

    private com.cybersource.stub.PayerAuthValidateReply payerAuthValidateReply;

    private com.cybersource.stub.TaxReply taxReply;

    private com.cybersource.stub.EncryptedPayment encryptedPayment;

    private com.cybersource.stub.EncryptPaymentDataReply encryptPaymentDataReply;

    private com.cybersource.stub.DMEReply dmeReply;

    private com.cybersource.stub.AFSReply afsReply;

    private com.cybersource.stub.DAVReply davReply;

    private com.cybersource.stub.ExportReply exportReply;

    private com.cybersource.stub.FXRatesReply fxRatesReply;

    private com.cybersource.stub.BankTransferReply bankTransferReply;

    private com.cybersource.stub.BankTransferRefundReply bankTransferRefundReply;

    private com.cybersource.stub.BankTransferRealTimeReply bankTransferRealTimeReply;

    private com.cybersource.stub.DirectDebitMandateReply directDebitMandateReply;

    private com.cybersource.stub.DirectDebitReply directDebitReply;

    private com.cybersource.stub.DirectDebitValidateReply directDebitValidateReply;

    private com.cybersource.stub.DirectDebitRefundReply directDebitRefundReply;

    private com.cybersource.stub.PaySubscriptionCreateReply paySubscriptionCreateReply;

    private com.cybersource.stub.PaySubscriptionUpdateReply paySubscriptionUpdateReply;

    private com.cybersource.stub.PaySubscriptionEventUpdateReply paySubscriptionEventUpdateReply;

    private com.cybersource.stub.PaySubscriptionRetrieveReply paySubscriptionRetrieveReply;

    private com.cybersource.stub.PaySubscriptionDeleteReply paySubscriptionDeleteReply;

    private com.cybersource.stub.PayPalPaymentReply payPalPaymentReply;

    private com.cybersource.stub.PayPalCreditReply payPalCreditReply;

    private com.cybersource.stub.VoidReply voidReply;

    private com.cybersource.stub.PinlessDebitReply pinlessDebitReply;

    private com.cybersource.stub.PinlessDebitValidateReply pinlessDebitValidateReply;

    private com.cybersource.stub.PinlessDebitReversalReply pinlessDebitReversalReply;

    private com.cybersource.stub.PayPalButtonCreateReply payPalButtonCreateReply;

    private com.cybersource.stub.PayPalPreapprovedPaymentReply payPalPreapprovedPaymentReply;

    private com.cybersource.stub.PayPalPreapprovedUpdateReply payPalPreapprovedUpdateReply;

    private com.cybersource.stub.RiskUpdateReply riskUpdateReply;

    private com.cybersource.stub.FraudUpdateReply fraudUpdateReply;

    private com.cybersource.stub.CaseManagementActionReply caseManagementActionReply;

    private com.cybersource.stub.DecisionReply decisionReply;

    private com.cybersource.stub.PayPalRefundReply payPalRefundReply;

    private com.cybersource.stub.PayPalAuthReversalReply payPalAuthReversalReply;

    private com.cybersource.stub.PayPalDoCaptureReply payPalDoCaptureReply;

    private com.cybersource.stub.PayPalEcDoPaymentReply payPalEcDoPaymentReply;

    private com.cybersource.stub.PayPalEcGetDetailsReply payPalEcGetDetailsReply;

    private com.cybersource.stub.PayPalEcSetReply payPalEcSetReply;

    private com.cybersource.stub.PayPalAuthorizationReply payPalAuthorizationReply;

    private com.cybersource.stub.PayPalEcOrderSetupReply payPalEcOrderSetupReply;

    private com.cybersource.stub.PayPalUpdateAgreementReply payPalUpdateAgreementReply;

    private com.cybersource.stub.PayPalCreateAgreementReply payPalCreateAgreementReply;

    private com.cybersource.stub.PayPalDoRefTransactionReply payPalDoRefTransactionReply;

    private com.cybersource.stub.ChinaPaymentReply chinaPaymentReply;

    private com.cybersource.stub.ChinaRefundReply chinaRefundReply;

    private com.cybersource.stub.BoletoPaymentReply boletoPaymentReply;

    private com.cybersource.stub.PinDebitPurchaseReply pinDebitPurchaseReply;

    private com.cybersource.stub.PinDebitCreditReply pinDebitCreditReply;

    private com.cybersource.stub.PinDebitReversalReply pinDebitReversalReply;

    private com.cybersource.stub.APInitiateReply apInitiateReply;

    private com.cybersource.stub.APCheckStatusReply apCheckStatusReply;

    private java.lang.String receiptNumber;

    private java.lang.String additionalData;

    private java.lang.String solutionProviderTransactionID;

    private com.cybersource.stub.APReply apReply;

    private com.cybersource.stub.ShipTo shipTo;

    private com.cybersource.stub.BillTo billTo;

    private com.cybersource.stub.APAuthReply apAuthReply;

    private com.cybersource.stub.APSessionsReply apSessionsReply;

    private com.cybersource.stub.APAuthReversalReply apAuthReversalReply;

    private com.cybersource.stub.APCaptureReply apCaptureReply;

    private com.cybersource.stub.APOptionsReply apOptionsReply;

    private com.cybersource.stub.APRefundReply apRefundReply;

    private com.cybersource.stub.APSaleReply apSaleReply;

    private com.cybersource.stub.APCheckOutDetailsReply apCheckoutDetailsReply;

    private com.cybersource.stub.APTransactionDetailsReply apTransactionDetailsReply;

    private com.cybersource.stub.APConfirmPurchaseReply apConfirmPurchaseReply;

    private com.cybersource.stub.Promotion promotion;

    private com.cybersource.stub.PromotionGroupReply[] promotionGroup;

    private com.cybersource.stub.PayPalGetTxnDetailsReply payPalGetTxnDetailsReply;

    private com.cybersource.stub.PayPalTransactionSearchReply payPalTransactionSearchReply;

    private com.cybersource.stub.EmvReply emvReply;

    private com.cybersource.stub.OriginalTransaction originalTransaction;

    private com.cybersource.stub.HostedDataCreateReply hostedDataCreateReply;

    private com.cybersource.stub.HostedDataRetrieveReply hostedDataRetrieveReply;

    private java.lang.String salesSlipNumber;

    private java.lang.String additionalProcessorResponse;

    private com.cybersource.stub.JPO jpo;

    private com.cybersource.stub.Card card;

    private com.cybersource.stub.PaymentNetworkToken paymentNetworkToken;

    private com.cybersource.stub.VCReply vcReply;

    private com.cybersource.stub.DecryptVisaCheckoutDataReply decryptVisaCheckoutDataReply;

    private com.cybersource.stub.GetVisaCheckoutDataReply getVisaCheckoutDataReply;

    private com.cybersource.stub.BinLookupReply binLookupReply;

    private java.lang.String issuerMessage;

    private com.cybersource.stub.Token token;

    private com.cybersource.stub.Issuer issuer;

    private com.cybersource.stub.Recipient recipient;

    private java.lang.String feeProgramIndicator;

    private com.cybersource.stub.Installment installment;

    private java.lang.String paymentAccountReference;

    private java.lang.String authIndicator;

    private com.cybersource.stub.UCAF ucaf;

    private com.cybersource.stub.InvoiceHeader invoiceHeader;

    private com.cybersource.stub.APOrderReply apOrderReply;

    private com.cybersource.stub.APCancelReply apCancelReply;

    private com.cybersource.stub.APBillingAgreementReply apBillingAgreementReply;

    private java.lang.String customerVerificationStatus;

    private com.cybersource.stub.PersonalID personalID;

    private java.lang.String acquirerMerchantNumber;

    private com.cybersource.stub.Pos pos;

    private java.lang.String issuerMessageAction;

    private com.cybersource.stub.ReplyReserved reserved;

    public ReplyMessage() {
    }

    public ReplyMessage(
           java.lang.String merchantReferenceCode,
           java.lang.String requestID,
           java.lang.String decision,
           java.math.BigInteger reasonCode,
           java.lang.String[] missingField,
           java.lang.String[] invalidField,
           java.lang.String requestToken,
           com.cybersource.stub.PurchaseTotals purchaseTotals,
           com.cybersource.stub.DeniedPartiesMatch[] deniedPartiesMatch,
           com.cybersource.stub.CCAuthReply ccAuthReply,
           com.cybersource.stub.OCTReply octReply,
           com.cybersource.stub.VerificationReply verificationReply,
           com.cybersource.stub.CCSaleReply ccSaleReply,
           com.cybersource.stub.CCSaleCreditReply ccSaleCreditReply,
           com.cybersource.stub.CCSaleReversalReply ccSaleReversalReply,
           com.cybersource.stub.CCIncrementalAuthReply ccIncrementalAuthReply,
           com.cybersource.stub.ServiceFeeCalculateReply serviceFeeCalculateReply,
           com.cybersource.stub.CCCaptureReply ccCaptureReply,
           com.cybersource.stub.CCCreditReply ccCreditReply,
           com.cybersource.stub.CCAuthReversalReply ccAuthReversalReply,
           com.cybersource.stub.CCAutoAuthReversalReply ccAutoAuthReversalReply,
           com.cybersource.stub.CCDCCReply ccDCCReply,
           com.cybersource.stub.CCDCCUpdateReply ccDCCUpdateReply,
           com.cybersource.stub.ECDebitReply ecDebitReply,
           com.cybersource.stub.ECCreditReply ecCreditReply,
           com.cybersource.stub.ECAuthenticateReply ecAuthenticateReply,
           com.cybersource.stub.PayerAuthEnrollReply payerAuthEnrollReply,
           com.cybersource.stub.PayerAuthValidateReply payerAuthValidateReply,
           com.cybersource.stub.TaxReply taxReply,
           com.cybersource.stub.EncryptedPayment encryptedPayment,
           com.cybersource.stub.EncryptPaymentDataReply encryptPaymentDataReply,
           com.cybersource.stub.DMEReply dmeReply,
           com.cybersource.stub.AFSReply afsReply,
           com.cybersource.stub.DAVReply davReply,
           com.cybersource.stub.ExportReply exportReply,
           com.cybersource.stub.FXRatesReply fxRatesReply,
           com.cybersource.stub.BankTransferReply bankTransferReply,
           com.cybersource.stub.BankTransferRefundReply bankTransferRefundReply,
           com.cybersource.stub.BankTransferRealTimeReply bankTransferRealTimeReply,
           com.cybersource.stub.DirectDebitMandateReply directDebitMandateReply,
           com.cybersource.stub.DirectDebitReply directDebitReply,
           com.cybersource.stub.DirectDebitValidateReply directDebitValidateReply,
           com.cybersource.stub.DirectDebitRefundReply directDebitRefundReply,
           com.cybersource.stub.PaySubscriptionCreateReply paySubscriptionCreateReply,
           com.cybersource.stub.PaySubscriptionUpdateReply paySubscriptionUpdateReply,
           com.cybersource.stub.PaySubscriptionEventUpdateReply paySubscriptionEventUpdateReply,
           com.cybersource.stub.PaySubscriptionRetrieveReply paySubscriptionRetrieveReply,
           com.cybersource.stub.PaySubscriptionDeleteReply paySubscriptionDeleteReply,
           com.cybersource.stub.PayPalPaymentReply payPalPaymentReply,
           com.cybersource.stub.PayPalCreditReply payPalCreditReply,
           com.cybersource.stub.VoidReply voidReply,
           com.cybersource.stub.PinlessDebitReply pinlessDebitReply,
           com.cybersource.stub.PinlessDebitValidateReply pinlessDebitValidateReply,
           com.cybersource.stub.PinlessDebitReversalReply pinlessDebitReversalReply,
           com.cybersource.stub.PayPalButtonCreateReply payPalButtonCreateReply,
           com.cybersource.stub.PayPalPreapprovedPaymentReply payPalPreapprovedPaymentReply,
           com.cybersource.stub.PayPalPreapprovedUpdateReply payPalPreapprovedUpdateReply,
           com.cybersource.stub.RiskUpdateReply riskUpdateReply,
           com.cybersource.stub.FraudUpdateReply fraudUpdateReply,
           com.cybersource.stub.CaseManagementActionReply caseManagementActionReply,
           com.cybersource.stub.DecisionReply decisionReply,
           com.cybersource.stub.PayPalRefundReply payPalRefundReply,
           com.cybersource.stub.PayPalAuthReversalReply payPalAuthReversalReply,
           com.cybersource.stub.PayPalDoCaptureReply payPalDoCaptureReply,
           com.cybersource.stub.PayPalEcDoPaymentReply payPalEcDoPaymentReply,
           com.cybersource.stub.PayPalEcGetDetailsReply payPalEcGetDetailsReply,
           com.cybersource.stub.PayPalEcSetReply payPalEcSetReply,
           com.cybersource.stub.PayPalAuthorizationReply payPalAuthorizationReply,
           com.cybersource.stub.PayPalEcOrderSetupReply payPalEcOrderSetupReply,
           com.cybersource.stub.PayPalUpdateAgreementReply payPalUpdateAgreementReply,
           com.cybersource.stub.PayPalCreateAgreementReply payPalCreateAgreementReply,
           com.cybersource.stub.PayPalDoRefTransactionReply payPalDoRefTransactionReply,
           com.cybersource.stub.ChinaPaymentReply chinaPaymentReply,
           com.cybersource.stub.ChinaRefundReply chinaRefundReply,
           com.cybersource.stub.BoletoPaymentReply boletoPaymentReply,
           com.cybersource.stub.PinDebitPurchaseReply pinDebitPurchaseReply,
           com.cybersource.stub.PinDebitCreditReply pinDebitCreditReply,
           com.cybersource.stub.PinDebitReversalReply pinDebitReversalReply,
           com.cybersource.stub.APInitiateReply apInitiateReply,
           com.cybersource.stub.APCheckStatusReply apCheckStatusReply,
           java.lang.String receiptNumber,
           java.lang.String additionalData,
           java.lang.String solutionProviderTransactionID,
           com.cybersource.stub.APReply apReply,
           com.cybersource.stub.ShipTo shipTo,
           com.cybersource.stub.BillTo billTo,
           com.cybersource.stub.APAuthReply apAuthReply,
           com.cybersource.stub.APSessionsReply apSessionsReply,
           com.cybersource.stub.APAuthReversalReply apAuthReversalReply,
           com.cybersource.stub.APCaptureReply apCaptureReply,
           com.cybersource.stub.APOptionsReply apOptionsReply,
           com.cybersource.stub.APRefundReply apRefundReply,
           com.cybersource.stub.APSaleReply apSaleReply,
           com.cybersource.stub.APCheckOutDetailsReply apCheckoutDetailsReply,
           com.cybersource.stub.APTransactionDetailsReply apTransactionDetailsReply,
           com.cybersource.stub.APConfirmPurchaseReply apConfirmPurchaseReply,
           com.cybersource.stub.Promotion promotion,
           com.cybersource.stub.PromotionGroupReply[] promotionGroup,
           com.cybersource.stub.PayPalGetTxnDetailsReply payPalGetTxnDetailsReply,
           com.cybersource.stub.PayPalTransactionSearchReply payPalTransactionSearchReply,
           com.cybersource.stub.EmvReply emvReply,
           com.cybersource.stub.OriginalTransaction originalTransaction,
           com.cybersource.stub.HostedDataCreateReply hostedDataCreateReply,
           com.cybersource.stub.HostedDataRetrieveReply hostedDataRetrieveReply,
           java.lang.String salesSlipNumber,
           java.lang.String additionalProcessorResponse,
           com.cybersource.stub.JPO jpo,
           com.cybersource.stub.Card card,
           com.cybersource.stub.PaymentNetworkToken paymentNetworkToken,
           com.cybersource.stub.VCReply vcReply,
           com.cybersource.stub.DecryptVisaCheckoutDataReply decryptVisaCheckoutDataReply,
           com.cybersource.stub.GetVisaCheckoutDataReply getVisaCheckoutDataReply,
           com.cybersource.stub.BinLookupReply binLookupReply,
           java.lang.String issuerMessage,
           com.cybersource.stub.Token token,
           com.cybersource.stub.Issuer issuer,
           com.cybersource.stub.Recipient recipient,
           java.lang.String feeProgramIndicator,
           com.cybersource.stub.Installment installment,
           java.lang.String paymentAccountReference,
           java.lang.String authIndicator,
           com.cybersource.stub.UCAF ucaf,
           com.cybersource.stub.InvoiceHeader invoiceHeader,
           com.cybersource.stub.APOrderReply apOrderReply,
           com.cybersource.stub.APCancelReply apCancelReply,
           com.cybersource.stub.APBillingAgreementReply apBillingAgreementReply,
           java.lang.String customerVerificationStatus,
           com.cybersource.stub.PersonalID personalID,
           java.lang.String acquirerMerchantNumber,
           com.cybersource.stub.Pos pos,
           java.lang.String issuerMessageAction,
           com.cybersource.stub.ReplyReserved reserved) {
           this.merchantReferenceCode = merchantReferenceCode;
           this.requestID = requestID;
           this.decision = decision;
           this.reasonCode = reasonCode;
           this.missingField = missingField;
           this.invalidField = invalidField;
           this.requestToken = requestToken;
           this.purchaseTotals = purchaseTotals;
           this.deniedPartiesMatch = deniedPartiesMatch;
           this.ccAuthReply = ccAuthReply;
           this.octReply = octReply;
           this.verificationReply = verificationReply;
           this.ccSaleReply = ccSaleReply;
           this.ccSaleCreditReply = ccSaleCreditReply;
           this.ccSaleReversalReply = ccSaleReversalReply;
           this.ccIncrementalAuthReply = ccIncrementalAuthReply;
           this.serviceFeeCalculateReply = serviceFeeCalculateReply;
           this.ccCaptureReply = ccCaptureReply;
           this.ccCreditReply = ccCreditReply;
           this.ccAuthReversalReply = ccAuthReversalReply;
           this.ccAutoAuthReversalReply = ccAutoAuthReversalReply;
           this.ccDCCReply = ccDCCReply;
           this.ccDCCUpdateReply = ccDCCUpdateReply;
           this.ecDebitReply = ecDebitReply;
           this.ecCreditReply = ecCreditReply;
           this.ecAuthenticateReply = ecAuthenticateReply;
           this.payerAuthEnrollReply = payerAuthEnrollReply;
           this.payerAuthValidateReply = payerAuthValidateReply;
           this.taxReply = taxReply;
           this.encryptedPayment = encryptedPayment;
           this.encryptPaymentDataReply = encryptPaymentDataReply;
           this.dmeReply = dmeReply;
           this.afsReply = afsReply;
           this.davReply = davReply;
           this.exportReply = exportReply;
           this.fxRatesReply = fxRatesReply;
           this.bankTransferReply = bankTransferReply;
           this.bankTransferRefundReply = bankTransferRefundReply;
           this.bankTransferRealTimeReply = bankTransferRealTimeReply;
           this.directDebitMandateReply = directDebitMandateReply;
           this.directDebitReply = directDebitReply;
           this.directDebitValidateReply = directDebitValidateReply;
           this.directDebitRefundReply = directDebitRefundReply;
           this.paySubscriptionCreateReply = paySubscriptionCreateReply;
           this.paySubscriptionUpdateReply = paySubscriptionUpdateReply;
           this.paySubscriptionEventUpdateReply = paySubscriptionEventUpdateReply;
           this.paySubscriptionRetrieveReply = paySubscriptionRetrieveReply;
           this.paySubscriptionDeleteReply = paySubscriptionDeleteReply;
           this.payPalPaymentReply = payPalPaymentReply;
           this.payPalCreditReply = payPalCreditReply;
           this.voidReply = voidReply;
           this.pinlessDebitReply = pinlessDebitReply;
           this.pinlessDebitValidateReply = pinlessDebitValidateReply;
           this.pinlessDebitReversalReply = pinlessDebitReversalReply;
           this.payPalButtonCreateReply = payPalButtonCreateReply;
           this.payPalPreapprovedPaymentReply = payPalPreapprovedPaymentReply;
           this.payPalPreapprovedUpdateReply = payPalPreapprovedUpdateReply;
           this.riskUpdateReply = riskUpdateReply;
           this.fraudUpdateReply = fraudUpdateReply;
           this.caseManagementActionReply = caseManagementActionReply;
           this.decisionReply = decisionReply;
           this.payPalRefundReply = payPalRefundReply;
           this.payPalAuthReversalReply = payPalAuthReversalReply;
           this.payPalDoCaptureReply = payPalDoCaptureReply;
           this.payPalEcDoPaymentReply = payPalEcDoPaymentReply;
           this.payPalEcGetDetailsReply = payPalEcGetDetailsReply;
           this.payPalEcSetReply = payPalEcSetReply;
           this.payPalAuthorizationReply = payPalAuthorizationReply;
           this.payPalEcOrderSetupReply = payPalEcOrderSetupReply;
           this.payPalUpdateAgreementReply = payPalUpdateAgreementReply;
           this.payPalCreateAgreementReply = payPalCreateAgreementReply;
           this.payPalDoRefTransactionReply = payPalDoRefTransactionReply;
           this.chinaPaymentReply = chinaPaymentReply;
           this.chinaRefundReply = chinaRefundReply;
           this.boletoPaymentReply = boletoPaymentReply;
           this.pinDebitPurchaseReply = pinDebitPurchaseReply;
           this.pinDebitCreditReply = pinDebitCreditReply;
           this.pinDebitReversalReply = pinDebitReversalReply;
           this.apInitiateReply = apInitiateReply;
           this.apCheckStatusReply = apCheckStatusReply;
           this.receiptNumber = receiptNumber;
           this.additionalData = additionalData;
           this.solutionProviderTransactionID = solutionProviderTransactionID;
           this.apReply = apReply;
           this.shipTo = shipTo;
           this.billTo = billTo;
           this.apAuthReply = apAuthReply;
           this.apSessionsReply = apSessionsReply;
           this.apAuthReversalReply = apAuthReversalReply;
           this.apCaptureReply = apCaptureReply;
           this.apOptionsReply = apOptionsReply;
           this.apRefundReply = apRefundReply;
           this.apSaleReply = apSaleReply;
           this.apCheckoutDetailsReply = apCheckoutDetailsReply;
           this.apTransactionDetailsReply = apTransactionDetailsReply;
           this.apConfirmPurchaseReply = apConfirmPurchaseReply;
           this.promotion = promotion;
           this.promotionGroup = promotionGroup;
           this.payPalGetTxnDetailsReply = payPalGetTxnDetailsReply;
           this.payPalTransactionSearchReply = payPalTransactionSearchReply;
           this.emvReply = emvReply;
           this.originalTransaction = originalTransaction;
           this.hostedDataCreateReply = hostedDataCreateReply;
           this.hostedDataRetrieveReply = hostedDataRetrieveReply;
           this.salesSlipNumber = salesSlipNumber;
           this.additionalProcessorResponse = additionalProcessorResponse;
           this.jpo = jpo;
           this.card = card;
           this.paymentNetworkToken = paymentNetworkToken;
           this.vcReply = vcReply;
           this.decryptVisaCheckoutDataReply = decryptVisaCheckoutDataReply;
           this.getVisaCheckoutDataReply = getVisaCheckoutDataReply;
           this.binLookupReply = binLookupReply;
           this.issuerMessage = issuerMessage;
           this.token = token;
           this.issuer = issuer;
           this.recipient = recipient;
           this.feeProgramIndicator = feeProgramIndicator;
           this.installment = installment;
           this.paymentAccountReference = paymentAccountReference;
           this.authIndicator = authIndicator;
           this.ucaf = ucaf;
           this.invoiceHeader = invoiceHeader;
           this.apOrderReply = apOrderReply;
           this.apCancelReply = apCancelReply;
           this.apBillingAgreementReply = apBillingAgreementReply;
           this.customerVerificationStatus = customerVerificationStatus;
           this.personalID = personalID;
           this.acquirerMerchantNumber = acquirerMerchantNumber;
           this.pos = pos;
           this.issuerMessageAction = issuerMessageAction;
           this.reserved = reserved;
    }


    /**
     * Gets the merchantReferenceCode value for this ReplyMessage.
     * 
     * @return merchantReferenceCode
     */
    public java.lang.String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }


    /**
     * Sets the merchantReferenceCode value for this ReplyMessage.
     * 
     * @param merchantReferenceCode
     */
    public void setMerchantReferenceCode(java.lang.String merchantReferenceCode) {
        this.merchantReferenceCode = merchantReferenceCode;
    }


    /**
     * Gets the requestID value for this ReplyMessage.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this ReplyMessage.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the decision value for this ReplyMessage.
     * 
     * @return decision
     */
    public java.lang.String getDecision() {
        return decision;
    }


    /**
     * Sets the decision value for this ReplyMessage.
     * 
     * @param decision
     */
    public void setDecision(java.lang.String decision) {
        this.decision = decision;
    }


    /**
     * Gets the reasonCode value for this ReplyMessage.
     * 
     * @return reasonCode
     */
    public java.math.BigInteger getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this ReplyMessage.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.math.BigInteger reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the missingField value for this ReplyMessage.
     * 
     * @return missingField
     */
    public java.lang.String[] getMissingField() {
        return missingField;
    }


    /**
     * Sets the missingField value for this ReplyMessage.
     * 
     * @param missingField
     */
    public void setMissingField(java.lang.String[] missingField) {
        this.missingField = missingField;
    }

    public java.lang.String getMissingField(int i) {
        return this.missingField[i];
    }

    public void setMissingField(int i, java.lang.String _value) {
        this.missingField[i] = _value;
    }


    /**
     * Gets the invalidField value for this ReplyMessage.
     * 
     * @return invalidField
     */
    public java.lang.String[] getInvalidField() {
        return invalidField;
    }


    /**
     * Sets the invalidField value for this ReplyMessage.
     * 
     * @param invalidField
     */
    public void setInvalidField(java.lang.String[] invalidField) {
        this.invalidField = invalidField;
    }

    public java.lang.String getInvalidField(int i) {
        return this.invalidField[i];
    }

    public void setInvalidField(int i, java.lang.String _value) {
        this.invalidField[i] = _value;
    }


    /**
     * Gets the requestToken value for this ReplyMessage.
     * 
     * @return requestToken
     */
    public java.lang.String getRequestToken() {
        return requestToken;
    }


    /**
     * Sets the requestToken value for this ReplyMessage.
     * 
     * @param requestToken
     */
    public void setRequestToken(java.lang.String requestToken) {
        this.requestToken = requestToken;
    }


    /**
     * Gets the purchaseTotals value for this ReplyMessage.
     * 
     * @return purchaseTotals
     */
    public com.cybersource.stub.PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }


    /**
     * Sets the purchaseTotals value for this ReplyMessage.
     * 
     * @param purchaseTotals
     */
    public void setPurchaseTotals(com.cybersource.stub.PurchaseTotals purchaseTotals) {
        this.purchaseTotals = purchaseTotals;
    }


    /**
     * Gets the deniedPartiesMatch value for this ReplyMessage.
     * 
     * @return deniedPartiesMatch
     */
    public com.cybersource.stub.DeniedPartiesMatch[] getDeniedPartiesMatch() {
        return deniedPartiesMatch;
    }


    /**
     * Sets the deniedPartiesMatch value for this ReplyMessage.
     * 
     * @param deniedPartiesMatch
     */
    public void setDeniedPartiesMatch(com.cybersource.stub.DeniedPartiesMatch[] deniedPartiesMatch) {
        this.deniedPartiesMatch = deniedPartiesMatch;
    }

    public com.cybersource.stub.DeniedPartiesMatch getDeniedPartiesMatch(int i) {
        return this.deniedPartiesMatch[i];
    }

    public void setDeniedPartiesMatch(int i, com.cybersource.stub.DeniedPartiesMatch _value) {
        this.deniedPartiesMatch[i] = _value;
    }


    /**
     * Gets the ccAuthReply value for this ReplyMessage.
     * 
     * @return ccAuthReply
     */
    public com.cybersource.stub.CCAuthReply getCcAuthReply() {
        return ccAuthReply;
    }


    /**
     * Sets the ccAuthReply value for this ReplyMessage.
     * 
     * @param ccAuthReply
     */
    public void setCcAuthReply(com.cybersource.stub.CCAuthReply ccAuthReply) {
        this.ccAuthReply = ccAuthReply;
    }


    /**
     * Gets the octReply value for this ReplyMessage.
     * 
     * @return octReply
     */
    public com.cybersource.stub.OCTReply getOctReply() {
        return octReply;
    }


    /**
     * Sets the octReply value for this ReplyMessage.
     * 
     * @param octReply
     */
    public void setOctReply(com.cybersource.stub.OCTReply octReply) {
        this.octReply = octReply;
    }


    /**
     * Gets the verificationReply value for this ReplyMessage.
     * 
     * @return verificationReply
     */
    public com.cybersource.stub.VerificationReply getVerificationReply() {
        return verificationReply;
    }


    /**
     * Sets the verificationReply value for this ReplyMessage.
     * 
     * @param verificationReply
     */
    public void setVerificationReply(com.cybersource.stub.VerificationReply verificationReply) {
        this.verificationReply = verificationReply;
    }


    /**
     * Gets the ccSaleReply value for this ReplyMessage.
     * 
     * @return ccSaleReply
     */
    public com.cybersource.stub.CCSaleReply getCcSaleReply() {
        return ccSaleReply;
    }


    /**
     * Sets the ccSaleReply value for this ReplyMessage.
     * 
     * @param ccSaleReply
     */
    public void setCcSaleReply(com.cybersource.stub.CCSaleReply ccSaleReply) {
        this.ccSaleReply = ccSaleReply;
    }


    /**
     * Gets the ccSaleCreditReply value for this ReplyMessage.
     * 
     * @return ccSaleCreditReply
     */
    public com.cybersource.stub.CCSaleCreditReply getCcSaleCreditReply() {
        return ccSaleCreditReply;
    }


    /**
     * Sets the ccSaleCreditReply value for this ReplyMessage.
     * 
     * @param ccSaleCreditReply
     */
    public void setCcSaleCreditReply(com.cybersource.stub.CCSaleCreditReply ccSaleCreditReply) {
        this.ccSaleCreditReply = ccSaleCreditReply;
    }


    /**
     * Gets the ccSaleReversalReply value for this ReplyMessage.
     * 
     * @return ccSaleReversalReply
     */
    public com.cybersource.stub.CCSaleReversalReply getCcSaleReversalReply() {
        return ccSaleReversalReply;
    }


    /**
     * Sets the ccSaleReversalReply value for this ReplyMessage.
     * 
     * @param ccSaleReversalReply
     */
    public void setCcSaleReversalReply(com.cybersource.stub.CCSaleReversalReply ccSaleReversalReply) {
        this.ccSaleReversalReply = ccSaleReversalReply;
    }


    /**
     * Gets the ccIncrementalAuthReply value for this ReplyMessage.
     * 
     * @return ccIncrementalAuthReply
     */
    public com.cybersource.stub.CCIncrementalAuthReply getCcIncrementalAuthReply() {
        return ccIncrementalAuthReply;
    }


    /**
     * Sets the ccIncrementalAuthReply value for this ReplyMessage.
     * 
     * @param ccIncrementalAuthReply
     */
    public void setCcIncrementalAuthReply(com.cybersource.stub.CCIncrementalAuthReply ccIncrementalAuthReply) {
        this.ccIncrementalAuthReply = ccIncrementalAuthReply;
    }


    /**
     * Gets the serviceFeeCalculateReply value for this ReplyMessage.
     * 
     * @return serviceFeeCalculateReply
     */
    public com.cybersource.stub.ServiceFeeCalculateReply getServiceFeeCalculateReply() {
        return serviceFeeCalculateReply;
    }


    /**
     * Sets the serviceFeeCalculateReply value for this ReplyMessage.
     * 
     * @param serviceFeeCalculateReply
     */
    public void setServiceFeeCalculateReply(com.cybersource.stub.ServiceFeeCalculateReply serviceFeeCalculateReply) {
        this.serviceFeeCalculateReply = serviceFeeCalculateReply;
    }


    /**
     * Gets the ccCaptureReply value for this ReplyMessage.
     * 
     * @return ccCaptureReply
     */
    public com.cybersource.stub.CCCaptureReply getCcCaptureReply() {
        return ccCaptureReply;
    }


    /**
     * Sets the ccCaptureReply value for this ReplyMessage.
     * 
     * @param ccCaptureReply
     */
    public void setCcCaptureReply(com.cybersource.stub.CCCaptureReply ccCaptureReply) {
        this.ccCaptureReply = ccCaptureReply;
    }


    /**
     * Gets the ccCreditReply value for this ReplyMessage.
     * 
     * @return ccCreditReply
     */
    public com.cybersource.stub.CCCreditReply getCcCreditReply() {
        return ccCreditReply;
    }


    /**
     * Sets the ccCreditReply value for this ReplyMessage.
     * 
     * @param ccCreditReply
     */
    public void setCcCreditReply(com.cybersource.stub.CCCreditReply ccCreditReply) {
        this.ccCreditReply = ccCreditReply;
    }


    /**
     * Gets the ccAuthReversalReply value for this ReplyMessage.
     * 
     * @return ccAuthReversalReply
     */
    public com.cybersource.stub.CCAuthReversalReply getCcAuthReversalReply() {
        return ccAuthReversalReply;
    }


    /**
     * Sets the ccAuthReversalReply value for this ReplyMessage.
     * 
     * @param ccAuthReversalReply
     */
    public void setCcAuthReversalReply(com.cybersource.stub.CCAuthReversalReply ccAuthReversalReply) {
        this.ccAuthReversalReply = ccAuthReversalReply;
    }


    /**
     * Gets the ccAutoAuthReversalReply value for this ReplyMessage.
     * 
     * @return ccAutoAuthReversalReply
     */
    public com.cybersource.stub.CCAutoAuthReversalReply getCcAutoAuthReversalReply() {
        return ccAutoAuthReversalReply;
    }


    /**
     * Sets the ccAutoAuthReversalReply value for this ReplyMessage.
     * 
     * @param ccAutoAuthReversalReply
     */
    public void setCcAutoAuthReversalReply(com.cybersource.stub.CCAutoAuthReversalReply ccAutoAuthReversalReply) {
        this.ccAutoAuthReversalReply = ccAutoAuthReversalReply;
    }


    /**
     * Gets the ccDCCReply value for this ReplyMessage.
     * 
     * @return ccDCCReply
     */
    public com.cybersource.stub.CCDCCReply getCcDCCReply() {
        return ccDCCReply;
    }


    /**
     * Sets the ccDCCReply value for this ReplyMessage.
     * 
     * @param ccDCCReply
     */
    public void setCcDCCReply(com.cybersource.stub.CCDCCReply ccDCCReply) {
        this.ccDCCReply = ccDCCReply;
    }


    /**
     * Gets the ccDCCUpdateReply value for this ReplyMessage.
     * 
     * @return ccDCCUpdateReply
     */
    public com.cybersource.stub.CCDCCUpdateReply getCcDCCUpdateReply() {
        return ccDCCUpdateReply;
    }


    /**
     * Sets the ccDCCUpdateReply value for this ReplyMessage.
     * 
     * @param ccDCCUpdateReply
     */
    public void setCcDCCUpdateReply(com.cybersource.stub.CCDCCUpdateReply ccDCCUpdateReply) {
        this.ccDCCUpdateReply = ccDCCUpdateReply;
    }


    /**
     * Gets the ecDebitReply value for this ReplyMessage.
     * 
     * @return ecDebitReply
     */
    public com.cybersource.stub.ECDebitReply getEcDebitReply() {
        return ecDebitReply;
    }


    /**
     * Sets the ecDebitReply value for this ReplyMessage.
     * 
     * @param ecDebitReply
     */
    public void setEcDebitReply(com.cybersource.stub.ECDebitReply ecDebitReply) {
        this.ecDebitReply = ecDebitReply;
    }


    /**
     * Gets the ecCreditReply value for this ReplyMessage.
     * 
     * @return ecCreditReply
     */
    public com.cybersource.stub.ECCreditReply getEcCreditReply() {
        return ecCreditReply;
    }


    /**
     * Sets the ecCreditReply value for this ReplyMessage.
     * 
     * @param ecCreditReply
     */
    public void setEcCreditReply(com.cybersource.stub.ECCreditReply ecCreditReply) {
        this.ecCreditReply = ecCreditReply;
    }


    /**
     * Gets the ecAuthenticateReply value for this ReplyMessage.
     * 
     * @return ecAuthenticateReply
     */
    public com.cybersource.stub.ECAuthenticateReply getEcAuthenticateReply() {
        return ecAuthenticateReply;
    }


    /**
     * Sets the ecAuthenticateReply value for this ReplyMessage.
     * 
     * @param ecAuthenticateReply
     */
    public void setEcAuthenticateReply(com.cybersource.stub.ECAuthenticateReply ecAuthenticateReply) {
        this.ecAuthenticateReply = ecAuthenticateReply;
    }


    /**
     * Gets the payerAuthEnrollReply value for this ReplyMessage.
     * 
     * @return payerAuthEnrollReply
     */
    public com.cybersource.stub.PayerAuthEnrollReply getPayerAuthEnrollReply() {
        return payerAuthEnrollReply;
    }


    /**
     * Sets the payerAuthEnrollReply value for this ReplyMessage.
     * 
     * @param payerAuthEnrollReply
     */
    public void setPayerAuthEnrollReply(com.cybersource.stub.PayerAuthEnrollReply payerAuthEnrollReply) {
        this.payerAuthEnrollReply = payerAuthEnrollReply;
    }


    /**
     * Gets the payerAuthValidateReply value for this ReplyMessage.
     * 
     * @return payerAuthValidateReply
     */
    public com.cybersource.stub.PayerAuthValidateReply getPayerAuthValidateReply() {
        return payerAuthValidateReply;
    }


    /**
     * Sets the payerAuthValidateReply value for this ReplyMessage.
     * 
     * @param payerAuthValidateReply
     */
    public void setPayerAuthValidateReply(com.cybersource.stub.PayerAuthValidateReply payerAuthValidateReply) {
        this.payerAuthValidateReply = payerAuthValidateReply;
    }


    /**
     * Gets the taxReply value for this ReplyMessage.
     * 
     * @return taxReply
     */
    public com.cybersource.stub.TaxReply getTaxReply() {
        return taxReply;
    }


    /**
     * Sets the taxReply value for this ReplyMessage.
     * 
     * @param taxReply
     */
    public void setTaxReply(com.cybersource.stub.TaxReply taxReply) {
        this.taxReply = taxReply;
    }


    /**
     * Gets the encryptedPayment value for this ReplyMessage.
     * 
     * @return encryptedPayment
     */
    public com.cybersource.stub.EncryptedPayment getEncryptedPayment() {
        return encryptedPayment;
    }


    /**
     * Sets the encryptedPayment value for this ReplyMessage.
     * 
     * @param encryptedPayment
     */
    public void setEncryptedPayment(com.cybersource.stub.EncryptedPayment encryptedPayment) {
        this.encryptedPayment = encryptedPayment;
    }


    /**
     * Gets the encryptPaymentDataReply value for this ReplyMessage.
     * 
     * @return encryptPaymentDataReply
     */
    public com.cybersource.stub.EncryptPaymentDataReply getEncryptPaymentDataReply() {
        return encryptPaymentDataReply;
    }


    /**
     * Sets the encryptPaymentDataReply value for this ReplyMessage.
     * 
     * @param encryptPaymentDataReply
     */
    public void setEncryptPaymentDataReply(com.cybersource.stub.EncryptPaymentDataReply encryptPaymentDataReply) {
        this.encryptPaymentDataReply = encryptPaymentDataReply;
    }


    /**
     * Gets the dmeReply value for this ReplyMessage.
     * 
     * @return dmeReply
     */
    public com.cybersource.stub.DMEReply getDmeReply() {
        return dmeReply;
    }


    /**
     * Sets the dmeReply value for this ReplyMessage.
     * 
     * @param dmeReply
     */
    public void setDmeReply(com.cybersource.stub.DMEReply dmeReply) {
        this.dmeReply = dmeReply;
    }


    /**
     * Gets the afsReply value for this ReplyMessage.
     * 
     * @return afsReply
     */
    public com.cybersource.stub.AFSReply getAfsReply() {
        return afsReply;
    }


    /**
     * Sets the afsReply value for this ReplyMessage.
     * 
     * @param afsReply
     */
    public void setAfsReply(com.cybersource.stub.AFSReply afsReply) {
        this.afsReply = afsReply;
    }


    /**
     * Gets the davReply value for this ReplyMessage.
     * 
     * @return davReply
     */
    public com.cybersource.stub.DAVReply getDavReply() {
        return davReply;
    }


    /**
     * Sets the davReply value for this ReplyMessage.
     * 
     * @param davReply
     */
    public void setDavReply(com.cybersource.stub.DAVReply davReply) {
        this.davReply = davReply;
    }


    /**
     * Gets the exportReply value for this ReplyMessage.
     * 
     * @return exportReply
     */
    public com.cybersource.stub.ExportReply getExportReply() {
        return exportReply;
    }


    /**
     * Sets the exportReply value for this ReplyMessage.
     * 
     * @param exportReply
     */
    public void setExportReply(com.cybersource.stub.ExportReply exportReply) {
        this.exportReply = exportReply;
    }


    /**
     * Gets the fxRatesReply value for this ReplyMessage.
     * 
     * @return fxRatesReply
     */
    public com.cybersource.stub.FXRatesReply getFxRatesReply() {
        return fxRatesReply;
    }


    /**
     * Sets the fxRatesReply value for this ReplyMessage.
     * 
     * @param fxRatesReply
     */
    public void setFxRatesReply(com.cybersource.stub.FXRatesReply fxRatesReply) {
        this.fxRatesReply = fxRatesReply;
    }


    /**
     * Gets the bankTransferReply value for this ReplyMessage.
     * 
     * @return bankTransferReply
     */
    public com.cybersource.stub.BankTransferReply getBankTransferReply() {
        return bankTransferReply;
    }


    /**
     * Sets the bankTransferReply value for this ReplyMessage.
     * 
     * @param bankTransferReply
     */
    public void setBankTransferReply(com.cybersource.stub.BankTransferReply bankTransferReply) {
        this.bankTransferReply = bankTransferReply;
    }


    /**
     * Gets the bankTransferRefundReply value for this ReplyMessage.
     * 
     * @return bankTransferRefundReply
     */
    public com.cybersource.stub.BankTransferRefundReply getBankTransferRefundReply() {
        return bankTransferRefundReply;
    }


    /**
     * Sets the bankTransferRefundReply value for this ReplyMessage.
     * 
     * @param bankTransferRefundReply
     */
    public void setBankTransferRefundReply(com.cybersource.stub.BankTransferRefundReply bankTransferRefundReply) {
        this.bankTransferRefundReply = bankTransferRefundReply;
    }


    /**
     * Gets the bankTransferRealTimeReply value for this ReplyMessage.
     * 
     * @return bankTransferRealTimeReply
     */
    public com.cybersource.stub.BankTransferRealTimeReply getBankTransferRealTimeReply() {
        return bankTransferRealTimeReply;
    }


    /**
     * Sets the bankTransferRealTimeReply value for this ReplyMessage.
     * 
     * @param bankTransferRealTimeReply
     */
    public void setBankTransferRealTimeReply(com.cybersource.stub.BankTransferRealTimeReply bankTransferRealTimeReply) {
        this.bankTransferRealTimeReply = bankTransferRealTimeReply;
    }


    /**
     * Gets the directDebitMandateReply value for this ReplyMessage.
     * 
     * @return directDebitMandateReply
     */
    public com.cybersource.stub.DirectDebitMandateReply getDirectDebitMandateReply() {
        return directDebitMandateReply;
    }


    /**
     * Sets the directDebitMandateReply value for this ReplyMessage.
     * 
     * @param directDebitMandateReply
     */
    public void setDirectDebitMandateReply(com.cybersource.stub.DirectDebitMandateReply directDebitMandateReply) {
        this.directDebitMandateReply = directDebitMandateReply;
    }


    /**
     * Gets the directDebitReply value for this ReplyMessage.
     * 
     * @return directDebitReply
     */
    public com.cybersource.stub.DirectDebitReply getDirectDebitReply() {
        return directDebitReply;
    }


    /**
     * Sets the directDebitReply value for this ReplyMessage.
     * 
     * @param directDebitReply
     */
    public void setDirectDebitReply(com.cybersource.stub.DirectDebitReply directDebitReply) {
        this.directDebitReply = directDebitReply;
    }


    /**
     * Gets the directDebitValidateReply value for this ReplyMessage.
     * 
     * @return directDebitValidateReply
     */
    public com.cybersource.stub.DirectDebitValidateReply getDirectDebitValidateReply() {
        return directDebitValidateReply;
    }


    /**
     * Sets the directDebitValidateReply value for this ReplyMessage.
     * 
     * @param directDebitValidateReply
     */
    public void setDirectDebitValidateReply(com.cybersource.stub.DirectDebitValidateReply directDebitValidateReply) {
        this.directDebitValidateReply = directDebitValidateReply;
    }


    /**
     * Gets the directDebitRefundReply value for this ReplyMessage.
     * 
     * @return directDebitRefundReply
     */
    public com.cybersource.stub.DirectDebitRefundReply getDirectDebitRefundReply() {
        return directDebitRefundReply;
    }


    /**
     * Sets the directDebitRefundReply value for this ReplyMessage.
     * 
     * @param directDebitRefundReply
     */
    public void setDirectDebitRefundReply(com.cybersource.stub.DirectDebitRefundReply directDebitRefundReply) {
        this.directDebitRefundReply = directDebitRefundReply;
    }


    /**
     * Gets the paySubscriptionCreateReply value for this ReplyMessage.
     * 
     * @return paySubscriptionCreateReply
     */
    public com.cybersource.stub.PaySubscriptionCreateReply getPaySubscriptionCreateReply() {
        return paySubscriptionCreateReply;
    }


    /**
     * Sets the paySubscriptionCreateReply value for this ReplyMessage.
     * 
     * @param paySubscriptionCreateReply
     */
    public void setPaySubscriptionCreateReply(com.cybersource.stub.PaySubscriptionCreateReply paySubscriptionCreateReply) {
        this.paySubscriptionCreateReply = paySubscriptionCreateReply;
    }


    /**
     * Gets the paySubscriptionUpdateReply value for this ReplyMessage.
     * 
     * @return paySubscriptionUpdateReply
     */
    public com.cybersource.stub.PaySubscriptionUpdateReply getPaySubscriptionUpdateReply() {
        return paySubscriptionUpdateReply;
    }


    /**
     * Sets the paySubscriptionUpdateReply value for this ReplyMessage.
     * 
     * @param paySubscriptionUpdateReply
     */
    public void setPaySubscriptionUpdateReply(com.cybersource.stub.PaySubscriptionUpdateReply paySubscriptionUpdateReply) {
        this.paySubscriptionUpdateReply = paySubscriptionUpdateReply;
    }


    /**
     * Gets the paySubscriptionEventUpdateReply value for this ReplyMessage.
     * 
     * @return paySubscriptionEventUpdateReply
     */
    public com.cybersource.stub.PaySubscriptionEventUpdateReply getPaySubscriptionEventUpdateReply() {
        return paySubscriptionEventUpdateReply;
    }


    /**
     * Sets the paySubscriptionEventUpdateReply value for this ReplyMessage.
     * 
     * @param paySubscriptionEventUpdateReply
     */
    public void setPaySubscriptionEventUpdateReply(com.cybersource.stub.PaySubscriptionEventUpdateReply paySubscriptionEventUpdateReply) {
        this.paySubscriptionEventUpdateReply = paySubscriptionEventUpdateReply;
    }


    /**
     * Gets the paySubscriptionRetrieveReply value for this ReplyMessage.
     * 
     * @return paySubscriptionRetrieveReply
     */
    public com.cybersource.stub.PaySubscriptionRetrieveReply getPaySubscriptionRetrieveReply() {
        return paySubscriptionRetrieveReply;
    }


    /**
     * Sets the paySubscriptionRetrieveReply value for this ReplyMessage.
     * 
     * @param paySubscriptionRetrieveReply
     */
    public void setPaySubscriptionRetrieveReply(com.cybersource.stub.PaySubscriptionRetrieveReply paySubscriptionRetrieveReply) {
        this.paySubscriptionRetrieveReply = paySubscriptionRetrieveReply;
    }


    /**
     * Gets the paySubscriptionDeleteReply value for this ReplyMessage.
     * 
     * @return paySubscriptionDeleteReply
     */
    public com.cybersource.stub.PaySubscriptionDeleteReply getPaySubscriptionDeleteReply() {
        return paySubscriptionDeleteReply;
    }


    /**
     * Sets the paySubscriptionDeleteReply value for this ReplyMessage.
     * 
     * @param paySubscriptionDeleteReply
     */
    public void setPaySubscriptionDeleteReply(com.cybersource.stub.PaySubscriptionDeleteReply paySubscriptionDeleteReply) {
        this.paySubscriptionDeleteReply = paySubscriptionDeleteReply;
    }


    /**
     * Gets the payPalPaymentReply value for this ReplyMessage.
     * 
     * @return payPalPaymentReply
     */
    public com.cybersource.stub.PayPalPaymentReply getPayPalPaymentReply() {
        return payPalPaymentReply;
    }


    /**
     * Sets the payPalPaymentReply value for this ReplyMessage.
     * 
     * @param payPalPaymentReply
     */
    public void setPayPalPaymentReply(com.cybersource.stub.PayPalPaymentReply payPalPaymentReply) {
        this.payPalPaymentReply = payPalPaymentReply;
    }


    /**
     * Gets the payPalCreditReply value for this ReplyMessage.
     * 
     * @return payPalCreditReply
     */
    public com.cybersource.stub.PayPalCreditReply getPayPalCreditReply() {
        return payPalCreditReply;
    }


    /**
     * Sets the payPalCreditReply value for this ReplyMessage.
     * 
     * @param payPalCreditReply
     */
    public void setPayPalCreditReply(com.cybersource.stub.PayPalCreditReply payPalCreditReply) {
        this.payPalCreditReply = payPalCreditReply;
    }


    /**
     * Gets the voidReply value for this ReplyMessage.
     * 
     * @return voidReply
     */
    public com.cybersource.stub.VoidReply getVoidReply() {
        return voidReply;
    }


    /**
     * Sets the voidReply value for this ReplyMessage.
     * 
     * @param voidReply
     */
    public void setVoidReply(com.cybersource.stub.VoidReply voidReply) {
        this.voidReply = voidReply;
    }


    /**
     * Gets the pinlessDebitReply value for this ReplyMessage.
     * 
     * @return pinlessDebitReply
     */
    public com.cybersource.stub.PinlessDebitReply getPinlessDebitReply() {
        return pinlessDebitReply;
    }


    /**
     * Sets the pinlessDebitReply value for this ReplyMessage.
     * 
     * @param pinlessDebitReply
     */
    public void setPinlessDebitReply(com.cybersource.stub.PinlessDebitReply pinlessDebitReply) {
        this.pinlessDebitReply = pinlessDebitReply;
    }


    /**
     * Gets the pinlessDebitValidateReply value for this ReplyMessage.
     * 
     * @return pinlessDebitValidateReply
     */
    public com.cybersource.stub.PinlessDebitValidateReply getPinlessDebitValidateReply() {
        return pinlessDebitValidateReply;
    }


    /**
     * Sets the pinlessDebitValidateReply value for this ReplyMessage.
     * 
     * @param pinlessDebitValidateReply
     */
    public void setPinlessDebitValidateReply(com.cybersource.stub.PinlessDebitValidateReply pinlessDebitValidateReply) {
        this.pinlessDebitValidateReply = pinlessDebitValidateReply;
    }


    /**
     * Gets the pinlessDebitReversalReply value for this ReplyMessage.
     * 
     * @return pinlessDebitReversalReply
     */
    public com.cybersource.stub.PinlessDebitReversalReply getPinlessDebitReversalReply() {
        return pinlessDebitReversalReply;
    }


    /**
     * Sets the pinlessDebitReversalReply value for this ReplyMessage.
     * 
     * @param pinlessDebitReversalReply
     */
    public void setPinlessDebitReversalReply(com.cybersource.stub.PinlessDebitReversalReply pinlessDebitReversalReply) {
        this.pinlessDebitReversalReply = pinlessDebitReversalReply;
    }


    /**
     * Gets the payPalButtonCreateReply value for this ReplyMessage.
     * 
     * @return payPalButtonCreateReply
     */
    public com.cybersource.stub.PayPalButtonCreateReply getPayPalButtonCreateReply() {
        return payPalButtonCreateReply;
    }


    /**
     * Sets the payPalButtonCreateReply value for this ReplyMessage.
     * 
     * @param payPalButtonCreateReply
     */
    public void setPayPalButtonCreateReply(com.cybersource.stub.PayPalButtonCreateReply payPalButtonCreateReply) {
        this.payPalButtonCreateReply = payPalButtonCreateReply;
    }


    /**
     * Gets the payPalPreapprovedPaymentReply value for this ReplyMessage.
     * 
     * @return payPalPreapprovedPaymentReply
     */
    public com.cybersource.stub.PayPalPreapprovedPaymentReply getPayPalPreapprovedPaymentReply() {
        return payPalPreapprovedPaymentReply;
    }


    /**
     * Sets the payPalPreapprovedPaymentReply value for this ReplyMessage.
     * 
     * @param payPalPreapprovedPaymentReply
     */
    public void setPayPalPreapprovedPaymentReply(com.cybersource.stub.PayPalPreapprovedPaymentReply payPalPreapprovedPaymentReply) {
        this.payPalPreapprovedPaymentReply = payPalPreapprovedPaymentReply;
    }


    /**
     * Gets the payPalPreapprovedUpdateReply value for this ReplyMessage.
     * 
     * @return payPalPreapprovedUpdateReply
     */
    public com.cybersource.stub.PayPalPreapprovedUpdateReply getPayPalPreapprovedUpdateReply() {
        return payPalPreapprovedUpdateReply;
    }


    /**
     * Sets the payPalPreapprovedUpdateReply value for this ReplyMessage.
     * 
     * @param payPalPreapprovedUpdateReply
     */
    public void setPayPalPreapprovedUpdateReply(com.cybersource.stub.PayPalPreapprovedUpdateReply payPalPreapprovedUpdateReply) {
        this.payPalPreapprovedUpdateReply = payPalPreapprovedUpdateReply;
    }


    /**
     * Gets the riskUpdateReply value for this ReplyMessage.
     * 
     * @return riskUpdateReply
     */
    public com.cybersource.stub.RiskUpdateReply getRiskUpdateReply() {
        return riskUpdateReply;
    }


    /**
     * Sets the riskUpdateReply value for this ReplyMessage.
     * 
     * @param riskUpdateReply
     */
    public void setRiskUpdateReply(com.cybersource.stub.RiskUpdateReply riskUpdateReply) {
        this.riskUpdateReply = riskUpdateReply;
    }


    /**
     * Gets the fraudUpdateReply value for this ReplyMessage.
     * 
     * @return fraudUpdateReply
     */
    public com.cybersource.stub.FraudUpdateReply getFraudUpdateReply() {
        return fraudUpdateReply;
    }


    /**
     * Sets the fraudUpdateReply value for this ReplyMessage.
     * 
     * @param fraudUpdateReply
     */
    public void setFraudUpdateReply(com.cybersource.stub.FraudUpdateReply fraudUpdateReply) {
        this.fraudUpdateReply = fraudUpdateReply;
    }


    /**
     * Gets the caseManagementActionReply value for this ReplyMessage.
     * 
     * @return caseManagementActionReply
     */
    public com.cybersource.stub.CaseManagementActionReply getCaseManagementActionReply() {
        return caseManagementActionReply;
    }


    /**
     * Sets the caseManagementActionReply value for this ReplyMessage.
     * 
     * @param caseManagementActionReply
     */
    public void setCaseManagementActionReply(com.cybersource.stub.CaseManagementActionReply caseManagementActionReply) {
        this.caseManagementActionReply = caseManagementActionReply;
    }


    /**
     * Gets the decisionReply value for this ReplyMessage.
     * 
     * @return decisionReply
     */
    public com.cybersource.stub.DecisionReply getDecisionReply() {
        return decisionReply;
    }


    /**
     * Sets the decisionReply value for this ReplyMessage.
     * 
     * @param decisionReply
     */
    public void setDecisionReply(com.cybersource.stub.DecisionReply decisionReply) {
        this.decisionReply = decisionReply;
    }


    /**
     * Gets the payPalRefundReply value for this ReplyMessage.
     * 
     * @return payPalRefundReply
     */
    public com.cybersource.stub.PayPalRefundReply getPayPalRefundReply() {
        return payPalRefundReply;
    }


    /**
     * Sets the payPalRefundReply value for this ReplyMessage.
     * 
     * @param payPalRefundReply
     */
    public void setPayPalRefundReply(com.cybersource.stub.PayPalRefundReply payPalRefundReply) {
        this.payPalRefundReply = payPalRefundReply;
    }


    /**
     * Gets the payPalAuthReversalReply value for this ReplyMessage.
     * 
     * @return payPalAuthReversalReply
     */
    public com.cybersource.stub.PayPalAuthReversalReply getPayPalAuthReversalReply() {
        return payPalAuthReversalReply;
    }


    /**
     * Sets the payPalAuthReversalReply value for this ReplyMessage.
     * 
     * @param payPalAuthReversalReply
     */
    public void setPayPalAuthReversalReply(com.cybersource.stub.PayPalAuthReversalReply payPalAuthReversalReply) {
        this.payPalAuthReversalReply = payPalAuthReversalReply;
    }


    /**
     * Gets the payPalDoCaptureReply value for this ReplyMessage.
     * 
     * @return payPalDoCaptureReply
     */
    public com.cybersource.stub.PayPalDoCaptureReply getPayPalDoCaptureReply() {
        return payPalDoCaptureReply;
    }


    /**
     * Sets the payPalDoCaptureReply value for this ReplyMessage.
     * 
     * @param payPalDoCaptureReply
     */
    public void setPayPalDoCaptureReply(com.cybersource.stub.PayPalDoCaptureReply payPalDoCaptureReply) {
        this.payPalDoCaptureReply = payPalDoCaptureReply;
    }


    /**
     * Gets the payPalEcDoPaymentReply value for this ReplyMessage.
     * 
     * @return payPalEcDoPaymentReply
     */
    public com.cybersource.stub.PayPalEcDoPaymentReply getPayPalEcDoPaymentReply() {
        return payPalEcDoPaymentReply;
    }


    /**
     * Sets the payPalEcDoPaymentReply value for this ReplyMessage.
     * 
     * @param payPalEcDoPaymentReply
     */
    public void setPayPalEcDoPaymentReply(com.cybersource.stub.PayPalEcDoPaymentReply payPalEcDoPaymentReply) {
        this.payPalEcDoPaymentReply = payPalEcDoPaymentReply;
    }


    /**
     * Gets the payPalEcGetDetailsReply value for this ReplyMessage.
     * 
     * @return payPalEcGetDetailsReply
     */
    public com.cybersource.stub.PayPalEcGetDetailsReply getPayPalEcGetDetailsReply() {
        return payPalEcGetDetailsReply;
    }


    /**
     * Sets the payPalEcGetDetailsReply value for this ReplyMessage.
     * 
     * @param payPalEcGetDetailsReply
     */
    public void setPayPalEcGetDetailsReply(com.cybersource.stub.PayPalEcGetDetailsReply payPalEcGetDetailsReply) {
        this.payPalEcGetDetailsReply = payPalEcGetDetailsReply;
    }


    /**
     * Gets the payPalEcSetReply value for this ReplyMessage.
     * 
     * @return payPalEcSetReply
     */
    public com.cybersource.stub.PayPalEcSetReply getPayPalEcSetReply() {
        return payPalEcSetReply;
    }


    /**
     * Sets the payPalEcSetReply value for this ReplyMessage.
     * 
     * @param payPalEcSetReply
     */
    public void setPayPalEcSetReply(com.cybersource.stub.PayPalEcSetReply payPalEcSetReply) {
        this.payPalEcSetReply = payPalEcSetReply;
    }


    /**
     * Gets the payPalAuthorizationReply value for this ReplyMessage.
     * 
     * @return payPalAuthorizationReply
     */
    public com.cybersource.stub.PayPalAuthorizationReply getPayPalAuthorizationReply() {
        return payPalAuthorizationReply;
    }


    /**
     * Sets the payPalAuthorizationReply value for this ReplyMessage.
     * 
     * @param payPalAuthorizationReply
     */
    public void setPayPalAuthorizationReply(com.cybersource.stub.PayPalAuthorizationReply payPalAuthorizationReply) {
        this.payPalAuthorizationReply = payPalAuthorizationReply;
    }


    /**
     * Gets the payPalEcOrderSetupReply value for this ReplyMessage.
     * 
     * @return payPalEcOrderSetupReply
     */
    public com.cybersource.stub.PayPalEcOrderSetupReply getPayPalEcOrderSetupReply() {
        return payPalEcOrderSetupReply;
    }


    /**
     * Sets the payPalEcOrderSetupReply value for this ReplyMessage.
     * 
     * @param payPalEcOrderSetupReply
     */
    public void setPayPalEcOrderSetupReply(com.cybersource.stub.PayPalEcOrderSetupReply payPalEcOrderSetupReply) {
        this.payPalEcOrderSetupReply = payPalEcOrderSetupReply;
    }


    /**
     * Gets the payPalUpdateAgreementReply value for this ReplyMessage.
     * 
     * @return payPalUpdateAgreementReply
     */
    public com.cybersource.stub.PayPalUpdateAgreementReply getPayPalUpdateAgreementReply() {
        return payPalUpdateAgreementReply;
    }


    /**
     * Sets the payPalUpdateAgreementReply value for this ReplyMessage.
     * 
     * @param payPalUpdateAgreementReply
     */
    public void setPayPalUpdateAgreementReply(com.cybersource.stub.PayPalUpdateAgreementReply payPalUpdateAgreementReply) {
        this.payPalUpdateAgreementReply = payPalUpdateAgreementReply;
    }


    /**
     * Gets the payPalCreateAgreementReply value for this ReplyMessage.
     * 
     * @return payPalCreateAgreementReply
     */
    public com.cybersource.stub.PayPalCreateAgreementReply getPayPalCreateAgreementReply() {
        return payPalCreateAgreementReply;
    }


    /**
     * Sets the payPalCreateAgreementReply value for this ReplyMessage.
     * 
     * @param payPalCreateAgreementReply
     */
    public void setPayPalCreateAgreementReply(com.cybersource.stub.PayPalCreateAgreementReply payPalCreateAgreementReply) {
        this.payPalCreateAgreementReply = payPalCreateAgreementReply;
    }


    /**
     * Gets the payPalDoRefTransactionReply value for this ReplyMessage.
     * 
     * @return payPalDoRefTransactionReply
     */
    public com.cybersource.stub.PayPalDoRefTransactionReply getPayPalDoRefTransactionReply() {
        return payPalDoRefTransactionReply;
    }


    /**
     * Sets the payPalDoRefTransactionReply value for this ReplyMessage.
     * 
     * @param payPalDoRefTransactionReply
     */
    public void setPayPalDoRefTransactionReply(com.cybersource.stub.PayPalDoRefTransactionReply payPalDoRefTransactionReply) {
        this.payPalDoRefTransactionReply = payPalDoRefTransactionReply;
    }


    /**
     * Gets the chinaPaymentReply value for this ReplyMessage.
     * 
     * @return chinaPaymentReply
     */
    public com.cybersource.stub.ChinaPaymentReply getChinaPaymentReply() {
        return chinaPaymentReply;
    }


    /**
     * Sets the chinaPaymentReply value for this ReplyMessage.
     * 
     * @param chinaPaymentReply
     */
    public void setChinaPaymentReply(com.cybersource.stub.ChinaPaymentReply chinaPaymentReply) {
        this.chinaPaymentReply = chinaPaymentReply;
    }


    /**
     * Gets the chinaRefundReply value for this ReplyMessage.
     * 
     * @return chinaRefundReply
     */
    public com.cybersource.stub.ChinaRefundReply getChinaRefundReply() {
        return chinaRefundReply;
    }


    /**
     * Sets the chinaRefundReply value for this ReplyMessage.
     * 
     * @param chinaRefundReply
     */
    public void setChinaRefundReply(com.cybersource.stub.ChinaRefundReply chinaRefundReply) {
        this.chinaRefundReply = chinaRefundReply;
    }


    /**
     * Gets the boletoPaymentReply value for this ReplyMessage.
     * 
     * @return boletoPaymentReply
     */
    public com.cybersource.stub.BoletoPaymentReply getBoletoPaymentReply() {
        return boletoPaymentReply;
    }


    /**
     * Sets the boletoPaymentReply value for this ReplyMessage.
     * 
     * @param boletoPaymentReply
     */
    public void setBoletoPaymentReply(com.cybersource.stub.BoletoPaymentReply boletoPaymentReply) {
        this.boletoPaymentReply = boletoPaymentReply;
    }


    /**
     * Gets the pinDebitPurchaseReply value for this ReplyMessage.
     * 
     * @return pinDebitPurchaseReply
     */
    public com.cybersource.stub.PinDebitPurchaseReply getPinDebitPurchaseReply() {
        return pinDebitPurchaseReply;
    }


    /**
     * Sets the pinDebitPurchaseReply value for this ReplyMessage.
     * 
     * @param pinDebitPurchaseReply
     */
    public void setPinDebitPurchaseReply(com.cybersource.stub.PinDebitPurchaseReply pinDebitPurchaseReply) {
        this.pinDebitPurchaseReply = pinDebitPurchaseReply;
    }


    /**
     * Gets the pinDebitCreditReply value for this ReplyMessage.
     * 
     * @return pinDebitCreditReply
     */
    public com.cybersource.stub.PinDebitCreditReply getPinDebitCreditReply() {
        return pinDebitCreditReply;
    }


    /**
     * Sets the pinDebitCreditReply value for this ReplyMessage.
     * 
     * @param pinDebitCreditReply
     */
    public void setPinDebitCreditReply(com.cybersource.stub.PinDebitCreditReply pinDebitCreditReply) {
        this.pinDebitCreditReply = pinDebitCreditReply;
    }


    /**
     * Gets the pinDebitReversalReply value for this ReplyMessage.
     * 
     * @return pinDebitReversalReply
     */
    public com.cybersource.stub.PinDebitReversalReply getPinDebitReversalReply() {
        return pinDebitReversalReply;
    }


    /**
     * Sets the pinDebitReversalReply value for this ReplyMessage.
     * 
     * @param pinDebitReversalReply
     */
    public void setPinDebitReversalReply(com.cybersource.stub.PinDebitReversalReply pinDebitReversalReply) {
        this.pinDebitReversalReply = pinDebitReversalReply;
    }


    /**
     * Gets the apInitiateReply value for this ReplyMessage.
     * 
     * @return apInitiateReply
     */
    public com.cybersource.stub.APInitiateReply getApInitiateReply() {
        return apInitiateReply;
    }


    /**
     * Sets the apInitiateReply value for this ReplyMessage.
     * 
     * @param apInitiateReply
     */
    public void setApInitiateReply(com.cybersource.stub.APInitiateReply apInitiateReply) {
        this.apInitiateReply = apInitiateReply;
    }


    /**
     * Gets the apCheckStatusReply value for this ReplyMessage.
     * 
     * @return apCheckStatusReply
     */
    public com.cybersource.stub.APCheckStatusReply getApCheckStatusReply() {
        return apCheckStatusReply;
    }


    /**
     * Sets the apCheckStatusReply value for this ReplyMessage.
     * 
     * @param apCheckStatusReply
     */
    public void setApCheckStatusReply(com.cybersource.stub.APCheckStatusReply apCheckStatusReply) {
        this.apCheckStatusReply = apCheckStatusReply;
    }


    /**
     * Gets the receiptNumber value for this ReplyMessage.
     * 
     * @return receiptNumber
     */
    public java.lang.String getReceiptNumber() {
        return receiptNumber;
    }


    /**
     * Sets the receiptNumber value for this ReplyMessage.
     * 
     * @param receiptNumber
     */
    public void setReceiptNumber(java.lang.String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }


    /**
     * Gets the additionalData value for this ReplyMessage.
     * 
     * @return additionalData
     */
    public java.lang.String getAdditionalData() {
        return additionalData;
    }


    /**
     * Sets the additionalData value for this ReplyMessage.
     * 
     * @param additionalData
     */
    public void setAdditionalData(java.lang.String additionalData) {
        this.additionalData = additionalData;
    }


    /**
     * Gets the solutionProviderTransactionID value for this ReplyMessage.
     * 
     * @return solutionProviderTransactionID
     */
    public java.lang.String getSolutionProviderTransactionID() {
        return solutionProviderTransactionID;
    }


    /**
     * Sets the solutionProviderTransactionID value for this ReplyMessage.
     * 
     * @param solutionProviderTransactionID
     */
    public void setSolutionProviderTransactionID(java.lang.String solutionProviderTransactionID) {
        this.solutionProviderTransactionID = solutionProviderTransactionID;
    }


    /**
     * Gets the apReply value for this ReplyMessage.
     * 
     * @return apReply
     */
    public com.cybersource.stub.APReply getApReply() {
        return apReply;
    }


    /**
     * Sets the apReply value for this ReplyMessage.
     * 
     * @param apReply
     */
    public void setApReply(com.cybersource.stub.APReply apReply) {
        this.apReply = apReply;
    }


    /**
     * Gets the shipTo value for this ReplyMessage.
     * 
     * @return shipTo
     */
    public com.cybersource.stub.ShipTo getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ReplyMessage.
     * 
     * @param shipTo
     */
    public void setShipTo(com.cybersource.stub.ShipTo shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the billTo value for this ReplyMessage.
     * 
     * @return billTo
     */
    public com.cybersource.stub.BillTo getBillTo() {
        return billTo;
    }


    /**
     * Sets the billTo value for this ReplyMessage.
     * 
     * @param billTo
     */
    public void setBillTo(com.cybersource.stub.BillTo billTo) {
        this.billTo = billTo;
    }


    /**
     * Gets the apAuthReply value for this ReplyMessage.
     * 
     * @return apAuthReply
     */
    public com.cybersource.stub.APAuthReply getApAuthReply() {
        return apAuthReply;
    }


    /**
     * Sets the apAuthReply value for this ReplyMessage.
     * 
     * @param apAuthReply
     */
    public void setApAuthReply(com.cybersource.stub.APAuthReply apAuthReply) {
        this.apAuthReply = apAuthReply;
    }


    /**
     * Gets the apSessionsReply value for this ReplyMessage.
     * 
     * @return apSessionsReply
     */
    public com.cybersource.stub.APSessionsReply getApSessionsReply() {
        return apSessionsReply;
    }


    /**
     * Sets the apSessionsReply value for this ReplyMessage.
     * 
     * @param apSessionsReply
     */
    public void setApSessionsReply(com.cybersource.stub.APSessionsReply apSessionsReply) {
        this.apSessionsReply = apSessionsReply;
    }


    /**
     * Gets the apAuthReversalReply value for this ReplyMessage.
     * 
     * @return apAuthReversalReply
     */
    public com.cybersource.stub.APAuthReversalReply getApAuthReversalReply() {
        return apAuthReversalReply;
    }


    /**
     * Sets the apAuthReversalReply value for this ReplyMessage.
     * 
     * @param apAuthReversalReply
     */
    public void setApAuthReversalReply(com.cybersource.stub.APAuthReversalReply apAuthReversalReply) {
        this.apAuthReversalReply = apAuthReversalReply;
    }


    /**
     * Gets the apCaptureReply value for this ReplyMessage.
     * 
     * @return apCaptureReply
     */
    public com.cybersource.stub.APCaptureReply getApCaptureReply() {
        return apCaptureReply;
    }


    /**
     * Sets the apCaptureReply value for this ReplyMessage.
     * 
     * @param apCaptureReply
     */
    public void setApCaptureReply(com.cybersource.stub.APCaptureReply apCaptureReply) {
        this.apCaptureReply = apCaptureReply;
    }


    /**
     * Gets the apOptionsReply value for this ReplyMessage.
     * 
     * @return apOptionsReply
     */
    public com.cybersource.stub.APOptionsReply getApOptionsReply() {
        return apOptionsReply;
    }


    /**
     * Sets the apOptionsReply value for this ReplyMessage.
     * 
     * @param apOptionsReply
     */
    public void setApOptionsReply(com.cybersource.stub.APOptionsReply apOptionsReply) {
        this.apOptionsReply = apOptionsReply;
    }


    /**
     * Gets the apRefundReply value for this ReplyMessage.
     * 
     * @return apRefundReply
     */
    public com.cybersource.stub.APRefundReply getApRefundReply() {
        return apRefundReply;
    }


    /**
     * Sets the apRefundReply value for this ReplyMessage.
     * 
     * @param apRefundReply
     */
    public void setApRefundReply(com.cybersource.stub.APRefundReply apRefundReply) {
        this.apRefundReply = apRefundReply;
    }


    /**
     * Gets the apSaleReply value for this ReplyMessage.
     * 
     * @return apSaleReply
     */
    public com.cybersource.stub.APSaleReply getApSaleReply() {
        return apSaleReply;
    }


    /**
     * Sets the apSaleReply value for this ReplyMessage.
     * 
     * @param apSaleReply
     */
    public void setApSaleReply(com.cybersource.stub.APSaleReply apSaleReply) {
        this.apSaleReply = apSaleReply;
    }


    /**
     * Gets the apCheckoutDetailsReply value for this ReplyMessage.
     * 
     * @return apCheckoutDetailsReply
     */
    public com.cybersource.stub.APCheckOutDetailsReply getApCheckoutDetailsReply() {
        return apCheckoutDetailsReply;
    }


    /**
     * Sets the apCheckoutDetailsReply value for this ReplyMessage.
     * 
     * @param apCheckoutDetailsReply
     */
    public void setApCheckoutDetailsReply(com.cybersource.stub.APCheckOutDetailsReply apCheckoutDetailsReply) {
        this.apCheckoutDetailsReply = apCheckoutDetailsReply;
    }


    /**
     * Gets the apTransactionDetailsReply value for this ReplyMessage.
     * 
     * @return apTransactionDetailsReply
     */
    public com.cybersource.stub.APTransactionDetailsReply getApTransactionDetailsReply() {
        return apTransactionDetailsReply;
    }


    /**
     * Sets the apTransactionDetailsReply value for this ReplyMessage.
     * 
     * @param apTransactionDetailsReply
     */
    public void setApTransactionDetailsReply(com.cybersource.stub.APTransactionDetailsReply apTransactionDetailsReply) {
        this.apTransactionDetailsReply = apTransactionDetailsReply;
    }


    /**
     * Gets the apConfirmPurchaseReply value for this ReplyMessage.
     * 
     * @return apConfirmPurchaseReply
     */
    public com.cybersource.stub.APConfirmPurchaseReply getApConfirmPurchaseReply() {
        return apConfirmPurchaseReply;
    }


    /**
     * Sets the apConfirmPurchaseReply value for this ReplyMessage.
     * 
     * @param apConfirmPurchaseReply
     */
    public void setApConfirmPurchaseReply(com.cybersource.stub.APConfirmPurchaseReply apConfirmPurchaseReply) {
        this.apConfirmPurchaseReply = apConfirmPurchaseReply;
    }


    /**
     * Gets the promotion value for this ReplyMessage.
     * 
     * @return promotion
     */
    public com.cybersource.stub.Promotion getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this ReplyMessage.
     * 
     * @param promotion
     */
    public void setPromotion(com.cybersource.stub.Promotion promotion) {
        this.promotion = promotion;
    }


    /**
     * Gets the promotionGroup value for this ReplyMessage.
     * 
     * @return promotionGroup
     */
    public com.cybersource.stub.PromotionGroupReply[] getPromotionGroup() {
        return promotionGroup;
    }


    /**
     * Sets the promotionGroup value for this ReplyMessage.
     * 
     * @param promotionGroup
     */
    public void setPromotionGroup(com.cybersource.stub.PromotionGroupReply[] promotionGroup) {
        this.promotionGroup = promotionGroup;
    }

    public com.cybersource.stub.PromotionGroupReply getPromotionGroup(int i) {
        return this.promotionGroup[i];
    }

    public void setPromotionGroup(int i, com.cybersource.stub.PromotionGroupReply _value) {
        this.promotionGroup[i] = _value;
    }


    /**
     * Gets the payPalGetTxnDetailsReply value for this ReplyMessage.
     * 
     * @return payPalGetTxnDetailsReply
     */
    public com.cybersource.stub.PayPalGetTxnDetailsReply getPayPalGetTxnDetailsReply() {
        return payPalGetTxnDetailsReply;
    }


    /**
     * Sets the payPalGetTxnDetailsReply value for this ReplyMessage.
     * 
     * @param payPalGetTxnDetailsReply
     */
    public void setPayPalGetTxnDetailsReply(com.cybersource.stub.PayPalGetTxnDetailsReply payPalGetTxnDetailsReply) {
        this.payPalGetTxnDetailsReply = payPalGetTxnDetailsReply;
    }


    /**
     * Gets the payPalTransactionSearchReply value for this ReplyMessage.
     * 
     * @return payPalTransactionSearchReply
     */
    public com.cybersource.stub.PayPalTransactionSearchReply getPayPalTransactionSearchReply() {
        return payPalTransactionSearchReply;
    }


    /**
     * Sets the payPalTransactionSearchReply value for this ReplyMessage.
     * 
     * @param payPalTransactionSearchReply
     */
    public void setPayPalTransactionSearchReply(com.cybersource.stub.PayPalTransactionSearchReply payPalTransactionSearchReply) {
        this.payPalTransactionSearchReply = payPalTransactionSearchReply;
    }


    /**
     * Gets the emvReply value for this ReplyMessage.
     * 
     * @return emvReply
     */
    public com.cybersource.stub.EmvReply getEmvReply() {
        return emvReply;
    }


    /**
     * Sets the emvReply value for this ReplyMessage.
     * 
     * @param emvReply
     */
    public void setEmvReply(com.cybersource.stub.EmvReply emvReply) {
        this.emvReply = emvReply;
    }


    /**
     * Gets the originalTransaction value for this ReplyMessage.
     * 
     * @return originalTransaction
     */
    public com.cybersource.stub.OriginalTransaction getOriginalTransaction() {
        return originalTransaction;
    }


    /**
     * Sets the originalTransaction value for this ReplyMessage.
     * 
     * @param originalTransaction
     */
    public void setOriginalTransaction(com.cybersource.stub.OriginalTransaction originalTransaction) {
        this.originalTransaction = originalTransaction;
    }


    /**
     * Gets the hostedDataCreateReply value for this ReplyMessage.
     * 
     * @return hostedDataCreateReply
     */
    public com.cybersource.stub.HostedDataCreateReply getHostedDataCreateReply() {
        return hostedDataCreateReply;
    }


    /**
     * Sets the hostedDataCreateReply value for this ReplyMessage.
     * 
     * @param hostedDataCreateReply
     */
    public void setHostedDataCreateReply(com.cybersource.stub.HostedDataCreateReply hostedDataCreateReply) {
        this.hostedDataCreateReply = hostedDataCreateReply;
    }


    /**
     * Gets the hostedDataRetrieveReply value for this ReplyMessage.
     * 
     * @return hostedDataRetrieveReply
     */
    public com.cybersource.stub.HostedDataRetrieveReply getHostedDataRetrieveReply() {
        return hostedDataRetrieveReply;
    }


    /**
     * Sets the hostedDataRetrieveReply value for this ReplyMessage.
     * 
     * @param hostedDataRetrieveReply
     */
    public void setHostedDataRetrieveReply(com.cybersource.stub.HostedDataRetrieveReply hostedDataRetrieveReply) {
        this.hostedDataRetrieveReply = hostedDataRetrieveReply;
    }


    /**
     * Gets the salesSlipNumber value for this ReplyMessage.
     * 
     * @return salesSlipNumber
     */
    public java.lang.String getSalesSlipNumber() {
        return salesSlipNumber;
    }


    /**
     * Sets the salesSlipNumber value for this ReplyMessage.
     * 
     * @param salesSlipNumber
     */
    public void setSalesSlipNumber(java.lang.String salesSlipNumber) {
        this.salesSlipNumber = salesSlipNumber;
    }


    /**
     * Gets the additionalProcessorResponse value for this ReplyMessage.
     * 
     * @return additionalProcessorResponse
     */
    public java.lang.String getAdditionalProcessorResponse() {
        return additionalProcessorResponse;
    }


    /**
     * Sets the additionalProcessorResponse value for this ReplyMessage.
     * 
     * @param additionalProcessorResponse
     */
    public void setAdditionalProcessorResponse(java.lang.String additionalProcessorResponse) {
        this.additionalProcessorResponse = additionalProcessorResponse;
    }


    /**
     * Gets the jpo value for this ReplyMessage.
     * 
     * @return jpo
     */
    public com.cybersource.stub.JPO getJpo() {
        return jpo;
    }


    /**
     * Sets the jpo value for this ReplyMessage.
     * 
     * @param jpo
     */
    public void setJpo(com.cybersource.stub.JPO jpo) {
        this.jpo = jpo;
    }


    /**
     * Gets the card value for this ReplyMessage.
     * 
     * @return card
     */
    public com.cybersource.stub.Card getCard() {
        return card;
    }


    /**
     * Sets the card value for this ReplyMessage.
     * 
     * @param card
     */
    public void setCard(com.cybersource.stub.Card card) {
        this.card = card;
    }


    /**
     * Gets the paymentNetworkToken value for this ReplyMessage.
     * 
     * @return paymentNetworkToken
     */
    public com.cybersource.stub.PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }


    /**
     * Sets the paymentNetworkToken value for this ReplyMessage.
     * 
     * @param paymentNetworkToken
     */
    public void setPaymentNetworkToken(com.cybersource.stub.PaymentNetworkToken paymentNetworkToken) {
        this.paymentNetworkToken = paymentNetworkToken;
    }


    /**
     * Gets the vcReply value for this ReplyMessage.
     * 
     * @return vcReply
     */
    public com.cybersource.stub.VCReply getVcReply() {
        return vcReply;
    }


    /**
     * Sets the vcReply value for this ReplyMessage.
     * 
     * @param vcReply
     */
    public void setVcReply(com.cybersource.stub.VCReply vcReply) {
        this.vcReply = vcReply;
    }


    /**
     * Gets the decryptVisaCheckoutDataReply value for this ReplyMessage.
     * 
     * @return decryptVisaCheckoutDataReply
     */
    public com.cybersource.stub.DecryptVisaCheckoutDataReply getDecryptVisaCheckoutDataReply() {
        return decryptVisaCheckoutDataReply;
    }


    /**
     * Sets the decryptVisaCheckoutDataReply value for this ReplyMessage.
     * 
     * @param decryptVisaCheckoutDataReply
     */
    public void setDecryptVisaCheckoutDataReply(com.cybersource.stub.DecryptVisaCheckoutDataReply decryptVisaCheckoutDataReply) {
        this.decryptVisaCheckoutDataReply = decryptVisaCheckoutDataReply;
    }


    /**
     * Gets the getVisaCheckoutDataReply value for this ReplyMessage.
     * 
     * @return getVisaCheckoutDataReply
     */
    public com.cybersource.stub.GetVisaCheckoutDataReply getGetVisaCheckoutDataReply() {
        return getVisaCheckoutDataReply;
    }


    /**
     * Sets the getVisaCheckoutDataReply value for this ReplyMessage.
     * 
     * @param getVisaCheckoutDataReply
     */
    public void setGetVisaCheckoutDataReply(com.cybersource.stub.GetVisaCheckoutDataReply getVisaCheckoutDataReply) {
        this.getVisaCheckoutDataReply = getVisaCheckoutDataReply;
    }


    /**
     * Gets the binLookupReply value for this ReplyMessage.
     * 
     * @return binLookupReply
     */
    public com.cybersource.stub.BinLookupReply getBinLookupReply() {
        return binLookupReply;
    }


    /**
     * Sets the binLookupReply value for this ReplyMessage.
     * 
     * @param binLookupReply
     */
    public void setBinLookupReply(com.cybersource.stub.BinLookupReply binLookupReply) {
        this.binLookupReply = binLookupReply;
    }


    /**
     * Gets the issuerMessage value for this ReplyMessage.
     * 
     * @return issuerMessage
     */
    public java.lang.String getIssuerMessage() {
        return issuerMessage;
    }


    /**
     * Sets the issuerMessage value for this ReplyMessage.
     * 
     * @param issuerMessage
     */
    public void setIssuerMessage(java.lang.String issuerMessage) {
        this.issuerMessage = issuerMessage;
    }


    /**
     * Gets the token value for this ReplyMessage.
     * 
     * @return token
     */
    public com.cybersource.stub.Token getToken() {
        return token;
    }


    /**
     * Sets the token value for this ReplyMessage.
     * 
     * @param token
     */
    public void setToken(com.cybersource.stub.Token token) {
        this.token = token;
    }


    /**
     * Gets the issuer value for this ReplyMessage.
     * 
     * @return issuer
     */
    public com.cybersource.stub.Issuer getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this ReplyMessage.
     * 
     * @param issuer
     */
    public void setIssuer(com.cybersource.stub.Issuer issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the recipient value for this ReplyMessage.
     * 
     * @return recipient
     */
    public com.cybersource.stub.Recipient getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this ReplyMessage.
     * 
     * @param recipient
     */
    public void setRecipient(com.cybersource.stub.Recipient recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the feeProgramIndicator value for this ReplyMessage.
     * 
     * @return feeProgramIndicator
     */
    public java.lang.String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }


    /**
     * Sets the feeProgramIndicator value for this ReplyMessage.
     * 
     * @param feeProgramIndicator
     */
    public void setFeeProgramIndicator(java.lang.String feeProgramIndicator) {
        this.feeProgramIndicator = feeProgramIndicator;
    }


    /**
     * Gets the installment value for this ReplyMessage.
     * 
     * @return installment
     */
    public com.cybersource.stub.Installment getInstallment() {
        return installment;
    }


    /**
     * Sets the installment value for this ReplyMessage.
     * 
     * @param installment
     */
    public void setInstallment(com.cybersource.stub.Installment installment) {
        this.installment = installment;
    }


    /**
     * Gets the paymentAccountReference value for this ReplyMessage.
     * 
     * @return paymentAccountReference
     */
    public java.lang.String getPaymentAccountReference() {
        return paymentAccountReference;
    }


    /**
     * Sets the paymentAccountReference value for this ReplyMessage.
     * 
     * @param paymentAccountReference
     */
    public void setPaymentAccountReference(java.lang.String paymentAccountReference) {
        this.paymentAccountReference = paymentAccountReference;
    }


    /**
     * Gets the authIndicator value for this ReplyMessage.
     * 
     * @return authIndicator
     */
    public java.lang.String getAuthIndicator() {
        return authIndicator;
    }


    /**
     * Sets the authIndicator value for this ReplyMessage.
     * 
     * @param authIndicator
     */
    public void setAuthIndicator(java.lang.String authIndicator) {
        this.authIndicator = authIndicator;
    }


    /**
     * Gets the ucaf value for this ReplyMessage.
     * 
     * @return ucaf
     */
    public com.cybersource.stub.UCAF getUcaf() {
        return ucaf;
    }


    /**
     * Sets the ucaf value for this ReplyMessage.
     * 
     * @param ucaf
     */
    public void setUcaf(com.cybersource.stub.UCAF ucaf) {
        this.ucaf = ucaf;
    }


    /**
     * Gets the invoiceHeader value for this ReplyMessage.
     * 
     * @return invoiceHeader
     */
    public com.cybersource.stub.InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }


    /**
     * Sets the invoiceHeader value for this ReplyMessage.
     * 
     * @param invoiceHeader
     */
    public void setInvoiceHeader(com.cybersource.stub.InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }


    /**
     * Gets the apOrderReply value for this ReplyMessage.
     * 
     * @return apOrderReply
     */
    public com.cybersource.stub.APOrderReply getApOrderReply() {
        return apOrderReply;
    }


    /**
     * Sets the apOrderReply value for this ReplyMessage.
     * 
     * @param apOrderReply
     */
    public void setApOrderReply(com.cybersource.stub.APOrderReply apOrderReply) {
        this.apOrderReply = apOrderReply;
    }


    /**
     * Gets the apCancelReply value for this ReplyMessage.
     * 
     * @return apCancelReply
     */
    public com.cybersource.stub.APCancelReply getApCancelReply() {
        return apCancelReply;
    }


    /**
     * Sets the apCancelReply value for this ReplyMessage.
     * 
     * @param apCancelReply
     */
    public void setApCancelReply(com.cybersource.stub.APCancelReply apCancelReply) {
        this.apCancelReply = apCancelReply;
    }


    /**
     * Gets the apBillingAgreementReply value for this ReplyMessage.
     * 
     * @return apBillingAgreementReply
     */
    public com.cybersource.stub.APBillingAgreementReply getApBillingAgreementReply() {
        return apBillingAgreementReply;
    }


    /**
     * Sets the apBillingAgreementReply value for this ReplyMessage.
     * 
     * @param apBillingAgreementReply
     */
    public void setApBillingAgreementReply(com.cybersource.stub.APBillingAgreementReply apBillingAgreementReply) {
        this.apBillingAgreementReply = apBillingAgreementReply;
    }


    /**
     * Gets the customerVerificationStatus value for this ReplyMessage.
     * 
     * @return customerVerificationStatus
     */
    public java.lang.String getCustomerVerificationStatus() {
        return customerVerificationStatus;
    }


    /**
     * Sets the customerVerificationStatus value for this ReplyMessage.
     * 
     * @param customerVerificationStatus
     */
    public void setCustomerVerificationStatus(java.lang.String customerVerificationStatus) {
        this.customerVerificationStatus = customerVerificationStatus;
    }


    /**
     * Gets the personalID value for this ReplyMessage.
     * 
     * @return personalID
     */
    public com.cybersource.stub.PersonalID getPersonalID() {
        return personalID;
    }


    /**
     * Sets the personalID value for this ReplyMessage.
     * 
     * @param personalID
     */
    public void setPersonalID(com.cybersource.stub.PersonalID personalID) {
        this.personalID = personalID;
    }


    /**
     * Gets the acquirerMerchantNumber value for this ReplyMessage.
     * 
     * @return acquirerMerchantNumber
     */
    public java.lang.String getAcquirerMerchantNumber() {
        return acquirerMerchantNumber;
    }


    /**
     * Sets the acquirerMerchantNumber value for this ReplyMessage.
     * 
     * @param acquirerMerchantNumber
     */
    public void setAcquirerMerchantNumber(java.lang.String acquirerMerchantNumber) {
        this.acquirerMerchantNumber = acquirerMerchantNumber;
    }


    /**
     * Gets the pos value for this ReplyMessage.
     * 
     * @return pos
     */
    public com.cybersource.stub.Pos getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this ReplyMessage.
     * 
     * @param pos
     */
    public void setPos(com.cybersource.stub.Pos pos) {
        this.pos = pos;
    }


    /**
     * Gets the issuerMessageAction value for this ReplyMessage.
     * 
     * @return issuerMessageAction
     */
    public java.lang.String getIssuerMessageAction() {
        return issuerMessageAction;
    }


    /**
     * Sets the issuerMessageAction value for this ReplyMessage.
     * 
     * @param issuerMessageAction
     */
    public void setIssuerMessageAction(java.lang.String issuerMessageAction) {
        this.issuerMessageAction = issuerMessageAction;
    }


    /**
     * Gets the reserved value for this ReplyMessage.
     * 
     * @return reserved
     */
    public com.cybersource.stub.ReplyReserved getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this ReplyMessage.
     * 
     * @param reserved
     */
    public void setReserved(com.cybersource.stub.ReplyReserved reserved) {
        this.reserved = reserved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplyMessage)) return false;
        ReplyMessage other = (ReplyMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantReferenceCode==null && other.getMerchantReferenceCode()==null) || 
             (this.merchantReferenceCode!=null &&
              this.merchantReferenceCode.equals(other.getMerchantReferenceCode()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.decision==null && other.getDecision()==null) || 
             (this.decision!=null &&
              this.decision.equals(other.getDecision()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.missingField==null && other.getMissingField()==null) || 
             (this.missingField!=null &&
              java.util.Arrays.equals(this.missingField, other.getMissingField()))) &&
            ((this.invalidField==null && other.getInvalidField()==null) || 
             (this.invalidField!=null &&
              java.util.Arrays.equals(this.invalidField, other.getInvalidField()))) &&
            ((this.requestToken==null && other.getRequestToken()==null) || 
             (this.requestToken!=null &&
              this.requestToken.equals(other.getRequestToken()))) &&
            ((this.purchaseTotals==null && other.getPurchaseTotals()==null) || 
             (this.purchaseTotals!=null &&
              this.purchaseTotals.equals(other.getPurchaseTotals()))) &&
            ((this.deniedPartiesMatch==null && other.getDeniedPartiesMatch()==null) || 
             (this.deniedPartiesMatch!=null &&
              java.util.Arrays.equals(this.deniedPartiesMatch, other.getDeniedPartiesMatch()))) &&
            ((this.ccAuthReply==null && other.getCcAuthReply()==null) || 
             (this.ccAuthReply!=null &&
              this.ccAuthReply.equals(other.getCcAuthReply()))) &&
            ((this.octReply==null && other.getOctReply()==null) || 
             (this.octReply!=null &&
              this.octReply.equals(other.getOctReply()))) &&
            ((this.verificationReply==null && other.getVerificationReply()==null) || 
             (this.verificationReply!=null &&
              this.verificationReply.equals(other.getVerificationReply()))) &&
            ((this.ccSaleReply==null && other.getCcSaleReply()==null) || 
             (this.ccSaleReply!=null &&
              this.ccSaleReply.equals(other.getCcSaleReply()))) &&
            ((this.ccSaleCreditReply==null && other.getCcSaleCreditReply()==null) || 
             (this.ccSaleCreditReply!=null &&
              this.ccSaleCreditReply.equals(other.getCcSaleCreditReply()))) &&
            ((this.ccSaleReversalReply==null && other.getCcSaleReversalReply()==null) || 
             (this.ccSaleReversalReply!=null &&
              this.ccSaleReversalReply.equals(other.getCcSaleReversalReply()))) &&
            ((this.ccIncrementalAuthReply==null && other.getCcIncrementalAuthReply()==null) || 
             (this.ccIncrementalAuthReply!=null &&
              this.ccIncrementalAuthReply.equals(other.getCcIncrementalAuthReply()))) &&
            ((this.serviceFeeCalculateReply==null && other.getServiceFeeCalculateReply()==null) || 
             (this.serviceFeeCalculateReply!=null &&
              this.serviceFeeCalculateReply.equals(other.getServiceFeeCalculateReply()))) &&
            ((this.ccCaptureReply==null && other.getCcCaptureReply()==null) || 
             (this.ccCaptureReply!=null &&
              this.ccCaptureReply.equals(other.getCcCaptureReply()))) &&
            ((this.ccCreditReply==null && other.getCcCreditReply()==null) || 
             (this.ccCreditReply!=null &&
              this.ccCreditReply.equals(other.getCcCreditReply()))) &&
            ((this.ccAuthReversalReply==null && other.getCcAuthReversalReply()==null) || 
             (this.ccAuthReversalReply!=null &&
              this.ccAuthReversalReply.equals(other.getCcAuthReversalReply()))) &&
            ((this.ccAutoAuthReversalReply==null && other.getCcAutoAuthReversalReply()==null) || 
             (this.ccAutoAuthReversalReply!=null &&
              this.ccAutoAuthReversalReply.equals(other.getCcAutoAuthReversalReply()))) &&
            ((this.ccDCCReply==null && other.getCcDCCReply()==null) || 
             (this.ccDCCReply!=null &&
              this.ccDCCReply.equals(other.getCcDCCReply()))) &&
            ((this.ccDCCUpdateReply==null && other.getCcDCCUpdateReply()==null) || 
             (this.ccDCCUpdateReply!=null &&
              this.ccDCCUpdateReply.equals(other.getCcDCCUpdateReply()))) &&
            ((this.ecDebitReply==null && other.getEcDebitReply()==null) || 
             (this.ecDebitReply!=null &&
              this.ecDebitReply.equals(other.getEcDebitReply()))) &&
            ((this.ecCreditReply==null && other.getEcCreditReply()==null) || 
             (this.ecCreditReply!=null &&
              this.ecCreditReply.equals(other.getEcCreditReply()))) &&
            ((this.ecAuthenticateReply==null && other.getEcAuthenticateReply()==null) || 
             (this.ecAuthenticateReply!=null &&
              this.ecAuthenticateReply.equals(other.getEcAuthenticateReply()))) &&
            ((this.payerAuthEnrollReply==null && other.getPayerAuthEnrollReply()==null) || 
             (this.payerAuthEnrollReply!=null &&
              this.payerAuthEnrollReply.equals(other.getPayerAuthEnrollReply()))) &&
            ((this.payerAuthValidateReply==null && other.getPayerAuthValidateReply()==null) || 
             (this.payerAuthValidateReply!=null &&
              this.payerAuthValidateReply.equals(other.getPayerAuthValidateReply()))) &&
            ((this.taxReply==null && other.getTaxReply()==null) || 
             (this.taxReply!=null &&
              this.taxReply.equals(other.getTaxReply()))) &&
            ((this.encryptedPayment==null && other.getEncryptedPayment()==null) || 
             (this.encryptedPayment!=null &&
              this.encryptedPayment.equals(other.getEncryptedPayment()))) &&
            ((this.encryptPaymentDataReply==null && other.getEncryptPaymentDataReply()==null) || 
             (this.encryptPaymentDataReply!=null &&
              this.encryptPaymentDataReply.equals(other.getEncryptPaymentDataReply()))) &&
            ((this.dmeReply==null && other.getDmeReply()==null) || 
             (this.dmeReply!=null &&
              this.dmeReply.equals(other.getDmeReply()))) &&
            ((this.afsReply==null && other.getAfsReply()==null) || 
             (this.afsReply!=null &&
              this.afsReply.equals(other.getAfsReply()))) &&
            ((this.davReply==null && other.getDavReply()==null) || 
             (this.davReply!=null &&
              this.davReply.equals(other.getDavReply()))) &&
            ((this.exportReply==null && other.getExportReply()==null) || 
             (this.exportReply!=null &&
              this.exportReply.equals(other.getExportReply()))) &&
            ((this.fxRatesReply==null && other.getFxRatesReply()==null) || 
             (this.fxRatesReply!=null &&
              this.fxRatesReply.equals(other.getFxRatesReply()))) &&
            ((this.bankTransferReply==null && other.getBankTransferReply()==null) || 
             (this.bankTransferReply!=null &&
              this.bankTransferReply.equals(other.getBankTransferReply()))) &&
            ((this.bankTransferRefundReply==null && other.getBankTransferRefundReply()==null) || 
             (this.bankTransferRefundReply!=null &&
              this.bankTransferRefundReply.equals(other.getBankTransferRefundReply()))) &&
            ((this.bankTransferRealTimeReply==null && other.getBankTransferRealTimeReply()==null) || 
             (this.bankTransferRealTimeReply!=null &&
              this.bankTransferRealTimeReply.equals(other.getBankTransferRealTimeReply()))) &&
            ((this.directDebitMandateReply==null && other.getDirectDebitMandateReply()==null) || 
             (this.directDebitMandateReply!=null &&
              this.directDebitMandateReply.equals(other.getDirectDebitMandateReply()))) &&
            ((this.directDebitReply==null && other.getDirectDebitReply()==null) || 
             (this.directDebitReply!=null &&
              this.directDebitReply.equals(other.getDirectDebitReply()))) &&
            ((this.directDebitValidateReply==null && other.getDirectDebitValidateReply()==null) || 
             (this.directDebitValidateReply!=null &&
              this.directDebitValidateReply.equals(other.getDirectDebitValidateReply()))) &&
            ((this.directDebitRefundReply==null && other.getDirectDebitRefundReply()==null) || 
             (this.directDebitRefundReply!=null &&
              this.directDebitRefundReply.equals(other.getDirectDebitRefundReply()))) &&
            ((this.paySubscriptionCreateReply==null && other.getPaySubscriptionCreateReply()==null) || 
             (this.paySubscriptionCreateReply!=null &&
              this.paySubscriptionCreateReply.equals(other.getPaySubscriptionCreateReply()))) &&
            ((this.paySubscriptionUpdateReply==null && other.getPaySubscriptionUpdateReply()==null) || 
             (this.paySubscriptionUpdateReply!=null &&
              this.paySubscriptionUpdateReply.equals(other.getPaySubscriptionUpdateReply()))) &&
            ((this.paySubscriptionEventUpdateReply==null && other.getPaySubscriptionEventUpdateReply()==null) || 
             (this.paySubscriptionEventUpdateReply!=null &&
              this.paySubscriptionEventUpdateReply.equals(other.getPaySubscriptionEventUpdateReply()))) &&
            ((this.paySubscriptionRetrieveReply==null && other.getPaySubscriptionRetrieveReply()==null) || 
             (this.paySubscriptionRetrieveReply!=null &&
              this.paySubscriptionRetrieveReply.equals(other.getPaySubscriptionRetrieveReply()))) &&
            ((this.paySubscriptionDeleteReply==null && other.getPaySubscriptionDeleteReply()==null) || 
             (this.paySubscriptionDeleteReply!=null &&
              this.paySubscriptionDeleteReply.equals(other.getPaySubscriptionDeleteReply()))) &&
            ((this.payPalPaymentReply==null && other.getPayPalPaymentReply()==null) || 
             (this.payPalPaymentReply!=null &&
              this.payPalPaymentReply.equals(other.getPayPalPaymentReply()))) &&
            ((this.payPalCreditReply==null && other.getPayPalCreditReply()==null) || 
             (this.payPalCreditReply!=null &&
              this.payPalCreditReply.equals(other.getPayPalCreditReply()))) &&
            ((this.voidReply==null && other.getVoidReply()==null) || 
             (this.voidReply!=null &&
              this.voidReply.equals(other.getVoidReply()))) &&
            ((this.pinlessDebitReply==null && other.getPinlessDebitReply()==null) || 
             (this.pinlessDebitReply!=null &&
              this.pinlessDebitReply.equals(other.getPinlessDebitReply()))) &&
            ((this.pinlessDebitValidateReply==null && other.getPinlessDebitValidateReply()==null) || 
             (this.pinlessDebitValidateReply!=null &&
              this.pinlessDebitValidateReply.equals(other.getPinlessDebitValidateReply()))) &&
            ((this.pinlessDebitReversalReply==null && other.getPinlessDebitReversalReply()==null) || 
             (this.pinlessDebitReversalReply!=null &&
              this.pinlessDebitReversalReply.equals(other.getPinlessDebitReversalReply()))) &&
            ((this.payPalButtonCreateReply==null && other.getPayPalButtonCreateReply()==null) || 
             (this.payPalButtonCreateReply!=null &&
              this.payPalButtonCreateReply.equals(other.getPayPalButtonCreateReply()))) &&
            ((this.payPalPreapprovedPaymentReply==null && other.getPayPalPreapprovedPaymentReply()==null) || 
             (this.payPalPreapprovedPaymentReply!=null &&
              this.payPalPreapprovedPaymentReply.equals(other.getPayPalPreapprovedPaymentReply()))) &&
            ((this.payPalPreapprovedUpdateReply==null && other.getPayPalPreapprovedUpdateReply()==null) || 
             (this.payPalPreapprovedUpdateReply!=null &&
              this.payPalPreapprovedUpdateReply.equals(other.getPayPalPreapprovedUpdateReply()))) &&
            ((this.riskUpdateReply==null && other.getRiskUpdateReply()==null) || 
             (this.riskUpdateReply!=null &&
              this.riskUpdateReply.equals(other.getRiskUpdateReply()))) &&
            ((this.fraudUpdateReply==null && other.getFraudUpdateReply()==null) || 
             (this.fraudUpdateReply!=null &&
              this.fraudUpdateReply.equals(other.getFraudUpdateReply()))) &&
            ((this.caseManagementActionReply==null && other.getCaseManagementActionReply()==null) || 
             (this.caseManagementActionReply!=null &&
              this.caseManagementActionReply.equals(other.getCaseManagementActionReply()))) &&
            ((this.decisionReply==null && other.getDecisionReply()==null) || 
             (this.decisionReply!=null &&
              this.decisionReply.equals(other.getDecisionReply()))) &&
            ((this.payPalRefundReply==null && other.getPayPalRefundReply()==null) || 
             (this.payPalRefundReply!=null &&
              this.payPalRefundReply.equals(other.getPayPalRefundReply()))) &&
            ((this.payPalAuthReversalReply==null && other.getPayPalAuthReversalReply()==null) || 
             (this.payPalAuthReversalReply!=null &&
              this.payPalAuthReversalReply.equals(other.getPayPalAuthReversalReply()))) &&
            ((this.payPalDoCaptureReply==null && other.getPayPalDoCaptureReply()==null) || 
             (this.payPalDoCaptureReply!=null &&
              this.payPalDoCaptureReply.equals(other.getPayPalDoCaptureReply()))) &&
            ((this.payPalEcDoPaymentReply==null && other.getPayPalEcDoPaymentReply()==null) || 
             (this.payPalEcDoPaymentReply!=null &&
              this.payPalEcDoPaymentReply.equals(other.getPayPalEcDoPaymentReply()))) &&
            ((this.payPalEcGetDetailsReply==null && other.getPayPalEcGetDetailsReply()==null) || 
             (this.payPalEcGetDetailsReply!=null &&
              this.payPalEcGetDetailsReply.equals(other.getPayPalEcGetDetailsReply()))) &&
            ((this.payPalEcSetReply==null && other.getPayPalEcSetReply()==null) || 
             (this.payPalEcSetReply!=null &&
              this.payPalEcSetReply.equals(other.getPayPalEcSetReply()))) &&
            ((this.payPalAuthorizationReply==null && other.getPayPalAuthorizationReply()==null) || 
             (this.payPalAuthorizationReply!=null &&
              this.payPalAuthorizationReply.equals(other.getPayPalAuthorizationReply()))) &&
            ((this.payPalEcOrderSetupReply==null && other.getPayPalEcOrderSetupReply()==null) || 
             (this.payPalEcOrderSetupReply!=null &&
              this.payPalEcOrderSetupReply.equals(other.getPayPalEcOrderSetupReply()))) &&
            ((this.payPalUpdateAgreementReply==null && other.getPayPalUpdateAgreementReply()==null) || 
             (this.payPalUpdateAgreementReply!=null &&
              this.payPalUpdateAgreementReply.equals(other.getPayPalUpdateAgreementReply()))) &&
            ((this.payPalCreateAgreementReply==null && other.getPayPalCreateAgreementReply()==null) || 
             (this.payPalCreateAgreementReply!=null &&
              this.payPalCreateAgreementReply.equals(other.getPayPalCreateAgreementReply()))) &&
            ((this.payPalDoRefTransactionReply==null && other.getPayPalDoRefTransactionReply()==null) || 
             (this.payPalDoRefTransactionReply!=null &&
              this.payPalDoRefTransactionReply.equals(other.getPayPalDoRefTransactionReply()))) &&
            ((this.chinaPaymentReply==null && other.getChinaPaymentReply()==null) || 
             (this.chinaPaymentReply!=null &&
              this.chinaPaymentReply.equals(other.getChinaPaymentReply()))) &&
            ((this.chinaRefundReply==null && other.getChinaRefundReply()==null) || 
             (this.chinaRefundReply!=null &&
              this.chinaRefundReply.equals(other.getChinaRefundReply()))) &&
            ((this.boletoPaymentReply==null && other.getBoletoPaymentReply()==null) || 
             (this.boletoPaymentReply!=null &&
              this.boletoPaymentReply.equals(other.getBoletoPaymentReply()))) &&
            ((this.pinDebitPurchaseReply==null && other.getPinDebitPurchaseReply()==null) || 
             (this.pinDebitPurchaseReply!=null &&
              this.pinDebitPurchaseReply.equals(other.getPinDebitPurchaseReply()))) &&
            ((this.pinDebitCreditReply==null && other.getPinDebitCreditReply()==null) || 
             (this.pinDebitCreditReply!=null &&
              this.pinDebitCreditReply.equals(other.getPinDebitCreditReply()))) &&
            ((this.pinDebitReversalReply==null && other.getPinDebitReversalReply()==null) || 
             (this.pinDebitReversalReply!=null &&
              this.pinDebitReversalReply.equals(other.getPinDebitReversalReply()))) &&
            ((this.apInitiateReply==null && other.getApInitiateReply()==null) || 
             (this.apInitiateReply!=null &&
              this.apInitiateReply.equals(other.getApInitiateReply()))) &&
            ((this.apCheckStatusReply==null && other.getApCheckStatusReply()==null) || 
             (this.apCheckStatusReply!=null &&
              this.apCheckStatusReply.equals(other.getApCheckStatusReply()))) &&
            ((this.receiptNumber==null && other.getReceiptNumber()==null) || 
             (this.receiptNumber!=null &&
              this.receiptNumber.equals(other.getReceiptNumber()))) &&
            ((this.additionalData==null && other.getAdditionalData()==null) || 
             (this.additionalData!=null &&
              this.additionalData.equals(other.getAdditionalData()))) &&
            ((this.solutionProviderTransactionID==null && other.getSolutionProviderTransactionID()==null) || 
             (this.solutionProviderTransactionID!=null &&
              this.solutionProviderTransactionID.equals(other.getSolutionProviderTransactionID()))) &&
            ((this.apReply==null && other.getApReply()==null) || 
             (this.apReply!=null &&
              this.apReply.equals(other.getApReply()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.billTo==null && other.getBillTo()==null) || 
             (this.billTo!=null &&
              this.billTo.equals(other.getBillTo()))) &&
            ((this.apAuthReply==null && other.getApAuthReply()==null) || 
             (this.apAuthReply!=null &&
              this.apAuthReply.equals(other.getApAuthReply()))) &&
            ((this.apSessionsReply==null && other.getApSessionsReply()==null) || 
             (this.apSessionsReply!=null &&
              this.apSessionsReply.equals(other.getApSessionsReply()))) &&
            ((this.apAuthReversalReply==null && other.getApAuthReversalReply()==null) || 
             (this.apAuthReversalReply!=null &&
              this.apAuthReversalReply.equals(other.getApAuthReversalReply()))) &&
            ((this.apCaptureReply==null && other.getApCaptureReply()==null) || 
             (this.apCaptureReply!=null &&
              this.apCaptureReply.equals(other.getApCaptureReply()))) &&
            ((this.apOptionsReply==null && other.getApOptionsReply()==null) || 
             (this.apOptionsReply!=null &&
              this.apOptionsReply.equals(other.getApOptionsReply()))) &&
            ((this.apRefundReply==null && other.getApRefundReply()==null) || 
             (this.apRefundReply!=null &&
              this.apRefundReply.equals(other.getApRefundReply()))) &&
            ((this.apSaleReply==null && other.getApSaleReply()==null) || 
             (this.apSaleReply!=null &&
              this.apSaleReply.equals(other.getApSaleReply()))) &&
            ((this.apCheckoutDetailsReply==null && other.getApCheckoutDetailsReply()==null) || 
             (this.apCheckoutDetailsReply!=null &&
              this.apCheckoutDetailsReply.equals(other.getApCheckoutDetailsReply()))) &&
            ((this.apTransactionDetailsReply==null && other.getApTransactionDetailsReply()==null) || 
             (this.apTransactionDetailsReply!=null &&
              this.apTransactionDetailsReply.equals(other.getApTransactionDetailsReply()))) &&
            ((this.apConfirmPurchaseReply==null && other.getApConfirmPurchaseReply()==null) || 
             (this.apConfirmPurchaseReply!=null &&
              this.apConfirmPurchaseReply.equals(other.getApConfirmPurchaseReply()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              this.promotion.equals(other.getPromotion()))) &&
            ((this.promotionGroup==null && other.getPromotionGroup()==null) || 
             (this.promotionGroup!=null &&
              java.util.Arrays.equals(this.promotionGroup, other.getPromotionGroup()))) &&
            ((this.payPalGetTxnDetailsReply==null && other.getPayPalGetTxnDetailsReply()==null) || 
             (this.payPalGetTxnDetailsReply!=null &&
              this.payPalGetTxnDetailsReply.equals(other.getPayPalGetTxnDetailsReply()))) &&
            ((this.payPalTransactionSearchReply==null && other.getPayPalTransactionSearchReply()==null) || 
             (this.payPalTransactionSearchReply!=null &&
              this.payPalTransactionSearchReply.equals(other.getPayPalTransactionSearchReply()))) &&
            ((this.emvReply==null && other.getEmvReply()==null) || 
             (this.emvReply!=null &&
              this.emvReply.equals(other.getEmvReply()))) &&
            ((this.originalTransaction==null && other.getOriginalTransaction()==null) || 
             (this.originalTransaction!=null &&
              this.originalTransaction.equals(other.getOriginalTransaction()))) &&
            ((this.hostedDataCreateReply==null && other.getHostedDataCreateReply()==null) || 
             (this.hostedDataCreateReply!=null &&
              this.hostedDataCreateReply.equals(other.getHostedDataCreateReply()))) &&
            ((this.hostedDataRetrieveReply==null && other.getHostedDataRetrieveReply()==null) || 
             (this.hostedDataRetrieveReply!=null &&
              this.hostedDataRetrieveReply.equals(other.getHostedDataRetrieveReply()))) &&
            ((this.salesSlipNumber==null && other.getSalesSlipNumber()==null) || 
             (this.salesSlipNumber!=null &&
              this.salesSlipNumber.equals(other.getSalesSlipNumber()))) &&
            ((this.additionalProcessorResponse==null && other.getAdditionalProcessorResponse()==null) || 
             (this.additionalProcessorResponse!=null &&
              this.additionalProcessorResponse.equals(other.getAdditionalProcessorResponse()))) &&
            ((this.jpo==null && other.getJpo()==null) || 
             (this.jpo!=null &&
              this.jpo.equals(other.getJpo()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.paymentNetworkToken==null && other.getPaymentNetworkToken()==null) || 
             (this.paymentNetworkToken!=null &&
              this.paymentNetworkToken.equals(other.getPaymentNetworkToken()))) &&
            ((this.vcReply==null && other.getVcReply()==null) || 
             (this.vcReply!=null &&
              this.vcReply.equals(other.getVcReply()))) &&
            ((this.decryptVisaCheckoutDataReply==null && other.getDecryptVisaCheckoutDataReply()==null) || 
             (this.decryptVisaCheckoutDataReply!=null &&
              this.decryptVisaCheckoutDataReply.equals(other.getDecryptVisaCheckoutDataReply()))) &&
            ((this.getVisaCheckoutDataReply==null && other.getGetVisaCheckoutDataReply()==null) || 
             (this.getVisaCheckoutDataReply!=null &&
              this.getVisaCheckoutDataReply.equals(other.getGetVisaCheckoutDataReply()))) &&
            ((this.binLookupReply==null && other.getBinLookupReply()==null) || 
             (this.binLookupReply!=null &&
              this.binLookupReply.equals(other.getBinLookupReply()))) &&
            ((this.issuerMessage==null && other.getIssuerMessage()==null) || 
             (this.issuerMessage!=null &&
              this.issuerMessage.equals(other.getIssuerMessage()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.feeProgramIndicator==null && other.getFeeProgramIndicator()==null) || 
             (this.feeProgramIndicator!=null &&
              this.feeProgramIndicator.equals(other.getFeeProgramIndicator()))) &&
            ((this.installment==null && other.getInstallment()==null) || 
             (this.installment!=null &&
              this.installment.equals(other.getInstallment()))) &&
            ((this.paymentAccountReference==null && other.getPaymentAccountReference()==null) || 
             (this.paymentAccountReference!=null &&
              this.paymentAccountReference.equals(other.getPaymentAccountReference()))) &&
            ((this.authIndicator==null && other.getAuthIndicator()==null) || 
             (this.authIndicator!=null &&
              this.authIndicator.equals(other.getAuthIndicator()))) &&
            ((this.ucaf==null && other.getUcaf()==null) || 
             (this.ucaf!=null &&
              this.ucaf.equals(other.getUcaf()))) &&
            ((this.invoiceHeader==null && other.getInvoiceHeader()==null) || 
             (this.invoiceHeader!=null &&
              this.invoiceHeader.equals(other.getInvoiceHeader()))) &&
            ((this.apOrderReply==null && other.getApOrderReply()==null) || 
             (this.apOrderReply!=null &&
              this.apOrderReply.equals(other.getApOrderReply()))) &&
            ((this.apCancelReply==null && other.getApCancelReply()==null) || 
             (this.apCancelReply!=null &&
              this.apCancelReply.equals(other.getApCancelReply()))) &&
            ((this.apBillingAgreementReply==null && other.getApBillingAgreementReply()==null) || 
             (this.apBillingAgreementReply!=null &&
              this.apBillingAgreementReply.equals(other.getApBillingAgreementReply()))) &&
            ((this.customerVerificationStatus==null && other.getCustomerVerificationStatus()==null) || 
             (this.customerVerificationStatus!=null &&
              this.customerVerificationStatus.equals(other.getCustomerVerificationStatus()))) &&
            ((this.personalID==null && other.getPersonalID()==null) || 
             (this.personalID!=null &&
              this.personalID.equals(other.getPersonalID()))) &&
            ((this.acquirerMerchantNumber==null && other.getAcquirerMerchantNumber()==null) || 
             (this.acquirerMerchantNumber!=null &&
              this.acquirerMerchantNumber.equals(other.getAcquirerMerchantNumber()))) &&
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos()))) &&
            ((this.issuerMessageAction==null && other.getIssuerMessageAction()==null) || 
             (this.issuerMessageAction!=null &&
              this.issuerMessageAction.equals(other.getIssuerMessageAction()))) &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved())));
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
        if (getMerchantReferenceCode() != null) {
            _hashCode += getMerchantReferenceCode().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getDecision() != null) {
            _hashCode += getDecision().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getMissingField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvalidField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestToken() != null) {
            _hashCode += getRequestToken().hashCode();
        }
        if (getPurchaseTotals() != null) {
            _hashCode += getPurchaseTotals().hashCode();
        }
        if (getDeniedPartiesMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeniedPartiesMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeniedPartiesMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcAuthReply() != null) {
            _hashCode += getCcAuthReply().hashCode();
        }
        if (getOctReply() != null) {
            _hashCode += getOctReply().hashCode();
        }
        if (getVerificationReply() != null) {
            _hashCode += getVerificationReply().hashCode();
        }
        if (getCcSaleReply() != null) {
            _hashCode += getCcSaleReply().hashCode();
        }
        if (getCcSaleCreditReply() != null) {
            _hashCode += getCcSaleCreditReply().hashCode();
        }
        if (getCcSaleReversalReply() != null) {
            _hashCode += getCcSaleReversalReply().hashCode();
        }
        if (getCcIncrementalAuthReply() != null) {
            _hashCode += getCcIncrementalAuthReply().hashCode();
        }
        if (getServiceFeeCalculateReply() != null) {
            _hashCode += getServiceFeeCalculateReply().hashCode();
        }
        if (getCcCaptureReply() != null) {
            _hashCode += getCcCaptureReply().hashCode();
        }
        if (getCcCreditReply() != null) {
            _hashCode += getCcCreditReply().hashCode();
        }
        if (getCcAuthReversalReply() != null) {
            _hashCode += getCcAuthReversalReply().hashCode();
        }
        if (getCcAutoAuthReversalReply() != null) {
            _hashCode += getCcAutoAuthReversalReply().hashCode();
        }
        if (getCcDCCReply() != null) {
            _hashCode += getCcDCCReply().hashCode();
        }
        if (getCcDCCUpdateReply() != null) {
            _hashCode += getCcDCCUpdateReply().hashCode();
        }
        if (getEcDebitReply() != null) {
            _hashCode += getEcDebitReply().hashCode();
        }
        if (getEcCreditReply() != null) {
            _hashCode += getEcCreditReply().hashCode();
        }
        if (getEcAuthenticateReply() != null) {
            _hashCode += getEcAuthenticateReply().hashCode();
        }
        if (getPayerAuthEnrollReply() != null) {
            _hashCode += getPayerAuthEnrollReply().hashCode();
        }
        if (getPayerAuthValidateReply() != null) {
            _hashCode += getPayerAuthValidateReply().hashCode();
        }
        if (getTaxReply() != null) {
            _hashCode += getTaxReply().hashCode();
        }
        if (getEncryptedPayment() != null) {
            _hashCode += getEncryptedPayment().hashCode();
        }
        if (getEncryptPaymentDataReply() != null) {
            _hashCode += getEncryptPaymentDataReply().hashCode();
        }
        if (getDmeReply() != null) {
            _hashCode += getDmeReply().hashCode();
        }
        if (getAfsReply() != null) {
            _hashCode += getAfsReply().hashCode();
        }
        if (getDavReply() != null) {
            _hashCode += getDavReply().hashCode();
        }
        if (getExportReply() != null) {
            _hashCode += getExportReply().hashCode();
        }
        if (getFxRatesReply() != null) {
            _hashCode += getFxRatesReply().hashCode();
        }
        if (getBankTransferReply() != null) {
            _hashCode += getBankTransferReply().hashCode();
        }
        if (getBankTransferRefundReply() != null) {
            _hashCode += getBankTransferRefundReply().hashCode();
        }
        if (getBankTransferRealTimeReply() != null) {
            _hashCode += getBankTransferRealTimeReply().hashCode();
        }
        if (getDirectDebitMandateReply() != null) {
            _hashCode += getDirectDebitMandateReply().hashCode();
        }
        if (getDirectDebitReply() != null) {
            _hashCode += getDirectDebitReply().hashCode();
        }
        if (getDirectDebitValidateReply() != null) {
            _hashCode += getDirectDebitValidateReply().hashCode();
        }
        if (getDirectDebitRefundReply() != null) {
            _hashCode += getDirectDebitRefundReply().hashCode();
        }
        if (getPaySubscriptionCreateReply() != null) {
            _hashCode += getPaySubscriptionCreateReply().hashCode();
        }
        if (getPaySubscriptionUpdateReply() != null) {
            _hashCode += getPaySubscriptionUpdateReply().hashCode();
        }
        if (getPaySubscriptionEventUpdateReply() != null) {
            _hashCode += getPaySubscriptionEventUpdateReply().hashCode();
        }
        if (getPaySubscriptionRetrieveReply() != null) {
            _hashCode += getPaySubscriptionRetrieveReply().hashCode();
        }
        if (getPaySubscriptionDeleteReply() != null) {
            _hashCode += getPaySubscriptionDeleteReply().hashCode();
        }
        if (getPayPalPaymentReply() != null) {
            _hashCode += getPayPalPaymentReply().hashCode();
        }
        if (getPayPalCreditReply() != null) {
            _hashCode += getPayPalCreditReply().hashCode();
        }
        if (getVoidReply() != null) {
            _hashCode += getVoidReply().hashCode();
        }
        if (getPinlessDebitReply() != null) {
            _hashCode += getPinlessDebitReply().hashCode();
        }
        if (getPinlessDebitValidateReply() != null) {
            _hashCode += getPinlessDebitValidateReply().hashCode();
        }
        if (getPinlessDebitReversalReply() != null) {
            _hashCode += getPinlessDebitReversalReply().hashCode();
        }
        if (getPayPalButtonCreateReply() != null) {
            _hashCode += getPayPalButtonCreateReply().hashCode();
        }
        if (getPayPalPreapprovedPaymentReply() != null) {
            _hashCode += getPayPalPreapprovedPaymentReply().hashCode();
        }
        if (getPayPalPreapprovedUpdateReply() != null) {
            _hashCode += getPayPalPreapprovedUpdateReply().hashCode();
        }
        if (getRiskUpdateReply() != null) {
            _hashCode += getRiskUpdateReply().hashCode();
        }
        if (getFraudUpdateReply() != null) {
            _hashCode += getFraudUpdateReply().hashCode();
        }
        if (getCaseManagementActionReply() != null) {
            _hashCode += getCaseManagementActionReply().hashCode();
        }
        if (getDecisionReply() != null) {
            _hashCode += getDecisionReply().hashCode();
        }
        if (getPayPalRefundReply() != null) {
            _hashCode += getPayPalRefundReply().hashCode();
        }
        if (getPayPalAuthReversalReply() != null) {
            _hashCode += getPayPalAuthReversalReply().hashCode();
        }
        if (getPayPalDoCaptureReply() != null) {
            _hashCode += getPayPalDoCaptureReply().hashCode();
        }
        if (getPayPalEcDoPaymentReply() != null) {
            _hashCode += getPayPalEcDoPaymentReply().hashCode();
        }
        if (getPayPalEcGetDetailsReply() != null) {
            _hashCode += getPayPalEcGetDetailsReply().hashCode();
        }
        if (getPayPalEcSetReply() != null) {
            _hashCode += getPayPalEcSetReply().hashCode();
        }
        if (getPayPalAuthorizationReply() != null) {
            _hashCode += getPayPalAuthorizationReply().hashCode();
        }
        if (getPayPalEcOrderSetupReply() != null) {
            _hashCode += getPayPalEcOrderSetupReply().hashCode();
        }
        if (getPayPalUpdateAgreementReply() != null) {
            _hashCode += getPayPalUpdateAgreementReply().hashCode();
        }
        if (getPayPalCreateAgreementReply() != null) {
            _hashCode += getPayPalCreateAgreementReply().hashCode();
        }
        if (getPayPalDoRefTransactionReply() != null) {
            _hashCode += getPayPalDoRefTransactionReply().hashCode();
        }
        if (getChinaPaymentReply() != null) {
            _hashCode += getChinaPaymentReply().hashCode();
        }
        if (getChinaRefundReply() != null) {
            _hashCode += getChinaRefundReply().hashCode();
        }
        if (getBoletoPaymentReply() != null) {
            _hashCode += getBoletoPaymentReply().hashCode();
        }
        if (getPinDebitPurchaseReply() != null) {
            _hashCode += getPinDebitPurchaseReply().hashCode();
        }
        if (getPinDebitCreditReply() != null) {
            _hashCode += getPinDebitCreditReply().hashCode();
        }
        if (getPinDebitReversalReply() != null) {
            _hashCode += getPinDebitReversalReply().hashCode();
        }
        if (getApInitiateReply() != null) {
            _hashCode += getApInitiateReply().hashCode();
        }
        if (getApCheckStatusReply() != null) {
            _hashCode += getApCheckStatusReply().hashCode();
        }
        if (getReceiptNumber() != null) {
            _hashCode += getReceiptNumber().hashCode();
        }
        if (getAdditionalData() != null) {
            _hashCode += getAdditionalData().hashCode();
        }
        if (getSolutionProviderTransactionID() != null) {
            _hashCode += getSolutionProviderTransactionID().hashCode();
        }
        if (getApReply() != null) {
            _hashCode += getApReply().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getBillTo() != null) {
            _hashCode += getBillTo().hashCode();
        }
        if (getApAuthReply() != null) {
            _hashCode += getApAuthReply().hashCode();
        }
        if (getApSessionsReply() != null) {
            _hashCode += getApSessionsReply().hashCode();
        }
        if (getApAuthReversalReply() != null) {
            _hashCode += getApAuthReversalReply().hashCode();
        }
        if (getApCaptureReply() != null) {
            _hashCode += getApCaptureReply().hashCode();
        }
        if (getApOptionsReply() != null) {
            _hashCode += getApOptionsReply().hashCode();
        }
        if (getApRefundReply() != null) {
            _hashCode += getApRefundReply().hashCode();
        }
        if (getApSaleReply() != null) {
            _hashCode += getApSaleReply().hashCode();
        }
        if (getApCheckoutDetailsReply() != null) {
            _hashCode += getApCheckoutDetailsReply().hashCode();
        }
        if (getApTransactionDetailsReply() != null) {
            _hashCode += getApTransactionDetailsReply().hashCode();
        }
        if (getApConfirmPurchaseReply() != null) {
            _hashCode += getApConfirmPurchaseReply().hashCode();
        }
        if (getPromotion() != null) {
            _hashCode += getPromotion().hashCode();
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
        if (getPayPalGetTxnDetailsReply() != null) {
            _hashCode += getPayPalGetTxnDetailsReply().hashCode();
        }
        if (getPayPalTransactionSearchReply() != null) {
            _hashCode += getPayPalTransactionSearchReply().hashCode();
        }
        if (getEmvReply() != null) {
            _hashCode += getEmvReply().hashCode();
        }
        if (getOriginalTransaction() != null) {
            _hashCode += getOriginalTransaction().hashCode();
        }
        if (getHostedDataCreateReply() != null) {
            _hashCode += getHostedDataCreateReply().hashCode();
        }
        if (getHostedDataRetrieveReply() != null) {
            _hashCode += getHostedDataRetrieveReply().hashCode();
        }
        if (getSalesSlipNumber() != null) {
            _hashCode += getSalesSlipNumber().hashCode();
        }
        if (getAdditionalProcessorResponse() != null) {
            _hashCode += getAdditionalProcessorResponse().hashCode();
        }
        if (getJpo() != null) {
            _hashCode += getJpo().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getPaymentNetworkToken() != null) {
            _hashCode += getPaymentNetworkToken().hashCode();
        }
        if (getVcReply() != null) {
            _hashCode += getVcReply().hashCode();
        }
        if (getDecryptVisaCheckoutDataReply() != null) {
            _hashCode += getDecryptVisaCheckoutDataReply().hashCode();
        }
        if (getGetVisaCheckoutDataReply() != null) {
            _hashCode += getGetVisaCheckoutDataReply().hashCode();
        }
        if (getBinLookupReply() != null) {
            _hashCode += getBinLookupReply().hashCode();
        }
        if (getIssuerMessage() != null) {
            _hashCode += getIssuerMessage().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getFeeProgramIndicator() != null) {
            _hashCode += getFeeProgramIndicator().hashCode();
        }
        if (getInstallment() != null) {
            _hashCode += getInstallment().hashCode();
        }
        if (getPaymentAccountReference() != null) {
            _hashCode += getPaymentAccountReference().hashCode();
        }
        if (getAuthIndicator() != null) {
            _hashCode += getAuthIndicator().hashCode();
        }
        if (getUcaf() != null) {
            _hashCode += getUcaf().hashCode();
        }
        if (getInvoiceHeader() != null) {
            _hashCode += getInvoiceHeader().hashCode();
        }
        if (getApOrderReply() != null) {
            _hashCode += getApOrderReply().hashCode();
        }
        if (getApCancelReply() != null) {
            _hashCode += getApCancelReply().hashCode();
        }
        if (getApBillingAgreementReply() != null) {
            _hashCode += getApBillingAgreementReply().hashCode();
        }
        if (getCustomerVerificationStatus() != null) {
            _hashCode += getCustomerVerificationStatus().hashCode();
        }
        if (getPersonalID() != null) {
            _hashCode += getPersonalID().hashCode();
        }
        if (getAcquirerMerchantNumber() != null) {
            _hashCode += getAcquirerMerchantNumber().hashCode();
        }
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        if (getIssuerMessageAction() != null) {
            _hashCode += getIssuerMessageAction().hashCode();
        }
        if (getReserved() != null) {
            _hashCode += getReserved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplyMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ReplyMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "merchantReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "missingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invalidField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("deniedPartiesMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "deniedPartiesMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DeniedPartiesMatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAuthReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAuthReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("octReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "octReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OCTReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "verificationReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VerificationReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleCreditReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleCreditReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleCreditReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSaleReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccSaleReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccIncrementalAuthReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccIncrementalAuthReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCIncrementalAuthReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeeCalculateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "serviceFeeCalculateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFeeCalculateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCaptureReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccCaptureReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCaptureReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCreditReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccCreditReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCreditReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAuthReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAuthReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAutoAuthReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccAutoAuthReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAutoAuthReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDCCReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccDCCReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDCCUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ccDCCUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecDebitReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecDebitReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECDebitReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecCreditReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecCreditReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECCreditReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecAuthenticateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ecAuthenticateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECAuthenticateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerAuthEnrollReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerAuthEnrollReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthEnrollReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerAuthValidateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payerAuthValidateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthValidateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "taxReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReply"));
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
        elemField.setFieldName("encryptPaymentDataReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "encryptPaymentDataReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptPaymentDataReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmeReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dmeReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DMEReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "afsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AFSReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("davReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "davReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DAVReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "exportReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ExportReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxRatesReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fxRatesReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FXRatesReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferRefundReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferRefundReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRefundReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTransferRealTimeReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bankTransferRealTimeReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRealTimeReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitMandateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitMandateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitMandateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitValidateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitValidateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitValidateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitRefundReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "directDebitRefundReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitRefundReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionCreateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionCreateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionCreateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionEventUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionEventUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionEventUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionRetrieveReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionRetrieveReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionRetrieveReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySubscriptionDeleteReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paySubscriptionDeleteReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionDeleteReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPaymentReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPaymentReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPaymentReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalCreditReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalCreditReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreditReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "voidReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VoidReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitValidateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitValidateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitValidateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinlessDebitReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinlessDebitReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalButtonCreateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalButtonCreateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalButtonCreateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPreapprovedPaymentReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPreapprovedPaymentReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedPaymentReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPreapprovedUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalPreapprovedUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "riskUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RiskUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudUpdateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fraudUpdateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FraudUpdateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseManagementActionReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "caseManagementActionReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CaseManagementActionReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decisionReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalRefundReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalRefundReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalRefundReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalAuthReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalDoCaptureReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalDoCaptureReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoCaptureReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcDoPaymentReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcDoPaymentReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcDoPaymentReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcGetDetailsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcGetDetailsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcGetDetailsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcSetReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcSetReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcSetReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthorizationReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalAuthorizationReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthorizationReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEcOrderSetupReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalEcOrderSetupReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcOrderSetupReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalUpdateAgreementReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalUpdateAgreementReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalUpdateAgreementReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalCreateAgreementReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalCreateAgreementReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreateAgreementReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalDoRefTransactionReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalDoRefTransactionReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoRefTransactionReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chinaPaymentReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chinaPaymentReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaPaymentReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chinaRefundReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chinaRefundReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaRefundReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boletoPaymentReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boletoPaymentReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BoletoPaymentReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitPurchaseReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitPurchaseReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitPurchaseReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitCreditReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitCreditReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitCreditReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pinDebitReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apInitiateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apInitiateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APInitiateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCheckStatusReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCheckStatusReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckStatusReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "receiptNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalData"));
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
        elemField.setFieldName("apReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APReply"));
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
        elemField.setFieldName("billTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BillTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apAuthReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apAuthReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apSessionsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apSessionsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSessionsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apAuthReversalReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apAuthReversalReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReversalReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCaptureReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCaptureReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCaptureReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apOptionsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apOptionsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOptionsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apRefundReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apRefundReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APRefundReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apSaleReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apSaleReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSaleReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCheckoutDetailsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCheckoutDetailsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckOutDetailsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apTransactionDetailsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apTransactionDetailsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APTransactionDetailsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apConfirmPurchaseReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apConfirmPurchaseReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APConfirmPurchaseReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Promotion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "promotionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PromotionGroupReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalGetTxnDetailsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalGetTxnDetailsReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalGetTxnDetailsReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTransactionSearchReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "payPalTransactionSearchReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalTransactionSearchReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "emvReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "originalTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OriginalTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedDataCreateReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "hostedDataCreateReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataCreateReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedDataRetrieveReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "hostedDataRetrieveReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataRetrieveReply"));
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
        elemField.setFieldName("additionalProcessorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "additionalProcessorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Card"));
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
        elemField.setFieldName("vcReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "vcReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decryptVisaCheckoutDataReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "decryptVisaCheckoutDataReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecryptVisaCheckoutDataReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVisaCheckoutDataReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "getVisaCheckoutDataReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GetVisaCheckoutDataReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binLookupReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "binLookupReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BinLookupReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuerMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Token"));
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
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Recipient"));
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
        elemField.setFieldName("installment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "installment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Installment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAccountReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "paymentAccountReference"));
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
        elemField.setFieldName("ucaf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ucaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "UCAF"));
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
        elemField.setFieldName("apOrderReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apOrderReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOrderReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCancelReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apCancelReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCancelReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apBillingAgreementReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "apBillingAgreementReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APBillingAgreementReply"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerVerificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerVerificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("acquirerMerchantNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "acquirerMerchantNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("issuerMessageAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuerMessageAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ReplyReserved"));
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
