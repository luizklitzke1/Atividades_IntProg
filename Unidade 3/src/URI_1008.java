import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int n = tec.nextInt();
        int horas = tec.nextInt();

        float val_hora = tec.nextFloat();

        float sal = horas*val_hora;

        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = U$ " + df_2.format(sal));

        tec.close();
    }

}
