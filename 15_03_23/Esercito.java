import java.util.ArrayList;

public class Esercito {
    private int numeroSoldati;
    private ArrayList<Soldato> soldati;

    public Esercito() {
        this.numeroSoldati = 0;
        this.soldati = new ArrayList<Soldato>();
    }

    public void creaSoldato(String nome, String dataNascita, boolean forzeSpeciali) {
        Soldato soldato;
        if (forzeSpeciali) {
            soldato = new SoldatoForzeSpeciali(nome, dataNascita);
        } else {
            soldato = new Soldato(nome, dataNascita);
        }
        this.soldati.add(soldato);
        this.numeroSoldati++;
    }

    public int getNumeroSoldati() {
        return this.numeroSoldati;
    }

    public ArrayList<Soldato> getSoldati() {
        return this.soldati;
    }

    public class Soldato {
        private String nome;
        private String dataNascita;

        public Soldato(String nome, String dataNascita) {
            this.nome = nome;
            this.dataNascita = dataNascita;
        }

        public String getNome() {
            return this.nome;
        }

        public String getDataNascita() {
            return this.dataNascita;
        }
    }

    public class SoldatoForzeSpeciali extends Soldato {
        private boolean forzeSpeciali;
        private String specializzazione;
        private String annodoInizio;

        public SoldatoForzeSpeciali(String nome, String dataNascita) {
            super(nome, dataNascita);
            this.forzeSpeciali = true;
            this.specializzazione = "";
            this.annodoInizio = "";
        }

        public boolean getForzeSpeciali() {
            return this.forzeSpeciali;
        }

        public String getSpecializzazione() {
            return this.specializzazione;
        }

        public void setSpecializzazione(String specializzazione) {
            this.specializzazione = specializzazione;
        }

        public String getAnnodoInizio() {
            return this.annodoInizio;
        }

        public void setAnnodoInizio(String annodoInizio) {
            this.annodoInizio = annodoInizio;
        }

        public void setGradiSpeciali() {
            // Implementazione della logica per settare i gradi speciali
        }

        public void setAnnodoInizio() {
            // Implementazione della logica per settare l'anno di inizio
        }

        public String toString() {
            return super.toString() + " - Forze Speciali - Specializzazione: " + this.specializzazione;
        }
    }

    public abstract class ForzeSpeciali {
        public abstract void setGradiSpeciali();
        public abstract void setAnnodoInizio();
        public abstract void setSpecializzazione(String specializzazione);
    }
}