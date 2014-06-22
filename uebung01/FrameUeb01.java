import java.awt.*;

public class FrameUeb01 extends Frame {
  
  FrameUeb01 (String title, int width, int height) {
    setTitle(title);
    setSize(width,height);
  }

  public void paint (Graphics g) {
    int width = getWidth();
    int height = getHeight();
    g.clearRect(0,0,width,height);
    g.drawLine(0,0,width,height);
  }
}
