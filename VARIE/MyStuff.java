import java.sql.*;

public class MyStuff {

   public static void main(String[] args) {

      // Configurazione della connessione al database
      String url = "jdbc:mysql://localhost:3306/mydatabase";
      String user = "root";
      String password = "mypassword";
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;

      try {
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url, user, password);
         System.out.println("Connessione al database avvenuta con successo.");
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }

      // Schermata di login
      boolean loggedIn = false;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Benvenuto! Effettua il login o registrati.");

      while (!loggedIn) {
         System.out.print("Username: ");
         String username = scanner.nextLine();
         System.out.print("Password: ");
         String password = scanner.nextLine();

         // Controllo se l'utente esiste nel database
         String query = "SELECT * FROM users WHERE username = ? AND password = ?";
         try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
               System.out.println("Accesso effettuato con successo.");
               loggedIn = true;
            } else {
               System.out.println("Username o password errati.");
               System.out.println("Vuoi registrarti? [S/N]");
               String choice = scanner.nextLine();
               if (choice.equalsIgnoreCase("S")) {
                  System.out.print("Inserisci un nuovo username: ");
                  String newUsername = scanner.nextLine();
                  System.out.print("Inserisci una nuova password: ");
                  String newPassword = scanner.nextLine();

                  // Registrazione del nuovo utente nel database
                  query = "INSERT INTO users (username, password) VALUES (?, ?)";
                  stmt = conn.prepareStatement(query);
                  stmt.setString(1, newUsername);
                  stmt.setString(2, newPassword);
                  stmt.executeUpdate();
                  System.out.println("Registrazione avvenuta con successo. Effettua il login.");
               }
            }
         } catch (SQLException e) {
            e.printStackTrace();
         } finally {
            try {
               if (rs != null) {
                  rs.close();
               }
               if (stmt != null) {
                  stmt.close();
               }
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }

      // Chiusura della connessione al database
      try {
         if (conn != null) {
            conn.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}