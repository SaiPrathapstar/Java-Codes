import java.awt.*;
import javax.swing.*;
class randomStrings extends JPanel
{
Font f1,f2,f3,f4,f5;
public randomStrings()
{
f1  = new Font("Serif",Font.PLAIN,24);
f2 = new Font("SansSerif",Font.BOLD,18);
f3 = new Font("Monospaced",Font.ITALIC,34);
f4 = new Font("Dialog",Font.BOLD + Font.ITALIC , 25);
f5 = new Font("Serif",Font.ITALIC,20);
setBackground(Color.BLACK);
}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
int width = getWidth();
int height = getHeight();
for(int i = 0 ; i < 25 ; i++)
{
switch((int)(4*Math.random() + 1))
{
case 1:
g.setFont(f1);
break;
case 2 :
g.setFont(f2);
break;
case 3:
g.setFont(f3);
break;
case 4:
g.setFont(f4);
break;
case 5:
g.setFont(f5);
break;
}
g.setColor(Color.getHSBColor((float)Math.random(),1.0F,1.0F));
int x = -50 + (int)(Math.random() * (width + 40));
int y = (int)(Math.random()*(height + 20));
g.drawString("Java!",x,y);
}
}
}