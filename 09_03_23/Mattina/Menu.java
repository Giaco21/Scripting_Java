package Mattina;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Antipasto creaAntipasto() {
        Scanner scannerAntipasto = new Scanner(System.in);

        System.out.println("Inserisci il nome dell'antipasto:");
        String nome = scannerAntipasto.nextLine();
    
        System.out.println("Inserisci gli ingredienti dell'antipasto (separati da virgola):");
        String ingredientiString = scannerAntipasto.nextLine();
        String[] ingredienti = ingredientiString.split(",");
    
        System.out.println("Inserisci il prezzo dell'antipasto:");
        double prezzo = scannerAntipasto.nextDouble();
        scannerAntipasto.nextLine();
    
        System.out.println("Inserisci il nome dello chef che ha creato l'antipasto:");
        String chef = scannerAntipasto.nextLine();
    
        Antipasto antipasto = new Antipasto(nome, ingredienti, prezzo, chef);
        return antipasto;
    }
    
    public static Primo creaPrimo() {
        Scanner scannerPrimo = new Scanner(System.in);
    
        System.out.println("Inserisci il nome del primo piatto:");
        String nome = scannerPrimo.nextLine();
    
        System.out.println("Inserisci gli ingredienti del primo piatto (separati da virgola):");
        String ingredientiString = scannerPrimo.nextLine();
        String[] ingredienti = ingredientiString.split(",");
    
        System.out.println("Inserisci il prezzo del primo piatto:");
        double prezzo = scannerPrimo.nextDouble();
        scannerPrimo.nextLine();
    
        System.out.println("Inserisci il nome dello chef che ha creato il primo piatto:");
        String chef = scannerPrimo.nextLine();
    
        Primo primo = new Primo(nome, ingredienti, prezzo, chef);
        return primo;
    }
    
    public static Secondo creaSecondo() {
        Scanner scannerSecondo = new Scanner(System.in);
    
        System.out.println("Inserisci il nome del secondo:");
        String nome = scannerSecondo.nextLine();
    
        System.out.println("Inserisci gli ingredienti del secondo (separati da virgola):");
        String ingredientiString = scannerSecondo.nextLine();
        String[] ingredienti = ingredientiString.split(",");
    
        System.out.println("Inserisci il prezzo del secondo:");
        double prezzo = scannerSecondo.nextDouble();
        scannerSecondo.nextLine();
    
        System.out.println("Inserisci il nome dello chef che ha creato il secondo:");
        String chef = scannerSecondo.nextLine();
    
        Secondo secondo = new Secondo(nome, ingredienti, prezzo, chef);
        return secondo;
    }

    public static ArrayList<Piatto> creaMenu() {
        ArrayList<Piatto> menu = new ArrayList<>();
        menu.add(creaAntipasto());
        menu.add(creaPrimo());
        menu.add(creaSecondo());
        // aggiungere altri piatti al menu se necessario
        return menu;
    }
    
    public static void mostraMenu() {
        ArrayList<Piatto> menu = creaMenu();
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i+1) + ". " + menu.get(i));
        }
    }
    
    public static Piatto scegliPiatto(int numeroPiatto) {
        ArrayList<Piatto> menu = creaMenu();
        if (numeroPiatto < 1 || numeroPiatto > menu.size()) {
            return null;
        }
        return menu.get(numeroPiatto - 1);
    }
}