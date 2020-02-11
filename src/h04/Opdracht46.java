package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht46 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRoundRect(400, 20, 200, 400, 20,20  );

        g.setColor(Color.red);
        g.fillOval(465, 40, 70, 70);

        g.setColor(Color.orange);
        g.fillOval(465, 170, 70, 70);

        g.setColor(Color.green);
        g.fillOval(465, 300, 70, 70);

        g.setColor(Color.white);
        g.fillRect(495, 420, 10, 400 );

    }
}
