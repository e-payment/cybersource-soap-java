
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cybersource.schemas.transaction_data_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestMessage_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestMessage");
    private final static QName _ReplyMessage_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.141", "replyMessage");
    private final static QName _NvpRequest_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.141", "nvpRequest");
    private final static QName _NvpReply_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.141", "nvpReply");
    private final static QName _FaultDetails_QNAME = new QName("urn:schemas-cybersource-com:transaction-data-1.141", "faultDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cybersource.schemas.transaction_data_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestMessage }
     * 
     */
    public RequestMessage createRequestMessage() {
        return new RequestMessage();
    }

    /**
     * Create an instance of {@link ReplyMessage }
     * 
     */
    public ReplyMessage createReplyMessage() {
        return new ReplyMessage();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link CCAuthService }
     * 
     */
    public CCAuthService createCCAuthService() {
        return new CCAuthService();
    }

    /**
     * Create an instance of {@link OCTService }
     * 
     */
    public OCTService createOCTService() {
        return new OCTService();
    }

    /**
     * Create an instance of {@link VerificationService }
     * 
     */
    public VerificationService createVerificationService() {
        return new VerificationService();
    }

    /**
     * Create an instance of {@link CCSaleService }
     * 
     */
    public CCSaleService createCCSaleService() {
        return new CCSaleService();
    }

    /**
     * Create an instance of {@link CCSaleCreditService }
     * 
     */
    public CCSaleCreditService createCCSaleCreditService() {
        return new CCSaleCreditService();
    }

    /**
     * Create an instance of {@link CCSaleReversalService }
     * 
     */
    public CCSaleReversalService createCCSaleReversalService() {
        return new CCSaleReversalService();
    }

    /**
     * Create an instance of {@link CCIncrementalAuthService }
     * 
     */
    public CCIncrementalAuthService createCCIncrementalAuthService() {
        return new CCIncrementalAuthService();
    }

    /**
     * Create an instance of {@link CCCaptureService }
     * 
     */
    public CCCaptureService createCCCaptureService() {
        return new CCCaptureService();
    }

    /**
     * Create an instance of {@link CCCreditService }
     * 
     */
    public CCCreditService createCCCreditService() {
        return new CCCreditService();
    }

    /**
     * Create an instance of {@link CCAuthReversalService }
     * 
     */
    public CCAuthReversalService createCCAuthReversalService() {
        return new CCAuthReversalService();
    }

    /**
     * Create an instance of {@link CCAutoAuthReversalService }
     * 
     */
    public CCAutoAuthReversalService createCCAutoAuthReversalService() {
        return new CCAutoAuthReversalService();
    }

    /**
     * Create an instance of {@link CCDCCService }
     * 
     */
    public CCDCCService createCCDCCService() {
        return new CCDCCService();
    }

    /**
     * Create an instance of {@link ServiceFeeCalculateService }
     * 
     */
    public ServiceFeeCalculateService createServiceFeeCalculateService() {
        return new ServiceFeeCalculateService();
    }

    /**
     * Create an instance of {@link ECDebitService }
     * 
     */
    public ECDebitService createECDebitService() {
        return new ECDebitService();
    }

    /**
     * Create an instance of {@link ECCreditService }
     * 
     */
    public ECCreditService createECCreditService() {
        return new ECCreditService();
    }

    /**
     * Create an instance of {@link ECAuthenticateService }
     * 
     */
    public ECAuthenticateService createECAuthenticateService() {
        return new ECAuthenticateService();
    }

    /**
     * Create an instance of {@link PayerAuthEnrollService }
     * 
     */
    public PayerAuthEnrollService createPayerAuthEnrollService() {
        return new PayerAuthEnrollService();
    }

    /**
     * Create an instance of {@link PayerAuthValidateService }
     * 
     */
    public PayerAuthValidateService createPayerAuthValidateService() {
        return new PayerAuthValidateService();
    }

    /**
     * Create an instance of {@link TaxService }
     * 
     */
    public TaxService createTaxService() {
        return new TaxService();
    }

    /**
     * Create an instance of {@link DMEService }
     * 
     */
    public DMEService createDMEService() {
        return new DMEService();
    }

    /**
     * Create an instance of {@link AFSService }
     * 
     */
    public AFSService createAFSService() {
        return new AFSService();
    }

    /**
     * Create an instance of {@link DAVService }
     * 
     */
    public DAVService createDAVService() {
        return new DAVService();
    }

    /**
     * Create an instance of {@link ExportService }
     * 
     */
    public ExportService createExportService() {
        return new ExportService();
    }

    /**
     * Create an instance of {@link FXRatesService }
     * 
     */
    public FXRatesService createFXRatesService() {
        return new FXRatesService();
    }

    /**
     * Create an instance of {@link BankTransferService }
     * 
     */
    public BankTransferService createBankTransferService() {
        return new BankTransferService();
    }

    /**
     * Create an instance of {@link BankTransferRefundService }
     * 
     */
    public BankTransferRefundService createBankTransferRefundService() {
        return new BankTransferRefundService();
    }

    /**
     * Create an instance of {@link BankTransferRealTimeService }
     * 
     */
    public BankTransferRealTimeService createBankTransferRealTimeService() {
        return new BankTransferRealTimeService();
    }

    /**
     * Create an instance of {@link DirectDebitMandateService }
     * 
     */
    public DirectDebitMandateService createDirectDebitMandateService() {
        return new DirectDebitMandateService();
    }

    /**
     * Create an instance of {@link DirectDebitService }
     * 
     */
    public DirectDebitService createDirectDebitService() {
        return new DirectDebitService();
    }

    /**
     * Create an instance of {@link DirectDebitRefundService }
     * 
     */
    public DirectDebitRefundService createDirectDebitRefundService() {
        return new DirectDebitRefundService();
    }

    /**
     * Create an instance of {@link DirectDebitValidateService }
     * 
     */
    public DirectDebitValidateService createDirectDebitValidateService() {
        return new DirectDebitValidateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionCreateService }
     * 
     */
    public PaySubscriptionCreateService createPaySubscriptionCreateService() {
        return new PaySubscriptionCreateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionUpdateService }
     * 
     */
    public PaySubscriptionUpdateService createPaySubscriptionUpdateService() {
        return new PaySubscriptionUpdateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionEventUpdateService }
     * 
     */
    public PaySubscriptionEventUpdateService createPaySubscriptionEventUpdateService() {
        return new PaySubscriptionEventUpdateService();
    }

    /**
     * Create an instance of {@link PaySubscriptionRetrieveService }
     * 
     */
    public PaySubscriptionRetrieveService createPaySubscriptionRetrieveService() {
        return new PaySubscriptionRetrieveService();
    }

    /**
     * Create an instance of {@link PaySubscriptionDeleteService }
     * 
     */
    public PaySubscriptionDeleteService createPaySubscriptionDeleteService() {
        return new PaySubscriptionDeleteService();
    }

    /**
     * Create an instance of {@link PayPalPaymentService }
     * 
     */
    public PayPalPaymentService createPayPalPaymentService() {
        return new PayPalPaymentService();
    }

    /**
     * Create an instance of {@link PayPalCreditService }
     * 
     */
    public PayPalCreditService createPayPalCreditService() {
        return new PayPalCreditService();
    }

    /**
     * Create an instance of {@link PayPalEcSetService }
     * 
     */
    public PayPalEcSetService createPayPalEcSetService() {
        return new PayPalEcSetService();
    }

    /**
     * Create an instance of {@link PayPalEcGetDetailsService }
     * 
     */
    public PayPalEcGetDetailsService createPayPalEcGetDetailsService() {
        return new PayPalEcGetDetailsService();
    }

    /**
     * Create an instance of {@link PayPalEcDoPaymentService }
     * 
     */
    public PayPalEcDoPaymentService createPayPalEcDoPaymentService() {
        return new PayPalEcDoPaymentService();
    }

    /**
     * Create an instance of {@link PayPalDoCaptureService }
     * 
     */
    public PayPalDoCaptureService createPayPalDoCaptureService() {
        return new PayPalDoCaptureService();
    }

    /**
     * Create an instance of {@link PayPalAuthReversalService }
     * 
     */
    public PayPalAuthReversalService createPayPalAuthReversalService() {
        return new PayPalAuthReversalService();
    }

    /**
     * Create an instance of {@link PayPalRefundService }
     * 
     */
    public PayPalRefundService createPayPalRefundService() {
        return new PayPalRefundService();
    }

    /**
     * Create an instance of {@link PayPalEcOrderSetupService }
     * 
     */
    public PayPalEcOrderSetupService createPayPalEcOrderSetupService() {
        return new PayPalEcOrderSetupService();
    }

    /**
     * Create an instance of {@link PayPalAuthorizationService }
     * 
     */
    public PayPalAuthorizationService createPayPalAuthorizationService() {
        return new PayPalAuthorizationService();
    }

    /**
     * Create an instance of {@link PayPalUpdateAgreementService }
     * 
     */
    public PayPalUpdateAgreementService createPayPalUpdateAgreementService() {
        return new PayPalUpdateAgreementService();
    }

    /**
     * Create an instance of {@link PayPalCreateAgreementService }
     * 
     */
    public PayPalCreateAgreementService createPayPalCreateAgreementService() {
        return new PayPalCreateAgreementService();
    }

    /**
     * Create an instance of {@link PayPalDoRefTransactionService }
     * 
     */
    public PayPalDoRefTransactionService createPayPalDoRefTransactionService() {
        return new PayPalDoRefTransactionService();
    }

    /**
     * Create an instance of {@link VoidService }
     * 
     */
    public VoidService createVoidService() {
        return new VoidService();
    }

    /**
     * Create an instance of {@link PinlessDebitService }
     * 
     */
    public PinlessDebitService createPinlessDebitService() {
        return new PinlessDebitService();
    }

    /**
     * Create an instance of {@link PinlessDebitValidateService }
     * 
     */
    public PinlessDebitValidateService createPinlessDebitValidateService() {
        return new PinlessDebitValidateService();
    }

    /**
     * Create an instance of {@link PinlessDebitReversalService }
     * 
     */
    public PinlessDebitReversalService createPinlessDebitReversalService() {
        return new PinlessDebitReversalService();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseService }
     * 
     */
    public PinDebitPurchaseService createPinDebitPurchaseService() {
        return new PinDebitPurchaseService();
    }

    /**
     * Create an instance of {@link PinDebitCreditService }
     * 
     */
    public PinDebitCreditService createPinDebitCreditService() {
        return new PinDebitCreditService();
    }

    /**
     * Create an instance of {@link PinDebitReversalService }
     * 
     */
    public PinDebitReversalService createPinDebitReversalService() {
        return new PinDebitReversalService();
    }

    /**
     * Create an instance of {@link PayPalButtonCreateService }
     * 
     */
    public PayPalButtonCreateService createPayPalButtonCreateService() {
        return new PayPalButtonCreateService();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedPaymentService }
     * 
     */
    public PayPalPreapprovedPaymentService createPayPalPreapprovedPaymentService() {
        return new PayPalPreapprovedPaymentService();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedUpdateService }
     * 
     */
    public PayPalPreapprovedUpdateService createPayPalPreapprovedUpdateService() {
        return new PayPalPreapprovedUpdateService();
    }

    /**
     * Create an instance of {@link ChinaPaymentService }
     * 
     */
    public ChinaPaymentService createChinaPaymentService() {
        return new ChinaPaymentService();
    }

    /**
     * Create an instance of {@link ChinaRefundService }
     * 
     */
    public ChinaRefundService createChinaRefundService() {
        return new ChinaRefundService();
    }

    /**
     * Create an instance of {@link BoletoPaymentService }
     * 
     */
    public BoletoPaymentService createBoletoPaymentService() {
        return new BoletoPaymentService();
    }

    /**
     * Create an instance of {@link PersonalID }
     * 
     */
    public PersonalID createPersonalID() {
        return new PersonalID();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link APInitiateService }
     * 
     */
    public APInitiateService createAPInitiateService() {
        return new APInitiateService();
    }

    /**
     * Create an instance of {@link APCheckStatusService }
     * 
     */
    public APCheckStatusService createAPCheckStatusService() {
        return new APCheckStatusService();
    }

    /**
     * Create an instance of {@link RiskUpdateService }
     * 
     */
    public RiskUpdateService createRiskUpdateService() {
        return new RiskUpdateService();
    }

    /**
     * Create an instance of {@link FraudUpdateService }
     * 
     */
    public FraudUpdateService createFraudUpdateService() {
        return new FraudUpdateService();
    }

    /**
     * Create an instance of {@link CaseManagementActionService }
     * 
     */
    public CaseManagementActionService createCaseManagementActionService() {
        return new CaseManagementActionService();
    }

    /**
     * Create an instance of {@link EncryptPaymentDataService }
     * 
     */
    public EncryptPaymentDataService createEncryptPaymentDataService() {
        return new EncryptPaymentDataService();
    }

    /**
     * Create an instance of {@link InvoiceHeader }
     * 
     */
    public InvoiceHeader createInvoiceHeader() {
        return new InvoiceHeader();
    }

    /**
     * Create an instance of {@link BusinessRules }
     * 
     */
    public BusinessRules createBusinessRules() {
        return new BusinessRules();
    }

    /**
     * Create an instance of {@link BillTo }
     * 
     */
    public BillTo createBillTo() {
        return new BillTo();
    }

    /**
     * Create an instance of {@link ShipTo }
     * 
     */
    public ShipTo createShipTo() {
        return new ShipTo();
    }

    /**
     * Create an instance of {@link ShipFrom }
     * 
     */
    public ShipFrom createShipFrom() {
        return new ShipFrom();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link BML }
     * 
     */
    public BML createBML() {
        return new BML();
    }

    /**
     * Create an instance of {@link OtherTax }
     * 
     */
    public OtherTax createOtherTax() {
        return new OtherTax();
    }

    /**
     * Create an instance of {@link Aft }
     * 
     */
    public Aft createAft() {
        return new Aft();
    }

    /**
     * Create an instance of {@link Wallet }
     * 
     */
    public Wallet createWallet() {
        return new Wallet();
    }

    /**
     * Create an instance of {@link PurchaseTotals }
     * 
     */
    public PurchaseTotals createPurchaseTotals() {
        return new PurchaseTotals();
    }

    /**
     * Create an instance of {@link FundingTotals }
     * 
     */
    public FundingTotals createFundingTotals() {
        return new FundingTotals();
    }

    /**
     * Create an instance of {@link GECC }
     * 
     */
    public GECC createGECC() {
        return new GECC();
    }

    /**
     * Create an instance of {@link UCAF }
     * 
     */
    public UCAF createUCAF() {
        return new UCAF();
    }

    /**
     * Create an instance of {@link FundTransfer }
     * 
     */
    public FundTransfer createFundTransfer() {
        return new FundTransfer();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link RecurringSubscriptionInfo }
     * 
     */
    public RecurringSubscriptionInfo createRecurringSubscriptionInfo() {
        return new RecurringSubscriptionInfo();
    }

    /**
     * Create an instance of {@link PaySubscriptionEvent }
     * 
     */
    public PaySubscriptionEvent createPaySubscriptionEvent() {
        return new PaySubscriptionEvent();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link PaymentNetworkToken }
     * 
     */
    public PaymentNetworkToken createPaymentNetworkToken() {
        return new PaymentNetworkToken();
    }

    /**
     * Create an instance of {@link DecisionManager }
     * 
     */
    public DecisionManager createDecisionManager() {
        return new DecisionManager();
    }

    /**
     * Create an instance of {@link DecisionManagerTravelData }
     * 
     */
    public DecisionManagerTravelData createDecisionManagerTravelData() {
        return new DecisionManagerTravelData();
    }

    /**
     * Create an instance of {@link DecisionManagerTravelLeg }
     * 
     */
    public DecisionManagerTravelLeg createDecisionManagerTravelLeg() {
        return new DecisionManagerTravelLeg();
    }

    /**
     * Create an instance of {@link Batch }
     * 
     */
    public Batch createBatch() {
        return new Batch();
    }

    /**
     * Create an instance of {@link PayPal }
     * 
     */
    public PayPal createPayPal() {
        return new PayPal();
    }

    /**
     * Create an instance of {@link JPO }
     * 
     */
    public JPO createJPO() {
        return new JPO();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link AP }
     * 
     */
    public AP createAP() {
        return new AP();
    }

    /**
     * Create an instance of {@link APDevice }
     * 
     */
    public APDevice createAPDevice() {
        return new APDevice();
    }

    /**
     * Create an instance of {@link APAuthService }
     * 
     */
    public APAuthService createAPAuthService() {
        return new APAuthService();
    }

    /**
     * Create an instance of {@link APAuthReversalService }
     * 
     */
    public APAuthReversalService createAPAuthReversalService() {
        return new APAuthReversalService();
    }

    /**
     * Create an instance of {@link APCaptureService }
     * 
     */
    public APCaptureService createAPCaptureService() {
        return new APCaptureService();
    }

    /**
     * Create an instance of {@link APOptionsService }
     * 
     */
    public APOptionsService createAPOptionsService() {
        return new APOptionsService();
    }

    /**
     * Create an instance of {@link APRefundService }
     * 
     */
    public APRefundService createAPRefundService() {
        return new APRefundService();
    }

    /**
     * Create an instance of {@link APSaleService }
     * 
     */
    public APSaleService createAPSaleService() {
        return new APSaleService();
    }

    /**
     * Create an instance of {@link APCheckOutDetailsService }
     * 
     */
    public APCheckOutDetailsService createAPCheckOutDetailsService() {
        return new APCheckOutDetailsService();
    }

    /**
     * Create an instance of {@link APTransactionDetailsService }
     * 
     */
    public APTransactionDetailsService createAPTransactionDetailsService() {
        return new APTransactionDetailsService();
    }

    /**
     * Create an instance of {@link APConfirmPurchaseService }
     * 
     */
    public APConfirmPurchaseService createAPConfirmPurchaseService() {
        return new APConfirmPurchaseService();
    }

    /**
     * Create an instance of {@link APSessionsService }
     * 
     */
    public APSessionsService createAPSessionsService() {
        return new APSessionsService();
    }

    /**
     * Create an instance of {@link APUI }
     * 
     */
    public APUI createAPUI() {
        return new APUI();
    }

    /**
     * Create an instance of {@link PayPalGetTxnDetailsService }
     * 
     */
    public PayPalGetTxnDetailsService createPayPalGetTxnDetailsService() {
        return new PayPalGetTxnDetailsService();
    }

    /**
     * Create an instance of {@link PayPalTransactionSearchService }
     * 
     */
    public PayPalTransactionSearchService createPayPalTransactionSearchService() {
        return new PayPalTransactionSearchService();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link VC }
     * 
     */
    public VC createVC() {
        return new VC();
    }

    /**
     * Create an instance of {@link DecryptVisaCheckoutDataService }
     * 
     */
    public DecryptVisaCheckoutDataService createDecryptVisaCheckoutDataService() {
        return new DecryptVisaCheckoutDataService();
    }

    /**
     * Create an instance of {@link DCC }
     * 
     */
    public DCC createDCC() {
        return new DCC();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link PromotionGroup }
     * 
     */
    public PromotionGroup createPromotionGroup() {
        return new PromotionGroup();
    }

    /**
     * Create an instance of {@link PromotionGroupReply }
     * 
     */
    public PromotionGroupReply createPromotionGroupReply() {
        return new PromotionGroupReply();
    }

    /**
     * Create an instance of {@link CCAuthReply }
     * 
     */
    public CCAuthReply createCCAuthReply() {
        return new CCAuthReply();
    }

    /**
     * Create an instance of {@link OCTReply }
     * 
     */
    public OCTReply createOCTReply() {
        return new OCTReply();
    }

    /**
     * Create an instance of {@link VerificationReply }
     * 
     */
    public VerificationReply createVerificationReply() {
        return new VerificationReply();
    }

    /**
     * Create an instance of {@link CCSaleReply }
     * 
     */
    public CCSaleReply createCCSaleReply() {
        return new CCSaleReply();
    }

    /**
     * Create an instance of {@link CCSaleCreditReply }
     * 
     */
    public CCSaleCreditReply createCCSaleCreditReply() {
        return new CCSaleCreditReply();
    }

    /**
     * Create an instance of {@link CCSaleReversalReply }
     * 
     */
    public CCSaleReversalReply createCCSaleReversalReply() {
        return new CCSaleReversalReply();
    }

    /**
     * Create an instance of {@link CCIncrementalAuthReply }
     * 
     */
    public CCIncrementalAuthReply createCCIncrementalAuthReply() {
        return new CCIncrementalAuthReply();
    }

    /**
     * Create an instance of {@link CCCaptureReply }
     * 
     */
    public CCCaptureReply createCCCaptureReply() {
        return new CCCaptureReply();
    }

    /**
     * Create an instance of {@link ServiceFeeCalculateReply }
     * 
     */
    public ServiceFeeCalculateReply createServiceFeeCalculateReply() {
        return new ServiceFeeCalculateReply();
    }

    /**
     * Create an instance of {@link CCCreditReply }
     * 
     */
    public CCCreditReply createCCCreditReply() {
        return new CCCreditReply();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseReply }
     * 
     */
    public PinDebitPurchaseReply createPinDebitPurchaseReply() {
        return new PinDebitPurchaseReply();
    }

    /**
     * Create an instance of {@link PinDebitCreditReply }
     * 
     */
    public PinDebitCreditReply createPinDebitCreditReply() {
        return new PinDebitCreditReply();
    }

    /**
     * Create an instance of {@link PinDebitReversalReply }
     * 
     */
    public PinDebitReversalReply createPinDebitReversalReply() {
        return new PinDebitReversalReply();
    }

    /**
     * Create an instance of {@link CCAuthReversalReply }
     * 
     */
    public CCAuthReversalReply createCCAuthReversalReply() {
        return new CCAuthReversalReply();
    }

    /**
     * Create an instance of {@link CCAutoAuthReversalReply }
     * 
     */
    public CCAutoAuthReversalReply createCCAutoAuthReversalReply() {
        return new CCAutoAuthReversalReply();
    }

    /**
     * Create an instance of {@link ECDebitReply }
     * 
     */
    public ECDebitReply createECDebitReply() {
        return new ECDebitReply();
    }

    /**
     * Create an instance of {@link ECCreditReply }
     * 
     */
    public ECCreditReply createECCreditReply() {
        return new ECCreditReply();
    }

    /**
     * Create an instance of {@link ECAuthenticateReply }
     * 
     */
    public ECAuthenticateReply createECAuthenticateReply() {
        return new ECAuthenticateReply();
    }

    /**
     * Create an instance of {@link PayerAuthEnrollReply }
     * 
     */
    public PayerAuthEnrollReply createPayerAuthEnrollReply() {
        return new PayerAuthEnrollReply();
    }

    /**
     * Create an instance of {@link PayerAuthValidateReply }
     * 
     */
    public PayerAuthValidateReply createPayerAuthValidateReply() {
        return new PayerAuthValidateReply();
    }

    /**
     * Create an instance of {@link TaxReplyItem }
     * 
     */
    public TaxReplyItem createTaxReplyItem() {
        return new TaxReplyItem();
    }

    /**
     * Create an instance of {@link TaxReplyItemJurisdiction }
     * 
     */
    public TaxReplyItemJurisdiction createTaxReplyItemJurisdiction() {
        return new TaxReplyItemJurisdiction();
    }

    /**
     * Create an instance of {@link TaxReply }
     * 
     */
    public TaxReply createTaxReply() {
        return new TaxReply();
    }

    /**
     * Create an instance of {@link DeviceFingerprint }
     * 
     */
    public DeviceFingerprint createDeviceFingerprint() {
        return new DeviceFingerprint();
    }

    /**
     * Create an instance of {@link AFSReply }
     * 
     */
    public AFSReply createAFSReply() {
        return new AFSReply();
    }

    /**
     * Create an instance of {@link DAVReply }
     * 
     */
    public DAVReply createDAVReply() {
        return new DAVReply();
    }

    /**
     * Create an instance of {@link DeniedPartiesMatch }
     * 
     */
    public DeniedPartiesMatch createDeniedPartiesMatch() {
        return new DeniedPartiesMatch();
    }

    /**
     * Create an instance of {@link ExportReply }
     * 
     */
    public ExportReply createExportReply() {
        return new ExportReply();
    }

    /**
     * Create an instance of {@link FXQuote }
     * 
     */
    public FXQuote createFXQuote() {
        return new FXQuote();
    }

    /**
     * Create an instance of {@link FXRatesReply }
     * 
     */
    public FXRatesReply createFXRatesReply() {
        return new FXRatesReply();
    }

    /**
     * Create an instance of {@link BankTransferReply }
     * 
     */
    public BankTransferReply createBankTransferReply() {
        return new BankTransferReply();
    }

    /**
     * Create an instance of {@link BankTransferRealTimeReply }
     * 
     */
    public BankTransferRealTimeReply createBankTransferRealTimeReply() {
        return new BankTransferRealTimeReply();
    }

    /**
     * Create an instance of {@link DirectDebitMandateReply }
     * 
     */
    public DirectDebitMandateReply createDirectDebitMandateReply() {
        return new DirectDebitMandateReply();
    }

    /**
     * Create an instance of {@link BankTransferRefundReply }
     * 
     */
    public BankTransferRefundReply createBankTransferRefundReply() {
        return new BankTransferRefundReply();
    }

    /**
     * Create an instance of {@link DirectDebitReply }
     * 
     */
    public DirectDebitReply createDirectDebitReply() {
        return new DirectDebitReply();
    }

    /**
     * Create an instance of {@link DirectDebitValidateReply }
     * 
     */
    public DirectDebitValidateReply createDirectDebitValidateReply() {
        return new DirectDebitValidateReply();
    }

    /**
     * Create an instance of {@link DirectDebitRefundReply }
     * 
     */
    public DirectDebitRefundReply createDirectDebitRefundReply() {
        return new DirectDebitRefundReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionCreateReply }
     * 
     */
    public PaySubscriptionCreateReply createPaySubscriptionCreateReply() {
        return new PaySubscriptionCreateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionUpdateReply }
     * 
     */
    public PaySubscriptionUpdateReply createPaySubscriptionUpdateReply() {
        return new PaySubscriptionUpdateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionEventUpdateReply }
     * 
     */
    public PaySubscriptionEventUpdateReply createPaySubscriptionEventUpdateReply() {
        return new PaySubscriptionEventUpdateReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionRetrieveReply }
     * 
     */
    public PaySubscriptionRetrieveReply createPaySubscriptionRetrieveReply() {
        return new PaySubscriptionRetrieveReply();
    }

    /**
     * Create an instance of {@link PaySubscriptionDeleteReply }
     * 
     */
    public PaySubscriptionDeleteReply createPaySubscriptionDeleteReply() {
        return new PaySubscriptionDeleteReply();
    }

    /**
     * Create an instance of {@link PayPalPaymentReply }
     * 
     */
    public PayPalPaymentReply createPayPalPaymentReply() {
        return new PayPalPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalCreditReply }
     * 
     */
    public PayPalCreditReply createPayPalCreditReply() {
        return new PayPalCreditReply();
    }

    /**
     * Create an instance of {@link VoidReply }
     * 
     */
    public VoidReply createVoidReply() {
        return new VoidReply();
    }

    /**
     * Create an instance of {@link PinlessDebitReply }
     * 
     */
    public PinlessDebitReply createPinlessDebitReply() {
        return new PinlessDebitReply();
    }

    /**
     * Create an instance of {@link PinlessDebitValidateReply }
     * 
     */
    public PinlessDebitValidateReply createPinlessDebitValidateReply() {
        return new PinlessDebitValidateReply();
    }

    /**
     * Create an instance of {@link PinlessDebitReversalReply }
     * 
     */
    public PinlessDebitReversalReply createPinlessDebitReversalReply() {
        return new PinlessDebitReversalReply();
    }

    /**
     * Create an instance of {@link PayPalButtonCreateReply }
     * 
     */
    public PayPalButtonCreateReply createPayPalButtonCreateReply() {
        return new PayPalButtonCreateReply();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedPaymentReply }
     * 
     */
    public PayPalPreapprovedPaymentReply createPayPalPreapprovedPaymentReply() {
        return new PayPalPreapprovedPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalPreapprovedUpdateReply }
     * 
     */
    public PayPalPreapprovedUpdateReply createPayPalPreapprovedUpdateReply() {
        return new PayPalPreapprovedUpdateReply();
    }

    /**
     * Create an instance of {@link PayPalEcSetReply }
     * 
     */
    public PayPalEcSetReply createPayPalEcSetReply() {
        return new PayPalEcSetReply();
    }

    /**
     * Create an instance of {@link PayPalEcGetDetailsReply }
     * 
     */
    public PayPalEcGetDetailsReply createPayPalEcGetDetailsReply() {
        return new PayPalEcGetDetailsReply();
    }

    /**
     * Create an instance of {@link PayPalEcDoPaymentReply }
     * 
     */
    public PayPalEcDoPaymentReply createPayPalEcDoPaymentReply() {
        return new PayPalEcDoPaymentReply();
    }

    /**
     * Create an instance of {@link PayPalDoCaptureReply }
     * 
     */
    public PayPalDoCaptureReply createPayPalDoCaptureReply() {
        return new PayPalDoCaptureReply();
    }

    /**
     * Create an instance of {@link PayPalAuthReversalReply }
     * 
     */
    public PayPalAuthReversalReply createPayPalAuthReversalReply() {
        return new PayPalAuthReversalReply();
    }

    /**
     * Create an instance of {@link PayPalRefundReply }
     * 
     */
    public PayPalRefundReply createPayPalRefundReply() {
        return new PayPalRefundReply();
    }

    /**
     * Create an instance of {@link PayPalEcOrderSetupReply }
     * 
     */
    public PayPalEcOrderSetupReply createPayPalEcOrderSetupReply() {
        return new PayPalEcOrderSetupReply();
    }

    /**
     * Create an instance of {@link PayPalAuthorizationReply }
     * 
     */
    public PayPalAuthorizationReply createPayPalAuthorizationReply() {
        return new PayPalAuthorizationReply();
    }

    /**
     * Create an instance of {@link PayPalUpdateAgreementReply }
     * 
     */
    public PayPalUpdateAgreementReply createPayPalUpdateAgreementReply() {
        return new PayPalUpdateAgreementReply();
    }

    /**
     * Create an instance of {@link PayPalCreateAgreementReply }
     * 
     */
    public PayPalCreateAgreementReply createPayPalCreateAgreementReply() {
        return new PayPalCreateAgreementReply();
    }

    /**
     * Create an instance of {@link PayPalDoRefTransactionReply }
     * 
     */
    public PayPalDoRefTransactionReply createPayPalDoRefTransactionReply() {
        return new PayPalDoRefTransactionReply();
    }

    /**
     * Create an instance of {@link RiskUpdateReply }
     * 
     */
    public RiskUpdateReply createRiskUpdateReply() {
        return new RiskUpdateReply();
    }

    /**
     * Create an instance of {@link FraudUpdateReply }
     * 
     */
    public FraudUpdateReply createFraudUpdateReply() {
        return new FraudUpdateReply();
    }

    /**
     * Create an instance of {@link CaseManagementActionReply }
     * 
     */
    public CaseManagementActionReply createCaseManagementActionReply() {
        return new CaseManagementActionReply();
    }

    /**
     * Create an instance of {@link RuleResultItem }
     * 
     */
    public RuleResultItem createRuleResultItem() {
        return new RuleResultItem();
    }

    /**
     * Create an instance of {@link RuleResultItems }
     * 
     */
    public RuleResultItems createRuleResultItems() {
        return new RuleResultItems();
    }

    /**
     * Create an instance of {@link DecisionReply }
     * 
     */
    public DecisionReply createDecisionReply() {
        return new DecisionReply();
    }

    /**
     * Create an instance of {@link AdditionalFields }
     * 
     */
    public AdditionalFields createAdditionalFields() {
        return new AdditionalFields();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link MorphingElement }
     * 
     */
    public MorphingElement createMorphingElement() {
        return new MorphingElement();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link DMEReply }
     * 
     */
    public DMEReply createDMEReply() {
        return new DMEReply();
    }

    /**
     * Create an instance of {@link ProfileReply }
     * 
     */
    public ProfileReply createProfileReply() {
        return new ProfileReply();
    }

    /**
     * Create an instance of {@link CCDCCReply }
     * 
     */
    public CCDCCReply createCCDCCReply() {
        return new CCDCCReply();
    }

    /**
     * Create an instance of {@link CCDCCUpdateReply }
     * 
     */
    public CCDCCUpdateReply createCCDCCUpdateReply() {
        return new CCDCCUpdateReply();
    }

    /**
     * Create an instance of {@link ChinaPaymentReply }
     * 
     */
    public ChinaPaymentReply createChinaPaymentReply() {
        return new ChinaPaymentReply();
    }

    /**
     * Create an instance of {@link ChinaRefundReply }
     * 
     */
    public ChinaRefundReply createChinaRefundReply() {
        return new ChinaRefundReply();
    }

    /**
     * Create an instance of {@link BoletoPaymentReply }
     * 
     */
    public BoletoPaymentReply createBoletoPaymentReply() {
        return new BoletoPaymentReply();
    }

    /**
     * Create an instance of {@link APInitiateReply }
     * 
     */
    public APInitiateReply createAPInitiateReply() {
        return new APInitiateReply();
    }

    /**
     * Create an instance of {@link APCheckStatusReply }
     * 
     */
    public APCheckStatusReply createAPCheckStatusReply() {
        return new APCheckStatusReply();
    }

    /**
     * Create an instance of {@link SellerProtection }
     * 
     */
    public SellerProtection createSellerProtection() {
        return new SellerProtection();
    }

    /**
     * Create an instance of {@link APReply }
     * 
     */
    public APReply createAPReply() {
        return new APReply();
    }

    /**
     * Create an instance of {@link APAuthReply }
     * 
     */
    public APAuthReply createAPAuthReply() {
        return new APAuthReply();
    }

    /**
     * Create an instance of {@link APAuthReversalReply }
     * 
     */
    public APAuthReversalReply createAPAuthReversalReply() {
        return new APAuthReversalReply();
    }

    /**
     * Create an instance of {@link APCaptureReply }
     * 
     */
    public APCaptureReply createAPCaptureReply() {
        return new APCaptureReply();
    }

    /**
     * Create an instance of {@link APOptionsReply }
     * 
     */
    public APOptionsReply createAPOptionsReply() {
        return new APOptionsReply();
    }

    /**
     * Create an instance of {@link APOptionsOption }
     * 
     */
    public APOptionsOption createAPOptionsOption() {
        return new APOptionsOption();
    }

    /**
     * Create an instance of {@link APRefundReply }
     * 
     */
    public APRefundReply createAPRefundReply() {
        return new APRefundReply();
    }

    /**
     * Create an instance of {@link APSaleReply }
     * 
     */
    public APSaleReply createAPSaleReply() {
        return new APSaleReply();
    }

    /**
     * Create an instance of {@link APCheckOutDetailsReply }
     * 
     */
    public APCheckOutDetailsReply createAPCheckOutDetailsReply() {
        return new APCheckOutDetailsReply();
    }

    /**
     * Create an instance of {@link APTransactionDetailsReply }
     * 
     */
    public APTransactionDetailsReply createAPTransactionDetailsReply() {
        return new APTransactionDetailsReply();
    }

    /**
     * Create an instance of {@link APConfirmPurchaseReply }
     * 
     */
    public APConfirmPurchaseReply createAPConfirmPurchaseReply() {
        return new APConfirmPurchaseReply();
    }

    /**
     * Create an instance of {@link APSessionsReply }
     * 
     */
    public APSessionsReply createAPSessionsReply() {
        return new APSessionsReply();
    }

    /**
     * Create an instance of {@link AirlineData }
     * 
     */
    public AirlineData createAirlineData() {
        return new AirlineData();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link AncillaryData }
     * 
     */
    public AncillaryData createAncillaryData() {
        return new AncillaryData();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link LodgingData }
     * 
     */
    public LodgingData createLodgingData() {
        return new LodgingData();
    }

    /**
     * Create an instance of {@link Pos }
     * 
     */
    public Pos createPos() {
        return new Pos();
    }

    /**
     * Create an instance of {@link Pin }
     * 
     */
    public Pin createPin() {
        return new Pin();
    }

    /**
     * Create an instance of {@link EncryptedPayment }
     * 
     */
    public EncryptedPayment createEncryptedPayment() {
        return new EncryptedPayment();
    }

    /**
     * Create an instance of {@link Installment }
     * 
     */
    public Installment createInstallment() {
        return new Installment();
    }

    /**
     * Create an instance of {@link MDDField }
     * 
     */
    public MDDField createMDDField() {
        return new MDDField();
    }

    /**
     * Create an instance of {@link MerchantDefinedData }
     * 
     */
    public MerchantDefinedData createMerchantDefinedData() {
        return new MerchantDefinedData();
    }

    /**
     * Create an instance of {@link MerchantSecureData }
     * 
     */
    public MerchantSecureData createMerchantSecureData() {
        return new MerchantSecureData();
    }

    /**
     * Create an instance of {@link ReplyReserved }
     * 
     */
    public ReplyReserved createReplyReserved() {
        return new ReplyReserved();
    }

    /**
     * Create an instance of {@link RequestReserved }
     * 
     */
    public RequestReserved createRequestReserved() {
        return new RequestReserved();
    }

    /**
     * Create an instance of {@link PayPalGetTxnDetailsReply }
     * 
     */
    public PayPalGetTxnDetailsReply createPayPalGetTxnDetailsReply() {
        return new PayPalGetTxnDetailsReply();
    }

    /**
     * Create an instance of {@link PayPalTransactionSearchReply }
     * 
     */
    public PayPalTransactionSearchReply createPayPalTransactionSearchReply() {
        return new PayPalTransactionSearchReply();
    }

    /**
     * Create an instance of {@link PaypalTransaction }
     * 
     */
    public PaypalTransaction createPaypalTransaction() {
        return new PaypalTransaction();
    }

    /**
     * Create an instance of {@link CCDCCUpdateService }
     * 
     */
    public CCDCCUpdateService createCCDCCUpdateService() {
        return new CCDCCUpdateService();
    }

    /**
     * Create an instance of {@link ServiceFee }
     * 
     */
    public ServiceFee createServiceFee() {
        return new ServiceFee();
    }

    /**
     * Create an instance of {@link EmvRequest }
     * 
     */
    public EmvRequest createEmvRequest() {
        return new EmvRequest();
    }

    /**
     * Create an instance of {@link EmvReply }
     * 
     */
    public EmvReply createEmvReply() {
        return new EmvReply();
    }

    /**
     * Create an instance of {@link OriginalTransaction }
     * 
     */
    public OriginalTransaction createOriginalTransaction() {
        return new OriginalTransaction();
    }

    /**
     * Create an instance of {@link HostedDataCreateService }
     * 
     */
    public HostedDataCreateService createHostedDataCreateService() {
        return new HostedDataCreateService();
    }

    /**
     * Create an instance of {@link HostedDataRetrieveService }
     * 
     */
    public HostedDataRetrieveService createHostedDataRetrieveService() {
        return new HostedDataRetrieveService();
    }

    /**
     * Create an instance of {@link HostedDataCreateReply }
     * 
     */
    public HostedDataCreateReply createHostedDataCreateReply() {
        return new HostedDataCreateReply();
    }

    /**
     * Create an instance of {@link HostedDataRetrieveReply }
     * 
     */
    public HostedDataRetrieveReply createHostedDataRetrieveReply() {
        return new HostedDataRetrieveReply();
    }

    /**
     * Create an instance of {@link AutoRentalData }
     * 
     */
    public AutoRentalData createAutoRentalData() {
        return new AutoRentalData();
    }

    /**
     * Create an instance of {@link VCReply }
     * 
     */
    public VCReply createVCReply() {
        return new VCReply();
    }

    /**
     * Create an instance of {@link VCCardArt }
     * 
     */
    public VCCardArt createVCCardArt() {
        return new VCCardArt();
    }

    /**
     * Create an instance of {@link VCCustomData }
     * 
     */
    public VCCustomData createVCCustomData() {
        return new VCCustomData();
    }

    /**
     * Create an instance of {@link DecryptVisaCheckoutDataReply }
     * 
     */
    public DecryptVisaCheckoutDataReply createDecryptVisaCheckoutDataReply() {
        return new DecryptVisaCheckoutDataReply();
    }

    /**
     * Create an instance of {@link GetVisaCheckoutDataReply }
     * 
     */
    public GetVisaCheckoutDataReply createGetVisaCheckoutDataReply() {
        return new GetVisaCheckoutDataReply();
    }

    /**
     * Create an instance of {@link EncryptPaymentDataReply }
     * 
     */
    public EncryptPaymentDataReply createEncryptPaymentDataReply() {
        return new EncryptPaymentDataReply();
    }

    /**
     * Create an instance of {@link BinLookupService }
     * 
     */
    public BinLookupService createBinLookupService() {
        return new BinLookupService();
    }

    /**
     * Create an instance of {@link BinLookupReply }
     * 
     */
    public BinLookupReply createBinLookupReply() {
        return new BinLookupReply();
    }

    /**
     * Create an instance of {@link Issuer }
     * 
     */
    public Issuer createIssuer() {
        return new Issuer();
    }

    /**
     * Create an instance of {@link GETVisaCheckoutDataService }
     * 
     */
    public GETVisaCheckoutDataService createGETVisaCheckoutDataService() {
        return new GETVisaCheckoutDataService();
    }

    /**
     * Create an instance of {@link TransactionMetadataService }
     * 
     */
    public TransactionMetadataService createTransactionMetadataService() {
        return new TransactionMetadataService();
    }

    /**
     * Create an instance of {@link Loan }
     * 
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link APOrderService }
     * 
     */
    public APOrderService createAPOrderService() {
        return new APOrderService();
    }

    /**
     * Create an instance of {@link APOrderReply }
     * 
     */
    public APOrderReply createAPOrderReply() {
        return new APOrderReply();
    }

    /**
     * Create an instance of {@link APCancelService }
     * 
     */
    public APCancelService createAPCancelService() {
        return new APCancelService();
    }

    /**
     * Create an instance of {@link APCancelReply }
     * 
     */
    public APCancelReply createAPCancelReply() {
        return new APCancelReply();
    }

    /**
     * Create an instance of {@link APBillingAgreementService }
     * 
     */
    public APBillingAgreementService createAPBillingAgreementService() {
        return new APBillingAgreementService();
    }

    /**
     * Create an instance of {@link APBillingAgreementReply }
     * 
     */
    public APBillingAgreementReply createAPBillingAgreementReply() {
        return new APBillingAgreementReply();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.141", name = "requestMessage")
    public JAXBElement<RequestMessage> createRequestMessage(RequestMessage value) {
        return new JAXBElement<RequestMessage>(_RequestMessage_QNAME, RequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyMessage }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.141", name = "replyMessage")
    public JAXBElement<ReplyMessage> createReplyMessage(ReplyMessage value) {
        return new JAXBElement<ReplyMessage>(_ReplyMessage_QNAME, ReplyMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.141", name = "nvpRequest")
    public JAXBElement<String> createNvpRequest(String value) {
        return new JAXBElement<String>(_NvpRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.141", name = "nvpReply")
    public JAXBElement<String> createNvpReply(String value) {
        return new JAXBElement<String>(_NvpReply_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}
     */
    @XmlElementDecl(namespace = "urn:schemas-cybersource-com:transaction-data-1.141", name = "faultDetails")
    public JAXBElement<FaultDetails> createFaultDetails(FaultDetails value) {
        return new JAXBElement<FaultDetails>(_FaultDetails_QNAME, FaultDetails.class, null, value);
    }

}
