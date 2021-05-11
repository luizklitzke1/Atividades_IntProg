import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
            O valor n deve ser lido e deve ser maior do que 2.
         */

        int valorA = 8;

        System.out.println("Informe a quantidade repeticoes:");
        int repeticoes = tec.nextInt();

        for (int idx = 0; idx < repeticoes; idx++)
        {
            if (idx % 2 == 0)
                System.out.print(valorA + " ");
            else
            {
                System.out.print(valorA + 2 + " ");
                valorA *= 2;
            }
        }
    }
}
