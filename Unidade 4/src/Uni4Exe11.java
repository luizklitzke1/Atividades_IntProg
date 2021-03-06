import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe11.java - Escreva um algoritmo para ler o ano de nascimento de 3
         * irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS,
         * APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma
         * idade e o outro diferente dos demais, e apenas irmãos se todas as idades
         * forem diferentes.
         */

        System.out.println("Informe a data de nascimento do primeiro: ");
        int nascimentoPrimeiro = tec.nextInt();

        System.out.println("Informe a data de nascimento do segundo: ");
        int nascimentoSegundo = tec.nextInt();

        System.out.println("Informe a data de nascimento do terceiro: ");
        int nascimentoTerceiro = tec.nextInt();

        if (nascimentoPrimeiro == nascimentoSegundo && nascimentoSegundo == nascimentoTerceiro) 
            System.out.println("Eles são TRIGÊMEOS!");
        else if (nascimentoPrimeiro == nascimentoSegundo 
                || nascimentoSegundo == nascimentoTerceiro
                || nascimentoTerceiro == nascimentoPrimeiro) 
            System.out.println("Eles são GÊMEOS!");
        else
            System.out.println("Eles são APENAS IRMÃOS!");

        tec.close();
    }
}
