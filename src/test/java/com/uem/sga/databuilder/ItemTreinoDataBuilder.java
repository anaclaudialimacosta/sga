package com.uem.sga.databuilder;

import com.uem.sga.model.Exercicio;
import com.uem.sga.model.ItemTreino;
import com.uem.sga.model.TipoRepeticao;
import com.uem.sga.model.Treino;

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
