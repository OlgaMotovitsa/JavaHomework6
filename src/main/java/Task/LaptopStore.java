package Task;
import java.util.*;
public class LaptopStore {
    private final Set<Laptop> laptops;

    public LaptopStore() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop notebook) {
        laptops.add(notebook);
    }

    public Set<Laptop> getNotebooks() {
        return laptops;
    }

    public Set<Laptop> filterNotebooks(Map<String, String> filters) {
        Set<Laptop> filteredNotebooks = new HashSet<>(laptops);

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            switch (key) {
                case "brand":
                    filteredNotebooks.removeIf(notebook -> !notebook.getBrand().equals(value));
                    break;
                case "color":
                    filteredNotebooks.removeIf(notebook -> !notebook.getColor().equals(value));
                    break;
                case "price":
                    filteredNotebooks.removeIf(notebook -> notebook.getPrice() > Integer.parseInt(value));
                    break;
                default:
                    System.out.println("Вы ввели недопустимые данные");
                    break;
            }
        }

        return filteredNotebooks;
    }
}
