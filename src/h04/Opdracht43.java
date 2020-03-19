package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet{

    //afmeting van de applet
    public void init() {
        setSize(1800, 950);
    }

    //teken de Nederandse vlag aan en vlaggenstok
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(800, 10, 300, 50);

        g.setColor(Color.white);
        g.fillRect(800, 60, 300, 50);

        g.setColor(Color.blue);
        g.fillRect(800, 110, 300, 50);

        //de vlaggenstok
        g.setColor(Color.orange);
        g.fillRect(790, 10, 10, 1000);

    }
}