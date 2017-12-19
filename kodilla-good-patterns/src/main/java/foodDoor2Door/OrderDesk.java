package foodDoor2Door;

public class OrderDesk implements OrdeRepo {

    public boolean order(User user, Vendor vendor, Product product, int qty) {

        System.out.println("Order for: " + user + "for: " + qty + "of: " + product + "from: " + vendor + "has been saved.");

        return true;
    }
    }

