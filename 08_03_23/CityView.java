import java.sql.*;

public class CityView {
   public static void main(String[] args) {
      try {
         // Stabilisce la connessione al database
         Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/world", "root", "Cucina21");

         // Crea uno statement per recuperare la vista
         Statement stmt = conn.createStatement();
         String query = "SELECT * FROM italian_cities WHERE CountryCode='ITA'";
         ResultSet rs = stmt.executeQuery(query);

         // Recupera i metadati dalla vista
         ResultSetMetaData rsmd = rs.getMetaData();
         int numColumns = rsmd.getColumnCount();

         // Stampa i dati della vista
         while (rs.next()) {
            for (int i = 1; i <= numColumns; i++) {
               Object value = rs.getObject(i);
               String columnName = rsmd.getColumnName(i);
               String columnType = rsmd.getColumnTypeName(i);
               System.out.println(columnName + " (" + columnType + "): " + value);
            }
            System.out.println();
         }

         // Chiude la connessione al database
         conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}