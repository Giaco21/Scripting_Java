package VARIE.Ristorante_Ancora_Piu_Bello;

import java.util.List;

public interface OrderRepository {

    List<Order> findByUser(User user);

    List<Order> findAll();

    void save(Order order);

    void update(Order order);

    void delete(Order order);
}