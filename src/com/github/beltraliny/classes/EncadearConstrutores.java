package com.github.beltraliny.classes;

import java.util.Objects;

public class EncadearConstrutores {

    static final String STRING_DEFAULT = "Default";
    static final int INT_DEFAULT = 0;

    String stringType;
    int intType;

    EncadearConstrutores() {
        this(STRING_DEFAULT);
    }

    EncadearConstrutores(String stringType) {
        this(stringType, INT_DEFAULT);
    }

    EncadearConstrutores(String stringType, int intType) {
        Objects.requireNonNull(stringType, "String required");
        if (intType < 0) throw new IllegalArgumentException("Negative numbers are not allowed");

        this.stringType = stringType;
        this.intType = intType;
    }
}
