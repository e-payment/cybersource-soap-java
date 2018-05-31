CyberSource Soap Java
=====================

## Configuration

create file `cybs.properties` for setup configuration

example for unit test
`src/test/resouces/cybs.properties`

```
merchant.id     = {merchant_id}
transaction.key = {transaction_key}

env             = test
env.test.url    = https://ics2wstest.ic3.com/commerce/1.x/transactionProcessor
env.live.url    = https://ics2ws.ic3.com/commerce/1.x/transactionProcessor

proxy.enable    = false
proxy.host      = localhost
proxy.port      = 3128
proxy.username  = username
proxy.password  = xxxxxxxx
```

## Testing

```
mvn clean test
```

### Expect Result

```
Running test.CyberSourceSoapTest
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - *** ENVIRONMENT : test => https://ics2wstest.ic3.com/commerce/1.x/transactionProcessor
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - merchant Id     : kr950xxxxxxx
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - decision        : ACCEPT
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - reasonCode      : 100
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - requestID       : 5277428990006410103011
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - requestToken    :
Ahj/7wSTHhcKKWTImEjjQSzVk3btGThy5YMGDZoxYMWDNgxYqLyYT+z+AVF5MJ/Z/aQN/pP60MmkmWLr4F3UwJyY8LhRSyZEwkcY9kYM
DEBUG [main] test.CyberSourceSoapTest.shoudAuth() - auth.reasonCode : 100
```

## For update API version

```
cd src/main/resources/wsdl

wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.142.wsdl CyberSourceTransaction.wsdl
wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.142.xsd

cd /project/directory
mvn clean axistools:wsdl2java
```
