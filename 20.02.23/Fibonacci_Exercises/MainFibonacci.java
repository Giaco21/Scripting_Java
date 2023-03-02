package Fibonacci_Exercises;


public class MainFibonacci {

  public static void main(String args[]) {
    MenuFibonacci myMenu = new MenuFibonacci();
    String DB_URL = "jdbc:mysql://localhost:3306/world";
    String DB_USERNAME = "root";
    String DB_PASSWORD = "Cucina21";
    ConnectionFibonacci connessione = new ConnectionFibonacci(DB_URL, DB_USERNAME, DB_PASSWORD);
    connessione.CreaConnessione();
    myMenu.menu();
  }
}