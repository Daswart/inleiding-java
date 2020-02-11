package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht42 extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRect(700,400,500,500);
        g.drawLine(950, 0, 700, 400);
        g.drawLine(950, 0, 1200, 400);
        g.drawRect(950, 780, 70, 120); //deur
        g.drawRect(750, 500, 100, 100);
        g.drawOval(955, 830, 20, 20);





    }
}