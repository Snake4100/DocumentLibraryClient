
package org.url.documentlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retourneDocument", propOrder = {
    "index"
})
public class RetourneDocument {

    protected int index;

    /**
     * Obtient la valeur de la propriété index.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
