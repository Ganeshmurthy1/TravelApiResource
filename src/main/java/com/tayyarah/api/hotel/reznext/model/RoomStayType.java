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
 * <p>Java class for RoomStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{}RoomTypesType"/>
 *         &lt;element name="RatePlans" type="{}RatePlansType"/>
 *         &lt;element name="RoomRates" type="{}RoomRatesType"/>
 *         &lt;element name="BasicPropertyInfo" type="{}BasicPropertyInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayType", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "basicPropertyInfo",
    "guestCounts",
    "timeSpan",
    "total",
    "resGuestRPHs",
    
})
public class RoomStayType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RoomTypes", required = true)
    protected RoomTypesType roomTypes;
    @XmlElement(name = "RatePlans", required = true)
    protected RatePlansType ratePlans;
    @XmlElement(name = "RoomRates", required = true)
    protected RoomRatesType roomRates;
    @XmlElement(name = "BasicPropertyInfo", required = true)
    protected BasicPropertyInfoType basicPropertyInfo;
    @XmlElement(name = "GuestCounts", required = true)
    protected GuestCountsType guestCounts;
    @XmlElement(name = "TimeSpan", required = true)
    protected TimeSpanType timeSpan;
    @XmlElement(name = "Total", required = true)
    protected TotalType total;
  
    @XmlElement(name = "ResGuestRPHs", required = true)
    protected ResGuestRPHsType resGuestRPHs;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "SourceOfBusiness")
    protected String sourceOfBusiness;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypesType }
     *     
     */
    public RoomTypesType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypesType }
     *     
     */
    public void setRoomTypes(RoomTypesType value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlansType }
     *     
     */
    public RatePlansType getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlansType }
     *     
     */
    public void setRatePlans(RatePlansType value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRatesType }
     *     
     */
    public RoomRatesType getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRatesType }
     *     
     */
    public void setRoomRates(RoomRatesType value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType }
     *     
     */
    public BasicPropertyInfoType getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfoType value) {
        this.basicPropertyInfo = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountsType }
     *     
     */
    public GuestCountsType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountsType }
     *     
     */
    public void setGuestCounts(GuestCountsType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpanType }
     *     
     */
    public TimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpanType }
     *     
     */
    public void setTimeSpan(TimeSpanType value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

   


    /**
     * Gets the value of the resGuestRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public ResGuestRPHsType getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * Sets the value of the resGuestRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public void setResGuestRPHs(ResGuestRPHsType value) {
        this.resGuestRPHs = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the sourceOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * Sets the value of the sourceOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

}