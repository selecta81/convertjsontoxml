//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.28 at 09:09:38 AM CET 
//


package com.dac6.convert.dac6.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureReason_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisclosureReason_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAC6701"/&gt;
 *     &lt;enumeration value="DAC6702"/&gt;
 *     &lt;enumeration value="DAC6703"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisclosureReason_EnumType")
@XmlEnum
public enum DisclosureReasonEnumType {


    /**
     * Arrangement is made available for implementation
     * 
     */
    @XmlEnumValue("DAC6701")
    DAC_6701("DAC6701"),

    /**
     * Arrangement is ready for implementation
     * 
     */
    @XmlEnumValue("DAC6702")
    DAC_6702("DAC6702"),

    /**
     * First step in the implementation of the Arrangement has been made or will be made.
     * 
     */
    @XmlEnumValue("DAC6703")
    DAC_6703("DAC6703");
    private final String value;

    DisclosureReasonEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisclosureReasonEnumType fromValue(String v) {
        for (DisclosureReasonEnumType c: DisclosureReasonEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}