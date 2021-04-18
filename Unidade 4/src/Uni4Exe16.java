import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
       Uni4Exe16.java - Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
       Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
        */

        System.out.println("Informe a idade do primeiro homem: ");
        int IdadeHome1 = tec.nextInt();

        System.out.println("Informe a idade do segundo homem: ");
        int IdadeHome2 = tec.nextInt();

        System.out.println("Informe a idade da primeira mulher: ");
        int IdadeMulher1 = tec.nextInt();

        System.out.println("Informe a idade da segunda mulher: ");
        int IdadeMulher2 = tec.nextInt();

        int IdadeHomemMaisVelho;
        int IdadeHomemMaisNovo;
        if (IdadeHome1 > IdadeHome2)
        {
            IdadeHomemMaisVelho = IdadeHome1;
            IdadeHomemMaisNovo = IdadeHome2;
        }
        else
        {
            IdadeHomemMaisVelho = IdadeHome2;
            IdadeHomemMaisNovo = IdadeHome1;
        }

        int IdadeMulherMaisVelha;
        int IdadeMulherMaisNova;
        if (IdadeMulher1 > IdadeMulher2)
        {
            IdadeMulherMaisVelha = IdadeMulher1;
            IdadeMulherMaisNova = IdadeMulher2;
        }
        else
        {
            IdadeMulherMaisVelha = IdadeMulher2;
            IdadeMulherMaisNova = IdadeMulher1;
        }
        
        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + (IdadeHomemMaisVelho + IdadeMulherMaisNova));
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + IdadeHomemMaisNovo * IdadeMulherMaisVelha);

        tec.close();
    }
}
