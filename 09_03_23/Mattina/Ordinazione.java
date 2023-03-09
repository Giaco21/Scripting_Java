package Mattina;
import java.util.ArrayList;

public class Ordinazione extends ArrayList<Piatto> {
    private ArrayList<Piatto> piatti;
    protected double totale = 0;

    public Ordinazione() {
        piatti = new ArrayList<Piatto>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    public double calcolaTotale() {
        for (Piatto piatto : piatti) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }
    
    public double getTotale() {
        return totale;
    }
}