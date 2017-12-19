package foodDoor2Door;

public class ExtraFoodShop {

    private String vendor;
    private String product;
    private int qty;

    ExtraFoodShop extraFoodShop = new ExtraFoodShop(vendor,  product,  qty);

    public ExtraFoodShop getExtraFoodShop() {
        return extraFoodShop;
    }

    public String getVendor() {
        return vendor;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public ExtraFoodShop(String vendor, String product, int qty){
        this.vendor = vendor;
        this.product = product;
        this.qty = qty;
    }
}

