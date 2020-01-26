import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

/**
 * Window3
 */
public class Window3 extends Window2{

    protected JPanel notePanel, sportPanel, midPanel;
    protected JLabel noteLabel, sportLabel;
    protected JTextArea noteTA;
    protected JList list;

    public Window3(String string) {
        super(string);
        // TODO Auto-generated constructor stub
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
        Window3 myWindow = new Window3("My third window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    @Override
    public void addComponents(){
        super.addComponents();

        noteLabel = new JLabel("Note:");
        noteTA = new JTextArea(3, 20);
        noteTA.setText("fdsjkalf;dsja jkl;  fjdklsa;j fdls; jfkdsl;ajfkdsla;fjd ksal;jkl;f jdksla; nfdklsa; fjkdls fioewqjf kdlz; nufjdiosa jfidwpanfkdls; j");
        noteTA.setLineWrap(true);
        noteTA.setWrapStyleWord(true);

        JScrollPane sp = new JScrollPane(noteTA);

        notePanel = new JPanel(new BorderLayout());
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(sp, BorderLayout.SOUTH);

        sportLabel = new JLabel("Sport :");
        String[] sportList = {"Ping Pong", "Football", "Tennis"};
        list = new JList(sportList);
        sportPanel = new JPanel(new BorderLayout());
        sportPanel.add(sportLabel, BorderLayout.NORTH);
        sportPanel.add(list, BorderLayout.SOUTH);


        midPanel = new JPanel(new BorderLayout());
        midPanel.add(notePanel, BorderLayout.NORTH);
        midPanel.add(sportPanel, BorderLayout.SOUTH);

        mainPanel.add(midPanel, BorderLayout.CENTER);
    }
    
}