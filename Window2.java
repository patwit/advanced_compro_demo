import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

/**
 * Window2
 */
public class Window2 extends Window1{

    protected JPanel namePanel;
    protected JLabel nameLabel;
    protected JTextField nameTF;
    protected JButton waitBut;

    public Window2(String string) {
        super(string);
    }

    /**
     *
     */
    private static final long serialVersionUID = -2174045542572972108L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Window2 myWindow = new Window2("My second window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    @Override
    public void addComponents(){
        super.addComponents();
        nameLabel = new JLabel("name : ");
        nameTF = new JTextField("Input name here", 15);
        nameTF.setEditable(false);

        namePanel = new JPanel(new GridLayout(0,2));

        namePanel.add(nameLabel);
        namePanel.add(nameTF);

        waitBut = new JButton("Wait");
        buttonPanel.add(waitBut);

        mainPanel.add(namePanel, BorderLayout.NORTH);
    }
}