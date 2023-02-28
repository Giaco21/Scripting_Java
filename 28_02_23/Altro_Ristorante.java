import java.util.*;

    class Piatto {
        private String nome;
        private double prezzo;
        private String tipo;

        public Piatto(String nome, double prezzo, String tipo) {
            this.nome = nome;
            this.prezzo = prezzo;
            this.tipo = tipo;
        }

        public String getNome() {
            return nome;
        }

        public double getPrezzo() {
            return prezzo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setPrezzo(double nuovoPrezzo) {
            this.prezzo = nuovoPrezzo;
        }

        public void setTipo(String nuovoTipo) {
            this.tipo = nuovoTipo;
        }

        public void setNome(String nuovoNome) {
            this.nome = nuovoNome;
        }
    }

    class Conto {
        private ArrayList<Piatto> piatti;
        private double totale;

        public Conto() {
            piatti = new ArrayList<Piatto>();
            totale = 0.0;
        }

        public void aggiungiPiatto(Piatto piatto) {
            piatti.add(piatto);
            totale += piatto.getPrezzo();
        }

        public double getTotale() {
            return totale;
        }

        public ArrayList<Piatto> getPiatti() {
            return piatti;
        }

        public void eliminaPiatto(Piatto piattoEliminato) {
            piatti.remove(piattoEliminato);
            totale -= piattoEliminato.getPrezzo();
        }
    }

    public class Altro_Ristorante {

    public static void main(String[] args) {
        
        Piatto pizza = new Piatto("Pizza Margherita", 8.50, "Pizza");
        Piatto lasagne = new Piatto("Lasagne alla Bolognese", 12.50, "Primo");
        Piatto tiramisu = new Piatto("Tiramisù", 5.50, "Dolce");

        Conto conto = new Conto();
        Scanner scanner = new Scanner(System.in);

        int scelta = 0;
        do {
            System.out.println("1. Aggiungi piatto");
            System.out.println("2. Modifica piatto");
            System.out.println("3. Elimina piatto");
            System.out.println("4. Visualizza conto");
            System.out.println("0. Esci");

            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // consuma il newline rimasto nel buffer

            switch (scelta) {
                case 1:
                    System.out.println("Menu:");
                    System.out.println("1. Pizza Margherita");
                    System.out.println("2. Lasagne alla Bolognese");
                    System.out.println("3. Tiramisù");
                    System.out.print("Scegli un piatto: ");
                    int piattoScelto = scanner.nextInt();
                    scanner.nextLine(); // consuma il newline rimasto nel buffer
                    switch (piattoScelto) {
                        case 1:
                            conto.aggiungiPiatto(pizza);
                            System.out.println("Pizza Margherita aggiunta al conto.");
                            break;
                        case 2:
                            conto.aggiungiPiatto(lasagne);
                            System.out.println("Lasagne alla Bolognese aggiunte al conto.");
                            break;
                        case 3:
                        conto.aggiungiPiatto(tiramisu);
                        System.out.println("Tiramisù agggiunto al conto.");
                        break;
                    }    
                        case 3:
                                ArrayList<Piatto> piattiDaEliminare = conto.getPiatti();
                                if (piattiDaEliminare.size() == 0) {
                                    System.out.println("Non hai ancora ordinato alcun piatto.");
                                    break;
                                }
                                System.out.println("I piatti attualmente ordinati sono:");
                                for (int i = 0; i < piattiDaEliminare.size(); i++) {
                                    System.out.println((i + 1) + ". " + piattiDaEliminare.get(i).getNome());
                                }
                                System.out.print("Scegli il piatto da eliminare (1-" + piattiDaEliminare.size() + "): ");
                                int piattoDaEliminare = scanner.nextInt();
                                scanner.nextLine(); // consuma il newline rimasto nel buffer
                                if (piattoDaEliminare < 1 || piattoDaEliminare > piattiDaEliminare.size()) {
                                    System.out.println("Scelta non valida.");
                                    break;
                                }
                                Piatto piattoEliminato = piattiDaEliminare.get(piattoDaEliminare - 1);
                                conto.eliminaPiatto(piattoEliminato);
                                System.out.println("Hai eliminato il piatto: " + piattoEliminato.getNome());
                                break;
                            case 4:
                                ArrayList<Piatto> piattiOrdinatiConto = conto.getPiatti();
                                if (piattiOrdinatiConto.size() == 0) {
                                    System.out.println("Non hai ancora ordinato alcun piatto.");
                                    break;
                                }
                                System.out.println("Il conto attuale è:");
                                for (int i = 0; i < piattiOrdinatiConto.size(); i++) {
                                    System.out.println((i + 1) + ". " + piattiOrdinatiConto.get(i).getNome() +
                                            " (" + piattiOrdinatiConto.get(i).getTipo() + "): " + piattiOrdinatiConto.get(i).getPrezzo() + "€");
                                }
                                System.out.println("TOTALE: " + conto.getTotale() + "€");
                                break;
                            case 0:
                                System.out.println("Arrivederci!");
                                break;
                            default:
                                System.out.println("Scelta non valida.");
                                break;
                        }
                        System.out.println();
                    } while (scelta != 0);
                }
            }

    