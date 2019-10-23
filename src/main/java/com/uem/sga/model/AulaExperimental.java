package com.uem.sga.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

        public AulaExperimental build() {
            return this.aulaExperimental;
        }
    }
}
