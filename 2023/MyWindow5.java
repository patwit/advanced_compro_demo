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

    protected void addComponents() {
        super.addComponents();

        topPanel.removeAll();

        topPanel.setLayout(new GridLayout(3,2));
        favSportLabel = new JLabel("Your favourite Sport : ");
        favSportBox = new JComboBox<String>();
        favSportBox.addItem("Football");
        favSportBox.addItem("Tennis");
        favSportBox.addItem("Golf");
        favSportBox.addItem("Swimming");
        favSportBox.setSelectedIndex(2);
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);
        topPanel.add(nationLabel);
        topPanel.add(nationTF);
        topPanel.add(favSportLabel);
        topPanel.add(favSportBox);
    }
}
