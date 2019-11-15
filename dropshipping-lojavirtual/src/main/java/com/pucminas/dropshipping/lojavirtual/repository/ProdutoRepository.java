package com.pucminas.dropshipping.lojavirtual.repository;

import com.pucminas.dropshipping.lojavirtual.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllProdutoByIdCategoria(long idCategoria);
}
