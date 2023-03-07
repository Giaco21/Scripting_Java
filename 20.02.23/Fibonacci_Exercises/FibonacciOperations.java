package Fibonacci_Exercises;

public class FibonacciOperations {

    static MenuFibonacci myMenu = new MenuFibonacci();

    public static void FibonacciGenerator() {

        int num = myMenu.inputSelezione("Inserisci il numero di termini di Fibonacci da generare: ");

        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);// printing 0 and 1

        for (i = 2; i < num; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public static void FibonacciGeneratorEvenNumber() {

        int num = myMenu.inputSelezione("Inserisci il numero di termini di Fibonacci dispari da generare: ");

        int n1 = 0, n2 = 1, n3, i, count = 0;
        System.out.print(n1 + " " + n2);// printing 0 and 1
        count = 2;

        for (i = 2; count < num; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 % 2 == 0)
                continue;
            count++;
            System.out.print(" " + n3);
        }
        System.out.println();
    }

    public static void FinderFibonacci() {

        int num = myMenu.inputSelezione("Inserisci il numero di cui vuoi trovare la posizione in Fibonacci: ");

        int n1 = 0, n2 = 1, n3, i = 0;

        if (num == n1 || num == n2) {
            System.out.println(num + " è il " + (num == n1 ? "1°" : "2°") + " numero di Fibonacci");
            return;
        }

        do {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
            if (n3 == num) {
                System.out.println(num + " è il " + (i + 2) + "° numero di Fibonacci");
                return;
            }
        } while (n3 <= num);

        System.out.println(num + " non è un numero di Fibonacci");
    }
}