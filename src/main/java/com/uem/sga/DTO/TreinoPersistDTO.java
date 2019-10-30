package com.uem.sga.DTO;

import com.uem.sga.model.Aluno;
import com.uem.sga.model.ItemTreino;
import com.uem.sga.model.Professor;

import java.util.List;

public class TreinoPersistDTO {

    private Professor professorResponsavel;
    private List<ItemTreino> exercicios;
    private Aluno aluno;

    public Professor getProfessorResponsavel() {
        return this.professorResponsavel;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public List<ItemTreino> getExercicios() {
        return this.exercicios;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setExercicios(List<ItemTreino> exercicios) {
        this.exercicios = exercicios;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

}
