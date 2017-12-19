package foodDoor2Door;

public class Product {
    private String name;
    private int qty;

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public Product(String name, int qty) {

        this.name = name;
        this.qty = qty;
    }
}
