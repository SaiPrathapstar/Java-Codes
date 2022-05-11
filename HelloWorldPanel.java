import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloWorldPanel extends JPanel
{
private String currentMessage = "Hello World!";
private MessageDisplay md;

private class MessageDisplay extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawString("Hello World!",20,20);
}
}
private class ButtonHandler implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(currentMessage.equals("Hello World!"))
{
currentMessage = "Goodbye World!";
}
else
currentMessage = "Hello World!";
md.repaint();
}
}
public void HelloworldPanel()
{
md = new MessageDisplay();

JButton change = new JButton("Change Message");
ButtonHandler l = new ButtonHandler();
change.addActionListener(l);

this.setLayout(new BorderLayout());
this.add(md,BorderLayout.CENTER);
this.add(change,BorderLayout.SOUTH);
}
} 