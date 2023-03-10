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
        System.out.print("Inserisci il genere del libro: ");
        String genere = scanner.nextLine();

        Biblioteca biblioteca = new Biblioteca(0);
        biblioteca.aggiungiLibro(genere);

        System.out.println("Il libro di genere " + genere + " è stato aggiunto alla biblioteca.");
    }
}