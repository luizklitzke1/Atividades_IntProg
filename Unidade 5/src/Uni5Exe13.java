import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Um motorista acaba de voltar de um feriado prolongado. Antes de sair 
         * de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou 
         * as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro
         *  e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
         * Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à 
         * compra de combustível. Calcule e escreva:
         * a quilometragem obtida por litro de combustível em cada parada;
         * a quilometragem média obtida por litro de combustível em toda a viagem.
         */

        double combustivelCompradoParada = 0;
        double combustivelCompradoTotal = 0;
        
        int odometroParada = 0;
        int odometroInicial = 0;
        int kilometragemTotal = 0;

        System.out.print("Informe o valor do odometro na saida: ");
        odometroInicial = tec.nextInt();

        kilometragemTotal = odometroInicial;

        System.out.print("Informe a quantidade de paradas: ");
        int quantidadeParadas = tec.nextInt();

        for (int idx = 0; idx < quantidadeParadas; idx++)
        {
            System.out.print("[" + (idx + 1) + "] Informe o valor do odometro: ");
            odometroParada = tec.nextInt();

            System.out.print("[" + (idx + 1) + "] Informe o tanto abastecido: ");
            combustivelCompradoParada = tec.nextDouble();

            System.out.println("Percorrido por litro: " + ((odometroParada - kilometragemTotal) / combustivelCompradoParada));

            kilometragemTotal += (odometroParada - kilometragemTotal);
            combustivelCompradoTotal += combustivelCompradoParada;
        }
       
        System.out.println("Km/l medio da viagem: " + ((kilometragemTotal - odometroInicial) / combustivelCompradoTotal));

        tec.close();
    }
}
