package com.uem.sga.repository;

import com.uem.sga.controller.PontoEletronico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoEletronicoRepository extends CrudRepository<PontoEletronico, Long> {

}
