import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe07{

    private int[] criaVetor(int tamanhoVetor)
    {
        return new int[tamanhoVetor];
    }

    private boolean adicionarValor(int vetor[], Scanner teclado) 
    {
        System.out.print("Informe o valor para adicionar ao vetor: ");
        int novoValor = teclado.nextInt();

        if (procurarValor(vetor, novoValor))
        {
            System.out.println("O valor já existe no vetor!");
            return false;
        }

        int pos = vetor.length;

        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] > novoValor || vetor[idx]  == 0)
            {
                pos = idx;
                break;
            }
        }

        if (pos == vetor.length)
        {
            vetor[pos - 1] = novoValor;
            return true;
        }

        int temp = 0;

        for (int idx = pos; idx < vetor.length - 1; idx ++) 
        {
            temp = vetor[idx + 1];
            vetor[idx + 1] = vetor[idx];
            if (idx + 2 < vetor.length)
                vetor[idx += 2 ] = temp;
            
        }

        vetor[pos] = novoValor;

        return true;
    }

    private boolean procurarValor(int vetor[], int valor) 
    {   
        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] == valor)
                return true;
        }
        
        return false;
    }

    private void mostraDadosVetor(int vetor[])
    {
        for (int idx = 0; idx < vetor.length; idx++)
        {
            if (vetor[idx] == 0)
                System.out.print("[]");
            else
                System.out.print("[" + vetor[idx]  + "]");
        }
        System.out.print("\n");
    }
    
    private Uni6Exe07() 
    {
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = tec.nextInt();

        int vetor[] = criaVetor(tamanhoVetor);

        int valoresAdicionados = 0;

        while (valoresAdicionados < tamanhoVetor)
        {
            if (adicionarValor(vetor, tec))
            {
                valoresAdicionados++;
                mostraDadosVetor(vetor);
            }  
        }

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe07();
    }
}
