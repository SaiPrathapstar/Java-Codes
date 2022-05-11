import java.awt.*;
import javax.swing.*;
class LineGui
{
    static Draws draw;
   static class Draws extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawLine(25, 50, 250,50);
        }
    }
    public static void main(String[] args) {

     draw = new Draws();
        

        JFrame frame = new JFrame();
        frame.setSize(300,250);
        frame.setLocation(300,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(draw);

    }
}