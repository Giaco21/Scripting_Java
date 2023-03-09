package Mattina;

public class Piatto {
    private String nome;
    private String[] ingredienti;
    private double prezzo;
    private String chef;

    public Piatto(String nome, String[] ingredienti, double prezzo, String chef) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
        this.chef = chef;
    }

    public String getNome() {
        return nome;
    }

    public String[] getIngredienti() {
        return ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getChef() {
        return chef;
    }

    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return nome + " (" + chef + ") - " + prezzo + " euro";
    }
}