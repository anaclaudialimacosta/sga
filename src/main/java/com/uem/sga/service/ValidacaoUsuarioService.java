package com.uem.sga.service;

import com.uem.sga.model.TipoUsuario;
import com.uem.sga.model.Usuario;
import com.uem.sga.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidacaoUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean validarUsuario(String username, String senha){

        Optional<Usuario> usuario = usuarioRepository.findByUsername(username);
        if(usuario.isPresent()){
            usuario.get().equals()
        }
    }
}
