import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe01 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        /*
         * Uni4Exe01.java - A jornada de trabalho semanal de um funcionário é de 40
         * horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo
         * cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um
         * algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora
         * e escreva o salário total do funcionário, que deverá ser acrescido das horas
         * extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas
         * exatas).
         */

        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horas = tec.nextDouble();
        System.out.println("Informe o valor por hora:");
        double valorHora = tec.nextDouble();

        double salario = horas * valorHora;

        if (horas > 160)
        {
            double horasExtra = horas - 160;
            double valorhorasExtra = horasExtra * valorHora * .5;
            salario += valorhorasExtra;
        }

        System.out.println("O salário final será de R$ " + df_2.format(salario));
        
        tec.close();
    }
}
