package com.uem.sga.controller;

import com.uem.sga.model.Aluno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @RequestMapping(value="/cadastrar", method= RequestMethod.POST)
    public Aluno cadastrarAluno() {
        return null;
    }

    @RequestMapping(value="/editar", method= RequestMethod.POST)
    public Aluno editarAluno() {
        return null;
    }

    @RequestMapping(value="/cancelarMatricula", method= RequestMethod.POST)
    public Aluno cancelarMatriculaAluno() { return null; }


}
