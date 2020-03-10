package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht62 extends Applet {
    int seconden;
    int uur;
    int dag;
    double jaar;

    public void init() {
        seconden = 60;
        uur = seconden*60;
        dag = uur*24;
        jaar = dag*365.242199;
    }

    public void paint(Graphics g) {
        g.drawString("er zitten " + uur + " seconden in een uur" , 20, 20);
        g.drawString("er zitten " + dag + " seconden in een dag" , 20, 40);
        g.drawString("er zitten " + jaar + " seconden in een uur" , 20, 60);



    }
}


