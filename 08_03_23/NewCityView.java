import java.sql.*;
import java.util.*;

public class NewCityView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner risposta = new Scanner(System.in);
        try {
            // Stabilisce la connessione al database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "Cucina21");

            // Crea uno statement per recuperare la vista
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT * FROM city";
            ResultSet rs = stmt.executeQuery(query);

            // Recupera i metadati dalla vista
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rsmd.getColumnCount();

            // Chiedi all'utente di inserire la città da aggiungere massimo 10 volte
            int count = 0;
            while (count < 10) {
                // Chiedi all'utente di inserire il nome della città da aggiungere
                System.out.println("Inserisci il nome della città:");
                String nomeCitta = scanner.nextLine();

                // Scorri tutti i record della vista per verificare se la città esiste già
                boolean cittaEsiste = false;
                rs.beforeFirst();
                while (rs.next()) {
                    String nomeCittaVista = rs.getString("Name");
                    if (nomeCittaVista.equalsIgnoreCase(nomeCitta)) {
                        cittaEsiste = true;
                        break;
                    }
                }

                if (cittaEsiste) {
                    System.out.println("La città esiste già nella vista.");
                } else {
                    // Chiedi all'utente di inserire le informazioni sulla città
                    System.out.println("Inserisci il country code della città:");
                    String countryCode = scanner.nextLine();
                    System.out.println("Inserisci il district della città:");
                    String district = scanner.nextLine();
                    System.out.println("Inserisci la popolazione della città:");
                    int popolazione = scanner.nextInt();

                    // Aggiungi la nuova città alla vista
                    rs.moveToInsertRow();
                    rs.updateString("Name", nomeCitta);
                    rs.updateString("CountryCode", countryCode);
                    rs.updateString("District", district);
                    rs.updateInt("Population", popolazione);
                    rs.insertRow();
                    rs.moveToCurrentRow();
                    System.out.println("La città è stata aggiunta alla vista.");
                } // Chiedi all'utente se vuole aggiungere un'altra città
                System.out.println("Vuoi inserire un'altra città? (s/n)");
                String risposta2 = risposta.nextLine().toLowerCase();
                if (!risposta2.equals("s")) {
                    break;
                }
                count++;
            }

            // Chiudi la connessione al database
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
