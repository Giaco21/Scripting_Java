import java.util.ArrayList;
import java.util.Scanner;

public class EsercitoMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Esercito esercito = new Esercito();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            stampaMenu();
            int scelta = scanner.nextInt();
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
        System.out.print("Anno di nascita: ");
        String dataNascita = scanner.next();
        boolean forzeSpeciali = chiediForzeSpeciali();
        if (forzeSpeciali) {
            String specializzazione = chiediSpecializzazione();
            String annodoInizio = chiediAnnodoInizio();
            esercito.creaSoldato(nome + " " + cognome, dataNascita, true);
            Esercito.SoldatoForzeSpeciali soldato = (Esercito.SoldatoForzeSpeciali) esercito.getSoldati().get(esercito.getNumeroSoldati() - 1);
            soldato.setSpecializzazione(specializzazione);
            soldato.setAnnodoInizio(annodoInizio);
        } else {
            esercito.creaSoldato(nome + " " + cognome, dataNascita, false);
        }
        System.out.println("Soldato aggiunto con successo!");
    }

    private static boolean chiediForzeSpeciali() {
        System.out.print("È nelle forze speciali? (S/N): ");
        return scanner.next().equalsIgnoreCase("S");
    }

    private static String chiediSpecializzazione() {
        System.out.print("Specializzazione: ");
        return scanner.next();
    }

    private static String chiediAnnodoInizio() {
        System.out.print("Anno di inizio attività: ");
        return scanner.next();
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