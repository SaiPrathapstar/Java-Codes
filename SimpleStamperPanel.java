import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleStamperPanel extends JPanel implements MouseListener
{
public SimpleStamperPanel()
{
setBackground(Color.BLACK);
addMouseListener(this);
}
public void mousePressed(MouseEvent evt)
{
if(evt.isShiftDown())
{
repaint();
return;
}
int x = evt.getX();
int y = evt.getY();

Graphics g = getGraphics();

if((evt.isControlDown()))
{
g.setColor(Color.BLUE);
g.fillOval(x - 30,y - 15 , 60,30);
g.setColor(Color.BLACK);
g.drawOval(x-30,y-15,60,30);
}
else
{
g.setColor(Color.RED);
g.fillRect(x-30,y-15,60,30);
g.setColor(Color.BLACK);
g.drawRect(x-30,y-15,60,30);
}
g.dispose();
}
public void mouseEntered(MouseEvent evt){}
public void mouseExited(MouseEvent evt){}
public void mouseClicked(MouseEvent evt){}
public void mouseReleased(MouseEvent evt){}
}




/*                  **************************                    NOT WORKING             ***********************************
class SimpleStamperPanel extends JPanel implements MouseListener
{
public static String element;
public static int x,y;
public SimpleStamperPanel()
{
setBackground(Color.BLACK);
addMouseListener(this);
JFrame frame = new JFrame();
frame.setSize(400,400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(this);
frame.setVisible(true);
}
public void mousePressed(MouseEvent evt)
{
if(evt.isShiftDown())
{
element = "Repaint";
}
x = evt.getX();
y = evt.getY();
if(evt.isMetaDown())
{
element = "Oval";
}
else
{
element = "Rectangle";
}
}
public void mouseReleased(MouseEvent evt) {}
public void mouseClicked(MouseEvent evt) {}
public void mouseEntered(MouseEvent evt) {}
public void mouseExited(MouseEvent evt) {}

public void paintComponent(Graphics g)
{
if(element == "Repaint")
{
repaint();
}
if(element == "Oval")
{
g.setColor(Color.BLUE);
g.fillOval(x-30,y-15,60,30);
g.setColor(Color.BLACK);
g.drawOval(x-30,y-15,60,30);
}
if(element == "Rectangle")
{
g.setColor(Color.RED);
g.fillRect(x-30,y-15,60,30);
g.setColor(Color.BLACK);
g.drawRect(x-30,y-15,60,30);
}
}
public static void main(String args[])
{
new SimpleStamperPanel();
}
}
*/