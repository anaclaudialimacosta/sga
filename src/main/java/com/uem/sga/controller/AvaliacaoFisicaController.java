package com.uem.sga.controller;

import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping(value = "/avaliacao-fisica")
public class AvaliacaoFisicaController {

    @Autowired
    AvaliacaoFisicaService avaliacaoFisicaService;

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AvaliacaoFisica agendarAulaExperimental(@RequestBody AvaliacaoFisicaDTO dto) {
        validaHorarioAgendado(dto);
        return avaliacaoFisicaService.agendarAvaliacaoFisica(dto);
    }


    protected void validaHorarioAgendado(AvaliacaoFisicaDTO dto){
        if (dto.getHoraInicio().after(dto.getHoraFim())) throw new ResponseStatusException(HttpStatus.CONFLICT, "Horário Invalido");
    }


}
