import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1007 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);

        int A = tec.nextInt();
        int B = tec.nextInt();

        int C = tec.nextInt();
        int D = tec.nextInt();

        int dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

        tec.close();
    }

}
