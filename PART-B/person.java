import java.awt.*;
import java.awt.event.*;

public class person extends Frame implements ActionListener
{
 Button b=new Button("Click");
 TextArea t=new TextArea(8,20);
 Panel p =new Panel();
 person()
 {
  p.add(t);
  p.add(b);
  add(p);
  setSize(300,500);
  setVisible(true);
  b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  t.setText("Name: BAHUBALI\n");
  t.append(" Age=39 \n Gender=MALE \n MOB=9632587147");
 }
 public static void main(String ar[])
 {
  new person();
 }
}

