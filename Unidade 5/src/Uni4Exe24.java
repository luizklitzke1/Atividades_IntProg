import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe24.java - Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

        se opção = 1, escreva os 3 valores em ordem crescente
        se opção = 2, escreva os 3 valores em ordem decrescente
        se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
        */

        System.out.println("Informe o primeiro valor: ");
        int valorA = tec.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorB = tec.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int valorC = tec.nextInt();

        System.out.println("1, escreva os 3 valores em ordem crescente");
        System.out.println("2, escreva os 3 valores em ordem decrescente");
        System.out.println("3, escreva os 3 valores de forma que o maior valor fique no meio");
        System.out.println("Escolha uma opção: ");
        int opcao = tec.nextInt();

        int maiorValor, valorMedio, menorValor;

        if(valorA > valorB && valorA > valorC)
        {
            maiorValor = valorA;

            if(valorB > valorC)
            {
                valorMedio = valorB;
                menorValor = valorC;
            }
            else
            {
                valorMedio = valorC;
                menorValor = valorB;
            }
        } 
        else if(valorB > valorA && valorB > valorC)
        {
            maiorValor = valorB;

            if(valorA > valorC)
            {
                valorMedio = valorA;
                menorValor = valorC;

            }
            else
            {
                valorMedio = valorC;
                menorValor = valorA;
            }
        }
        else
        {
            maiorValor = valorC;

            if(valorA > valorB)
            {
                valorMedio = valorA;
                menorValor = valorB;

            }
            else
            {
                valorMedio = valorB;
                menorValor = valorA;
            }
        } 

        switch (opcao)
        {
            case 1:
                System.out.println(menorValor);
                System.out.println(valorMedio);
                System.out.println(maiorValor);
                break;
            
            case 2:
                System.out.println(maiorValor);
                System.out.println(valorMedio);
                System.out.println(menorValor);
                break;

            case 3:
                System.out.println(menorValor);
                System.out.println(maiorValor);
                System.out.println(valorMedio);
                break;
                
        }

        tec.close();
    }
}
