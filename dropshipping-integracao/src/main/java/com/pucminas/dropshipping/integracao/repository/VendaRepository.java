package com.pucminas.dropshipping.integracao.repository;

import com.pucminas.dropshipping.integracao.domain.VendaFornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;



import java.util.List;

public interface VendaRepository extends MongoRepository<VendaFornecedor, String> {

    @Query(value = "{'itemVendas.idFornecedor': ?0, 'itemVendas.situacaoAtendimento' : ?1 }", fields = "{'id':1, 'cliente':1,'itemVendas':1, 'dataCompra' : 1, 'situacaoAtendimento' : 1}" )
    List<VendaFornecedor> findVendaAbertaByFornecedor(int idFornecedor, Integer situacaoAtendimento);

    @Query(value = "{'_id': ?0, 'itemVendas.idFornecedor' : ?1 }", fields = "{'_id':1, 'cliente':1,'itemVendas':1, 'dataCompra' : 1, 'situacaoAtendimento' : 1}" )
    VendaFornecedor findVendaAbertaById(Integer idVenda, Integer idFornecedor);
}
