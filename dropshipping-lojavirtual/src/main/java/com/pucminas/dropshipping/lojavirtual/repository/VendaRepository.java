package com.pucminas.dropshipping.lojavirtual.repository;


import com.pucminas.dropshipping.lojavirtual.domain.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {

    @Query(value = "{'_id': ?0}", fields = "{'id':1, 'cliente':1,'itemVendas':1, 'dataCompra' : 1, 'situacaoAtendimento' : 1}" )
    Venda findVendaByCliente(Long _id);

  }

