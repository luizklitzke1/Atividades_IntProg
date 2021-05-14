import java.util.Scanner;

public class Uni5Exe22 {

    public static void main(String[] args) throws Exception {

        /*
        Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
        A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.
        */
        Scanner tec = new Scanner(System.in);     
        
        int ano = 1995;

        System.out.print("Informe o ano atual: ");
        int anoAtual = tec.nextInt();

        double aumento = 1.5;
        double salario = 100;

        while (anoAtual > ano)
        {
            salario *= (1 + (aumento / 100));
            aumento *= 2;
            ++ano;
        }

        System.out.print("Salarioa atual: " + salario);

        tec.close();
    }
}
