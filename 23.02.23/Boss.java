import java.util.ArrayList;
import java.util.Scanner;

public class Boss {
    private static ArrayList<String> users = new ArrayList<>();
    private static String adminPassword = "admin123";
    private static String boss = null;

    public static void main(String[] args) {
        menu();
    }


    private static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli l'operazione da eseguire:");
            System.out.println("1. Registrati come utente normale");
            System.out.println("2. Registrati come utente admin");
            System.out.println("3. Registrati come capo");
            System.out.println("4. Stampare tutti gli utenti registrati");
            System.out.println("5. Esci");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerUser(scanner, "normale", null);
                    break;
                case 2:
                    registerUser(scanner, "admin", adminPassword);
                    break;
                case 3:
                    registerUser(scanner, "capo", adminPassword);
                    break;
                case 4:
                    printAllUsers();
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    System.exit(0);
                default:
                    System.out.println("Operazione non valida. Riprova.");
            }
        }
    }
    // Metodo per registrare un utente
    private static void registerUser(Scanner scanner, String level, String adminPassword) {
        System.out.println("Registrazione di un utente " + level);

        System.out.println("Inserisci il nome");
        String name = scanner.nextLine();

        System.out.println("Inserisci l'email");
        String email = scanner.nextLine();

        System.out.println("Inserisci la password");
        String password = scanner.nextLine();

        if (level.equals("capo")) {
            if (boss != null) {
                System.out.println("C'è già un capo registrato");
                return;
            } else if (!adminPassword.equals(adminPassword)) {
                System.out.println("Password dell'amministratore errata");
                return;
            } else {
                boss = email;
            }
        }

        String user = name + "," + email + "," + password + "," + level;
        users.add(user);

        System.out.println("Utente registrato correttamente");
        System.out.println(user);
    }

    // Metodo per stampare tutti gli utenti registrati
    private static void printAllUsers() {
        System.out.println("Elenco di tutti gli utenti registrati:");

        for (String user : users) {
            String[] userArray = user.split(",");
            String name = userArray[0];
            String email = userArray[1];
            String level = userArray[3];
            System.out.println("Nome: " + name + ", Email: " + email + ", Livello: " + level);
        }
    }
}