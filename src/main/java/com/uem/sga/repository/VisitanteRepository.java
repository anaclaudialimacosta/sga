package com.uem.sga.repository;

import com.uem.sga.model.Visitante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends CrudRepository<Visitante, Long> {


    Visitante findVisitanteById(Long idVisitante);
}
