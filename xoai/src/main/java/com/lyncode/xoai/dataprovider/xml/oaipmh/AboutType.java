//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.dataprovider.xml.oaipmh;

import com.lyncode.xoai.dataprovider.exceptions.WritingXmlException;
import com.lyncode.xoai.dataprovider.xml.EchoElement;
import com.lyncode.xoai.dataprovider.xml.XMLWritable;
import com.lyncode.xoai.dataprovider.xml.XmlOutputContext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Data "about" the record must be expressed in XML that is compliant with an
 * XML Schema defined by a community.
 *
 *
 * Java class for aboutType complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within
 * this class.
 *











 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aboutType")
public class AboutType implements XMLWritable {

    @XmlValue
    protected String value;

    /**
     * Gets the value of the any property.
     *
     * @return possible object is ;
     */
    public String getAny() {
        return value;
    }

    /**
     * Sets the value of the any property.
     *
     * @param value allowed object is ;
     */
    public void setAny(String value) {
        this.value = value;
    }

    @Override
    public void write(XmlOutputContext context) throws WritingXmlException {
        if (this.value != null) {
            EchoElement elem = new EchoElement(value);
            elem.write(context);
        }
    }

}
