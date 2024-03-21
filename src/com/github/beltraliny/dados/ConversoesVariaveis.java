package com.github.beltraliny.dados;

public class ConversoesVariaveis {

    public static void main(String[] args) {
        long longNumber = 10;

        // Casting é necessário quando variável final é menor que a de origem:
        int intNumber = (int) longNumber;
        System.out.println(intNumber); //10

        // Opcional no caso contrário:
        longNumber = intNumber;
        System.out.println(longNumber); //10

        //Outros exemplos:
        double doubleNumber = 11.0;
        float floatNumber = (float) doubleNumber;
        System.out.println(floatNumber); // 11.0

        int anotherIntNumber = (int) doubleNumber;
        System.out.println(anotherIntNumber); // 11
    }
}
