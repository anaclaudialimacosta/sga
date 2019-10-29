package com.uem.sga.repository;

import com.uem.sga.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

    Aluno findAlunoById(Long idAluno);

}
