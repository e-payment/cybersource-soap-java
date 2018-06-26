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
import com.cybersource.stub.PayerAuthValidateReply;
import com.cybersource.stub.PayerAuthValidateService;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class PayerAuthValidateAndAuthorizeTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(PayerAuthValidateAndAuthorizeTest.class);

	@Test
	@Ignore
	public void shouldPayerAuthAndCaptureSuccess() throws Exception {

		String merchantDescriptor = "BAY Payment"; // invoice_header_merchantDescriptor

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		String signedPARes = "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";
		// String md = "YWhSZ0lja2JjYW5BMk9iWmk0WDA="; // XID

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("P" + new java.util.Date().getTime());

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		PayerAuthValidateService payerAuthValidateService = new PayerAuthValidateService();
		payerAuthValidateService.setRun("true");
		payerAuthValidateService.setSignedPARes(signedPARes);
		request.setPayerAuthValidateService(payerAuthValidateService);

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		purchaseTotals.setGrandTotalAmount("1.00");
		request.setPurchaseTotals(purchaseTotals);

		// This section contains a sample transaction request for the authorization
		// service with complete billing, payment card, and purchase (two items)
		// information.

		request.setCcAuthService(new CCAuthService());
		request.getCcAuthService().setRun("true");

		request.setCcCaptureService(new CCCaptureService());
		request.getCcCaptureService().setRun("true");

		InvoiceHeader invoiceHeader = new InvoiceHeader();
		invoiceHeader.setMerchantDescriptor(merchantDescriptor);
		request.setInvoiceHeader(invoiceHeader);

		Card card = new Card();
		card.setCardType("001"); // 001: VISA, 002: MC, 003: JCB
		card.setAccountNumber("4000000000000002");
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		BillTo billTo = new BillTo();
		billTo.setFirstName("John");
		billTo.setLastName("Doe");
		billTo.setStreet1("1295 Charleston Road");
		billTo.setCity("Mountain View");
		billTo.setState("CA");
		billTo.setPostalCode("94043");
		billTo.setCountry("US");
		billTo.setEmail("customer@mail.com");
		billTo.setIpAddress("10.7.111.111");
		request.setBillTo(billTo);
		
		
		
		request.setDeviceFingerprintID("7B45C607E8CF19F83CC6F2621591291A");

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
