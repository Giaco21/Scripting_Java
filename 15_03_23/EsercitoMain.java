import java.util.ArrayList;
import java.util.Scanner;

public class EsercitoMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Esercito esercito = new Esercito();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            stampaMenu();
            int scelta;
            try {
                scelta = Integer.parseInt(scanner.next());
                switch (scelta) {
                    case 1:
                        aggiungiSoldato();
                        break;
                    case 2:
                        visualizzaSoldati();
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Scelta non valida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero corretto!");
            }
        }
        System.out.println("Arrivederci!");
    }

    private static void stampaMenu() {
        System.out.println("BENVENUTO NELL'ESERCITO!");
        System.out.println("1. Inserire un soldato");
        System.out.println("2. Visualizza i soldati");
        System.out.println("3. Esci");
    }

    private static void aggiungiSoldato() {
        System.out.println("INSERISCI UN SOLDATO");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Cognome: ");
        String cognome = scanner.next();
        int dataNascita = chiediAnno("Anno di nascita");
        boolean forzeSpeciali = chiediForzeSpeciali();
        if (forzeSpeciali) {
            String specializzazione = chiediSpecializzazione();
            int annoInizio = chiediAnnoInizio(dataNascita);
            esercito.creaSoldato(nome + " " + cognome, Integer.toString(dataNascita), true);
            Esercito.SoldatoForzeSpeciali soldato = (Esercito.SoldatoForzeSpeciali) esercito.getSoldati().get(esercito.getNumeroSoldati() - 1);
            soldato.setSpecializzazione(specializzazione);
            soldato.setAnnodoInizio(Integer.toString(annoInizio));
        } else {
            esercito.creaSoldato(nome + " " + cognome, Integer.toString(dataNascita), false);
        }
        System.out.println("Soldato aggiunto con successo!");
    }

    private static boolean chiediForzeSpeciali() {
        while (true) {
            try {
                System.out.print("È nelle forze speciali? (S/N): ");
                String risposta = scanner.next();
                if (risposta.equalsIgnoreCase("S")) {
                    return true;
                } else if (risposta.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    System.out.println("Inserisci S o N!");
                }
            } catch (Exception e) {
                System.out.println("Inserimento non valido!");
            }
        }
    }

    private static String chiediSpecializzazione() {
        System.out.print("Specializzazione: ");
        return scanner.next();
    }

    private static int chiediAnno(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                int anno = scanner.nextInt();
                if (anno < 1900) {
                    throw new IllegalArgumentException("L'anno non può essere inferiore a 1900.");
                }
                return anno;
            } catch (Exception e) {
                System.out.println("Inserire un anno valido!");
                scanner.nextLine();
            }
        }
    }
    
    private static int chiediAnnoInizio(int annoNascita) {
        while (true) {
            try {
                System.out.print("Anno di inizio attività: ");
                int annoInizio = scanner.nextInt();
                if (annoInizio <= annoNascita) {
                    throw new IllegalArgumentException("L'anno di inizio attività deve essere successivo all'anno di nascita.");
                }
                if (annoInizio - annoNascita < 18) {
                    throw new IllegalArgumentException("L'anno di inizio attività deve essere almeno 18 anni dopo l'anno di nascita.");
                }
                return annoInizio;
            } catch (Exception e) {
                System.out.println("Inserire un anno valido!");
                scanner.nextLine();
            }
        }
    }
    private static void visualizzaSoldati() {
        int numeroSoldati = esercito.getNumeroSoldati();
        if (numeroSoldati == 0) {
            System.out.println("Non ci sono soldati disponibili!");
            return;
        }
    
        System.out.println("SOLDATI DISPONIBILI:");
        ArrayList<Esercito.Soldato> soldati = esercito.getSoldati();
        for (Esercito.Soldato soldato : soldati) {
            System.out.println(soldato.getNome() + " (" + soldato.getDataNascita() + ")");
            if (soldato instanceof Esercito.SoldatoForzeSpeciali) {
                Esercito.SoldatoForzeSpeciali soldatoForzeSpeciali = (Esercito.SoldatoForzeSpeciali) soldato;
                System.out.println("- Specializzazione: " + soldatoForzeSpeciali.getSpecializzazione());
                System.out.println("- Anno di inizio attività: " + soldatoForzeSpeciali.getAnnodoInizio());
            }
            System.out.println();
        }
    }
}