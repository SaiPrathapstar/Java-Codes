import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class anonymousClassEg
{
public static void main(String args[])
{
JFrame frame = new JFrame("Random Strings");
randomStrings panel = new randomStrings();
panel.addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent e)
{
Component source = (Component)e.getSource();
source.repaint();
}
});
frame.setContentPane(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocation(100,75);
frame.setSize(300,240);
frame.setVisible(true);
}
}