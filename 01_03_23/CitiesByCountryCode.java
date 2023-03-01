import java.sql.*;
import java.util.*;

public class CitiesByCountryCode {

  static Scanner code = new Scanner(System.in);
  static Scanner orderDesc = new Scanner(System.in);
  static Scanner showCoName = new Scanner(System.in);
  static Scanner population = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("Prego inserisca il codice della nazione da cercare: \n");
    String countryCode = code.nextLine(); // codice della nazione fornito dall'utente
    System.out.println("Vuole ordinarle in ordine discendente o ascendente?\n [1]DESC\n [2]ASC\n: \n");
    int orderDescending = orderDesc.nextInt();
    // se l'utente vuole ordinare le città in modo decrescente o meno
    if(orderDescending ==1){
      boolean orderDesce = true;
    }boolean orderDesce = false;
    int minPopulation = 100000; // minimo di popolazione per filtrare le città
    boolean showCountryName = true; // se mostrare il nome della nazione a cui fa riferimento il code
  
    try {
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "Cucina21");
      
      Statement stmt = conn.createStatement();
      String sql = String.format("SELECT c.Name, co.Name AS CountryName, c.Population " +
                                 "FROM city c " +
                                 "JOIN country co ON c.CountryCode = co.Code " +
                                 "WHERE c.CountryCode = '" + countryCode +"'");

      if (minPopulation > 0) {
        sql += " AND c.Population >= " + minPopulation;
      }
      if (orderDesce) {
        sql += " ORDER BY c.Population DESC";
      } else {
        sql += " ORDER BY c.Population ASC";
      }
      
      ResultSet rs = stmt.executeQuery(sql);
      
      System.out.println("Cities in " + countryCode + ":");
      while (rs.next()) {
        String tableFormat = String.format("CITTA': %s CODICE: %s",

        rs.getString(1),
        rs.getInt(2));
        System.out.println(tableFormat);

        String countryName = "";
        if (showCountryName) {
          countryName = " (" + rs.getString(3) + ")";
        }
      }
      
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  
  }

}