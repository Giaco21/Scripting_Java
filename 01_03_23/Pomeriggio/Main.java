package Pomeriggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Utente> utentiRegistrati = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continua = true;
        do {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Registrati");
            System.out.println("2. Accedi");
            System.out.println("3. Esci");
            int scelta = input.nextInt();
            input.nextLine(); // Consuma il carattere di fine linea rimasto nel buffer di input

            switch (scelta) {
                case 1:
                    registrati();
                    break;
                case 2:
                    accedi();
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        } while (continua);
    }

    private static void registrati() {
        System.out.print("Inserisci il nome utente: ");
        String nomeUtente = input.nextLine();
        if (utenteEsiste(nomeUtente)) {
            System.out.println("Il nome utente è già stato preso");
            return;
        }
        System.out.print("Inserisci la password: ");
        String password = input.nextLine();
        Utente nuovoUtente = new Utente(nomeUtente, password);
        utentiRegistrati.add(nuovoUtente);
        System.out.println("Registrazione avvenuta con successo");
    }

    private static void accedi() {
        System.out.print("Inserisci il nome utente: ");
        String nomeUtente = input.nextLine();
        Utente utente = getUtente(nomeUtente);
        if (utente == null) {
            System.out.println("Utente non trovato");
            return;
        }
        System.out.print("Inserisci la password: ");
        String password = input.nextLine();
        
        if (utente.verificaPassword(password)) {
            System.out.println("Accesso effettuato con successo");
            GestioneRistorante.main(null);
            // Aggiungi qui il codice per il menu dell'utente loggato
        } else {
            System.out.println("Password errata");
        }
    }

    private static boolean utenteEsiste(String nomeUtente) {
        for (Utente utente : utentiRegistrati) {
            if (utente.getNomeUtente().equals(nomeUtente)) {
                return true;
            }
        }
        return false;
    }

    private static Utente getUtente(String nomeUtente) {
        for (Utente utente : utentiRegistrati) {
            if (utente.getNomeUtente().equals(nomeUtente)) {
                return utente;
            }
        }
        return null;
    }
    }