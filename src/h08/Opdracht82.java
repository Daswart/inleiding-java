package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht82 extends Applet {
    Button man;
    Button vrouw;
    Button meisje;
    Button jongen;

    int manGetal;
    String manAantal;

    int vrouwGetal;
    String vrouwAantal;

    int meisjesGetal;
    String meisjesAantal;

    int jongensGetal;
    String jongensAantal;

    int totaal;
    String stringTotaal;


    @Override
    public void init() {
        man = new Button("Mannen");
        add(man);
        man.addActionListener(new ManListener());


        vrouw = new Button("Vrouwen");
        add(vrouw);
        vrouw.addActionListener(new Vrouwlistener());

        meisje = new Button("Meisjes");
        add(meisje);
        meisje.addActionListener(new Meisjeslistener());

        jongen = new Button("Jongens");
        add(jongen);
        jongen.addActionListener(new Jongenslistener());

        totaal = 0;
        stringTotaal = "";

        manAantal = "0";
        vrouwAantal = "0";
        meisjesAantal = "0";
        jongensAantal = "0";


    }

    class ManListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            manGetal++;
            manAantal = Integer.toString(manGetal);

            repaint();

            System.out.println(manAantal);
        }
    }

    class Vrouwlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            vrouwGetal++;
            vrouwAantal = Integer.toString(vrouwGetal);
            repaint();

            System.out.println(vrouwAantal);

        }
    }

    class Meisjeslistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            meisjesGetal++;
            meisjesAantal = Integer.toString(meisjesGetal);
            repaint();


            System.out.println(meisjesAantal);

        }
    }

    class Jongenslistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            jongensGetal++;
            jongensAantal = Integer.toString(jongensGetal);
            repaint();

            System.out.println(jongensAantal);
        }
    }

    @Override
    public void paint(Graphics g) {

        g.drawString("er zijn " + manAantal + " mannen binnen", 20, 60);
        g.drawString("er zijn " + vrouwAantal + " vrouwen binnen", 20, 80);
        g.drawString("er zijn " + meisjesAantal + " meisjes binnen", 20, 100);
        g.drawString("er zijn " + jongensAantal + " jongens binnen", 20, 120);

        totaal = manGetal + vrouwGetal + meisjesGetal + jongensGetal;
        stringTotaal = Integer.toString(totaal);
        g.drawString("Totaal aantal bezoekers = " + stringTotaal,20, 140);
        g.drawString("Totaal aantal bezoekers in tijden van Corona = 0", 20, 160);

        System.out.println(stringTotaal);
    }
}
//DIT WAS DE CODE VOORDAT IK DE ZOOM-FILMPJES HEB GEKEKEN.
/*package h08;

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
}*/
