import java.awt.*;
import javax.swing.*;

/**
 * temHandler
 */
public class ItemHandler extends ItemGUI{

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    public ItemHandler(String string) {
        super(string);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        ItemHandler window = new ItemHandler("Item Handler");
        window.addComponents();
        window.setFrameFeature();
    }
}