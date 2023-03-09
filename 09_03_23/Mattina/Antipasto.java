package Mattina;

public class Antipasto extends Piatto {

    public Antipasto(String nome, String[] ingredienti, double prezzo, String chef) {
        super(nome, ingredienti, prezzo, chef);
    }

    @Override
    public void setIngredienti(String[] ingredienti) {
        super.setIngredienti(ingredienti);
    }
}