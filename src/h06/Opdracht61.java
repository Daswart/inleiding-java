package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht61 extends Applet {
    double opbrengst;
    double uitkomst;

    public void init() {
        opbrengst = 113;
        uitkomst = opbrengst / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst, 20, 20);
        g.drawString("Ali krijgt: " + uitkomst, 20, 40);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 60);
        g.drawString("Ik krijg: " + uitkomst, 20, 80);

    }
}


