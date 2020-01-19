import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI {
   public static void main(String[] args) {


      JFrame window = new JFrame("Test Window 1");

      JButton button1 = new JButton("1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("b3");
      JButton button4 = new JButton("Button 4");
      JButton button5 = new JButton("five");
      JButton button6 = new JButton("SIX");

      JPanel panel1 = new JPanel(new FlowLayout());

      // FlowLayout layout = new FlowLayout();

      // panel1.setLayout(layout);

      panel1.add(button1);
      panel1.add(button3);
      panel1.add(button2);
      panel1.add(button4);
      panel1.add(button5);
      panel1.add(button6);

      window.add(panel1);

      window.setSize(800,100);
      window.setLocation(500,300);
      window.setVisible(true);


   }
}
