import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe06.java - Faça um algoritmo que leia um caractere. Caso seja digitada
         * a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva
         * “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra
         * letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra,
         * converta-a para maiúscula.
         */

        System.out.println("Informe um caractere:");
        char caractere = tec.next().charAt(0);
        caractere = Character.toUpperCase(caractere);

        if (caractere == 'M')
            System.out.println("Masculino");
        else if (caractere == 'F') 
            System.out.println("Feminino");
        else if (caractere == 'I')
            System.out.println("Não Informado");
        else
            System.out.println("Entrada Incorreta");

        tec.close();
    }
}
