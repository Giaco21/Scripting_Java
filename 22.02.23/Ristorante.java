import java.util.Random;
import java.util.Scanner;

public class Ristorante {

    // Variabili per tenere conto dei dati del ristorante
    private static int numUtenti = 0;
    private static double totaleSpeso = 0.0;
    private static double budgetPerUtente = 20.0; // budget iniziale

    // Dati sui piatti del ristorante
    private static String[][] piatti = {
            { "Panino con prosciutto e formaggio", "Prosciutto, formaggio", "5.0" },
            { "Panino con pollo e avocado", "Pollo, avocado", "7.0" },
            { "Panino vegetariano", "Pomodoro, mozzarella, rucola", "6.5" },
            { "Panino con salmone", "Salmone affumicato, cream cheese", "8.0" }
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Ordina");
            System.out.println("2. Visualizza");
            System.out.println("3. Modifica");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    ordina(scanner);
                    break;
                case 2:
                    visualizza();
                    break;
                case 3:
                    modifica(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

        scanner.close();
    }

    private static void ordina(Scanner scanner) {

        System.out.println("Inserisci il nome utente:");
        String nomeUtente = scanner.next();

        // Assegna un credito random all'utente
        Random random = new Random();
        double credito = random.nextDouble() * budgetPerUtente;

        System.out.printf("Benvenuto, %s. Hai a disposizione %.2f euro\n", nomeUtente, credito);

        // Stampa i piatti disponibili
        for (int i = 0; i < piatti.length; i++) {
            System.out.printf("%d. %s (%s): %.2f euro\n", i + 1, piatti[i][0], piatti[i][1],
                    Double.parseDouble(piatti[i][2]));
        }

        System.out.println("Scegli un piatto (inserisci il numero corrispondente):");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > piatti.length) {
            System.out.println("Scelta non valida");
            return;
        }

        // Prende il prezzo del piatto scelto
        double prezzo = Double.parseDouble(piatti[scelta - 1][2]);

        if (prezzo > credito) {
            System.out.println("Credito insufficiente");
            return;
        }

        // Aggiorna i dati del ristorante
        numUtenti++;
        totaleSpeso += prezzo;
        budgetPerUtente -= prezzo;

        System.out.printf("Hai acquistato %s per %.2f euro. Buon appetito!\n", piatti[scelta - 1][0], prezzo);
        System.out.printf("Numero utenti: %d\n", numUtenti);
        System.out.printf("Totale speso: %.2f euro\n", totaleSpeso);
        System.out.printf("Budget rimanente per utente: %.2f euro\n", budgetPerUtente);
    }

    private static void visualizza() {
        // Stampa i piatti disponibili
        for (int i = 0; i < piatti.length; i++) {
            System.out.printf("%d. %s (%s): %.2f euro\n", i + 1, piatti[i][0], piatti[i][1],
                    Double.parseDouble(piatti[i][2]));
        }
    }

    private static void modifica(Scanner scanner) {
        System.out.println("Scegli un'opzione:");
        System.out.println("1. Aggiungi un piatto");
        System.out.println("2. Modifica un piatto");
        System.out.println("3. Elimina un piatto");

        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                // Aggiunge un nuovo piatto
                System.out.println("Inserisci il nome del piatto:");
                String nomePiatto = scanner.next();

                System.out.println("Inserisci gli ingredienti del piatto (separati da virgola):");
                String ingredienti = scanner.next();

                System.out.println("Inserisci il prezzo del piatto:");
                double prezzo = scanner.nextDouble();

                // Crea un nuovo array piatti con un elemento in più
                String[][] nuoviPiatti = new String[piatti.length + 1][3];

                // Copia gli elementi di piatti in nuoviPiatti
                for (int i = 0; i < piatti.length; i++) {
                    nuoviPiatti[i][0] = piatti[i][0];
                    nuoviPiatti[i][1] = piatti[i][1];
                    nuoviPiatti[i][2] = piatti[i][2];
                }

                // Aggiunge il nuovo piatto
                nuoviPiatti[piatti.length][0] = nomePiatto;
                nuoviPiatti[piatti.length][1] = ingredienti;
                nuoviPiatti[piatti.length][2] = String.valueOf(prezzo);

                // Sostituisce l'array piatti con il nuovo array
                piatti = nuoviPiatti;

                System.out.println("Piatto aggiunto:");
                System.out.printf("%s (%s): %.2f euro\n", nomePiatto, ingredienti, prezzo);
                break;

            case 2:
                // Modifica un piatto esistente
                System.out.println("Inserisci il numero del piatto che vuoi modificare:");
                int numeroPiatto = scanner.nextInt();

                if (numeroPiatto < 1 || numeroPiatto > piatti.length) {
                    System.out.println("Scelta non valida");
                    return;
                }

                // Modifica il nome del piatto
                System.out.println("Inserisci il nuovo nome del piatto:");
                piatti[numeroPiatto - 1][0] = scanner.next();

                // Modifica gli ingredienti del piatto
                System.out.println("Inserisci i nuovi ingredienti del piatto (separati da virgola):");
                scanner.nextLine();
                piatti[numeroPiatto - 1][1] = scanner.nextLine();

                System.out.println("Inserisci il nuovo prezzo del piatto:");
                piatti[numeroPiatto - 1][2] = String.valueOf(scanner.nextDouble());

                System.out.println("Piatto modificato:");
                System.out.printf("%s (%s): %.2f euro\n", piatti[numeroPiatto - 1][0], piatti[numeroPiatto - 1][1],
                        Double.parseDouble(piatti[numeroPiatto - 1][2]));
                break;

            case 3:
                // Elimina un piatto esistente
                System.out.println("Inserisci il numero del piatto che vuoi eliminare:");
                numeroPiatto = scanner.nextInt();

                if (numeroPiatto < 1 || numeroPiatto > piatti.length) {
                    System.out.println("Scelta non valida");
                    return;
                }

                // Crea un nuovo array piatti con un elemento in meno
                nuoviPiatti = new String[piatti.length - 1][3];

                // Copia gli elementi di piatti in nuoviPiatti, escluso quello da eliminare
                int j = 0;
                for (int i = 0; i < piatti.length; i++) {
                    if (i != numeroPiatto - 1) {
                        nuoviPiatti[j][0] = piatti[i][0];
                        nuoviPiatti[j][1] = piatti[i][1];
                        nuoviPiatti[j][2] = piatti[i][2];
                        j++;
                    }
                }

                // Sostituisce l'array piatti con il nuovo array
                piatti = nuoviPiatti;

                System.out.println("Piatto eliminato");
                break;

            default:
                System.out.println("Scelta non valida");
                return;
        }
    }
}