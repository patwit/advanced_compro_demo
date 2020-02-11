import java.awt.*;
import java.awt.event.*;
import java.net.http.HttpResponse.BodyHandlers;

import javax.swing.*;
import java.awt.GridLayout;

/**
 * FirstGUI
 */
public class FirstGUI extends JFrame{
    protected JLabel nameLabel, outputLabel;
    protected JTextField nameTF;
    protected JTextArea output;
    protected JButton okButton, cancelButton;
    protected JPanel namePanel, outputPanel, buttonPanel, mainPanel;
    
    public FirstGUI(String string) {
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
        FirstGUI window = new FirstGUI("My GUI");
        window.addComponents();
        window.addMenus();
        window.setFrameFeature();
    }

    protected void addMenus() {
    }

    protected void addComponents() {
        nameLabel = new JLabel("Name: ");
        nameTF = new JTextField(15);
        namePanel = new JPanel(new GridLayout(0,2));
        namePanel.add(nameLabel);
        namePanel.add(nameTF);


        outputLabel = new JLabel("Output:");
        output = new JTextArea(10,30);
        outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(output, BorderLayout.CENTER);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
         
         mainPanel = new JPanel(new BorderLayout());
         mainPanel.add(namePanel, BorderLayout.NORTH);
         mainPanel.add(outputPanel, BorderLayout.CENTER);
         mainPanel.add(buttonPanel, BorderLayout.SOUTH);

         setContentPane(mainPanel);
    }

    protected void setFrameFeature() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}