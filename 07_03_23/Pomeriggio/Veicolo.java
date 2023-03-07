package Pomeriggio;

public class Veicolo {
    private String marca;
    private String modello;
    private int annoFabbricazione;

    public Veicolo(String marca, String modello, int annoFabbricazione) {
        this.marca = marca;
        this.modello = modello;
        this.annoFabbricazione = annoFabbricazione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnnoFabbricazione() {
        return annoFabbricazione;
    }

    public void setAnnoFabbricazione(int annoFabbricazione) {
        this.annoFabbricazione = annoFabbricazione;
    }
}