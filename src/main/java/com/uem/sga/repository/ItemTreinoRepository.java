package com.uem.sga.repository;

import model.ItemTreino;
import model.Treino;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemTreinoRepository extends JpaRepository<ItemTreino, Long> {

    Optional<ItemTreino> findByTreino(Treino treino);


}
