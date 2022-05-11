import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ClickableRandomStrings
{
public static void main(String args[])
{
randomStrings panel = new randomStrings();

JFrame frame = new JFrame("Random Strings");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.setLocationRelativeTo(null);

frame.setContentPane(new randomStrings());
frame.setVisible(true);
panel.addMouseListener(new RepaintOnClick());
}
private static class RepaintOnClick implements MouseListener
{
public void mousePressed(MouseEvent evt)
{
Component com = (Component)evt.getSource();
com.repaint();
}
public void mouseReleased(MouseEvent evt) {}
public void mouseClicked(MouseEvent evt) {}
public void mouseEntered(MouseEvent evt) {}
public void mouseExited(MouseEvent evt) {}
}
}