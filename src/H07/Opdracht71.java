package H07;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opdracht71 extends Applet {
    //declaratie tekstvak
    TextField tekstvak;
    //declaratie van de knop
    Button knop;



    public void init() {
        tekstvak = new TextField("", 30);
        //De nieuwe knop aanmaken + tekst op de knop zetten (verkorte methode)
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        //de knop en tekstvak toevoegen aan de applet
        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst" + " in het tekstvakje" +
                " en klik op ok", 50, 60);


    }

    public class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer " + "maar nu iets anders");
            repaint();


        }

    }
}