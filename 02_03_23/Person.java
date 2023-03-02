import java.net.PasswordAuthentication;
import java.util.*;

public class Person {
    private String name;
    private String password;
    static Scanner gettername = new Scanner(System.in);

    public  Person(String nome){

        this.name = nome;
        
    }

    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = newName;
    }



    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    
    public static void main(String[] args) {
        System.out.println("Prego inserisca un nome: \n");
        String nuovoNome = gettername.nextLine();
        Person giacomo = new Person(nuovoNome);
        System.out.println("Cambiamo sto nome brutto. Inseriscine uno nuovo:\n");
        String secondoNome = gettername.nextLine();
        giacomo.setName(secondoNome);
        System.out.println(giacomo.getName());
        
    }
}
