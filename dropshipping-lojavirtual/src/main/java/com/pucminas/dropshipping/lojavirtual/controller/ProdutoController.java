package com.pucminas.dropshipping.lojavirtual.controller;

import com.pucminas.dropshipping.lojavirtual.model.Produto;
import com.pucminas.dropshipping.lojavirtual.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "API Serviços de Produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @ApiOperation(
            value="Disponibilizar a lista de produtos de uma categoria informada",
            response= Produto.class,
            notes="A funcionalidade retorna a lista de produtos relacionadas, dos fornecedores, classificados por categorias")
    @ApiResponses(value= {
            @ApiResponse(
                    code=200,
                    message="Lista de produtos relacionados com uma categoria",
                    response=Produto.class
            ),
            @ApiResponse(
                    code=500,
                    message="Problemas de Servidor para retorno da lista de produtos",
                    response=Produto.class
            )

    })
    @GetMapping("/produtos/{idCategoria}")
    public List<Produto> getTodosProdutos(@PathVariable Long idCategoria) {
        return produtoService.getListarProdutoCategoria(idCategoria);
    }
}