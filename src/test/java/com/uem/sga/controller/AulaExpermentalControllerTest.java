package com.uem.sga.controller;

import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.model.Professor;
import com.uem.sga.model.Visitante;
import com.uem.sga.repository.ProfessorRepository;
import com.uem.sga.repository.VisitanteRepository;
import com.uem.sga.service.AulaExperimentalService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.ArgumentMatchers.*;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AulaExpermentalControllerTest {

    @InjectMocks
    AulaExpermentalController aulaExpermentalController;

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
        AulaExperimentalDTO aulaExperimentalDTO = new AulaExperimentalDTO();
        aulaExperimentalDTO.setHoraInicio(new Time(120000));
        aulaExperimentalDTO.setHoraFim(new Time(110000));
        aulaExpermentalController.validaHorarioAgendado(aulaExperimentalDTO);
    }



    private AulaExperimentalDTO getDto(Visitante visitante, Professor professor) {
        AulaExperimentalDTO aulaExperimentalDTO = new AulaExperimentalDTO();
        aulaExperimentalDTO.setHoraInicio(new Time(110000));
        aulaExperimentalDTO.setHoraFim(new Time(120000));
        aulaExperimentalDTO.setDataAgendamento(new Date(20191010));
        aulaExperimentalDTO.setIdProfessor(professor.getId());
        aulaExperimentalDTO.setIdVisitante(visitante.getId());
        return aulaExperimentalDTO;
    }

    private AulaExperimental getAulaExperimental(Visitante visitante, Professor professor) {

        AulaExperimental aulaExperimental = new AulaExperimental();
        aulaExperimental.setProfessorAlocado(professor);
        aulaExperimental.setVisitanteAlocado(visitante);
        aulaExperimental.setHoraFim(new Time(120000));
        aulaExperimental.setHoraInicio(new Time(110000));
        return aulaExperimental;
    }

    private Professor getProfessor() {

        Professor professor = new Professor();
        professor.setId(1L);
        professor.setName("OSVALDO");

        return professor;
    }

    private Visitante getVisitante() {
        Visitante visitante = new Visitante();
        visitante.setId(1L);
        visitante.setName("Junior");
        return visitante;
    }

}