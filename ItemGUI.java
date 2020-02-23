import java.awt.*;
import javax.swing.*;

/**
 * ItemGUI
 */
public class ItemGUI extends Window{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    
    protected JCheckBox cPlusPlus, php, javascript, java;
    protected JRadioButton studentRB, teacherRB;
    protected JPanel boxPanel, RBPanel, comboPanel, mainPanel;
    protected ButtonGroup buttonGroup;
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem openMenuItem, newMenuItem;

    protected String[] treasure = { "Gold", "Silver", "Diamonds", "Rubies", "Emeralds",
      "Sapphires", "Chocolate" };
    protected JComboBox combo;

    public ItemGUI(String string) {
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
        ItemGUI window = new ItemGUI("Item GUI");
        window.addComponents();
        window.addMenus();
        window.setFrameFeature();
    }

    protected void addMenus() {
        openMenuItem = new JMenuItem("Open");
        newMenuItem = new JMenuItem("New");
        fileMenu = new JMenu("File");
        fileMenu.add(openMenuItem);
        fileMenu.add(newMenuItem);
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    @Override
    protected void addComponents(){
        boxPanel = new JPanel(new FlowLayout());
		cPlusPlus = new JCheckBox("C++");
		php = new JCheckBox("PHP");
		java = new JCheckBox("Java");
		javascript = new JCheckBox("Javascript");
		boxPanel.add(cPlusPlus);
		boxPanel.add(php);
		boxPanel.add(java);
		boxPanel.add(javascript);
        

        studentRB = new JRadioButton("Student");
        teacherRB = new JRadioButton("Teacher");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(studentRB);
        buttonGroup.add(teacherRB);
        RBPanel = new JPanel();
        RBPanel.add(studentRB);
        RBPanel.add(teacherRB);

        combo = new JComboBox(treasure);
        comboPanel = new JPanel();
        comboPanel.add(combo);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(boxPanel, BorderLayout.NORTH);
        mainPanel.add(RBPanel, BorderLayout.CENTER);
        mainPanel.add(comboPanel, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }
}