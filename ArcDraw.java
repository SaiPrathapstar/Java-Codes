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
g.fillArc(50,50,105,75,0,90);
}
}