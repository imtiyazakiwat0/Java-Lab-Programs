import java.awt.*;
import java.awt.event.*;

public class keymessage extends Frame implements KeyListener
{
 TextField t=new TextField();
 TextField t2=new TextField();

keymessage()
{
t.setBounds(20,100,150,30);
t2.setBounds(20,150,150,30);
add(t);
add(t2);

t.addKeyListener(this);
t2.addKeyListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);

 }

 public void keyTyped(KeyEvent ke)
 {
  if(ke.getKeyChar()=='M' || ke.getKeyChar()=='m')
  {
    t2.setText("Good Morning");
  }
  else if(ke.getKeyChar()=='A' || ke.getKeyChar()=='a')
  {
   t2.setText("Good AfterNoon");
  }
  else if(ke.getKeyChar()=='E' || ke.getKeyChar()=='e')
  {
   t2.setText("Good Evening");
  }
  else if(ke.getKeyChar()=='N' || ke.getKeyChar()=='n')
  {
   t2.setText("Good Night");
  }
 }
 public void keyReleased(KeyEvent ke)
 {
 }
public void keyPressed(KeyEvent ke)
 {
 }

public static void main(String args[])
{
keymessage k=new keymessage();
}

}
