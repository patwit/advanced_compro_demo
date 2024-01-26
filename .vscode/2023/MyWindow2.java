import java.awt.*;
import java.awt.GridLayout;

import javax.swing.*;

public class MyWindow2 extends MyWindow{

    protected JPanel topPanel, buttonPanel;
    protected JLabel nameLabel;
    protected JTextField nameTextField;

    public MyWindow2(String string) {
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
        MyWindow2 myWindow = new MyWindow2("Pattarawit Window2");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    public void addComponents() {
        super.addComponents();
        nameLabel = new JLabel("Name : ");
        nameTextField = new JTextField(10);
        topPanel = new JPanel(new GridLayout(1,2));
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);

        buttonPanel = new JPanel();
        buttonPanel.add(resetButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
}
