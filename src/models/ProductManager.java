package models;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    public void registerProduct(Product p) {
        productList.add(p);
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void remove(Product p) {
        productList.remove(p);
    }

    public Product findProductById(String id) {
        for (Product p : productList){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
}
