import java.awt.*;
import javax.swing.*;
class rect3D
{
static Draws draw;
static class Draws extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
g.draw3DRect(50,50,75,75,false);
}
}
public static void main(String args[])
{
draw = new Draws();

JFrame frame = new JFrame("3D rectangle");
frame.setSize(400,300);
frame.setLocation(300,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(draw);
}
}