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
        Libro libro = new Libro(genere);
        libri.add(libro);
        numeroLibri++;
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

        public Libro(String genere) {
            this.genere = genere;
        }

        public String getGenere() {
            return genere;
        }

        public void setGenere(String genere) {
            this.genere = genere;
        }
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