import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Window
 */
public class Window extends JFrame{

    public Window(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Window msw = new Window("Window");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void setFrameFeature() {   
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    protected void addComponents() {
    }

}