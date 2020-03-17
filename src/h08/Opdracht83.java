package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    TextField tekstvak;
    Button prijsButton;
    Button refreshButton;
    String s;
    String stringBTW;
    String stringInclBTW;
    Double bedrag;
    Double BTW;
    Double inclBTW;

    public void init(){
        tekstvak = new TextField(10);
        add(tekstvak);
        tekstvak.addActionListener(new PrijsButtonListener());

        prijsButton = new Button("bereken prijs");
        prijsButton.addActionListener(new PrijsButtonListener());
        add(prijsButton);

        refreshButton = new Button("refresh");
        refreshButton.addActionListener(new RefreshButtonListener());
        add (refreshButton);

        stringBTW = "";
        stringInclBTW = "";










    }
    class PrijsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            bedrag = Double.parseDouble(s);
            BTW = bedrag/100 * 21;
            inclBTW = bedrag + BTW;

            stringBTW= Double.toString(BTW);
            stringInclBTW = Double.toString(inclBTW);

            ;
            repaint();
        }

    }
    class RefreshButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekstvak.setText("");

            stringBTW = "";
            stringInclBTW = "";

            repaint();

        }

    }
public void paint(Graphics g){
        g.drawString( "De BTW is " +  stringBTW, 50, 60);
        g.drawString("De prijs inlc BTW is " + stringInclBTW, 50, 80);

}
}
