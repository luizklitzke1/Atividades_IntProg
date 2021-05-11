import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni4Exe20 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);  
        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe a nota 1: ");
        double nota1 = tec.nextDouble(); 

        System.out.println("Informe a nota 2: ");
        double nota2 = tec.nextDouble(); 

        System.out.println("Informe a nota 3: ");
        double nota3 = tec.nextDouble(); 

        System.out.println("Informe a nota dos exercícios: ");
        double NotaExercicios = tec.nextDouble(); 

        double media = (nota1 + nota2 * 2 + nota3 * 3 + NotaExercicios) / 7;

        char conceito = 0;
        if (media >= 9)
            conceito = 'A';
        else if (media >= 7.5)
            conceito = 'B';
        else if (media >= 6)
            conceito = 'C';
        else if (media >= 4)
            conceito = 'D';
        else
            conceito = 'E';

        String estado;
        if (conceito == 'D' || conceito == 'E')
            estado = "Reprovado";
        else
            estado = "Aprovado";

        System.out.println("Média do aluno: " + df_2.format(media) + "| Conceito : " + conceito + "| Estado: " + estado);

        tec.close();
    }
}
