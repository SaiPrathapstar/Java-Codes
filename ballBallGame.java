import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ballBallGame extends JPanel implements KeyListener
{
JFrame frame;
Color c;
int x,y;
ballBallGame()
{
x = 0;
y = 195;
c = Color.GREEN;

frame = new JFrame("Ball Ball");
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(this);
frame.addKeyListener(this);
frame.setVisible(true);


}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.fillOval(x,y,20,20);
g.setFont(new Font("ComicSans",Font.PLAIN,24));
g.drawString("Move the ball to the destination",30,20);
g.setColor(Color.RED);
g.fillOval(200,200,20,20);
if(x>= 196 && y >= 196)
{
    if(x<=205 && y<=205)
    {
        g.setFont(new Font("Serif",Font.BOLD,35));
        g.drawString("Game Over!", 50,50);
    }
}
}

public void keyPressed(KeyEvent e)
{

    switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
        x-=10;
        break;
        case KeyEvent.VK_RIGHT:
        x+=10;
        break;
        case KeyEvent.VK_UP:
        y-=10;
        break;
        case KeyEvent.VK_DOWN:
        y+=10;            
        break;
        default:
        break;
    }
    repaint();
}
@Override
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
    
}
@Override
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    
}
public static void main(String args[])
{
new ballBallGame();

}
}