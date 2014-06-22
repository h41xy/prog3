import java.awt.*;

public class Window1Demo1 extends Frame1 {

  public Window1Demo1(String title,int width, int height, int x, int y, Color c) {
    super(title,width,height,x,y);
    setBackground(c);

    Window1 window1 = new Window1(this,10,10,100,100,Color.red,new Cursor(Cursor.MOVE_CURSOR));
    window1.setVisible(true);
    
    Window1 window2 = new Window1(this,120,120,130,130,Color.green, new Cursor(Cursor.HAND_CURSOR));
    window2.setVisible(true);
  }

  public static void main(String[] args) {
    Window1Demo1 demo = new Window1Demo1("Window1Demo1",50,50,100,100,Color.black);
    demo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    demo.setVisible(true);
  }
}
