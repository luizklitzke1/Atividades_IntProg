import java.util.Scanner;

public class Uni4Exe17 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        System.out.println("Informe a renda anual:");
        double rendaAnual = input.nextDouble();

        System.out.println("Informe o numero de dependentes:");
        int nDependentes = input.nextInt();

        double rendaLiquida = rendaAnual - rendaAnual * (0.02 * nDependentes);

        if (rendaLiquida < 2000){

            System.out.println("Renda liquida: " + rendaLiquida);
            System.out.println("Valor do Imposto: R$ 0,00");
        }
        else if (rendaLiquida > 2000 && rendaLiquida < 5000 ){

            System.out.println("Renda liquida: " + rendaLiquida);
            System.out.println("Valor do Imposto:  " + (rendaLiquida * 0.05));
        }
        else if (rendaLiquida > 5000 && rendaLiquida < 10000 ){

            System.out.println("Renda liquida: " + rendaLiquida);
            System.out.println("Valor do Imposto:  " + (rendaLiquida * 0.10));
        }
        else {

            System.out.println("Renda liquida: " + rendaLiquida);
            System.out.println("Valor do Imposto:  " + (rendaLiquida * 0.15));
        }

        input.close();
    }
}
