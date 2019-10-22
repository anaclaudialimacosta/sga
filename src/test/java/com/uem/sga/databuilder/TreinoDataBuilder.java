package com.uem.sga.databuilder;

import com.uem.sga.model.Aluno;
import com.uem.sga.model.Professor;
import com.uem.sga.model.Treino;

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
