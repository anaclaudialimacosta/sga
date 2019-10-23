package com.uem.sga.controller;

import com.uem.sga.DTO.AvaliacaoFisicaDTO;
import com.uem.sga.model.AulaExperimental;
import com.uem.sga.model.AvaliacaoFisica;
import com.uem.sga.repository.AvaliacaoFisicaRepository;
import com.uem.sga.service.AulaExperimentalService;
import com.uem.sga.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Time;


@RestController
@RequestMapping(value = "/avaliacao-fisica")
public class AvaliacaoFisicaController {

    @Autowired
    AvaliacaoFisicaService avaliacaoFisicaService;

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AvaliacaoFisica agendarAulaExperimental(@RequestBody AvaliacaoFisicaDTO dto) {
        return avaliacaoFisicaService.agendarAvaliacaoFisica(dto);
    }



}
