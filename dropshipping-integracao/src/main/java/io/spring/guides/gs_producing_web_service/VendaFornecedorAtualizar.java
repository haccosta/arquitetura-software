//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.15 às 04:23:02 PM BRST 
//


package io.spring.guides.gs_producing_web_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VendaFornecedorAtualizar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VendaFornecedorAtualizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFornecedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoProdutoLiberado" type="{http://spring.io/guides/gs-producing-web-service}ItemVendaAbertaFornecedor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendaFornecedorAtualizar", propOrder = {
    "id",
    "idFornecedor",
    "codigoProdutoLiberado"
})
public class VendaFornecedorAtualizar {

    protected int id;
    protected int idFornecedor;
    @XmlElement(required = true)
    protected List<ItemVendaAbertaFornecedor> codigoProdutoLiberado;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade idFornecedor.
     * 
     */
    public int getIdFornecedor() {
        return idFornecedor;
    }

    /**
     * Define o valor da propriedade idFornecedor.
     * 
     */
    public void setIdFornecedor(int value) {
        this.idFornecedor = value;
    }

    /**
     * Gets the value of the codigoProdutoLiberado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoProdutoLiberado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoProdutoLiberado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemVendaAbertaFornecedor }
     * 
     * 
     */
    public List<ItemVendaAbertaFornecedor> getCodigoProdutoLiberado() {
        if (codigoProdutoLiberado == null) {
            codigoProdutoLiberado = new ArrayList<ItemVendaAbertaFornecedor>();
        }
        return this.codigoProdutoLiberado;
    }

}
