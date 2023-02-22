import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ristorante_Prob {

    private static ArrayList<String> menu = new ArrayList<>();
    private static ArrayList<Double> prezzi = new ArrayList<>();
    private static int numUtenti = 0;
    private static double totaleSpeso = 0.0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            System.out.println("Benvenuto al nostro ristorante! Cosa desideri fare?");
            System.out.println("1. Inserisci un nuovo utente");
            System.out.println("2. Visualizza il menu");
            System.out.println("3. Ordina un piatto");
            System.out.println("4. Esci");
            int scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    inserisciUtente();
                    break;
                case 2:
                    visualizzaMenu();
                    break;
                case 3:
                    ordinaPiatto();
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }
    }
    
    private static void inserisciUtente() {
        numUtenti++;
        Random rand = new Random();
        double credito = rand.nextDouble() * 50 + 10; // credito random tra 10 e 60 euro
        System.out.println("Inserisci il nome dell'utente:");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Benvenuto, " + nome + "! Il tuo credito è di " + credito + " euro.");
    }
    
    private static void visualizzaMenu() {
        if (menu.size() == 0) {
            System.out.println("Il menu è vuoto");
            return;
        }
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + ". " + menu.get(i) + " - " + prezzi.get(i) + " euro");
        }
    }
    
    private static void ordinaPiatto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Il suo credito residuo è di: " + creditoRimanente());
        System.out.println("Quale piatto desideri ordinare? Inserisci il numero corrispondente.");
        visualizzaMenu();
        int scelta = input.nextInt();
        if (scelta < 1 || scelta > menu.size()) {
            System.out.println("Scelta non valida");
            return;
        }
        double prezzo = prezzi.get(scelta - 1);
        if (prezzo > creditoRimanente()) {
            System.out.println("Mi dispiace, non hai abbastanza credito per ordinare questo piatto");
            return;
        }
        totaleSpeso += prezzo;
        String nomePiatto = menu.get(scelta - 1);
        System.out.println("Hai ordinato un " + nomePiatto + " al prezzo di " + prezzo + " euro.");
    }
    
    private static double creditoRimanente() {
        return (numUtenti * 50) - totaleSpeso;
    }

    static {
        menu.add("Panino con prosciutto e formaggio");
        prezzi.add(5.0);
        menu.add("Panino con tonno e maionese");
        prezzi.add(6.0);
        menu.add("Hamburger con patatine");
        prezzi.add(8.0);
        menu.add("Pizza margherita");
        prezzi.add(7.5);
    }
}