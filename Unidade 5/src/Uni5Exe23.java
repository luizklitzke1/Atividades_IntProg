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
        String nome;
        int numeroProdutos = 0;

        double valorVenda = 0;
        double totalVendas = 0;
        double salario = 0;

        System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?: ");
        char continuar = tec.next().charAt(0);;

        while (continuar != 'n')
        {
            System.out.print("Qual o nome do vendedor? ");
            nome = tec.next();

            System.out.print("Quantos produtos deseja informar? ");
            numeroProdutos = tec.nextInt();

            salario = 0;
            totalVendas = 0;

            for (int idx = 0; idx < numeroProdutos; idx++)
            {
                System.out.print("Informe o valor do produto: ");
                valorVenda = tec.nextDouble();
                totalVendas += valorVenda;
                salario += valorVenda * .3;
            }

            System.out.println("\nNome: " + nome);
            System.out.println("Total de vendas: " + totalVendas);
            System.out.println("Salario: " + salario + " \n");

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?: ");
            continuar = tec.next().charAt(0);;
        }


        tec.close();
    }
}
