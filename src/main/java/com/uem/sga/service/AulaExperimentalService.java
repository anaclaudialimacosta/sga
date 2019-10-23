package com.uem.sga.service;


import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.repository.AulaExperimentalRepository;
import com.uem.sga.repository.ProfessorRepository;
import com.uem.sga.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaExperimentalService {
    @Autowired
    AulaExperimentalRepository aulaExperimentalRepository;

    @Autowired
    VisitanteRepository visitanteRepository;
    @Autowired
    ProfessorRepository professorRepository;

    public AulaExperimental agendarAulaExperimental(AulaExperimentalDTO dto) {

        AulaExperimental build = AulaExperimental.builder()
                .professorAlocado(professorRepository.findProfessorById(dto.getIdProfessor()))
                .visitanteAlocado(visitanteRepository.findVisitanteById(dto.getIdVisitante()))
                .dataAgendamento(dto.getDataAgendamento())
                .horaFim(dto.getHoraFim())
                .horaInicio(dto.getHoraInicio())
                .build();

        return aulaExperimentalRepository.save(build);
    }
}