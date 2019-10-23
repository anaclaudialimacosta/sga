package com.uem.sga.model;

import javax.persistence.*;


@Entity
@Table(name="aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private String endereco;

    @Column
    private Plano plano;

    public Aluno() {
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Long getId() {
        return id;
    }

    public Plano getPlano() { return plano; }

    public void setPlano(Plano plano) { this.plano = plano; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

