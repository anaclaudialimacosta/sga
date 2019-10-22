package com.uem.sga.model;
import com.uem.sga.databuilder.TreinoDataBuilder;
import org.junit.Test;

import static com.uem.sga.databuilder.TreinoDataBuilder.CONSTRAINT_ALUNO;
import static com.uem.sga.databuilder.TreinoDataBuilder.CONSTRAINT_PROFESSOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TreinoTest {

    @Test
    public void deveCriarUmTreino(){
        Treino treino = TreinoDataBuilder.fullTreino();

        assertEquals(CONSTRAINT_ALUNO, treino.getAluno());
        assertEquals(CONSTRAINT_PROFESSOR, treino.getProfessorResponsavel());
        assertTrue(treino.getExerciciosTreino().isEmpty());
    }

    @Test
    public void deveRetornarExceptionQuandoAlunoNull(){
        String mensagem = null;
        try {
            Treino treino = Treino.builder()
                    .aluno(null)
                    .professor(CONSTRAINT_PROFESSOR)
                    .buiild();
        } catch(Exception e){
            mensagem = e.getMessage();
        }
        assertEquals("Aluno é campo obrigatório", mensagem);

    }
    @Test
    public void deveRetornarExceptionQuandoProfessorNull(){
        String mensagem = null;
        try {
            Treino treino = Treino.builder()
                    .aluno(CONSTRAINT_ALUNO)
                    .professor(null)
                    .buiild();
        } catch(Exception e){
            mensagem = e.getMessage();
        }
        assertEquals("Professor Responsável é obrigatório", mensagem);

    }
}
