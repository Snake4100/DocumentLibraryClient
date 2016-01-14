
package org.url.documentlibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdf", propOrder = {
    "nom",
    "contenu"
})
public class Pdf {

    protected String nom;
    protected byte[] contenu;

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété contenu.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContenu() {
        return contenu;
    }

    /**
     * Définit la valeur de la propriété contenu.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContenu(byte[] value) {
        this.contenu = value;
    }

}
