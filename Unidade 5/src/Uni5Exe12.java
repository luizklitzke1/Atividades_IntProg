import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Escreva um programa que leia um número inteiro positivo n e 
         * em seguida imprima n linhas do chamado Triangulo de Floyd:
         */

        System.out.println("Informe o tamanho do Triangulo de Floyd: ");
        int tamanho = tec.nextInt();

        int valor = 1;

        for (int idx = 1; idx <= tamanho; idx++)
        {
            for (int idx2 = 0; idx2 < idx; idx2++ )
            {
                System.out.print(valor + " ");
                valor++;
            }
            System.out.println("");
                
        }
       
        tec.close();
    }
}
