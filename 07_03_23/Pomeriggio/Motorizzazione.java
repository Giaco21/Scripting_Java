package Pomeriggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Motorizzazione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Veicolo> veicoli = new ArrayList<>();

        // Inserimento delle auto
        System.out.print("Inserisci il numero di auto che vuoi inserire: ");
        int numAuto = input.nextInt();

        for (int i = 0; i < numAuto; i++) {
            System.out.println("Inserisci i dati dell'auto " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = input.next();
            System.out.print("Modello: ");
            String modello = input.next();
            System.out.print("Anno di fabbricazione: ");
            int annoFabbricazione = input.nextInt();
            System.out.print("Numero di porte: ");
            int numeroPorte = input.nextInt();
            System.out.print("Tipo di carburante: ");
            String tipoCarburante = input.next();
            System.out.print("Consumo medio di carburante per 100 km: ");
            double consumoMedio = input.nextDouble();

            Auto auto = new Auto(marca, modello, annoFabbricazione, numeroPorte, tipoCarburante, consumoMedio);
            veicoli.add(auto);
        }

        // Inserimento delle moto
        System.out.print("Inserisci il numero di moto che vuoi inserire: ");
        int numMoto = input.nextInt();

        for (int i = 0; i < numMoto; i++) {
            System.out.println("Inserisci i dati della moto " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = input.next();
            System.out.print("Modello: ");
            String modello = input.next();
            System.out.print("Anno di fabbricazione: ");
            int annoFabbricazione = input.nextInt();
            System.out.print("Cilindrata: ");
            int cilindrata = input.nextInt();
            System.out.print("Tipologia (sportiva, stradale, etc.): ");
            String tipologia = input.next();
            System.out.print("Potenza: ");
            int potenza = input.nextInt();

            Moto moto = new Moto(marca, modello, annoFabbricazione, cilindrata, tipologia, potenza);
            veicoli.add(moto);
        }

        // Ricerca veicolo
        System.out.println("\nInserisci le caratteristiche del veicolo che vuoi cercare:");
        System.out.print("Marca: ");
        String marcaCercata = input.next();
        System.out.print("Modello: ");
        String modelloCercato = input.next();
        System.out.print("Anno di fabbricazione: ");
        int annoFabbricazioneCercato = input.nextInt();

        boolean trovato = false;

        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Auto) {
                Auto auto = (Auto) veicolo;
                if (auto.getMarca().equals(marcaCercata) &&
                        auto.getModello().equals(modelloCercato) &&
                        auto.getAnnoFabbricazione() == annoFabbricazioneCercato) {
                    System.out.println("Auto trovata:");
                    System.out.println("Marca: " + auto.getMarca());
                    System.out.println("Modello: " + auto.getModello());
                    System.out.println("Anno di fabbricazione: " + auto.getAnnoFabbricazione());
                    System.out.println("Numero di porte: " + auto.getNumPorte());
                    System.out.println("Tipo di carburante: " + auto.getTipoCarburante());
                    System.out.println("Consumo medio di carburante per 100 km: " + auto.getConsumoMedio());
                    trovato = true;
                    break;
                }
            } else if (veicolo instanceof Moto) {
                Moto moto = (Moto) veicolo;
                if (moto.getMarca().equals(marcaCercata) &&
                        moto.getModello().equals(modelloCercato) &&
                        moto.getAnnoFabbricazione() == annoFabbricazioneCercato) {
                    System.out.println("Moto trovata:");
                    System.out.println("Marca: " + moto.getMarca());
                    System.out.println("Modello: " + moto.getModello());
                    System.out.println("Anno di fabbricazione: " + moto.getAnnoFabbricazione());
                    System.out.println("Cilindrata: " + moto.getCilindrata());
                    System.out.println("Tipologia: " + moto.getTipologia());
                    System.out.println("Potenza: " + moto.getPotenza());
                    trovato = true;
                    break;
                }
            }
        }

        if (!trovato) {
            System.out.println("Nessun veicolo trovato con le caratteristiche inserite.");
        }
    }
}