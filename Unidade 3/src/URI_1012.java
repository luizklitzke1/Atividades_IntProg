import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class URI_1012 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        float A = tec.nextFloat();
        float B = tec.nextFloat();
        float C = tec.nextFloat();

        float triangulo = (A*C)/2;

        double circulo = 3.14159*(Math.pow(C,2));

        double trapezio = ((A+B)*C)/2;

        double quadrado = Math.pow(B,2);

        double retangulo = A*B;

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));

        tec.close();
    }

}
