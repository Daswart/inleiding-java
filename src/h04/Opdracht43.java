package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        g.setColor(Color.red);
        g.fillRect(800, 10, 300, 50);

        g.setColor(Color.white);
        g.fillRect(800, 60, 300, 50);

        g.setColor(Color.blue);
        g.fillRect(800, 110, 300, 50);

        g.setColor(Color.orange);
        g.fillRect(790, 10, 10, 1000);








    }
}