package task;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        store.addLaptop(new Laptop("Samsung", "черный", 35000));
        store.addLaptop(new Laptop("Honor", "черный", 30000));
        store.addLaptop(new Laptop("Lenovo", "белый", 23000));
        store.addLaptop(new Laptop("Asus", "серый", 28000));
        store.addLaptop(new Laptop("Asus", "черный", 25000));
        store.addLaptop(new Laptop("Honor", "серый", 30000));

        Map<String, String> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру для фильтрации: 1 - brand, 2 - color, 3 - price");
        int criteria = scanner.nextInt();

        switch (criteria) {
            case 1 -> {
                System.out.println("Введите брэнд:");
                String brand = scanner.next();
                filters.put("brand", brand);
            }
            case 2 -> {
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put("color", color);
            }
            case 3 -> {
                System.out.println("Введите цену:");
                int price = scanner.nextInt();
                filters.put("price", String.valueOf(price));
            }
            default -> System.out.println("Неправильный ввод");
        }

        Set<Laptop> filteredNotebooks = store.filterNotebooks(filters);

        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбук не найден");
        } else {
            System.out.println("Вам подходят:");
            for (Laptop notebook : filteredNotebooks) {
                System.out.println(notebook.getBrand() + " " + notebook.getColor() + " " + notebook.getPrice());
            }
        }
    }
}