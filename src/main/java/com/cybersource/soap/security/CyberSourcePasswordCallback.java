package com.cybersource.soap.security;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

/**
 * Sample password callback for the client
 */
public class CyberSourcePasswordCallback implements CallbackHandler {

    // Before using this sample, change the generic value with your reference number for the current transaction.
    private static final String TRANSACTION_KEY = "7EPfF9BaNQB5RmHrxOcz2JaPTXuyqbfjaabZdIFHfCKmKZfuGVvKSr185eAtm5/8M4VDF9LS/bfMapSDPoOcA/DCJz1YKeePVga1qwt4f2cdeiXWw/lh9dIHvIH2Gdo/sJZgtr2rFDR/6tbWnJENMI0iG+0Up5WDnCateHPJWrv0gvFIATEDHcWdmhoZEPZC1gnTUYATzRM/NVPY9Y0GNTzrfIeK/mwNLSxEUSBKoU8cT3C0ToUuYfoR/dyC92xAHQBENoiXnhVCQnUnQ2EM9a4TKiMP8e1x7W7Yhm/L31fHRAO5NoK8l3AYy1sTKxIdlsDDzmdszoPsjCMn7Sfy+Q==";
    
    /**
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    public void handle(Callback[] callbacks)
        throws IOException, UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

                // This sample returns one password for all merchants.
                // To support multiple passwords, return the password
                // corresponding to pc.getIdentifier().
                pc.setPassword( TRANSACTION_KEY );
            } else {
                throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
            }
        }
    }
}