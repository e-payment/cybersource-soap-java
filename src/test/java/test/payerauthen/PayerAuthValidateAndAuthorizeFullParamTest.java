package test.payerauthen;

import java.math.BigInteger;
import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.BillTo;
import com.cybersource.stub.CCAuthService;
import com.cybersource.stub.CCCaptureService;
import com.cybersource.stub.Card;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.InvoiceHeader;
import com.cybersource.stub.Item;
import com.cybersource.stub.MerchantDefinedData;
import com.cybersource.stub.PayerAuthValidateReply;
import com.cybersource.stub.PayerAuthValidateService;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.ShipTo;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class PayerAuthValidateAndAuthorizeFullParamTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(PayerAuthValidateAndAuthorizeFullParamTest.class);

	@Test
	@Ignore
	public void shoudSuccess() throws Exception {

		String merchantDescriptor = "BAY Payment"; // invoice_header_merchantDescriptor

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("S000002900200");
		String reconciliationID = request.getMerchantReferenceCode(); // for TC33 Report
		
		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		// This section contains a sample transaction request for the authorization
		// service with complete billing, payment card, and purchase information.

		CCAuthService ccAuthService = new CCAuthService();
		ccAuthService.setRun("true");
		ccAuthService.setReconciliationID(reconciliationID);
		request.setCcAuthService(ccAuthService);

		request.setCcCaptureService(new CCCaptureService());
		request.getCcCaptureService().setRun("true");

		InvoiceHeader invoiceHeader = new InvoiceHeader();
		invoiceHeader.setMerchantDescriptor(merchantDescriptor);
		request.setInvoiceHeader(invoiceHeader);
		
		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		//purchaseTotals.setGrandTotalAmount("1.00");
		request.setPurchaseTotals(purchaseTotals);
		
		Item[] items = new Item[1];
		Item item = new Item();
		//item.setId(new BigInteger("0"));
		item.setUnitPrice("1.00");
		items[0] = item;
		item = new Item();
		request.setItem(items);
		
		MerchantDefinedData merchantDefinedData = new MerchantDefinedData();
		merchantDefinedData.setField1("Advertising Services");
		merchantDefinedData.setField14("EN");
		request.setMerchantDefinedData(merchantDefinedData);

		Card card = new Card();
		card.setCardType("001"); // 001: VISA, 002: MC, 003: JCB
		card.setAccountNumber("4000000000000002");
		card.setExpirationMonth(new BigInteger("05"));
		card.setExpirationYear(new BigInteger("2021"));
		card.setCvNumber("111");
		request.setCard(card);

		BillTo billTo = new BillTo();
		billTo.setFirstName("Krungsri");
		billTo.setLastName("Simple");
		billTo.setStreet1("1222 Rama III Road");
		billTo.setStreet2("Bang Phongphang");
		billTo.setCity("Yan Nawa");
		billTo.setState("Bangkok");
		billTo.setPostalCode("10210");
		billTo.setCountry("TH");
		billTo.setEmail("customer@mail.com");
		billTo.setIpAddress("10.0.0.1");
		billTo.setCustomerID("S000002900200");
		billTo.setPhoneNumber("+6622962000");
		request.setBillTo(billTo);
		
		ShipTo shipTo = new ShipTo();
		shipTo.setFirstName("Krungsri");
		shipTo.setLastName("Simple");
		shipTo.setStreet1("1222 Rama III Road");
		shipTo.setStreet2("Bang Phongphang");
		shipTo.setCity("Yan Nawa");
		shipTo.setState("Bangkok");
		shipTo.setPostalCode("10210");
		shipTo.setCountry("TH");
		shipTo.setEmail("customer@mail.com");
		request.setShipTo(shipTo);
		
		//String signedPARes = "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";
		String signedPARes = "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";
		// String md = "YWhSZ0lja2JjYW5BMk9iWmk0WDA="; // XID
		
		PayerAuthValidateService payerAuthValidateService = new PayerAuthValidateService();
		payerAuthValidateService.setRun("true");
		payerAuthValidateService.setSignedPARes(signedPARes);
		request.setPayerAuthValidateService(payerAuthValidateService);
		
		request.setDeviceFingerprintID("1uyytv45rxwaw35555ixwpyb");

		try {

			URL endpoint = new URL(SERVER_URL);
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML(endpoint);
			stub._setProperty(WSHandlerConstants.USER, request.getMerchantID());

			ReplyMessage reply = stub.runTransaction(request);

			PayerAuthValidateReply payerAuthValidateReply = reply.getPayerAuthValidateReply();

			// To retrieve individual reply fields, follow these examples.
			log.debug("requestID       : {}", reply.getRequestID());
			log.debug("decision        : {}", reply.getDecision());
			log.debug("reasonCode      : {}", reply.getReasonCode());
			
			log.debug("auth.ReasonCode : {}", payerAuthValidateReply.getReasonCode());
			log.debug("XID             : {}", payerAuthValidateReply.getXid());
			log.debug("PaRes Status    : {}", payerAuthValidateReply.getParesStatus());
			log.debug("ECI             : {}", payerAuthValidateReply.getEci());
			
			// VISA/JCB
			log.debug("CAVV            : {}", payerAuthValidateReply.getCavv());
			
			// MasterCard
			log.debug("UcafAuth        : {}", payerAuthValidateReply.getUcafAuthenticationData());
			log.debug("UcafCollection  : {}", payerAuthValidateReply.getUcafCollectionIndicator());

			// TODO: check card can charge, then void transaction with requestID

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
