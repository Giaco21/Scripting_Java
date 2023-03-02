package Fibonacci_Exercises;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class ConnectionFibonacci {

    // TODO: Singleton

    // CONNESSIONE DI FIBONACCI
    // URL DATABASE FIBONACCI
    // DRIVER MANAGER
    // PASSWORD DATABASE
    // STATEMENT STATICO CON QUERY
    // ESECUZIONE QUERY CON RISULTATO
    // FUNZIONE CHE COLLEGA CON IL MAIN FIBONACCI

    private String myDB_URL;
    private String myDB_USERNAME;
    private String myDB_PASSWORD;

    public ConnectionFibonacci(String url, String user, String password) {

        myDB_URL = url;
        myDB_USERNAME = user;
        myDB_PASSWORD = password;

    }

    public Connection CreaConnessione() {
        try {
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(myDB_URL, myDB_USERNAME, myDB_PASSWORD);

            System.out.println(
                    myConnection == null ? "CONNESSIONE NON STABILITA\n" : "CONNESSIONE AVVENUTA CON SUCCESSO\n");

            return myConnection;

        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }
}

/*
 * // ---------------- TEST JDBC --------------
 * private String DB_URL = "jdbc:mysql://localhost:3306/world";
 * private String DB_USERNAME = "root";
 * private String DB_PASSWORD = "Cucina21";
 * private SQLException e;
 * 
 * 
 * public ConnectionFibonacci(String dB_URL, String dB_USERNAME, String
 * dB_PASSWORD, SQLException e) {
 * DB_URL = dB_URL;
 * DB_USERNAME = dB_USERNAME;
 * DB_PASSWORD = dB_PASSWORD;
 * this.e = e;
 * }
 * 
 * 
 * 
 * public String getDB_URL() {
 * return DB_URL;
 * }
 * 
 * public void setDB_URL(String dB_URL) {
 * DB_URL = dB_URL;
 * }
 * 
 * public String getDB_USERNAME() {
 * return DB_USERNAME;
 * }
 * 
 * public void setDB_USERNAME(String dB_USERNAME) {
 * DB_USERNAME = dB_USERNAME;
 * }
 * 
 * public String getDB_PASSWORD() {
 * return DB_PASSWORD;
 * }
 * 
 * public void setDB_PASSWORD(String dB_PASSWORD) {
 * DB_PASSWORD = dB_PASSWORD;
 * }
 * 
 * public SQLException getE() {
 * return e;
 * }
 * 
 * public void setE(SQLException e) {
 * this.e = e;
 * }
 */