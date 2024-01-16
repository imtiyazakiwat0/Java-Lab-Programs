import java.awt.*;
import java.awt.event.*;

public class buttonclick extends Frame implements ActionListener
{
 static Panel p=new Panel();
 Button b1 = new Button("Father");
 Button b2 = new Button("Mother");
 TextField t;
 buttonclick()
 {
  b1=new Button("Father");
  
  b2=new Button("Mother");
  
  t=new TextField(150);
  
  b1.addActionListener(this);
  b2.addActionListener(this);
  p.add(t);
  p.add(b1);
  p.add(b2);
  add(p);
  setSize(1100,500);
  setVisible(true);

 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
  {
   t.setText("Father Name is: ABC  Father age is: 50"+ "\n" +  "Father Designation is: BusinessMan");
  }
  else if(e.getSource()==b2)
  {
   t.setText("Mother Name is: XYZ Mother age is: 45  Mother Designation is: Bank Employee");
  }
 }

public static void main(String ar[])
 {
 buttonclick f = new buttonclick();
  
 }
}
