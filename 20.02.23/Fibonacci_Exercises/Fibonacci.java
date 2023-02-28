package Fibonacci_Exercises;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class Fibonacci {

    public static void main(String[] args) {
          // ---------------- TEST JDBC --------------
String DB_URL = "jdbc:mysql://localhost:3306/world";
String DB_USERNAME = "root";
String DB_PASSWORD = "Cucina21";

try {
  Connection myConnection = null;
  myConnection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

  if(myConnection==null){
    System.out.println("CONNESSIONE NON STABILITA\n");
  } System.out.println("CONNESSIONE AVVENUTA CON SUCCESSO\n");

} catch (SQLException e) {
  e.printStackTrace();
}
//------------------------------------------
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Scegli una opzione:\n[0] Esci\n[1] Genera la serie di Fibonacci\n[2] Genera solo numeri dispari della serie di Fibonacci\n[3] Trova se un numero appartiene alla serie di Fibonacci");
            try {
                choice = input.nextInt();
                switch (choice) {
                    case 0:
                        System.out.println("Arrivederci!");
                        break;
                    case 1:
                        System.out.print("Inserisci la lunghezza della serie di Fibonacci: ");
                        int count = input.nextInt();
                        System.out.print("Serie di Fibonacci: ");
                        for (int i = 0; i < count; i++) {
                            System.out.print(fibonacci(i) + " ");
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Inserisci la lunghezza della serie di Fibonacci: ");
                        count = input.nextInt();
                        System.out.print("Numeri dispari della serie di Fibonacci: ");
                        for (int i = 0; i < count; i++) {
                            int num = fibonacci(i);
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case 3:
                        FinderFibonacci();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserimento non valido, riprova");
                input.nextLine(); // scarta l'input non valido
            }
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

/*     public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x); 
        return (s * s == x);
    }

    public static boolean isFibonacci(int x) {
        return isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4);
    }
 */

 public static void FinderFibonacci(){
    Scanner input = new Scanner(System.in);
    System.out.print("Inserisci un numero: " );
    int num = input.nextInt();

    int p1 = 0;
    int p2 = 1;
    int p = p1+p2;
    boolean flog = false;
    for (int i = 0; i <= num; i++){
        if (p == num){
            flog = true;
            break;
        }
        if (p > num) break;
        p1 = p2;
        p2 = p;
        p = p1+p2;
    }
    if(flog == false){
        System.out.println(num + " non appartiene alla serie di Fibonacci");
    }else System.out.println(num + " appartiene alla serie di Fibonacci");

}
}