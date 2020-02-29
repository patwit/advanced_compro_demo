import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * ItemHandler2
 */
public class ItemHandler2 extends ItemGUI implements ItemListener, 
                                                        ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ItemHandler2(String string) {
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
        ItemHandler2 window = new ItemHandler2("Item Handler");
        window.addComponents();
        window.addMenus();
        window.addKeys();
        window.addListeners();
        window.setFrameFeature();
    }

    protected  void addKeys() {
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        fileMenu.setMnemonic(KeyEvent.VK_F);

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

    }

    protected void addListeners() {
        cPlusPlus.addItemListener(this);
        php.addItemListener(this);
        javascript.addItemListener(this);
        java.addItemListener(this);

        studentRB.addItemListener(this);
        teacherRB.addItemListener(this);

        combo.addItemListener(this);

        openMenuItem.addActionListener(this);
        newMenuItem.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == openMenuItem)
        {
            JOptionPane.showMessageDialog(this, "Open");
        } else if (source == newMenuItem){
            JOptionPane.showMessageDialog(this, "New");
        }
       
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        //getActionCommand
        //getItemSelectable()
        if(source == cPlusPlus){
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this, "C++ is pressed");
        }else if(source == php){
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this,"PHP is selected");
        } else if(source == javascript){
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this,"Javascript is selected");
        } else if(source == java) {
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this,"Java is selected");
        } else if(source == studentRB){
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this,"Student");
        } else if(source == teacherRB){
            if(e.getStateChange() == ItemEvent.SELECTED)
                JOptionPane.showMessageDialog(this,"Teacher");
        } else if(source == combo){
            if(e.getStateChange() == ItemEvent.SELECTED){
                JOptionPane.showMessageDialog(this,"Change to  " + combo.getSelectedItem());
            }
        }
    }
    
}