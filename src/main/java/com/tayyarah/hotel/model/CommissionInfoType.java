//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.09 at 04:51:51 PM IST 
//


package com.tayyarah.hotel.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * <p>Java class for CommissionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInfoType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *       &lt;attribute name="CommissionPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ShareMarketInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShareSynchInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInfoType")
public class CommissionInfoType
    extends FreeTextType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "CommissionPlanCode")
    protected String commissionPlanCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;

    /**
     * Gets the value of the commissionPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPlanCode() {
        return commissionPlanCode;
    }

    /**
     * Sets the value of the commissionPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPlanCode(String value) {
        this.commissionPlanCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

}
