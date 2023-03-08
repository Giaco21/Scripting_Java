package VARIE.Ristorante_Ancora_Piu_Bello;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Double> items;

    public Menu() {
        items = new HashMap<>();
        items.put("Pasta", 8.5);
        items.put("Pizza", 10.0);
        items.put("Salad", 6.5);
        // altri piatti...
    }

    public Map<String, Double> getItems() {
        return items;
    }
}