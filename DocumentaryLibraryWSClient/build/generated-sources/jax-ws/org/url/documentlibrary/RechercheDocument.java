
package org.url.documentlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheDocument", propOrder = {
    "motsCles",
    "condition"
})
public class RechercheDocument {

    @XmlElement(nillable = true)
    protected List<String> motsCles;
    protected String condition;

    /**
     * Gets the value of the motsCles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motsCles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotsCles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMotsCles() {
        if (motsCles == null) {
            motsCles = new ArrayList<String>();
        }
        return this.motsCles;
    }

    /**
     * Obtient la valeur de la propriété condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Définit la valeur de la propriété condition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
