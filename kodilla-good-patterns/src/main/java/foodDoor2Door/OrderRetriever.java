package foodDoor2Door;

public class OrderRetriever {

    public OrderRequest retrieve() {

        User user = new User("Michał", "Misiek");

        String vendor = "ExtraFoodShop";

        String product = "Organic pineapples";

        int qty = 1000;

        return new OrderRequest(user, vendor, product, qty);

    }
}

