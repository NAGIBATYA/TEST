import sun.print.PathGraphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

class MyPanel extends JPanel {

    private final int WIDTH = 1024;
    private final int HEIGHT = 576;
    private JPanel panel;

    protected MyPanel(){
        panel = new JPanel();
        panel.setBounds(450,5,WIDTH,HEIGHT);
        //ImageIO и BufferedImage
    }

    //@Override
    /*protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        label = new JLabel("HELLO, WORLD");
        label.setBounds(20,20,200,100);
        panel.add(label);

        try {
            URL url = new URL("https://farm1.static.flickr.com/940/29003156827_f17a1d593f_b.jpg");
            image = ImageIO.read(url);
            g.drawImage(image, 0,0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}