import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame{

    protected JButton resetButton, cancelButton, okButton;
    protected JPanel mainPanel;

    public MyWindow(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected static void createAndShowGUI() {
        MyWindow myWindow = new MyWindow("Pattarawit Window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    protected void setFrameFeature() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected void addComponents() {
        resetButton = new JButton("Reset");
        cancelButton = new JButton("Cancel");
        okButton = new JButton("OK");

        mainPanel = new JPanel();

        mainPanel.add(resetButton);
        mainPanel.add(cancelButton);
        mainPanel.add(okButton);

        add(mainPanel);
    }
}