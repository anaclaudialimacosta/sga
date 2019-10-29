package com.uem.sga.service;

import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.model.Aluno;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.model.Professor;
import com.uem.sga.repository.AlunoRepository;
import com.uem.sga.repository.AvaliacaoFisicaRepository;
import com.uem.sga.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
                .horaInicio(dto.getHoraInicio())
                .build();

        return avaliacaoFisicaRepository.save(build);
    }

    public AvaliacaoFisica deletarAgendamento(Long id) {
        Optional<AvaliacaoFisica> byId = avaliacaoFisicaRepository.findById(id);
        return byId.orElse(null);
    }

    public List<AvaliacaoFisica> listarAvaliacoesAgendadas() {
        List<AvaliacaoFisica> list = new ArrayList<>();
        avaliacaoFisicaRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public AvaliacaoFisica editarAvaliacaoAgendada(AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        Optional<AvaliacaoFisica> byId = avaliacaoFisicaRepository.findById(avaliacaoFisicaDTO.getId());
        Aluno alunoById = alunoRepository.findAlunoById(avaliacaoFisicaDTO.getAlunoAlocado());
        Professor professor = professorRepository.findProfessorById(avaliacaoFisicaDTO.getProfessorAlocado());
        if(byId.isPresent()){
            AvaliacaoFisica avaliacaoFisica = byId.get();
            avaliacaoFisica.setAlunoAlocado(alunoById);
            avaliacaoFisica.setDataAgendamento(avaliacaoFisicaDTO.getDataAgendamento());
            avaliacaoFisica.setHoraInicio(avaliacaoFisicaDTO.getHoraInicio());
            avaliacaoFisica.setProfessorAlocado(professor);
            return avaliacaoFisicaRepository.save(avaliacaoFisica);
        }
        return null;
    }
}