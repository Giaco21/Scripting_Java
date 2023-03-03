package Fibonacci_Exercises;
import java.sql.*;
public class Popolator {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/fibonacci";
        String username = "root";
        String password = "Cucina21";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);

            // Preparare lo statement per la tabella "utenti"
            PreparedStatement stmtUtenti = conn.prepareStatement(
                "INSERT INTO utenti (Username, Password, Nazionalita, Anno_di_nascita, email) VALUES (?, ?, ?, ?, ?)"
            );
            stmtUtenti.setString(1, "john_doe");
            stmtUtenti.setString(2, "randombs");
            stmtUtenti.setString(3, "CANADA");
            stmtUtenti.setInt(4, 1985);
            stmtUtenti.setString(5, "john.doe@example.com");

            // Eseguire lo statement per la tabella "utenti"
            stmtUtenti.executeUpdate();

            // Preparare lo statement per la tabella "statistiche"
            PreparedStatement stmtStat = conn.prepareStatement(
                "INSERT INTO statistiche (username, numero_di_login, data_ultimo_login, numero_di_volte_generato, numero_di_volte_cercato, numero_preferito_cercato, numero_piu_alto_cercato, numero_piu_alto_generato) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            );
            stmtStat.setString(1, "john_doe");
            stmtStat.setInt(2, 10);
            stmtStat.setString(3, "03/03/2023") ;
            stmtStat.setInt(4, 5);
            stmtStat.setInt(5, 3);
            stmtStat.setInt(6, 2);
            stmtStat.setInt(7, 10);
            stmtStat.setInt(8, 20);

            // Eseguire lo statement per la tabella "statistiche"
            stmtStat.executeUpdate();

            conn.commit();
            conn.close();
        } catch (SQLException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}