package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {

        setSize(600, 300);

    }

    //tekenen van meerdere figuren
    public void paint(Graphics g) {

        //een lijn
        g.setColor(Color.black);
        g.drawLine(20, 20, 180, 20);

        //een rechthoek
        g.drawRect(20, 40, 160, 80);

        //een rechthoek met ronde hoeken
        g.drawRoundRect(20, 140, 160, 80, 30, 30);

        //een gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(200, 40, 160, 80);
        g.setColor(Color.black);
        g.drawOval(200, 40, 160, 80);

        //een gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(200, 140, 160, 80);

        //een gevulde taartpunt met een ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(380, 40, 160, 80);
        g.setColor(Color.magenta);
        g.fillArc(380, 40, 160,80, 0, 45);

        //een cirkel
        g.setColor(Color.black);
        g.drawOval(420, 140, 80, 80);

    }
}
