package com.uem.sga.controller;

import com.uem.sga.model.AulaExperimental;
import com.uem.sga.service.AulaExperimentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Time;


@RestController
@RequestMapping(value = "/aula-experimental")
public class AulaExpermentalController {

    @Autowired
    AulaExperimentalService aulaExperimentalService;

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AulaExperimental agendarAulaExperimental(Long idUsuario, Long idProfessor, Date dataAgendada, Time horaInicio, Time horaFim) {
        return aulaExperimentalService.agendarAulaExperimental(idUsuario , idProfessor, horaInicio,horaFim, dataAgendada);
    }



}
