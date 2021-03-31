import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe04.java - Dado um número de ponto flutuante maior do que 0, informe se
         * foram digitadas ou não casas decimais no número.
         */

        System.out.println("Informe o número:");
        float num = tec.nextFloat();

        if (num > (int) num) {
            System.out.println("Foram informadas casas decimais!");
        } else {
            System.out.println("Não foram informadas casas decimais!");
        }

        tec.close();

    }
}
