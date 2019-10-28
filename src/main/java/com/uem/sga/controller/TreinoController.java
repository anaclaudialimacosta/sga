package com.uem.sga.controller;


import com.uem.sga.DTO.TreinoPersistDTO;
import com.uem.sga.DTO.TreinoResponseDTO;
import com.uem.sga.adapter.TreinoAdapter;
import com.uem.sga.model.Treino;
import com.uem.sga.service.SalvarTreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller ("/treino")
public class TreinoController {

    @Autowired
    private SalvarTreinoService salvarTreinoService;


    @PostMapping("/salvar")
    public TreinoResponseDTO salvarTreino(@RequestBody TreinoPersistDTO treinoPersistDTO){
        TreinoResponseDTO treinoResponseDTO = new TreinoResponseDTO();
        treinoResponseDTO = TreinoAdapter.entityToResponse(
          salvarTreinoService.salvar(treinoPersistDTO)
        );

        return treinoResponseDTO;
    }
}
