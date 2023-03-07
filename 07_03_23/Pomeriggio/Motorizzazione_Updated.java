package Pomeriggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Motorizzazione_Updated {

    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scannerType = new Scanner(System.in);
    private static ArrayList<Veicolo> veicoli = new ArrayList<>();
    private static boolean trovato = false;

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("Scegliere un'opzione:");
            System.out.println("1 - Aggiungi un'auto");
            System.out.println("2 - Aggiungi una moto");
            System.out.println("3 - Cerca un veicolo");
            System.out.println("0 - Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    aggiungiAuto();
                    break;
                case 2:
                    aggiungiMoto();
                    break;
                case 3:
                    cercaVeicolo();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Opzione non valida.");
                    break;
            }
        }
    }

    private static void aggiungiAuto() {
        System.out.println("Inserisci la marca dell'auto:");
        String marca = scanner.next();

        System.out.println("Inserisci il modello dell'auto:");
        String modello = scanner.next();

        System.out.println("Inserisci l'anno di fabbricazione dell'auto:");
        int annoFabbricazione = scanner.nextInt();

        System.out.println("Inserisci il numero di porte dell'auto:");
        int numeroPorte = scanner.nextInt();

        System.out.println("Inserisci il tipo di carburante dell'auto:");
        String tipoCarburante = scanner.next();

        System.out.println("Inserisci il consumo medio di carburante per 100 km dell'auto:");
        double consumoMedio = scanner.nextDouble();

        Auto auto = new Auto(marca, modello, annoFabbricazione, numeroPorte, tipoCarburante, consumoMedio);
        veicoli.add(auto);

        System.out.println("Auto aggiunta con successo.");
    }

    private static void aggiungiMoto() {
        System.out.println("Inserisci la marca della moto:");
        String marca = scanner.next();

        System.out.println("Inserisci il modello della moto:");
        String modello = scanner.next();

        System.out.println("Inserisci l'anno di fabbricazione della moto:");
        int annoFabbricazione = scanner.nextInt();

        System.out.println("Inserisci la cilindrata della moto:");
        int cilindrata = scanner.nextInt();

        System.out.println("Inserisci la tipologia della moto:");
        String tipologia = scanner.next();

        System.out.println("Inserisci la potenza della moto:");
        int potenza = scanner.nextInt();

        Moto moto = new Moto(marca, modello, annoFabbricazione, cilindrata, tipologia, potenza);
        veicoli.add(moto);
    }

    private static void cercaVeicolo() {
        System.out.println("Inserisci il tipo di veicolo da cercare\n [1]AUTO\n [2]MOTO\n:");
        int tipoVeicolo = scannerType.nextInt();

        if (tipoVeicolo == 1) {

            // Ricerca veicolo
            System.out.println("\nInserisci le caratteristiche del veicolo che vuoi cercare:");
            System.out.print("Marca: ");
            String marcaCercata = scanner.next();
            System.out.print("Modello: ");
            String modelloCercato = scanner.next();
            System.out.print("Anno di fabbricazione: ");
            int annoFabbricazioneCercato = scanner.nextInt();

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
                }

            }
        } else {
            // Ricerca veicolo
            System.out.println("\nInserisci le caratteristiche del veicolo che vuoi cercare:");
            System.out.print("Marca: ");
            String marcaCercata = scanner.next();
            System.out.print("Modello: ");
            String modelloCercato = scanner.next();
            System.out.print("Anno di fabbricazione: ");
            int annoFabbricazioneCercato = scanner.nextInt();
            for (Veicolo veicolo : veicoli) {
                if (veicolo instanceof Moto) {
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

        }

        if (!trovato) {
            System.out.println("Nessun veicolo trovato con le caratteristiche inserite.");
        }
    }
}