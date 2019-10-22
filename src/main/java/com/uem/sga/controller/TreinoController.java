package com.uem.sga.controller;


import com.uem.sga.service.CreateTreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TreinoController {

    @Autowired
    private CreateTreinoService createTreinoService;



}
