package com.uem.sga.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="aulaExperimental")
public class AulaExperimental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "dataAgendamento")
    private Date dataAgendamento;

    @NotNull
    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professorAlocado;

    @NotNull
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno alunoAlocado;


    @Column(name = "horaInicio")
    private Time horaInicio;

    @Column(name = "horaFim")
    private Time horaFim;

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


    public AulaExperimental() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Professor getProfessorAlocado() {
        return professorAlocado;
    }

    public void setProfessorAlocado(Professor professorAlocado) {
        this.professorAlocado = professorAlocado;
    }

    public Aluno getAlunoAlocado() {
        return alunoAlocado;
    }

    public void setAlunoAlocado(Aluno alunoAlocado) {
        this.alunoAlocado = alunoAlocado;
    }


    public static AvaliacaoFisica.Builder builder(){
        return new AvaliacaoFisica.Builder();

    }

    public static class Builder {

        private AulaExperimental aulaExperimental;

        public Builder() {
            this.aulaExperimental = new AulaExperimental();
        }

        public Builder dataAgendamento(Date data) {
            this.aulaExperimental.dataAgendamento = data;
            return this;
        }

        public Builder alunoAlocado(Aluno aluno) {
            this.aulaExperimental.alunoAlocado = aluno;
            return this;
        }

        public Builder professorAlocado(Professor professor) {
            this.aulaExperimental.professorAlocado = professor;
            return this;
        }

        public Builder horaInicio(Time horaInicio){
            this.aulaExperimental.horaInicio = horaInicio;
            return this;
        }
        public Builder horaFim(Time horaFim){
            this.aulaExperimental.horaFim = horaFim;
            return this;
        }

        public AulaExperimental build() {
            return this.aulaExperimental;
        }
    }
}
