import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe12.java - Dados 3 valores lado1, lado2, lado3, que representam os
         * comprimentos dos lados de um triângulo, descreva um algoritmo que verifique
         * se os mesmos podem ser os comprimentos dos lados de um triângulo. Em caso
         * afirmativo, verifique e informe se é "triângulo equilátero",
         * "triângulo isósceles" ou "triângulo escaleno". Em caso negativo, informe que
         * os mesmos não formam um triângulo. Considere que:
         * 
         * o comprimento de cada lado de um triângulo é menor que a soma dos
         * comprimentos dos outros lados um triângulo equilátero tem três lados iguais
         * um triângulo isóscele tem dois lados iguais e um diferente um triângulo
         * escaleno tem três lados diferentes
         * 
         */

        System.out.println("Informe o valor do primeiro lado: ");
        double lado1 = tec.nextDouble();

        System.out.println("Informe o valor do segundo lado: ");
        double lado2 = tec.nextDouble();

        System.out.println("Informe o valor do terceiro lado: ");
        double lado3 = tec.nextDouble();

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado2 + lado1)
            System.out.println("Valores inválidos para um triângulo!");
        else if (lado1 == lado2 && lado2 == lado3)
            System.out.println("É um triângulo equilátero!");
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
            System.out.println("É um triângulo isóscele");
        else
            System.out.println("É um triângulo escaleno!");

        tec.close();
    }
}
