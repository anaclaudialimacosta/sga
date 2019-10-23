package com.uem.sga.service;


import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.model.Aluno;
import com.uem.sga.repository.AlunoRepository;
import com.uem.sga.repository.AulaExperimentalRepository;
import com.uem.sga.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service
public class AulaExperimentalService {
    @Autowired
    AulaExperimentalRepository aulaExperimentalRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    ProfessorRepository professorRepository;

    public AulaExperimental agendarAulaExperimental(AulaExperimentalDTO dto) {

        AulaExperimental build = AulaExperimental.builder()
                .professorAlocado(professorRepository.findProfessorById(dto.getProfessorAlocado()))
                .alunoAlocado(alunoRepository.findAlunoById(dto.getAlunoAlocado()))
                .dataAgendamento(dto.getDataAgendamento())
                .horaFim(dto.getHoraFim())
                .horaInicio(dto.getHoraInicio())
                .build();

        return aulaExperimentalRepository.save(build);
    }
}