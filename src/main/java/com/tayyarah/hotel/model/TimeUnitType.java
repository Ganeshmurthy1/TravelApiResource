//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.09 at 04:51:51 PM IST 
//


package com.tayyarah.hotel.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="FullDuration"/>
 *     &lt;enumeration value="Minute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */

@XmlType(name = "timeUnitType")
@XmlEnum
public enum TimeUnitType {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("FullDuration")
    FULL_DURATION("FullDuration"),
    @XmlEnumValue("Minute")
    MINUTE("Minute");
    private final String value;

    TimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitType fromValue(String v) {
        for (TimeUnitType c: TimeUnitType.values()) {
        	
        	String value = c.value.toLowerCase();
        	String input = v.toLowerCase();
        	
            if (value.equals(input) || value.contains(input) || input.contains(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
