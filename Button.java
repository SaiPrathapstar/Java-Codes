import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Button extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;
    Button()
    {
        ImageIcon icon = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\WindowsIcon.png"); 
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\TypeSearchIcon.png");
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100,150,450,30);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,180,30);
        button.addActionListener(this);
        button.setText("Click me to see");
        button.setFocusable(false);
        button.setIcon(icon);

        button.setIconTextGap(-15);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.darkGray);
        button.setHorizontalTextPosition(JButton.RIGHT);
        
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            System.out.println("The button became Unusable and the label becomes visible");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
        public static void main(String[] args) {
            new Button();
        }
}