package VARIE.Ristorante_Ancora_Piu_Bello;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private User user;
    private List<String> items;
    private LocalDateTime timestamp;
    private double total;

    public Order(User user, List<String> items, LocalDateTime timestamp, double total) {
        this.user = user;
        this.items = items;
        this.timestamp = timestamp;
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}