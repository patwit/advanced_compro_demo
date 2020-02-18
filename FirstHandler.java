import java.awt.*;
import java.awt.event.*;
import java.net.http.HttpResponse.BodyHandlers;

import javax.swing.*;
import java.awt.GridLayout;

/**
 * FirstHandler
 */
public class FirstHandler extends MouseAdapter{

    public FirstHandler(String string) {
        super(string);
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        FirstHandler window = new FirstHandler("My Handler");
        window.addComponents();
        window.addMenus();
        window.addListerners();
        window.setFrameFeature();
    }

    protected void addListerners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("OK")){
            String text = nameTF.getText() + "\n";
            output.append(text);
            nameTF.setText("");
        } else if (e.getSource() == cancelButton){ 
            nameTF.setText("");
            output.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }
}