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
                            System.out.println("Inserisci un tipo valido.");
                            break;
                    }
                    break;
                case 2:
                    ArrayList<String> stringhe = gestore.getStringhe();
                    for (String stringa : stringhe) {
                        System.out.println(stringa);
                    }
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Inserisci una scelta valida.");
                    break;
            }
        }
        scanner.close();
    }
}

class Gestore {
    private ArrayList<Integer> interi;
    private ArrayList<String> stringhe;
    private ArrayList<Double> decimali;

    public Gestore() {
        interi = new ArrayList<>();
        stringhe = new ArrayList<>();
        decimali = new ArrayList<>();
    }

    public void aggiungi(Integer variabile) {
        interi.add(variabile);
    }

    public void aggiungi(String variabile) {
        stringhe.add(variabile);
    }

    public void aggiungi(Double variabile) {
        decimali.add(variabile);
    }

    public ArrayList<String> getStringhe() {
        ArrayList<String> risultato = new ArrayList<>();
        for (Integer intero : interi) {
            risultato.add(intero.toString());
        }
        for (String stringa : stringhe) {
            risultato.add(stringa);
        }
        for (Double decimale : decimali) {
            risultato.add(decimale.toString());
        }
        return risultato;
    }
}