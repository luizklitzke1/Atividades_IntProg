import java.util.Scanner;

public class Uni5Exe10 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int quantidadeEncontrada = 0;
        int potencia = 0;

        for (int numeroTeste = 1000; numeroTeste < 9999; numeroTeste++)
        {
            potencia = (numeroTeste / 100) + (numeroTeste % 100);

            if (potencia * potencia == numeroTeste)
            {
                quantidadeEncontrada++;

                System.out.println("[" + quantidadeEncontrada + "] " + numeroTeste);

                if (quantidadeEncontrada == 10)
                    break;
            }
        }
       
        tec.close();
    }
}
