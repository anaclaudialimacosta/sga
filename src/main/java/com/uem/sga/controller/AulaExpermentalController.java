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

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AulaExperimental agendarAulaExperimental(@RequestBody AulaExperimentalDTO dto) {
        validaHorarioAgendado(dto);
        return aulaExperimentalService.agendarAulaExperimental(dto);
    }

    @RequestMapping(value ="/listar", method = RequestMethod.GET)
    public List<AulaExperimental> listarAulasExperimentais(@RequestParam Date dataAgendada){
        return aulaExperimentalService.listarAulasExperimentais(dataAgendada);
    }

    @RequestMapping(value="/excluir/{id}", method = RequestMethod.POST)
    public void deletarAulaExperimental(@PathVariable Long id) {
         aulaExperimentalService.deletarAulaExperimental(id);
    }

    @RequestMapping(value = "/alterar_aula/{id}", method = RequestMethod.GET)
    public AulaExperimental  editarAulaExperimental(@RequestBody AulaExperimentalDTO dto, @PathVariable Long id){
        validaHorarioAgendado(dto);
        if (!aulaExperimentalService.findAulaToEdit(id)){

        return aulaExperimentalService.agendarAulaExperimental(dto);
        }else{
            return aulaExperimentalService.editarAulaExperimental(id, dto);
        }
    }

    protected void validaHorarioAgendado(AulaExperimentalDTO dto){
        if (dto.getHoraInicio().after(dto.getHoraFim())) throw new ResponseStatusException(HttpStatus.CONFLICT, "Horário Invalido");
    }
}
