/**
 * TransactionProcessorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class TransactionProcessorLocator extends org.apache.axis.client.Service implements com.cybersource.stub.TransactionProcessor {

/**
 * CyberSource Web Service
 */

    public TransactionProcessorLocator() {
    }


    public TransactionProcessorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TransactionProcessorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for portXML
    private java.lang.String portXML_address = "https://ics2wstesta.ic3.com:443/commerce/1.x/transactionProcessor";

    public java.lang.String getportXMLAddress() {
        return portXML_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String portXMLWSDDServiceName = "portXML";

    public java.lang.String getportXMLWSDDServiceName() {
        return portXMLWSDDServiceName;
    }

    public void setportXMLWSDDServiceName(java.lang.String name) {
        portXMLWSDDServiceName = name;
    }

    public com.cybersource.stub.ITransactionProcessor getportXML() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(portXML_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getportXML(endpoint);
    }

    public com.cybersource.stub.ITransactionProcessor getportXML(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cybersource.stub.ITransactionProcessorStub _stub = new com.cybersource.stub.ITransactionProcessorStub(portAddress, this);
            _stub.setPortName(getportXMLWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setportXMLEndpointAddress(java.lang.String address) {
        portXML_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cybersource.stub.ITransactionProcessor.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cybersource.stub.ITransactionProcessorStub _stub = new com.cybersource.stub.ITransactionProcessorStub(new java.net.URL(portXML_address), this);
                _stub.setPortName(getportXMLWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("portXML".equals(inputPortName)) {
            return getportXML();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data:TransactionProcessor", "TransactionProcessor");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data:TransactionProcessor", "portXML"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("portXML".equals(portName)) {
            setportXMLEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
