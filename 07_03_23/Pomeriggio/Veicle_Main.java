package Pomeriggio;

public class Veicle_Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "Panda", 2020, 5, "Benzina", 6.0);
        Auto auto2 = new Auto("Ford", "Focus", 2018, 5, "Diesel", 4.5);
        Moto moto1 = new Moto("Ducati", "Monster", 2021, 821, "Sportiva", 109);
        Moto moto2 = new Moto("BMW", "R 1250 GS", 2022, 1254, "Fuoristrada", 136);

        System.out.println("Auto 1:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Anno di fabbricazione: " + auto1.getAnnoFabbricazione());
        System.out.println("Numero di porte: " + auto1.getNumPorte());
        System.out.println("Tipo di carburante: " + auto1.getTipoCarburante());
        System.out.println("Consumo medio per 100 km: " + auto1.getConsumoMedio());

        System.out.println();

        System.out.println("Auto 2:");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modello: " + auto2.getModello());
        System.out.println("Anno di fabbricazione: " + auto2.getAnnoFabbricazione());
        System.out.println("Numero di porte: " + auto2.getNumPorte());
        System.out.println("Tipo di carburante: " + auto2.getTipoCarburante());
        System.out.println("Consumo medio per 100 km: " + auto2.getConsumoMedio());

        System.out.println();

        System.out.println("Moto 1:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Modello: " + moto1.getModello());
        System.out.println("Anno di fabbricazione: " + moto1.getAnnoFabbricazione());
        System.out.println("Cilindrata: " + moto1.getCilindrata());
        System.out.println("Tipologia: " + moto1.getTipologia());
        System.out.println("Potenza: " + moto1.getPotenza());

        System.out.println();

        System.out.println("Moto 2:");
        System.out.println("Marca: " + moto2.getMarca());
        System.out.println("Modello: " + moto2.getModello());
        System.out.println("Anno di fabbricazione: " + moto2.getAnnoFabbricazione());
        System.out.println("Cilindrata: " + moto2.getCilindrata());
        System.out.println("Tipologia: " + moto2.getTipologia());
        System.out.println("Potenza: " + moto2.getPotenza());
    }
}