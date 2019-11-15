//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.15 às 04:23:02 PM BRST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ItemVenda complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemVenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idFornecedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="situacaoAtendimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemVenda", propOrder = {
    "idVenda",
    "idFornecedor",
    "idProduto",
    "valorUnitario",
    "quantidadeSolicitada",
    "situacaoAtendimento"
})
public class ItemVenda {

    protected int idVenda;
    protected int idFornecedor;
    protected int idProduto;
    protected double valorUnitario;
    protected int quantidadeSolicitada;
    protected int situacaoAtendimento;

    /**
     * Obtém o valor da propriedade idVenda.
     * 
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * Define o valor da propriedade idVenda.
     * 
     */
    public void setIdVenda(int value) {
        this.idVenda = value;
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
     * Obtém o valor da propriedade idProduto.
     * 
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o valor da propriedade idProduto.
     * 
     */
    public void setIdProduto(int value) {
        this.idProduto = value;
    }

    /**
     * Obtém o valor da propriedade valorUnitario.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeSolicitada.
     * 
     */
    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Define o valor da propriedade quantidadeSolicitada.
     * 
     */
    public void setQuantidadeSolicitada(int value) {
        this.quantidadeSolicitada = value;
    }

    /**
     * Obtém o valor da propriedade situacaoAtendimento.
     * 
     */
    public int getSituacaoAtendimento() {
        return situacaoAtendimento;
    }

    /**
     * Define o valor da propriedade situacaoAtendimento.
     * 
     */
    public void setSituacaoAtendimento(int value) {
        this.situacaoAtendimento = value;
    }

}
