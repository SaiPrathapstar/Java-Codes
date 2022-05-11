import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class KeyListenerExample implements KeyListener
{
JLabel label;
JFrame frame;
KeyListenerExample()
{
label = new JLabel(new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\WindowsIcon.png"));
frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.add(label);
frame.addKeyListener(this);
frame.setVisible(true);
}
public void keyPressed(KeyEvent e)
{
int x = label.getX();
int y = label.getY();
if(e.getKeyCode() == KeyEvent.VK_LEFT)
{
if(x<=0)
x=0;
else
label.setLocation(x-10,y);
}
else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
{
if(x>=frame.getWidth())
label.setLocation(x,y);
else
label.setLocation(x+10,y);
}
else if(e.getKeyCode() == KeyEvent.VK_UP)
{
if(y<= -(frame.getHeight() / 2 + 50))
y=0;
else
label.setLocation(x,y-10);
}
else if(e.getKeyCode() == KeyEvent.VK_DOWN)
{
if(y >= frame.getHeight() / 2 + 50)
y=0;
else
label.setLocation(x,y+10);
}
}
public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e){}
public static void main(String args[])
{
new KeyListenerExample();
}
}