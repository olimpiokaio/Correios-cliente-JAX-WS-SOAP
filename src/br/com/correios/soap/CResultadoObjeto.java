
package br.com.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cResultadoObjeto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cResultadoObjeto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Objetos" type="{http://tempuri.org/}ArrayOfCObjeto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultadoObjeto", propOrder = {
    "objetos"
})
public class CResultadoObjeto {

    @XmlElement(name = "Objetos")
    protected ArrayOfCObjeto objetos;

    /**
     * Obtém o valor da propriedade objetos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCObjeto }
     *     
     */
    public ArrayOfCObjeto getObjetos() {
        return objetos;
    }

    /**
     * Define o valor da propriedade objetos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCObjeto }
     *     
     */
    public void setObjetos(ArrayOfCObjeto value) {
        this.objetos = value;
    }

}
