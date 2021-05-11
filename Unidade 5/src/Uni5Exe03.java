import java.util.Scanner;

public class Uni5Exe03 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         *  Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
         */

        double somaSerie = 0;

        for (int idx = 1; idx <= 100; idx++)
        {
            somaSerie += 1 / idx;
        }

        System.out.println("Soma da serie: " + somaSerie);

        tec.close();

    }
}
