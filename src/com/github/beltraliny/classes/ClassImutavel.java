package com.github.beltraliny.classes;/*
    Classes imutaveis não podem ser herdadas
 */

public final class ClassImutavel {
    // Necessário o modificador de acesso final para a classe e todos os atributos
    private final String stringType;
    private final int intType;

    public ClassImutavel(String stringType, int intType) {
        // Os valores não setados da declaração precisam estar no construtor para inicialização (final)
        this.stringType = stringType;
        this.intType = intType;
    }

    // Obviamente não possuem setters, apenas getters
    public String getStringType() {
        return stringType;
    }

    public int getIntType() {
        return intType;
    }
}
