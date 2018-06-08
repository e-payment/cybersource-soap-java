Device Fingerprinting ID & 3-D Secure
=======================

## Implement Device Fingerprinting ID

Reference: [Decision Manager Device Fingerprint (PDF)](https://github.com/e-payment/cybersource-simple-order/blob/master/doc/DecisionManagerDeviceFingerprint.pdf)

### 1. Adding the Fingerprinting Code to Your Web Site

#### Example (JSP)
```jsp
<%@ page contentType="text/html;charset=UTF-8"  language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%

//DF: TEST = 1snn5n9w, LIVE = k8vif92e 
String DF_ORG_ID   = "1snn5n9w"; 
String MERCHANT_ID = "kr950xxxxxx";
String sess_id     = request.getSession().getId();
String df_param    = "org_id=" + DF_ORG_ID + "&amp;session_id=" + MERCHANT_ID + sess_id;

%>

<!-- DF START -->
<div style="color: #ccc">
<ul>
<li>device_fingerprint_id: <%= sess_id %></li>
<li>df_param: <%= df_param %></li>
</ul>
<p style="background:url(https://h.online-metrix.net/fp/clear.png?<%= df_param %>&amp;m=1)" />
<img src="https://h.online-metrix.net/fp/clear.png?<%= df_param %>&amp;m=2" width="1" height="1" />
</div>
<!-- DF END -->
```
### 2. Setup Device Fingerprinting ID

Use sessionId as DeviceFingerprintID when call API by set parameter as example
```java
RequestMessage request = new RequestMessage();
// ...
request.setDeviceFingerprintID("7B45C607E8CF19F83CC6F2621591291A");
```



## Implementing 3-D Secure

Reference: [Payer Authentication Using the Simple Order API (PDF)](https://github.com/e-payment/cybersource-simple-order/blob/master/doc/Payer_Authentication_SO_API.pdf)

After customer checkout, then send payment and payer information (amount, name, billing and device fingerprint id, etc.) to request API as step below.

### Step 1: Checking Enrollment

* A. Requesting the Check Enrollment Service
* B. Interpreting the Reply

### Step 2: Authenticating Enrolled Cards
 * A. Creating the HTTP POST Form
 * B. Creating the HTML Frame for Authentication
 * C. Receiving the PARes Message from the Card-Issuing Bank

### Step 3: Validating Authentication
 * A. Requesting the Validation Service
 * B. Interpreting the Reply
 * C. Redirecting Customers to Pass or Fail Message Page



Implementation includes modifying your web site front end and developing the software
code to integrate with payer authentication services. Please see detail in document on page. 21 at `Table 3 Implementation Tasks `



#### 1. Check Enrollment Examples

The following is an example of a request for the check enrollment service:
```
payerAuthEnrollService_run=true
merchantID=kr950xxxxxxx
merchantReferenceCode=23AEE8CB6B62EE2AF07
item_0_unitPrice=19.99
purchaseTotals_currency=USD
card_expirationMonth=12
card_expirationYear=2020
card_accountNumber=4000000000000002
card_cardType=001
```

#### Example (Java)

[PayerAuthCheckEnrollTest.java](https://github.com/e-payment/cybersource-soap-java/blob/master/src/test/java/test/payerauthen/PayerAuthCheckEnrollTest.java)



### 2. Validate Payer Authentication and Authorize Example

```
payerAuthValidateService_run=true
ccAuthService_run=true
merchantID=kr950xxxxxxx
merchantReferenceCode=23AEE8CB6B62EE2AF07
card_expirationMonth=12
card_expirationYear=2020
card_accountNumber=4000000000000002
card_cardType=001
item_0_unitPrice=19.99
purchaseTotals_currency=USD
payerAuthValidateService_signedPARes={value in base64: HTNH2esM9VG08e...}
...
```

#### Example (Java)

[PayerAuthValidateAndAuthorizeFullParamTest.java](https://github.com/e-payment/cybersource-soap-java/blob/master/src/test/java/test/payerauthen/PayerAuthValidateAndAuthorizeFullParamTest.java)



### 3. Capture Transaction Example

```
ccCaptureService_run=true
ccCaptureService_authRequestID=0305782650000167905080
merchantID=kr950xxxxxxx
merchantReferenceCode=23AEE8CB6B62EE2AF07
item_0_unitPrice=19.99
purchaseTotals_currency=USD
```



## Testing Payer Authentication Services

Please see [Testing Payer Authentication Services](https://github.com/e-payment/cybersource-simple-order/blob/master/doc/Payer_Authentication_SO_API.pdf) on page 32.

### Test Card

```
  Card Type    Card Number          3D secure/Non 3D
  -----------  -------------------  --------
  Visa         4000 0000 0000 0002  3D
  Visa         4111 1111 1111 1111  Non 3D
  MasterCard   5200 0000 0000 0007  3D
  MasterCard   5555 5555 5555 4444  Non 3D
```

