import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1005 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);

        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A = tec.nextDouble();
        
        double B = tec.nextDouble();

        double w1 = 3.5;
        double w2 = 7.5;

        double media = (A*w1 + B*w2) / (w1+w2);

        System.out.println("MEDIA = " + df_5.format(media));

        tec.close();
    }

}
