import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window {

    private final int WIDTH = 1024;
    private final int HEIGHT = 576;
    private JFrame frame;
    //private JPanel panel;
    //private JLabel label;

    public Window() {
        frame = new JFrame();
        //panel = new JPanel();
        frame.setTitle("test");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //frame.setBounds(450,5,WIDTH,HEIGHT);
        frame.getContentPane().add(new MyPanel());
        frame.pack();
        //frame.setLocation(450, 5);
    }

    public void run(){
        frame.setVisible(true);
    }

    //private void addWidgets(){
        //label = new JLabel("HELLO, WORLD");
        //label.setBounds(20,20,200,100);
        //panel.add(label);
   // }
}