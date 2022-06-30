import com.sun.tools.javac.Main;
import controllers.PMController;
import entities.Shop;
import models.ProductManager;
import views.MainFrame;

public class Apps {
    public static void main(String[] args) {
        Shop shop = new Shop("Pizza Store");
        ProductManager pm = new ProductManager();
        PMController pmController = new PMController(pm);
        MainFrame mainFrame = new MainFrame("PDO Apps",pmController);
        mainFrame.setVisible(true);
    }
}
