import java.util.ArrayList;
import java.util.Scanner;

public class RegBoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object[]> users = new ArrayList<>();
        boolean capoPresente = false;
        boolean SonoAdmin = false;
        boolean Sonocapo = false;
        boolean SonoLIVELLO = true;
        
        public static void Gestione livello(){
            //Qui uno dei tre dovrà sempre essere settato true in base al livello.
        
        }

     

        while (true) {
            System.out.println("1. Registra utente");
            System.out.println("2. Modifica utente");
            System.out.println("3. Stampa dati utenti");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Livello (1=normale, 2=admin, 3=capo): ");
                    int livello = scanner.nextInt();
                    scanner.nextLine();
                    if (livello == 3) {
                        if (capoPresente) {
                            System.out.println("Attenzione: può essere presente un solo utente di livello 'capo'.");
                            break;
                        } else {
                            capoPresente = true;
                        }
                    }
                    Object[] user = new Object[4];
                    user[0] = nome;
                    user[1] = cognome;
                    user[2] = email;
                    user[3] = livello;
                    users.add(user);
                    System.out.println("Utente registrato con successo.");
                    break;

                case 2:
                    System.out.print("Email utente da modificare: ");
                    String emailMod = scanner.nextLine();
                    Object[] utenteMod = null;
                    for (Object[] u : users) {
                        if (u[2].equals(emailMod)) {
                            utenteMod = u;
                            break;
                        }
                    }
                    if (utenteMod == null) {
                        System.out.println("Utente non trovato.");
                        break;
                    }
                    if ((int)utenteMod[3] == 3) {
                        System.out.println("Solo l'utente di livello 'capo' può modificare gli altri utenti.");
                        break;
                    }
                    if ((int)utenteMod[3] == 2) {
                        System.out.println("Solo l'utente di livello 'capo' può modificare gli utenti di livello 'admin'.");
                        break;
                    }
                    System.out.print("Nuovo nome (lasciare vuoto per mantenere il valore attuale): ");
                    String nuovoNome = scanner.nextLine();
                    if (!nuovoNome.isEmpty()) {
                        utenteMod[0] = nuovoNome;
                    }
                    System.out.print("Nuovo cognome (lasciare vuoto per mantenere il valore attuale): ");
                    String nuovoCognome = scanner.nextLine();
                    if (!nuovoCognome.isEmpty()) {
                        utenteMod[1] = nuovoCognome;
                    }
                    System.out.print("Nuova email (lasciare vuoto per mantenere il valore attuale): ");
                    String nuovaEmail = scanner.nextLine();
                    if (!nuovaEmail.isEmpty()) {
                        utenteMod[2] = nuovaEmail;
                        }
                        System.out.println("Utente modificato con successo.");
                        break;
                        case 3:
                        for (Object[] u : users) {
                            System.out.println("Nome: " + u[0]);
                            System.out.println("Cognome: " + u[1]);
                            System.out.println("Email: " + u[2]);
                            int liv = (int)u[3];
                            String livelloStringa = "";
                            if (liv == 1) {
                                livelloStringa = "normale";
                            } else if (liv == 2) {
                                livelloStringa = "admin";
                            } else if (liv == 3) {
                                livelloStringa = "capo";
                            }
                            System.out.println("Livello: " + livelloStringa);
                            System.out.println();
                        }
                        break;
        
                    case 4:
                        System.out.println("Grazie per aver utilizzato il programma.");
                        System.exit(0);
        
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }
            }
        }
    }
