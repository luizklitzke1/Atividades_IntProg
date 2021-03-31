import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe02.java - Dado um valor inteiro maior do que 0 informe se o valor é
         * par ou ímpar.
         */

        System.out.println("Informe o valor inteiro maior que zero:");
        int valor = tec.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é par!");
        } else {
            System.out.println("O valor é ímpar!");
        }

        tec.close();

    }
}
