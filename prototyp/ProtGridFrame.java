import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProtGridFrame extends JFrame {

  Container contentPane;
  JTextField searchField;
  JPanel buttonGrid;

  private ProtGridFrame() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    contentPane = getContentPane();

    searchField = new JTextField("Suchen");
    contentPane.add(searchField);

    buttonGrid = new JPanel(new ProtGridLayout());

    // Folgender Teil ist fuer Jeden Button zu erstellen ---
    ProtGridButton buttonGeraet01 = new ProtGridButton("Geraet 1");
    buttonGeraet01.addActionListener(new ActionButtonGeraet01());
    buttonGrid.add(buttonGeraet01);
    // bis hier --------------------------------------------
    // Es muessen (glaube ich) jeweils unterschiedliche ActionListener
    // fuer jeden Button implementiert werden. Vielleicht gehts aber auch
    // mit einer Abfrage welcher Button die Action ausgeloest hat.
    
    buttonGrid.add(new ProtGridButton("Geraet 2"));
    buttonGrid.add(new ProtGridButton("Geraet 3"));
    buttonGrid.add(new ProtGridButton("Geraet 4"));
    buttonGrid.add(new ProtGridButton("Geraet 5"));
    buttonGrid.add(new ProtGridButton("Geraet 6"));

    contentPane.add(buttonGrid);
    pack();
    setVisible(true);
  }

  class ActionButtonGeraet01 implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      System.out.println("Geraet01Frame");
      // Hier kommt Logik fuer die Darstellung des naechsten Frames
    }
  }
  public static void main(String[] args) {
    ProtGridFrame prot = new ProtGridFrame();
  }
}
