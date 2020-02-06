package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht41 extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(0, 400, 400, 400);
        g.drawLine(400, 400, 200, 0);
        g.drawLine(0, 400, 200, 0);



    }
}

