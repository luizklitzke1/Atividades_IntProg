import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        System.out.print("Informe o valor R$ " );

        int val = tec.nextInt();

        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;

        while (val > 0)
        {
            if (val >= 20)
            {
                notas20++;
                val -= 20;
            }
            else if (val >= 10)
            {
                notas10++;
                val -= 10;
            }
            else if (val >= 5)
            {
                notas5++;
                val -= 5;
            }
            else if (val >= 2)
            {
                notas2++;
                val -= 2;
            }
            else
            {
                notas1++;
                val--;
            }
        }

        System.out.println( notas20 + " nota(s) de R$ 20,00" );
        System.out.println( notas10 + " nota(s) de R$ 10,00" );
        System.out.println( notas5 + " nota(s) de R$ 5,00" );
        System.out.println( notas2 + " nota(s) de R$ 2,00" );
        System.out.println( notas1 + " nota(s) de R$ 1,00" );

        tec.close();
    }
}
