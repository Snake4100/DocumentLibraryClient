
package org.url.documentlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generePDFResponse", propOrder = {
    "_return"
})
public class GenerePDFResponse {

    @XmlElement(name = "return")
    protected Pdf _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link Pdf }
     *     
     */
    public Pdf getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link Pdf }
     *     
     */
    public void setReturn(Pdf value) {
        this._return = value;
    }

}
