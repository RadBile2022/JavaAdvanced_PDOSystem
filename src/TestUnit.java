import entities.Product;
import models.ProductManager;
import utilities.DBServices;

public class TestUnit {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        /// use case register product --> take
        Product p = new Product("SKU1000002", "Pizza Meet Lover", 23);
        pm.registerProduct(p);
        pm.registerProduct(new Product("SKU100034", "Salad Buah", 12));
        // print All Product
        pm.printAllProduct();
        pm.remove(p);
        pm.printAllProduct();
        // kalau DB ngene thok
//        DBServices.save(pm);
        System.out.println(pm.findProductById("SKU100034") + "ketemu");


    }
}
