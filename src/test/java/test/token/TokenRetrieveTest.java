package test.token;

import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PaySubscriptionRetrieveReply;
import com.cybersource.stub.PaySubscriptionRetrieveService;
import com.cybersource.stub.RecurringSubscriptionInfo;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class TokenRetrieveTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(TokenRetrieveTest.class);

	@Test
	@Ignore
	public void shouldRetrievCustomerProfile() throws Exception {

		String subscriptionID = "5283676744016978203012"; // Reference to created subscriptionID

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("R" + new java.util.Date().getTime());

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
		recurringSubscriptionInfo.setSubscriptionID(subscriptionID);
		request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

		PaySubscriptionRetrieveService paySubscriptionRetrieveService = new PaySubscriptionRetrieveService();
		paySubscriptionRetrieveService.setRun("true");
		request.setPaySubscriptionRetrieveService(paySubscriptionRetrieveService);

		try {

			URL endpoint = new URL(SERVER_URL);
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML(endpoint);
			stub._setProperty(WSHandlerConstants.USER, request.getMerchantID());

			ReplyMessage reply = stub.runTransaction(request);

			// To retrieve individual reply fields, follow these examples.
			log.debug("decision          : {}", reply.getDecision());
			log.debug("reasonCode        : {}", reply.getReasonCode());
			log.debug("requestID         : {}", reply.getRequestID());

			PaySubscriptionRetrieveReply paySubscriptionRetrieveReply = reply.getPaySubscriptionRetrieveReply();

			if ("100".equals(reply.getReasonCode().toString())) {
				log.debug("RETRIEV CUSTOMER PROFILE SUCCESS");
				log.debug("SubscriptionID      : {}", paySubscriptionRetrieveReply.getSubscriptionID());
				log.debug("ReasonCode          : {}", paySubscriptionRetrieveReply.getReasonCode());
				log.debug("ApprovalRequired    : {}", paySubscriptionRetrieveReply.getApprovalRequired());
				log.debug("Frequency           : {}", paySubscriptionRetrieveReply.getFrequency());
				log.debug("Status              : {}", paySubscriptionRetrieveReply.getStatus());
				log.debug("CardType            : {}", paySubscriptionRetrieveReply.getCardType());
				log.debug("CardAccountNumber   : {}", paySubscriptionRetrieveReply.getCardAccountNumber());
				log.debug("CardExpirationMonth : {}", paySubscriptionRetrieveReply.getCardExpirationMonth());
				log.debug("CardExpirationYear  : {}", paySubscriptionRetrieveReply.getCardExpirationYear());
				log.debug("FirstName           : {}", paySubscriptionRetrieveReply.getFirstName());
				log.debug("LastName            : {}", paySubscriptionRetrieveReply.getLastName());
			} else {
				log.debug("RETRIEV CUSTOMER PROFILE FAIL");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
