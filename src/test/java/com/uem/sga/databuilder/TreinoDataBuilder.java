package com.uem.sga.databuilder;

import model.Aluno;
import model.Professor;
import model.Treino;

public class TreinoDataBuilder {

    public static Aluno CONSTRAINT_ALUNO = new Aluno();
    public static Professor CONSTRAINT_PROFESSOR = new Professor();


    public static Treino fullTreino(){
        return Treino.builder()
                .aluno(CONSTRAINT_ALUNO)
                .professor(CONSTRAINT_PROFESSOR)
                .buiild();
    }

}
