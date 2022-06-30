package controllers;

import entities.Product;
import models.ProductManager;

public class PMController {
    private ProductManager pm;

    public PMController(ProductManager pm){
        this.pm = pm;
    }


    public void registerProduct(Product p) {
        pm.registerProduct(p);
    }

    public void printAllProducts() {
        pm.printAllProduct();
    }
}
