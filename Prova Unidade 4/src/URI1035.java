import java.util.Scanner;

public class URI1035 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        int valorA = tec.nextInt();
        int valorB = tec.nextInt();
        int valorC = tec.nextInt();
        int valorD = tec.nextInt();

        if (valorB > valorC && valorD > valorA && (valorC + valorD > valorA + valorB)
            && valorC > 0 && valorD > 0 && valorA % 2 == 0)
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");

        tec.close();
    }
}
