package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht51 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 160;
        hoogte = 80;
    }

    public void paint(Graphics g) {
        //teken lijn
        g.setColor(lijnkleur);
        g.drawLine(20, 20, 180, 20);
        //teken rechthoek
        g.setColor(lijnkleur);
        g.drawRect(20, 40, breedte, hoogte);
        //teken rechthoek met ronde hoeken
        g.drawRoundRect(20, 140, breedte, hoogte, 30, 30);
        //teken gevulde driehoek
        g.setColor(opvulkleur);
        g.fillRect(200, 40, breedte, hoogte);
        //teken ovaal in rechthoek
        g.setColor(lijnkleur);
        g.drawOval(200, 40, breedte, hoogte);
        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(200, 140, breedte, hoogte);
        //ovaal met taartpunt
        g.setColor(lijnkleur);
        g.drawOval(380, 40, breedte, hoogte);
        //taartpunt
        g.setColor(opvulkleur);
        g.fillArc(380, 40, breedte, hoogte, 0, 45);
        //cirkel
        g.setColor(lijnkleur);
        g.drawOval(420, 140, hoogte, hoogte);


    }
}

