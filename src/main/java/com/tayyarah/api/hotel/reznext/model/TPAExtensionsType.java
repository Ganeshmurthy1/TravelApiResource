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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPA_ExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalRates" type="{}TotalRatesType"/>
 *         &lt;element name="CancelPenalties" type="{}CancelPenaltiesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsType", propOrder = {
    "totalRates",
    "cancelPenalties"
})
public class TPAExtensionsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TotalRates", required = true)
    protected TotalRatesType totalRates;
    @XmlElement(name = "CancelPenalties", required = true)
    protected CancelPenaltiesType cancelPenalties;

    /**
     * Gets the value of the totalRates property.
     * 
     * @return
     *     possible object is
     *     {@link TotalRatesType }
     *     
     */
    public TotalRatesType getTotalRates() {
        return totalRates;
    }

    /**
     * Sets the value of the totalRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalRatesType }
     *     
     */
    public void setTotalRates(TotalRatesType value) {
        this.totalRates = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

}