package foodDoor2Door;

public class HealthyShop {
    private String vendorName;
    private String product;
    private int qty;


    public HealthyShop(String vendorName, String product, int qty) {
        this.vendorName = vendorName;
        this.product = product;
        this.qty = qty;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }
}
