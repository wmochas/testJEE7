
package ec.com.mochas.testws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saludarResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saludarResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saludo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saludarResponse", propOrder = {
    "saludo"
})
public class SaludarResponse {

    protected String saludo;

    /**
     * Obtiene el valor de la propiedad saludo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * Define el valor de la propiedad saludo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaludo(String value) {
        this.saludo = value;
    }

}
