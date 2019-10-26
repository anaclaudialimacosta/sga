package com.uem.sga.controller;


import com.uem.sga.service.ValidacaoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ValidacaoUsuarioService validacaoUsuarioService;

    @PostMapping("/validate")
    public  boolean validateUser(@RequestBody String username, String senha){

        return validacaoUsuarioService.validarUsuario(username, senha);
    }

}