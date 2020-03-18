package h02;

import java.applet.*;
import java.awt.*;

public class Opdracht22 extends Applet  {

    //Achtergrond kleur Applet is wit.
    public void init() {
        setBackground(Color.white);
    }

    //Roepnaam wordt in het blauw afgedrukt.
    //Achternaam wordt in het rood afgedrukt.
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Swart", 50, 70 );
    }

}
