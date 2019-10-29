package com.uem.sga.DTO;

import java.sql.Date;
import java.sql.Time;

public class AulaExperimentalDTO {


    private Long id;
    private Date dataAgendamento;

    private Long idProfessor;

    private Long idVisitante;


    private Time horaInicio;


    private Time horaFim;


    private  boolean  desmarcada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDesmarcada() {
        return desmarcada;
    }

    public void setDesmarcada(boolean desmarcada) {
        this.desmarcada = desmarcada;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Long getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Long idVisitante) {
        this.idVisitante = idVisitante;
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
