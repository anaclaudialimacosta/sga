package com.uem.sga.repository;

import com.uem.sga.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository< Professor, Long> {

    Professor findProfessorById(Long idProfessor);
}
