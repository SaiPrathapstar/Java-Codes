import java.awt.*;
import javax.swing.*;
class SimpleStamperApp
{
SimpleStamperPanel p;
SimpleStamperApp()
{
p = new SimpleStamperPanel();
JFrame frame = new JFrame();
frame.setSize(400,400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(p);
frame.setVisible(true);
}
public static void main(String args[])
{
new SimpleStamperApp();
}
}