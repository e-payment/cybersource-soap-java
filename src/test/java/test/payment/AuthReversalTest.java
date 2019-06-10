package test.payment;

import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.CCAuthReversalService;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class AuthReversalTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(AuthReversalTest.class);

	@Test
	@Ignore
	public void shouldVoidTransaction() throws Exception {

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);
		
		String authRequestID = "5345613387636753504009";

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("R" + new java.util.Date().getTime());

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		// Reversal Service
		
		CCAuthReversalService ccAuthReversalService = new CCAuthReversalService();
		ccAuthReversalService.setRun("true");
		ccAuthReversalService.setAuthRequestID(authRequestID);
		
		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		purchaseTotals.setGrandTotalAmount("1.00");
		request.setPurchaseTotals(purchaseTotals);
		
		request.setCcAuthReversalService(ccAuthReversalService);

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
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
