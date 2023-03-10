import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private int numeroLibri;
    private ArrayList<Libro> libri;

    public Biblioteca(int numeroLibri) {
        this.numeroLibri = numeroLibri;
        this.libri = new ArrayList<>();
    }

    public void aggiungiLibro(String genere) {
        // Controllo se esiste già un libro di questo genere nella biblioteca
        for (Libro libro : libri) {
            if (libro.getGenere().equals(genere)) {
                libro.incrementaQuantita();
                System.out.println("Il libro di genere " + genere + " è stato aggiunto alla biblioteca. \n" +
                        "Ci sono ora " + libro.getQuantita() + " copie di questo libro nella biblioteca.\n");
                return;
            }
        }
    
        // Se il genere del libro non è già presente nella biblioteca, creo un nuovo libro
        Libro libro = new Libro(genere);
        libri.add(libro);
        numeroLibri++;
        System.out.println("Il libro di genere " + genere + " è stato aggiunto alla biblioteca. \n" +
                "Ci sono ora " + libro.getQuantita() + " copie di questo libro nella biblioteca.\n");
    }

    public int getNumeroLibri() {
        return numeroLibri;
    }

    public void setNumeroLibri(int numeroLibri) {
        this.numeroLibri = numeroLibri;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public class Libro {
        private String genere;
        private int quantita;
    
        public Libro(String genere) {
            this.genere = genere;
            this.quantita = 1;
        }
    
        public String getGenere() {
            return genere;
        }
    
        public void setGenere(String genere) {
            this.genere = genere;
        }
    
        public int getQuantita() {
            return quantita;
        }
    
        public void incrementaQuantita() {
            this.quantita++;
        }

        public void print(){
            System.out.println("Sono il libro!\n");
        }
    }
    public void MostraLibro(){
        Libro libretto = new Libro(null);
        libretto.print();
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(0);

        boolean continua = true;
        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Aggiungi un libro");
            System.out.println("2. Visualizza i libri presenti nella biblioteca");
            System.out.println("3. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il genere del libro: ");
                    String genere = scanner.nextLine();
                    biblioteca.aggiungiLibro(genere);
                    System.out.println("Il libro di genere " + genere + " è stato aggiunto alla biblioteca.");
                    break;
                case 2:
                    System.out.println("I libri presenti nella biblioteca sono:");
                    ArrayList<Biblioteca.Libro> libri = biblioteca.getLibri();
                    for (Biblioteca.Libro libro : libri) {
                        System.out.println("- " + libro.getGenere());
                    }
                    break;
                case 3:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}