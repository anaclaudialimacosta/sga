package com.uem.sga.controller;

import com.uem.sga.model.AvaliacaoFisica;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ponto-eletronico")
public class PontoEletronico {

    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public  void agendarAulaExperimental(@RequestBody  PontoEletronico pontoEletronico) {

    }





}