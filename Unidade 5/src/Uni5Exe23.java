import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês,
        que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, 
        vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal
        deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que 
        gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem:
        “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.
        */

        System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?: ");
        char continuar = tec.next().charAt(0);;

        int numeroProdutos = 0;

        while (continuar != 'n')
        {
            System.out.print("Quantos produtos deseja informar? ");
            numeroProdutos = tec.nextInt();

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?: ");
            continuar = tec.next().charAt(0);;
        }

       
        System.out.println(nomeMes);

        tec.close();
    }
}
