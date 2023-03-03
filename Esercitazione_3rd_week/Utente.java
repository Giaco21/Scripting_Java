package Esercitazione_3rd_week;

import java.util.Scanner;

public class Utente {
    private String nomeUtente;
    private String password;

    public Utente(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public boolean login(String nomeUtente, String password) {
        return this.nomeUtente.equals(nomeUtente) && this.password.equals(password);
    }

    public Utente Creautente (){
        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto alla biblioteca!");
        System.out.print("Inserisci il tuo nome utente: ");
        String nomeUtente = input.nextLine();
        System.out.print("Inserisci la tua password: ");
        String password = input.nextLine();
        
        Utente utente = new Utente(nomeUtente, password);
        return utente;
    }
}