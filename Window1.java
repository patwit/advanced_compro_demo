import java.awt.*;
import javax.swing.*;

/**
 * Window1
 */
public class Window1 extends JFrame {

    protected JButton enterBut, cancelBut;
    protected JPanel mainPanel, buttonPanel;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Window1(String string) {
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
        Window1 myWindow = new Window1("My first window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    public void setFrameFeature() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        enterBut = new JButton("Enter");
        cancelBut = new JButton("Cancel");

        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(enterBut);
        buttonPanel.add(cancelBut);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        //this.add(mainPanel);
        setContentPane(mainPanel);
    }
}