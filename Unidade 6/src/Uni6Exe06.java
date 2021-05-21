import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe06{

    private void lerValoresVetor(double vetor[], Scanner teclado) 
    {
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            System.out.print("[" + (idx + 1) + "]Informe o valor: ");
            vetor[idx] = teclado.nextDouble();
        }
    }

    private boolean procurarValor(double vetor[], double valor) 
    {   
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] == valor)
                return true;
        }
        
        return false;
    }
    
    private Uni6Exe06() 
    {
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = tec.nextInt();

        double vetor[] = new double[tamanhoVetor];

        lerValoresVetor(vetor, tec);

        System.out.print("Informe um valor para procurar no vetor: ");
        double valorProcurar = tec.nextDouble();

        if (procurarValor(vetor, valorProcurar))
            System.out.println("Valor [" + valorProcurar + "] encontrado!");
        else
        System.out.println("Valor [" + valorProcurar + "] não encontrado!");
        
        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe06();
    }
}
