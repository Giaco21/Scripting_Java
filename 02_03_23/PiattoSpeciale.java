import java.util.ArrayList;
import java.util.Scanner;

class PiattoSpeciale {
    private ArrayList<String> ingredientiPrivati = new ArrayList<String>();
    public ArrayList<String> ingredientiPubblici = new ArrayList<String>();
    private double prezzoBase = 1.0;
    private ArrayList<Double> prezziIngredienti = new ArrayList<Double>();

    public PiattoSpeciale() {
        // Inizializza la lista dei prezzi degli ingredienti
        prezziIngredienti.add(2.0); // Esempio di prezzo per il primo ingrediente privato
        prezziIngredienti.add(3.0); // Esempio di prezzo per il secondo ingrediente privato
        prezziIngredienti.add(1.5); // Esempio di prezzo per il primo ingrediente pubblico
        prezziIngredienti.add(2.0); // Esempio di prezzo per il secondo ingrediente pubblico
        // Aggiunge gli ingredienti pubblici alla lista dei possibili ingredienti
        ingredientiPubblici.add("Panino normale");
        ingredientiPubblici.add("Panino di sesamo");
    }

    public void aggiungiIngredientePrivato(String ingrediente) {
        // Aggiunge l'ingrediente privato alla lista solo se è uno dei possibili ingredienti
        if (ingrediente.equals("BACON") || ingrediente.equals("UOVO")) {
            ingredientiPrivati.add(ingrediente);
        } else {
            System.out.println("L'ingrediente selezionato non è valido.");
        }
    }

    public double calcolaPrezzo() {
        // Calcola il prezzo totale del piatto speciale sommando il prezzo base ai prezzi degli ingredienti
        double prezzoTotale = prezzoBase;
        for (String ingrediente : ingredientiPubblici) {
            int index = ingredientiPubblici.indexOf(ingrediente);
            double prezzoIngrediente = prezziIngredienti.get(index + 2);
            prezzoTotale += prezzoIngrediente;
        }
        for (String ingrediente : ingredientiPrivati) {
            int index = ingredientiPrivati.indexOf(ingrediente);
            double prezzoIngrediente = prezziIngredienti.get(index);
            prezzoTotale += prezzoIngrediente;
        }
        return prezzoTotale;
    }
}