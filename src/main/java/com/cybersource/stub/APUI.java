/**
 * APUI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cybersource.stub;

public class APUI  implements java.io.Serializable {
    private java.lang.String colorBorder;

    private java.lang.String colorBorderSelected;

    private java.lang.String colorButton;

    private java.lang.String colorButtonText;

    private java.lang.String colorCheckbox;

    private java.lang.String colorCheckboxCheckMark;

    private java.lang.String colorHeader;

    private java.lang.String colorLink;

    private java.lang.String colorText;

    private java.lang.String borderRadius;

    private java.lang.String theme;

    public APUI() {
    }

    public APUI(
           java.lang.String colorBorder,
           java.lang.String colorBorderSelected,
           java.lang.String colorButton,
           java.lang.String colorButtonText,
           java.lang.String colorCheckbox,
           java.lang.String colorCheckboxCheckMark,
           java.lang.String colorHeader,
           java.lang.String colorLink,
           java.lang.String colorText,
           java.lang.String borderRadius,
           java.lang.String theme) {
           this.colorBorder = colorBorder;
           this.colorBorderSelected = colorBorderSelected;
           this.colorButton = colorButton;
           this.colorButtonText = colorButtonText;
           this.colorCheckbox = colorCheckbox;
           this.colorCheckboxCheckMark = colorCheckboxCheckMark;
           this.colorHeader = colorHeader;
           this.colorLink = colorLink;
           this.colorText = colorText;
           this.borderRadius = borderRadius;
           this.theme = theme;
    }


    /**
     * Gets the colorBorder value for this APUI.
     * 
     * @return colorBorder
     */
    public java.lang.String getColorBorder() {
        return colorBorder;
    }


    /**
     * Sets the colorBorder value for this APUI.
     * 
     * @param colorBorder
     */
    public void setColorBorder(java.lang.String colorBorder) {
        this.colorBorder = colorBorder;
    }


    /**
     * Gets the colorBorderSelected value for this APUI.
     * 
     * @return colorBorderSelected
     */
    public java.lang.String getColorBorderSelected() {
        return colorBorderSelected;
    }


    /**
     * Sets the colorBorderSelected value for this APUI.
     * 
     * @param colorBorderSelected
     */
    public void setColorBorderSelected(java.lang.String colorBorderSelected) {
        this.colorBorderSelected = colorBorderSelected;
    }


    /**
     * Gets the colorButton value for this APUI.
     * 
     * @return colorButton
     */
    public java.lang.String getColorButton() {
        return colorButton;
    }


    /**
     * Sets the colorButton value for this APUI.
     * 
     * @param colorButton
     */
    public void setColorButton(java.lang.String colorButton) {
        this.colorButton = colorButton;
    }


    /**
     * Gets the colorButtonText value for this APUI.
     * 
     * @return colorButtonText
     */
    public java.lang.String getColorButtonText() {
        return colorButtonText;
    }


    /**
     * Sets the colorButtonText value for this APUI.
     * 
     * @param colorButtonText
     */
    public void setColorButtonText(java.lang.String colorButtonText) {
        this.colorButtonText = colorButtonText;
    }


    /**
     * Gets the colorCheckbox value for this APUI.
     * 
     * @return colorCheckbox
     */
    public java.lang.String getColorCheckbox() {
        return colorCheckbox;
    }


    /**
     * Sets the colorCheckbox value for this APUI.
     * 
     * @param colorCheckbox
     */
    public void setColorCheckbox(java.lang.String colorCheckbox) {
        this.colorCheckbox = colorCheckbox;
    }


    /**
     * Gets the colorCheckboxCheckMark value for this APUI.
     * 
     * @return colorCheckboxCheckMark
     */
    public java.lang.String getColorCheckboxCheckMark() {
        return colorCheckboxCheckMark;
    }


    /**
     * Sets the colorCheckboxCheckMark value for this APUI.
     * 
     * @param colorCheckboxCheckMark
     */
    public void setColorCheckboxCheckMark(java.lang.String colorCheckboxCheckMark) {
        this.colorCheckboxCheckMark = colorCheckboxCheckMark;
    }


    /**
     * Gets the colorHeader value for this APUI.
     * 
     * @return colorHeader
     */
    public java.lang.String getColorHeader() {
        return colorHeader;
    }


    /**
     * Sets the colorHeader value for this APUI.
     * 
     * @param colorHeader
     */
    public void setColorHeader(java.lang.String colorHeader) {
        this.colorHeader = colorHeader;
    }


    /**
     * Gets the colorLink value for this APUI.
     * 
     * @return colorLink
     */
    public java.lang.String getColorLink() {
        return colorLink;
    }


    /**
     * Sets the colorLink value for this APUI.
     * 
     * @param colorLink
     */
    public void setColorLink(java.lang.String colorLink) {
        this.colorLink = colorLink;
    }


    /**
     * Gets the colorText value for this APUI.
     * 
     * @return colorText
     */
    public java.lang.String getColorText() {
        return colorText;
    }


    /**
     * Sets the colorText value for this APUI.
     * 
     * @param colorText
     */
    public void setColorText(java.lang.String colorText) {
        this.colorText = colorText;
    }


    /**
     * Gets the borderRadius value for this APUI.
     * 
     * @return borderRadius
     */
    public java.lang.String getBorderRadius() {
        return borderRadius;
    }


    /**
     * Sets the borderRadius value for this APUI.
     * 
     * @param borderRadius
     */
    public void setBorderRadius(java.lang.String borderRadius) {
        this.borderRadius = borderRadius;
    }


    /**
     * Gets the theme value for this APUI.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this APUI.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APUI)) return false;
        APUI other = (APUI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colorBorder==null && other.getColorBorder()==null) || 
             (this.colorBorder!=null &&
              this.colorBorder.equals(other.getColorBorder()))) &&
            ((this.colorBorderSelected==null && other.getColorBorderSelected()==null) || 
             (this.colorBorderSelected!=null &&
              this.colorBorderSelected.equals(other.getColorBorderSelected()))) &&
            ((this.colorButton==null && other.getColorButton()==null) || 
             (this.colorButton!=null &&
              this.colorButton.equals(other.getColorButton()))) &&
            ((this.colorButtonText==null && other.getColorButtonText()==null) || 
             (this.colorButtonText!=null &&
              this.colorButtonText.equals(other.getColorButtonText()))) &&
            ((this.colorCheckbox==null && other.getColorCheckbox()==null) || 
             (this.colorCheckbox!=null &&
              this.colorCheckbox.equals(other.getColorCheckbox()))) &&
            ((this.colorCheckboxCheckMark==null && other.getColorCheckboxCheckMark()==null) || 
             (this.colorCheckboxCheckMark!=null &&
              this.colorCheckboxCheckMark.equals(other.getColorCheckboxCheckMark()))) &&
            ((this.colorHeader==null && other.getColorHeader()==null) || 
             (this.colorHeader!=null &&
              this.colorHeader.equals(other.getColorHeader()))) &&
            ((this.colorLink==null && other.getColorLink()==null) || 
             (this.colorLink!=null &&
              this.colorLink.equals(other.getColorLink()))) &&
            ((this.colorText==null && other.getColorText()==null) || 
             (this.colorText!=null &&
              this.colorText.equals(other.getColorText()))) &&
            ((this.borderRadius==null && other.getBorderRadius()==null) || 
             (this.borderRadius!=null &&
              this.borderRadius.equals(other.getBorderRadius()))) &&
            ((this.theme==null && other.getTheme()==null) || 
             (this.theme!=null &&
              this.theme.equals(other.getTheme())));
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
        if (getColorBorder() != null) {
            _hashCode += getColorBorder().hashCode();
        }
        if (getColorBorderSelected() != null) {
            _hashCode += getColorBorderSelected().hashCode();
        }
        if (getColorButton() != null) {
            _hashCode += getColorButton().hashCode();
        }
        if (getColorButtonText() != null) {
            _hashCode += getColorButtonText().hashCode();
        }
        if (getColorCheckbox() != null) {
            _hashCode += getColorCheckbox().hashCode();
        }
        if (getColorCheckboxCheckMark() != null) {
            _hashCode += getColorCheckboxCheckMark().hashCode();
        }
        if (getColorHeader() != null) {
            _hashCode += getColorHeader().hashCode();
        }
        if (getColorLink() != null) {
            _hashCode += getColorLink().hashCode();
        }
        if (getColorText() != null) {
            _hashCode += getColorText().hashCode();
        }
        if (getBorderRadius() != null) {
            _hashCode += getBorderRadius().hashCode();
        }
        if (getTheme() != null) {
            _hashCode += getTheme().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APUI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "APUI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorBorder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorBorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorBorderSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorBorderSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorButton");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorButton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorButtonText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorButtonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorCheckbox");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorCheckbox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorCheckboxCheckMark");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorCheckboxCheckMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "colorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("borderRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "borderRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-cybersource-com:transaction-data-1.141", "theme"));
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
