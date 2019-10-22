package com.uem.sga.service;


import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.repository.AulaExperimentalRepository;
import com.uem.sga.repository.ProfessorRepository;
import com.uem.sga.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public List<AulaExperimental> listarAulasExperimentais(Date date) {
        return aulaExperimentalRepository.findAllByDataAgendamento(date);
    }

    public void deletarAulaExperimental(Long id) {
        Optional<AulaExperimental> byId = aulaExperimentalRepository.findById(id);
        byId.get().setDesmarcada(true);
        aulaExperimentalRepository.save(byId.get());
    }

    public AulaExperimental editarAulaExperimental(Long id, AulaExperimentalDTO dto) {
        Optional<AulaExperimental> aulaExperimental = aulaExperimentalRepository.findById(id);
        if (aulaExperimental.isPresent()) {
            aulaExperimental.get().setDataAgendamento(dto.getDataAgendamento());
            if (dto.getIdProfessor() != null) {
                aulaExperimental.get().setProfessorAlocado(professorRepository.findProfessorById(dto.getIdProfessor()));
            }
            if (dto.getDataAgendamento() != null) {
                aulaExperimental.get().setDataAgendamento(dto.getDataAgendamento());
            }
            if (dto.getHoraFim() != null && dto.getHoraInicio() != null) {
                aulaExperimental.get().setHoraInicio(dto.getHoraInicio());
                aulaExperimental.get().setHoraFim(dto.getHoraFim());
            }
            if (!dto.isDesmarcada()) {
                aulaExperimental.get().setDesmarcada(true);
            }
            return aulaExperimentalRepository.save(aulaExperimental.get());
        }
        return null;
    }

    public boolean findAulaToEdit(Long id) {
        if (aulaExperimentalRepository.existsById(id)) {
            return true;
        }
        return false;
    }
}