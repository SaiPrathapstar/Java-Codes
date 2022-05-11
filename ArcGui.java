import java.awt.*;
import javax.swing.*;
class ArcGui
{
static Draws draw;
static class Draws extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
g.drawArc(50,50,75,75,360,360);
}
}
public static void main(String args[])
{
draw = new Draws();

JFrame frame = new JFrame("ARC");
frame.setSize(400,300);
frame.setLocation(300,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(draw);
}
}
/*   ***********************************************************      Another Way      *****************************************************************
import javax.swing.*;
import java.awt.*;
class ArcDraw extends JFrame
{
public static void main(String args[])
{
new ArcDraw();
}
public ArcDraw()
{
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
g.drawArc(50,50,75,75,180,180);
}
}
      *************************************************************     END   **************************************************************************
*/