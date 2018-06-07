package test.token;

import java.math.BigInteger;
import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.Card;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PaySubscriptionUpdateReply;
import com.cybersource.stub.PaySubscriptionUpdateService;
import com.cybersource.stub.RecurringSubscriptionInfo;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class TokenUpdateTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(TokenUpdateTest.class);

	@Test
	//@Ignore
	public void shoudUpdateTokenSuccess() throws Exception {

		String subscriptionID = "5277582182786841003010"; // Reference to created subscriptionID

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("T" + new java.util.Date().getTime());

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		Card card = new Card();
		card.setCardType("001"); // 001: VISA, 002: MC, 003: JCB
		card.setAccountNumber("4111111111111111");
		card.setExpirationMonth(new BigInteger("09"));
		card.setExpirationYear(new BigInteger("2021"));
		request.setCard(card);

		RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
		recurringSubscriptionInfo.setSubscriptionID(subscriptionID);
		request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

		PaySubscriptionUpdateService paySubscriptionUpdateService = new PaySubscriptionUpdateService();
		paySubscriptionUpdateService.setRun("true");
		request.setPaySubscriptionUpdateService(paySubscriptionUpdateService);

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

			if ("100".equals(reply.getReasonCode().toString())) {

				PaySubscriptionUpdateReply paySubscriptionUpdateReply = reply.getPaySubscriptionUpdateReply();
				log.debug("TOKEN UPDATE SUCCESS");
				log.debug("SubscriptionID    : {}", paySubscriptionUpdateReply.getSubscriptionID());
				log.debug("SubscriptionIDNew : {}", paySubscriptionUpdateReply.getSubscriptionIDNew());
			} else {
				log.debug("TOKEN UPDATE FAIL");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
