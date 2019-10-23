package com.uem.sga.repository;

import com.uem.sga.model.AulaExperimental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaExperimentalRepository extends CrudRepository<AulaExperimental,Long> {
}
