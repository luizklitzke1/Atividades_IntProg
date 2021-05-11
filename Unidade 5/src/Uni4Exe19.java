import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe19.java - Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

        0, se os dois valores forem zero
        1, se os dois valores forem positivos
        2, se x for positivo e y, negativo
        3, se os dois valores forem negativos
        4, se x for negativo e y, positivo
        */

        System.out.println("Informe o valor X: ");
        int X = tec.nextInt();

        System.out.println("Informe o valor Y: ");
        int Y = tec.nextInt();

        int quadrante;
        if (X == 0 && Y == 0)
            quadrante = 0;
        else if (X > 0 && Y > 0)
            quadrante = 1;
        else if (X > 0 && Y < 0)
            quadrante = 2;
        else if (X < 0 && Y < 0)
            quadrante = 3;
        else
            quadrante = 4;

        System.out.println("Quadrante: " + quadrante);
        
        tec.close();
    }
}
