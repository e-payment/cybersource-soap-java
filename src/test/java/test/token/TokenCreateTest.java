package test.token;

import java.math.BigInteger;
import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.BillTo;
import com.cybersource.stub.Card;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PaySubscriptionCreateService;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.RecurringSubscriptionInfo;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class TokenCreateTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(TokenCreateTest.class);

	@Test
	@Ignore
	public void shoudCreateToken() throws Exception {

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

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		request.setPurchaseTotals(purchaseTotals);

		Card card = new Card();
		card.setCardType("001"); // 001: VISA, 002: MC, 003: JCB
		card.setAccountNumber("4000000000000002");
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
		recurringSubscriptionInfo.setFrequency("on-demand");
		request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

		PaySubscriptionCreateService paySubscriptionCreateService = new PaySubscriptionCreateService();
		paySubscriptionCreateService.setRun("true");
		request.setPaySubscriptionCreateService(paySubscriptionCreateService);

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
			log.debug("tokenId         : {}", reply.getPaySubscriptionCreateReply().getSubscriptionID());

			if ("100".equals(reply.getReasonCode().toString())) {
				log.debug("TOKEN CREATE SUCCESS");
			} else {
				log.debug("TOKEN CREATE FAIL");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
