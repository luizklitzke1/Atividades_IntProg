import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe09
{

    private void LerEntradas(int tamanhoVetor, double [][] avaliacoes, Scanner tec)
    {
        for (int i = 0; i < tamanhoVetor; i++)
        {
            System.out.print("\nInforme o sexo do cliente (1=feminino 2=masculino): ");
            avaliacoes[i][0] = tec.nextInt();

            System.out.print("Informe a idade do cliente: ");
            avaliacoes[i][1] = tec.nextInt();

            System.out.print("Informe a nota do cliente: ");
            avaliacoes[i][2] = tec.nextDouble();
        }
    }

    private double CalculaMediaGeral(int tamanhoVetor, double [][] avaliacoes)
    {
        double somaNotas = 0;

        for (int i = 0; i < tamanhoVetor; i++)
            somaNotas += avaliacoes[i][2];
            
        return somaNotas / tamanhoVetor;
    }

    private double CalculaMediaHomens(int tamanhoVetor, double [][] avaliacoes)
    {
        int quantidadeHomens = 0;
        double somaNotas = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (avaliacoes[i][0] == 2)
            {
                somaNotas += avaliacoes[i][2];
                quantidadeHomens++;
            }   
        }
            
        return somaNotas / quantidadeHomens;
    }

    private double CalculaNotaMulherMaisNova(int tamanhoVetor, double [][] avaliacoes)
    {
        int menorIdadeMulheres = 999999;
        double notaMulherNova = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (avaliacoes[i][0] == 1)
            {
                if (avaliacoes[i][1] < menorIdadeMulheres)
                {
                    menorIdadeMulheres = (int)avaliacoes[i][1];
                    notaMulherNova = avaliacoes[i][2];
                }
            }   
        }
            
        return notaMulherNova;
    }

    private int CalculaQuantidadeMulheresMais50MaisMedia(double mediaGeral, int tamanhoVetor, double [][] avaliacoes)
    {
        int quantidadeMulheresMais50MaisMedia = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (avaliacoes[i][0] == 1)
            {
                if (avaliacoes[i][2] > mediaGeral && avaliacoes[i][1] > 50)
                    ++quantidadeMulheresMais50MaisMedia;
            }   
        }
            
        return quantidadeMulheresMais50MaisMedia;
    }

    private Uni6Exe09() 
    {
        Scanner tec = new Scanner(System.in);

        final int tamanhoVetor = 5;

        double avaliacoes[][] = new double[tamanhoVetor][3];

        LerEntradas(tamanhoVetor, avaliacoes, tec);

        double notaMediaGeral = CalculaMediaGeral(tamanhoVetor, avaliacoes);

        System.out.println("\nNota media: " + notaMediaGeral);

        double notaMediaHomens = CalculaMediaHomens(tamanhoVetor, avaliacoes);

        System.out.println("Nota media dos homens: " + notaMediaHomens);

        double notaMulherNova = CalculaNotaMulherMaisNova(tamanhoVetor, avaliacoes);

        System.out.println("Nota da mulher mais jovem: " + notaMulherNova);

        int quantidadeMulheresMais50MaisMedia = CalculaQuantidadeMulheresMais50MaisMedia(notaMediaGeral, tamanhoVetor, avaliacoes);

        System.out.println("Quantas das mulheres com mais de 50 anos deram nota superior a média: " + quantidadeMulheresMais50MaisMedia);

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe09();
    }
}
