import java.awt.*;

public class Window1 extends java.awt.Window {

  private Frame myframe;

  public Window1 (Frame frame, int x, int y, int width, int height, Color color, Cursor cursor) {
    super(frame);
    setLocation(x,y);
    setSize(width, height);
    setBackground(color);
    setCursor(cursor);
  }
}
