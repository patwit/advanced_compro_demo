import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

/**
 * Windows4
 */
public class Windows4 extends Window3{

    protected JMenuBar menu;
    protected JMenu fileMenu, editMenu, helpMenu, aboutMenu;
    protected JMenuItem newMI, openMI, saveMI, exitMI, copyMI, pasteMI, 
        companyMI, legaDocMI, welcomeMI;

    public Windows4(String string) {
        super(string);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Windows4 myWindow = new Windows4("My fourth window");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.setFrameFeature();
    }

    public void addMenus() {
        menu = new JMenuBar();

        fileMenu = new JMenu("File");
        // editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        newMI = new JMenuItem("New");
        exitMI = new JMenuItem("Exit");
        copyMI = new JMenuItem("Copy");
        pasteMI = new JMenuItem("P");
        aboutMenu = new JMenu("A");
        companyMI = new JMenuItem("C");

        fileMenu.add(newMI);
        fileMenu.add(exitMI);
        helpMenu.add(aboutMenu);
        aboutMenu.add(companyMI);
        
        menu.add(fileMenu);
        menu.add(helpMenu);

        setJMenuBar(menu);
    }

    @Override
    public void addComponents(){
        super.addComponents();
    }
    
}