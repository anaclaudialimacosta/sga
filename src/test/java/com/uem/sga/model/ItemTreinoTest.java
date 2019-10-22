package com.uem.sga.model;

import com.uem.sga.databuilder.TreinoDataBuilder;
import model.*;
import org.junit.Test;
import org.mockito.Mock;

import static com.uem.sga.databuilder.TreinoDataBuilder.CONSTRAINT_ALUNO;
import static com.uem.sga.databuilder.TreinoDataBuilder.CONSTRAINT_PROFESSOR;
import static org.junit.Assert.*;


public class ItemTreinoTest {

    @Mock
    private Professor professor;

    @Mock
    private Aluno aluno;

    private Exercicio exercicio = Exercicio.ABDOMINAL_NORMAL;
    private Treino treino = TreinoDataBuilder.fullTreino();

    @Test
    public void deveCriarUmItemDeTreinoComSucesso(){
        ItemTreino itemTreino = ItemTreino.builder()
                .exercicio(exercicio)
                .repeticao(10)
                .tipoRepeticao(TipoRepeticao.VEZES)
                .observacao("Usar a barra")
                .treino(treino)
                .build();

        assertEquals(exercicio, itemTreino.getExercicio());
        assertEquals(10, itemTreino.getQtdeRepeticao(), 0.0001);
        assertEquals(TipoRepeticao.VEZES, itemTreino.getTipoRepeticao());
        assertEquals( CONSTRAINT_ALUNO, treino.getAluno());
        assertEquals( CONSTRAINT_PROFESSOR, treino.getProfessorResponsavel());
        assertEquals("Usar a barra",itemTreino.getObservacao());
        assertFalse(treino.getExerciciosTreino().isEmpty());
    }

    @Test
    public void deveRetornarExceptionQuandoExercicioNull(){
        String mensagem = null;
        try{
            ItemTreino itemTreino = ItemTreino.builder()
                    .exercicio(null)
                    .repeticao(10)
                    .tipoRepeticao(TipoRepeticao.VEZES)
                    .observacao("Usar a barra")
                    .treino(treino)
                    .build();
        }catch(Exception e) {
            mensagem = e.getMessage();
        }
        assertEquals("Exercício é um campo obrigatorio", mensagem);


    }
    @Test
    public void deveRetornarExceptionQuandoTreinoNull(){
        String mensagem = null;
        try{
            ItemTreino itemTreino = ItemTreino.builder()
                    .exercicio(exercicio)
                    .repeticao(10)
                    .tipoRepeticao(TipoRepeticao.VEZES)
                    .observacao("Usar a barra")
                    .treino(null)
                    .build();
        }catch(Exception e) {
            mensagem = e.getMessage();
        }
        assertEquals("O item de treino deve ser aliado a um treino", mensagem);

    }
    @Test
    public void deveRetornarExceptionQuandoRepeticaoNull(){
        String mensagem = null;
        try{
            ItemTreino itemTreino = ItemTreino.builder()
                    .exercicio(exercicio)
                    .repeticao(null)
                    .tipoRepeticao(TipoRepeticao.VEZES)
                    .observacao("Usar a barra")
                    .treino(treino)
                    .build();
        }catch(Exception e) {
            mensagem = e.getMessage();
        }
        assertEquals("Quantidade de Repetições é um campo obrigatorio", mensagem);

    }
    @Test
    public void deveRetornarExceptionQuandoTipoRepeticaoNull(){
        String mensagem = null;
        try{
            ItemTreino itemTreino = ItemTreino.builder()
                    .exercicio(exercicio)
                    .repeticao(10)
                    .tipoRepeticao(null)
                    .observacao("Usar a barra")
                    .treino(treino)
                    .build();
        }catch(Exception e) {
            mensagem = e.getMessage();
        }
        assertEquals("Tipo de Repetição é campo obrigatório", mensagem);

    }




}
