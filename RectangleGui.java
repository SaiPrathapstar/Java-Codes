import java.awt.*;
import javax.swing.*;
class RectangleGui
{
static Draws draw;
static class Draws extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
g.drawRect(25,25,50,50);
}
}
public static void main(String args[])
{
draw = new Draws();

JFrame frame = new JFrame("Draw Rectangle");
frame.setVisible(true);
frame.setSize(300,300);
frame.setLocation(300,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(draw);
}
}