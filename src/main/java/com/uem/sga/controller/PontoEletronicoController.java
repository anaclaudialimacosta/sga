package com.uem.sga.controller;

import com.uem.sga.model.PontoEletronico;
import com.uem.sga.service.PontoEletronicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ponto-eletronico")
public class PontoEletronicoController {

    @Autowired
    PontoEletronicoService pontoEletronicoService;

    @RequestMapping(method= RequestMethod.POST)
    public PontoEletronico agendarAulaExperimental(@RequestBody PontoEletronico pontoEletronico) {
        return pontoEletronicoService.marcarPonto(pontoEletronico);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<PontoEletronico> listarAulasExperimentais() {
        return pontoEletronicoService.listarPontosMarcados();
    }

}
