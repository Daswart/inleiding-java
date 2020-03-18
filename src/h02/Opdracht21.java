package h02;


import java.applet.*;
import java.awt.*;

public class Opdracht21 extends Applet {

    // De achtergrond van de Applet is blauw.
    public void init() {
        setBackground(Color.blue);
    }

    //Naam wordt afgedrukt in geel.
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Daan Swart", 50, 60 );
    }
}
