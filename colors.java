import java.awt.*;
import javax.swing.*;
class colors
{
public static void main(String args[])
{
JFrame f = new JFrame("Colors Test");
JPanel p = new JPanel();

p.setBackground(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
f.add(p);
f.setSize(300,300);
f.setLocation(400,256);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}