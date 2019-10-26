package com.uem.sga.model;

import org.springframework.util.Assert;
import javax.persistence.*;

@Table(name = "usuario")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="senha")
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo")
    private TipoUsuario tipo;

    Usuario(){}

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public static Builder builder(){
        return new Usuario.Builder();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            return this.username.equals(((Usuario) obj).username) && this.senha.equals(((Usuario) obj).senha);
        } else {
            return false;
        }
    }

    public static class Builder{
        private Usuario usuario;

        public Builder(){
            this.usuario = new Usuario();
        }

        public Builder username(String username){
            this.usuario.username = username;
            return this;
        }

        public Builder senha(String senha){
            this.usuario.senha = senha;
            return this;
        }

        public Builder tipo(TipoUsuario tipo){
            this.usuario.tipo = tipo;
            return this;
        }

        public Usuario build(){
            Assert.hasText(this.usuario.senha, "Senha é campo Obrigatório");
            Assert.hasText(this.usuario.username, "Usuario é campo Obrigatorio");
            Assert.notNull(this.usuario.tipo, "Tipo é um campo Obrigatorio");
            return this.usuario;
        }



    }
    public String getSenha() {
        return senha;
    }
}

