import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
        Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E,
         ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

        um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
        o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.
        */

        int pontosDireito = 0;
        int pontosEsquerdo = 0;

        char codigo = 0;

        while( !(pontosDireito >= 21 && (pontosDireito - pontosEsquerdo >= 2)) && !(pontosEsquerdo >=  21 && (pontosEsquerdo - pontosDireito >= 2)))
        {
            System.out.print("\nQuem fez ponto? (D - direita   E - esquerda): ");
            codigo = tec.next().charAt(0);

            if (codigo == 'D')
                ++pontosDireito;
            else
                ++pontosEsquerdo;

            System.out.print("Placar (D - " + pontosDireito + "| E -" + pontosEsquerdo + " )\n");
        }
        
        tec.close();
    }
}
