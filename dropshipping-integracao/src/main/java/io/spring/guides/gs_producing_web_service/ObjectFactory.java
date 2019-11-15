//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.15 às 04:23:02 PM BRST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVendaFornecedorResponseDetails }
     * 
     */
    public GetVendaFornecedorResponseDetails createGetVendaFornecedorResponseDetails() {
        return new GetVendaFornecedorResponseDetails();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link GetVendaFornecedorRequest }
     * 
     */
    public GetVendaFornecedorRequest createGetVendaFornecedorRequest() {
        return new GetVendaFornecedorRequest();
    }

    /**
     * Create an instance of {@link AtualizarVendaAbertaFornecedorResponse }
     * 
     */
    public AtualizarVendaAbertaFornecedorResponse createAtualizarVendaAbertaFornecedorResponse() {
        return new AtualizarVendaAbertaFornecedorResponse();
    }

    /**
     * Create an instance of {@link AtualizarVendaAbertaFornecedorRequest }
     * 
     */
    public AtualizarVendaAbertaFornecedorRequest createAtualizarVendaAbertaFornecedorRequest() {
        return new AtualizarVendaAbertaFornecedorRequest();
    }

    /**
     * Create an instance of {@link VendaFornecedorAtualizar }
     * 
     */
    public VendaFornecedorAtualizar createVendaFornecedorAtualizar() {
        return new VendaFornecedorAtualizar();
    }

    /**
     * Create an instance of {@link ItemVenda }
     * 
     */
    public ItemVenda createItemVenda() {
        return new ItemVenda();
    }

    /**
     * Create an instance of {@link ItemVendaAbertaFornecedor }
     * 
     */
    public ItemVendaAbertaFornecedor createItemVendaAbertaFornecedor() {
        return new ItemVendaAbertaFornecedor();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

}
