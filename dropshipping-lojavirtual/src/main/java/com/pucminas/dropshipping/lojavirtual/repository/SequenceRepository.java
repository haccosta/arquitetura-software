package com.pucminas.dropshipping.lojavirtual.repository;

import com.pucminas.dropshipping.lojavirtual.domain.SequenceId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceRepository extends MongoRepository<SequenceId, String>{
}
