package com.kodilla.good.patterns.challenges;


public interface OrderRepository {
    boolean purchase(User user, String vendor, String item);
}

