package com.uem.sga.controller;

import com.uem.sga.DTO.UsuarioPersistDTO;
import com.uem.sga.model.Usuario;
import com.uem.sga.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/salvar")
    public Usuario salvarNovoUsuario(@RequestBody UsuarioPersistDTO usuarioPersistDTO){

        Usuario usuario = Usuario.builder()
                .username(usuarioPersistDTO.getUsername())
                .senha(usuarioPersistDTO.getSenha())
                .tipo(usuarioPersistDTO.getTipo())
                .build();
        usuarioService.salvar(usuario);

        return usuario;


    }

}