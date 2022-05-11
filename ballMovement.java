import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ballMovement extends JPanel implements KeyListener
{
    JFrame frame;
    int x = 50;
    int y = 150;
    Color C;
    ballMovement()
    {
        C = Color.RED;
        frame = new JFrame("Ball Game");
        frame.setSize(400,400);
        frame.setLocation(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setContentPane(this);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(C);
        g.fillOval(x,y ,15, 15);
    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        x= x - 2;
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        x+=2;
        else if(e.getKeyCode() == KeyEvent.VK_UP)
        y+=2;
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        y-=2;
        else if( e.isMetaDown())
        {
            if(e.getKeyCode() == KeyEvent.VK_SPACE)
            {
                x=50;
                y=150;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_R)
            C = Color.red;
        else if(e.getKeyCode() == KeyEvent.VK_B)
        C = Color.BLUE;
        else if(e.getKeyCode() == KeyEvent.VK_G)
        C = Color.GREEN;
        repaint();
    }
    public void keyReleased(KeyEvent e){};
    public void keyTyped(KeyEvent e) {};
    public static void main(String[] args) {
        new ballMovement();
    }
}
