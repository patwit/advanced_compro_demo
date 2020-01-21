import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Window
 */
public class Window extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowG();
                }
            }
        );
    }

    public void createAndShowG(){
        Window msw = new Window();
        msw.addComponent();
        msw.setFrameFeature();
    }

    private void setFrameFeature() {   
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void addComponent() {
    }

}