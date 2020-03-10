package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    Button manKnop;
    Button vrouwKnop;
    Button manLeerlingKnop;
    Button vrouwLeerlingKnop;

    String man;
    String vrouw;
    String manLeerling;
    String vrouwLeerling;

    class manKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man = "12";
            repaint();


        }
    }
    class vrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw = "8";
            repaint();


        }
    }
    class manLeerlingKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            manLeerling = "50";
            repaint();


        }
    }
    class vrouwLeerlingKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwLeerling = "30";
            repaint();


        }
    }
    public void init() {
        manKnop = new Button("aantal mannen");
        vrouwKnop = new Button("aantaal vrouwen");
        manLeerlingKnop = new Button("aantal leerlingen (m)");
        vrouwLeerlingKnop = new Button("aantal leerlingen (v)");

        manKnop.addActionListener(new manKnopListener());
        add(manKnop);

        vrouwKnop.addActionListener(new vrouwKnopListener());
        add(vrouwKnop);

        manLeerlingKnop.addActionListener(new manLeerlingKnopListener());
        add(manLeerlingKnop);

        vrouwLeerlingKnop.addActionListener(new vrouwLeerlingKnopListener());
        add(vrouwLeerlingKnop);


        man = "";
        vrouw = "";
        manLeerling = "";
        vrouwLeerling = "";
    }

    public void paint(Graphics g){
        g.drawString(man, 50, 80);
        g.drawString(vrouw, 50, 100);
        g.drawString(manLeerling, 50, 120);
        g.drawString(vrouwLeerling, 50, 140);

    }
}
