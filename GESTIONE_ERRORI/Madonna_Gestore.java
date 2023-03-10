package GESTIONE_ERRORI;
import java.util.ArrayList;
import java.util.Scanner;

public class Madonna_Gestore {

    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<Integer> intList = new ArrayList<>();
    private ArrayList<Double> doubleList = new ArrayList<>();

    public void inizia() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci '1' per inserire una variabile, '2' per visualizzare tutte le variabili come stringhe, o '0' per uscire: ");
            int scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il tipo di variabile: '1' per Integer, '2' per String, '3' per Double: ");
                    int tipo = input.nextInt();

                    switch (tipo) {
                        case 1:
                            System.out.println("Inserisci un intero: ");
                            try {
                                Integer intValue = input.nextInt();
                                intList.add(intValue);
                            } catch (Exception e) {
                                System.out.println("Errore di input: inserire un intero valido.");
                                input.nextLine();
                            }
                            break;
                        case 2:
                            System.out.println("Inserisci una stringa: ");
                            String stringValue = input.next();
                            stringList.add(stringValue);
                            break;
                        case 3:
                            System.out.println("Inserisci un numero decimale: ");
                            try {
                                Double doubleValue = input.nextDouble();
                                doubleList.add(doubleValue);
                            } catch (Exception e) {
                                System.out.println("Errore di input: inserire un numero decimale valido.");
                                input.nextLine();
                            }
                            break;
                        default:
                            System.out.println("Scelta non valida.");
                            break;
                    }
                    break;
                case 2:
                    ArrayList<String> tutteLeVariabili = new ArrayList<>();
                    tutteLeVariabili.add(intList.toString());
                    tutteLeVariabili.add(stringList.toString());
                    tutteLeVariabili.add(doubleList.toString());
                    System.out.println(tutteLeVariabili.toString());
                    break;
                case 0:
                    System.out.println("Uscita.");
                    return;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Madonna_Gestore gestore = new Madonna_Gestore();
        gestore.inizia();
    }
}