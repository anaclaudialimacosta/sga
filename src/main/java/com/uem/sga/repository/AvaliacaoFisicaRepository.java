package com.uem.sga.repository;

import com.uem.sga.model.AvaliacaoFisica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends CrudRepository<AvaliacaoFisica, Long> {

}
