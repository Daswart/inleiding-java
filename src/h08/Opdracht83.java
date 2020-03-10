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
    String stringPrijs;
    String stringBTW;
    double bedrag;
    double BTW;
    double inclBTW;

    public void init(){
        tekstvak = new TextField(10);
        add(tekstvak);

        prijsButton = new Button("bereken prijs");
        prijsButton.addActionListener(new PrijsButtonListener());
        add(prijsButton);

        refreshButton = new Button("refresh");
        refreshButton.addActionListener(new RefreshButtonListener());
        add (refreshButton);






    }
    class PrijsButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            bedrag = Double.parseDouble(s);
            BTW = bedrag/100 * 21;
            inclBTW = bedrag + BTW;
            stringPrijs = "de prijs incl 21% BTW = ";
            stringBTW = "de btw = ";
            repaint();
        }

    }
    class RefreshButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }

    }
public void paint(Graphics g){
        g.drawString( stringBTW + " " + BTW, 50, 60);
        g.drawString(stringPrijs + " " + inclBTW, 50, 80);

}
}
