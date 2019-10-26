package com.uem.sga.DTO;

import com.uem.sga.model.TipoUsuario;

public class UsuarioPersistDTO {

    private String username;

    private String senha;

    private TipoUsuario tipo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}