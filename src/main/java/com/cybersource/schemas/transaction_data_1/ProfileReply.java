
package com.cybersource.schemas.transaction_data_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ProfileReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationQueue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rulesTriggered" type="{urn:schemas-cybersource-com:transaction-data-1.141}RuleResultItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileReply", propOrder = {
    "selectedBy",
    "name",
    "destinationQueue",
    "profileScore",
    "rulesTriggered"
})
public class ProfileReply {

    protected String selectedBy;
    protected String name;
    protected String destinationQueue;
    protected String profileScore;
    protected RuleResultItems rulesTriggered;

    /**
     * Gets the value of the selectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBy() {
        return selectedBy;
    }

    /**
     * Sets the value of the selectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBy(String value) {
        this.selectedBy = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the destinationQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationQueue() {
        return destinationQueue;
    }

    /**
     * Sets the value of the destinationQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationQueue(String value) {
        this.destinationQueue = value;
    }

    /**
     * Gets the value of the profileScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileScore() {
        return profileScore;
    }

    /**
     * Sets the value of the profileScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileScore(String value) {
        this.profileScore = value;
    }

    /**
     * Gets the value of the rulesTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link RuleResultItems }
     *     
     */
    public RuleResultItems getRulesTriggered() {
        return rulesTriggered;
    }

    /**
     * Sets the value of the rulesTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleResultItems }
     *     
     */
    public void setRulesTriggered(RuleResultItems value) {
        this.rulesTriggered = value;
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
