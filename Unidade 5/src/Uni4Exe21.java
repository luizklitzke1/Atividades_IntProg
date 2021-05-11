import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe21 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);   

        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        System.out.println("Informe a massa: ");
        double massa = tec.nextDouble();

        System.out.println("Informe a altura: ");
        double Altura = tec.nextDouble();

        double IMC = massa / Math.pow(Altura, 2);

        String classificacao;
        if (IMC < 18.5)
            classificacao = "Magreza";
        else if (IMC < 25)
            classificacao = "Saudável";
        else if (IMC < 30)
            classificacao = "Sobrepeso";
        else if (IMC < 35)
            classificacao = "Obesidade Grau I";
        else if (IMC < 40)
            classificacao = "Obesidade Grau II (severa)";
        else
            classificacao = "Obesidade Grau III (mórbida)";

        System.out.println("IMC: " + df_2.format(IMC) + " | Classificação: " + classificacao);

        tec.close();
    }
}
