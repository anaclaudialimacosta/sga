package com.uem.sga.controller;

import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.repository.ProfessorRepository;
import com.uem.sga.repository.VisitanteRepository;
import com.uem.sga.service.AulaExperimentalService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Time;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AvaliacaoFisicaControllerTest {

    @InjectMocks
    AvaliacaoFisicaController avaliacaoFisicaController;

    @Mock
    ProfessorRepository professorRepository;
    @Mock
    VisitanteRepository visitanteRepository;
    @Mock
    AulaExperimentalService aulaExperimentalService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

    }

    @Test(expected = ResponseStatusException.class)
    public void falha_ao_criar_aula_experimental_com_horario_invalido(){
        AvaliacaoFisicaDTO aulaExperimentalDTO = new AvaliacaoFisicaDTO();
        aulaExperimentalDTO.setHoraInicio(new Time(120000));
        aulaExperimentalDTO.setHoraFim(new Time(110000));
        avaliacaoFisicaController.validaHorarioAgendado(aulaExperimentalDTO);
    }
}