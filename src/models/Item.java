package models;

import entities.Product;

public class Item {
    private Product product;
    private int jumlah;

    public Item(Product product, int jumlah) {
        this.product = product;
        this.jumlah = jumlah;
    }

    public Product getProduct() {
        return product;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubTotal() {
        return getJumlah() * getProduct().getPrice();
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", jumlah=" + jumlah +
                '}';
    }
}
