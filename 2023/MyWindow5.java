import javax.swing.*;
import java.awt.*;

public class MyWindow5 extends MyWindow4{

    protected JPanel top2Panel, favSportPanel;
    protected JComboBox favSportBox;
    protected JLabel favSportLabel;

    public MyWindow5(String string) {
        super(string);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MyWindow5 myWindow = new MyWindow5("Pattarawit Window5");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    public void addComponents() {
        
    }
}
