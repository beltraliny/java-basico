import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name:");

        String nome = in.nextLine();
        System.out.printf("Hello, %s%n", nome);
    }
}
