import java.io.File;
import java.io.IOException;
import java.net.http.WebSocket.Listener;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MusicPlayer extends JFrame
{
    ImageIcon playIcon;
    ImageIcon playIcon2;
    AudioInputStream audioStream;
    File file;
    Clip clip;
    Audio audio;
    JButton play,reset,quit;
    class Audio
    {
        Audio() throws UnsupportedAudioFileException , IOException ,LineUnavailableException
        {
        file = new File("C:\\Users\\Sai Prathap\\Downloads\\friends-song-by-anne-marie.wav");
        audioStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
    }
    }
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == play)
            {
                if(play.getText() == "Play")
                {
                    play.setIcon(playIcon2);
                    clip.start();
                    play.setText("Pause");
                }
                else
                {
                    play.setIcon(playIcon);
                    clip.stop();
                    play.setText("Play");
                }
            }
            else if(e.getSource()== reset)
            clip.setMicrosecondPosition(0);
            else
            {
            clip.close();
            System.exit(0);
            }
        }
    }
    MusicPlayer() throws UnsupportedAudioFileException ,IOException ,LineUnavailableException
    {
        playIcon = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\PlayIcon.png");
        ImageIcon resetIcon = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\ResetIcon.png");
        ImageIcon exitIcon = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\ExitIcon.png");
        playIcon2 = new ImageIcon("C:\\Users\\Sai Prathap\\Pictures\\Screenshots\\PauseIcon.png");
        play = new JButton("Play");
        reset = new JButton("Reset");
        quit = new JButton("Quit");
        play.setFocusable(false);
        reset.setFocusable(false);
        quit.setFocusable(false);

        play.setIcon(playIcon);
        reset.setIcon(resetIcon);
        quit.setIcon(exitIcon);

        play.setHorizontalTextPosition(JButton.CENTER);
        play.setVerticalTextPosition(JButton.BOTTOM);
        reset.setHorizontalTextPosition(JButton.CENTER);
        reset.setVerticalTextPosition(JButton.BOTTOM);
        quit.setHorizontalTextPosition(JButton.CENTER);
        quit.setVerticalTextPosition(JButton.BOTTOM);


        JFrame frame = new JFrame("Music Player");
        frame.setLayout(new GridLayout(1,3));
        frame.add(reset);
        frame.add(play);
        frame.add(quit);
        frame.setLocation(150,150);
        frame.setSize(270,180);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonHandler l = new ButtonHandler();
        play.addActionListener(l);
        reset.addActionListener(l);
        quit.addActionListener(l);

        Audio a = new Audio();

    }
    public static void main(String[] args) throws UnsupportedAudioFileException , IOException , LineUnavailableException {
        new MusicPlayer();
    }
}