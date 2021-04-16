import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe03.java - Dados dois números inteiros descreva um algoritmo para
         * informar o maior valor entre eles.
         */

        System.out.println("Informe o primeiro valor:");
        int valor1 = tec.nextInt();

        System.out.println("Informe o segundo valor:");
        int valor2 = tec.nextInt();

        if (valor1 > valor2) 
            System.out.println("O primeiro valor (" + valor1 + ") é maior que o segundo (" + valor2 + ").");
        else 
            System.out.println("O segundo valor (" + valor2 + ") é maior que o primeiro (" + valor1 + ").");

        tec.close();

    }
}
