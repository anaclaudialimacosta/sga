package com.uem.sga.DTO;

import com.uem.sga.model.Aluno;
import com.uem.sga.model.Professor;

import java.sql.Date;
import java.sql.Time;

public class AulaExperimentalDTO {


    private Date dataAgendamento;

    private Long professorAlocado;


    private Long alunoAlocado;


    private Time horaInicio;


    private Time horaFim;

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Long getProfessorAlocado() {
        return professorAlocado;
    }

    public void setProfessorAlocado(Long professorAlocado) {
        this.professorAlocado = professorAlocado;
    }

    public Long getAlunoAlocado() {
        return alunoAlocado;
    }

    public void setAlunoAlocado(Long alunoAlocado) {
        this.alunoAlocado = alunoAlocado;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }


}
