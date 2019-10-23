package com.uem.sga.model;

public enum PrecosAtividades {

    MENSAL ("Mensal",99.90 ),
    SEMESTRAL ("Semestral",79.90 ),
    ANUAL ("Anual",69.90 ),
    PRECOITEM ("Adicional",30.00);

    private String tipo;
    private double valor;

    PrecosAtividades(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

}
