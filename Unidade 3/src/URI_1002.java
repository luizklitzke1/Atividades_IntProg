import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);

        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double π = 3.14159;

        double R = tec.nextDouble();

        double A = (π * Math.pow(R,2));

        System.out.println("A=" + df_4.format(A));

        tec.close();
    }

}
