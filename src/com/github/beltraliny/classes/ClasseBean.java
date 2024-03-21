package com.github.beltraliny.classes;

import java.io.Serializable;
/*
    Regras para que uma classe seja considerada JavaBean
*/

// Implementar uma interface para indicar que a classe pode ser serializada
public class ClasseBean implements Serializable {

    // Utilizar modificadores de acesso mais restrito (private)
    private String stringType;
    private int intType;

    // Ter construtor sem argumento ou default
    public ClasseBean() {
    }

    public ClasseBean(String stringType) {
        this.stringType = stringType;
    }

    // Utilizar getters & setters (não necessário para todos os atributos)
    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public int getIntType() {
        return intType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }
}
