package com.kodilla.good.patterns.challenges;

public class PurchaseOrderRetriever {

    public PurchaseOrderRequest retrieve() {

        User user = new User("Michał", "Misiek");

        String vendor = "SuperShop";

        String item = "Jacket";

        return new PurchaseOrderRequest(user, vendor, item);

    }
}

