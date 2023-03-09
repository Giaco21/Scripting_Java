package GESTIONE_ERRORI;
import java.util.Scanner;


public class Calcolatrice {
    private double operando1;
    private double operando2;

    public Calcolatrice() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il primo operando: ");
            operando1 = scanner.nextDouble();

            System.out.print("Inserisci il secondo operando: ");
            operando2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Errore: input non valido");
            operando1 = 0.0;
            operando2 = 0.0;
        }
    }

    public double somma() {
        return operando1 + operando2;
    }

    public double sottrazione() {
        return operando1 - operando2;
    }

    public double moltiplicazione() {
        return operando1 * operando2;
    }
}