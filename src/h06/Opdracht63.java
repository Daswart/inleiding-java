package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht63 extends Applet {
    int waarde1;
    int waarde2;
    int uitkomst;

    public void init() {
    waarde1 = 2000000000;
    waarde2 = 1000000000;
    uitkomst = waarde1 + waarde2;
    }

public void paint(Graphics g) {
    g.drawString("Als een variabele van het type int een waarde hoger dan",20, 20);
    g.drawString("2147483647 krijgt, zal dat vaak resulteren in een negatieve waarde en",20, 40 );
    g.drawString("niet in een positieve waarde:", 20, 60);
    g.drawString(uitkomst +" is een negatieve waarde. (2000000000+1000000000)", 20, 80);

    }
}

