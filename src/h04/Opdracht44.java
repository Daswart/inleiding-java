package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 20, 400);
        g.drawLine(20, 400,400, 400);

        g.setColor(Color.red);
        g.fillRect(40, 230, 40, 170);

        g.setColor(Color.blue);
        g.fillRect(180, 20, 40, 380);

        g.setColor(Color.green);
        g.fillRect(320, 60, 40, 340);

        g.setColor(Color.black);
        g.drawString("Valerie", 40, 420);
        g.drawString("Jeroen", 180, 420);
        g.drawString("Hans", 320, 420);










    }
}
