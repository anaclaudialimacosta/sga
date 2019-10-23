package com.uem.sga.model;

import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plano")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private PrecosAtividades valorMensal;

    @Column
    private int diaVencimento;

    @Column
    private List<String> atividades;

    Plano() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDiaVencimento(int diaVencimento) { this.diaVencimento = diaVencimento; }

    public void setAtividades(List<String> atividades) { this.atividades = atividades; }

    public PrecosAtividades getValorMensal() { return valorMensal; }

    public void setValorMensal(PrecosAtividades valorMensal) { this.valorMensal = valorMensal; }

    public int getDiaVencimento() { return diaVencimento; }

    public List<String> getAtividades() { return atividades; }

    public static class Builder{
        private Plano plano;

        public Builder(){
            this.plano = new Plano();
        }

        public Builder PrecosAtividades(PrecosAtividades precosAtividades){
            this.plano.valorMensal = precosAtividades;
            return this;
        }

        public Builder Atividades(List<String> atividades){
            this.plano.atividades = atividades;
            return this;
        }

        public Plano build(){
            Assert.notNull(this.plano.atividades, "Exercício é um campo obrigatorio");
            Assert.notNull(this.plano.diaVencimento, "Quantidade de Repetições é um campo obrigatorio");
            Assert.notNull(this.plano.valorMensal, "Tipo de Repetição é campo obrigatório");

            return this.plano;
        }

    }
}
