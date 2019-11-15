//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.15 às 04:23:02 PM BRST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendaFornecedor" type="{http://spring.io/guides/gs-producing-web-service}VendaFornecedorAtualizar"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendaFornecedor"
})
@XmlRootElement(name = "atualizarVendaAbertaFornecedorRequest")
public class AtualizarVendaAbertaFornecedorRequest {

    @XmlElement(required = true)
    protected VendaFornecedorAtualizar vendaFornecedor;

    /**
     * Obtém o valor da propriedade vendaFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link VendaFornecedorAtualizar }
     *     
     */
    public VendaFornecedorAtualizar getVendaFornecedor() {
        return vendaFornecedor;
    }

    /**
     * Define o valor da propriedade vendaFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link VendaFornecedorAtualizar }
     *     
     */
    public void setVendaFornecedor(VendaFornecedorAtualizar value) {
        this.vendaFornecedor = value;
    }

}
