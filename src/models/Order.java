package models;

import entities.Shop;


import java.util.ArrayList;
import java.util.List;

public class Order{
    private Shop shop;
    private List<Item> items = new ArrayList<>();

//    public Order(Shop shop) {
//        this.shop = shop;
//    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void cetakInvoice() {
        System.out.println(shop.getName());
        double total = 0;
        for (Item i: items) {
            System.out.println(i.getProduct().getNama()
            + " | " + i.getProduct().getPrice() + " | " + i.getJumlah() + "|"
            + i.getSubTotal());
            total += i.getSubTotal();
        }
        System.out.println("\t\t\t--------------");
        System.out.println("\t\t\tTotal : " + total);
    }

    @Override
    public String toString() {
        return "Order{" +
                "shop=" + shop +
                ", items=" + items +
                '}';
    }
}
