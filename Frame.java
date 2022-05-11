import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class Frame {
    private static String currentTutor = "Sai Prathap";
    static MessageDisplay display;
    public static class MessageDisplay extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawString("Hello this is (your current tutor) :  " + currentTutor,50,70);
        }
    }
    public static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(currentTutor == "Sai Prathap" || currentTutor == "Venkat Sai")
currentTutor = "Srikesh";
else
currentTutor = "Venkat Sai";
display.repaint();

        }
    }
    public static void main(String[] args) {
        display = new MessageDisplay();
       JFrame frame = new JFrame("Its me!");
       JButton change = new JButton("Change Tutor");
       ButtonHandler listener = new ButtonHandler();
       change.addActionListener(listener);
       JPanel content = new JPanel();
       content.setBackground(new Color(0x123456));
       content.setLayout(new BorderLayout());
       content.add(display,BorderLayout.CENTER);
       content.add(change,BorderLayout.SOUTH);
       frame.setContentPane(content);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLocation(150,200);
       frame.setVisible(true);
    }
}
