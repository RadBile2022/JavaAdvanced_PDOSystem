//import controllers.OMControllers;
//import controllers.PMController;
//import models.Order;
//import entities.Product;
//import entities.Shop;
//import models.Item;
//import models.OrderManager;
//import models.ProductManager;
//
//public class TestUnit {
//    // View
//    public static void main(String[] args) {
//
//        Shop shop = new Shop("Pizza Store");
//        ProductManager pm = new ProductManager();
//        PMController pmController = new PMController(pm);
//        /// use case register product --> toko
//        Product p = new Product("SKU1000002", "Pizza Meet Lover", 20);
//        pmController.registerProduct(p);
//        pmController.registerProduct(new Product("SKU1000034", "Salad Buah", 12));
//        // use case Order
//        OrderManager om = new OrderManager();
//        OMControllers omControllers = new OMControllers(om);
//        Order order = omControllers.createOrder(shop);
//        // loop
//        order.addItem(new Item(pm.findProductById("SKU1000002"),3));
//        order.addItem(new Item(pm.findProductById("SKU1000034"),5));
//        order.cetakInvoice();
//        omControllers.addOrder(order);
//        omControllers.printAllOrder();
//        pmController.printAllProducts();
//
//
//    }
//}
