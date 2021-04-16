import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Uni4Exe18.java - Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 
        o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento 
        o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
        Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, 
        exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
        */

        System.out.println("Informe o dia do vencimento");
        int DiaDoVencimento = tec.nextInt();

        System.out.println("Informe o dia do pagamento");
        int DiaDoPagamento = tec.nextInt();

        System.out.println("Informe o valor da prestação");
        double ValorDaPrestacao = tec.nextDouble();

        int Atraso = DiaDoPagamento - DiaDoVencimento;

        if (Atraso < 1)
        {
            System.out.println("O pagamento está em dia!");
            ValorDaPrestacao = ValorDaPrestacao * .9;
        }
        else if (Atraso <= 5)
        {
            System.out.println("Feito com até 5 dias! Perdeu o desconto...");
        }
        else
        {
            System.out.println("Feito após 5 dias! Taxa de 2% ao dia.");
            ValorDaPrestacao = ValorDaPrestacao * (1 + ((double)(Atraso - 5) / 100) * 2);
        }

        System.out.println("Valor da prestação: " + ValorDaPrestacao);

        tec.close();
    }
}
