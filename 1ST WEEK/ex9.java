import java.util.Scanner;


public class ex9 {
    public static void main(String[] args) {

        //scanner lunghezza
        Scanner myStrScanner = new Scanner(System.in);
        String parola;

        //inserisce lunghezza
        System.out.println("Inserisci la stringa");
        parola = myStrScanner.nextLine();
        
        System.out.println("La lunghezza della stringa " + parola + " è : " + StrLenght(parola));

        myStrScanner.close();

    }

    public static int StrLenght(String str){
        return str.length();
    }
}
