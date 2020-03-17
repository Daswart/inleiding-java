package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {
    //declareren
    TextField tekstvak;
    Label label;
    Button knop;
    Button knop2;
    String tekst;

    public void init() {
        label = new Label("Type iets naar keuze");
        add(label);

        tekstvak = new TextField("", 30);
        add(tekstvak);

        knop = new Button("Ok");
        knop.addActionListener(new OKknopListener());
        add(knop);


        knop2 = new Button("reset");
        knop2.addActionListener(new resetKnopListener());
        add(knop2);

        tekst = "";
    }

    class OKknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();

            repaint();

            System.out.println(tekst);
                }
    }

    class resetKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");

            repaint();


        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 90);
    }
}
