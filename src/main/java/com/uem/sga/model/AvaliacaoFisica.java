package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="avaliacaoFisica")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Column(name = "dataAgendamento")
    private Date dataAgendamento;

    @NotNull
    @Column(name = "professorAlocado")
    private Professor professorAlocado;

    @NotNull
    @Column(name = "alunoAlocado")
    private Aluno alunoAlocado;

    public AvaliacaoFisica() {
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


    public static Builder builder(){
        return new Builder();

    }

    public static class Builder {

        private AvaliacaoFisica avaliacaoFisica;

        public Builder(){
            this.avaliacaoFisica = new AvaliacaoFisica();
        }

        public  Builder dataAgendamento(Date data){
            this.avaliacaoFisica.dataAgendamento = data;
            return this;
        }

        public  Builder alunoAlocado(Aluno aluno){
            this.avaliacaoFisica.alunoAlocado = aluno;
            return this;
        }

        public  Builder professorAlocado(Professor professor){
            this.avaliacaoFisica.professorAlocado = professor;
            return this;
        }

        public AvaliacaoFisica build(){
            return  this.avaliacaoFisica;
        }
    }
}
