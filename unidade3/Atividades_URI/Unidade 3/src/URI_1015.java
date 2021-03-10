import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class URI_1015 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1 = tec.nextDouble();
        double y1 = tec.nextDouble();

        double x2 = tec.nextDouble();
        double y2 = tec.nextDouble();
        
        double dist = ( Math.sqrt(Math.pow( (x2-x1) ,2) + Math.pow( (y2-y1) ,2)));

        System.out.println(df.format(dist));

        tec.close();
    }

}
