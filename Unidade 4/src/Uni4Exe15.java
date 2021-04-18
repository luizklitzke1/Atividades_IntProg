import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
       Uni4Exe15.java - Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
       A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. Para funcionário admitido 
       entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
        */

        int mesesAdmitido = tec.nextInt();

        if (mesesAdmitido < 12)
            System.out.println("O reajuste será de 5% !");
        else if (mesesAdmitido >= 13 && mesesAdmitido <= 48)
            System.out.println("O reajuste será de 7% !");
        else
            System.out.println("Não haverá reajuste!");
        
        tec.close();
    }
}
