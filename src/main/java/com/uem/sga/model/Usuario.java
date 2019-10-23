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

    Usuario(){}

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Builder builder(){
        return new Usuario.Builder();
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

        public Usuario build(){
            Assert.hasText(this.usuario.senha, "Senha é campo Obrigatório");
            Assert.hasText(this.usuario.username, "Usuario é campo Obrigatorio");
            return this.usuario;
        }


    }
}
