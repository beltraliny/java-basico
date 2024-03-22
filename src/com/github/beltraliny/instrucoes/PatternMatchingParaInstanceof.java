package com.github.beltraliny.instrucoes;

public class PatternMatchingParaInstanceof {

    public static void print(Object object) {
        if (object instanceof String string) {
            // Validação da instância object, caso seja tipo String faremos o casting
            System.out.printf("This is a String of length: %s", string.length());
        }
    }
}
