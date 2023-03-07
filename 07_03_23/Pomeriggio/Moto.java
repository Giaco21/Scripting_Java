package Pomeriggio;

public class Moto extends Veicolo{

    private int cilindrata;
    private String tipologia;
    private double potenza;

    public Moto (String marca, String modello, int annoFabbricazione, int cilindrata, String tipologia, double potenza){
        super(marca, modello, annoFabbricazione);

        this.cilindrata = cilindrata;
        this.tipologia =  tipologia;
        this.potenza = potenza;

    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }


    public String getTipologia() {
        return tipologia;
    }


    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }


    public double getPotenza() {
        return potenza;
    }


    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

}