//package views;
//
//import controllers.PMController;
//import entities.Product;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class MainFrame extends JFrame {
//    private PMController pmController;
//    private JButton button;
//
//    public MainFrame (String title,PMController pmController){
//        super(title);
//        this.pmController = pmController;
//
//        setSize(400,600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        initComponent();
//    }
//
//    // khusus gambar
//    private void initComponent() {
//        button = new JButton("Click");
//        button.addActionListener(e -> {
//            pmController.registerProduct(new Product("1","SAF",54));
//            pmController.printAllProducts();
//        });
//
//        getContentPane().add(button);
//    }
//}
