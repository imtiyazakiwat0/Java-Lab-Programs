import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class addnum extends Frame implements ActionListener
{
 TextField t1=new TextField(10);
 TextField t2=new TextField(10);
 TextField t3=new TextField(10);
 Label l1=new Label("A");
 Label l2=new Label("B");
 Label l3=new Label("SUM");
 Button b1=new Button("ADD");
 Button b2=new Button("CLEAR");
 Panel p=new Panel();

addnum()
{
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(t3);
p.add(b1);
p.add(b2);
add(p);

b1.addActionListener(this);
b2.addActionListener(this);
setSize(300,400);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
 {
  int a,b,sum;
  if(e.getSource()==b1)
  {
   a=Integer.parseInt(t1.getText());
   b=Integer.parseInt(t2.getText());
   sum = a+b;
   t3.setText(Integer.toString(sum));
  }
  else if(e.getSource()==b2)
  {
   t1.setText(" ");
   t2.setText(" ");
   t3.setText(" ");
  }
 }

public static void main(String agrs[])
{
  addnum d=new addnum();
}

}

