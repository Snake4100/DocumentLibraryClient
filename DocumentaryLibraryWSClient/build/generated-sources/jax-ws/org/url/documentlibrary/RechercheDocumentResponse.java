
package org.url.documentlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheDocumentResponse", propOrder = {
    "_return"
})
public class RechercheDocumentResponse {

    @XmlElement(name = "return")
    protected DocumentMap _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMap }
     *     
     */
    public DocumentMap getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMap }
     *     
     */
    public void setReturn(DocumentMap value) {
        this._return = value;
    }

}
