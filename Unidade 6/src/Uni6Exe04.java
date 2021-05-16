import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe04{

    private void lerValoresVetor(double vetor[]) 
    {
        Scanner tec = new Scanner(System.in);
        
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.print("[" + idx +  "] Informe o valor: ");
            vetor[idx] = tec.nextInt();
        }
    }

    private void somaVetoresEmTerceiro(double vetor1[], double vetor2[], double vetor3[]) 
    {   
        for (int idx = 0; idx < vetor3.length; idx++) 
        {
            vetor3[idx] = vetor1[idx] + vetor2[idx];
        }
    }

    private void escreverValores(double vetor[]) 
    {   
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.println("[" + idx +  "] "+ vetor[idx]);
        }
    }
    
    private Uni6Exe04() 
    {
        double vetor1[] = new double[10];
        double vetor2[] = new double[10];
        double vetor3[] = new double[10];

        System.out.println("Informe os 10 valores do primeiro vetor: ");
        lerValoresVetor(vetor1);

        System.out.println("Informe os 10 valores do segundo vetor: ");
        lerValoresVetor(vetor2);

        somaVetoresEmTerceiro(vetor1, vetor2, vetor3);
        
        System.out.println("Primeiro Vetor: ");
        escreverValores(vetor1);

        System.out.println("Segundo Vetor: ");
        escreverValores(vetor2);

        System.out.println("Terceiro Vetor: ");
        escreverValores(vetor3);
    }

    public static void main(String[] args) 
    {
        new Uni6Exe04();
    }
}
