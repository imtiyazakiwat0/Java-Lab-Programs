import java.awt.*;
import java.awt.event.*;

public class buttongrid
{
 Frame f;
 buttongrid ()
 {
  f=new Frame("Grid with Buttons");    // creates frame with title mentioned.
			// f=new JFrame(); <-- it creates frame without title
  Button b1=new Button("1");
  Button b2=new Button("2");
  Button b3=new Button("3");
  Button b4=new Button("4");
  Button b5=new Button("5");
  Button b6=new Button("6");
  Button b7=new Button("7");
  Button b8=new Button("8");
  Button b9=new Button("9");
  Button b10=new Button("10");
  Button b11=new Button("11");
  Button b12=new Button("12");
  Button b13=new Button("13");
  Button b14=new Button("14");
  Button b15=new Button("15");
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(b6);
  f.add(b7);
  f.add(b8);
  f.add(b9);
  f.add(b10);
  f.add(b11);
  f.add(b12);
  f.add(b13);
  f.add(b14);
  f.add(b15);
  f.setLayout(new GridLayout(4,4));
  f.setSize(400,300);          // void setSize(width, height)
  f.setVisible(true);
 }
 


public void windowClosing(WindowEvent we)
 {
  f.setVisible(false);
 }

 public static void main(String ar[])
 {
  new buttongrid ();
 }
}
