package GESTIONE_ERRORI;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Gestore gestore = new Gestore();
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;
        while (continua) {
            System.out.println("Inserisci 1 per aggiungere una variabile, 2 per visualizzare tutte le variabili come stringhe, 0 per uscire:");
            int scelta = -1;
            try {
                scelta = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Inserisci un numero valido.");
                scanner.nextLine();
                continue;
            }

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci 1 per inserire una variabile di tipo int, 2 per una variabile di tipo String, 3 per una variabile di tipo double:");
                    int tipo = -1;
                    try {
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Inserisci un numero valido.");
                        scanner.nextLine();
                        continue;
                    }

                    System.out.println("Inserisci il valore della variabile:");
                    switch (tipo) {
                        case 1:
                            Integer intero = null;
                            try {
                                intero = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Inserisci un numero valido.");
                                scanner.nextLine();
                                continue;
                            }
                            gestore.aggiungi(intero);
                            break;
                        case 2:
                            String stringa = scanner.nextLine();
                            gestore.aggiungi(stringa);
                            break;
                        case 3:
                            Double decimale = null;
                            try {
                                decimale = scanner.nextDouble();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Inserisci un numero valido.");
                                scanner.nextLine();
                                continue;
                            }
                            gestore.aggiungi(decimale);
                            break;
                        default:
                            System.out.println("Tipo non riconosciuto.");
                            break;
                    }
                    break;
                case 2:
                    ArrayList<String> stringhe = gestore.getStringhe();
                    System.out.println(stringhe);
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }
}

class Gestore {
    private ArrayList<Object> variabili;

    public Gestore() {
        variabili = new ArrayList<>();
    }

    public void aggiungi(Integer variabile) {
        variabili.add(variabile);
    }

    public void aggiungi(String variabile) {
        variabili.add(variabile);
    }

    public void aggiungi(Double variabile) {
        variabili.add(variabile);
    }

    public ArrayList<String> getStringhe() {
        ArrayList<String> stringhe = new ArrayList<>();
        for (Object variabile : variabili) {
            stringhe.add(variabile.toString());
        }
        return stringhe;
    }
}