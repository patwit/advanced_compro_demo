import javax.swing.SwingUtilities;

public class MyWindow9 extends MyWindow{
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
        
    }
}
