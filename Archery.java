import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Archery extends JFrame
{
    int width, height;
    Arrow arrow;
    Arch arch;
    Targ targ;
    public static void main(String[] args)
    {
        Archery content = new Archery();
        JFrame window = new JFrame("Archery Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,400);
        window.setLocation(100,100);
        window.setResizable(false);
        window.add(content);
        window.setVisible(true);
    }
    Archery()
    {
        ActionListener action = new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                arch.update();
                arrow.update();
                targ.update();
                repaint();
            }};
        addKeyAdapter(KeyEvent e)
        {
            int code = e.getKeyCode();
            if(code == KeyEvent.VK_UP)
            {
                arch.centerX -= 15;
                if(arch.centerX  <= 0)
                arch.centerX = 0;
            }
            else if(code == KeyEvent.VK_DOWN)
            {
                arch.centerX -= 15;
                if(arch.centerX >= width)
                arch.centerX = width;
            }
            else if(code == KeyEvent.VK_RIGHT)
            {
                arrow.isFalling = true;
            }
        }
    }
}