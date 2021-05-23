import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe09
{

    private Uni6Exe09() 
    {
        Scanner tec = new Scanner(System.in);

        final int tamanhoVetor = 30;

        int idadesHomens[] = new int[30];
        double notasHomens[] = new double[30];

        int idadesMulheres[] = new int[30];
        double notasMulheres[] = new double[30];

        int codigoSexo;
        double nota;
        int idade;

        int  quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            System.out.print("Informe o sexo do cliente (1=feminino 2=masculino): ");
            codigoSexo = tec.nextInt();

            System.out.print("Informe a idade do cliente: ");
            idade = tec.nextInt();

            System.out.print("Informe a nota do cliente: ");
            nota = tec.nextDouble();

            if (codigoSexo == 1)
            {
                idadesMulheres[quantidadeMulheres] = idade;
                notasMulheres[quantidadeMulheres] = nota;

                ++quantidadeMulheres;
            }
            else
            {
                idadesHomens[quantidadeHomens] = idade;
                notasHomens[quantidadeHomens] = nota;

                ++quantidadeHomens;
            }
        }

        double somaNotas = 0;

        for (int i = 0; i < tamanhoVetor; i++)
            somaNotas += notasMulheres[i] + notasHomens[i];

        System.out.println("Nota media:" + somaNotas / 30);

        double somaNotasHomens = 0;

        for (int i = 0; i < tamanhoVetor; i++)
            somaNotasHomens +=  notasHomens[i];

        System.out.println("Nota media dos homens:" + somaNotasHomens / quantidadeHomens);

        int menorIdadeMulheres = 0;
        double notaMulherNova = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (idadesMulheres[i] < menorIdadeMulheres)
            {
                menorIdadeMulheres = idadesMulheres[i];
                notaMulherNova = notasMulheres[i];
            }
        }

        System.out.println("Nota da mulher mais jovem:" + notaMulherNova);

        int quantidadeMulheresMais50MaisMedia = 0;

        for (int i = 0; i < tamanhoVetor; i++)
        {
            if (notasMulheres[i] > (somaNotas / tamanhoVetor) &&
                idadesMulheres[i] > 50)
                ++quantidadeMulheresMais50MaisMedia;
        }

        System.out.println("Quantas das mulheres com mais de 50 anos deram nota superior a média." + quantidadeMulheresMais50MaisMedia);


        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe09();
    }
}
