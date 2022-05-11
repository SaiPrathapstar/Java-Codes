import java.awt.*;
import javax.swing.*;
class OvalGui
{
static Draws draw;
static class Draws extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
g.drawOval(50,50,70,100);
}
}
public static void main(String args[])
{
draw = new Draws();

JFrame frame = new JFrame("Draw Oval");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
frame.setLocation(300,250);
frame.setVisible(true);
frame.add(draw);
}
}