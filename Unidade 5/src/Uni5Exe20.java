import java.util.Scanner;

public class Uni5Exe20 {

    /*
    Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
    Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário 
    para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.
    */
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);       

        System.out.print("Informe a massa inicial: ");
        double massaInicial = tec.nextDouble();

        double massa = massaInicial;

        int segundosPercorridos = 0;

        while (massa >= .5)
        {
            massa /= 2;

            segundosPercorridos += 50;
        }

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa);
        System.out.println("Tempo: " + segundosPercorridos + " segundos.");

        tec.close();
    }
}
