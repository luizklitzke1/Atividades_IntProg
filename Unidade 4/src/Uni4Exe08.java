import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe08.java - Dado uma letra, escreva um algoritmo que informe se ela é ou
         * não uma vogal.
         */

        char letra = tec.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') 
            System.out.println("A letra " + letra + " é vogal!");
        else 
            System.out.println("A letra " + letra + " não é vogal!");

        tec.close();
    }
}
