import java.util.ArrayList;
import java.util.Scanner;

public class RegistratoreDiIngressiMain {
    
    public static void main(String[] args) {

        menuRegistratoreDiIngressi();

    }


    public static void menuRegistratoreDiIngressi(){

        Scanner scelta = new Scanner(System.in);
        Scanner nameAnimal = new Scanner(System.in);
        Scanner etaAnimal = new Scanner(System.in);
        Scanner animal = new Scanner(System.in);

        ArrayList<Felino> felini = new ArrayList<>();
        ArrayList<Canide> canidi = new ArrayList<>();
        ArrayList<Anfibio> anfibi = new ArrayList<>();
        ArrayList<Roditore> roditori = new ArrayList<>();
        
        boolean continua = true;
        while (continua) {
            System.out.println("Vuoi registrare un animale? [s/n]");
            String risposta = scelta.nextLine();
            if (risposta.equals("s")) {
                System.out.println("Che tipo di animale vuoi registrare? [Felino/Canide/Anfibio/Roditore]");
                String tipoAnimale = animal.nextLine();

                if (tipoAnimale.equals("Felino")) {
                    System.out.println("Inserisci il nome del felino:");
                    String nome = nameAnimal.nextLine();
                    System.out.println("Inserisci l'età del felino:");
                    int eta = etaAnimal.nextInt();

                    felini.add(new Felino(nome, eta));

                } else if (tipoAnimale.equals("Canide")) {
                    System.out.println("Inserisci il nome del canide:");
                    String nome = nameAnimal.nextLine();
                    System.out.println("Inserisci l'età del canide:");
                    int eta = etaAnimal.nextInt();

                    canidi.add(new Canide(nome, eta));

                } else if (tipoAnimale.equals("Anfibio")) {
                    System.out.println("Inserisci il nome dell'anfibio:");
                    String nome = nameAnimal.nextLine();
                    System.out.println("Inserisci l'età dell'anfibio:");
                    int eta = etaAnimal.nextInt();

                    anfibi.add(new Anfibio(nome, eta));

                } else if (tipoAnimale.equals("Roditore")) {
                    System.out.println("Inserisci il nome del roditore:");
                    String nome = nameAnimal.nextLine();
                    System.out.println("Inserisci l'età del roditore:");
                    int eta = etaAnimal.nextInt();

                    roditori.add(new Roditore(nome, eta));
                } else {
                    System.out.println("Tipo di animale non riconosciuto.");
                }
            } else if (risposta.equals("n")) {
                continua = false;
            } else {
                System.out.println("Risposta non riconosciuta.");
            }
        }        
        
        System.out.println("Animali registrati:");

        System.out.println("Felini: " + felini.size());
        for (Felino felino : felini) {
            System.out.println(felino.getNome() + " (età: " + felino.getEta() + ")");
        }

        System.out.println("Canidi: " + canidi.size());
        for (Canide canide : canidi) {
            System.out.println(canide.getNome() + " (età: " + canide.getEta() + ")");
        }

        System.out.println("Anfibio: " + anfibi.size());
        for (Anfibio anfibio : anfibi) {
            System.out.println(anfibio.getNome() + " (età: " + anfibio.getEta() + ")");
        }

        System.out.println("Roditori: " + anfibi.size());
        for (Roditore roditore : roditori) {
            System.out.println(roditore.getNome() + " (età: " + roditore.getEta() + ")");
        }
    }
}