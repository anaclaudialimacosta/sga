package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="itemTreino")
public class ItemTreino {

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
        return this.itemTreino;
       }

    }
}
