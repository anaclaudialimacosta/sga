package com.uem.sga.service;

import com.uem.sga.model.AulaExperimental;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.repository.AlunoRepository;
import com.uem.sga.repository.AulaExperimentalRepository;
import com.uem.sga.repository.AvaliacaoFisicaRepository;
import com.uem.sga.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    ProfessorRepository professorRepository;


    public AvaliacaoFisica agendarAvaliacaoFisica(Long idAluno, Long idProfessor, Time horaInicio, Time horaFim, Date dataAgendada) {

        AvaliacaoFisica build = AvaliacaoFisica.builder()
                .professorAlocado(professorRepository.findProfessorById(idProfessor))
                .alunoAlocado(alunoRepository.findAlunoById(idAluno))
                .dataAgendamento(dataAgendada)
                .horaFim(horaFim)
                .horaInicio(horaInicio)
                .build();

        return avaliacaoFisicaRepository.save(build);
    }
}
