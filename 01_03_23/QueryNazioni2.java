import java.sql.*;

public class QueryNazioni2 {
    public static void main(String[] args) {

        String DB_URL = "jdbc:mysql://localhost:3306/world";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "Cucina21";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                Statement stmt = conn.createStatement()) {

            String query = "SELECT Country.Name, Country.SurfaceArea, Country.IndepYear FROM Country WHERE Country.SurfaceArea > 100000";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String nomeNazione = rs.getString("Name");
                double superficie = rs.getDouble("SurfaceArea");
                int annoIndipendenza = rs.getInt("IndepYear");

                String risultato = nomeNazione + " ha una superficie di " + superficie + " e ";
                if (annoIndipendenza != 0) {
                    risultato += "si è resa indipendente nel " + annoIndipendenza;
                } else {
                    risultato += "non ha un anno di indipendenza registrato";
                }
                System.out.println(risultato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}