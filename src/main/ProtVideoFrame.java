package src.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProtVideoFrame extends JFrame {
  private Container contentPane;
  private JLabel geraet;
  private JPanel homeRow;
  private JPanel videoGrid;

  private JButton homeButton;

  private ProtVideoPlaceholder video1;
  private ProtVideoPlaceholder video2;
  private ProtVideoPlaceholder video3;
  private ProtVideoPlaceholder video4;
  private ProtVideoPlaceholder video5;

  private Prototyp controller;

  private int frameID;

  public ProtVideoFrame (String newFrameLabel) {

    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    contentPane = getContentPane();
    
    geraet = new JLabel(newFrameLabel);
    homeRow = new JPanel(new FlowLayout());

    homeButton = new JButton("Home");
    homeButton.addActionListener(new ActionButtonHome());

    homeRow.add(geraet);
    homeRow.add(homeButton);

    videoGrid = new JPanel(new ProtVideoGridLayout());

    video1 = new ProtVideoPlaceholder("video1");
    video2 = new ProtVideoPlaceholder("video2");
    video3 = new ProtVideoPlaceholder("video3");
    video4 = new ProtVideoPlaceholder("video4");
    video5 = new ProtVideoPlaceholder("video5");

    videoGrid.add(video1);
    videoGrid.add(video2);
    videoGrid.add(video3);
    videoGrid.add(video4);
    videoGrid.add(video5);
    
    contentPane.add(homeRow, BorderLayout.NORTH);
    contentPane.add(videoGrid, BorderLayout.CENTER);

    pack();
    //setVisible(true);
  }

  public ProtVideoFrame(int newFrameID, String newFrameLabel, Prototyp controllingObject) {
    this(newFrameLabel);
    controller = controllingObject;
    frameID = newFrameID;
  }

  public int getFrameID() {
    return this.frameID;
  }
  public ProtVideoFrame getVideoFrame() {
    return this;
  }

  public Prototyp getController() {
    // if not null
    return controller;
  }

  private class ActionButtonHome implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      String button = e.getActionCommand();
      JButton causeButton = (JButton) e.getSource();
      ProtVideoFrame causeFrame = (ProtVideoFrame) SwingUtilities.getRoot(causeButton);
      Prototyp controller = causeFrame.getController();
      
      causeFrame.setVisible(false);
      controller.getButtonFrame().setVisible(true);

      // Hier kommt Logik fuer die Darstellung des naechsten Frames
    }
  }
}
