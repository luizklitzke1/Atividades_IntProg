import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe13.java - Escreva um algoritmo que obtém do usuário 3 valores inteiros
         * representando as três cartas deste usuário em uma mão de jogo de truco (1 =
         * AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve
         * imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2
         * ou 3), "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se
         * AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas,
         * não é impresso nada.
         * 
         */

        System.out.println("Informe valor da primeira carta: ");
        int cartaA = tec.nextInt();
        boolean cartaA_boa = false;

        if (cartaA == 1 || cartaA == 2 || cartaA == 3) {
            cartaA_boa = true;
        }

        System.out.println("Informe valor da segunda carta: ");
        int cartaB = tec.nextInt();
        boolean cartaB_boa = false;

        if (cartaB == 1 || cartaB == 2 || cartaB == 3) {
            cartaB_boa = true;
        }

        System.out.println("Informe valor da terceira carta: ");
        int cartaC = tec.nextInt();
        boolean cartaC_boa = false;

        if (cartaC == 1 || cartaC == 2 || cartaC == 3) {
            cartaC_boa = true;
        }

        if (cartaA_boa && cartaB_boa && cartaC_boa) {

            System.out.println("NOVE!");
        } else {

            if (cartaA_boa && cartaB_boa || cartaB_boa && cartaC_boa || cartaA_boa && cartaC_boa) {
                System.out.println("SEIS!");
            }
            else {

                if (cartaA_boa || cartaB_boa || cartaC_boa) {

                    System.out.println("TRUCO!");

                }
            }
        }

        tec.close();
    }
}
