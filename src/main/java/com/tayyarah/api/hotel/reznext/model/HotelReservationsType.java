//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.24 at 06:17:09 PM IST 
//


package com.tayyarah.api.hotel.reznext.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelReservationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservation" type="{}HotelReservationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationsType", propOrder = {
    "hotelReservation"
})
public class HotelReservationsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "HotelReservation", required = true)
    protected HotelReservationType hotelReservation;

    /**
     * Gets the value of the hotelReservation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType }
     *     
     */
    public HotelReservationType getHotelReservation() {
        return hotelReservation;
    }

    /**
     * Sets the value of the hotelReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType }
     *     
     */
    public void setHotelReservation(HotelReservationType value) {
        this.hotelReservation = value;
    }

}
