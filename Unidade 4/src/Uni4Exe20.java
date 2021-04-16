import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni4Exe20 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);  
        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe a nota 1: ");
        double Nota1 = tec.nextDouble(); 

        System.out.println("Informe a nota 2: ");
        double Nota2 = tec.nextDouble(); 

        System.out.println("Informe a nota 3: ");
        double Nota3 = tec.nextDouble(); 

        System.out.println("Informe a nota dos exercícios: ");
        double NotaExercicios = tec.nextDouble(); 

        double Media = (Nota1 + Nota2 * 2 + Nota3 * 3 + NotaExercicios) / 7;

        char Conceito;
        if (Media >= 9)
            Conceito = 'A';
        else if (Media >= 7.5)
            Conceito = 'B';
        else if (Media >= 6)
            Conceito = 'C';
        else if (Media >= 4)
            Conceito = 'D';
        else
            Conceito = 'E';

        String Estado;
        if (Conceito == 'D' || Conceito == 'E')
            Estado = "Reprovado";
        else
            Estado = "Aprovado";

        System.out.println("Média do aluno: " + df_2.format(Media) + "| Conceito : " + Conceito + "| Estado: " + Estado);

        tec.close();
    }
}
