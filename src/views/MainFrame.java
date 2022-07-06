package views;

import entities.Customer;
import models.Order;
import controllers.OMController;
import controllers.PMController;
import entities.Product;
import entities.Shop;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MainFrame extends JFrame{
    private Shop shop; // ganti shop, ganti login, melekat user.
    private PMController pmController;
    private OMController omController;

    // builder
    private JPanel mainPanel;
    private JPanel topPanel;
    private JButton addProductButton;
    private JButton printAllProductsButton;
    private JButton findProductButton;
    private JTextArea displayData;
    private JLabel messageText;
    private JLabel clockLabel;

    public MainFrame(String title, Shop shop) {
        super(title);
        this.shop = shop;
        pmController = new PMController(shop.getPm());
        omController = new OMController(shop.getOm());
        initComponents();
    }

    public Shop getShop() {
        return shop;
    }
    public PMController getPmController() {
        return pmController;
    }
    private void initComponents() {
        showDataShop();
        // listener
        printAllProductsButton.addActionListener(e -> {
            showAllProducts();
        });

        findProductButton.addActionListener(e -> {
            findProductAction();
        });

        addProductButton.addActionListener(e -> {
            registerProduct();
        });

        getContentPane().add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // run clock


            try {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formatDateTime = now.format(formatter);
                clockLabel.setText(formatDateTime);
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }


    }

    private void registerProduct() {
        Dialog dialog = new RegisterProductDialog(this);
        dialog.setVisible(true);
//        Product p = new Product("SKU9090","Salad Buah", 12);
//        pmController.registerProduct(p);
    }
    private void findProductAction() {
//        String id = "dasf";
        String id = JOptionPane.showInputDialog("Masukkan id Product ?");
        Product p = pmController.findProductById(id);
        displayData.append(p+"\n");
        showMessage("Product " +p.getId()+ " ditemukan");
    }
    private void showAllProducts() {
//        List<Product> products = pmController.printAllProducts();
//        for (Product p : products){
//
//        }
            for (Product p : pmController.printAllProducts()){
                displayData.append(p+"\n");
            }
    }
    public void showMessage(String message){
        messageText.setText(message);
    }
    public void showDataShop(){
        System.out.println(" Data product ");
        for (Product p : shop.getPm().getProductList()){
            System.out.println(p);
        }
        System.out.println(" Data Order : ");
        for (Order o : shop.getOm().getOrders() ){
            System.out.println(o);
        }
        System.out.println(" Data Customer ");
        for(Customer c : shop.getCm().getCustomerList()){
            System.out.println(c);
        }
    }

}
