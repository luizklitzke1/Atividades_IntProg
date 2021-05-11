import java.util.Scanner;

public class Uni5Exe04 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Descreva um algoritmo para calcular o valor de S dado por:
         */

        double dividendo = 3;
        double divisor = 2;

        double somaSerie = 0;
        
        for (int idx = 0; idx < 20; idx++)
        {
            //System.out.println(dividendo + " / " + divisor);
            somaSerie += dividendo / divisor;
    
            dividendo += 2;
            divisor += 2 * (idx + 2);
        }

        System.out.println("Soma da serie: " + somaSerie));

        tec.close();

    }
}
