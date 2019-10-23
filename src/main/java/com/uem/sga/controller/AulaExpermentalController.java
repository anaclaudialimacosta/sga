package com.uem.sga.controller;

import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.service.AulaExperimentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping(value = "/aula-experimental")
public class AulaExpermentalController {

    @Autowired
    AulaExperimentalService aulaExperimentalService;

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AulaExperimental agendarAulaExperimental(@RequestBody AulaExperimentalDTO dto) {
        validaHorarioAgendado(dto);
        return aulaExperimentalService.agendarAulaExperimental(dto);
    }


    protected void validaHorarioAgendado(AulaExperimentalDTO dto){
        if (dto.getHoraInicio().after(dto.getHoraFim())) throw new ResponseStatusException(HttpStatus.CONFLICT, "Horário Invalido");
    }
}
