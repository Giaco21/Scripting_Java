package Mattina;

public class Secondo extends Piatto {

    public Secondo(String nome, String[] ingredienti, double prezzo, String chef) {
        super(nome, ingredienti, prezzo, chef);
    }

    @Override
    public void setIngredienti(String[] ingredienti) {
        super.setIngredienti(ingredienti);
    }
}