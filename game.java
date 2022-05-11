import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class game extends JPanel
{
    public static void main(String[] args)
    {
        game content = new game();

        JFrame frame = new JFrame("Game");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private Timer timer;
    private int width , height;
    private Boat boat;
    private Bomb bomb;
    private Submarine sub;
    
    public game()
    {
        setBackground(new Color(0,200,0));

        ActionListener action = new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(boat == null)
                {
                    boat.updateForNewFrame();
                    bomb.updateForNewFrame();
                    sub.updateForNewFrame();
                }
                repaint();
            }
        };
            timer = new Timer(30,action);

            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e)
                {
                    requestFocus();
                }
            });
            addFocusListener(new FocusListener()
            {
                public void focusGained(FocusEvent e)
                {
                    timer.start();
                    repaint();
                }
                public void focusLost(FocusEvent e)
                {
                    timer.stop();
                    repaint();
                }
            });
            addKeyListener(new KeyAdapter()
            {
                public void keyPressed(KeyEvent e)
                {
                    int code = e.getKeyCode();
                    if(code == KeyEvent.VK_LEFT)
                    boat.centerX-=15;
                    else if(code == KeyEvent.VK_RIGHT)
                    boat.centerX += 15;
                    else if(code == KeyEvent.VK_DOWN)
                    {
                        if(bomb.isFalling == false)
                        bomb.isFalling = true;
                    }
                }
            });
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(boat == null)
        {
            width = getWidth();
            height = getHeight();
            boat = new Boat();
            sub = new Submarine();
            bomb = new Bomb();
        }
        if(hasFocus())
        {
            g.setColor(Color.CYAN);
        }
        else{
            g.setColor(Color.BLACK);
            g.drawString("CLICK TO ACTIVATE" , 20 , 30);
            g.setColor(Color.GRAY);
        }
        g.drawRect(0,0,width-1,height-1);
        g.drawRect(1,1,width-3,height-3);
        g.drawRect(2,2,width-5,height-5);

        boat.draw(g);
        sub.draw(g);
        bomb.draw(g);

    }

    private class Boat
    {
        int centerX , centerY;
        Boat()
        {
            centerX = width/2;
            centerY = 80;
        }
        void updateForNewFrame()
        {
            if(centerX<0)
            centerX = 0;
            else if(centerX > width)
            centerX = width;
        }
        void draw(Graphics g)
        {
            g.setColor(Color.BLUE);
            g.fillRoundRect(centerX - 40, centerY - 20, 80,40,20,20);
        }
    }
    private class Bomb
    {
        int centerX , centerY;
        boolean isFalling;
        Bomb()
        {
            isFalling = false;
        }
        void updateForNewFrame()
        {
            if(isFalling)
            {
                if(centerY > height)
                isFalling = false;
                else if(Math.abs(centerX - sub.centerX) <= 36 && Math.abs(centerY - sub.centerY) <= 21)
                {
                    sub.isExploding = true;
                    sub.explosionFrameNumber = 1;
                    isFalling = false;
                }
                else
                {
                    centerY += 10;
                }
            }
        }
        void draw(Graphics g)
        {
            if(! isFalling){
                centerX = boat.centerX;
                centerY = boat.centerY + 23;
            }
            g.setColor(Color.RED);
            g.fillOval(centerX - 8, centerY - 8, 16,16);
        }
    }
    private class Submarine
    {
        int centerX , centerY;
        boolean ismovingLeft , isExploding;
        int explosionFrameNumber;
        Submarine()
        {
            centerX = (int)(width * Math.random());
            centerY = height - 40;
            isExploding = false;
            ismovingLeft = (Math.random() < 0.5);
        }
        void updateForNewFrame()
        {
            if(isExploding)
            {
                explosionFrameNumber++;
            if(explosionFrameNumber == 15)
            {
                centerX = (int)(width * Math.random());
                centerY = height - 40;
                isExploding = false;
                ismovingLeft = (Math.random() < 0.5);
            }
            }
            else
            {
                if(Math.random() < 0.4)
                {
                    ismovingLeft = !ismovingLeft;
                }
                if(ismovingLeft)
                {
                    centerX-=5;
                    if(centerX <=0)
                    centerX = 0;
                    ismovingLeft = false;
                }
                else
                {
                    centerX += 5;
                    if(centerX > width)
                    {
                       centerX = width;
                       ismovingLeft = true;
                    }
                }
            }
        }
        void draw(Graphics g)
        {
            g.setColor(Color.BLACK);
            g.fillOval(centerX - 30, centerY - 15, 60,30);
            if(isExploding)
            {
                g.setColor(Color.YELLOW);
                g.fillOval(centerX - 4 * explosionFrameNumber, centerY - 2 * explosionFrameNumber,8 * explosionFrameNumber, 4 * explosionFrameNumber);
                g.setColor(Color.RED);
                g.fillOval(centerX - 2 * explosionFrameNumber, centerY - explosionFrameNumber/2,4 * explosionFrameNumber,explosionFrameNumber);
            }
        }
    
    }
}