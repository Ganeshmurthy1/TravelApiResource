//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.24 at 11:34:13 AM IST 
//


package com.tayyarah.api.hotel.reznext.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InclusionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" type="{}RateType"/>
 *         &lt;element name="Taxes" type="{}TaxesType"/>
 *         &lt;element name="TPA_Extensions" type="{}TPA_ExtensionsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MealPlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionType", propOrder = {
    "rate",
    "taxes",
    "tpaExtensions"
})
public class InclusionType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Rate", required = true)
    protected RateType rate;
    @XmlElement(name = "Taxes", required = true)
    protected TaxesType taxes;
    @XmlElement(name = "TPA_Extensions", required = true)
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "MealPlanCode")
    protected String mealPlanCode;
    @XmlAttribute(name = "MealPlanDescription")
    protected String mealPlanDescription;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRate(RateType value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the mealPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    /**
     * Sets the value of the mealPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealPlanCode(String value) {
        this.mealPlanCode = value;
    }

    /**
     * Gets the value of the mealPlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealPlanDescription() {
        return mealPlanDescription;
    }

    /**
     * Sets the value of the mealPlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealPlanDescription(String value) {
        this.mealPlanDescription = value;
    }

}
