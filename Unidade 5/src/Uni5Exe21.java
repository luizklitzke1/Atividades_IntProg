public class Uni5Exe21 {

    public static void main(String[] args) throws Exception {
        /*
        Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 
        Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
        */
        double alturaChico = 1.5;
        double alturaZe = 1.1;

        int anos = 0;

        while (alturaChico >= alturaZe)
        {
            alturaChico += .02;
            alturaZe += .03;
            anos++;
        }

        System.out.println("Anos percorridos: " + anos);

    }
}
