import java.util.Scanner;
import java.text.DecimalFormat;


public class URI_1021 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);    

        DecimalFormat df = new DecimalFormat("0.00");    

        double valor = input.nextDouble();

        int notas100 = (int) valor / 100;
        valor -= notas100*100;

        int notas50 = (int)valor / 50;
        valor -= notas50*50;

        int notas20 = (int)valor / 20;
        valor -= notas20 * 20;

        int notas10 = (int)valor / 10;
        valor -= notas10 * 10;

        int notas5 = (int)valor / 5;
        valor -= notas5 * 5;

        int notas2 = (int)valor / 2;
        valor -= notas2 * 2;

        int moedas1 = (int)valor / 1;
        valor -= moedas1 * 1;

        int moedas50 = (int)(valor/(0.5));
        valor -= moedas50 * 0.5;

        int moedas25 = (int)(valor/(0.25));
        valor -= moedas25 * 0.25;

        int moedas10 = (int)(valor/(0.1));
        valor -= moedas10 * 0.1;

        int moedas05 = (int)(valor/(0.05));
        valor -= moedas05 * 0.05;

        int moedas01 = (int)(valor/(0.01));
        valor -= moedas01 * 0.01;
        

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

        input.close();
    }
}
