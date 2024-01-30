import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.*;

public class MyWindow7 extends MyWindow6{

    protected JMenuBar menuBar;
    protected JMenu fileMenu, editMenu, newMenu;
    protected JMenuItem  newFile, newFolder, exitMenu, copyMenu, cutMenu; 

    public MyWindow7(String string) {
        super(string);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MyWindow7 myWindow = new MyWindow7("Pattarawit Window7");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.setFrameFeature();
    }

    protected void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenu = new JMenu("New");
        newFile = new JMenuItem("New File");
        newFolder = new JMenuItem("New Folder");
        newMenu.add(newFile);
        newMenu.add(newFolder);
        fileMenu.add(newMenu);
        exitMenu = new JMenuItem("Exit");
        fileMenu.add(exitMenu);
        


        editMenu = new JMenu("Edit");
        copyMenu = new JMenuItem("Copy");
        cutMenu = new JMenuItem("Cut");
        editMenu.add(copyMenu);
        editMenu.add(cutMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);
    }
}
