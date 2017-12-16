package com.kodilla.good.patterns.challenges;

public class OrderService implements OrderRepository, WebStore {

    public boolean purchase(User user, String vendor, String item) {
        System.out.println("Order for: " + user + "for: " + item + "from: " + vendor + "has been saved.");

    return true;
}
}

