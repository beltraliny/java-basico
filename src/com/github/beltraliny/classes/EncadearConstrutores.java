package com.github.beltraliny.classes;

import java.util.Objects;

public class EncadearConstrutores {

    private static final String STRING_DEFAULT = "Default";
    private static final int INT_DEFAULT = 0;

    private String stringType;
    private int intType;

    public EncadearConstrutores() {
        this(STRING_DEFAULT);
    }

    public EncadearConstrutores(String stringType) {
        this(stringType, INT_DEFAULT);
    }

    public EncadearConstrutores(String stringType, int intType) {
        Objects.requireNonNull(stringType, "String required");
        if (intType < 0) throw new IllegalArgumentException("Negative numbers are not allowed");

        this.stringType = stringType;
        this.intType = intType;
    }
}
