package com.github.beltraliny.classes;

public class ConstrutorPrivado {

    private ConstrutorPrivado() {
    }
    public static  String stringUtil() {
        return "É uma boa prática deixar um construtor privado para classes de apoio (Util) " +
            "para que elas não sejam instanciadas.";
    }
}
