import java.util.Scanner;

public class URI1046 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        int HoraInicio = tec.nextInt();
        int HoraFim = tec.nextInt();
        
        int DuracaoTotal = 0;
        
        if (HoraFim < HoraInicio)
            DuracaoTotal = 24 - HoraInicio + HoraFim;
        else
        {
            if (HoraInicio == HoraFim)
                DuracaoTotal = 24;
            else
                DuracaoTotal = HoraFim - HoraInicio;
        }
        
        System.out.println("O JOGO DUROU " + DuracaoTotal + " HORA(S)");

        tec.close();
    }
}
