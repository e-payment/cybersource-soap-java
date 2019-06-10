package test;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import com.cybersource.schemas.transaction_data_1.BillTo;
import com.cybersource.schemas.transaction_data_1.CCAuthService;
import com.cybersource.schemas.transaction_data_1.CCCaptureService;
import com.cybersource.schemas.transaction_data_1.Card;
import com.cybersource.schemas.transaction_data_1.InvoiceHeader;
import com.cybersource.schemas.transaction_data_1.Item;
import com.cybersource.schemas.transaction_data_1.PurchaseTotals;
import com.cybersource.schemas.transaction_data_1.RequestMessage;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CxfTest
 */
public class CxfTest extends CxfBaseTest {

	private static final Logger log = LoggerFactory.getLogger(CxfTest.class);

	@Test
	public void test() {
		assertEquals("CXF", "CXF");

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		String merchantDescriptor = "BAY Payment"; // invoice_header_merchantDescriptor

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("P" + new java.util.Date().getTime());
		String reconciliationID = request.getMerchantReferenceCode(); // for TC33 Report

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Apache CXF");
		// request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		// This section contains a sample transaction request for the authorization
		// service with complete billing, payment card, and purchase (two items)
		// information.
		CCAuthService ccAuthService = new CCAuthService();
		ccAuthService.setRun("true");
		ccAuthService.setReconciliationID(reconciliationID);
		request.setCcAuthService(ccAuthService);

		request.setCcCaptureService(new CCCaptureService());
		request.getCcCaptureService().setRun("true");

		InvoiceHeader invoiceHeader = new InvoiceHeader();
		invoiceHeader.setMerchantDescriptor(merchantDescriptor);
		request.setInvoiceHeader(invoiceHeader);

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

		Card card = new Card();
		card.setAccountNumber("4111111111111111");
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		// purchaseTotals.setGrandTotalAmount("1234.50");
		request.setPurchaseTotals(purchaseTotals);

		Item[] items = new Item[2];
		Item item = new Item();
		item.setId(new BigInteger("0"));
		item.setUnitPrice("12.34");
		item.setQuantity("2");
		items[0] = item;
		item = new Item();
		item.setId(new BigInteger("1"));
		item.setUnitPrice("56.78");
		items[1] = item;
		//request.setItem(items);

		request.setDeviceFingerprintID("7B45C607E8CF19F83CC6F2621591291A");
		
	}
}