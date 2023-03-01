package Pomeriggio;

import java.util.UUID;

public class Utente {
    private String nomeUtente;
    private String password;
    private UUID id;

    public Utente(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
        this.id = UUID.randomUUID(); // Genera un ID univoco in modo automatico
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public boolean verificaPassword(String password) {
        return this.password.equals(password);
    }
}