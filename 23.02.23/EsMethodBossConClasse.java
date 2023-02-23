import java.util.ArrayList;
import java.util.Scanner;

public class EsMethodBossConClasse {
    
    // Classe per rappresentare un utente
    private static class User {
        private String name;
        private String email;
        private String password;
        private String level;
        
        public User(String name, String email, String password, String level) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.level = level;
        }
        
        public String getName() {
            return name;
        }
        
        public String getEmail() {
            return email;
        }
        
        public String getPassword() {
            return password;
        }
        
        public String getLevel() {
            return level;
        }
        
        public void setLevel(String level) {
            this.level = level;
        }
        
        public String toString() {
            return "Name: " + name + "\nEmail: " + email + "\nPassword: " + password + "\nLevel: " + level + "\n";
        }
    }
    
    private static ArrayList<User> users = new ArrayList<User>();
    private static String bossEmail;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Registrazione del capo
        System.out.println("Registrazione del capo");
        User boss = registerUser(scanner, "capo");
        bossEmail = boss.getEmail();
        
        // Registrazione degli utenti
        while (true) {
            System.out.println("Vuoi registrare un nuovo utente? (S/N)");
            String answer = scanner.nextLine();
            
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
            
            registerUser(scanner, "normale");
        }
        
        // Login e modifica del livello di accesso
        while (true) {
            System.out.println("Inserisci l'email dell'utente che vuoi modificare (o 'fine' per terminare)");
            String email = scanner.nextLine();
            
            if (email.equalsIgnoreCase("fine")) {
                break;
            }
            
            User user = findUserByEmail(email);
            
            if (user == null) {
                System.out.println("Utente non trovato");
            } else {
                System.out.println("Inserisci la password");
                String password = scanner.nextLine();
                
                if (user.getPassword().equals(password)) {
                    if (user.getEmail().equals(bossEmail)) {
                        System.out.println("Non puoi modificare il livello di accesso del capo");
                    } else {
                        System.out.println("Livello di accesso attuale: " + user.getLevel());
                        System.out.println("Inserisci il nuovo livello di accesso (normale, admin, capo)");
                        String level = scanner.nextLine();
                        
                        if (level.equalsIgnoreCase("normale") || level.equalsIgnoreCase("admin") || level.equalsIgnoreCase("capo")) {
                            user.setLevel(level);
                            System.out.println("Livello di accesso modificato correttamente");
                        } else {
                            System.out.println("Livello di accesso non valido");
                        }
                    }
                } else {
                    System.out.println("Password errata");
                }
            }
        }
        
        // Stampa dei dati di tutti gli utenti
        System.out.println("Dati degli utenti:");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    
// Metodo per registrare un utente
private static User registerUser(Scanner scanner, String level) {
    System.out.println("Registrazione di un utente " + level);    System.out.println("Inserisci il nome");
    String name = scanner.nextLine();
    
    System.out.println("Inserisci l'email");
    String email = scanner.nextLine();
    
    System.out.println("Inserisci la password");
    String password = scanner.nextLine();
    
    User user = new User(name, email, password, level);
    users.add(user);
    
    System.out.println("Utente registrato correttamente");
    System.out.println(user.toString());
    
    return user;
}

// Metodo per trovare un utente dato l'email
private static User findUserByEmail(String email) {
    for (User user : users) {
        if (user.getEmail().equals(email)) {
            return user;
        }
    }
    
    return null;
}
}