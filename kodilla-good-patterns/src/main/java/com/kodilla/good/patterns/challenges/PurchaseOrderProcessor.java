package com.kodilla.good.patterns.challenges;


public class PurchaseOrderProcessor {
    private InfoServ infoServ;
    private WebStore webStore;
    private OrderRepository orderRepository;

    public PurchaseOrderProcessor(final InfoServ infoServ,
                           final WebStore webStore,
                           final OrderRepository orderRepository) {
        this.infoServ = infoServ;
        this.webStore = webStore;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final PurchaseOrderRequest purchaseOrderRequest) {
        boolean isPurchased = webStore.purchase(purchaseOrderRequest.getUser(), purchaseOrderRequest.getVendor(),
                purchaseOrderRequest.getItem());

        if(isPurchased) {
            infoServ.inform(purchaseOrderRequest.getUser());
            orderRepository.purchase(purchaseOrderRequest.getUser(), purchaseOrderRequest.getVendor(), purchaseOrderRequest.getItem());
            return new OrderDto(purchaseOrderRequest.getUser(), true);
        } else {
            return new OrderDto(purchaseOrderRequest.getUser(), false);
        }
    }
}


