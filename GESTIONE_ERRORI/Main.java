package GESTIONE_ERRORI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Esci");

            try {
                int scelta = scanner.nextInt();

                if (scelta == 4) {
                    break;
                }

                menu.eseguiOperazione(scelta);
            } catch (Exception e) {
                System.out.println("Errore: input non valido");
                scanner.nextLine();
            }
        }
    }
}