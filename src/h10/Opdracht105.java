package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {

    Label label;
    TextField tekstkvak;
    double voldoende;
    String s;
    String tekst;
    double cijfer1, cijfer2, cijfer3, gemiddelde;


    public void init() {

        label = new Label("vul hier je cijfer in om te zien of je een voldoende hebt behaald");
        add (label);

        tekstkvak = new TextField(2);
        tekstkvak.addActionListener(new CijferListener());
        add(tekstkvak);

        voldoende = 5.5;
        tekst = "";
        s = "";

        cijfer1 = 4.3;
        cijfer2 = 7.6;
        cijfer3 = 6.8;

        gemiddelde = (cijfer1  + cijfer2 + cijfer3) / 3;
        gemiddelde = gemiddelde * 10;
        gemiddelde = (int)gemiddelde;
        gemiddelde = gemiddelde /10;
        System.out.println(gemiddelde);

    }

    class CijferListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            s = tekstkvak.getText();


            if(Double.parseDouble(s) > 10 ){


                tekst = "Vul het cijfer 10 of lager in";
                System.out.println(tekst);

            }

            else if (Double.parseDouble(s) >= voldoende) {

                tekst = "Gefeliciteerd! je hebt een voldoende.";
                System.out.println(tekst);

            }


            else {
                tekst = "Helaas! Je hebt een onvoldoende.";
                System.out.println(tekst);

            }
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }
    /*public static void main(String[] args) {

        double voldoende = 5.5;
        double cijfer = 9.8;

        if (cijfer >= voldoende){
            System.out.println("je hebt een " + cijfer + " behaald");
            System.out.println("Gefeliciteerd! Je hebt een voldoende!");
        }
        else{
            System.out.println("je hebt een " + cijfer + " behaald");
            System.out.println("Jammer! je hebt een onvoldoende.");
        }


    }*/
}



