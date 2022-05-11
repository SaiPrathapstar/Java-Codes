import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class fonts
{
static JButton serifButton,sansSerifButton,plainButton,italicButton,boldButton;
static Font fo;
static MessageDisplay dp;
public static class MessageDisplay extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setFont(fo);
g.drawString("Hello World!",20,30);
}
}
static class ButtonHandler implements  java.awt.event.ActionListener
{
public void actionPerformed(ActionEvent e)
{
    if(e.getSource() == serifButton)
    {
        if(fo.isBold())
        {
        fo = new Font("Serif",Font.BOLD,18);
        }
        else if(fo.isItalic())
        {
        fo = new Font("Serif",Font.ITALIC,18);
        }
        else
        {
        fo = new Font("Serif",Font.PLAIN,18);
        }
    }
    else if(e.getSource() == sansSerifButton)
    {
        if(fo.isBold())
        {
        fo = new Font("Serif",Font.BOLD,18);
        }
        else if(fo.isItalic())
        {
        fo = new Font("Serif",Font.ITALIC,18);
        }
        else
        {
        fo = new Font("Serif",Font.PLAIN,18);
        }
    }
    else if(e.getSource() == plainButton)
    {
        if(fo.getFontName() == "Serif")
        {
        fo = new Font("Serif",Font.ITALIC,18);
        }
        else
        {
        fo = new Font("SansSerif",Font.ITALIC,18);
        }
    }
    else if(e.getSource()==boldButton)
    {
        if(fo.getFontName() == "Serif")
        {
        fo = new Font("Serif",Font.ITALIC,18);
        }
        else
        {
        fo = new Font("SansSerif",Font.ITALIC,18);
        }
       
    }
    else 
    {
        if(fo.getFontName() == "Serif"){
        fo = new Font("Serif",Font.ITALIC,18);
        }
        else
        {
        fo = new Font("SansSerif",Font.ITALIC,18);
        }
    }
    dp.repaint();
}
}
public static void main(String args[])
{

JFrame frame = new JFrame("Fonts test");
frame.setSize(400,400);
frame.setLocation(300,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setLayout(null);

dp = new MessageDisplay();
    dp.setBounds(0,0, 200,50);

    serifButton = new JButton("Serif");
    sansSerifButton = new JButton("SansSerif");
    plainButton = new JButton("Plain");
    italicButton = new JButton("Italic");
    boldButton = new JButton("Bold");
    
    serifButton.setBounds(100,0,100,100);
    serifButton.setBounds(0,100,100,100);
    sansSerifButton.setBounds(0,200,100,100);
    plainButton.setBounds(0,300,100,100);
    italicButton.setBounds(0,400,100,100);
    boldButton.setBounds(0,500,100,100);

    ButtonHandler listener = new ButtonHandler();

    serifButton.addActionListener(listener);
    sansSerifButton.addActionListener(listener);
    plainButton.addActionListener(listener);
    italicButton.addActionListener(listener);
    boldButton.addActionListener(listener);



    frame.add(dp);
    frame.add(serifButton);
    frame.add(sansSerifButton);
    frame.add(plainButton);
    frame.add(italicButton);
    frame.add(boldButton);
}
}