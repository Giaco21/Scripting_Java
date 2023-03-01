import java.sql.*;

public class QueryNazioni {
    public static void main(String[] args) {

        String DB_URL = "jdbc:mysql://localhost:3306/world";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "Cucina21";
        try 
            {
                Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            String query = String.format("SELECT Name as Nazione, " +
                    "CASE WHEN SurfaceArea >= ? THEN 'Superficie superiore 100k' ELSE 'Superficie inferiore di 100k' END AS Superficie_100k, "
                    +
                    "CASE WHEN IndepYear IS NULL THEN 'Non esiste anno di indipendenza' ELSE IndepYear END AS Anno_indipendenza "
                    +
                    "FROM Country;");
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1,100000);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String tableFormat = String.format("NOME: %s SUPERFICIE: %s ANNO DI INDIPENDENZA: %s ",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                System.out.println(tableFormat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}