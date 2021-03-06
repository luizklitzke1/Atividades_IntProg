import java.util.Scanner;
import java.text.DecimalFormat;
public class URI_1018 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int val = tec.nextInt();
        int temp = val;

        int notas100 = val / 100;
        temp -= notas100*100;

        int notas50 = temp / 50;
        temp -= notas50*50;

        int notas20 = temp / 20;
        temp -= notas20 * 20;

        int notas10 = temp / 10;
        temp -= notas10 * 10;

        int notas5 = temp / 5;
        temp -= notas5 * 5;

        int notas2 = temp / 2;
        temp -= notas2 * 2;

        int notas1 = temp / 1;
        temp -= notas1 * 1;

        System.out.println(val);
        System.out.println( notas100 + " nota(s) de R$ 100,00" );
        System.out.println( notas50 + " nota(s) de R$ 50,00" );
        System.out.println( notas20 + " nota(s) de R$ 20,00" );
        System.out.println( notas10 + " nota(s) de R$ 10,00" );
        System.out.println( notas5 + " nota(s) de R$ 5,00" );
        System.out.println( notas2 + " nota(s) de R$ 2,00" );
        System.out.println( notas1 + " nota(s) de R$ 1,00" );

        tec.close();
    }

}
