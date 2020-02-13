package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(20, 20, 180, 20);

        g.drawRect(20, 40, 160, 80);
        g.drawRoundRect(20, 140, 160, 80, 30, 30);

        g.setColor(Color.magenta);
        g.fillRect(200, 40, 160, 80);
        g.setColor(Color.black);
        g.drawOval(200, 40, 160, 80);
        g.setColor(Color.magenta);
        g.fillOval(200, 140, 160, 80);

        g.setColor(Color.black);
        g.drawOval(380, 40, 160, 80);
        g.setColor(Color.magenta);
        g.fillArc(380, 40, 160,80, 0, 45);

        g.setColor(Color.black);
        g.drawOval(420, 140, 80, 80);











    }
}
