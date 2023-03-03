package Esercitazione_3rd_week;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> elencoLibri;
    
    public Biblioteca() {
        elencoLibri = new ArrayList<>();
    }
    
    public void aggiungiLibro(Libro libro) {
        if(!elencoLibri.contains(libro)) {
            elencoLibri.add(libro);
        }
    }
    
    public void rimuoviLibro(String titolo) {
        Libro libro = trovaLibro(titolo);
        if (libro == null) {
            System.out.println("Il libro " + titolo + " non è presente nella biblioteca.");
        } else {
            elencoLibri.remove(libro);
            System.out.println("Il libro " + titolo + " è stato rimosso dalla biblioteca.");
        }
    }

    public Libro trovaLibro(String titolo) {
        for (Libro libro : elencoLibri) {
            if (libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }
    
    public void prestaLibro(String titolo) {
        for(Libro libro : elencoLibri) {
            if(libro.getTitolo().equals(titolo)) {
                if(libro.getNumCopieDisponibili() > 0) {
                    libro.setNumCopieDisponibili(libro.getNumCopieDisponibili() - 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() + 1);
                    System.out.println("Il libro " + titolo + " è stato prestato con successo.");
                    return;
                } else {
                    System.out.println("Non ci sono copie disponibili per il libro " + titolo + ".");
                    return;
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile nella biblioteca.");
    }
    
    public void restituisciLibro(String titolo) {
        for(Libro libro : elencoLibri) {
            if(libro.getTitolo().equals(titolo)) {
                if(libro.getNumCopieInPrestito() > 0) {
                    libro.setNumCopieDisponibili(libro.getNumCopieDisponibili() + 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() - 1);
                    System.out.println("Il libro " + titolo + " è stato restituito con successo.");
                    return;
                } else {
                    System.out.println("Non è possibile restituire il libro " + titolo + ", non è stato preso in prestito.");
                    return;
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile nella biblioteca.");
    }
    
    public void stampaLibriDisponibili() {
        if(elencoLibri.isEmpty()) {
            System.out.println("Non ci sono libri disponibili nella biblioteca.");
        } else {
            System.out.println("Elenco libri disponibili:");
            for(Libro libro : elencoLibri) {
                System.out.println(libro.getTitolo() + " - copie disponibili: " + libro.getNumCopieDisponibili());
            }
        }
    }
}