import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Container;

public class ProtGridFrame extends JFrame {

  JPanel contentPane;

  private ProtGridFrame() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    contentPane = new JPanel(new ProtGridLayout());

    contentPane.add(new ProtGridButton("Geraet 1"));
    contentPane.add(new ProtGridButton("Geraet 2"));
    contentPane.add(new ProtGridButton("Geraet 3"));
    contentPane.add(new ProtGridButton("Geraet 4"));
    contentPane.add(new ProtGridButton("Geraet 5"));
    contentPane.add(new ProtGridButton("Geraet 6"));

    setContentPane(contentPane);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    ProtGridFrame prot = new ProtGridFrame();
  }
}
