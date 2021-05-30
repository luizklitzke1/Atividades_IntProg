import java.util.Scanner;

public class Uni5Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) 
         * e o preço de venda (PV). Descreva um algoritmo que:
            escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: 
            % = (PV - PC) / PC * 100;
            determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
         */

        final int quantidadeMercadorias = 20;

        int quantidadeLucroMenor10 = 0;
        int quantidadeLucroEntre10e20 = 0;
        int quantidadeLucroMaior20 = 0;

        int valorTotalCompra = 0;
        int valorTotalVenda = 0;

        double lucroTotal = 0;

        String nomeMercadoria;
        double precoCompra = 0;
        double precoVenda = 0;

        double lucro = 0;

        for (int idx = 0; idx < quantidadeMercadorias; idx++)
        {
            System.out.print("[" + (idx + 1) + "] Informe o nome da mercadoria: ");
            nomeMercadoria = tec.next();

            System.out.print("[" + (idx + 1) + "] Informe o o preço de compra (PC): ");
            precoCompra = tec.nextDouble();

            System.out.print("[" + (idx + 1) + "] Informe o o preço de venda (PV): ");
            precoVenda = tec.nextDouble();

            valorTotalCompra += precoCompra;
            valorTotalVenda += precoVenda;

            lucro = (precoVenda - precoCompra) / precoCompra * 100;
            lucroTotal += lucro;

            if (lucro < 10)
                quantidadeLucroMenor10++;
            else if (lucro <= 20)
                quantidadeLucroEntre10e20++;
            else
                quantidadeLucroMaior20++;
            
        }
        
        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);

        //Nao tenho certeza, mas entendi que o lucro total seja a soma das porcentagens de lucro
        System.out.print("Lucro total: " + lucroTotal);

        System.out.println("Mercadorias com lucro menor de 10%: " + quantidadeLucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + quantidadeLucroEntre10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + quantidadeLucroMaior20);
       
        tec.close();
    }
}
