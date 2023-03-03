package Fibonacci_Exercises;

import java.util.Scanner;

public class MenuFibonacci {

    static int sc; // variabili
    static Scanner scelta = new Scanner(System.in); //scanner



    public static void menu() {

        System.out.println(
                "Prego inserisca una scelta\n [0]Esci\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n");
        sc = scelta.nextInt();
        switch (sc) {
            case 0:
                System.out.println("Arrivederci!");
                break;
            case 1:
                FibonacciOperations.FibonacciGenerator();
                break;
            case 2:
                FibonacciOperations.FibonacciGeneratorEvenNumber();
                break;
            case 3:
                // FibonacciFinderNmr();
                FibonacciOperations.FinderFibonacci();
                break;
            default:
                System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
                menu();
        }

    }
}