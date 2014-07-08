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

  private static final String GERAET01 = "Geraet 1";
  private static final String GERAET02 = "Geraet 2";
  private static final String GERAET03 = "Geraet 3";
  private static final String GERAET04 = "Geraet 4";
  private static final String GERAET05 = "Geraet 5";
  private static final String GERAET06 = "Geraet 6";

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
    ProtGridButton buttonGeraet01 = new ProtGridButton(GERAET01);
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
    
    ProtGridButton buttonGeraet02 = new ProtGridButton(GERAET02);
    buttonGeraet02.addActionListener(new ActionButtonGeraet());
    buttonGrid.add(buttonGeraet02);

    ProtGridButton buttonGeraet03 = new ProtGridButton(GERAET03);
    buttonGeraet03.addActionListener(new ActionButtonGeraet());
    buttonGrid.add(buttonGeraet03);

    buttonGrid.add(new ProtGridButton(GERAET04));
    buttonGrid.add(new ProtGridButton(GERAET05));
    buttonGrid.add(new ProtGridButton(GERAET06));

    contentPane.add(textField, BorderLayout.NORTH);
    contentPane.add(buttonGrid, BorderLayout.CENTER);
    pack();
    setVisible(true);
  }

  public ProtButtonGridFrame getButtonGridFrame() {
    return this;
  }

  private class ActionButtonGeraet implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      String button = e.getActionCommand();
      ProtGridButton causeButton = (ProtGridButton) e.getSource();
      ProtButtonGridFrame causeFrame = (ProtButtonGridFrame) SwingUtilities.getRoot(causeButton);
      if (button.equals(GERAET01)) {
          System.out.println(GERAET01);
          //causeFrame.setVisible(false);
          ProtVideoFrame vidFrame = new ProtVideoFrame();
      } else if (button.equals(GERAET02))
         System.out.println(GERAET02);
      else if (button.equals(GERAET03))
        System.out.println(GERAET03);
      else
        System.out.println(button);

      // Hier kommt Logik fuer die Darstellung des naechsten Frames
    }
  }
}
