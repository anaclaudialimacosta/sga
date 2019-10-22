package com.uem.sga.repository;

import com.uem.sga.model.AulaExperimental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AulaExperimentalRepository extends CrudRepository<AulaExperimental,Long> {

    List<AulaExperimental> findAllByDataAgendamento(Date date);
}
