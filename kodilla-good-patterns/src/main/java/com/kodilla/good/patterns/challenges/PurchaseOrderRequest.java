package com.kodilla.good.patterns.challenges;

public class PurchaseOrderRequest {

    public User user;
    public String vendor;
    public String item;

    public PurchaseOrderRequest(User user,  String vendor, String item) {
        this.user = user;
        this.vendor = vendor;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public String getVendor() {
        return vendor;
    }

    public String getItem() {
        return item;
    }
}
