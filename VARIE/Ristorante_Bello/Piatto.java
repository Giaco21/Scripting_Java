package VARIE.Ristorante_Bello;

public class Piatto {
    private String nome;
    private double prezzo;

    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public String toString() {
        return this.nome + " - " + this.prezzo + " euro";
    }
}