package h02;

import java.applet.*;
import java.awt.*;

public class Opdracht22 extends Applet  {
    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Swart", 50, 70 );
    }

}
