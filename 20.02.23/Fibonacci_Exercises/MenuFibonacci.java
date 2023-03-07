package Fibonacci_Exercises;

import java.util.Scanner;

public class MenuFibonacci {

    private String MENU = "Prego inserisca una scelta\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n [4]Esci\n ";
    private String SALUT = "Arrivederci! ";
    private String ERROR = "ERRORE! SELEZIONARE UN VALORE VALIDO ";
    public void menu() {

        boolean continua = true;

        do {
            int sc = inputSelezione(MENU);

            switch (sc) {

                case 1:
                    FibonacciOperations.FibonacciGenerator(inputSelezione("Inserisci il numero di termini di Fibonacci da generare: "));

                    break;

                case 2:
                    FibonacciOperations.FibonacciGeneratorEvenNumber(inputSelezione("Inserisci il numero di termini di Fibonacci dispari da generare: "));

                    break;

                case 3:
                    FibonacciOperations.FinderFibonacci(inputSelezione("Inserisci il numero di cui vuoi trovare la posizione in Fibonacci: "));

                    break;

                case 4:
                    System.out.println(SALUT);
                    continua = false;

                    return;

                default:
                    System.out.println(ERROR);
            }
        } while (continua != false);
    }

    public int inputSelezione(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        int num = sc.nextInt();
        sc.nextLine(); // consuma il carattere di fine linea lasciato dal metodo nextInt()
        return num;
        }
}