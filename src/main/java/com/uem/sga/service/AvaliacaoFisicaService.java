package com.uem.sga.service;

import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.repository.AlunoRepository;
import com.uem.sga.repository.AvaliacaoFisicaRepository;
import com.uem.sga.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    ProfessorRepository professorRepository;


    public AvaliacaoFisica agendarAvaliacaoFisica(AvaliacaoFisicaDTO dto) {

        AvaliacaoFisica build = AvaliacaoFisica.builder()
                .professorAlocado(professorRepository.findProfessorById(dto.getProfessorAlocado()))
                .alunoAlocado(alunoRepository.findAlunoById(dto.getAlunoAlocado()))
                .dataAgendamento(dto.getDataAgendamento())
                .horaFim(dto.getHoraFim())
                .horaInicio(dto.getHoraInicio())
                .build();

        return avaliacaoFisicaRepository.save(build);
    }
}
