CyberSource Soap Java
=====================


```
cd src/main/resources/wsdl

wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.142.wsdl CyberSourceTransaction.wsdl
wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.142.xsd

cd /base/dir
mvn clean axistools:wsdl2java
```

 
## Configuration

create file /class/path/`cybs.properties`

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