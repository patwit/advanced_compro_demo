import java.awt.*;
import javax.swing.*;

public class MyWindow3 extends MyWindow2{

    protected JTextArea ta;
    protected JPanel midPanel;
    protected JScrollPane jScrollPane;

    public MyWindow3(String string) {
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
        MyWindow3 myWindow = new MyWindow3("Pattarawit Window3");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    public void addComponents() {
        super.addComponents();
        ta = new JTextArea(5, 20);
        ta.setText("Pattarawit Polpinit\nKhon Kaen University");
        ta.append("\nFaculty of Engineering");
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        jScrollPane = new JScrollPane(ta);
        midPanel = new JPanel();
        midPanel.add(jScrollPane);

        mainPanel.add(midPanel, BorderLayout.CENTER);
    }
}
