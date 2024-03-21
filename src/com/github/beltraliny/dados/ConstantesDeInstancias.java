package com.github.beltraliny.dados;

import java.util.UUID;

public class ConstantesDeInstancias {

    private static final String STRING_DEFAULT = "Default";
    private static final int INT_DEFAULT = 0;

    private final String uuid;
    // Isso aqui também funcionaria:
    // final String uuid = UUID.randomUUID().toString();

    private String stringType;
    private int intType;

    public ConstantesDeInstancias() {
        this(STRING_DEFAULT);
    }

    public ConstantesDeInstancias(String stringType) {
        this(stringType, INT_DEFAULT);
    }

    public ConstantesDeInstancias(String stringType, int intType) {
        /*
         * A constante só pode ser inicializada na declaração ou no construtor
         * Caso haja construtores encadeados a inicialização ocorre apenas no último chamado.
         */

        this.uuid = UUID.randomUUID().toString();
        this.stringType = stringType;
        this.intType = intType;
    }
}
