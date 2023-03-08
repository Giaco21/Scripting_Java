package VARIE.Ristorante_Ancora_Piu_Bello;

import java.util.List;

public interface RestaurantService {
    User login(String username, String password);

    void register(User user);

    List<Menu> getMenu();

    Order placeOrder(User user, List<Menu> items);

    List<Order> getOrders(User user);

    void cancelOrder(Order order);

    void updateUser(User user);

    void deleteUser(User user);
}
