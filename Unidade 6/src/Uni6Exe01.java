import java.util.Scanner;

public class Uni6Exe01{

    private void lerValoresVetor(int vetor[]) 
    {
        Scanner tec = new Scanner(System.in);
        
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.print("Informe o valor: ");
            vetor[idx] = tec.nextInt();
        }

        tec.close();
    }
        
    private void escreverVetorAoContario(int vetor[]) 
    {
        for (int idx = vetor.length - 1; idx >= 0; idx--) 
        {
            System.out.println("vetor[" + idx + "]: " + vetor[idx]);
        }    
    }
    
    private Uni6Exe01() 
    {
        int vetor[] = new int[10];
        lerValoresVetor(vetor);
        escreverVetorAoContario(vetor);
    }

    public static void main(String[] args) 
    {
        new Uni6Exe01();
    }
}
