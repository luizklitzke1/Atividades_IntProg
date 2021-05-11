import java.util.Scanner;

public class LuizGustavoKlitzke_2 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite as três notas:");

        double primeiraNota = tec.nextDouble();
        double segundaNota = tec.nextDouble();
        double terceiraNota = tec.nextDouble();

        double notaBaixa = primeiraNota;
        double notaMedia = segundaNota;
        double notaAlta = terceiraNota;

        if (primeiraNota > segundaNota)
        {
            if (terceiraNota > primeiraNota)
            {
                notaAlta = terceiraNota;
                notaMedia = primeiraNota;
                notaBaixa = segundaNota;
            }
            else if (segundaNota > terceiraNota)
            {
                notaAlta = primeiraNota;
                notaMedia = segundaNota;
                notaBaixa = terceiraNota;
            }
            else
            {
                notaAlta = primeiraNota;
                notaMedia = terceiraNota;
                notaBaixa = segundaNota;
            }
        }
        else if (segundaNota > primeiraNota )
        {
            if (terceiraNota > segundaNota)
            {
                notaAlta = terceiraNota;
                notaMedia = segundaNota;
                notaBaixa = primeiraNota;
            }
            else if (primeiraNota > terceiraNota)
            {
                notaAlta = segundaNota;
                notaMedia = primeiraNota;
                notaBaixa = terceiraNota;
            }
            else
            {
                notaAlta = segundaNota;
                notaMedia = terceiraNota;
                notaBaixa = primeiraNota;
            }
        }
        else if (terceiraNota > primeiraNota)
        {
            if (segundaNota > terceiraNota)
            {
                notaAlta = segundaNota;
                notaMedia = terceiraNota;
                notaBaixa = primeiraNota;
            }
            else if (segundaNota > primeiraNota)
            {
                notaAlta = terceiraNota;
                notaMedia = segundaNota;
                notaBaixa = primeiraNota;
            }
            else
            {
                notaAlta = terceiraNota;
                notaMedia = primeiraNota;
                notaBaixa = segundaNota;
            }
        }

        notaBaixa += 0.1;
        notaMedia += 0.2;
        notaAlta += 0.3;

        System.out.println("_Menu");
        System.out.println("a) média simples");
        System.out.println("b) média ponderada");

        char opcao = tec.next().charAt(0);
        opcao = Character.toUpperCase(opcao);

        switch (opcao)
        {
            case 'A':
                double mediaSimples = (notaBaixa + notaMedia + notaAlta) / 3;
                System.out.println("O valor da média simples do aluno: " + mediaSimples);
                break;

            case 'B':
                double mediaPonderada = (notaBaixa * 0.7) + (notaMedia * 0.1) + (notaAlta * 0.2);
                System.out.println("O valor da média ponderada do aluno: " + mediaPonderada);
                break;

            default:
                System.out.println("Valor inválido do Menu");
                break;
        }

        tec.close();
    }
}
