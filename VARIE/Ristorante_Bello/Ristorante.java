package VARIE.Ristorante_Bello;
import java.util.ArrayList;
import java.util.Scanner;

public class Ristorante {
    private ArrayList<Piatto> menu;
    private ArrayList<Ordine> ordini;

    public Ristorante() {
        this.menu = new ArrayList<Piatto>();
        this.ordini = new ArrayList<Ordine>();
        inizializzaMenu();
    }

    private void inizializzaMenu() {
        this.menu.add(new Piatto("Margherita", 5.0));
        this.menu.add(new Piatto("Diavola", 7.5));
        this.menu.add(new Piatto("Capricciosa", 8.0));
        this.menu.add(new Piatto("Quattro stagioni", 8.5));
        this.menu.add(new Piatto("Bufalina", 6.5));
        this.menu.add(new Piatto("Marinara", 5.5));
    }

    public void visualizzaMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < this.menu.size(); i++) {
            System.out.println((i + 1) + ". " + this.menu.get(i).toString());
        }
    }

    public void aggiungiOrdine() {
        Ordine ordine = new Ordine();
        Scanner scanner = new Scanner(System.in);
        int scelta;
        do {
            visualizzaMenu();
            System.out.print("Inserisci il numero del piatto da aggiungere (0 per terminare l'ordine): ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di fine linea dopo la scelta
            if (scelta >= 1 && scelta <= this.menu.size()) {
                ordine.aggiungiPiatto(this.menu.get(scelta - 1));
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
        if (ordine.getTotale() > 0) {
            this.ordini.add(ordine);
            System.out.println("Ordine aggiunto.");
        } else {
            System.out.println("Ordine vuoto.");
        }
    }

    public void rimuoviOrdine() {
        Scanner scanner = new Scanner(System.in);
        visualizzaOrdini();
        System.out.print("Inserisci il numero dell'ordine da rimuovere: ");
        int scelta = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di fine linea dopo la scelta
        if (scelta >= 1 && scelta <= this.ordini.size()) {
            this.ordini.remove(scelta - 1);
            System.out.println("Ordine rimosso.");
        } else {
            System.out.println("Scelta non valida.");
        }
    }

    public void visualizzaOrdini() {
        if (this.ordini.size() == 0) {
            System.out.println("Nessun ordine presente.");
        } else {
            for (int i = 0; i < this.ordini.size(); i++) {
                System.out.println((i + 1) + ". " + this.ordini.get(i).toString() + "Totale: " + this.ordini.get(i).getTotale() + " euro\n");
            }
        }
    }
}