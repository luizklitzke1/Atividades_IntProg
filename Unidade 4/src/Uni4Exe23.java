import java.util.Scanner;

public class Uni4Exe23 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe23.java - Escreva um algoritmo que leia um número inteiro positivo 
        representando um determinado mês do ano e escreva o mês por extenso. Para valores maiores do que 12 informe que o valor não é válido.
        */

        System.out.println("Informe o número do mês");
        int NumeroMes = tec.nextInt();

        String NomeMes;
        switch (NumeroMes)
        {
            case 1:
                NomeMes = "Janeiro";
                break;

            case 2:
                NomeMes = "Fevereiro";
                break;

            case 3:
                NomeMes = "Março";
                break;

            case 4:
                NomeMes = "Abril";
                break;

            case 5:
                NomeMes = "Maio";
                break;

            case 6:
                NomeMes = "Junho";
                break;
            case 7:
                NomeMes = "Julho";
                break;
            case 8:
                NomeMes = "Agosto";
                break;
            case 9:
                NomeMes = "Setembro";
                break;
            case 10:
                NomeMes = "Outubro";
                break;
            case 11:
                NomeMes = "Novembro";
                break;
            case 12:
                NomeMes = "Dezembro";
                break;
            default:
                NomeMes = "Valor inválido!";
                break;
        }

        System.out.println(NomeMes);

        tec.close();
    }
}
