package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht101 extends Applet {
    TextField tekstvak;
    Label label;
    String s, hogereScore, lageScore;
    int getal;



    public void init() {
        label = new Label();
        add(label);

        tekstvak = new TextField("", 3);
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());

        lageScore = "";
        hogereScore = "";
        s = "";





    }

    public void paint(Graphics g) {
        g.drawString(hogereScore , 50 , 60);
        g.drawString(lageScore, 50, 80);




    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

            if (Integer.parseInt(s) >= getal) {
                getal = Integer.parseInt(s);
                hogereScore = Integer.toString(getal);
                hogereScore = "De hoogste score is " + getal;
                lageScore = "";

            } else {
                hogereScore = "De hoogste score is " + getal;
                lageScore = "Voer een getal in die hoger is dan " + getal;

            }
            repaint();
        }
    }
}