import java.util.Scanner;

public class URI1041 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        double dValorX = tec.nextDouble();
        double dValorY = tec.nextDouble();
        
        if (dValorX == 0 && dValorY == 0)
            System.out.println("Origem");
        else if (dValorX == 0)
            System.out.println("Eixo Y");
        else if (dValorY == 0)
            System.out.println("Eixo X");
        else if (dValorX > 0 && dValorY > 0)
            System.out.println("Q1");
        else if (dValorX > 0 && dValorY < 0)
            System.out.println("Q4");
        else if (dValorX < 0 && dValorY < 0)
            System.out.println("Q3");
        else
            System.out.println("Q2");

        tec.close();
    }
}
