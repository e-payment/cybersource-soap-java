
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for APUI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APUI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="colorBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorBorderSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorButton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorCheckbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorCheckboxCheckMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="borderRadius" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APUI", propOrder = {
    "colorBorder",
    "colorBorderSelected",
    "colorButton",
    "colorButtonText",
    "colorCheckbox",
    "colorCheckboxCheckMark",
    "colorHeader",
    "colorLink",
    "colorText",
    "borderRadius",
    "theme"
})
public class APUI {

    protected String colorBorder;
    protected String colorBorderSelected;
    protected String colorButton;
    protected String colorButtonText;
    protected String colorCheckbox;
    protected String colorCheckboxCheckMark;
    protected String colorHeader;
    protected String colorLink;
    protected String colorText;
    protected String borderRadius;
    protected String theme;

    /**
     * Gets the value of the colorBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBorder() {
        return colorBorder;
    }

    /**
     * Sets the value of the colorBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBorder(String value) {
        this.colorBorder = value;
    }

    /**
     * Gets the value of the colorBorderSelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBorderSelected() {
        return colorBorderSelected;
    }

    /**
     * Sets the value of the colorBorderSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBorderSelected(String value) {
        this.colorBorderSelected = value;
    }

    /**
     * Gets the value of the colorButton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorButton() {
        return colorButton;
    }

    /**
     * Sets the value of the colorButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorButton(String value) {
        this.colorButton = value;
    }

    /**
     * Gets the value of the colorButtonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorButtonText() {
        return colorButtonText;
    }

    /**
     * Sets the value of the colorButtonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorButtonText(String value) {
        this.colorButtonText = value;
    }

    /**
     * Gets the value of the colorCheckbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCheckbox() {
        return colorCheckbox;
    }

    /**
     * Sets the value of the colorCheckbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCheckbox(String value) {
        this.colorCheckbox = value;
    }

    /**
     * Gets the value of the colorCheckboxCheckMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCheckboxCheckMark() {
        return colorCheckboxCheckMark;
    }

    /**
     * Sets the value of the colorCheckboxCheckMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCheckboxCheckMark(String value) {
        this.colorCheckboxCheckMark = value;
    }

    /**
     * Gets the value of the colorHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHeader() {
        return colorHeader;
    }

    /**
     * Sets the value of the colorHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHeader(String value) {
        this.colorHeader = value;
    }

    /**
     * Gets the value of the colorLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorLink() {
        return colorLink;
    }

    /**
     * Sets the value of the colorLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorLink(String value) {
        this.colorLink = value;
    }

    /**
     * Gets the value of the colorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorText() {
        return colorText;
    }

    /**
     * Sets the value of the colorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorText(String value) {
        this.colorText = value;
    }

    /**
     * Gets the value of the borderRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRadius() {
        return borderRadius;
    }

    /**
     * Sets the value of the borderRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRadius(String value) {
        this.borderRadius = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
