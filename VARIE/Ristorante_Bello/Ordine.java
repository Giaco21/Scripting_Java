package VARIE.Ristorante_Bello;
import java.util.ArrayList;

public class Ordine {
    private ArrayList<Piatto> piatti;
    private double totale;

    public Ordine() {
        this.piatti = new ArrayList<Piatto>();
        this.totale = 0.0;
    }

    public void aggiungiPiatto(Piatto piatto) {
        this.piatti.add(piatto);
        this.totale += piatto.getPrezzo();
    }

    public void rimuoviPiatto(int indice) {
        Piatto piatto = this.piatti.get(indice);
        this.piatti.remove(indice);
        this.totale -= piatto.getPrezzo();
    }

    public double getTotale() {
        return this.totale;
    }

    public String toString() {
        String descrizione = "";
        for (int i = 0; i < this.piatti.size(); i++) {
            descrizione += this.piatti.get(i).getNome() + "\n";
        }
        return descrizione;
    }
}