package test.payerauthen;

import java.math.BigInteger;
import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.BillTo;
import com.cybersource.stub.CCAuthService;
import com.cybersource.stub.Card;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PayerAuthValidateService;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class PayerAuthValidateAndAuthorizeTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(PayerAuthValidateAndAuthorizeTest.class);

	@Test
	// @Ignore
	public void shoudEnrollSuccess() throws Exception {

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

			// To retrieve individual reply fields, follow these examples.
			log.debug("requestID       : {}", reply.getRequestID());
			log.debug("decision        : {}", reply.getDecision());
			log.debug("reasonCode      : {}", reply.getReasonCode());

			// check authorization success, then void transaction

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
