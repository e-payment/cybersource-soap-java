CyberSource Soap Java
=====================

This is the Java client for the [CyberSource SOAP Toolkit API](http://www.cybersource.com/developers/getting_started/integration_methods/soap_toolkit_api).

## Prerequisites

- Java SDK `version 1.8` (Only)
- A CyberSource account. You can create an evaluation account [here](http://www.cybersource.com/register/).
- A CyberSource transaction key. You will need to set your **merchant Id** and **transaction key** in the `cybs.properties`. Instructions on obtaining a transaction key can be found [here](http://apps.cybersource.com/library/documentation/dev_guides/SOAP_Toolkits/html/wwhelp/wwhimpl/js/html/wwhelp.htm#href=Intro.04.3.html).

## Configuration

create file `cybs.properties` for setup configuration

example: `src/test/resouces/cybs.properties`
```
merchant.id     = {merchant_id}
transaction.key = {transaction_key}

env             = test
env.test.url    = https://ics2wstest.ic3.com/commerce/1.x/transactionProcessor
env.live.url    = https://ics2ws.ic3.com/commerce/1.x/transactionProcessor

report.test.url = https://ebctest.cybersource.com/ebctest/Query
report.live.url = https://ebc.cybersource.com/ebc/Query

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


### Payer Authen (3D-Secure) Testing

```
cd test-3ds-web
mvn clean jetty:run
```

http://localhost:8088/

## For update API version

```
cd src/main/resources/wsdl

wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.155.wsdl CyberSourceTransaction.wsdl
wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.155.xsd

cd /project/directory
mvn clean axistools:wsdl2java
```

## TODO
- [ ] Migrate axis to cxf, axis2 or jax-ws
    - [Difference between JAX-WS, Axis2 and CXF](https://stackoverflow.com/questions/11566609/difference-between-jax-ws-axis2-and-cxf/11567163)
    - [Apache Axis2, CXF and Sun JAX-WS RI in comparison](https://www.predic8.com/axis2-cxf-jax-ws-comparison.htm)
- [ ] xxx