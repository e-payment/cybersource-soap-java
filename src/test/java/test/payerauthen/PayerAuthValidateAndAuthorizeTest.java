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
	public void shoudEnrollSuccess() throws Exception {

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
