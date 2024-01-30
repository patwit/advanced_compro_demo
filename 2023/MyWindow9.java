import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyWindow9 extends MyWindow{

    ReadImage imgPanel;
    JPanel buttonPanel;
    
    public MyWindow9(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected static void createAndShowGUI() {
        MyWindow9 myWindow = new MyWindow9("Picture Window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    @Override
    public void addComponents(){
        super.addComponents();
        imgPanel = new ReadImage();
        imgPanel.setPreferredSize(new Dimension(600, 800));
        mainPanel.setLayout(new BorderLayout());
        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);
        mainPanel.add(imgPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
}
