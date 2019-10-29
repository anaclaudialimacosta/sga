package com.uem.sga.controller;

import com.uem.sga.model.PontoEletronico;
import com.uem.sga.service.PontoEletronicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ponto-eletronico")
public class PontoEletronicoController {

    @Autowired
    PontoEletronicoService pontoEletronicoService;

    @RequestMapping(value="/marcar", method= RequestMethod.POST)
    public PontoEletronico agendarAulaExperimental(@RequestBody PontoEletronico pontoEletronico) {
        return pontoEletronicoService.marcarPonto(pontoEletronico);
    }
}
