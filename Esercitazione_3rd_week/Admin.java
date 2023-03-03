package Esercitazione_3rd_week;

import java.util.ArrayList;

public class Admin {
    private String nomeUtente;
    private String password;
    private int codiceControllo;
    private ArrayList<Utente> listaUtenti;

    public Admin(String nomeUtente, String password, int codiceControllo) {
        this.nomeUtente = nomeUtente;
        this.password = password;
        this.codiceControllo = codiceControllo;
        this.listaUtenti = new ArrayList<>();
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void aggiungiUtente(String nomeUtente, String password) {
        Utente nuovoUtente = new Utente(nomeUtente, password);
        listaUtenti.add(nuovoUtente);
    }

    public void rimuoviUtente(Utente utente) {
        listaUtenti.remove(utente);
    }

    public ArrayList<Utente> getListaUtenti() {
        return listaUtenti;
    }
}