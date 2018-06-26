package test.payment;

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
import com.cybersource.stub.MerchantDefinedData;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class AuthorizeTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(AuthorizeTest.class);

	@Test
	@Ignore
	public void shouldAuthSuccess() throws Exception {

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		String merchantDescriptor = "BAY Payment"; // invoice_header_merchantDescriptor

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("P" + new java.util.Date().getTime());
		String reconciliationID = request.getMerchantReferenceCode(); // for TC33 Report
		log.debug("referenceCode   : {}", request.getMerchantReferenceCode());
		
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
		
		// F1 (11)
		ccAuthService.setAggregatorID("90123456789");
		request.setCcAuthService(ccAuthService);

//		request.setCcCaptureService(new CCCaptureService());
//		request.getCcCaptureService().setRun("true");

		InvoiceHeader invoiceHeader = new InvoiceHeader();
		// F2 (11)
		invoiceHeader.setSalesOrganizationID(new BigInteger("90123456789"));
		// F3 (15)
		invoiceHeader.setSubmerchantID(MERCHANT_ID);
		invoiceHeader.setMerchantDescriptor(merchantDescriptor);
		request.setInvoiceHeader(invoiceHeader);

		BillTo billTo = new BillTo();
		billTo.setFirstName("Test");
		billTo.setLastName("Test");
		billTo.setStreet1("123 testing street");
		billTo.setCity("New York");
		billTo.setState("NY");
		billTo.setPostalCode("10120");
		billTo.setCountry("TH");
		billTo.setEmail("customer@mail.com");
		billTo.setIpAddress("192.168.1.1");
		request.setBillTo(billTo);

		Card card = new Card();
		
		// VISA
		card.setCardType("001");
		card.setAccountNumber("4000000000000002");
		
		// MASTERCARD
		// card.setCardType("002");
		// card.setAccountNumber("5555555555554444");
		
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		purchaseTotals.setGrandTotalAmount("1.00");
		request.setPurchaseTotals(purchaseTotals);

		// MDD
		MerchantDefinedData merchantDefinedData = new MerchantDefinedData();
		merchantDefinedData.setField1("MDD#1");
		merchantDefinedData.setField2("MDD#2");
		request.setMerchantDefinedData(merchantDefinedData);

		// session id for mapping DeviceFingerprintID
		request.setDeviceFingerprintID("7B45C607E8CF19F83CC6F2621591291A");

		try {

			URL endpoint = new URL(SERVER_URL);
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML(endpoint);
			stub._setProperty(WSHandlerConstants.USER, request.getMerchantID());

			ReplyMessage reply = stub.runTransaction(request);

			// To retrieve individual reply fields, follow these examples.
			log.debug("decision        : {}", reply.getDecision());
			log.debug("reasonCode      : {}", reply.getReasonCode());
			log.debug("requestID       : {}", reply.getRequestID());
			log.debug("requestToken    : {}", reply.getRequestToken());

			if ("100".equals(reply.getReasonCode().toString())) {
				log.debug("auth.reasonCode : {}", reply.getCcAuthReply().getReasonCode());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
