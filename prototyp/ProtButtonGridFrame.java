import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

public class ProtButtonGridFrame extends JFrame {

  Container contentPane;
  JPanel textField;
  JTextField searchField;
  JPanel buttonGrid;

  protected ProtButtonGridFrame() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    contentPane = getContentPane();

    textField = new JPanel(new FlowLayout());
    searchField = new JTextField("Suchen...", 30);
    searchField.addActionListener(new ActionButtonGeraet());
    textField.add(searchField);

    buttonGrid = new JPanel(new ProtGridLayout());

    // Folgender Teil ist fuer Jeden Button zu erstellen ---
    ProtGridButton buttonGeraet01 = new ProtGridButton("Geraet 1");
    buttonGeraet01.addActionListener(new ActionButtonGeraet());
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
    buttonGeraet02.addActionListener(new ActionButtonGeraet());
    buttonGrid.add(buttonGeraet02);

    ProtGridButton buttonGeraet03 = new ProtGridButton("Geraet 3");
    buttonGeraet03.addActionListener(new ActionButtonGeraet());
    buttonGrid.add(buttonGeraet03);

    buttonGrid.add(new ProtGridButton("Geraet 4"));
    buttonGrid.add(new ProtGridButton("Geraet 5"));
    buttonGrid.add(new ProtGridButton("Geraet 6"));

    contentPane.add(textField, BorderLayout.NORTH);
    contentPane.add(buttonGrid, BorderLayout.CENTER);
    pack();
    setVisible(true);
  }

  private class ActionButtonGeraet implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      String button = e.getActionCommand();
      ProtGridButton causeButton = (ProtGridButton) e.getSource();
      ProtButtonGridFrame causeFrame = (ProtButtonGridFrame) SwingUtilities.getRoot(causeButton);
      if (button.equals("Geraet 1")) {
          System.out.println("Geraet 1");
          causeFrame.setVisible(false);
      } else if (button.equals("Geraet 2"))
         System.out.println("Geraet 2");
      else if (button.equals("Geraet 3"))
        System.out.println("Geraet 3");
      else
        System.out.println(button);

      // Hier kommt Logik fuer die Darstellung des naechsten Frames
    }
  }
}
