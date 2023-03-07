package Pomeriggio;

public class Auto extends Veicolo{
    private int numPorte;
    private String tipoCarburante;
    private double consumoMedio;

    public Auto (String marca, String modello, int annoFabbricazione, int numPorte, String tipoCarburante, double consumoMedio) {

        super(marca, modello, annoFabbricazione);

        this.numPorte = numPorte;
        this.tipoCarburante = tipoCarburante;
        this.consumoMedio = consumoMedio;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}