import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class randomPanelTimer extends JPanel implements ActionListener
{
static Timer timer;
static int i = 0;
public String mes = "H";
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawString(mes,20,30);
}
public void actionPerformed(ActionEvent e)
{
i++;
if(mes.equals("H"))
{
mes = "He";
}
else if(mes.equals("He"))
mes = "Hel";
else if(mes.equals("Hel"))
mes = "Hell";
else if(mes.equals("Hell"))
mes = "Hello";
else if(mes.equals("Hello"))
mes = "Hello!";
else
mes = mes + " *";
repaint();
if(i==5)
timer.stop();
}
randomPanelTimer()
{
timer = new Timer(500,this);
JFrame frame = new JFrame();
frame.setSize(400,400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(this);
frame.setVisible(true);

timer.start();
}
public static void main(String args[])
{
new randomPanelTimer();
}
}