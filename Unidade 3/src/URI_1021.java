import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class URI_1021 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);    
        DecimalFormat df = new DecimalFormat("0.00");    

        float val = tec.nextFloat();

        int notas100 = (int)val / 100;
        val -= notas100*100;

        int notas50 = (int)val / 50;
        val -= notas50*50;

        int notas20 = (int)val / 20;
        val -= notas20 * 20;

        int notas10 = (int)val / 10;
        val -= notas10 * 10;

        int notas5 = (int)val / 5;
        val -= notas5 * 5;

        int notas2 = (int)val / 2;
        val -= notas2 * 2;

        int moedas1 = (int)val / 1;
        val -= moedas1 * 1;

        int moedas50 = (int)(val/(0.5));
        val -= moedas50 * 0.5;

        int moedas25 = (int)(val/(0.25));
        val -= moedas25 * 0.25;

        int moedas10 = (int)(val/(0.1));
        val -= moedas10 * 0.1;

        int moedas05 = (int)(val/(0.05));
        val -= moedas05 * 0.05;

        int moedas01 = (int)((val+0.001)/(0.01));
        val -= moedas01 * 0.01;
        

        System.out.println("NOTAS:");
        System.out.println( notas100 + " nota(s) de R$ 100.00" );
        System.out.println( notas50 + " nota(s) de R$ 50.00" );
        System.out.println( notas20 + " nota(s) de R$ 20.00" );
        System.out.println( notas10 + " nota(s) de R$ 10.00" );
        System.out.println( notas5 + " nota(s) de R$ 5.00" );
        System.out.println( notas2 + " nota(s) de R$ 2.00" );
        System.out.println("MOEDAS:");
        System.out.println( moedas1 + " moedas(s) de R$ 1.00" );
        System.out.println( moedas50 + " moedas(s) de R$ 0.50" );
        System.out.println( moedas25 + " moedas(s) de R$ 0.25" );
        System.out.println( moedas10 + " moedas(s) de R$ 0.10" );
        System.out.println( moedas05 + " moedas(s) de R$ 0.05" );
        System.out.println( moedas01 + " moedas(s) de R$ 0.01" );

        tec.close();
    }

}
