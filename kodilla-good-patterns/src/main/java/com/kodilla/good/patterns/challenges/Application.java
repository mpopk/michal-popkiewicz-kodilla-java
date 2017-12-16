package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        PurchaseOrderRetriever purchaseOrderRetriever = new PurchaseOrderRetriever();
        PurchaseOrderRequest purchaseOrderRequest =  purchaseOrderRetriever.retrieve();

        PurchaseOrderProcessor purchaseOrderProcessor = new PurchaseOrderProcessor(new MailService(), new OrderService(), new ShoppingService());

    }
}
