package com.github.beltraliny.dados;

public class ComparandoWrappers {

    public static void main(String[] args) {
        Integer number = 127;
        Integer number0 = 127;

        // Objetos do tipo Integer com valores até 127 estão alocados na memória cash, não sendo necessária uma nova
        // instância, o operador de igualdade funciona:
        System.out.println(number == number0); // true


        Integer number1 = 128;
        Integer number2 = 128;

        // A partir do valor 128 são instanciados novos objetos e como não possuem a mesma referência o operador de
        // igualdade não funciona
        System.out.println(number1 == number2); // false


        Short number3 = 128;

        // Forma correta de comparar Wrappers:
        System.out.println(number1.equals(number2)); //true
        System.out.println(number1.intValue() == number3.intValue()); //true
        System.out.println(number1.compareTo(number2) == 0);
    }
}
