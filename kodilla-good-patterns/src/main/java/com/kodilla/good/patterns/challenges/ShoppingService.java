package com.kodilla.good.patterns.challenges;

public class ShoppingService implements WebStore, OrderRepository {

    public boolean purchase(final User user, final String vendor, final String item){
        System.out.println("Purchase item: " + item + "from: " + vendor + "for: " + user.getName() + user.getNickName());

        return true;
    }
}
