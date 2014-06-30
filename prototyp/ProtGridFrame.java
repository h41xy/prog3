import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class ProtGridFrame extends JFrame {

  Container contentPane;
  JPanel textField;
  JTextField searchField;
  JPanel buttonGrid;

  private ProtGridFrame() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    contentPane = getContentPane();

    textField = new JPanel(new FlowLayout());
    searchField = new JTextField("Suchen");
    textField.add(searchField);

    buttonGrid = new JPanel(new ProtGridLayout());

    // Folgender Teil ist fuer Jeden Button zu erstellen ---
    ProtGridButton buttonGeraet01 = new ProtGridButton("Geraet 1");
    buttonGeraet01.addActionListener(new ActionButtonGeraet01());
    buttonGrid.add(buttonGeraet01);
    // bis hier --------------------------------------------
    // Es muessen (glaube ich) jeweils unterschiedliche ActionListener
    // fuer jeden Button implementiert werden. Vielleicht gehts aber auch
    // mit einer Abfrage welcher Button die Action ausgeloest hat.
    // UPDATE:
    // mit getSource() wird das object zurueck gegeben welches das actionEvent
    // uasgeloest hat. Muss zurueck gecastet werden
    // UPDATE02:
    // mit getActionCommand() erhaelt man die BUttonbezeichnung (bei textfeldern)
    // den inhalt) ausser er wurde mit setActionCommand() veraendert
    
    ProtGridButton buttonGeraet02 = new ProtGridButton("Geraet 2");
    buttonGeraet02.addActionListener(new ActionButtonGeraet01());
    buttonGrid.add(buttonGeraet02);
    buttonGrid.add(new ProtGridButton("Geraet 3"));
    buttonGrid.add(new ProtGridButton("Geraet 4"));
    buttonGrid.add(new ProtGridButton("Geraet 5"));
    buttonGrid.add(new ProtGridButton("Geraet 6"));

    contentPane.add(textField, BorderLayout.CENTER);
    contentPane.add(buttonGrid, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }

  class ActionButtonGeraet01 implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      String button = e.getActionCommand();
      if (button.equals("Geraet 1"))
          System.out.println("Geraet 1");
      else if (button.equals("Geraet 2"))
         System.out.println("Geraet 2");
      // Hier kommt Logik fuer die Darstellung des naechsten Frames
    }
  }
  public static void main(String[] args) {
    ProtGridFrame prot = new ProtGridFrame();
  }
}
