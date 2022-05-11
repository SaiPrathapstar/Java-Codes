import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class KeyListenerExample2 extends JFrame implements KeyListener
{
    static Color c = Color.BLACK;
    static Panel panel;
    class Panel extends JPanel{
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(c);
            g.fillRect(4, 4, 75, 75);
        }
    }
    KeyListenerExample2()
    {
        panel = new Panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.add(panel);
        this.setVisible(true);
    }
    public void keyTyped(KeyEvent e)
    {
    }
    public void keyPressed(KeyEvent e)
    {
        int x = panel.getX();
        int y = panel.getY();
        if(e.getKeyCode() == KeyEvent.VK_R )
        c = Color.RED;
        else if(e.getKeyCode() == KeyEvent.VK_G)
        c = Color.GREEN;
        else if(e.getKeyCode() == KeyEvent.VK_B)
        c = Color.BLUE;
        else if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            panel.setLocation(3,3);
            c = Color.BLACK;
        }
        else if ( e.getKeyCode() == KeyEvent.VK_UP)
        {
            y-=10;
            if(y<3)
            y=3;
        panel.setLocation(x,y);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            y+=10;
            if(y > getHeight() -118)
            y= getHeight() - 118;
        panel.setLocation(x,y);
    }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
             x += 10;
             if(x> getWidth()-95)
             x=getWidth() - 95;
        panel.setLocation(x,y);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            x-=10;
            if(x< 3)
            x = 3;
        panel.setLocation(x,y);
        }
        panel.repaint();
    }
    public void keyReleased(KeyEvent e)
    {
    }
    public static void main(String[] args) {
        new KeyListenerExample2();
    }
}