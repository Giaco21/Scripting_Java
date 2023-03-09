package Mattina;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Principale{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Piatto> menu = new ArrayList<>();

    boolean continua = true;
    while (continua) {
        System.out.println("Scegli un'opzione:");
        System.out.println("1. Crea un nuovo antipasto");
        System.out.println("2. Crea un nuovo primo piatto");
        System.out.println("3. Crea un nuovo secondo piatto");
        System.out.println("4. Visualizza il menu");
        System.out.println("5. Effettua un'ordinazione");
        System.out.println("6. Esci dal programma");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // consuma il carattere newline rimasto nel buffer

        switch (scelta) {
            case 1:
                Antipasto antipasto = Menu.creaAntipasto();
                menu.add(antipasto);
                System.out.println("Antipasto aggiunto al menu!");
                break;
            case 2:
                Primo primo = Menu.creaPrimo();
                menu.add(primo);
                System.out.println("Primo piatto aggiunto al menu!");
                break;
            case 3:
                Secondo secondo = Menu.creaSecondo();
                menu.add(secondo);
                System.out.println("Secondo piatto aggiunto al menu!");
                break;
            case 4:
                System.out.println("Menu:");
                for (Piatto piatto : menu) {
                    System.out.println(piatto.getNome() + " - " + piatto.getPrezzo() + "€");
                }
                break;
            case 5:
                Ordinazione ordinazione = new Ordinazione();
                boolean continuaOrdinazione = true;
                while (continuaOrdinazione) {
                    System.out.println("Scegli un piatto da ordinare:");

                    // visualizza il menu
                    System.out.println("Menu:");
                    for (Piatto piatto : menu) {
                        System.out.println(piatto.getNome() + " - " + piatto.getPrezzo() + "€");
                    }

                    int sceltaPiatto = scanner.nextInt();
                    scanner.nextLine(); // consuma il carattere newline rimasto nel buffer

                    if (sceltaPiatto < 1 || sceltaPiatto > menu.size()) {
                        System.out.println("Scelta non valida. Riprova.");
                        continue;
                    }

                    Piatto piattoScelto = menu.get(sceltaPiatto - 1);
                    ordinazione.aggiungiPiatto(piattoScelto);

                    System.out.println("Piatto aggiunto all'ordinazione!");
                    System.out.println("Vuoi aggiungere un altro piatto all'ordinazione? (s/n)");
                    String sceltaContinua = scanner.nextLine();
                    if (sceltaContinua.equalsIgnoreCase("n")) {
                        continuaOrdinazione = false;
                    }
                }

                System.out.println("Totale ordinazione: " + ordinazione.calcolaTotale() + "€");
                break;
            case 6:
                System.out.println("Grazie per aver utilizzato il nostro programma!");
                continua = false;
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                break;
        }
    }
}
}