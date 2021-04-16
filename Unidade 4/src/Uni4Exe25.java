import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe25.java - Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. 
        O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções: Escolha uma opção:
        1 - Soma de dois números. 2 - Diferença entre dois números. 3 - Produto entre dois números. 4 - Divisão entre dois números (o denominador não pode ser zero).
        */

        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");

        System.out.println("Gostaria de executar qual opção?");
        int Opcao = tec.nextInt();

        System.out.println("Informe o primeiro valor: ");
        int ValorA = tec.nextInt();
        System.out.println("Informe o segundo valor: ");
        int ValorB = tec.nextInt();

        switch (Opcao)
        {
            case 1:
                System.out.println(ValorA + ValorB);
                break;
            
            case 2:
                System.out.println(Math.abs(ValorA - ValorB));
                break;

            case 3:
                System.out.println(ValorA * ValorB);
                break;
            case 4:
                if (ValorB == 0)
                    System.out.println("Impossível dividir por 0!");
                else
                    System.out.println(ValorA / ValorB);
                
                break;
            default:
                System.out.println("Valor inválido!");
                break;
                
        }
        
        tec.close();
    }
}
