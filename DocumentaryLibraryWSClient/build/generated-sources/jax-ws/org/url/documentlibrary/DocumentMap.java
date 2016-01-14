
package org.url.documentlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentMap", propOrder = {
    "realMap"
})
public class DocumentMap {

    @XmlElement(required = true)
    protected DocumentMap.RealMap realMap;

    /**
     * Obtient la valeur de la propriété realMap.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMap.RealMap }
     *     
     */
    public DocumentMap.RealMap getRealMap() {
        return realMap;
    }

    /**
     * Définit la valeur de la propriété realMap.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMap.RealMap }
     *     
     */
    public void setRealMap(DocumentMap.RealMap value) {
        this.realMap = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class RealMap {

        protected List<DocumentMap.RealMap.Entry> entry;

        public List<DocumentMap.RealMap.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<DocumentMap.RealMap.Entry>();
            }
            return this.entry;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected Integer key;
            protected String value;

            /**
             * Obtient la valeur de la propriété key.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getKey() {
                return key;
            }

            /**
             * Définit la valeur de la propriété key.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setKey(Integer value) {
                this.key = value;
            }

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
