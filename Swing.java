import javax.swing.*;

public class Swing {
  public static void main(String[] args) {
    
    JFrame frame = new JFrame("Swing Project");

    JLabel label = new JLabel("Hello World!");

    frame.add(label);

    frame.setSize(300, 100);

    frame.setVisible(true);
  }
}