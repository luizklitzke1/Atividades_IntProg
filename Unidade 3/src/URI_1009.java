import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String nome = tec.next();
        double fixo = tec.nextDouble();
        double vendas = tec.nextDouble();

        double percent = vendas*0.15;

        double sal_total = fixo + percent;

        System.out.println("TOTAL = R$ " + df_2.format(sal_total));

        tec.close();
    }

}
