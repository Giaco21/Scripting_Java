import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CitiesByCountryCode {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringa = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Cucina21");
            if (conn != null) {
                System.out.println("Connesso");
            } else {
                System.out.println("Connessione fallita");
            }
            // Prova lettura db

            System.out.println("Prego, Inserisca il Codice della Nazione");
            String codInput = "%" + stringa.nextLine() + "%";
            System.out.println("Prego, inserisca un numero per filtrare sul minimo della popolazione:");
            int popInput = interi.nextInt();
            System.out.println("Prego, selezioni se vuole vedere il nome della nazione o nasconderlo [1]SI [2]NO");
            int nome = stringa.nextInt();
            System.out.println("Prego, vuole ordinare in maniera discendente o ascendente? [1]ASCENDENTE [2]DISCENDENTE");
            int ordInput = interi.nextInt();
            String tempOrd;
            if (ordInput == 1)
                tempOrd = "ASC";
            else
                tempOrd = "DESC";

            String query = "SELECT country.Code, city.name, CASE WHEN 0!=? THEN country.name else 'nascosto' end as NomeNazine, country.Population FROM world.country inner join  world.city  on world.country.Code=world.city.CountryCode where country.Population >= ? and country.code like ?  Order by Population "+ tempOrd;
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, nome);
            stm.setInt(2, popInput);
            stm.setString(3, codInput);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String tableFormat = String.format("CODICE: %s CITTA': %s NOMENAZIONE: %s POPULATION %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                System.out.println(tableFormat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}