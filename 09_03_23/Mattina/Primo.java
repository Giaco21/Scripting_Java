package Mattina;

public class Primo extends Piatto {

    public Primo(String nome, String[] ingredienti, double prezzo, String chef) {
        super(nome, ingredienti, prezzo, chef);
    }

    @Override
    public void setIngredienti(String[] ingredienti) {
        super.setIngredienti(ingredienti);
    }
}