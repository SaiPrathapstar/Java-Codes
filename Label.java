import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.Color;


class Label
{
    public static void main(String[] args) {
    ImageIcon icon = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\SearchIcon.png");
    Border border = BorderFactory.createLineBorder(Color.BLACK,3);

    JLabel label = new JLabel("My name is Sai Prathap", icon , JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setForeground(Color.WHITE);
    label.setBackground(Color.BLACK);
    label.setVerticalTextPosition(label.BOTTOM);
    label.setHorizontalTextPosition(label.CENTER);
    label.setBorder(border);
    label.setOpaque(true);
    label.setFont(new Font("Comic Sans",Font.ITALIC,12));
    label.setIconTextGap(0);
    label.setBounds(20,20,50,50);


    JFrame frame = new JFrame("Label Test");
    frame.setSize(250,250);
    frame.setLocation(420,200);
    frame.setVisible(true);
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}