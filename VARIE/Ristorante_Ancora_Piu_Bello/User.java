package VARIE.Ristorante_Ancora_Piu_Bello;

public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toCsv() {
        return username + "," + password + "," + firstName + "," + lastName;
    }

    public static User fromCsv(String csv) {
        String[] parts = csv.split(",");
        return new User(parts[0], parts[1], parts[2], parts[3]);
    }
}