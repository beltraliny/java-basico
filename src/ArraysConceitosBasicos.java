import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysConceitosBasicos {

    public static void main(String[] args) {
        // Após declarado e inicializado não é possível modificar o tamanho do Array
        // Declarações possíveis:
        int[] intArray0 = new int[5]; // Magic number -> número de posições / length

        int[] intArray1;
        intArray1 = new int[]{8, 5, 4, 9, 10};

        int[] intArray2 = new int[]{8, 5, 4, 9, 10};
        int[] intArray3 = {8, 5, 4, 9, 10};

        // Transformando Arrays em representações em String
        String intArrayInString = Arrays.toString(intArray1);
        System.out.println(intArrayInString);

        // Ordenando Arrays
        Integer[] integerArray = {8, 5, 4, 9, 10};
         Arrays.sort(integerArray); //crescente
        System.out.println(Arrays.toString(integerArray));

        Arrays.sort(integerArray, Comparator.reverseOrder()); //decrescente
        System.out.println(Arrays.toString(integerArray));

        // Copiando e expandindo Arrays
        Integer[] newIntegerArray = Arrays.copyOf(integerArray, integerArray.length + 1);
        newIntegerArray[integerArray.length] = 16;
        System.out.println(Arrays.toString(newIntegerArray)); // [10, 9, 8, 5, 4, 16]

        // Removendo itens de um Array
        int index = 2;

        int[] currentIntArray = {25, 11, 8, 46, 37, 14, 55};
        int[] newIntArray = new int[currentIntArray.length - 1];

        System.arraycopy(currentIntArray, 0,
            newIntArray, 0, index);

        System.arraycopy(currentIntArray, index + 1,
            newIntArray, index, newIntArray.length - index);

        System.out.println(Arrays.toString(currentIntArray)); //[25, 11, 8, 46, 37, 14, 55]
        System.out.println(Arrays.toString(newIntArray)); // [25, 11, 46, 37, 14, 55] -> removido 8 (index 2 de currentIntArray)

        // Declaração de ArrayList:
        ArrayList<String> stringArrayList = new ArrayList<>();
    }
}
