
import java.awt.*;
import javax.swing.*;
class Panels extends JFrame
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(5,5));
        frame.setSize(300,300);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.ORANGE);
        panel5.setBackground(Color.CYAN);

        panel1.setPreferredSize(new Dimension(50,50));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(50,50));
        panel4.setPreferredSize(new Dimension(50,50));

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();

        panel5.setLayout(new BorderLayout());
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.WEST);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);
    }
}