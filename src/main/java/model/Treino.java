package model;

import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Table(name = "treino")
@Entity
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToOne
    private Aluno aluno;

    @NotNull
    @OneToOne
    private Professor professorResponsavel;

    @ElementCollection
    private List<ItemTreino> exerciciosTreino;

    Treino(){

    }

    public static Builder builder(){
        return new Treino.Builder();

    }

    public Long getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public List<ItemTreino> getExerciciosTreino() {
        return exerciciosTreino;
    }

    public void adicionarItemNoTreino(ItemTreino itemTreino){
        this.exerciciosTreino.add(itemTreino);
    }

    public void removerItemTreino(ItemTreino itemTreino){
        if(!exerciciosTreino.isEmpty() && this.exerciciosTreino.contains(itemTreino)) exerciciosTreino.remove(itemTreino);
        throw new RuntimeException("O item para ser removido não foi encontrado!");
    }


    public static class Builder{

        private Treino treino;

        public Builder(){

            this.treino = new Treino();

        }

        public Builder professor(Professor professor){
            this.treino.professorResponsavel = professor;
            return this;
        }

        public Builder aluno(Aluno aluno){
            this.treino.aluno = aluno;
            return this;
        }

        public Treino buiild(){
            this.treino.exerciciosTreino = new ArrayList<>();
            Assert.notNull(this.treino.aluno, "Aluno é campo obrigatório");
            Assert.notNull(this.treino.professorResponsavel, "Professor Responsável é obrigatório");
            return  this.treino;
        }


    }

}
