//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.28 at 09:09:38 AM CET 
//


package com.dac6.convert.dac6.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelevantTaxpayers_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelevantTaxpayers_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelevantTaxpayer" type="{urn:eu:taxud:dac6:v1}TaxPayer_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelevantTaxpayers_Type", propOrder = {
    "relevantTaxpayer"
})
public class RelevantTaxpayersType {

    @XmlElement(name = "RelevantTaxpayer")
    protected List<TaxPayerType> relevantTaxpayer;

    /**
     * Gets the value of the relevantTaxpayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantTaxpayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantTaxpayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPayerType }
     * 
     * 
     */
    public List<TaxPayerType> getRelevantTaxpayer() {
        if (relevantTaxpayer == null) {
            relevantTaxpayer = new ArrayList<TaxPayerType>();
        }
        return this.relevantTaxpayer;
    }

}