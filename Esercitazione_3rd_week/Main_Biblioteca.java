package Esercitazione_3rd_week;
import java.util.Scanner;

public class Main_Biblioteca {
    public static void main(String[] args) {
        // Creo una biblioteca con alcuni libri 
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiungiLibro(new Libro("Il Signore degli Anelli", 5));
        biblioteca.aggiungiLibro(new Libro("Harry Potter e la pietra Filosofale", 3));
        biblioteca.aggiungiLibro(new Libro("Guerra e Pace", 2));
        
        Scanner scanner = new Scanner(System.in);
        
        // Ciclo per gestire le richieste dell'utente
        while (true) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Prestare un libro");
            System.out.println("2. Restituire un libro");
            System.out.println("3. Aggiungere un libro");
            System.out.println("4. Rimuovere un libro");
            System.out.println("5. Stampare i libri disponibili");
            System.out.println("6. Esci");
            
            int scelta = scanner.nextInt();

            
            switch (scelta) {
                case 1: //PRESTARE UN LIBRO
                    System.out.println("\nQuale libro vuoi prendere in prestito?");
                    String titoloPrestato = scanner.nextLine();
                    biblioteca.prestaLibro(titoloPrestato);
                    break;
                    
                case 2: //RESTITUIRE LIBRO
                    System.out.println("\nQuale libro vuoi restituire?");
                    String titoloRestituito = scanner.nextLine();
                    biblioteca.restituisciLibro(titoloRestituito);
                    break;
                    
                case 3: //AGGIUNGERE LIBRO
                    System.out.println("\nQuale libro vuoi aggiungere?");
                    String titoloAggiunto = scanner.nextLine();
                    System.out.println("Quante copie vuoi aggiungere?");
                    int numCopieAggiunte = scanner.nextInt();

                    biblioteca.aggiungiLibro(new Libro(titoloAggiunto, numCopieAggiunte));
                    break;
                    
                case 4: //RIMUOVERE LIBRO
                    System.out.println("\nQuale libro vuoi rimuovere?");
                    String titoloRimosso = scanner.nextLine();
                    biblioteca.rimuoviLibro(titoloRimosso);
                    break;
                    
                case 5: //STAMPA LIBRI DISPONIBILI
                    System.out.println("\nI libri disponibili sono:");
                    biblioteca.stampaLibriDisponibili();
                    break;
                    
                case 6: //ADDIO
                    System.out.println("\nArrivederci!");
                    return;
                    
                default: //ERRORE
                    System.out.println("\nScelta non valida.");
            }
        }
    }
}