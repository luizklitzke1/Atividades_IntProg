import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe07{

    private int[] criaVetor(int tamanhoVetor)
    {
        return new int[tamanhoVetor];
    }

    private boolean adicionarValor(int vetor[], int valoresAdicionados, Scanner teclado) 
    {
        System.out.print("Informe o valor para adicionar ao vetor: ");
        int novoValor = teclado.nextInt();

        if (procurarValor(vetor, novoValor))
        {
            System.out.println("O valor já existe no vetor!");
            return false;
        }

        vetor[valoresAdicionados] = novoValor;

        return true;
    }

    private void ordenarValores(int vetor[], int valoresAdicionados)
    {
        for(int i = 0 ; i < valoresAdicionados; i++)
        {
            for(int j = i + 1 ; j < valoresAdicionados; j++)
            {
                if(vetor[i] > vetor[j])
                {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
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
            if (adicionarValor(vetor, valoresAdicionados, tec))
                valoresAdicionados++;
        }

        System.out.print("Vetor origem: ");
        mostraDadosVetor(vetor);

        ordenarValores(vetor, valoresAdicionados);

        System.out.print("Vetor ordenado: ");
        mostraDadosVetor(vetor);

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe07();
    }
}
