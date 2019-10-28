package com.uem.sga.controller;


import com.uem.sga.DTO.TreinoPersistDTO;
import com.uem.sga.model.Treino;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller ("/treino")
public class TreinoController {

    @PostMapping("/salvar")
    public ModelAndView salvarTreino(TreinoPersistDTO, BindingResult result ){
        if (result.hasErrors()){
            return new ModelAndView("redirect:/treino").addObject("erro", true);
        }


    }
}
