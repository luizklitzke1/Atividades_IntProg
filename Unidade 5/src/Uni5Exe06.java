import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
         */

        double somaAlturas = 0;

        for (int idx = 0; idx < 20; idx++)
        {
            System.out.print("[" + (idx + 1) + "]Informe a altura: ");
            somaAlturas += tec.nextDouble();
        }

        System.out.print("Media das 20 alturas: " + somaAlturas / 20);

        tec.close();
    }
}
