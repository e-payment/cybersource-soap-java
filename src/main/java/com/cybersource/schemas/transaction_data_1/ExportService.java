
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ExportService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sanctionsLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.141}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportService", propOrder = {
    "addressOperator",
    "addressWeight",
    "companyWeight",
    "nameWeight",
    "sanctionsLists"
})
public class ExportService {

    protected String addressOperator;
    protected String addressWeight;
    protected String companyWeight;
    protected String nameWeight;
    protected String sanctionsLists;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the addressOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOperator() {
        return addressOperator;
    }

    /**
     * Sets the value of the addressOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOperator(String value) {
        this.addressOperator = value;
    }

    /**
     * Gets the value of the addressWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressWeight() {
        return addressWeight;
    }

    /**
     * Sets the value of the addressWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressWeight(String value) {
        this.addressWeight = value;
    }

    /**
     * Gets the value of the companyWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeight() {
        return companyWeight;
    }

    /**
     * Sets the value of the companyWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeight(String value) {
        this.companyWeight = value;
    }

    /**
     * Gets the value of the nameWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWeight() {
        return nameWeight;
    }

    /**
     * Sets the value of the nameWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWeight(String value) {
        this.nameWeight = value;
    }

    /**
     * Gets the value of the sanctionsLists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsLists() {
        return sanctionsLists;
    }

    /**
     * Sets the value of the sanctionsLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsLists(String value) {
        this.sanctionsLists = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
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
