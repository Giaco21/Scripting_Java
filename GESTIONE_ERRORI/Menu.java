package GESTIONE_ERRORI;
import java.util.InputMismatchException;

public class Menu {
    private Calcolatrice calcolatrice;
    private double[] risultati;
    private int indiceRisultati;

    public Menu() {
        calcolatrice = new Calcolatrice();
        risultati = new double[4];
        indiceRisultati = 0;
    }

    public void eseguiOperazione(int scelta) {
        double risultato = 0.0;

        try {
            switch(scelta) {
                case 1:
                    risultato = calcolatrice.somma();
                    break;
                case 2:
                    risultato = calcolatrice.sottrazione();
                    break;
                case 3:
                    risultato = calcolatrice.moltiplicazione();
                    break;
                default:
                    throw new InputMismatchException("Operazione non valida");
            }
        } catch (InputMismatchException e) {
            System.out.println("Errore: " + e.getMessage());
            return;
        }

        if (indiceRisultati == risultati.length) {
            System.out.println("Limite di risultati raggiunto");
            return;
        }

        risultati[indiceRisultati++] = risultato;

        System.out.println("Risultato: " + risultato);
    }
}
