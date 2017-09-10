
```
cd src/main/resources/wsdl
wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.141.wsdl CyberSourceTransaction.wsdl
wget https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.141.xsd

cd /base/dir
mvn clean axistools:wsdl2java
```