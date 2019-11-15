package com.pucminas.dropshipping.lojavirtual.service;

import com.pucminas.dropshipping.lojavirtual.model.Produto;
import com.pucminas.dropshipping.lojavirtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Cacheable(cacheNames = "Produto", key="#root.method.name")
    public List<Produto> getListarProdutoCategoria (Long idCategoria){
        return produtoRepository.findAllProdutoByIdCategoria(idCategoria);
    }

}
