import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.
         */

        System.out.print("Informe a quantidad de numeros que deseja informar: ");
        int quantidadeNumeros = tec.nextInt();

        int maiorNumero = 0;
        int menorNumero = 0;

        int numeroInformado = 0;

        for (int idx = 0; idx < quantidadeNumeros; idx++)
        {
            numeroInformado = tec.nextInt();

            if (idx != 0)
            {
                if (numeroInformado > maiorNumero)
                    maiorNumero = numeroInformado;
                else if (numeroInformado < menorNumero)
                    menorNumero = numeroInformado;
            }
            else
            {
                maiorNumero = numeroInformado;
                menorNumero = numeroInformado;
            }

        }

        System.out.println("Maior valor informado: " + maiorNumero);
        System.out.println("Menor valor informado: " + menorNumero);

        tec.close();
    }
}
