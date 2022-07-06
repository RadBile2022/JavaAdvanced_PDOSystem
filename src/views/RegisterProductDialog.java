package views;

import entities.Product;

import javax.swing.*;

public class RegisterProductDialog extends JDialog {
    MainFrame parent;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField inputId;
    private JTextField inputName;
    private JTextField inputPrice;

    public RegisterProductDialog(MainFrame parent) {
        this.parent = parent;
        setLocationRelativeTo(null);
//        pack();
        setSize(400,200);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonCancel.addActionListener(e->dispose());
        buttonOK.addActionListener(e->{
            Product p = new Product(inputId.getText(), inputName.getText(),
                    Double.parseDouble(inputPrice.getText()));

            parent.getPmController().registerProduct(p);
            parent.showMessage("Product " + p.getId() + " telah ditambahkan");
            dispose();
        });

    }
}
