/**
 * ITransactionProcessorStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class ITransactionProcessorStub extends org.apache.axis.client.Stub implements com.cybersource.stub.ITransactionProcessor {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("runTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "requestMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RequestMessage"), com.cybersource.stub.RequestMessage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ReplyMessage"));
        oper.setReturnClass(com.cybersource.stub.ReplyMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "replyMessage"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public ITransactionProcessorStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ITransactionProcessorStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ITransactionProcessorStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AdditionalFields");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AdditionalFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Address");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AFSReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AFSReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AFSService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AFSService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Aft");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Aft.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AirlineData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AirlineData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "amount");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AncillaryData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AncillaryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AP");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APAuthReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APAuthReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APAuthReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APAuthService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APAuthService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APBillingAgreementReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APBillingAgreementReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APBillingAgreementService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APBillingAgreementService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCancelReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCancelReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCancelService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCancelService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCaptureReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCaptureReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCaptureService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCaptureService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckOutDetailsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCheckOutDetailsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckOutDetailsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCheckOutDetailsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckStatusReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCheckStatusReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APCheckStatusService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APCheckStatusService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APConfirmPurchaseReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APConfirmPurchaseReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APConfirmPurchaseService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APConfirmPurchaseService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APDevice");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APInitiateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APInitiateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APInitiateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APInitiateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOptionsOption");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APOptionsOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOptionsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APOptionsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOptionsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APOptionsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOrderReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APOrderReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APOrderService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APOrderService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APRefundReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APRefundReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APRefundService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APRefundService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSaleReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APSaleReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSaleService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APSaleService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSessionsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APSessionsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APSessionsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APSessionsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APTransactionDetailsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APTransactionDetailsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APTransactionDetailsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APTransactionDetailsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APUI");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.APUI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AutoRentalData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.AutoRentalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankInfo");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRealTimeReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferRealTimeReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRealTimeService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferRealTimeService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRefundReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferRefundReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferRefundService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferRefundService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BankTransferService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BankTransferService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Batch");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Batch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BillTo");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BillTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BinLookupReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BinLookupReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BinLookupService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BinLookupService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BML");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BoletoPaymentReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BoletoPaymentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BoletoPaymentService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BoletoPaymentService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "boolean");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "BusinessRules");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.BusinessRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Card");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Card.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CaseManagementActionReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CaseManagementActionReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CaseManagementActionService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CaseManagementActionService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAuthReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAuthReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAuthReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAuthService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAuthService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAutoAuthReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAutoAuthReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCAutoAuthReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCAutoAuthReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCaptureReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCCaptureReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCaptureService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCCaptureService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCreditReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCCreditReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCCreditService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCCreditService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCDCCReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCDCCService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCDCCUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCDCCUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCDCCUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCIncrementalAuthReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCIncrementalAuthReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCIncrementalAuthService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCIncrementalAuthService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleCreditReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleCreditReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleCreditService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleCreditService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "CCSaleService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.CCSaleService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Check");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Check.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaPaymentReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ChinaPaymentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaPaymentService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ChinaPaymentService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaRefundReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ChinaRefundReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ChinaRefundService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ChinaRefundService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "dateTime");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DAVReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DAVReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DAVService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DAVService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DCC");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DCC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionManager");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecisionManager.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionManagerTravelData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecisionManagerTravelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionManagerTravelLeg");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecisionManagerTravelLeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecisionReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecisionReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecryptVisaCheckoutDataReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecryptVisaCheckoutDataReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DecryptVisaCheckoutDataService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DecryptVisaCheckoutDataService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DeniedPartiesMatch");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DeniedPartiesMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DeviceFingerprint");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DeviceFingerprint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitMandateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitMandateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitMandateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitMandateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitRefundReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitRefundReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitRefundService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitRefundService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitValidateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitValidateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DirectDebitValidateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DirectDebitValidateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DMEReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DMEReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "DMEService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.DMEService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECAuthenticateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECAuthenticateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECAuthenticateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECAuthenticateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECCreditReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECCreditReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECCreditService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECCreditService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECDebitReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECDebitReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ECDebitService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ECDebitService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Element");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.EmvReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EmvRequest");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.EmvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptedPayment");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.EncryptedPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptPaymentDataReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.EncryptPaymentDataReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "EncryptPaymentDataService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.EncryptPaymentDataService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ExportReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ExportReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ExportService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ExportService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FaultDetails");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FaultDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Field");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FraudUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FraudUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FraudUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FraudUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FundingTotals");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FundingTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FundTransfer");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FundTransfer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FXQuote");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FXQuote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FXRatesReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FXRatesReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "FXRatesService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.FXRatesService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GECC");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.GECC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GetVisaCheckoutDataReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.GetVisaCheckoutDataReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "GETVisaCheckoutDataService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.GETVisaCheckoutDataService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataCreateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.HostedDataCreateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataCreateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.HostedDataCreateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataRetrieveReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.HostedDataRetrieveReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "HostedDataRetrieveService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.HostedDataRetrieveService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Installment");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Installment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "InvoiceHeader");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.InvoiceHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issuer");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Issuer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Item");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "JPO");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.JPO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Leg");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Leg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Loan");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Loan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "LodgingData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.LodgingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MDDField");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.MDDField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MerchantDefinedData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.MerchantDefinedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MerchantSecureData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.MerchantSecureData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "MorphingElement");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.MorphingElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OCTReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.OCTReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OCTService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.OCTService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OriginalTransaction");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.OriginalTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "OtherTax");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.OtherTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Passenger");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Passenger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthEnrollReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayerAuthEnrollReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthEnrollService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayerAuthEnrollService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthValidateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayerAuthValidateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayerAuthValidateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayerAuthValidateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaymentNetworkToken");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaymentNetworkToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPal");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthorizationReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalAuthorizationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthorizationService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalAuthorizationService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalAuthReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalAuthReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalAuthReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalButtonCreateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalButtonCreateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalButtonCreateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalButtonCreateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreateAgreementReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalCreateAgreementReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreateAgreementService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalCreateAgreementService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreditReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalCreditReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalCreditService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalCreditService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoCaptureReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalDoCaptureReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoCaptureService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalDoCaptureService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoRefTransactionReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalDoRefTransactionReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalDoRefTransactionService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalDoRefTransactionService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcDoPaymentReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcDoPaymentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcDoPaymentService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcDoPaymentService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcGetDetailsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcGetDetailsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcGetDetailsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcGetDetailsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcOrderSetupReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcOrderSetupReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcOrderSetupService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcOrderSetupService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcSetReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcSetReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalEcSetService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalEcSetService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalGetTxnDetailsReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalGetTxnDetailsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalGetTxnDetailsService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalGetTxnDetailsService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPaymentReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPaymentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPaymentService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPaymentService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedPaymentReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPreapprovedPaymentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedPaymentService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPreapprovedPaymentService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPreapprovedUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalPreapprovedUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalPreapprovedUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalRefundReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalRefundReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalRefundService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalRefundService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaypalTransaction");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaypalTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalTransactionSearchReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalTransactionSearchReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalTransactionSearchService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalTransactionSearchService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalUpdateAgreementReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalUpdateAgreementReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PayPalUpdateAgreementService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PayPalUpdateAgreementService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionCreateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionCreateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionCreateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionCreateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionDeleteReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionDeleteReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionDeleteService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionDeleteService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionEvent");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionEventUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionEventUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionEventUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionEventUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionRetrieveReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionRetrieveReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionRetrieveService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionRetrieveService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PaySubscriptionUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PaySubscriptionUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PersonalID");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PersonalID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Pin");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Pin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitCreditReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitCreditReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitCreditService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitCreditService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitPurchaseReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitPurchaseReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitPurchaseService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitPurchaseService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinDebitReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinDebitReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReversalReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitReversalReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitReversalService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitReversalService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitValidateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitValidateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PinlessDebitValidateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PinlessDebitValidateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Pos");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Pos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ProfileReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ProfileReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Promotion");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Promotion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PromotionGroup");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PromotionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PromotionGroupReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PromotionGroupReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "PurchaseTotals");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.PurchaseTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Recipient");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Recipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RecurringSubscriptionInfo");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RecurringSubscriptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ReplyMessage");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ReplyMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ReplyReserved");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ReplyReserved.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RequestMessage");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RequestMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RequestReserved");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RequestReserved.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RiskUpdateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RiskUpdateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RiskUpdateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RiskUpdateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RuleResultItem");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RuleResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "RuleResultItems");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.RuleResultItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "SellerProtection");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.SellerProtection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Sender");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Sender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Service");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFee");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ServiceFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFeeCalculateReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ServiceFeeCalculateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ServiceFeeCalculateService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ServiceFeeCalculateService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ShipFrom");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ShipFrom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ShipTo");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.ShipTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Subscription");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.TaxReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReplyItem");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.TaxReplyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxReplyItemJurisdiction");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.TaxReplyItemJurisdiction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TaxService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.TaxService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Token");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "TransactionMetadataService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.TransactionMetadataService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "UCAF");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.UCAF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VC");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCCardArt");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VCCardArt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCCustomData");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VCCustomData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VCReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VCReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VerificationReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VerificationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VerificationService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VerificationService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VoidReply");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VoidReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "VoidService");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.VoidService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Wallet");
            cachedSerQNames.add(qName);
            cls = com.cybersource.stub.Wallet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.cybersource.stub.ReplyMessage runTransaction(com.cybersource.stub.RequestMessage input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("runTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "runTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.cybersource.stub.ReplyMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.cybersource.stub.ReplyMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.cybersource.stub.ReplyMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
