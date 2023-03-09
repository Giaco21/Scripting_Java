package GESTIONE_ERRORI;

public class second_error {
    private Calcolatrice calcolatrice;
    private double[] risultati;
    private int indiceRisultati;

    public second_error() {
        calcolatrice = new Calcolatrice();
        risultati = new double[4];
        indiceRisultati = 0;
    }

    public void mostraMenu() {
        System.out.println("Scegli un'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
    }

    public void eseguiOperazione(int scelta) {
        double risultato = 0.0;

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
                System.out.println("Operazione non valida");
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