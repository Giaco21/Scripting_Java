package Mattina;

import java.util.ArrayList;

public class Ordinazione {
    private ArrayList<Piatto> piatti;
    
    public Ordinazione() {
        piatti = new ArrayList<Piatto>();
    }
    
    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }
    
    public double calcolaTotale() {
        double totale = 0;
        for (Piatto piatto : piatti) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }
}