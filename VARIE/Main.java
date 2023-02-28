import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static class Motore {
        int ci;
        int pi;

        public int setCilindrata() {
            int ci;
            ci = (int) (Math.random() * 500);
            return ci;
        }
    }

    public static class Freni {
        int pf;
        int ne;

        public int setPotenzaFrenante() {
            int pf;
            pf = (int) (Math.random() * 500);
            return pf;
        }
    }

    public static class Macchina {
        Motore motore;
        Freni freni;
        String targa;
    }

    public static void main(String[] args) {

        Scanner scannerRispostaMenu = new Scanner(System.in);
        Scanner nPistoni = new Scanner(System.in);
        Scanner nPastiglie = new Scanner(System.in);
        int rispostaMenu;


        do {
            System.out.println("Vuoi creare una nuova macchina?");
            System.out.println("[1] Si");
            System.out.println("[2] No");
            rispostaMenu = scannerRispostaMenu.nextInt();

            if (rispostaMenu == 1) {

                Motore motoreCreato = new Motore();
                motoreCreato.ci = motoreCreato.setCilindrata();
                System.out.println("Inserisci il numero di pistoni");
                motoreCreato.pi = nPistoni.nextInt();

                Freni freniCreati = new Freni();
                freniCreati.pf = freniCreati.setPotenzaFrenante();
                System.out.println("Inserisci il numero di pastiglie");
                freniCreati.ne = nPastiglie.nextInt();

               Macchina macchinaCreata = new Macchina();
                macchinaCreata.motore = motoreCreato;
                macchinaCreata.freni = freniCreati;
                macchinaCreata.targa = setTarga();

                System.out.println("----------Motore----------");
                System.out.println("Cilindrata:" + macchinaCreata.motore.ci);
                System.out.println("Pistoni: " + macchinaCreata.motore.pi);
                System.out.println("----------Freni----------");
                System.out.println("Potenza frenante :" + macchinaCreata.freni.pf);
                System.out.println("Pastiglie: " + macchinaCreata.freni.ne);
                System.out.println("----------targa----------");
                System.out.println("Targa macchina :" + macchinaCreata.targa);
            }

        } while (rispostaMenu == 2);

    }

    public static String setTarga() {
        String targa = "";
        Scanner randomTarga = new Scanner(System.in);
        System.out.println("Scegli un numero da 1 a 5");
        int randTarga = randomTarga.nextInt();
        switch (randTarga) {
            case 1 : targa = "FB123BD";
            case 2 : targa = "RT233FG";
            case 3 : targa = "PL092RT";
            case 4 : targa = "GB276WS";
            case 5 : targa = "YH263SC";
        }
        return targa;
    }
}