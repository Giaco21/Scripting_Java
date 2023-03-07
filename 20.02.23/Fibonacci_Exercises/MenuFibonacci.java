package Fibonacci_Exercises;

import java.util.Scanner;

public class MenuFibonacci {

    public void menu() {

        boolean continua = true;

        do {
            int sc = inputSelezione(
                    "Prego inserisca una scelta\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n [4]Esci\n");

            switch (sc) {

                case 1:
                    FibonacciOperations.FibonacciGenerator();

                    break;

                case 2:
                    FibonacciOperations.FibonacciGeneratorEvenNumber();

                    break;

                case 3:
                    FibonacciOperations.FinderFibonacci();

                    break;

                case 4:
                    System.out.println("Arrivederci!");
                    continua = false;

                    return;

                default:
                    System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
            }
        } while (continua != false);
    }

    public int inputSelezione(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        int num = sc.nextInt();
        sc.close();
        return num;

    }

}