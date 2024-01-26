import java.awt.*;
import javax.swing.*;

public class MyWindow6 extends MyWindow5{

    protected JPanel buttonPanel2;
    protected JList countrieslist;

    public MyWindow6(String string) {
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
        MyWindow6 myWindow = new MyWindow6("Pattarawit Window6");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }


    public void addComponents() {
        super.addComponents();

        buttonPanel2 = new JPanel(new BorderLayout());
        String[] countries = {"Thailand", "Malay", "B", "N", "J", "U"};
        countrieslist = new JList<String>(countries);
        buttonPanel2.add(countrieslist, BorderLayout.NORTH);
        buttonPanel2.add(buttonPanel, BorderLayout.SOUTH);

        mainPanel.add(buttonPanel2, BorderLayout.SOUTH);


    }
}
