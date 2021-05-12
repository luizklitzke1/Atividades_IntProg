import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        /*
       Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva
       um algoritmo para informar a média de cada aluno. Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
        */
        String nomeAluno;

        double primeiraNota = 0;
        double segundaNota = 0;

        System.out.print("Informe o nome do aluno: ");
        nomeAluno = tec.next();

        while (!nomeAluno.equals("fim"))
        {
            System.out.print("Informe a primeira nota: ");
            primeiraNota = tec.nextDouble();

            System.out.print("Informe a segunda nota: ");
            segundaNota = tec.nextDouble();

            System.out.println("A media do aluno é: " + (primeiraNota + segundaNota) / 2);

            System.out.print("Informe o nome do aluno: ");
            nomeAluno = tec.next();
        }
        
        tec.close();
    }
}
