import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * ItemHandler2
 */
public class ItemHandler2 extends ItemGUI implements ItemListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ItemHandler2(String string) {
        super(string);
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
        ItemHandler2 window = new ItemHandler2("Item Handler");
        window.addComponents();
        window.addListeners();
        window.setFrameFeature();
    }

    protected void addListeners() {
        cPlusPlus.addItemListener(this);
        php.addItemListener(this);
        javascript.addItemListener(this);
        java.addItemListener(this);

        studentRB.addItemListener(this);
        teacherRB.addItemListener(this);

        combo.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
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