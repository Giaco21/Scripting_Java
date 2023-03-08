package VARIE.Ristorante_Bello;

import java.util.Scanner;

public class Main_Risto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ristorante ristorante = new Ristorante();
        Ordine ordine = new Ordine();

        while (true) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Visualizza il menu");
            System.out.println("2. Aggiungi un piatto");
            System.out.println("3. Rimuovi un piatto");
            System.out.println("4. Visualizza gli ordini");
            System.out.println("5. Aggiungi un ordine");
            System.out.println("6. Rimuovi un ordine");
            System.out.println("0. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di fine linea dopo la scelta

            switch (scelta) {
                case 1:
                    ristorante.visualizzaMenu();
                    break;
                case 2:
                    ordine.aggiungiPiatto(null);
                    break;
                case 3:
                    ordine.rimuoviPiatto(1);
                    break;
                case 4:
                    ristorante.visualizzaOrdini();
                    break;
                case 5:
                    ristorante.aggiungiOrdine();
                    break;
                case 6:
                    ristorante.rimuoviOrdine();
                    break;
                case 0:
                    System.out.println("Grazie per aver utilizzato il programma.");
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
    }
}