import java.awt.*;
import javax.swing.*;

public class MyWindow4 extends MyWindow3{

    protected JPanel checkBoxLabelPanel, checkBoxPanel, radioButtonMainPanel, radioButtonPanel;
    protected JLabel programmingLabel, genderLabel;
    protected JCheckBox maleCB, femalCB, unCB;
    protected ButtonGroup radiButtonGroup;
    protected JRadioButton javRadioButton, pythRadioButton, cppRadioButton;

    public MyWindow4(String string) {
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
        MyWindow4 myWindow = new MyWindow4("Pattarawit Window4");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    protected void addComponents() {
        super.addComponents();
        maleCB = new JCheckBox("Male", true);
        femalCB = new JCheckBox("Female");
        unCB = new JCheckBox("Unidentify");
        checkBoxPanel = new JPanel();
        checkBoxPanel.add(maleCB);
        checkBoxPanel.add(femalCB);
        checkBoxPanel.add(unCB);
        genderLabel = new JLabel("Gender : ");
        checkBoxLabelPanel = new JPanel(new BorderLayout());
        checkBoxLabelPanel.add(genderLabel, BorderLayout.NORTH);
        checkBoxLabelPanel.add(checkBoxPanel,BorderLayout.CENTER);
        
        radioButtonMainPanel = new JPanel(new BorderLayout());
        radioButtonPanel = new JPanel();
        programmingLabel = new JLabel("Programming : ");
        radiButtonGroup = new ButtonGroup();
        javRadioButton = new JRadioButton("Java", true);
        pythRadioButton = new JRadioButton("Python");
        cppRadioButton = new JRadioButton("C++");
        radiButtonGroup.add(javRadioButton);
        radiButtonGroup.add(pythRadioButton);
        radiButtonGroup.add(cppRadioButton);
        radioButtonPanel.add(javRadioButton);
        radioButtonPanel.add(pythRadioButton);
        radioButtonPanel.add(cppRadioButton);
        radioButtonMainPanel.add(programmingLabel, BorderLayout.NORTH);
        radioButtonMainPanel.add(radioButtonPanel);

        midPanel.setLayout(new BorderLayout());
        midPanel.add(radioButtonMainPanel, BorderLayout.NORTH);
        midPanel.add(checkBoxLabelPanel, BorderLayout.CENTER);
        midPanel.add(jScrollPane, BorderLayout.SOUTH);
    }
}
