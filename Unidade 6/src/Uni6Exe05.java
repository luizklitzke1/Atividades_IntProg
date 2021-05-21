import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe05{

    private void lerValoresVetor(String vetor[], Scanner teclado) 
    {
        System.out.println("Responda com SIM, NÃO ou IND (indiferente)\n");

        System.out.print("Gosta de música sertaneja? ");
        vetor[0] = teclado.next();

        System.out.print("Gosta de futebol? ");
        vetor[1] = teclado.next();

        System.out.print("Gosta de seriados? ");
        vetor[2] = teclado.next();

        System.out.print("Gosta de redes sociais? ");
        vetor[3] = teclado.next();

        System.out.print("Gosta da Oktoberfest? ");
        vetor[4] = teclado.next();
    }

    private double calculaAfinidade(String respostasRapaz[], String respostasMoca[]) 
    {   
        double afinidade = 0;

        for (int idx = 0; idx < respostasRapaz.length; idx++) 
        {
            if (respostasRapaz[idx].equals(respostasMoca[idx]))
                afinidade += 3;
            else if ((respostasRapaz[idx].equals("IND") && !respostasMoca[idx].equals("IND")) ||
                     (respostasMoca[idx].equals("IND") && !respostasRapaz[idx].equals("IND")))
                afinidade++;    
            else if ((respostasRapaz[idx].equals("NÃO") && respostasMoca[idx].equals("SIM")) ||
                     (respostasMoca[idx].equals("NÃO") && respostasRapaz[idx].equals("SIM"))) 
                afinidade -= 2;  
        }
        
        return afinidade;
    }
    
    private Uni6Exe05() 
    {
        Scanner tec = new Scanner(System.in);

        String respostasRapaz[] = new String[5];
        String respostasMoca[] = new String[5];

        System.out.println("Informe as repostas do rapaz: ");
        lerValoresVetor(respostasRapaz, tec);

        System.out.println("Informe as respostas da moça: ");
        lerValoresVetor(respostasMoca, tec);

        double afinidade = calculaAfinidade(respostasRapaz, respostasMoca);

        if (afinidade == 15)
            System.out.println("Casem!");
        else if (afinidade >= 10 && afinidade <= 14)
            System.out.println("Vocês têm muita coisa em comum!");
        else if (afinidade >= 5 && afinidade <= 9)
            System.out.println("Talvez não dê certo :(");
        else if (afinidade >= 0 && afinidade <= 4)
            System.out.println("Vale um encontro.");
        else if (afinidade <= -1 && afinidade >= -9)
            System.out.println("Melhor não perder tempo");
        else if (afinidade == -10)
            System.out.println("Vocês se odeiam!");

        tec.close();
    }

    public static void main(String[] args) 
    {
        new Uni6Exe05();
    }
}
