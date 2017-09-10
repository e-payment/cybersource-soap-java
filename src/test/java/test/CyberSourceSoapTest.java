package test;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import com.cybersource.stub.*;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyberSourceSoapTest {

    private static final Logger log = LoggerFactory.getLogger(CyberSourceSoapTest.class);

    private static ResourceBundle config;
    private static String MERCHANT_ID;
    private static String ENV;
    private static String SERVER_URL;

    private static final String LIB_VERSION = "1.4/1.5.12"; // Axis Version / WSS4J Version

    static {
        System.setProperty("axis.ClientConfigFile", "cybs.wsdd");

        config      = ResourceBundle.getBundle("cybs", Locale.ENGLISH);
        MERCHANT_ID = config.getString("merchant.id");
        ENV         = config.getString("env");
        SERVER_URL  = config.getString("env." + ENV + ".url");
    }
    
    @Test
    public void shoudAuth() throws Exception {

        log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
        log.debug("merchant Id     : {}", MERCHANT_ID);

        RequestMessage request = new RequestMessage();
        request.setMerchantID(MERCHANT_ID);
       
	    // Before using this example, replace the generic value with
		// your reference number for the current transaction. 
	    request.setMerchantReferenceCode( "BAY" + new java.util.Date().getTime());
        
        // To help us troubleshoot any problems that you may encounter,
        // please include the following information about your application.
        request.setClientLibrary( "Java Axis WSS4J" );
        request.setClientLibraryVersion(LIB_VERSION);
        request.setClientEnvironment(
                  System.getProperty( "os.name" ) + "/" +
                  System.getProperty( "os.version" ) + "/" +
                  System.getProperty( "java.vendor" ) + "/" +
                  System.getProperty( "java.version" ) );
    
	    // This section contains a sample transaction request for the authorization 
        // service with complete billing, payment card, and purchase (two items) information.	
	    request.setCcAuthService( new CCAuthService() );
        request.getCcAuthService().setRun( "true" );

        BillTo billTo = new BillTo();
        billTo.setFirstName( "John" );
        billTo.setLastName( "Doe" );
        billTo.setStreet1( "1295 Charleston Road" );
        billTo.setCity( "Mountain View" );
        billTo.setState( "CA" );
        billTo.setPostalCode( "94043" );
        billTo.setCountry( "US" );
        billTo.setEmail( "null@cybersource.com" );
        billTo.setIpAddress( "10.7.111.111" );
        request.setBillTo( billTo );

        Card card = new Card();
        card.setAccountNumber( "4111111111111111" );
        card.setExpirationMonth( new BigInteger("12") );
        card.setExpirationYear( new BigInteger("2020") );
        request.setCard( card );

        PurchaseTotals purchaseTotals = new PurchaseTotals();
        purchaseTotals.setCurrency( "USD" );
        request.setPurchaseTotals( purchaseTotals );

        Item[] items = new Item[2];

        Item item = new Item();
        item.setId( new BigInteger( "0" ) );
        item.setUnitPrice( "12.34" );
        item.setQuantity( "2.0" );
        items[0] = item;

        item = new Item();
        item.setId( new BigInteger( "1" ) );
        item.setUnitPrice( "56.78" );
        items[1] = item;
        
        request.setItem( items );

        try {

            URL endpoint = new URL( SERVER_URL );
            TransactionProcessorLocator service = new TransactionProcessorLocator();
            ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML( endpoint );
            stub._setProperty( WSHandlerConstants.USER, request.getMerchantID() );
            
            ReplyMessage reply = stub.runTransaction( request );
            
            // To retrieve individual reply fields, follow these examples.
            log.debug("decision        : {}", reply.getDecision());
            log.debug("reasonCode      : {}", reply.getReasonCode());
            log.debug("requestID       : {}", reply.getRequestID());
            log.debug("requestToken    : \n{}", reply.getRequestToken());
            log.debug("auth.reasonCode : {}", reply.getCcAuthReply().getReasonCode());
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }    
    
} 

