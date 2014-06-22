import java.awt.*;

public class Component1 extends Frame1 {

  private Panel comp1, comp2, comp3, comp4, comp5;

  public Component1(String title) {
    super(title);
    setSize(550,200);
    setBackground(Color.lightGray);
    setLayout(null);

    comp1 = new Panel();
    comp1.setLocation(10,30);
    comp1.setSize(480,50);
    comp1.setBackground(Color.blue);
    add(comp1);

    comp2 = new Panel();
    comp2.setLocation(10,90);
    comp2.setSize(230,100);
    comp2.setBackground(Color.yellow);
    add(comp2);
    
    comp3 = new Panel();
    comp3.setLocation(260,90);
    comp3.setSize(230,100);
    comp3.setBackground(Color.green);
    comp3.setLayout(null);
    add(comp3);
    
    comp4 = new Panel();
    comp4.setLocation(10,10);
    comp4.setSize(150,80);
    comp4.setBackground(Color.red);
    comp4.setLayout(null);
    comp3.add(comp4);
    
    comp5 = new Panel();
    comp5.setLocation(20,30);
    comp5.setSize(80,30);
    comp5.setBackground(Color.cyan);
    comp4.add(comp5);

  }
}
