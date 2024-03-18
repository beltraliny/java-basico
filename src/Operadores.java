public class Operadores {

    public static void main(String[] args) {
        int numberOne = 10;

        // Abreviações dos operadores:
        numberOne += 7;
        numberOne -= 7;
        numberOne *= 7;
        numberOne /= 7;
        numberOne %= 7;

        int numberTwo = 20;

        //Incremento ou decremento:
        System.out.println(numberTwo + 1 == numberTwo++); // false
        System.out.println(numberTwo + 1 == ++numberTwo); // true
    }
}