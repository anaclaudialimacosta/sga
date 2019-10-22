package com.uem.sga.repository;

import model.Aluno;
import model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TreinoRepository extends JpaRepository<Treino,Long> {

    Optional<Treino> findById(Long id);
    Optional<Treino> findByAluno(Aluno aluno);
}
