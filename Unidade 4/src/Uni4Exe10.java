import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe10.java - Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo 
        para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
        */

        System.out.println("Informe a idade de Marquinhos: ");
        int idadeMarquinhos = tec.nextInt();

        System.out.println("Informe a idade de Zezinho: ");
        int idadeZezinho = tec.nextInt();

        System.out.println("Informe a idade de Luluzinha: ");
        int idadeLuluzinha = tec.nextInt();

        String cacula = "";

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha)
            cacula = "Marquinhos";
        else 
        {
            if (idadeZezinho < idadeLuluzinha )
                cacula = "Zezinho";
            else 
                cacula = "Luluzinha";
        }

        System.out.println(cacula + " é o(a) caçula!");
        tec.close();
    }
}
