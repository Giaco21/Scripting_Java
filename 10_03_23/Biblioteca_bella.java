import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca_bella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        Utenteee utente = new Utenteee("Ambarabaciccicocco", "ambara123", 1);

        boolean isLogged = false;
        while (!isLogged) {
            System.out.print("Inserisci la password per effettuare il login: ");
            String password = scanner.nextLine();
            if (utente.confermaPassword(password)) {
                isLogged = true;
                System.out.println("Accesso effettuato");
            } else {
                System.out.println("Password errata");
            }
        }

        boolean continua = true;
        while (continua) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Visualizza elenco libri");
            System.out.println("2. Prendi in prestito un libro");
            System.out.println("3. Restituisci un libro");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    // Visualizzazione dell'elenco dei libri presenti in libreria
                    ArrayList<Libreria.Libro> elencoLibri = libreria.getElencoLibri();
                    for (Libreria.Libro libro : elencoLibri) {
                        System.out.println("Genere: " + libro.getGenere() + ", Disponibile: " + !libro.isInPrestito());
                    }
                    break;
                case 2:
                    // Prestito di un libro da parte dell'utente
                    System.out.print("Inserisci il genere del libro che vuoi prendere in prestito: ");
                    String genereLibroDaPrendereInPrestito = scanner.nextLine();
                    Libreria.Libro libroDaPrendereInPrestito = libreria
                            .cercaLibroPerGenere(genereLibroDaPrendereInPrestito);
                    if (libroDaPrendereInPrestito != null) {
                        if (libroDaPrendereInPrestito.isInPrestito()) {
                            System.out.println("Il libro non è disponibile");
                        } else {
                            libreria.prendiInPrestitoLibro(utente, libroDaPrendereInPrestito);
                            System.out.println("Libro " + libroDaPrendereInPrestito.getGenere()
                                    + " preso in prestito da " + utente.getNome());
                        }
                    } else {
                        System.out.println("Il libro richiesto non esiste");
                    }
                    break;
                case 3:
                    // Restituzione di un libro da parte dell'utente
                    Libreria.Libro libroInPrestito = libreria.cercaLibroInPrestito(utente);
                    if (libroInPrestito != null) {
                        libreria.restituisciLibro(utente, libroInPrestito);
                        System.out
                                .println("Libro " + libroInPrestito.getGenere() + " restituito da " + utente.getNome());
                    } else {
                        System.out.println("Non hai alcun libro in prestito");
                    }
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }
}
