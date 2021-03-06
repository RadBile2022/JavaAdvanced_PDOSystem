package entities;

import models.CustomerManager;
import models.OrderManager;
import models.ProductManager;

public class Shop {
    private String name, npwp, alamat;
    private ProductManager pm = new ProductManager();
    private OrderManager om = new OrderManager();
    private CustomerManager cm = new CustomerManager();

    public Shop (String nama){
        this.name = nama;
    }
    public String getName() {
        return name;
    }
    public ProductManager getPm() {
        return pm;
    }
    public OrderManager getOm() {
        return om;
    }
    public CustomerManager getCm() {
        return cm;
    }
}
