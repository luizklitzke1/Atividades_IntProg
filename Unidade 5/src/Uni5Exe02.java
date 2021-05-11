import java.util.Scanner;

public class Uni5Exe02 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.
         */

        int somaPares = 0;
        int somaImpares = 0;

        for (int numero = 1; numero <= 100; numero++)
        {
            if (numero % 2 == 0)
                somaPares += numero;
            else
                somaImpares += numero;
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaImpares);

        tec.close();

    }
}
