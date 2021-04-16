import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uni4Exe14.java - Leia uma data e determine se ela é válida. Ou seja,
         * verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que
         * fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.
         */

        System.out.println("Informe o dia: ");
        int dia = tec.nextInt();

        System.out.println("Informe o mes: ");
        int mes = tec.nextInt();

        System.out.println("Informe o ano: ");
        int ano = tec.nextInt();

        boolean EhBisexto = false;
        boolean DataValida = true;

        if (mes < 1 || mes > 12)
        {
            System.out.println("Mês inválido informado!");
        }
        else
        {
            if (mes == 2)
            {
                if (ano % 4 == 0) {
                    if (ano % 100 == 0) 
                    {
                        if (ano % 400 == 0)
                            EhBisexto = true;
                        else
                            EhBisexto = false;
                    }
                    else
                        EhBisexto = true;
                }
                else
                    EhBisexto = false;

                if ((EhBisexto && dia > 29) || (!EhBisexto && dia > 28))
                {
                    System.out.println("Dia inválido informado!");
                    DataValida = false;

                }
            }
            else
            {
                if (((mes < 8 && mes % 2 != 0) || (mes > 7 && mes % 2 == 0)) && dia > 31)
                {
                    System.out.println("Dia jonas informado!");
                    DataValida = false;
       
                }
                else if (dia > 30)
                {
                    System.out.println("Dia inválido informado!");
                    DataValida = false;
                }
            }
        }

        if (DataValida)
        {
            System.out.println("A data é válida!");
        }
        else
        {
            System.out.println("A data NÃO é válida!");
        }
        
        tec.close();
    }
}
