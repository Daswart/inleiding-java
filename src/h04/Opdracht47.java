package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {

    //afmeting van de Applet
    public void init() {

        setSize(1800, 950);

    }

    //teken een dobbelsteen met de zijde waarop de vier staat.
    public void paint(Graphics g) {

        g.drawRoundRect(400, 20, 400, 400, 20,20  );

        g.fillOval(430, 60, 60, 60);
        g.fillOval(700, 60, 60, 60);
        g.fillOval(430, 320, 60, 60);
        g.fillOval(700, 320, 60, 60);

    }
}
