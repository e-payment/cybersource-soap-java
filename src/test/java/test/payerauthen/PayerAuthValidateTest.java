package test.payerauthen;

import java.math.BigInteger;
import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.Card;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PayerAuthEnrollReply;
import com.cybersource.stub.PayerAuthEnrollService;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class PayerAuthValidateTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(PayerAuthValidateTest.class);

	@Test
	// @Ignore
	public void shoudEnrollSuccess() throws Exception {

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("P" + new java.util.Date().getTime());

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		request.setPayerAuthEnrollService(new PayerAuthEnrollService());
		request.getPayerAuthEnrollService().setRun("true");

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		purchaseTotals.setGrandTotalAmount("1234.50");
		request.setPurchaseTotals(purchaseTotals);

		Card card = new Card();
		card.setCardType("001"); // 001: VISA, 002: MC, 003: JCB
		card.setAccountNumber("4000000000000002");
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		try {

			URL endpoint = new URL(SERVER_URL);
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML(endpoint);
			stub._setProperty(WSHandlerConstants.USER, request.getMerchantID());

			ReplyMessage reply = stub.runTransaction(request);

			// To retrieve individual reply fields, follow these examples.
			log.debug("decision        : {}", reply.getDecision());
			log.debug("reasonCode      : {}", reply.getReasonCode());
			log.debug("reasonCode      : {}", reply.getIssuerMessage());
			log.debug("requestID       : {}", reply.getRequestID());
			log.debug("auth.reasonCode : {}", reply.getPayerAuthEnrollReply().getReasonCode());

			// ReasonCode 475: The customer is enrolled in Payer Authentication.
			// Authenticate the card holder before continuing with the transaction.

			boolean isEnrolled = "REJECT".equalsIgnoreCase(reply.getDecision())
					&& "475".equals(reply.getReasonCode().toString());

			// redirect to 3DS page
			if (isEnrolled) {

				log.debug("*** PAYER AUTHEN INFORMATION ***");

				PayerAuthEnrollReply payerAuthEnrollReply = reply.getPayerAuthEnrollReply();

				String acsUrl = payerAuthEnrollReply.getAcsURL();
				String paReq = payerAuthEnrollReply.getPaReq();
				String xid = payerAuthEnrollReply.getXid();
				String termUrl = "http://127.0.0.1:8088/PayerACSResponse.php";

				log.debug("acsUrl   : {}", acsUrl);
				log.debug("paReq    : {}", paReq);
				log.debug("xid      : {}", xid);
				log.debug("termUrl  : {}", termUrl);
				log.debug("ProofXML : {}", payerAuthEnrollReply.getProofXML());
				// TODO: bypass 3DS
				// } else if () {
			} else {
				log.debug("*** PAYER AUTHEN FAIL ***");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
