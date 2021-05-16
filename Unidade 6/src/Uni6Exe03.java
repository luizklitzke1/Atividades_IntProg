import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe03{

    private void lerValoresVetor(double vetor[]) 
    {
        Scanner tec = new Scanner(System.in);
        
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.print("[" + idx +  "] Informe o valor: ");
            vetor[idx] = tec.nextInt();
        }

        tec.close();
    }

    private void alteraValores(double vetor[]) 
    {   
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (idx % 2 == 0)
                vetor[idx] *= 1.02;
            else
                vetor[idx] *= 1.05;
        }
    }

    private void escreverValores(double vetor[]) 
    {   

        System.out.println("Valores atualizados: ");

        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.println("[" + idx +  "] "+ vetor[idx]);
        }
    }
    
    private Uni6Exe03() 
    {
        double vetor[] = new double[12];

        lerValoresVetor(vetor);

        alteraValores(vetor);

        escreverValores(vetor);
    }

    public static void main(String[] args) 
    {
        new Uni6Exe03();
    }
}
