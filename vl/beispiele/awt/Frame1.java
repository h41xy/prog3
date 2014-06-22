import java.awt.*;


public class Frame1 extends Frame {
  public Frame1(String title) {
    setTitle(title);
  }
  public Frame1(String title, int width, int height) {
    this(title);
    setSize(width,height);
  }
  public Frame1(String title, int width, int height, int x, int y) {
    this(title);
    setSize(width, height);
    setLocation(x,y);
  }
}
