import java.util.Scanner;

public class URI1037 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        double valorA = tec.nextDouble();

        if (valorA >= 0 && valorA <= 25)
            System.out.println("Intervalo [0,25]");
        else if (valorA > 25 && valorA <= 50)
            System.out.println("Intervalo (25,50]");
        else if (valorA > 50 && valorA <= 75)
            System.out.println("Intervalo (50,75]");
        else if (valorA > 75 && valorA <= 100)
            System.out.println("Intervalo (75,100]");
        else
            System.out.println("Fora de intervalo");

        tec.close();
    }
}
