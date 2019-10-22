package com.uem.sga.model;

public enum Exercicio {

    LEG_PRESS_VERTICAL ("Leg Press vertical","Perna" ),
    LEG_PRESS_INCLINADO("Leg Press inclinado","Perna" ),
    FLEXORA("Flexora","Perna" ),
    EXTENSORA("Extensora","Perna" ),
    ADUTORA("Adutora","Perna" ),
    ABDUTORA("Abdutora","Perna" ),
    PASSADA ("Passada","Perna" ),
    SUPINO_RETO("Supino Reto","Braço" ),
    SUPINO_INCLINADO("Supino Inclinado","Braço" ),
    LEVANTAMENTO_LATERAL("Levantamento Lateral","Braço" ),
    PUXADOR_FRONTAL ("Puxador Frontal","Costas"),
    PUXADOR_DE_COSTAS ("Puxador de Costas","Costas"),
    CRUCIFIXO("Crucifixo", "Costas"),
    ABDOMINAL_NORMAL("Abdominal normal", "Abdomem"),
    ABDOMINAL_UNILATERAL("Abdominal unilateral", "Abdomem"),
    LEVANTAMENTO_DE_PERNA("Levantamento de Perna", "Abdomem"),
    PULLEY("Pulley", "Braço");


    private String nome;
    private String membro;

    Exercicio(String nome, String membro){
        this.nome = nome;
        this.membro = membro;
    }

    public String getMembro() {
        return membro;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
