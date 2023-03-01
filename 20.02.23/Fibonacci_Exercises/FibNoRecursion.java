package Fibonacci_Exercises;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FibNoRecursion {
  static int n1 = 0, n2 = 1, n3, i, count = 0, sc; // variabili
  static Scanner contator = new Scanner(System.in); // scanner
  static Scanner scelta = new Scanner(System.in);

  public static void main(String args[]) {

    // ---------------- TEST JDBC --------------
    String DB_URL = "jdbc:mysql://localhost:3306/world";
    String DB_USERNAME = "root";
    String DB_PASSWORD = "Cucina21";

    try {
      Connection myConnection = null;
      myConnection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

      if (myConnection == null) {
        System.out.println("CONNESSIONE NON STABILITA\n");
      }
      System.out.println("CONNESSIONE AVVENUTA CON SUCCESSO\n");
      // Prova lettura dal DB
      String QUERY =("SELECT C.name, CL.Language, CL.Percentage as perc from country as C inner join countrylanguage as Cl on C.Code = CL.CountryCode LIMIT 5;");
      Statement stm = myConnection.createStatement();
      ResultSet rss = stm.executeQuery(QUERY);
      while (rss.next()) {
        String tableFormat = String.format("NAME: %s LANGUAGE: %s PERCENTUALE: %s",
            rss.getString(1),
            rss.getString(2),
            rss.getString(3));
        System.out.println(tableFormat);
      }stm.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    // ------------------------------------------

    menu();
  }

  public static void FibonacciGeneratorEvenNumber() {
    System.out.println("Prego inserisca il numero a cui far terminare la serie di Fibonacci: \n");
    count = contator.nextInt();

    System.out.print(n1 + " " + n2);// printing 0 and 1

    for (i = 2; i < count; ++i)// il loop inizia da 2 perchè 0 e 1 vengono già stampati
    {

      n3 = n1 + n2;
      if (n3 % 2 != 0) {
        System.out.print(" " + n3);
      }
      n1 = n2;
      n2 = n3;
    }
    // reclusion
    contator.close();
  }

  public static void FibonacciGenerator() {
    System.out.println("Prego inserisca il numero a cui far terminare la serie di Fibonacci: \n");
    count = contator.nextInt();

    System.out.print(n1 + " " + n2);// printing 0 and 1

    for (i = 2; i < count; ++i)// il loop inizia da 2 perchè 0 e 1 vengono già stampati
    {

      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    // reclusion
    contator.close();
  }

  // Questi 3 metodi usano l'algebra per effettuare controlli aggiuntivi sui
  // numeri della serie. Ho preferito inserirli tutti e due ma ho scelto di usare
  // quello più "base"

  /*
   * public static void FibonacciFinderNmr(){
   * 
   * Scanner scan = new Scanner(System.in);
   * System.out.print("Input a number: ");
   * int n = scan.nextInt();
   * if (n>0)
   * {
   * if(isFibonacci(n) == true){
   * System.out.
   * println("Il numero inserito e' un numero della serie di Fibonacci\n");
   * 
   * }else System.out.
   * println("Il numero inserito non e' un numero della serie di Fibonacci\n");
   * 
   * }
   * }
   */

  /*
   * public static boolean isPerfectSquare(int x)
   * {
   * int s = (int) Math.sqrt(x);
   * return (s*s == x);
   * }
   */

  /*
   * public static boolean isFibonacci(int x)
   * {
   * return isPerfectSquare(5*x*x + 4) || isPerfectSquare(5*x*x - 4);
   * }
   */

  public static void FinderFibonacci() {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num = input.nextInt();

    int p1 = 0;
    int p2 = 1;
    int p = p1 + p2;
    boolean flog = false;
    for (int i = 0; i <= num; i++) {
      if (p == num) {
        flog = true;
        break;
      }
      if (p > num)
        break;
      p1 = p2;
      p2 = p;
      p = p1 + p2;
    }
    if (flog == false) {
      System.out.println("Il numero inserito non fa parte della serie di Fibonacci\n");
    } else
      System.out.println("Il numero inserito fa parte della serie di Fibonacci\n");
      input.close();

  }

  public static void menu() {

    System.out.println(
        "Prego inserisca una scelta\n [0]Esci\n [1]Genera Fibonacci\n [2]Genera Fibonacci solo per dispari\n [3]Trova in Fibonacci\n");
    sc = scelta.nextInt();
    switch (sc) {
      case 0:
        System.out.println("Arrivederci!");
        break;
      case 1:
        FibonacciGenerator();
        break;
      case 2:
        FibonacciGeneratorEvenNumber();
        break;
      case 3:
        // FibonacciFinderNmr();
        FinderFibonacci();
        break;
      default:
        System.out.println("ERRORE! SELEZIONARE UN VALORE VALIDO");
        menu();
    }

  }
}