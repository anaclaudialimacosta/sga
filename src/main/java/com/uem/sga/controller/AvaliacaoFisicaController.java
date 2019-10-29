package com.uem.sga.controller;

import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping(value = "/avaliacao-fisica")
public class AvaliacaoFisicaController {

    @Autowired
    AvaliacaoFisicaService avaliacaoFisicaService;

    @RequestMapping(method= RequestMethod.POST)
    public AvaliacaoFisica agendarAulaExperimental(@RequestBody AvaliacaoFisicaDTO dto) {
        validaHorarioAgendado(dto);
        return avaliacaoFisicaService.agendarAvaliacaoFisica(dto);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public AvaliacaoFisica deletarAgendamentoAvaliacaoFisica(@RequestParam Long id){
        return  avaliacaoFisicaService.deletarAgendamento(id);
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<AvaliacaoFisica> listarTodosAgendamentos(){
        return  avaliacaoFisicaService.listarAvaliacoesAgendadas();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public AvaliacaoFisica editarAgendamentoAvaliacaoFisica(@RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO){
        return  avaliacaoFisicaService.editarAvaliacaoAgendada(avaliacaoFisicaDTO);
    }

    protected void validaHorarioAgendado(AvaliacaoFisicaDTO dto){
        if (dto.getHoraInicio().after(dto.getHoraFim())) throw new ResponseStatusException(HttpStatus.CONFLICT, "Horário Invalido");
    }
}
