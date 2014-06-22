import java.awt.Color;

public class Frame1Demo2 {
  public static void main(String[] args) {
    Frame1 f1 = new Frame1("Frame1", 300,100);
    f1.setBackground(Color.blue);
    Frame1 f2 = new Frame1("Frame1", 300,100);
    f2.setBackground(Color.yellow);
    Frame1 f3 = new Frame1("Frame1", 300,100);
    f3.setBackground(Color.green);

    f1.setVisible(true);
    f2.setVisible(true);
    f3.setVisible(true);
  }
}
