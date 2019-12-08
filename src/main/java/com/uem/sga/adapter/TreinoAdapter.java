package com.uem.sga.adapter;

import com.uem.sga.DTO.TreinoResponseDTO;
import com.uem.sga.model.ItemTreino;
import com.uem.sga.model.Treino;

import java.util.List;

public class TreinoAdapter {

    public static  TreinoResponseDTO entityToResponse(Treino treino){
        TreinoResponseDTO treinoResponse= new TreinoResponseDTO();
        treinoResponse.setAluno(treino.getAluno());
        treinoResponse.setProfessorResponsavel(treino.getProfessorResponsavel());
        treinoResponse.setExercicios(treino.getExerciciosTreino());
        return treinoResponse;
    }



}
