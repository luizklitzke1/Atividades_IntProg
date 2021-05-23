import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe02{

    private void lerValoresVetor(double vetor[]) 
    {
        Scanner tec = new Scanner(System.in);
        
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.print("[" + idx +  "] Informe o valor: ");
            vetor[idx] = tec.nextDouble();
        }

        tec.close();
    }
        
    private double descobirMedia(double vetor[]) 
    {
        double somaValores = 0;

        for (int idx = 0; idx < vetor.length; idx++) 
            somaValores += vetor[idx];
            
        return (somaValores / vetor.length);
    }

    private void escreverValoresAcimaMedia(double vetor[], double media) 
    {   

        System.out.println("Valores acima da media (" + media + ")");

        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] > media)
            {
                System.out.println("[" + idx +  "] "+ vetor[idx]);
            }
        }
    }
    
    private Uni6Exe02() 
    {
        double vetor[] = new double[12];

        lerValoresVetor(vetor);

        double media = descobirMedia(vetor);

        escreverValoresAcimaMedia(vetor, media);
    }

    public static void main(String[] args) 
    {
        new Uni6Exe02();
    }
}
