package Pomeriggio;

import java.util.*;
import java.util.UUID;

public class Admin {
    private String nome;
    private String password;
    private static UUID id;
    private String codiceAccesso;
    
    // Costruttore
    public Admin(String nome, String password, UUID id2, String codiceAccesso) {
        this.nome = nome;
        this.password = password;
        this.id = UUID.randomUUID(); // Genera un ID univoco in modo automatico
        this.codiceAccesso = codiceAccesso;
    }
    
    // Metodi per accedere ai campi
    public String getNome() {
        return nome;
    }
    
    public static UUID getId() {
        return id;
    }
    
    // Metodo per verificare se la password inserita è corretta
    public boolean verificaPassword(String password) {
        return this.password.equals(password);
    }
    
    // Metodo per verificare se il codice di accesso inserito è corretto
    public boolean verificaCodiceAccesso(String codiceAccesso) {
        return this.codiceAccesso.equals(codiceAccesso);
    }
    
    // Metodi per modificare le liste dei piatti
    public void aggiungiPiatto(Pietanza piatto, ArrayList<Pietanza> listaPietanze) {
        listaPietanze.add(piatto);
    }
    
    public void rimuoviPiatto(Pietanza piatto, ArrayList<Pietanza> listaPietanze) {
        listaPietanze.remove(piatto);
    }
    
    public void bestSeller(){
    }
    
    // ... altri metodi per la gestione delle liste dei piatti ...
}
