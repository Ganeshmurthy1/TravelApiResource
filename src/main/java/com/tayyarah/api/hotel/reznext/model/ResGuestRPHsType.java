//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:12:45 AM IST 
//


package com.tayyarah.api.hotel.reznext.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResGuestRPHsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGuestRPHsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuestRPH" type="{}ResGuestRPHType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestRPHsType", propOrder = {
    "resGuestRPH"
})
public class ResGuestRPHsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ResGuestRPH", required = true)
    protected ResGuestRPHType resGuestRPH;

    /**
     * Gets the value of the resGuestRPH property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestRPHType }
     *     
     */
    public ResGuestRPHType getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * Sets the value of the resGuestRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestRPHType }
     *     
     */
    public void setResGuestRPH(ResGuestRPHType value) {
        this.resGuestRPH = value;
    }

}
