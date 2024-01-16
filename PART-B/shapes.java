import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class shapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.red);
        g.drawLine(10,10,40,40);
        g.drawRect(50,50,50,100);
        g.fillRect(120,120,100,100);
        g.drawOval(220,220,80,50);
        g.fillOval(300,300,50,50);
        g.drawArc(400,400,80,50,100,200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        shapes panel = new shapes();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}