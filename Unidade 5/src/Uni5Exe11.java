import java.util.Scanner;

public class Uni5Exe11 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, 
         * na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos 
         * quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados 
         * no final de cada dia (a máquina opera 16 horas por dia).
         */

        int quantidadeQuebrada = 0;

        for (int hora = 0; hora < 16; hora++)
            quantidadeQuebrada += Math.pow(3, hora);


        System.out.println("Biscoitos quebrados: " + quantidadeQuebrada);
        

        tec.close();
    }
}
