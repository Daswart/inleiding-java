package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht52 extends Applet {
    int gewicht1;
    int gewicht2;
    int gewicht3;


    public void init() {
        gewicht1 =  70;
        gewicht2 =  80;
        gewicht3 =  75;
    }

     public int bepaal_h(int gewicht) {
         return (gewicht*780)/100;
    }

    public  int bepaal_y(int gewicht) {
        return 800 - bepaal_h(gewicht);

    }

    public void paint(Graphics g) {

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(200, 800, 1000, 800);
        g.drawLine(200, 800, 200, 20);

        g.drawString("0", 190, 800 );
        g.drawString("20", 180, 644 );
        g.drawString("40", 180, 488 );
        g.drawString("60", 180, 332 );
        g.drawString("80", 180, 176 );
        g.drawString("100", 180, 20 );
        g.drawString("kg", 190, 820);


        g.setColor(Color.red);
        g.fillRect(266, bepaal_y(gewicht1), 50, bepaal_h(gewicht1));
        g.drawString("Valerie", 266, 820);

        g.setColor(Color.blue);
        g.fillRect(532,  bepaal_y(gewicht2), 50, bepaal_h(gewicht2));
        g.drawString("Jeroen", 532, 820);

        g.setColor(Color.green);
        g.fillRect(798, bepaal_y(gewicht3), 50, bepaal_h(gewicht3));
        g.drawString("Hans", 798, 820);



    }
}

