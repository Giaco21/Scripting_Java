import java.util.ArrayList;
import java.util.Scanner;

public class Piatto_Speciale {
    private double prezzoBase = 1;
    private ArrayList<String> ingredientiPublic;
    private ArrayList<Double> prezziPublic;
    private ArrayList<String> ingredientiPrivate;
    private ArrayList<Double> prezziPrivate;

    public Piatto_Speciale(ArrayList<String> ingredientiPublic, ArrayList<Double> prezziPublic) {
        this.ingredientiPublic = ingredientiPublic;
        this.prezziPublic = prezziPublic;
        this.ingredientiPrivate = new ArrayList<>();
        this.prezziPrivate = new ArrayList<>();
    }

    public void addIngredientePrivate(String ingrediente, double prezzo) {
        this.ingredientiPrivate.add(ingrediente);
        this.prezziPrivate.add(prezzo);
    }

    public double calcolaPrezzo() {
        double totale = prezzoBase;
        for (int i = 0; i < ingredientiPublic.size(); i++) {
            totale += prezziPublic.get(i);
        }
        for (int i = 0; i < ingredientiPrivate.size(); i++) {
            totale += prezziPrivate.get(i);
        }
        return totale;
    }

    public void stampaIngredientiPublic() {
        System.out.println("Gli ingredienti pubblici disponibili sono:");
        for (int i = 0; i < ingredientiPublic.size(); i++) {
            System.out.println((i + 1) + ") " + ingredientiPublic.get(i) + " (" + prezziPublic.get(i) + " euro)");
        }
    }

    public void stampaIngredientiPrivate() {
        System.out.println("Gli ingredienti privati disponibili sono:");
        for (int i = 0; i < ingredientiPrivate.size(); i++) {
            System.out.println((i + 1) + ") " + ingredientiPrivate.get(i) + " (" + prezziPrivate.get(i) + " euro)");
        }
    }
}
