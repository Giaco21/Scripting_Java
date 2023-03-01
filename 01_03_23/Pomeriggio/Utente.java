package Pomeriggio;

import java.util.Random;
import java.util.UUID;

public class Utente {
    private String nomeUtente;
    private String password;
    private UUID id;
    private double budget;

    public Utente(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
        this.id = UUID.randomUUID(); // Genera un ID univoco in modo automatico
        this.budget = generaBudgetCasuale(); // Genera un budget random
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public boolean verificaPassword(String password) {
        return this.password.equals(password);
    }

    private double generaBudgetCasuale() {
        Random rand = new Random();
        return 10 + rand.nextDouble() * 9900;
    }
    
    public double getBudget(){
        return this.budget;
    }
}