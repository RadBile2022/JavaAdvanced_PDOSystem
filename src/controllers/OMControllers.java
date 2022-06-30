package controllers;

import entities.Shop;
import models.Order;
import models.OrderManager;

public class OMControllers {
    private OrderManager om;
    private Order order;

    public OMControllers(OrderManager om) {
        this.om = om;
    }

    public Order createOrder(Shop shop) {
        return om.createOrder(shop);
    }

    public void addOrder(Order order) {
        om.addOrder(order);
    }

    public void printAllOrder() {
        om.printAllOrder();
    }
}
