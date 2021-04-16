import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);   
        
        System.out.println("Informe a massa: ");
        double Massa = tec.nextDouble();

        System.out.println("Informe a altura: ");
        double Altura = tec.nextDouble();

        double IMC = Massa / Math.pow(Altura, 2);

        String Classificacao;
        if (IMC < 18.5)
            Classificacao = "Magreza";
        else if (IMC < 25)
            Classificacao = "Saudável";
        else if (IMC < 30)
            Classificacao = "Sobrepeso";
        else if (IMC < 35)
            Classificacao = "Obesidade Grau I";
        else if (IMC < 40)
            Classificacao = "Obesidade Grau II (severa)";
        else
            Classificacao = "Obesidade Grau III (mórbida)";

        System.out.println("IMC: " + IMC + " | Classificação: " + Classificacao);

        tec.close();
    }
}
