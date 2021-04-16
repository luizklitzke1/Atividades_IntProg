import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe07.java - O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
         * As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas,
         * ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso
         * da carta, em gramas, determine o custo do selo.
         */

        double peso = tec.nextDouble();
        double preco = 0;

        if (peso > 50)
            preco = .45 + (((peso - 50) / 20) * .45);
        else 
            preco = .45;

        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("O selo custará: R$ " + df_2.format(preco));
        tec.close();
    }
}
