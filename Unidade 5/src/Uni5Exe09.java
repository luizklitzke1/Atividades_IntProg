import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);

        /*
         * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
            escreva os nomes dos alunos que tem 18 anos;
            escreva a quantidade de alunos que tem idade acima de 20 anos.
         */

        System.out.print("Informe a quantidad de alunos na turma: ");
        int quantidadeAlunos = tec.nextInt();

        String nomeAluno;
        int idadeAluno = 0;

        String alunosCom18 = "";
        int quantidadeAcimaDe20 = 0;

        for (int idx = 0; idx < quantidadeAlunos; idx++)
        {
            System.out.print("[" + (idx + 1) + "] Informe o nome do aluno: ");
            nomeAluno = tec.next();

            System.out.print("[" + (idx + 1) + "] Informe a idade do aluno: ");
            idadeAluno = tec.nextInt();

            if (idadeAluno == 18)
                alunosCom18 += " " + nomeAluno;
            
            if (idadeAluno > 20)
                quantidadeAcimaDe20++;
            
            System.out.print("\n");

        }

        System.out.println("Alunos com 18 anos:" + alunosCom18);
        System.out.println("Quantidade de alunos acima de 20 anos: " + quantidadeAcimaDe20);

        tec.close();
    }
}
