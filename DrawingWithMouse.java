import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DrawingWithMouse extends JFrame implements MouseMotionListener
{
DrawingWithMouse()
{
addMouseMotionListener(this);

setSize(500,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void mouseDragged(MouseEvent e)
{
Graphics g = getGraphics();
g.setColor(Color.RED);
g.fillOval(e.getX(),e.getY(),5,5);
g.dispose();
}
public void mouseMoved(MouseEvent e){}

public static void main(String args[])
{
new DrawingWithMouse();
}
}