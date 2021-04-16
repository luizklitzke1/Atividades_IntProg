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
        int ValorA = tec.nextInt();
        System.out.println("Informe o segundo valor: ");
        int ValorB = tec.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int ValorC = tec.nextInt();

        System.out.println("1, escreva os 3 valores em ordem crescente");
        System.out.println("2, escreva os 3 valores em ordem decrescente");
        System.out.println("3, escreva os 3 valores de forma que o maior valor fique no meio");
        System.out.println("Escolha uma opção: ");
        int Opcao = tec.nextInt();

        int MaiorValor, ValorMedio, MenorValor;

        if(ValorA > ValorB && ValorA > ValorC){
            MaiorValor = ValorA;
            if(ValorB > ValorC){
                ValorMedio = ValorB;
                MenorValor = ValorA;

            }
            else{
                ValorMedio = ValorA;
                MenorValor = ValorB;
            }
        } 
        else{
            if(ValorB > ValorA && ValorB > ValorC){
                MaiorValor = ValorB;
                if(ValorA > ValorC){
                    ValorMedio = ValorA;
                    MenorValor = ValorC;
    
                }
                else{
                    ValorMedio = ValorC;
                    MenorValor = ValorA;
                }
            }
            else{
                MaiorValor = ValorC;
                if(ValorA > ValorB){
                    ValorMedio = ValorA;
                    MenorValor = ValorB;
    
                }
                else{
                    ValorMedio = ValorB;
                    MenorValor = ValorA;
                }
            } 
        }

        switch (Opcao)
        {
            case 1:
                System.out.println(MenorValor);
                System.out.println(ValorMedio);
                System.out.println(MaiorValor);
                break;
            
            case 2:
                System.out.println(MaiorValor);
                System.out.println(ValorMedio);
                System.out.println(MenorValor);
                break;

            case 3:
                System.out.println(MenorValor);
                System.out.println(MaiorValor);
                System.out.println(ValorMedio);
                break;
                
        }

        tec.close();
    }
}
