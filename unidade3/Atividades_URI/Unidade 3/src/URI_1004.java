import java.util.Scanner;

public class URI_1004 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner (System.in);

        int A = tec.nextInt();
        int B = tec.nextInt();

        int PROD = A*B;

        System.out.println("PROD = " + PROD);

        tec.close();
    }

}
