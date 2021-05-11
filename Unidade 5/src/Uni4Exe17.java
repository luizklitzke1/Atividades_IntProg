import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe17 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe a renda anual:");
        double rendaAnual = input.nextDouble();

        System.out.println("Informe o numero de dependentes:");
        int numeroDeDependentes = input.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * (.02 * numeroDeDependentes));

        System.out.println("Renda liquida: R$ " + df_2.format(rendaLiquida));

        double quantidadeImposto = 0;

        if (rendaLiquida < 2000)
            System.out.println("Valor do Imposto: R$ 0,00");

        else if (rendaLiquida > 2000 && rendaLiquida < 5000)
            quantidadeImposto = (rendaLiquida * 0.05);
        else if (rendaLiquida > 5000 && rendaLiquida < 10000)
            quantidadeImposto = (rendaLiquida * 0.10);
        else
            quantidadeImposto = (rendaLiquida * 0.15);
        
        System.out.println("Valor do Imposto:  R$" + df_2.format(quantidadeImposto));
        System.out.println("Liquida com o desconto do Imposto:  R$" + df_2.format(rendaLiquida - quantidadeImposto));

        input.close();
    }
}
