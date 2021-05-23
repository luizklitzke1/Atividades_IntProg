import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe10
{
    private void adicionarValor(int vetor[], Scanner teclado) 
    {
        System.out.print("Informe o valor para adicionar ao vetor: ");
        int novoValor = teclado.nextInt();

        for (int idx = 0; idx < vetor.length - 1 ; idx++) 
            vetor[idx] = vetor[idx + 1];

        vetor[vetor.length - 1] = novoValor;

        System.out.print("Valor adicionado com sucesso!");
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

    private void alterarValor(int vetor[], Scanner teclado)
    {
        System.out.print("Informe o valor para alterar: ");
        int valorAlterar = teclado.nextInt();

        if (!procurarValor(vetor, valorAlterar))
        {
            System.out.println("O valor NAO existe no vetor!");
            return;
        }

        System.out.print("Informe o novo valor: ");
        int novoValor = teclado.nextInt();

        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] == valorAlterar)
            {
                vetor[idx] = novoValor;
                return;
            }
        }

    }

    private void excluirValor(int vetor[], Scanner teclado)
    {
        System.out.print("Informe o valor para excluir: ");
        int valorExcluir = teclado.nextInt();

        if (!procurarValor(vetor, valorExcluir))
        {
            System.out.println("O valor NAO existe no vetor!");
            return;
        }

        int pos = 0;

        for (int idx = 0; idx < vetor.length; idx++) 
        {
            if (vetor[idx] == valorExcluir)
            {
                pos = idx;
                break;
            }
        }

        for (int i = pos; i > 0; i--)
            vetor[i] = vetor[i - 1];
    }

    private void ordenarValores(int vetor[])
    {
        for(int i = 0 ; i < vetor.length;i++)
        {
            for(int j = i + 1 ; j < vetor.length; j++)
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

    private Uni6Exe10() 
    {
        Scanner tec = new Scanner(System.in);

        int opcaoMenu = 0;

        int vetor[] = new int[50];

        int valoresAdicionados = 0;

        do
        {
            System.out.println("Opcpes: ");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Sair do sistema");

            opcaoMenu = tec.nextInt();

            switch(opcaoMenu)
            {
                case 1:
                    if (valoresAdicionados < 50)
                    {
                        adicionarValor(vetor, tec);
                        ++valoresAdicionados;
                    }
                    break;

        	    case 2:
                    System.out.print("Informe o valor para procurar no vetor: ");
                    int valorProcurar = tec.nextInt();
                    if (procurarValor(vetor, valorProcurar))
                        System.out.println("O valor existe no vetor!");
                    else
                        System.out.println("O valor NAO existe no vetor!");

                    break;

                case 3:
                    alterarValor(vetor, tec);
                    break;

                case 4:
                    excluirValor(vetor, tec);
                    break;

                case 5:
                    mostraDadosVetor(vetor);
                    break;
                
                case 6:
                    ordenarValores(vetor);
                    break;
            }

        }
        while (opcaoMenu != 7);

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe10();
    }
}
