import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MyWindow8 extends MyWindow7{

    ImageIcon newFileIcon, newFolderIcon, copyIcon;
    JMenuItem myNewMenu;

    public MyWindow8(String string) {
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
        MyWindow8 myWindow = new MyWindow8("Pattarawit Window8");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.setFrameFeature();
    }

    @Override
    protected void addMenus(){
        super.addMenus();
        newFileIcon = new ImageIcon(this.getClass().getResource("new.png"));
        newFolderIcon = new ImageIcon(this.getClass().getResource("newFolder.png"));
        copyIcon = new ImageIcon(this.getClass().getResource("copyIcon.png"));
        newFile.setIcon(newFileIcon);
        newFolder.setIcon(newFolderIcon);
        exitMenu.setIcon(newFileIcon);

        myNewMenu = new JMenuItem("My New Menu", copyIcon);
        editMenu.add(myNewMenu);
    }

    protected void addComponents(){
        super.addComponents();

        nameLabel.setForeground(Color.RED);
        nameTextField.setBackground(Color.BLUE);
        nameLabel.setFont(new Font("SanSarif", Font.BOLD, 20));
    }
}
