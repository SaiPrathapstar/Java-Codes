
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class drawWithColors extends JPanel implements MouseMotionListener,ActionListener
{
JButton RedButton,GreenButton,BlueButton,OrangeButton,PinkButton,BlackButton,YellowButton,ClearButton;
Graphics g;
drawWithColors()
{
RedButton = new JButton();
GreenButton = new JButton();
BlueButton = new JButton();
OrangeButton = new JButton();
PinkButton = new JButton();
BlackButton = new JButton();
YellowButton = new JButton();
ClearButton = new JButton("CLEAR");
ClearButton.setToolTipText("Erases every thing on the panel");
RedButton.setBackground(Color.RED);
RedButton.setFocusable(false);
RedButton.setToolTipText("Red");
GreenButton.setBackground(Color.GREEN);
GreenButton.setFocusable(false);
GreenButton.setToolTipText("Green");
BlueButton.setBackground(Color.BLUE);
BlueButton.setFocusable(false);
BlueButton.setToolTipText("Blue");
OrangeButton.setBackground(Color.ORANGE);
OrangeButton.setFocusable(false);
OrangeButton.setToolTipText("Orange");
PinkButton.setBackground(Color.PINK);
PinkButton.setFocusable(false);
PinkButton.setToolTipText("Pink");
BlackButton.setBackground(Color.BLACK);
BlackButton.setFocusable(false);
BlackButton.setToolTipText("Black");
YellowButton.setBackground(Color.YELLOW);
YellowButton.setFocusable(false);
YellowButton.setToolTipText("Yellow");

JPanel panel = new JPanel();
panel.setLayout(new GridLayout(8,1));
panel.add(RedButton);
panel.add(GreenButton);
panel.add(BlueButton);
panel.add(OrangeButton);
panel.add(PinkButton);
panel.add(BlackButton);
panel.add(YellowButton);
panel.add(ClearButton);
panel.setBounds(325,0,75,400);

JFrame frame = new JFrame();
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
frame.add(this);
frame.setVisible(true);
addMouseMotionListener(this);
RedButton.addActionListener(this);
GreenButton.addActionListener(this);
BlueButton.addActionListener(this);
OrangeButton.addActionListener(this);
BlackButton.addActionListener(this);
PinkButton.addActionListener(this);
YellowButton.addActionListener(this);
ClearButton.addActionListener(this);

g = getGraphics();
}
public void mouseMoved(MouseEvent e){}
public void mouseDragged(MouseEvent e)
{
g.fillOval(e.getX(),e.getY(),5,5);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == GreenButton)
g.setColor(Color.GREEN);
else if(e.getSource() == RedButton)
g.setColor(Color.RED);
else if(e.getSource() == BlueButton)
g.setColor(Color.BLUE);
else if(e.getSource() == OrangeButton)
g.setColor(Color.ORANGE);
else if(e.getSource() == PinkButton)
g.setColor(Color.PINK);
else if(e.getSource() == BlackButton)
g.setColor(Color.BLACK);
else if(e.getSource() == YellowButton)
g.setColor(Color.YELLOW);
else
repaint();
}
public static void main(String args[])
{
new drawWithColors();
}
}