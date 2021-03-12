import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1016 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int dist = tec.nextInt();

        int time = dist*2;

        System.out.println(time + " minutos");

        tec.close();
    }

}
