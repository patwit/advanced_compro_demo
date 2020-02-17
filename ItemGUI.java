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
    
    protected JPanel boxPanel, RBPanel, comboPanel, mainPanel;
    protected JCheckBox cPlusPlus, php, javascript, java;
    protected JRadioButton studentRB, teacherRB;
    protected ButtonGroup buttonGroup;
    String[] treasure = { "Gold", "Silver", "Diamonds", "Rubies", "Emeralds",
      "Sapphires", "Chocolate" };
    JComboBox combo;

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
        window.setFrameFeature();
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