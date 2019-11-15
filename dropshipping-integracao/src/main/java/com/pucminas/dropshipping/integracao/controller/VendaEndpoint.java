package com.pucminas.dropshipping.integracao.controller;

import com.pucminas.dropshipping.integracao.service.VendaProcessamentoService;
import io.spring.guides.gs_producing_web_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Map;

@Endpoint
public class VendaEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @Autowired
    VendaProcessamentoService vendaService;

    @Value("${jwt.secret}")
    private String secret;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVendaFornecedorRequest")
    @ResponsePayload
    public GetVendaFornecedorResponseDetails getVendaAbertaFornecedor(@RequestPayload GetVendaFornecedorRequest request) throws Exception {
        try {

            GetVendaFornecedorResponseDetails response = new GetVendaFornecedorResponseDetails();

            response.getVenda().clear();
            response.getVenda().clear();
            response.getVenda().addAll(vendaService.getVendaAbertaFornecedor(request.getIdFornecedor()));

            return response;

        } catch (Exception ex) {
            throw ex;
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "atualizarVendaAbertaFornecedorRequest")
    @ResponsePayload
    public AtualizarVendaAbertaFornecedorResponse doAtualizarVendaAbertaFornecedor(@RequestPayload AtualizarVendaAbertaFornecedorRequest request) throws Exception {
        try {

            AtualizarVendaAbertaFornecedorResponse response = new AtualizarVendaAbertaFornecedorResponse();

            response.setServiceStatus(vendaService.atualizarVendaFornecedor(request.getVendaFornecedor()));

            return response;

        } catch (Exception ex) {
            throw ex;
        }


    }

}
