package foodDoor2Door;

public class Vendor implements OrderProcessor {
    private String name;
    private String product;


    public Vendor(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public void process(int OrderNo, String vendor) {

    }
}
