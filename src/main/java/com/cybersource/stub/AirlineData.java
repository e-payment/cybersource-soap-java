/**
 * AirlineData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class AirlineData  implements java.io.Serializable {
    private java.lang.String agentCode;

    private java.lang.String agentName;

    private java.lang.String ticketIssuerCity;

    private java.lang.String ticketIssuerState;

    private java.lang.String ticketIssuerPostalCode;

    private java.lang.String ticketIssuerCountry;

    private java.lang.String ticketIssuerAddress;

    private java.lang.String ticketIssuerCode;

    private java.lang.String ticketIssuerName;

    private java.lang.String ticketNumber;

    private java.math.BigInteger checkDigit;

    private java.math.BigInteger restrictedTicketIndicator;

    private java.lang.String transactionType;

    private java.lang.String extendedPaymentCode;

    private java.lang.String carrierName;

    private java.lang.String passengerName;

    private com.cybersource.stub.Passenger[] passenger;

    private java.lang.String customerCode;

    private java.lang.String documentType;

    private java.lang.String documentNumber;

    private java.lang.String documentNumberOfParts;

    private java.lang.String invoiceNumber;

    private java.lang.String invoiceDate;

    private java.lang.String chargeDetails;

    private java.lang.String bookingReference;

    private java.lang.String totalFee;

    private java.lang.String clearingSequence;

    private java.math.BigInteger clearingCount;

    private java.lang.String totalClearingAmount;

    private com.cybersource.stub.Leg[] leg;

    private java.lang.String numberOfPassengers;

    private java.lang.String reservationSystem;

    private java.lang.String processIdentifier;

    private java.lang.String iataNumericCode;

    private java.lang.String ticketIssueDate;

    private java.lang.String electronicTicket;

    private java.lang.String originalTicketNumber;

    private java.lang.String purchaseType;

    private java.lang.String creditReasonIndicator;

    private java.lang.String ticketUpdateIndicator;

    private java.lang.String planNumber;

    private java.lang.String arrivalDate;

    private java.lang.String ticketRestrictionText;

    private java.lang.String exchangeTicketAmount;

    private java.lang.String exchangeTicketFee;

    private java.lang.String journeyType;

    public AirlineData() {
    }

    public AirlineData(
           java.lang.String agentCode,
           java.lang.String agentName,
           java.lang.String ticketIssuerCity,
           java.lang.String ticketIssuerState,
           java.lang.String ticketIssuerPostalCode,
           java.lang.String ticketIssuerCountry,
           java.lang.String ticketIssuerAddress,
           java.lang.String ticketIssuerCode,
           java.lang.String ticketIssuerName,
           java.lang.String ticketNumber,
           java.math.BigInteger checkDigit,
           java.math.BigInteger restrictedTicketIndicator,
           java.lang.String transactionType,
           java.lang.String extendedPaymentCode,
           java.lang.String carrierName,
           java.lang.String passengerName,
           com.cybersource.stub.Passenger[] passenger,
           java.lang.String customerCode,
           java.lang.String documentType,
           java.lang.String documentNumber,
           java.lang.String documentNumberOfParts,
           java.lang.String invoiceNumber,
           java.lang.String invoiceDate,
           java.lang.String chargeDetails,
           java.lang.String bookingReference,
           java.lang.String totalFee,
           java.lang.String clearingSequence,
           java.math.BigInteger clearingCount,
           java.lang.String totalClearingAmount,
           com.cybersource.stub.Leg[] leg,
           java.lang.String numberOfPassengers,
           java.lang.String reservationSystem,
           java.lang.String processIdentifier,
           java.lang.String iataNumericCode,
           java.lang.String ticketIssueDate,
           java.lang.String electronicTicket,
           java.lang.String originalTicketNumber,
           java.lang.String purchaseType,
           java.lang.String creditReasonIndicator,
           java.lang.String ticketUpdateIndicator,
           java.lang.String planNumber,
           java.lang.String arrivalDate,
           java.lang.String ticketRestrictionText,
           java.lang.String exchangeTicketAmount,
           java.lang.String exchangeTicketFee,
           java.lang.String journeyType) {
           this.agentCode = agentCode;
           this.agentName = agentName;
           this.ticketIssuerCity = ticketIssuerCity;
           this.ticketIssuerState = ticketIssuerState;
           this.ticketIssuerPostalCode = ticketIssuerPostalCode;
           this.ticketIssuerCountry = ticketIssuerCountry;
           this.ticketIssuerAddress = ticketIssuerAddress;
           this.ticketIssuerCode = ticketIssuerCode;
           this.ticketIssuerName = ticketIssuerName;
           this.ticketNumber = ticketNumber;
           this.checkDigit = checkDigit;
           this.restrictedTicketIndicator = restrictedTicketIndicator;
           this.transactionType = transactionType;
           this.extendedPaymentCode = extendedPaymentCode;
           this.carrierName = carrierName;
           this.passengerName = passengerName;
           this.passenger = passenger;
           this.customerCode = customerCode;
           this.documentType = documentType;
           this.documentNumber = documentNumber;
           this.documentNumberOfParts = documentNumberOfParts;
           this.invoiceNumber = invoiceNumber;
           this.invoiceDate = invoiceDate;
           this.chargeDetails = chargeDetails;
           this.bookingReference = bookingReference;
           this.totalFee = totalFee;
           this.clearingSequence = clearingSequence;
           this.clearingCount = clearingCount;
           this.totalClearingAmount = totalClearingAmount;
           this.leg = leg;
           this.numberOfPassengers = numberOfPassengers;
           this.reservationSystem = reservationSystem;
           this.processIdentifier = processIdentifier;
           this.iataNumericCode = iataNumericCode;
           this.ticketIssueDate = ticketIssueDate;
           this.electronicTicket = electronicTicket;
           this.originalTicketNumber = originalTicketNumber;
           this.purchaseType = purchaseType;
           this.creditReasonIndicator = creditReasonIndicator;
           this.ticketUpdateIndicator = ticketUpdateIndicator;
           this.planNumber = planNumber;
           this.arrivalDate = arrivalDate;
           this.ticketRestrictionText = ticketRestrictionText;
           this.exchangeTicketAmount = exchangeTicketAmount;
           this.exchangeTicketFee = exchangeTicketFee;
           this.journeyType = journeyType;
    }


    /**
     * Gets the agentCode value for this AirlineData.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this AirlineData.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the agentName value for this AirlineData.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this AirlineData.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the ticketIssuerCity value for this AirlineData.
     * 
     * @return ticketIssuerCity
     */
    public java.lang.String getTicketIssuerCity() {
        return ticketIssuerCity;
    }


    /**
     * Sets the ticketIssuerCity value for this AirlineData.
     * 
     * @param ticketIssuerCity
     */
    public void setTicketIssuerCity(java.lang.String ticketIssuerCity) {
        this.ticketIssuerCity = ticketIssuerCity;
    }


    /**
     * Gets the ticketIssuerState value for this AirlineData.
     * 
     * @return ticketIssuerState
     */
    public java.lang.String getTicketIssuerState() {
        return ticketIssuerState;
    }


    /**
     * Sets the ticketIssuerState value for this AirlineData.
     * 
     * @param ticketIssuerState
     */
    public void setTicketIssuerState(java.lang.String ticketIssuerState) {
        this.ticketIssuerState = ticketIssuerState;
    }


    /**
     * Gets the ticketIssuerPostalCode value for this AirlineData.
     * 
     * @return ticketIssuerPostalCode
     */
    public java.lang.String getTicketIssuerPostalCode() {
        return ticketIssuerPostalCode;
    }


    /**
     * Sets the ticketIssuerPostalCode value for this AirlineData.
     * 
     * @param ticketIssuerPostalCode
     */
    public void setTicketIssuerPostalCode(java.lang.String ticketIssuerPostalCode) {
        this.ticketIssuerPostalCode = ticketIssuerPostalCode;
    }


    /**
     * Gets the ticketIssuerCountry value for this AirlineData.
     * 
     * @return ticketIssuerCountry
     */
    public java.lang.String getTicketIssuerCountry() {
        return ticketIssuerCountry;
    }


    /**
     * Sets the ticketIssuerCountry value for this AirlineData.
     * 
     * @param ticketIssuerCountry
     */
    public void setTicketIssuerCountry(java.lang.String ticketIssuerCountry) {
        this.ticketIssuerCountry = ticketIssuerCountry;
    }


    /**
     * Gets the ticketIssuerAddress value for this AirlineData.
     * 
     * @return ticketIssuerAddress
     */
    public java.lang.String getTicketIssuerAddress() {
        return ticketIssuerAddress;
    }


    /**
     * Sets the ticketIssuerAddress value for this AirlineData.
     * 
     * @param ticketIssuerAddress
     */
    public void setTicketIssuerAddress(java.lang.String ticketIssuerAddress) {
        this.ticketIssuerAddress = ticketIssuerAddress;
    }


    /**
     * Gets the ticketIssuerCode value for this AirlineData.
     * 
     * @return ticketIssuerCode
     */
    public java.lang.String getTicketIssuerCode() {
        return ticketIssuerCode;
    }


    /**
     * Sets the ticketIssuerCode value for this AirlineData.
     * 
     * @param ticketIssuerCode
     */
    public void setTicketIssuerCode(java.lang.String ticketIssuerCode) {
        this.ticketIssuerCode = ticketIssuerCode;
    }


    /**
     * Gets the ticketIssuerName value for this AirlineData.
     * 
     * @return ticketIssuerName
     */
    public java.lang.String getTicketIssuerName() {
        return ticketIssuerName;
    }


    /**
     * Sets the ticketIssuerName value for this AirlineData.
     * 
     * @param ticketIssuerName
     */
    public void setTicketIssuerName(java.lang.String ticketIssuerName) {
        this.ticketIssuerName = ticketIssuerName;
    }


    /**
     * Gets the ticketNumber value for this AirlineData.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this AirlineData.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the checkDigit value for this AirlineData.
     * 
     * @return checkDigit
     */
    public java.math.BigInteger getCheckDigit() {
        return checkDigit;
    }


    /**
     * Sets the checkDigit value for this AirlineData.
     * 
     * @param checkDigit
     */
    public void setCheckDigit(java.math.BigInteger checkDigit) {
        this.checkDigit = checkDigit;
    }


    /**
     * Gets the restrictedTicketIndicator value for this AirlineData.
     * 
     * @return restrictedTicketIndicator
     */
    public java.math.BigInteger getRestrictedTicketIndicator() {
        return restrictedTicketIndicator;
    }


    /**
     * Sets the restrictedTicketIndicator value for this AirlineData.
     * 
     * @param restrictedTicketIndicator
     */
    public void setRestrictedTicketIndicator(java.math.BigInteger restrictedTicketIndicator) {
        this.restrictedTicketIndicator = restrictedTicketIndicator;
    }


    /**
     * Gets the transactionType value for this AirlineData.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this AirlineData.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the extendedPaymentCode value for this AirlineData.
     * 
     * @return extendedPaymentCode
     */
    public java.lang.String getExtendedPaymentCode() {
        return extendedPaymentCode;
    }


    /**
     * Sets the extendedPaymentCode value for this AirlineData.
     * 
     * @param extendedPaymentCode
     */
    public void setExtendedPaymentCode(java.lang.String extendedPaymentCode) {
        this.extendedPaymentCode = extendedPaymentCode;
    }


    /**
     * Gets the carrierName value for this AirlineData.
     * 
     * @return carrierName
     */
    public java.lang.String getCarrierName() {
        return carrierName;
    }


    /**
     * Sets the carrierName value for this AirlineData.
     * 
     * @param carrierName
     */
    public void setCarrierName(java.lang.String carrierName) {
        this.carrierName = carrierName;
    }


    /**
     * Gets the passengerName value for this AirlineData.
     * 
     * @return passengerName
     */
    public java.lang.String getPassengerName() {
        return passengerName;
    }


    /**
     * Sets the passengerName value for this AirlineData.
     * 
     * @param passengerName
     */
    public void setPassengerName(java.lang.String passengerName) {
        this.passengerName = passengerName;
    }


    /**
     * Gets the passenger value for this AirlineData.
     * 
     * @return passenger
     */
    public com.cybersource.stub.Passenger[] getPassenger() {
        return passenger;
    }


    /**
     * Sets the passenger value for this AirlineData.
     * 
     * @param passenger
     */
    public void setPassenger(com.cybersource.stub.Passenger[] passenger) {
        this.passenger = passenger;
    }

    public com.cybersource.stub.Passenger getPassenger(int i) {
        return this.passenger[i];
    }

    public void setPassenger(int i, com.cybersource.stub.Passenger _value) {
        this.passenger[i] = _value;
    }


    /**
     * Gets the customerCode value for this AirlineData.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this AirlineData.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the documentType value for this AirlineData.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this AirlineData.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the documentNumber value for this AirlineData.
     * 
     * @return documentNumber
     */
    public java.lang.String getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this AirlineData.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.String documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentNumberOfParts value for this AirlineData.
     * 
     * @return documentNumberOfParts
     */
    public java.lang.String getDocumentNumberOfParts() {
        return documentNumberOfParts;
    }


    /**
     * Sets the documentNumberOfParts value for this AirlineData.
     * 
     * @param documentNumberOfParts
     */
    public void setDocumentNumberOfParts(java.lang.String documentNumberOfParts) {
        this.documentNumberOfParts = documentNumberOfParts;
    }


    /**
     * Gets the invoiceNumber value for this AirlineData.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this AirlineData.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the invoiceDate value for this AirlineData.
     * 
     * @return invoiceDate
     */
    public java.lang.String getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this AirlineData.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.lang.String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the chargeDetails value for this AirlineData.
     * 
     * @return chargeDetails
     */
    public java.lang.String getChargeDetails() {
        return chargeDetails;
    }


    /**
     * Sets the chargeDetails value for this AirlineData.
     * 
     * @param chargeDetails
     */
    public void setChargeDetails(java.lang.String chargeDetails) {
        this.chargeDetails = chargeDetails;
    }


    /**
     * Gets the bookingReference value for this AirlineData.
     * 
     * @return bookingReference
     */
    public java.lang.String getBookingReference() {
        return bookingReference;
    }


    /**
     * Sets the bookingReference value for this AirlineData.
     * 
     * @param bookingReference
     */
    public void setBookingReference(java.lang.String bookingReference) {
        this.bookingReference = bookingReference;
    }


    /**
     * Gets the totalFee value for this AirlineData.
     * 
     * @return totalFee
     */
    public java.lang.String getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this AirlineData.
     * 
     * @param totalFee
     */
    public void setTotalFee(java.lang.String totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * Gets the clearingSequence value for this AirlineData.
     * 
     * @return clearingSequence
     */
    public java.lang.String getClearingSequence() {
        return clearingSequence;
    }


    /**
     * Sets the clearingSequence value for this AirlineData.
     * 
     * @param clearingSequence
     */
    public void setClearingSequence(java.lang.String clearingSequence) {
        this.clearingSequence = clearingSequence;
    }


    /**
     * Gets the clearingCount value for this AirlineData.
     * 
     * @return clearingCount
     */
    public java.math.BigInteger getClearingCount() {
        return clearingCount;
    }


    /**
     * Sets the clearingCount value for this AirlineData.
     * 
     * @param clearingCount
     */
    public void setClearingCount(java.math.BigInteger clearingCount) {
        this.clearingCount = clearingCount;
    }


    /**
     * Gets the totalClearingAmount value for this AirlineData.
     * 
     * @return totalClearingAmount
     */
    public java.lang.String getTotalClearingAmount() {
        return totalClearingAmount;
    }


    /**
     * Sets the totalClearingAmount value for this AirlineData.
     * 
     * @param totalClearingAmount
     */
    public void setTotalClearingAmount(java.lang.String totalClearingAmount) {
        this.totalClearingAmount = totalClearingAmount;
    }


    /**
     * Gets the leg value for this AirlineData.
     * 
     * @return leg
     */
    public com.cybersource.stub.Leg[] getLeg() {
        return leg;
    }


    /**
     * Sets the leg value for this AirlineData.
     * 
     * @param leg
     */
    public void setLeg(com.cybersource.stub.Leg[] leg) {
        this.leg = leg;
    }

    public com.cybersource.stub.Leg getLeg(int i) {
        return this.leg[i];
    }

    public void setLeg(int i, com.cybersource.stub.Leg _value) {
        this.leg[i] = _value;
    }


    /**
     * Gets the numberOfPassengers value for this AirlineData.
     * 
     * @return numberOfPassengers
     */
    public java.lang.String getNumberOfPassengers() {
        return numberOfPassengers;
    }


    /**
     * Sets the numberOfPassengers value for this AirlineData.
     * 
     * @param numberOfPassengers
     */
    public void setNumberOfPassengers(java.lang.String numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    /**
     * Gets the reservationSystem value for this AirlineData.
     * 
     * @return reservationSystem
     */
    public java.lang.String getReservationSystem() {
        return reservationSystem;
    }


    /**
     * Sets the reservationSystem value for this AirlineData.
     * 
     * @param reservationSystem
     */
    public void setReservationSystem(java.lang.String reservationSystem) {
        this.reservationSystem = reservationSystem;
    }


    /**
     * Gets the processIdentifier value for this AirlineData.
     * 
     * @return processIdentifier
     */
    public java.lang.String getProcessIdentifier() {
        return processIdentifier;
    }


    /**
     * Sets the processIdentifier value for this AirlineData.
     * 
     * @param processIdentifier
     */
    public void setProcessIdentifier(java.lang.String processIdentifier) {
        this.processIdentifier = processIdentifier;
    }


    /**
     * Gets the iataNumericCode value for this AirlineData.
     * 
     * @return iataNumericCode
     */
    public java.lang.String getIataNumericCode() {
        return iataNumericCode;
    }


    /**
     * Sets the iataNumericCode value for this AirlineData.
     * 
     * @param iataNumericCode
     */
    public void setIataNumericCode(java.lang.String iataNumericCode) {
        this.iataNumericCode = iataNumericCode;
    }


    /**
     * Gets the ticketIssueDate value for this AirlineData.
     * 
     * @return ticketIssueDate
     */
    public java.lang.String getTicketIssueDate() {
        return ticketIssueDate;
    }


    /**
     * Sets the ticketIssueDate value for this AirlineData.
     * 
     * @param ticketIssueDate
     */
    public void setTicketIssueDate(java.lang.String ticketIssueDate) {
        this.ticketIssueDate = ticketIssueDate;
    }


    /**
     * Gets the electronicTicket value for this AirlineData.
     * 
     * @return electronicTicket
     */
    public java.lang.String getElectronicTicket() {
        return electronicTicket;
    }


    /**
     * Sets the electronicTicket value for this AirlineData.
     * 
     * @param electronicTicket
     */
    public void setElectronicTicket(java.lang.String electronicTicket) {
        this.electronicTicket = electronicTicket;
    }


    /**
     * Gets the originalTicketNumber value for this AirlineData.
     * 
     * @return originalTicketNumber
     */
    public java.lang.String getOriginalTicketNumber() {
        return originalTicketNumber;
    }


    /**
     * Sets the originalTicketNumber value for this AirlineData.
     * 
     * @param originalTicketNumber
     */
    public void setOriginalTicketNumber(java.lang.String originalTicketNumber) {
        this.originalTicketNumber = originalTicketNumber;
    }


    /**
     * Gets the purchaseType value for this AirlineData.
     * 
     * @return purchaseType
     */
    public java.lang.String getPurchaseType() {
        return purchaseType;
    }


    /**
     * Sets the purchaseType value for this AirlineData.
     * 
     * @param purchaseType
     */
    public void setPurchaseType(java.lang.String purchaseType) {
        this.purchaseType = purchaseType;
    }


    /**
     * Gets the creditReasonIndicator value for this AirlineData.
     * 
     * @return creditReasonIndicator
     */
    public java.lang.String getCreditReasonIndicator() {
        return creditReasonIndicator;
    }


    /**
     * Sets the creditReasonIndicator value for this AirlineData.
     * 
     * @param creditReasonIndicator
     */
    public void setCreditReasonIndicator(java.lang.String creditReasonIndicator) {
        this.creditReasonIndicator = creditReasonIndicator;
    }


    /**
     * Gets the ticketUpdateIndicator value for this AirlineData.
     * 
     * @return ticketUpdateIndicator
     */
    public java.lang.String getTicketUpdateIndicator() {
        return ticketUpdateIndicator;
    }


    /**
     * Sets the ticketUpdateIndicator value for this AirlineData.
     * 
     * @param ticketUpdateIndicator
     */
    public void setTicketUpdateIndicator(java.lang.String ticketUpdateIndicator) {
        this.ticketUpdateIndicator = ticketUpdateIndicator;
    }


    /**
     * Gets the planNumber value for this AirlineData.
     * 
     * @return planNumber
     */
    public java.lang.String getPlanNumber() {
        return planNumber;
    }


    /**
     * Sets the planNumber value for this AirlineData.
     * 
     * @param planNumber
     */
    public void setPlanNumber(java.lang.String planNumber) {
        this.planNumber = planNumber;
    }


    /**
     * Gets the arrivalDate value for this AirlineData.
     * 
     * @return arrivalDate
     */
    public java.lang.String getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this AirlineData.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.lang.String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the ticketRestrictionText value for this AirlineData.
     * 
     * @return ticketRestrictionText
     */
    public java.lang.String getTicketRestrictionText() {
        return ticketRestrictionText;
    }


    /**
     * Sets the ticketRestrictionText value for this AirlineData.
     * 
     * @param ticketRestrictionText
     */
    public void setTicketRestrictionText(java.lang.String ticketRestrictionText) {
        this.ticketRestrictionText = ticketRestrictionText;
    }


    /**
     * Gets the exchangeTicketAmount value for this AirlineData.
     * 
     * @return exchangeTicketAmount
     */
    public java.lang.String getExchangeTicketAmount() {
        return exchangeTicketAmount;
    }


    /**
     * Sets the exchangeTicketAmount value for this AirlineData.
     * 
     * @param exchangeTicketAmount
     */
    public void setExchangeTicketAmount(java.lang.String exchangeTicketAmount) {
        this.exchangeTicketAmount = exchangeTicketAmount;
    }


    /**
     * Gets the exchangeTicketFee value for this AirlineData.
     * 
     * @return exchangeTicketFee
     */
    public java.lang.String getExchangeTicketFee() {
        return exchangeTicketFee;
    }


    /**
     * Sets the exchangeTicketFee value for this AirlineData.
     * 
     * @param exchangeTicketFee
     */
    public void setExchangeTicketFee(java.lang.String exchangeTicketFee) {
        this.exchangeTicketFee = exchangeTicketFee;
    }


    /**
     * Gets the journeyType value for this AirlineData.
     * 
     * @return journeyType
     */
    public java.lang.String getJourneyType() {
        return journeyType;
    }


    /**
     * Sets the journeyType value for this AirlineData.
     * 
     * @param journeyType
     */
    public void setJourneyType(java.lang.String journeyType) {
        this.journeyType = journeyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineData)) return false;
        AirlineData other = (AirlineData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.ticketIssuerCity==null && other.getTicketIssuerCity()==null) || 
             (this.ticketIssuerCity!=null &&
              this.ticketIssuerCity.equals(other.getTicketIssuerCity()))) &&
            ((this.ticketIssuerState==null && other.getTicketIssuerState()==null) || 
             (this.ticketIssuerState!=null &&
              this.ticketIssuerState.equals(other.getTicketIssuerState()))) &&
            ((this.ticketIssuerPostalCode==null && other.getTicketIssuerPostalCode()==null) || 
             (this.ticketIssuerPostalCode!=null &&
              this.ticketIssuerPostalCode.equals(other.getTicketIssuerPostalCode()))) &&
            ((this.ticketIssuerCountry==null && other.getTicketIssuerCountry()==null) || 
             (this.ticketIssuerCountry!=null &&
              this.ticketIssuerCountry.equals(other.getTicketIssuerCountry()))) &&
            ((this.ticketIssuerAddress==null && other.getTicketIssuerAddress()==null) || 
             (this.ticketIssuerAddress!=null &&
              this.ticketIssuerAddress.equals(other.getTicketIssuerAddress()))) &&
            ((this.ticketIssuerCode==null && other.getTicketIssuerCode()==null) || 
             (this.ticketIssuerCode!=null &&
              this.ticketIssuerCode.equals(other.getTicketIssuerCode()))) &&
            ((this.ticketIssuerName==null && other.getTicketIssuerName()==null) || 
             (this.ticketIssuerName!=null &&
              this.ticketIssuerName.equals(other.getTicketIssuerName()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.checkDigit==null && other.getCheckDigit()==null) || 
             (this.checkDigit!=null &&
              this.checkDigit.equals(other.getCheckDigit()))) &&
            ((this.restrictedTicketIndicator==null && other.getRestrictedTicketIndicator()==null) || 
             (this.restrictedTicketIndicator!=null &&
              this.restrictedTicketIndicator.equals(other.getRestrictedTicketIndicator()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.extendedPaymentCode==null && other.getExtendedPaymentCode()==null) || 
             (this.extendedPaymentCode!=null &&
              this.extendedPaymentCode.equals(other.getExtendedPaymentCode()))) &&
            ((this.carrierName==null && other.getCarrierName()==null) || 
             (this.carrierName!=null &&
              this.carrierName.equals(other.getCarrierName()))) &&
            ((this.passengerName==null && other.getPassengerName()==null) || 
             (this.passengerName!=null &&
              this.passengerName.equals(other.getPassengerName()))) &&
            ((this.passenger==null && other.getPassenger()==null) || 
             (this.passenger!=null &&
              java.util.Arrays.equals(this.passenger, other.getPassenger()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.documentNumberOfParts==null && other.getDocumentNumberOfParts()==null) || 
             (this.documentNumberOfParts!=null &&
              this.documentNumberOfParts.equals(other.getDocumentNumberOfParts()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.chargeDetails==null && other.getChargeDetails()==null) || 
             (this.chargeDetails!=null &&
              this.chargeDetails.equals(other.getChargeDetails()))) &&
            ((this.bookingReference==null && other.getBookingReference()==null) || 
             (this.bookingReference!=null &&
              this.bookingReference.equals(other.getBookingReference()))) &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee()))) &&
            ((this.clearingSequence==null && other.getClearingSequence()==null) || 
             (this.clearingSequence!=null &&
              this.clearingSequence.equals(other.getClearingSequence()))) &&
            ((this.clearingCount==null && other.getClearingCount()==null) || 
             (this.clearingCount!=null &&
              this.clearingCount.equals(other.getClearingCount()))) &&
            ((this.totalClearingAmount==null && other.getTotalClearingAmount()==null) || 
             (this.totalClearingAmount!=null &&
              this.totalClearingAmount.equals(other.getTotalClearingAmount()))) &&
            ((this.leg==null && other.getLeg()==null) || 
             (this.leg!=null &&
              java.util.Arrays.equals(this.leg, other.getLeg()))) &&
            ((this.numberOfPassengers==null && other.getNumberOfPassengers()==null) || 
             (this.numberOfPassengers!=null &&
              this.numberOfPassengers.equals(other.getNumberOfPassengers()))) &&
            ((this.reservationSystem==null && other.getReservationSystem()==null) || 
             (this.reservationSystem!=null &&
              this.reservationSystem.equals(other.getReservationSystem()))) &&
            ((this.processIdentifier==null && other.getProcessIdentifier()==null) || 
             (this.processIdentifier!=null &&
              this.processIdentifier.equals(other.getProcessIdentifier()))) &&
            ((this.iataNumericCode==null && other.getIataNumericCode()==null) || 
             (this.iataNumericCode!=null &&
              this.iataNumericCode.equals(other.getIataNumericCode()))) &&
            ((this.ticketIssueDate==null && other.getTicketIssueDate()==null) || 
             (this.ticketIssueDate!=null &&
              this.ticketIssueDate.equals(other.getTicketIssueDate()))) &&
            ((this.electronicTicket==null && other.getElectronicTicket()==null) || 
             (this.electronicTicket!=null &&
              this.electronicTicket.equals(other.getElectronicTicket()))) &&
            ((this.originalTicketNumber==null && other.getOriginalTicketNumber()==null) || 
             (this.originalTicketNumber!=null &&
              this.originalTicketNumber.equals(other.getOriginalTicketNumber()))) &&
            ((this.purchaseType==null && other.getPurchaseType()==null) || 
             (this.purchaseType!=null &&
              this.purchaseType.equals(other.getPurchaseType()))) &&
            ((this.creditReasonIndicator==null && other.getCreditReasonIndicator()==null) || 
             (this.creditReasonIndicator!=null &&
              this.creditReasonIndicator.equals(other.getCreditReasonIndicator()))) &&
            ((this.ticketUpdateIndicator==null && other.getTicketUpdateIndicator()==null) || 
             (this.ticketUpdateIndicator!=null &&
              this.ticketUpdateIndicator.equals(other.getTicketUpdateIndicator()))) &&
            ((this.planNumber==null && other.getPlanNumber()==null) || 
             (this.planNumber!=null &&
              this.planNumber.equals(other.getPlanNumber()))) &&
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.ticketRestrictionText==null && other.getTicketRestrictionText()==null) || 
             (this.ticketRestrictionText!=null &&
              this.ticketRestrictionText.equals(other.getTicketRestrictionText()))) &&
            ((this.exchangeTicketAmount==null && other.getExchangeTicketAmount()==null) || 
             (this.exchangeTicketAmount!=null &&
              this.exchangeTicketAmount.equals(other.getExchangeTicketAmount()))) &&
            ((this.exchangeTicketFee==null && other.getExchangeTicketFee()==null) || 
             (this.exchangeTicketFee!=null &&
              this.exchangeTicketFee.equals(other.getExchangeTicketFee()))) &&
            ((this.journeyType==null && other.getJourneyType()==null) || 
             (this.journeyType!=null &&
              this.journeyType.equals(other.getJourneyType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getTicketIssuerCity() != null) {
            _hashCode += getTicketIssuerCity().hashCode();
        }
        if (getTicketIssuerState() != null) {
            _hashCode += getTicketIssuerState().hashCode();
        }
        if (getTicketIssuerPostalCode() != null) {
            _hashCode += getTicketIssuerPostalCode().hashCode();
        }
        if (getTicketIssuerCountry() != null) {
            _hashCode += getTicketIssuerCountry().hashCode();
        }
        if (getTicketIssuerAddress() != null) {
            _hashCode += getTicketIssuerAddress().hashCode();
        }
        if (getTicketIssuerCode() != null) {
            _hashCode += getTicketIssuerCode().hashCode();
        }
        if (getTicketIssuerName() != null) {
            _hashCode += getTicketIssuerName().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getCheckDigit() != null) {
            _hashCode += getCheckDigit().hashCode();
        }
        if (getRestrictedTicketIndicator() != null) {
            _hashCode += getRestrictedTicketIndicator().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getExtendedPaymentCode() != null) {
            _hashCode += getExtendedPaymentCode().hashCode();
        }
        if (getCarrierName() != null) {
            _hashCode += getCarrierName().hashCode();
        }
        if (getPassengerName() != null) {
            _hashCode += getPassengerName().hashCode();
        }
        if (getPassenger() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassenger());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassenger(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getDocumentNumberOfParts() != null) {
            _hashCode += getDocumentNumberOfParts().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getChargeDetails() != null) {
            _hashCode += getChargeDetails().hashCode();
        }
        if (getBookingReference() != null) {
            _hashCode += getBookingReference().hashCode();
        }
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        if (getClearingSequence() != null) {
            _hashCode += getClearingSequence().hashCode();
        }
        if (getClearingCount() != null) {
            _hashCode += getClearingCount().hashCode();
        }
        if (getTotalClearingAmount() != null) {
            _hashCode += getTotalClearingAmount().hashCode();
        }
        if (getLeg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumberOfPassengers() != null) {
            _hashCode += getNumberOfPassengers().hashCode();
        }
        if (getReservationSystem() != null) {
            _hashCode += getReservationSystem().hashCode();
        }
        if (getProcessIdentifier() != null) {
            _hashCode += getProcessIdentifier().hashCode();
        }
        if (getIataNumericCode() != null) {
            _hashCode += getIataNumericCode().hashCode();
        }
        if (getTicketIssueDate() != null) {
            _hashCode += getTicketIssueDate().hashCode();
        }
        if (getElectronicTicket() != null) {
            _hashCode += getElectronicTicket().hashCode();
        }
        if (getOriginalTicketNumber() != null) {
            _hashCode += getOriginalTicketNumber().hashCode();
        }
        if (getPurchaseType() != null) {
            _hashCode += getPurchaseType().hashCode();
        }
        if (getCreditReasonIndicator() != null) {
            _hashCode += getCreditReasonIndicator().hashCode();
        }
        if (getTicketUpdateIndicator() != null) {
            _hashCode += getTicketUpdateIndicator().hashCode();
        }
        if (getPlanNumber() != null) {
            _hashCode += getPlanNumber().hashCode();
        }
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getTicketRestrictionText() != null) {
            _hashCode += getTicketRestrictionText().hashCode();
        }
        if (getExchangeTicketAmount() != null) {
            _hashCode += getExchangeTicketAmount().hashCode();
        }
        if (getExchangeTicketFee() != null) {
            _hashCode += getExchangeTicketFee().hashCode();
        }
        if (getJourneyType() != null) {
            _hashCode += getJourneyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "AirlineData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDigit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "checkDigit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedTicketIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "restrictedTicketIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedPaymentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "extendedPaymentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "carrierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passengerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passenger");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "passenger"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Passenger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "documentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumberOfParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "documentNumberOfParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "chargeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bookingReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clearingSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "clearingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalClearingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "totalClearingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "leg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Leg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPassengers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "numberOfPassengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "reservationSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "processIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iataNumericCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "iataNumericCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "electronicTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalTicketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "originalTicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "purchaseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReasonIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "creditReasonIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketUpdateIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketUpdateIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "planNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "arrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketRestrictionText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "ticketRestrictionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeTicketAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "exchangeTicketAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeTicketFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "exchangeTicketFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "journeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
