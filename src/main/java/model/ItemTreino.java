package model;

import org.springframework.util.Assert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Table(name="itemTreino")
@Entity
public class ItemTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "exercicio")
    private Exercicio exercicio;

    @NotNull
    @Column(name="qtde_repeticao")
    private Integer qtdeRepeticao;

    @NotNull
    @Column(name="tipoRepeticao")
    private TipoRepeticao tipoRepeticao;

    @Column(name="observacao")
    private String observacao;

    @ManyToOne
    @JoinColumn(name="treino_id", nullable = false)
    private Treino treino;

    ItemTreino(){

    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public Integer getQtdeRepeticao() {
        return qtdeRepeticao;
    }

    public String getObservacao() {
        return observacao;
    }

    public Long getId() {
        return id;
    }

    public TipoRepeticao getTipoRepeticao() {
        return tipoRepeticao;
    }

    public Treino getTreino() {
        return treino;
    }

    public static Builder builder(){
        return  new ItemTreino.Builder();
    }

   public static class Builder{
       private ItemTreino itemTreino;

       public Builder(){
           this.itemTreino = new ItemTreino();
       }

       public Builder exercicio(Exercicio exercicio){
           this.itemTreino.exercicio = exercicio;
           return this;
       }
       public Builder treino(Treino treino){
           this.itemTreino.treino = treino;
           return this;
       }

       public Builder repeticao(Integer qutdeRepeticao){
           this.itemTreino.qtdeRepeticao = qutdeRepeticao;
           return this;
       }
       public Builder tipoRepeticao( TipoRepeticao tipoRepeticao){
           this.itemTreino.tipoRepeticao = tipoRepeticao;
           return this;
       }
       public Builder observacao(String observacao){
           this.itemTreino.observacao = observacao;
           return this;
       }
       public ItemTreino build(){
           Assert.notNull(this.itemTreino.exercicio, "Exercício é um campo obrigatorio");
           Assert.notNull(this.itemTreino.qtdeRepeticao, "Quantidade de Repetições é um campo obrigatorio");
           Assert.notNull(this.itemTreino.tipoRepeticao, "Tipo de Repetição é campo obrigatório");
           Assert.notNull(this.itemTreino.treino, "O item de treino deve ser aliado a um treino");

           this.itemTreino.treino.adicionarItemNoTreino(this.itemTreino);

            return this.itemTreino;
       }

    }
}
