package VARIE.Ristorante_Ancora_Piu_Bello;
import java.util.List;

public interface UserRepository {

    User findByUsername(String username);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void delete(User user);
}
