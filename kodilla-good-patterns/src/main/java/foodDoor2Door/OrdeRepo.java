package foodDoor2Door;

public interface OrdeRepo {

     boolean order(User user, Vendor vendor, Product product, int qty);
    }

