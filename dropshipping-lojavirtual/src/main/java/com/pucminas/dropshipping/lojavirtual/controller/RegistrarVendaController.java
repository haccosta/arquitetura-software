package com.pucminas.dropshipping.lojavirtual.controller;

import com.pucminas.dropshipping.lojavirtual.domain.Venda;
import com.pucminas.dropshipping.lojavirtual.dto.VendaDTO;
import com.pucminas.dropshipping.lojavirtual.service.VendaProcessamentoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "API Serviços de Vendas")
public class RegistrarVendaController {

    @Autowired
    VendaProcessamentoService vendaProcessamentoService;

    @ApiOperation(
            value="Processo de Registro da Venda",
            response= VendaDTO.class,
            notes="Essa operação realiza a captação das vendas pra processamento assincrono das informações")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", paramType = "header"),
            @ApiImplicitParam(name = "Content-Type", value = "application/json", paramType = "header")
    })
    @RequestMapping(value = "/doRegistrarVenda", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> doRegistrarVenda(@RequestBody VendaDTO vendaDTO){
        vendaProcessamentoService.registrarVenda(vendaDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Venda Registrada com Sucesso! Estaremos avaliando a venda e retornaremos em breve!");
    }

    @ApiOperation(
            value="Disponibilizar a compra realizada pelo cliente",
            response= Venda.class,
            notes="A funcionalidade disponibiliza a compra realizada pelo cliente através do código da compra")
    @ApiResponses(value= {
            @ApiResponse(
                    code=200,
                    message="A compra com os produtos selecionadas",
                    response=Venda.class
            ),
            @ApiResponse(
                    code=500,
                    message="Problemas de Servidor para retorno da compra",
                    response=Venda.class
            )

    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", paramType = "header"),
            @ApiImplicitParam(name = "Content-Type", value = "application/json", paramType = "header")
    })

    @GetMapping(path = "/getVendaCliente/{idVenda}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getVendaCliente(@PathVariable long idVenda)
    {
        Venda venda = vendaProcessamentoService.findByVendaCliente(idVenda);

        return new ResponseEntity<Object>(venda, HttpStatus.OK);
    }

 }
