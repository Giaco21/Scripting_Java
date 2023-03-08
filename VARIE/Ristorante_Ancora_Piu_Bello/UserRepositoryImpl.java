package VARIE.Ristorante_Ancora_Piu_Bello;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private static final String FILE_NAME = "users.txt";

    @Override
    public void save(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(user.toCsv());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findByUsername(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = User.fromCsv(line);
                if (user.getUsername().equals(username)) {
                    return user;
                }
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> findAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        List<User> users = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
        users.add(User.fromCsv(line));
}
return users;
} catch (IOException e) {
throw new RuntimeException(e);
}
}

@Override
public void update(User user) {
    List<User> users = findAll();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                writer.write(user.toCsv());
            } else {
                writer.write(u.toCsv());
            }
            writer.newLine();
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

@Override
public void delete(User user) {
    List<User> users = findAll();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
        for (User u : users) {
            if (!u.getUsername().equals(user.getUsername())) {
                writer.write(u.toCsv());
                writer.newLine();
            }
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}