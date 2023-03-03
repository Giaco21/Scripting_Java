package Esercitazione_3rd_week;

public class Libro {
    private String titolo;
    private int numCopieDisponibili;
    private int numCopieInPrestito;
    
    //costruttore Libro
    public Libro(String titolo, int numCopieDisponibili) {
        this.titolo = titolo;
        this.numCopieDisponibili = numCopieDisponibili;
        this.numCopieInPrestito = 0;
    }
    
    //metodo pubblico per avere il Titolo privato
    public String getTitolo() {
        return titolo;
    }
      //metodo pubblico per avere il numero di copie disponibili 
    public int getNumCopieDisponibili() {
        return numCopieDisponibili;
    }
      //metodo pubblico per settare il numero di copie disponibili 
    public void setNumCopieDisponibili(int numCopieDisponibili) {
        this.numCopieDisponibili = numCopieDisponibili;
    }
    //metodo pubblico per avere il numero di copie in prestito privato
    public int getNumCopieInPrestito() {
            return numCopieInPrestito;
    }
    //metodo pubblico per settare il numero di copie in prestito privato
    public void setNumCopieInPrestito(int numCopieInPrestito) {
            this.numCopieInPrestito = numCopieInPrestito;
    }
    //metodo che diminuisce il numero di copie disponibili quando richiamato e aumenta il numero di copie in prestito
    public void presta() {
        if (numCopieDisponibili > 0) {
            numCopieDisponibili--;
            numCopieInPrestito++;
            System.out.println("Hai preso in prestito il libro " + titolo + ".");
        } else {
            System.out.println("Siamo spiacenti, non ci sono copie disponibili del libro " + titolo + ".");
        }
    }
    //metodo che fa l'esatto opposto del metodo presta()
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