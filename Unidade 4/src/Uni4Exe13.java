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
        boolean cartaABoa = false;

        if (cartaA == 1 || cartaA == 2 || cartaA == 3)
            cartaABoa = true;
            
        System.out.println("Informe valor da segunda carta: ");
        int cartaB = tec.nextInt();
        boolean cartaBBoa = false;

        if (cartaB == 1 || cartaB == 2 || cartaB == 3)
            cartaBBoa = true;

        System.out.println("Informe valor da terceira carta: ");
        int cartaC = tec.nextInt();
        boolean cartaCBoa = false;

        if (cartaC == 1 || cartaC == 2 || cartaC == 3)
            cartaCBoa = true;

        if (cartaABoa && cartaBBoa && cartaCBoa)
            System.out.println("NOVE!");
        else if (cartaABoa && cartaBBoa || cartaBBoa && cartaCBoa || cartaABoa && cartaCBoa)
            System.out.println("SEIS!");
        else if (cartaABoa || cartaBBoa || cartaCBoa)
            System.out.println("TRUCO!");

        tec.close();
    }
}
