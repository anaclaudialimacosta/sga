package com.uem.sga.service;

import com.uem.sga.model.Usuario;
import com.uem.sga.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(@Valid Usuario usuario){
        repository.save(usuario);
        return usuario;
    }
}