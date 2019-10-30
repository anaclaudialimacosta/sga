package com.uem.sga.repository;

import com.uem.sga.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    public Optional<Usuario> findByUsername(String username);

}