import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe09.java - Dados dois valores inteiros, escreva um algoritmo que
         * informe se eles são múltiplos ou não.
         */

        System.out.println("Informe o primeiro valor: ");
        int valorA = tec.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorB = tec.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0)
            System.out.println(valorA + " e " + valorB + " são multiplos!");
        else
            System.out.println(valorA + " e " + valorB + " não são multiplos!");

        tec.close();
    }
}
