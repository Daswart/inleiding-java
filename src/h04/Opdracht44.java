package h04;

import java.applet.Applet;
import java.awt.*;


public class Opdracht44 extends Applet{

    //afmeting Applet
    public void init() {
        setSize(1800, 950);

    }

    //tekenen van een staafdiagram,
    public void paint(Graphics g) {

        g.drawLine(200, 800, 1000, 800);
        g.drawLine(200, 800, 200, 20);

        //getallen langs de y-as
        g.drawString("0", 190, 800 );
        g.drawString("20", 180, 644 );
        g.drawString("40", 180, 488 );
        g.drawString("60", 180, 332 );
        g.drawString("80", 180, 176 );
        g.drawString("100", 180, 20 );
        g.drawString("kg", 190, 820);

        //de staven
        g.setColor(Color.red);
        g.fillRect(266, 488, 50, 312);
        g.drawString("Valerie", 266, 820);

        g.setColor(Color.blue);
        g.fillRect(532, 20, 50, 780);
        g.drawString("Jeroen", 532, 820);

        g.setColor(Color.green);
        g.fillRect(798, 176, 50, 624);
        g.drawString("Hans", 798, 820);

    }
}
