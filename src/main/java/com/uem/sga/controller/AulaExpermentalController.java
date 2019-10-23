package com.uem.sga.controller;

import com.uem.sga.model.AulaExperimental;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aula-experimental")
public class AulaExpermentalController {



    @RequestMapping(value="/agendar", method= RequestMethod.POST)
    public AulaExperimental agendarAulaExperimental() {
        return null;
    }



}
