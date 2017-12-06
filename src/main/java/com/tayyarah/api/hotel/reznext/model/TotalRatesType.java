//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.24 at 11:34:13 AM IST 
//


package com.tayyarah.api.hotel.reznext.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TotalRatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalRatesType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="SingleRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DoubleRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtraBed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtraChild" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NoOfNights" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="BasicAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalRatesType", propOrder = {
    "value"
})
public class TotalRatesType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "SingleRate")
    protected String singleRate;
    @XmlAttribute(name = "DoubleRate")
    protected String doubleRate;
    @XmlAttribute(name = "ExtraBed")
    protected String extraBed;
    @XmlAttribute(name = "ExtraChild")
    protected String extraChild;
    @XmlAttribute(name = "NoOfNights")
    protected int noOfNights;
    @XmlAttribute(name = "BasicAmount")
    protected BigDecimal basicAmount;
    @XmlAttribute(name = "NetAmount")
    protected BigDecimal netAmount;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the singleRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleRate() {
        return singleRate;
    }

    /**
     * Sets the value of the singleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleRate(String value) {
        this.singleRate = value;
    }

    /**
     * Gets the value of the doubleRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleRate() {
        return doubleRate;
    }

    /**
     * Sets the value of the doubleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleRate(String value) {
        this.doubleRate = value;
    }

    /**
     * Gets the value of the extraBed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraBed() {
        return extraBed;
    }

    /**
     * Sets the value of the extraBed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraBed(String value) {
        this.extraBed = value;
    }

    /**
     * Gets the value of the extraChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChild() {
        return extraChild;
    }

    /**
     * Sets the value of the extraChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChild(String value) {
        this.extraChild = value;
    }

    /**
     * Gets the value of the noOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getNoOfNights() {
        return noOfNights;
    }

    /**
     * Sets the value of the noOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setNoOfNights(int value) {
        this.noOfNights = value;
    }

    /**
     * Gets the value of the basicAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasicAmount() {
        return basicAmount;
    }

    /**
     * Sets the value of the basicAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasicAmount(BigDecimal value) {
        this.basicAmount = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

}