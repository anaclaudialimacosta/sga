package com.uem.sga.controller;

import com.uem.sga.DTO.AulaExperimentalDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.service.AulaExperimentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping(value = "/aula-experimental")
public class AulaExpermentalController {

    @Autowired
    AulaExperimentalService aulaExperimentalService;

    @RequestMapping(method= RequestMethod.POST)
    public AulaExperimental agendarAulaExperimental(@RequestBody AulaExperimentalDTO dto) {
        validaHorarioAgendado(dto);
        return aulaExperimentalService.agendarAulaExperimental(dto);
    }

    @RequestMapping( method = RequestMethod.GET)
    public List<AulaExperimental> listarAulasExperimentais(@RequestParam Date dataAgendada){
        return aulaExperimentalService.listarAulasExperimentais(dataAgendada);
    }

    @RequestMapping( method = RequestMethod.DELETE)
    public void deletarAulaExperimental(@RequestParam Long id) {
         aulaExperimentalService.deletarAulaExperimental(id);
    }

    @RequestMapping( method = RequestMethod.PUT)
    public AulaExperimental  editarAulaExperimental(@RequestBody AulaExperimentalDTO dto){
        validaHorarioAgendado(dto);
        if (!aulaExperimentalService.findAulaToEdit(dto.getId())){
        return aulaExperimentalService.agendarAulaExperimental(dto);
        }else{
            return aulaExperimentalService.editarAulaExperimental(dto.getId(), dto);
        }
    }

    protected void validaHorarioAgendado(AulaExperimentalDTO dto){
        if (dto.getHoraInicio().after(dto.getHoraFim())) throw new ResponseStatusException(HttpStatus.CONFLICT, "Horário Invalido");
    }
}
