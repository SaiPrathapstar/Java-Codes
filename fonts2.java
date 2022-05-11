import java.awt.*;
import javax.swing.*;
class fonts2 extends JPanel
{
    public class Mess extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,18));
            g.drawString("Hello World!", 20, 30);
        }
    }
    Mess mess;
    fonts2()
    {
        mess= new Mess();  
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.add(mess);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
    public static void main(String[] args) {
        new fonts2();
    }
}