import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * ItemHandler3
 */
public class ItemHandler3 extends ItemHandler2 implements KeyListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ItemHandler3(String string) {
        super(string);
        this.setFocusable(true);
        this.requestFocus();
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
        ItemHandler3 window = new ItemHandler3("Item Handler V3");
        window.addComponents();
        window.addMenus();
        window.addKeys();
        window.addListeners();
        window.setFrameFeature();
    }

    @Override
    protected void addListeners() {
        // TODO Auto-generated method stub
        super.addListeners();
        mainPanel.addKeyListener(this);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Yeh");
        int key = e.getKeyCode();
        switch(key){
            case KeyEvent.VK_W:
                JOptionPane.showMessageDialog(this, "Windows");
                break;
            case KeyEvent.VK_M:
                JOptionPane.showMessageDialog(this, "Mac");
                break;
            case KeyEvent.VK_L:
                JOptionPane.showMessageDialog(this, "Open");
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    
}