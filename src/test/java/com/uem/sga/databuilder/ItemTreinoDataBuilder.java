package com.uem.sga.databuilder;

import model.Exercicio;
import model.ItemTreino;
import model.TipoRepeticao;
import model.Treino;

public class ItemTreinoDataBuilder {
    public static Treino CONSTRAINT_TREINO = TreinoDataBuilder.fullTreino();

    public static ItemTreino fullItemDataBuilder(){
        return ItemTreino.builder()
                .treino(CONSTRAINT_TREINO)
                .tipoRepeticao(TipoRepeticao.VEZES)
                .exercicio(Exercicio.CRUCIFIXO)
                .repeticao(20)
                .observacao(" aijsiaj ")
                .build();
    }
}
