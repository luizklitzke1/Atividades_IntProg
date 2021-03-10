import java.util.Scanner;

public class URI_1019 {

    public static void main(String[] args) throws Exception {

        Scanner tec = new Scanner(System.in);        

        int secs = tec.nextInt();

        int horas = secs / 3600;
        secs -= horas*3600;

        int mins = secs / 60;
        secs -= mins*60;

        System.out.println( horas+":"+mins+":"+secs);

        tec.close();
    }

}
