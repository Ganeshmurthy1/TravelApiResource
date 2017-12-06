//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.07 at 05:57:04 PM IST 
//


package com.tayyarah.api.hotel.travelguru.book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for AvailStatusMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailStatusMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/>
 *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
 *         &lt;element name="BestAvailableRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BestAvailableRate" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
 *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HurdleRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="Restriction">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Status">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BookingLimitMessageType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LocatorID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RoomGender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailStatusMessageType", propOrder = {
    "statusApplicationControl",
    "lengthsOfStay",
    "bestAvailableRates",
    "hurdleRate",
    "delta",
    "uniqueID",
    "restrictionStatus"
})
@XmlSeeAlso({
    com.tayyarah.api.hotel.travelguru.book.model.OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage.class
})
public class AvailStatusMessageType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "LengthsOfStay")
    protected LengthsOfStayType lengthsOfStay;
    @XmlElement(name = "BestAvailableRates")
    protected AvailStatusMessageType.BestAvailableRates bestAvailableRates;
    @XmlElement(name = "HurdleRate")
    protected AvailStatusMessageType.HurdleRate hurdleRate;
    @XmlElement(name = "Delta")
    protected AvailStatusMessageType.Delta delta;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "RestrictionStatus")
    protected AvailStatusMessageType.RestrictionStatus restrictionStatus;
    @XmlAttribute(name = "BookingLimit")
    protected BigInteger bookingLimit;
    @XmlAttribute(name = "BookingLimitMessageType")
    protected String bookingLimitMessageType;
    @XmlAttribute(name = "BookingThreshold")
    protected BigInteger bookingThreshold;
    @XmlAttribute(name = "LocatorID")
    protected BigInteger locatorID;
    @XmlAttribute(name = "Override")
    protected Boolean override;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;

    /**
     * Gets the value of the statusApplicationControl property.
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * Sets the value of the statusApplicationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * Gets the value of the lengthsOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link LengthsOfStayType }
     *     
     */
    public LengthsOfStayType getLengthsOfStay() {
        return lengthsOfStay;
    }

    /**
     * Sets the value of the lengthsOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthsOfStayType }
     *     
     */
    public void setLengthsOfStay(LengthsOfStayType value) {
        this.lengthsOfStay = value;
    }

    /**
     * Gets the value of the bestAvailableRates property.
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.BestAvailableRates }
     *     
     */
    public AvailStatusMessageType.BestAvailableRates getBestAvailableRates() {
        return bestAvailableRates;
    }

    /**
     * Sets the value of the bestAvailableRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.BestAvailableRates }
     *     
     */
    public void setBestAvailableRates(AvailStatusMessageType.BestAvailableRates value) {
        this.bestAvailableRates = value;
    }

    /**
     * Gets the value of the hurdleRate property.
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.HurdleRate }
     *     
     */
    public AvailStatusMessageType.HurdleRate getHurdleRate() {
        return hurdleRate;
    }

    /**
     * Sets the value of the hurdleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.HurdleRate }
     *     
     */
    public void setHurdleRate(AvailStatusMessageType.HurdleRate value) {
        this.hurdleRate = value;
    }

    /**
     * Gets the value of the delta property.
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.Delta }
     *     
     */
    public AvailStatusMessageType.Delta getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.Delta }
     *     
     */
    public void setDelta(AvailStatusMessageType.Delta value) {
        this.delta = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the restrictionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *     
     */
    public AvailStatusMessageType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * Sets the value of the restrictionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(AvailStatusMessageType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * Gets the value of the bookingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingLimit() {
        return bookingLimit;
    }

    /**
     * Sets the value of the bookingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingLimit(BigInteger value) {
        this.bookingLimit = value;
    }

    /**
     * Gets the value of the bookingLimitMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingLimitMessageType() {
        return bookingLimitMessageType;
    }

    /**
     * Sets the value of the bookingLimitMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingLimitMessageType(String value) {
        this.bookingLimitMessageType = value;
    }

    /**
     * Gets the value of the bookingThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingThreshold() {
        return bookingThreshold;
    }

    /**
     * Sets the value of the bookingThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingThreshold(BigInteger value) {
        this.bookingThreshold = value;
    }

    /**
     * Gets the value of the locatorID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocatorID() {
        return locatorID;
    }

    /**
     * Sets the value of the locatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocatorID(BigInteger value) {
        this.locatorID = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * Gets the value of the roomGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomGender() {
        return roomGender;
    }

    /**
     * Sets the value of the roomGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    /**
     * Gets the value of the sharedRoomInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    /**
     * Sets the value of the sharedRoomInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BestAvailableRate" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
     *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bestAvailableRates"
    })
    public static class BestAvailableRates
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "BestAvailableRate", required = true)
        protected List<AvailStatusMessageType.BestAvailableRates.BestAvailableRate> bestAvailableRates;

        /**
         * Gets the value of the bestAvailableRates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bestAvailableRates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBestAvailableRates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailStatusMessageType.BestAvailableRates.BestAvailableRate }
         * 
         * 
         */
        public List<AvailStatusMessageType.BestAvailableRates.BestAvailableRate> getBestAvailableRates() {
            if (bestAvailableRates == null) {
                bestAvailableRates = new ArrayList<AvailStatusMessageType.BestAvailableRates.BestAvailableRate>();
            }
            return this.bestAvailableRates;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}timeUnitType" />
         *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BestAvailableRate
            implements Serializable
        {

            private final static long serialVersionUID = -1L;
            @XmlAttribute(name = "LengthOfStayTime")
            protected BigInteger lengthOfStayTime;
            @XmlAttribute(name = "LengthOfStayTimeUnit")
            protected TimeUnitType lengthOfStayTimeUnit;
            @XmlAttribute(name = "RatePlanCode")
            protected String ratePlanCode;
            @XmlAttribute(name = "TaxInclusive")
            protected Boolean taxInclusive;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the lengthOfStayTime property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLengthOfStayTime() {
                return lengthOfStayTime;
            }

            /**
             * Sets the value of the lengthOfStayTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLengthOfStayTime(BigInteger value) {
                this.lengthOfStayTime = value;
            }

            /**
             * Gets the value of the lengthOfStayTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getLengthOfStayTimeUnit() {
                return lengthOfStayTimeUnit;
            }

            /**
             * Sets the value of the lengthOfStayTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setLengthOfStayTimeUnit(TimeUnitType value) {
                this.lengthOfStayTimeUnit = value;
            }

            /**
             * Gets the value of the ratePlanCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatePlanCode() {
                return ratePlanCode;
            }

            /**
             * Sets the value of the ratePlanCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatePlanCode(String value) {
                this.ratePlanCode = value;
            }

            /**
             * Gets the value of the taxInclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTaxInclusive() {
                return taxInclusive;
            }

            /**
             * Sets the value of the taxInclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTaxInclusive(Boolean value) {
                this.taxInclusive = value;
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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Delta
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "Ceiling")
        protected BigInteger ceiling;
        @XmlAttribute(name = "MaxSold")
        protected BigInteger maxSold;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the ceiling property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCeiling() {
            return ceiling;
        }

        /**
         * Sets the value of the ceiling property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCeiling(BigInteger value) {
            this.ceiling = value;
        }

        /**
         * Gets the value of the maxSold property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxSold() {
            return maxSold;
        }

        /**
         * Sets the value of the maxSold property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxSold(BigInteger value) {
            this.maxSold = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HurdleRate
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        protected BigInteger decimalPlaces;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="Restriction">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Status">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;
        @XmlAttribute(name = "Restriction")
        protected List<String> restrictions;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;
        @XmlAttribute(name = "Status")
        protected List<String> statuses;

        /**
         * Gets the value of the maxAdvancedBookingOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * Sets the value of the maxAdvancedBookingOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * Gets the value of the minAdvancedBookingOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * Sets the value of the minAdvancedBookingOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

        /**
         * Gets the value of the restrictions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restrictions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestrictions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRestrictions() {
            if (restrictions == null) {
                restrictions = new ArrayList<String>();
            }
            return this.restrictions;
        }

        /**
         * Gets the value of the sellThroughOpenIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * Sets the value of the sellThroughOpenIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
        }

    }

}
