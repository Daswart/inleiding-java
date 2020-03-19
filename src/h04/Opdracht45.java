package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht45 extends Applet {

    //afmeting Applet
    public void init() {

        setSize(1800, 950);

    }

    //tekenen van een gevulde gele ellips met fillArc() op een blauwe achtergrond.
    public void paint(Graphics g) {

        setBackground(Color.blue);
        g.setColor(Color.yellow);

        g.fillArc(400, 300, 800, 400, 90, 45);
        g.fillArc(400, 300, 800, 400, 135, 45);
        g.fillArc(400, 300, 800, 400, 180, 45);
        g.fillArc(400, 300, 800, 400, 225, 45);
        g.fillArc(400, 300, 800, 400, 270, 45);
        g.fillArc(400, 300, 800, 400, 315, 45);
        g.fillArc(400, 300, 800, 400, 360 , 45);
        g.fillArc(400, 300, 800, 400, 45, 45);

    }
}
