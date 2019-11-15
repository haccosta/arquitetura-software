//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.15 às 04:23:02 PM BRST 
//


package io.spring.guides.gs_producing_web_service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Venda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Venda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cliente" type="{http://spring.io/guides/gs-producing-web-service}Cliente"/>
 *         &lt;element name="dataVenda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="situacaoVenda" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="itensVenda" type="{http://spring.io/guides/gs-producing-web-service}ItemVenda" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Venda", propOrder = {
    "id",
    "cliente",
    "dataVenda",
    "situacaoVenda",
    "itensVenda"
})
public class Venda {

    protected int id;
    @XmlElement(required = true)
    protected Cliente cliente;
    @XmlElement(required = true)
    protected String dataVenda;
    @XmlElement(required = true)
    protected BigInteger situacaoVenda;
    @XmlElement(required = true)
    protected List<ItemVenda> itensVenda;

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
     * Obtém o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtém o valor da propriedade dataVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * Define o valor da propriedade dataVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVenda(String value) {
        this.dataVenda = value;
    }

    /**
     * Obtém o valor da propriedade situacaoVenda.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituacaoVenda() {
        return situacaoVenda;
    }

    /**
     * Define o valor da propriedade situacaoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituacaoVenda(BigInteger value) {
        this.situacaoVenda = value;
    }

    /**
     * Gets the value of the itensVenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensVenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensVenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemVenda }
     * 
     * 
     */
    public List<ItemVenda> getItensVenda() {
        if (itensVenda == null) {
            itensVenda = new ArrayList<ItemVenda>();
        }
        return this.itensVenda;
    }

}
