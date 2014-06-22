import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {

  private JMenuBar menubar;
  private JMenu file_menu;
  private JMenuItem file_new;

  private SimpleFrame() {

    getContentPane().setLayout(new BorderLayout());
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    file_menu = new JMenu("File");
    menubar.add(file_menu);

    file_new = new JMenuItem("New");
    file_menu.add(file_new);
    file_new.addActionListener(new NewAction());

    // getContentPane().add(..HauptPane...);

    pack();

    setVisible(true);
  }

  public static void main(String[] args) {
    SimpleFrame frame = new SimpleFrame();
  }
}
