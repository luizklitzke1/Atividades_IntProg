import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        System.out.println("Informe o curso: ");
        System.out.println("1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação");
        int Curso = input.nextInt();

        String titulo = "";
        switch (Curso)
        {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            
            case 2:
                titulo = "Licenciado em Computação";
                break;

            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;

            default:
                titulo = "Inválido";
                break;
                
        }

        System.out.println("Titulo: " + titulo);

        input.close();
    }
}
