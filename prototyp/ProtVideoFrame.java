import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Container;

public class ProtVideoFrame extends JFrame {
  Container contentPane;
  JPanel videoGrid;

  ProtVideoPlaceholder video1;
  ProtVideoPlaceholder video2;
  ProtVideoPlaceholder video3;
  ProtVideoPlaceholder video4;
  ProtVideoPlaceholder video5;

  public ProtVideoFrame () {

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    contentPane = getContentPane();

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

    contentPane.add(videoGrid);

    pack();
    setVisible(true);
  }
}
