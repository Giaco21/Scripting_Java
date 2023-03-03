package Esercitazione_3rd_week;

public class Libro {
    private String titolo;
    private int numCopieDisponibili;
    private int numCopieInPrestito;
    
    public Libro(String titolo, int numCopieDisponibili) {
        this.titolo = titolo;
        this.numCopieDisponibili = numCopieDisponibili;
        this.numCopieInPrestito = 0;
    }
    
    public String getTitolo() {
        return titolo;
    }
    
    public int getNumCopieDisponibili() {
        return numCopieDisponibili;
    }
    
    public void setNumCopieDisponibili(int numCopieDisponibili) {
        this.numCopieDisponibili = numCopieDisponibili;
    }
        
    public int getNumCopieInPrestito() {
            return numCopieInPrestito;
    }
        
    public void setNumCopieInPrestito(int numCopieInPrestito) {
            this.numCopieInPrestito = numCopieInPrestito;
    }

    public void presta() {
        if (numCopieDisponibili > 0) {
            numCopieDisponibili--;
            numCopieInPrestito++;
            System.out.println("Hai preso in prestito il libro " + titolo + ".");
        } else {
            System.out.println("Siamo spiacenti, non ci sono copie disponibili del libro " + titolo + ".");
        }
    }
    public void restituisci() {
        if (numCopieInPrestito > 0) {
            numCopieDisponibili++;
            numCopieInPrestito--;
            System.out.println("Hai restituito il libro " + titolo + ".");
        } else {
            System.out.println("Non puoi restituire il libro " + titolo + " perché non lo hai preso in prestito.");
        }
    }
}