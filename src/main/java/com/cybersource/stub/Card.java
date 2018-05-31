/**
 * Card.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class Card  implements java.io.Serializable {
    private java.lang.String fullName;

    private java.lang.String accountNumber;

    private java.math.BigInteger expirationMonth;

    private java.math.BigInteger expirationYear;

    private java.lang.String cvIndicator;

    private java.lang.String cvNumber;

    private java.lang.String cardType;

    private java.lang.String issueNumber;

    private java.math.BigInteger startMonth;

    private java.math.BigInteger startYear;

    private java.lang.String pin;

    private java.lang.String accountEncoderID;

    private java.lang.String bin;

    private java.lang.String encryptedData;

    private java.lang.String suffix;

    private java.lang.String prefix;

    private java.lang.String cardTypeName;

    private java.lang.String cardSubType;

    private java.lang.String level2Eligible;

    private java.lang.String level3Eligible;

    private java.lang.String productCategory;

    private java.lang.String crossBorderIndicator;

    private java.lang.String billingCurrency;

    private java.lang.String billingCurrencyNumericCode;

    private java.lang.String billingCurrencyMinorDigits;

    private java.lang.String octFastFundsIndicator;

    private java.lang.String octBlockIndicator;

    private java.lang.String onlineGamblingBlockIndicator;

    public Card() {
    }

    public Card(
           java.lang.String fullName,
           java.lang.String accountNumber,
           java.math.BigInteger expirationMonth,
           java.math.BigInteger expirationYear,
           java.lang.String cvIndicator,
           java.lang.String cvNumber,
           java.lang.String cardType,
           java.lang.String issueNumber,
           java.math.BigInteger startMonth,
           java.math.BigInteger startYear,
           java.lang.String pin,
           java.lang.String accountEncoderID,
           java.lang.String bin,
           java.lang.String encryptedData,
           java.lang.String suffix,
           java.lang.String prefix,
           java.lang.String cardTypeName,
           java.lang.String cardSubType,
           java.lang.String level2Eligible,
           java.lang.String level3Eligible,
           java.lang.String productCategory,
           java.lang.String crossBorderIndicator,
           java.lang.String billingCurrency,
           java.lang.String billingCurrencyNumericCode,
           java.lang.String billingCurrencyMinorDigits,
           java.lang.String octFastFundsIndicator,
           java.lang.String octBlockIndicator,
           java.lang.String onlineGamblingBlockIndicator) {
           this.fullName = fullName;
           this.accountNumber = accountNumber;
           this.expirationMonth = expirationMonth;
           this.expirationYear = expirationYear;
           this.cvIndicator = cvIndicator;
           this.cvNumber = cvNumber;
           this.cardType = cardType;
           this.issueNumber = issueNumber;
           this.startMonth = startMonth;
           this.startYear = startYear;
           this.pin = pin;
           this.accountEncoderID = accountEncoderID;
           this.bin = bin;
           this.encryptedData = encryptedData;
           this.suffix = suffix;
           this.prefix = prefix;
           this.cardTypeName = cardTypeName;
           this.cardSubType = cardSubType;
           this.level2Eligible = level2Eligible;
           this.level3Eligible = level3Eligible;
           this.productCategory = productCategory;
           this.crossBorderIndicator = crossBorderIndicator;
           this.billingCurrency = billingCurrency;
           this.billingCurrencyNumericCode = billingCurrencyNumericCode;
           this.billingCurrencyMinorDigits = billingCurrencyMinorDigits;
           this.octFastFundsIndicator = octFastFundsIndicator;
           this.octBlockIndicator = octBlockIndicator;
           this.onlineGamblingBlockIndicator = onlineGamblingBlockIndicator;
    }


    /**
     * Gets the fullName value for this Card.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Card.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the accountNumber value for this Card.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Card.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the expirationMonth value for this Card.
     * 
     * @return expirationMonth
     */
    public java.math.BigInteger getExpirationMonth() {
        return expirationMonth;
    }


    /**
     * Sets the expirationMonth value for this Card.
     * 
     * @param expirationMonth
     */
    public void setExpirationMonth(java.math.BigInteger expirationMonth) {
        this.expirationMonth = expirationMonth;
    }


    /**
     * Gets the expirationYear value for this Card.
     * 
     * @return expirationYear
     */
    public java.math.BigInteger getExpirationYear() {
        return expirationYear;
    }


    /**
     * Sets the expirationYear value for this Card.
     * 
     * @param expirationYear
     */
    public void setExpirationYear(java.math.BigInteger expirationYear) {
        this.expirationYear = expirationYear;
    }


    /**
     * Gets the cvIndicator value for this Card.
     * 
     * @return cvIndicator
     */
    public java.lang.String getCvIndicator() {
        return cvIndicator;
    }


    /**
     * Sets the cvIndicator value for this Card.
     * 
     * @param cvIndicator
     */
    public void setCvIndicator(java.lang.String cvIndicator) {
        this.cvIndicator = cvIndicator;
    }


    /**
     * Gets the cvNumber value for this Card.
     * 
     * @return cvNumber
     */
    public java.lang.String getCvNumber() {
        return cvNumber;
    }


    /**
     * Sets the cvNumber value for this Card.
     * 
     * @param cvNumber
     */
    public void setCvNumber(java.lang.String cvNumber) {
        this.cvNumber = cvNumber;
    }


    /**
     * Gets the cardType value for this Card.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this Card.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the issueNumber value for this Card.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this Card.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the startMonth value for this Card.
     * 
     * @return startMonth
     */
    public java.math.BigInteger getStartMonth() {
        return startMonth;
    }


    /**
     * Sets the startMonth value for this Card.
     * 
     * @param startMonth
     */
    public void setStartMonth(java.math.BigInteger startMonth) {
        this.startMonth = startMonth;
    }


    /**
     * Gets the startYear value for this Card.
     * 
     * @return startYear
     */
    public java.math.BigInteger getStartYear() {
        return startYear;
    }


    /**
     * Sets the startYear value for this Card.
     * 
     * @param startYear
     */
    public void setStartYear(java.math.BigInteger startYear) {
        this.startYear = startYear;
    }


    /**
     * Gets the pin value for this Card.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this Card.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the accountEncoderID value for this Card.
     * 
     * @return accountEncoderID
     */
    public java.lang.String getAccountEncoderID() {
        return accountEncoderID;
    }


    /**
     * Sets the accountEncoderID value for this Card.
     * 
     * @param accountEncoderID
     */
    public void setAccountEncoderID(java.lang.String accountEncoderID) {
        this.accountEncoderID = accountEncoderID;
    }


    /**
     * Gets the bin value for this Card.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this Card.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the encryptedData value for this Card.
     * 
     * @return encryptedData
     */
    public java.lang.String getEncryptedData() {
        return encryptedData;
    }


    /**
     * Sets the encryptedData value for this Card.
     * 
     * @param encryptedData
     */
    public void setEncryptedData(java.lang.String encryptedData) {
        this.encryptedData = encryptedData;
    }


    /**
     * Gets the suffix value for this Card.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this Card.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the prefix value for this Card.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this Card.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the cardTypeName value for this Card.
     * 
     * @return cardTypeName
     */
    public java.lang.String getCardTypeName() {
        return cardTypeName;
    }


    /**
     * Sets the cardTypeName value for this Card.
     * 
     * @param cardTypeName
     */
    public void setCardTypeName(java.lang.String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }


    /**
     * Gets the cardSubType value for this Card.
     * 
     * @return cardSubType
     */
    public java.lang.String getCardSubType() {
        return cardSubType;
    }


    /**
     * Sets the cardSubType value for this Card.
     * 
     * @param cardSubType
     */
    public void setCardSubType(java.lang.String cardSubType) {
        this.cardSubType = cardSubType;
    }


    /**
     * Gets the level2Eligible value for this Card.
     * 
     * @return level2Eligible
     */
    public java.lang.String getLevel2Eligible() {
        return level2Eligible;
    }


    /**
     * Sets the level2Eligible value for this Card.
     * 
     * @param level2Eligible
     */
    public void setLevel2Eligible(java.lang.String level2Eligible) {
        this.level2Eligible = level2Eligible;
    }


    /**
     * Gets the level3Eligible value for this Card.
     * 
     * @return level3Eligible
     */
    public java.lang.String getLevel3Eligible() {
        return level3Eligible;
    }


    /**
     * Sets the level3Eligible value for this Card.
     * 
     * @param level3Eligible
     */
    public void setLevel3Eligible(java.lang.String level3Eligible) {
        this.level3Eligible = level3Eligible;
    }


    /**
     * Gets the productCategory value for this Card.
     * 
     * @return productCategory
     */
    public java.lang.String getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this Card.
     * 
     * @param productCategory
     */
    public void setProductCategory(java.lang.String productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the crossBorderIndicator value for this Card.
     * 
     * @return crossBorderIndicator
     */
    public java.lang.String getCrossBorderIndicator() {
        return crossBorderIndicator;
    }


    /**
     * Sets the crossBorderIndicator value for this Card.
     * 
     * @param crossBorderIndicator
     */
    public void setCrossBorderIndicator(java.lang.String crossBorderIndicator) {
        this.crossBorderIndicator = crossBorderIndicator;
    }


    /**
     * Gets the billingCurrency value for this Card.
     * 
     * @return billingCurrency
     */
    public java.lang.String getBillingCurrency() {
        return billingCurrency;
    }


    /**
     * Sets the billingCurrency value for this Card.
     * 
     * @param billingCurrency
     */
    public void setBillingCurrency(java.lang.String billingCurrency) {
        this.billingCurrency = billingCurrency;
    }


    /**
     * Gets the billingCurrencyNumericCode value for this Card.
     * 
     * @return billingCurrencyNumericCode
     */
    public java.lang.String getBillingCurrencyNumericCode() {
        return billingCurrencyNumericCode;
    }


    /**
     * Sets the billingCurrencyNumericCode value for this Card.
     * 
     * @param billingCurrencyNumericCode
     */
    public void setBillingCurrencyNumericCode(java.lang.String billingCurrencyNumericCode) {
        this.billingCurrencyNumericCode = billingCurrencyNumericCode;
    }


    /**
     * Gets the billingCurrencyMinorDigits value for this Card.
     * 
     * @return billingCurrencyMinorDigits
     */
    public java.lang.String getBillingCurrencyMinorDigits() {
        return billingCurrencyMinorDigits;
    }


    /**
     * Sets the billingCurrencyMinorDigits value for this Card.
     * 
     * @param billingCurrencyMinorDigits
     */
    public void setBillingCurrencyMinorDigits(java.lang.String billingCurrencyMinorDigits) {
        this.billingCurrencyMinorDigits = billingCurrencyMinorDigits;
    }


    /**
     * Gets the octFastFundsIndicator value for this Card.
     * 
     * @return octFastFundsIndicator
     */
    public java.lang.String getOctFastFundsIndicator() {
        return octFastFundsIndicator;
    }


    /**
     * Sets the octFastFundsIndicator value for this Card.
     * 
     * @param octFastFundsIndicator
     */
    public void setOctFastFundsIndicator(java.lang.String octFastFundsIndicator) {
        this.octFastFundsIndicator = octFastFundsIndicator;
    }


    /**
     * Gets the octBlockIndicator value for this Card.
     * 
     * @return octBlockIndicator
     */
    public java.lang.String getOctBlockIndicator() {
        return octBlockIndicator;
    }


    /**
     * Sets the octBlockIndicator value for this Card.
     * 
     * @param octBlockIndicator
     */
    public void setOctBlockIndicator(java.lang.String octBlockIndicator) {
        this.octBlockIndicator = octBlockIndicator;
    }


    /**
     * Gets the onlineGamblingBlockIndicator value for this Card.
     * 
     * @return onlineGamblingBlockIndicator
     */
    public java.lang.String getOnlineGamblingBlockIndicator() {
        return onlineGamblingBlockIndicator;
    }


    /**
     * Sets the onlineGamblingBlockIndicator value for this Card.
     * 
     * @param onlineGamblingBlockIndicator
     */
    public void setOnlineGamblingBlockIndicator(java.lang.String onlineGamblingBlockIndicator) {
        this.onlineGamblingBlockIndicator = onlineGamblingBlockIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.expirationMonth==null && other.getExpirationMonth()==null) || 
             (this.expirationMonth!=null &&
              this.expirationMonth.equals(other.getExpirationMonth()))) &&
            ((this.expirationYear==null && other.getExpirationYear()==null) || 
             (this.expirationYear!=null &&
              this.expirationYear.equals(other.getExpirationYear()))) &&
            ((this.cvIndicator==null && other.getCvIndicator()==null) || 
             (this.cvIndicator!=null &&
              this.cvIndicator.equals(other.getCvIndicator()))) &&
            ((this.cvNumber==null && other.getCvNumber()==null) || 
             (this.cvNumber!=null &&
              this.cvNumber.equals(other.getCvNumber()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.startMonth==null && other.getStartMonth()==null) || 
             (this.startMonth!=null &&
              this.startMonth.equals(other.getStartMonth()))) &&
            ((this.startYear==null && other.getStartYear()==null) || 
             (this.startYear!=null &&
              this.startYear.equals(other.getStartYear()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.accountEncoderID==null && other.getAccountEncoderID()==null) || 
             (this.accountEncoderID!=null &&
              this.accountEncoderID.equals(other.getAccountEncoderID()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.encryptedData==null && other.getEncryptedData()==null) || 
             (this.encryptedData!=null &&
              this.encryptedData.equals(other.getEncryptedData()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.cardTypeName==null && other.getCardTypeName()==null) || 
             (this.cardTypeName!=null &&
              this.cardTypeName.equals(other.getCardTypeName()))) &&
            ((this.cardSubType==null && other.getCardSubType()==null) || 
             (this.cardSubType!=null &&
              this.cardSubType.equals(other.getCardSubType()))) &&
            ((this.level2Eligible==null && other.getLevel2Eligible()==null) || 
             (this.level2Eligible!=null &&
              this.level2Eligible.equals(other.getLevel2Eligible()))) &&
            ((this.level3Eligible==null && other.getLevel3Eligible()==null) || 
             (this.level3Eligible!=null &&
              this.level3Eligible.equals(other.getLevel3Eligible()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.crossBorderIndicator==null && other.getCrossBorderIndicator()==null) || 
             (this.crossBorderIndicator!=null &&
              this.crossBorderIndicator.equals(other.getCrossBorderIndicator()))) &&
            ((this.billingCurrency==null && other.getBillingCurrency()==null) || 
             (this.billingCurrency!=null &&
              this.billingCurrency.equals(other.getBillingCurrency()))) &&
            ((this.billingCurrencyNumericCode==null && other.getBillingCurrencyNumericCode()==null) || 
             (this.billingCurrencyNumericCode!=null &&
              this.billingCurrencyNumericCode.equals(other.getBillingCurrencyNumericCode()))) &&
            ((this.billingCurrencyMinorDigits==null && other.getBillingCurrencyMinorDigits()==null) || 
             (this.billingCurrencyMinorDigits!=null &&
              this.billingCurrencyMinorDigits.equals(other.getBillingCurrencyMinorDigits()))) &&
            ((this.octFastFundsIndicator==null && other.getOctFastFundsIndicator()==null) || 
             (this.octFastFundsIndicator!=null &&
              this.octFastFundsIndicator.equals(other.getOctFastFundsIndicator()))) &&
            ((this.octBlockIndicator==null && other.getOctBlockIndicator()==null) || 
             (this.octBlockIndicator!=null &&
              this.octBlockIndicator.equals(other.getOctBlockIndicator()))) &&
            ((this.onlineGamblingBlockIndicator==null && other.getOnlineGamblingBlockIndicator()==null) || 
             (this.onlineGamblingBlockIndicator!=null &&
              this.onlineGamblingBlockIndicator.equals(other.getOnlineGamblingBlockIndicator())));
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
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getExpirationMonth() != null) {
            _hashCode += getExpirationMonth().hashCode();
        }
        if (getExpirationYear() != null) {
            _hashCode += getExpirationYear().hashCode();
        }
        if (getCvIndicator() != null) {
            _hashCode += getCvIndicator().hashCode();
        }
        if (getCvNumber() != null) {
            _hashCode += getCvNumber().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getStartMonth() != null) {
            _hashCode += getStartMonth().hashCode();
        }
        if (getStartYear() != null) {
            _hashCode += getStartYear().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getAccountEncoderID() != null) {
            _hashCode += getAccountEncoderID().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getEncryptedData() != null) {
            _hashCode += getEncryptedData().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getCardTypeName() != null) {
            _hashCode += getCardTypeName().hashCode();
        }
        if (getCardSubType() != null) {
            _hashCode += getCardSubType().hashCode();
        }
        if (getLevel2Eligible() != null) {
            _hashCode += getLevel2Eligible().hashCode();
        }
        if (getLevel3Eligible() != null) {
            _hashCode += getLevel3Eligible().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getCrossBorderIndicator() != null) {
            _hashCode += getCrossBorderIndicator().hashCode();
        }
        if (getBillingCurrency() != null) {
            _hashCode += getBillingCurrency().hashCode();
        }
        if (getBillingCurrencyNumericCode() != null) {
            _hashCode += getBillingCurrencyNumericCode().hashCode();
        }
        if (getBillingCurrencyMinorDigits() != null) {
            _hashCode += getBillingCurrencyMinorDigits().hashCode();
        }
        if (getOctFastFundsIndicator() != null) {
            _hashCode += getOctFastFundsIndicator().hashCode();
        }
        if (getOctBlockIndicator() != null) {
            _hashCode += getOctBlockIndicator().hashCode();
        }
        if (getOnlineGamblingBlockIndicator() != null) {
            _hashCode += getOnlineGamblingBlockIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Card.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "Card"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "expirationMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "expirationYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cvIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cvNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "startMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "startYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountEncoderID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "accountEncoderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "encryptedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "cardSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level2Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "level2Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level3Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "level3Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "productCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossBorderIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "crossBorderIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCurrencyNumericCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingCurrencyNumericCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCurrencyMinorDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "billingCurrencyMinorDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("octFastFundsIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "octFastFundsIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("octBlockIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "octBlockIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineGamblingBlockIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "onlineGamblingBlockIndicator"));
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
