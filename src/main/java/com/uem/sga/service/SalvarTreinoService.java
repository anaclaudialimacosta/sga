package com.uem.sga.service;

import com.uem.sga.DTO.TreinoPersistDTO;
import com.uem.sga.model.Treino;
import com.uem.sga.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarTreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    public void salvar(TreinoPersistDTO treinoPersistDTO){
        Treino treino = Treino.builder()
                .aluno(treinoPersistDTO.getAluno())
                .professor(treinoPersistDTO.getProfessorResponsavel())
                .buiild();
        treinoRepository.save(treino);
    }

}
