package apps;

import entities.Product;
import entities.Shop;
import models.Item;
import models.Order;
import views.MainFrame;

public class Apps {
    private static Shop shop = null ;
    public static void main(String[] args) {
        // inisialisasi
        if (shop == null){
            shop = new Shop("GFT Store");
        }
        // data dummy (hardcoding contoh data)
        shop.getPm().registerProduct(new Product("SKU1010","Pizza Meet Lover", 34));
        Order order = new Order();
        order.addItem(new Item(shop.getPm().findProductById("SKU1010"),3));
        shop.getOm().addOrder(order);
        System.out.println(shop.getOm().getOrders());
        MainFrame mainFrame = new MainFrame("PDO Apps",shop);
        mainFrame.setVisible(true);
    }
}
