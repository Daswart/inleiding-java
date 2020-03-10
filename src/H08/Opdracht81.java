package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;






public class Opdracht81 extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    Button knop2;
    String s;



    public void init() {
        tekstvak = new TextField("", 30);

        knop = new Button("Ok");
        knop.addActionListener(new OKknopListener());
        add(knop);

        knop2 = new Button("reset");


        knop2.addActionListener(new resetKnopListener());

        label = new Label("Type iets naar keuze");

        s = "";

        add(label);
        add(tekstvak);

        add(knop2);
    }


    public void paint(Graphics g) {
    //g.drawString(s, 50, 90);


    }

        class OKknopListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    s = tekstvak.getText();
                    repaint();



                }


    }
    class resetKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");


            repaint();
        }

    }
}