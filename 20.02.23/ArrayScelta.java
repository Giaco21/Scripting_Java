import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScelta {
    // Variabili e Scanners
    static String s;
    static int selezione, n;

    static Scanner myObj = new Scanner(System.in);
    static Scanner myObj1 = new Scanner(System.in);

    static Integer arrN[] = { 1, 2, 3, 4, 5, 6 };
    static String arr[] = { "Ciao", "Hello", "Salut" };

    static boolean uscita = false;

    public static void main(String[] arg) {
        Menu();
    }

    public static void Menu() {

        // Inizio ciclo col do while (Verrà eseguito ALMENO una volta)

        do {

            // prima selezione se inserire / visualizare / uscire

            System.out.println(
                    "Vuoi inserire o visualizzare l'array?\n [1]INSERIMENTO\n [2]VISUALIZZAZIONE\n [0]USCITA ");
            System.out.println(
                    "NOTA BENE! SE SI SCEGLIE DI INSERIRE IL VALORE INSERITO SARA' INSERITO NELL'ULTIMA POSIZIONE DELL'ARRAY\n");
            selezione = myObj.nextInt();

            Switcherino();
        } while (uscita != true); // la variabile la controlla se vera sempre, ma solo nel caso del case: 0 viene
                                  // resa vera e quindi rompe il loop
    }

    public static void Switcherino() {
        switch (selezione) {

            // case 1 se inserire sull'array di stringa o interi/ 1=string 2=int
            case 1:
                Stampa();
                selezione = myObj.nextInt();
                if (selezione == 1) {
                    System.out.println("Inserire la stringa");
                    s = myObj1.nextLine();
                    ArrayList<String> arrayListS = new ArrayList<String>(Arrays.asList(arr));
                    arrayListS.add(s);
                    arr = arrayListS.toArray(arr);
                } else {
                    System.out.println("inserire l'int");
                    n = myObj1.nextInt();
                    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arrN));
                    arrayList.add(n);
                    arrN = arrayList.toArray(arrN);
                }
                break;
            // case 2 se visualizzare l'array di stringa o intero/ 1=string 2=int
            case 2:
                Stampa();
                selezione = myObj.nextInt();
                if (selezione == 1) {
                    System.out.println("l'array stringa è\n" + Arrays.toString(arr));
                } else {
                    System.out.println("l'array stringa è\n" + Arrays.toString(arrN));
                }
                break;

            // uscita dal programma
            case 0:
                uscita = true;
                break;
            // Se non inserisce nessuno dei 3 numeri da inserimento errato e ripete la
            // selezione iniziale
            default:
                System.out.println("Inserimento errato");
        }
    }

    public static void Stampa() {
        System.out.println("1=String  2=int");
    }
}