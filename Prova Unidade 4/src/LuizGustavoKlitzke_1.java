import java.util.Scanner;

public class LuizGustavoKlitzke_1 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);
       
        System.out.println("Digite a renda anual:");
        double rendAnual = tec.nextDouble();

        System.out.println("Digite a quantidade de dependentes:");
        int qtDependentes = tec.nextInt();

        double rendaLiquida = rendAnual - (rendAnual * qtDependentes * 0.02);

        double impostoAPagar = 0;

        if (rendaLiquida > 2000 && rendaLiquida <= 5000)
            impostoAPagar = rendaLiquida * 0.05;
        else if (rendaLiquida > 5000 && rendaLiquida <= 10000)
            impostoAPagar = rendaLiquida * 0.1;
        else 
            impostoAPagar = rendaLiquida * 0.15;

        System.out.println("O imposto a pagar equivale a: " + impostoAPagar);
        
        tec.close();
    }
}
