import java.awt.*;
import javax.swing.*;
class roundRectGui
{
static Draws draw;
static class Draws extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.getHSBColor((float)Math.random(),0.5F,0.5F));
g.drawRoundRect(50,50,75,75,50,50);
}
}
public static void main(String args[])
{
draw = new Draws();


JFrame frame = new JFrame("Rounded Rectangle");
frame.setSize(400,350);
frame.setLocation(300,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(draw);
}
}