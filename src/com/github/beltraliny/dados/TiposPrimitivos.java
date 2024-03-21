package com.github.beltraliny.dados;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //int maxIntNumber = 2_147_483_648; // não compila
        int maxIntNumber = 2_147_483_647;
        System.out.printf("Máximo número inteiro: %d", maxIntNumber);

        // L na declaração de váriavel é opcional:
        long longNumber = 699_097;
        long longNumber2 = 2_147_483_648L;

        //Na utilização de magic number é obrigatório pois o default é int:
        // System.out.println(2_147_483_648); // não compila
        System.out.println(2_147_483_648L);

        // D na declaração de váriavel é opcional:
        double doubleNumber = 84.9d;
        System.out.printf("Exemplo do tipo double: %.2f%n", doubleNumber);

        // F na declaração de float é obrigatório:
        // float taxa = 1_294.93; // não compila, default é double
        float floatNumber = 1_294.93f;
        System.out.printf("Exemplo do tipo float: %.2f%n", floatNumber);

        /*
            Cálculos
        */

        // Resultado de cálculo sempre na variável de peso maior:
        int x = 10;
        long y = 5;
        // int c = a * b; // não compila
        long z = x * y;

        // Forma correta para não perder precisão:
        int a = 3;
        int b = 2;

        // float c = a / b;  atribui 1.0
        // float c = (float) (a / b);  atribui 1.0
        float c = a / (float) b; // atribui 1.5
    }
}
