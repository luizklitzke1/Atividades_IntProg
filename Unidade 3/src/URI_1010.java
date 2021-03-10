import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1010 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        String peca1str = tec.next();
        String numPeca1str = tec.next();
        String valorpeca1str = tec.next();

        int peca1 = Integer.parseInt(peca1str); 
        int numPeca1 = Integer.parseInt(numPeca1str); 
        double valorpeca1 = Double.parseDouble(valorpeca1str); 



        String peca2str = tec.next();
        String numPeca2str = tec.next();
        String valorpeca2str = tec.next();

        int peca2 = Integer.parseInt(peca2str); 
        int numPeca2 = Integer.parseInt(numPeca2str); 
        double valorpeca2 = Double.parseDouble(valorpeca2str);
        
        double total = ((numPeca2 * valorpeca2) + (numPeca1 * valorpeca1));

        DecimalFormat df = new DecimalFormat("R$ 0.00");

        System.out.println("VALOR A PAGAR: " + df.format(total));

        tec.close();
    }

}
