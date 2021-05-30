import java.util.Scanner;
import java.util.Vector;
import java.text.DecimalFormat;

public class Uni6Exe08{

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

    private void separaValoresUnicos(double vetor[], double valoresUnicos[])
    {
        for (int i = 0; i < vetor.length; i++)
        {
            if (!procurarValor(valoresUnicos, vetor[i]))
            {
                for (int j = 0; j < valoresUnicos.length; j++)
                {
                    if (valoresUnicos[j] == 0)
                    {
                        valoresUnicos[j] = vetor[i];
                        break;
                    }
                }
            }
        }
    }

    private void calculaFrequencia(double vetor[], double valoresUnicos[], int frequenciaValores[])
    {
        for (int i = 0; i < vetor.length; i++)
        {
            for (int j = 0; j < valoresUnicos.length; j++)
            {
                if (valoresUnicos[j] == vetor[i])
                    frequenciaValores[j]++;
            }
        }
    }
    
    private Uni6Exe08() 
    {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");  


        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = tec.nextInt();

        double vetor[] = new double[tamanhoVetor];

        lerValoresVetor(vetor, tec);

        double valoresUnicos[] = new double[tamanhoVetor];

        separaValoresUnicos(vetor, valoresUnicos);

        int frequenciaValores[] =  new int[tamanhoVetor];

        calculaFrequencia(vetor, valoresUnicos, frequenciaValores);

        System.out.println("Valor            Frequencia");

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (frequenciaValores[i] == 0)
                break;

            System.out.println(df_2.format(valoresUnicos[i]) + "                 " + frequenciaValores[i]);
        }

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe08();
    }
}
