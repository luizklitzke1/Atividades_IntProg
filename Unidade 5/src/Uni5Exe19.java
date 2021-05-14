import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da 
        compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual.
        Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total 
        recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.
        */

        double valorTotal = 0;
        double valorCompraDesconto = 0;

        System.out.print("Informe o valor da compra: ");
        double valorCompra = tec.nextDouble();

        while (valorCompra != 0)
        {
            if (valorCompra <= 500)
                valorCompraDesconto += valorCompra * .85;
            else
                valorCompraDesconto += valorCompra * .80;

            valorTotal += valorCompraDesconto;

            System.out.println("Valor da compra com desconto: " + valorCompraDesconto);

            System.out.print("Informe o valor da compra: ");
            valorCompra = tec.nextDouble();
        }

        System.out.println("O valor total da compra: " + valorTotal);
        
        tec.close();
    }
}
