package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRoundRect(400, 20, 400, 400, 20,20  );
        g.fillOval(430, 60, 60, 60);
        g.fillOval(700, 60, 60, 60);
        g.fillOval(430, 320, 60, 60);
        g.fillOval(700, 320, 60, 60);


    }
}
