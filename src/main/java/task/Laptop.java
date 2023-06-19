package task;

public class Laptop {
    private String brand;
    private String color;
    private int price;

    public Laptop(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public String getColor() {

        return color;
    }

    public int getPrice() {

        return price;
    }
}
