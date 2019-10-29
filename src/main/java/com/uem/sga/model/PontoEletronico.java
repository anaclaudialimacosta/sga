package com.uem.sga.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name="pontoEletronico")
public class PontoEletronico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idFuncionario")
    private Long idFuncionario;

    @Column(name = "classeFuncionario")
    private TipoUsuario classe;

    @Column(name = "horaInicio")
    private Time horaInicio;

    @Column(name = "horaFim")
    private Time horaFim;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoUsuario getClasse() {
        return classe;
    }

    public void setClasse(TipoUsuario classe) {
        this.classe = classe;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public PontoEletronico() {
    }
}

